package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.b1;
import com.google.android.exoplayer2.v0;
import com.google.android.exoplayer2.w0;
import com.google.android.exoplayer2.x0;
import defpackage.f00;
import java.util.Arrays;

/* renamed from: f40  reason: default package */
public abstract class f40 extends k40 {

    /* renamed from: f40$a */
    public static final class a {
        private final int a;
        private final int[] b;
        private final p00[] c;
        private final int[] d;
        private final int[][][] e;

        a(int[] iArr, p00[] p00Arr, int[] iArr2, int[][][] iArr3, p00 p00) {
            this.b = iArr;
            this.c = p00Arr;
            this.e = iArr3;
            this.d = iArr2;
            this.a = iArr.length;
        }

        public int a(int i, int i2, boolean z) {
            int i3 = this.c[i].a(i2).e;
            int[] iArr = new int[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                int f = f(i, i2, i5);
                if (f == 4 || (z && f == 3)) {
                    iArr[i4] = i5;
                    i4++;
                }
            }
            return b(i, i2, Arrays.copyOf(iArr, i4));
        }

        public int b(int i, int i2, int[] iArr) {
            int i3 = 0;
            String str = null;
            boolean z = false;
            int i4 = 0;
            int i5 = 16;
            while (i3 < iArr.length) {
                String str2 = this.c[i].a(i2).a(iArr[i3]).m;
                int i6 = i4 + 1;
                if (i4 == 0) {
                    str = str2;
                } else {
                    z |= !v50.b(str, str2);
                }
                i5 = Math.min(i5, v0.c(this.e[i][i2][i3]));
                i3++;
                i4 = i6;
            }
            return z ? Math.min(i5, this.d[i]) : i5;
        }

        public int c() {
            return this.a;
        }

        public int d(int i) {
            return this.b[i];
        }

        public p00 e(int i) {
            return this.c[i];
        }

        public int f(int i, int i2, int i3) {
            return v0.d(this.e[i][i2][i3]);
        }
    }

    private static int e(w0[] w0VarArr, o00 o00, int[] iArr, boolean z) {
        int length = w0VarArr.length;
        int i = 0;
        boolean z2 = true;
        for (int i2 = 0; i2 < w0VarArr.length; i2++) {
            w0 w0Var = w0VarArr[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < o00.e; i4++) {
                i3 = Math.max(i3, v0.d(w0Var.b(o00.a(i4))));
            }
            boolean z3 = iArr[i2] == 0;
            if (i3 > i || (i3 == i && z && !z2 && z3)) {
                length = i2;
                z2 = z3;
                i = i3;
            }
        }
        return length;
    }

    private static int[] f(w0 w0Var, o00 o00) {
        int[] iArr = new int[o00.e];
        for (int i = 0; i < o00.e; i++) {
            iArr[i] = w0Var.b(o00.a(i));
        }
        return iArr;
    }

    private static int[] g(w0[] w0VarArr) {
        int length = w0VarArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = w0VarArr[i].p();
        }
        return iArr;
    }

    public final void c(Object obj) {
        a aVar = (a) obj;
    }

    public final l40 d(w0[] w0VarArr, p00 p00, f00.a aVar, b1 b1Var) {
        int[] iArr = new int[(w0VarArr.length + 1)];
        int length = w0VarArr.length + 1;
        o00[][] o00Arr = new o00[length][];
        int[][][] iArr2 = new int[(w0VarArr.length + 1)][][];
        for (int i = 0; i < length; i++) {
            int i2 = p00.e;
            o00Arr[i] = new o00[i2];
            iArr2[i] = new int[i2][];
        }
        int[] g = g(w0VarArr);
        for (int i3 = 0; i3 < p00.e; i3++) {
            o00 a2 = p00.a(i3);
            int e = e(w0VarArr, a2, iArr, e50.h(a2.a(0).m) == 4);
            int[] f = e == w0VarArr.length ? new int[a2.e] : f(w0VarArr[e], a2);
            int i4 = iArr[e];
            o00Arr[e][i4] = a2;
            iArr2[e][i4] = f;
            iArr[e] = iArr[e] + 1;
        }
        p00[] p00Arr = new p00[w0VarArr.length];
        int[] iArr3 = new int[w0VarArr.length];
        for (int i5 = 0; i5 < w0VarArr.length; i5++) {
            int i6 = iArr[i5];
            p00Arr[i5] = new p00((o00[]) v50.p0(o00Arr[i5], i6));
            iArr2[i5] = (int[][]) v50.p0(iArr2[i5], i6);
            iArr3[i5] = w0VarArr[i5].j();
        }
        a aVar2 = new a(iArr3, p00Arr, g, iArr2, new p00((o00[]) v50.p0(o00Arr[w0VarArr.length], iArr[w0VarArr.length])));
        Pair<x0[], h40[]> h = h(aVar2, iArr2, g);
        return new l40((x0[]) h.first, (h40[]) h.second, aVar2);
    }

    /* access modifiers changed from: protected */
    public abstract Pair<x0[], h40[]> h(a aVar, int[][][] iArr, int[] iArr2);
}
