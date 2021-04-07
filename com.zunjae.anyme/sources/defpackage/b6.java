package defpackage;

import android.graphics.Color;
import defpackage.c6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: b6  reason: default package */
final class b6 {
    private static final Comparator<b> f = new a();
    final int[] a;
    final int[] b;
    final List<c6.d> c;
    final c6.c[] d;
    private final float[] e = new float[3];

    /* renamed from: b6$a */
    static class a implements Comparator<b> {
        a() {
        }

        /* renamed from: a */
        public int compare(b bVar, b bVar2) {
            return bVar2.g() - bVar.g();
        }
    }

    /* renamed from: b6$b */
    private class b {
        private int a;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;

        b(int i2, int i3) {
            this.a = i2;
            this.b = i3;
            c();
        }

        /* access modifiers changed from: package-private */
        public final boolean a() {
            return e() > 1;
        }

        /* access modifiers changed from: package-private */
        public final int b() {
            int f2 = f();
            b6 b6Var = b6.this;
            int[] iArr = b6Var.a;
            int[] iArr2 = b6Var.b;
            b6.e(iArr, f2, this.a, this.b);
            Arrays.sort(iArr, this.a, this.b + 1);
            b6.e(iArr, f2, this.a, this.b);
            int i2 = this.c / 2;
            int i3 = this.a;
            int i4 = 0;
            while (true) {
                int i5 = this.b;
                if (i3 > i5) {
                    return this.a;
                }
                i4 += iArr2[iArr[i3]];
                if (i4 >= i2) {
                    return Math.min(i5 - 1, i3);
                }
                i3++;
            }
        }

        /* access modifiers changed from: package-private */
        public final void c() {
            b6 b6Var = b6.this;
            int[] iArr = b6Var.a;
            int[] iArr2 = b6Var.b;
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE;
            int i7 = Integer.MIN_VALUE;
            int i8 = 0;
            for (int i9 = this.a; i9 <= this.b; i9++) {
                int i10 = iArr[i9];
                i8 += iArr2[i10];
                int k = b6.k(i10);
                int j2 = b6.j(i10);
                int i11 = b6.i(i10);
                if (k > i5) {
                    i5 = k;
                }
                if (k < i2) {
                    i2 = k;
                }
                if (j2 > i6) {
                    i6 = j2;
                }
                if (j2 < i3) {
                    i3 = j2;
                }
                if (i11 > i7) {
                    i7 = i11;
                }
                if (i11 < i4) {
                    i4 = i11;
                }
            }
            this.d = i2;
            this.e = i5;
            this.f = i3;
            this.g = i6;
            this.h = i4;
            this.i = i7;
            this.c = i8;
        }

        /* access modifiers changed from: package-private */
        public final c6.d d() {
            b6 b6Var = b6.this;
            int[] iArr = b6Var.a;
            int[] iArr2 = b6Var.b;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = this.a; i6 <= this.b; i6++) {
                int i7 = iArr[i6];
                int i8 = iArr2[i7];
                i3 += i8;
                i2 += b6.k(i7) * i8;
                i4 += b6.j(i7) * i8;
                i5 += i8 * b6.i(i7);
            }
            float f2 = (float) i3;
            return new c6.d(b6.b(Math.round(((float) i2) / f2), Math.round(((float) i4) / f2), Math.round(((float) i5) / f2)), i3);
        }

        /* access modifiers changed from: package-private */
        public final int e() {
            return (this.b + 1) - this.a;
        }

        /* access modifiers changed from: package-private */
        public final int f() {
            int i2 = this.e - this.d;
            int i3 = this.g - this.f;
            int i4 = this.i - this.h;
            if (i2 < i3 || i2 < i4) {
                return (i3 < i2 || i3 < i4) ? -1 : -2;
            }
            return -3;
        }

        /* access modifiers changed from: package-private */
        public final int g() {
            return ((this.e - this.d) + 1) * ((this.g - this.f) + 1) * ((this.i - this.h) + 1);
        }

        /* access modifiers changed from: package-private */
        public final b h() {
            if (a()) {
                int b2 = b();
                b bVar = new b(b2 + 1, this.b);
                this.b = b2;
                c();
                return bVar;
            }
            throw new IllegalStateException("Can not split a box with only 1 color");
        }
    }

    b6(int[] iArr, int i, c6.c[] cVarArr) {
        this.d = cVarArr;
        int[] iArr2 = new int[32768];
        this.b = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int g = g(iArr[i2]);
            iArr[i2] = g;
            iArr2[g] = iArr2[g] + 1;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 32768; i4++) {
            if (iArr2[i4] > 0 && l(i4)) {
                iArr2[i4] = 0;
            }
            if (iArr2[i4] > 0) {
                i3++;
            }
        }
        int[] iArr3 = new int[i3];
        this.a = iArr3;
        int i5 = 0;
        for (int i6 = 0; i6 < 32768; i6++) {
            if (iArr2[i6] > 0) {
                iArr3[i5] = i6;
                i5++;
            }
        }
        if (i3 <= i) {
            this.c = new ArrayList();
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = iArr3[i7];
                this.c.add(new c6.d(a(i8), iArr2[i8]));
            }
            return;
        }
        this.c = h(i);
    }

    private static int a(int i) {
        return b(k(i), j(i), i(i));
    }

    static int b(int i, int i2, int i3) {
        return Color.rgb(f(i, 5, 8), f(i2, 5, 8), f(i3, 5, 8));
    }

    private List<c6.d> c(Collection<b> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (b d2 : collection) {
            c6.d d3 = d2.d();
            if (!n(d3)) {
                arrayList.add(d3);
            }
        }
        return arrayList;
    }

    static void e(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = i(i4) | (j(i4) << 10) | (k(i4) << 5);
                i2++;
            }
        } else if (i == -1) {
            while (i2 <= i3) {
                int i5 = iArr[i2];
                iArr[i2] = k(i5) | (i(i5) << 10) | (j(i5) << 5);
                i2++;
            }
        }
    }

    private static int f(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    private static int g(int i) {
        return f(Color.blue(i), 8, 5) | (f(Color.red(i), 8, 5) << 10) | (f(Color.green(i), 8, 5) << 5);
    }

    private List<c6.d> h(int i) {
        PriorityQueue priorityQueue = new PriorityQueue(i, f);
        priorityQueue.offer(new b(0, this.a.length - 1));
        o(priorityQueue, i);
        return c(priorityQueue);
    }

    static int i(int i) {
        return i & 31;
    }

    static int j(int i) {
        return (i >> 5) & 31;
    }

    static int k(int i) {
        return (i >> 10) & 31;
    }

    private boolean l(int i) {
        int a2 = a(i);
        j2.f(a2, this.e);
        return m(a2, this.e);
    }

    private boolean m(int i, float[] fArr) {
        c6.c[] cVarArr = this.d;
        if (cVarArr != null && cVarArr.length > 0) {
            int length = cVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (!this.d[i2].a(i, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean n(c6.d dVar) {
        return m(dVar.e(), dVar.c());
    }

    private void o(PriorityQueue<b> priorityQueue, int i) {
        b poll;
        while (priorityQueue.size() < i && (poll = priorityQueue.poll()) != null && poll.a()) {
            priorityQueue.offer(poll.h());
            priorityQueue.offer(poll);
        }
    }

    /* access modifiers changed from: package-private */
    public List<c6.d> d() {
        return this.c;
    }
}
