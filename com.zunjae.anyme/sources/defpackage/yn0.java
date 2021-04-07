package defpackage;

import defpackage.cl0;
import java.util.Arrays;

/* renamed from: yn0  reason: default package */
public final class yn0 {
    private static final yn0 e = new yn0(0, new int[0], new Object[0], false);
    private int a;
    private int[] b;
    private Object[] c;
    private int d;

    private yn0() {
        this(0, new int[8], new Object[8], true);
    }

    private yn0(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
    }

    static yn0 a(yn0 yn0, yn0 yn02) {
        int i = yn0.a + yn02.a;
        int[] copyOf = Arrays.copyOf(yn0.b, i);
        System.arraycopy(yn02.b, 0, copyOf, yn0.a, yn02.a);
        Object[] copyOf2 = Arrays.copyOf(yn0.c, i);
        System.arraycopy(yn02.c, 0, copyOf2, yn0.a, yn02.a);
        return new yn0(i, copyOf, copyOf2, true);
    }

    private static void d(int i, Object obj, qo0 qo0) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            qo0.J(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            qo0.g(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            qo0.M(i2, (bk0) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                qo0.z(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(ol0.a());
        } else if (qo0.Q() == cl0.e.k) {
            qo0.L(i2);
            ((yn0) obj).e(qo0);
            qo0.N(i2);
        } else {
            qo0.N(i2);
            ((yn0) obj).e(qo0);
            qo0.L(i2);
        }
    }

    public static yn0 h() {
        return e;
    }

    /* access modifiers changed from: package-private */
    public final void b(qo0 qo0) {
        if (qo0.Q() == cl0.e.l) {
            for (int i = this.a - 1; i >= 0; i--) {
                qo0.B(this.b[i] >>> 3, this.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.a; i2++) {
            qo0.B(this.b[i2] >>> 3, this.c[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            qm0.c(sb, i, String.valueOf(this.b[i2] >>> 3), this.c[i2]);
        }
    }

    public final void e(qo0 qo0) {
        if (this.a != 0) {
            if (qo0.Q() == cl0.e.k) {
                for (int i = 0; i < this.a; i++) {
                    d(this.b[i], this.c[i], qo0);
                }
                return;
            }
            for (int i2 = this.a - 1; i2 >= 0; i2--) {
                d(this.b[i2], this.c[i2], qo0);
            }
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof yn0)) {
            return false;
        }
        yn0 yn0 = (yn0) obj;
        int i = this.a;
        if (i == yn0.a) {
            int[] iArr = this.b;
            int[] iArr2 = yn0.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.c;
                Object[] objArr2 = yn0.c;
                int i3 = this.a;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                return z2;
            }
        }
    }

    public final void f() {
    }

    public final int g() {
        int i;
        int i2 = this.d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.a; i4++) {
            int i5 = this.b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = nk0.e0(i6, ((Long) this.c[i4]).longValue());
            } else if (i7 == 1) {
                i = nk0.g0(i6, ((Long) this.c[i4]).longValue());
            } else if (i7 == 2) {
                i = nk0.R(i6, (bk0) this.c[i4]);
            } else if (i7 == 3) {
                i = (nk0.u(i6) << 1) + ((yn0) this.c[i4]).g();
            } else if (i7 == 5) {
                i = nk0.u0(i6, ((Integer) this.c[i4]).intValue());
            } else {
                throw new IllegalStateException(ol0.a());
            }
            i3 += i;
        }
        this.d = i3;
        return i3;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final int i() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            i2 += nk0.b0(this.b[i3] >>> 3, (bk0) this.c[i3]);
        }
        this.d = i2;
        return i2;
    }
}
