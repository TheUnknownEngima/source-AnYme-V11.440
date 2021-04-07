package defpackage;

import com.github.mikephil.charting.utils.Utils;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.upstream.f;
import defpackage.h40;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* renamed from: b40  reason: default package */
public class b40 extends c40 {
    private final b g;
    private final long h;
    private final long i;
    private final long j;
    private final float k;
    private final long l;
    private final r40 m;
    private float n;
    private int o;
    private int p;
    private long q;

    /* renamed from: b40$b */
    private interface b {
        long a();
    }

    /* renamed from: b40$c */
    private static final class c implements b {
        private final f a;
        private final float b;
        private final long c;
        private long[][] d;

        c(f fVar, float f, long j) {
            this.a = fVar;
            this.b = f;
            this.c = j;
        }

        public long a() {
            long max = Math.max(0, ((long) (((float) this.a.e()) * this.b)) - this.c);
            if (this.d == null) {
                return max;
            }
            int i = 1;
            while (true) {
                long[][] jArr = this.d;
                if (i >= jArr.length - 1 || jArr[i][0] >= max) {
                    long[][] jArr2 = this.d;
                    long[] jArr3 = jArr2[i - 1];
                    long[] jArr4 = jArr2[i];
                } else {
                    i++;
                }
            }
            long[][] jArr22 = this.d;
            long[] jArr32 = jArr22[i - 1];
            long[] jArr42 = jArr22[i];
            return jArr32[1] + ((long) ((((float) (max - jArr32[0])) / ((float) (jArr42[0] - jArr32[0]))) * ((float) (jArr42[1] - jArr32[1]))));
        }

        /* access modifiers changed from: package-private */
        public void b(long[][] jArr) {
            q40.a(jArr.length >= 2);
            this.d = jArr;
        }
    }

    /* renamed from: b40$d */
    public static class d implements h40.b {
        private final f a;
        private final int b;
        private final int c;
        private final int d;
        private final float e;
        private final float f;
        private final long g;
        private final r40 h;

        public d() {
            this(10000, 25000, 25000, 0.7f, 0.75f, 2000, r40.a);
        }

        public d(int i, int i2, int i3, float f2, float f3, long j, r40 r40) {
            this((f) null, i, i2, i3, f2, f3, j, r40);
        }

        @Deprecated
        public d(f fVar, int i, int i2, int i3, float f2, float f3, long j, r40 r40) {
            this.a = fVar;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = f2;
            this.f = f3;
            this.g = j;
            this.h = r40;
        }

        public final h40[] a(h40.a[] aVarArr, f fVar) {
            f fVar2 = this.a;
            if (fVar2 != null) {
                fVar = fVar2;
            }
            h40[] h40Arr = new h40[aVarArr.length];
            int i = 0;
            for (int i2 = 0; i2 < aVarArr.length; i2++) {
                h40.a aVar = aVarArr[i2];
                if (aVar != null) {
                    int[] iArr = aVar.b;
                    if (iArr.length == 1) {
                        h40Arr[i2] = new e40(aVar.a, iArr[0], aVar.c, aVar.d);
                        int i3 = aVar.a.a(aVar.b[0]).i;
                        if (i3 != -1) {
                            i += i3;
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < aVarArr.length; i4++) {
                h40.a aVar2 = aVarArr[i4];
                if (aVar2 != null) {
                    int[] iArr2 = aVar2.b;
                    if (iArr2.length > 1) {
                        b40 b2 = b(aVar2.a, fVar, iArr2, i);
                        arrayList.add(b2);
                        h40Arr[i4] = b2;
                    }
                }
            }
            if (arrayList.size() > 1) {
                long[][] jArr = new long[arrayList.size()][];
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    b40 b40 = (b40) arrayList.get(i5);
                    jArr[i5] = new long[b40.length()];
                    for (int i6 = 0; i6 < b40.length(); i6++) {
                        jArr[i5][i6] = (long) b40.d((b40.length() - i6) - 1).i;
                    }
                }
                long[][][] s = b40.x(jArr);
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((b40) arrayList.get(i7)).w(s[i7]);
                }
            }
            return h40Arr;
        }

        /* access modifiers changed from: protected */
        public b40 b(o00 o00, f fVar, int[] iArr, int i) {
            return new b40(o00, iArr, new c(fVar, this.e, (long) i), (long) this.b, (long) this.c, (long) this.d, this.f, this.g, this.h);
        }
    }

    private b40(o00 o00, int[] iArr, b bVar, long j2, long j3, long j4, float f, long j5, r40 r40) {
        super(o00, iArr);
        this.g = bVar;
        this.h = j2 * 1000;
        this.i = j3 * 1000;
        this.j = j4 * 1000;
        this.k = f;
        this.l = j5;
        this.m = r40;
        this.n = 1.0f;
        this.p = 0;
        this.q = -9223372036854775807L;
    }

    private static double[][] A(double[][] dArr) {
        double[][] dArr2 = new double[dArr.length][];
        for (int i2 = 0; i2 < dArr.length; i2++) {
            dArr2[i2] = new double[(dArr[i2].length - 1)];
            if (dArr2[i2].length != 0) {
                double d2 = dArr[i2][dArr[i2].length - 1] - dArr[i2][0];
                int i3 = 0;
                while (i3 < dArr[i2].length - 1) {
                    int i4 = i3 + 1;
                    dArr2[i2][i3] = d2 == Utils.DOUBLE_EPSILON ? 1.0d : (((dArr[i2][i3] + dArr[i2][i4]) * 0.5d) - dArr[i2][0]) / d2;
                    i3 = i4;
                }
            }
        }
        return dArr2;
    }

    private long B(long j2) {
        return (j2 > -9223372036854775807L ? 1 : (j2 == -9223372036854775807L ? 0 : -1)) != 0 && (j2 > this.h ? 1 : (j2 == this.h ? 0 : -1)) <= 0 ? (long) (((float) j2) * this.k) : this.h;
    }

    private static void C(long[][][] jArr, int i2, long[][] jArr2, int[] iArr) {
        long j2 = 0;
        for (int i3 = 0; i3 < jArr.length; i3++) {
            jArr[i3][i2][1] = jArr2[i3][iArr[i3]];
            j2 += jArr[i3][i2][1];
        }
        for (long[][] jArr3 : jArr) {
            jArr3[i2][0] = j2;
        }
    }

    private static int u(double[][] dArr) {
        int i2 = 0;
        for (double[] length : dArr) {
            i2 += length.length;
        }
        return i2;
    }

    private int v(long j2) {
        long a2 = this.g.a();
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            if (j2 == Long.MIN_VALUE || !r(i3, j2)) {
                f0 d2 = d(i3);
                if (t(d2, d2.i, this.n, a2)) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    /* access modifiers changed from: private */
    public static long[][][] x(long[][] jArr) {
        int i2;
        long[][] jArr2 = jArr;
        double[][] y = y(jArr);
        double[][] A = A(y);
        int u = u(A) + 3;
        int length = y.length;
        int[] iArr = new int[3];
        iArr[2] = 2;
        iArr[1] = u;
        iArr[0] = length;
        long[][][] jArr3 = (long[][][]) Array.newInstance(long.class, iArr);
        int[] iArr2 = new int[y.length];
        C(jArr3, 1, jArr2, iArr2);
        int i3 = 2;
        while (true) {
            i2 = u - 1;
            if (i3 >= i2) {
                break;
            }
            double d2 = Double.MAX_VALUE;
            int i4 = 0;
            for (int i5 = 0; i5 < y.length; i5++) {
                if (iArr2[i5] + 1 != y[i5].length) {
                    double d3 = A[i5][iArr2[i5]];
                    if (d3 < d2) {
                        i4 = i5;
                        d2 = d3;
                    }
                }
            }
            iArr2[i4] = iArr2[i4] + 1;
            C(jArr3, i3, jArr2, iArr2);
            i3++;
        }
        for (long[][] jArr4 : jArr3) {
            int i6 = u - 2;
            jArr4[i2][0] = jArr4[i6][0] * 2;
            jArr4[i2][1] = jArr4[i6][1] * 2;
        }
        return jArr3;
    }

    private static double[][] y(long[][] jArr) {
        double[][] dArr = new double[jArr.length][];
        for (int i2 = 0; i2 < jArr.length; i2++) {
            dArr[i2] = new double[jArr[i2].length];
            for (int i3 = 0; i3 < jArr[i2].length; i3++) {
                dArr[i2][i3] = jArr[i2][i3] == -1 ? Utils.DOUBLE_EPSILON : Math.log((double) jArr[i2][i3]);
            }
        }
        return dArr;
    }

    /* access modifiers changed from: protected */
    public boolean D(long j2) {
        long j3 = this.q;
        return j3 == -9223372036854775807L || j2 - j3 >= this.l;
    }

    public int b() {
        return this.o;
    }

    public void e() {
        this.q = -9223372036854775807L;
    }

    public int g(long j2, List<? extends d10> list) {
        int i2;
        int i3;
        long a2 = this.m.a();
        if (!D(a2)) {
            return list.size();
        }
        this.q = a2;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long R = v50.R(((d10) list.get(size - 1)).f - j2, this.n);
        long z = z();
        if (R < z) {
            return size;
        }
        f0 d2 = d(v(a2));
        for (int i4 = 0; i4 < size; i4++) {
            d10 d10 = (d10) list.get(i4);
            f0 f0Var = d10.c;
            if (v50.R(d10.f - j2, this.n) >= z && f0Var.i < d2.i && (i2 = f0Var.s) != -1 && i2 < 720 && (i3 = f0Var.r) != -1 && i3 < 1280 && i2 < d2.s) {
                return i4;
            }
        }
        return size;
    }

    public void j(long j2, long j3, long j4, List<? extends d10> list, e10[] e10Arr) {
        long a2 = this.m.a();
        if (this.p == 0) {
            this.p = 1;
            this.o = v(a2);
            return;
        }
        int i2 = this.o;
        int v = v(a2);
        this.o = v;
        if (v != i2) {
            if (!r(i2, a2)) {
                f0 d2 = d(i2);
                f0 d3 = d(this.o);
                if ((d3.i > d2.i && j3 < B(j4)) || (d3.i < d2.i && j3 >= this.i)) {
                    this.o = i2;
                }
            }
            if (this.o != i2) {
                this.p = 3;
            }
        }
    }

    public int m() {
        return this.p;
    }

    public void n(float f) {
        this.n = f;
    }

    public Object o() {
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean t(f0 f0Var, int i2, float f, long j2) {
        return ((long) Math.round(((float) i2) * f)) <= j2;
    }

    public void w(long[][] jArr) {
        ((c) this.g).b(jArr);
    }

    /* access modifiers changed from: protected */
    public long z() {
        return this.j;
    }
}
