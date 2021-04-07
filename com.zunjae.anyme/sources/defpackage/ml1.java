package defpackage;

import defpackage.sl1;
import java.util.Arrays;

/* renamed from: ml1  reason: default package */
public final class ml1 {
    private static final ml1 f = new ml1(0, new int[0], new Object[0], false);
    private int a;
    private int[] b;
    private Object[] c;
    private int d;
    private boolean e;

    private ml1() {
        this(0, new int[8], new Object[8], true);
    }

    private ml1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    private void b() {
        int i = this.a;
        if (i == this.b.length) {
            int i2 = this.a + (i < 4 ? 8 : i >> 1);
            this.b = Arrays.copyOf(this.b, i2);
            this.c = Arrays.copyOf(this.c, i2);
        }
    }

    private static boolean c(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    public static ml1 e() {
        return f;
    }

    private static int h(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    private static int i(Object[] objArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + objArr[i3].hashCode();
        }
        return i2;
    }

    static ml1 k(ml1 ml1, ml1 ml12) {
        int i = ml1.a + ml12.a;
        int[] copyOf = Arrays.copyOf(ml1.b, i);
        System.arraycopy(ml12.b, 0, copyOf, ml1.a, ml12.a);
        Object[] copyOf2 = Arrays.copyOf(ml1.c, i);
        System.arraycopy(ml12.c, 0, copyOf2, ml1.a, ml12.a);
        return new ml1(i, copyOf, copyOf2, true);
    }

    static ml1 l() {
        return new ml1();
    }

    private static void p(int i, Object obj, sl1 sl1) {
        int a2 = rl1.a(i);
        int b2 = rl1.b(i);
        if (b2 == 0) {
            sl1.q(a2, ((Long) obj).longValue());
        } else if (b2 == 1) {
            sl1.k(a2, ((Long) obj).longValue());
        } else if (b2 == 2) {
            sl1.v(a2, (ej1) obj);
        } else if (b2 != 3) {
            if (b2 == 5) {
                sl1.f(a2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(yj1.d());
        } else if (sl1.l() == sl1.a.ASCENDING) {
            sl1.u(a2);
            ((ml1) obj).q(sl1);
            sl1.H(a2);
        } else {
            sl1.H(a2);
            ((ml1) obj).q(sl1);
            sl1.u(a2);
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ml1)) {
            return false;
        }
        ml1 ml1 = (ml1) obj;
        int i = this.a;
        return i == ml1.a && c(this.b, ml1.b, i) && d(this.c, ml1.c, this.a);
    }

    public int f() {
        int i;
        int i2 = this.d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.a; i4++) {
            int i5 = this.b[i4];
            int a2 = rl1.a(i5);
            int b2 = rl1.b(i5);
            if (b2 == 0) {
                i = hj1.X(a2, ((Long) this.c[i4]).longValue());
            } else if (b2 == 1) {
                i = hj1.o(a2, ((Long) this.c[i4]).longValue());
            } else if (b2 == 2) {
                i = hj1.g(a2, (ej1) this.c[i4]);
            } else if (b2 == 3) {
                i = (hj1.U(a2) * 2) + ((ml1) this.c[i4]).f();
            } else if (b2 == 5) {
                i = hj1.m(a2, ((Integer) this.c[i4]).intValue());
            } else {
                throw new IllegalStateException(yj1.d());
            }
            i3 += i;
        }
        this.d = i3;
        return i3;
    }

    public int g() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            i2 += hj1.I(rl1.a(this.b[i3]), (ej1) this.c[i3]);
        }
        this.d = i2;
        return i2;
    }

    public int hashCode() {
        int i = this.a;
        return ((((527 + i) * 31) + h(this.b, i)) * 31) + i(this.c, this.a);
    }

    public void j() {
        this.e = false;
    }

    /* access modifiers changed from: package-private */
    public final void m(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            qk1.c(sb, i, String.valueOf(rl1.a(this.b[i2])), this.c[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    public void n(int i, Object obj) {
        a();
        b();
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    /* access modifiers changed from: package-private */
    public void o(sl1 sl1) {
        if (sl1.l() == sl1.a.DESCENDING) {
            for (int i = this.a - 1; i >= 0; i--) {
                sl1.e(rl1.a(this.b[i]), this.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.a; i2++) {
            sl1.e(rl1.a(this.b[i2]), this.c[i2]);
        }
    }

    public void q(sl1 sl1) {
        if (this.a != 0) {
            if (sl1.l() == sl1.a.ASCENDING) {
                for (int i = 0; i < this.a; i++) {
                    p(this.b[i], this.c[i], sl1);
                }
                return;
            }
            for (int i2 = this.a - 1; i2 >= 0; i2--) {
                p(this.b[i2], this.c[i2], sl1);
            }
        }
    }
}
