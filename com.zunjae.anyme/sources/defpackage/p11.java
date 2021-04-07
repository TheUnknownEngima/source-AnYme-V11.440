package defpackage;

import defpackage.sy0;
import java.util.Arrays;

/* renamed from: p11  reason: default package */
public final class p11 {
    private static final p11 f = new p11(0, new int[0], new Object[0], false);
    private int a;
    private int[] b;
    private Object[] c;
    private int d;
    private boolean e;

    private p11() {
        this(0, new int[8], new Object[8], true);
    }

    private p11(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static p11 a() {
        return f;
    }

    static p11 b(p11 p11, p11 p112) {
        int i = p11.a + p112.a;
        int[] copyOf = Arrays.copyOf(p11.b, i);
        System.arraycopy(p112.b, 0, copyOf, p11.a, p112.a);
        Object[] copyOf2 = Arrays.copyOf(p11.c, i);
        System.arraycopy(p112.c, 0, copyOf2, p11.a, p112.a);
        return new p11(i, copyOf, copyOf2, true);
    }

    private static void d(int i, Object obj, k21 k21) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            k21.n(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            k21.K(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            k21.C(i2, (lx0) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                k21.J(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(ez0.d());
        } else if (k21.zza() == sy0.e.k) {
            k21.f(i2);
            ((p11) obj).h(k21);
            k21.e(i2);
        } else {
            k21.e(i2);
            ((p11) obj).h(k21);
            k21.f(i2);
        }
    }

    static p11 g() {
        return new p11();
    }

    /* access modifiers changed from: package-private */
    public final void c(int i, Object obj) {
        if (this.e) {
            int i2 = this.a;
            if (i2 == this.b.length) {
                int i3 = this.a + (i2 < 4 ? 8 : i2 >> 1);
                this.b = Arrays.copyOf(this.b, i3);
                this.c = Arrays.copyOf(this.c, i3);
            }
            int[] iArr = this.b;
            int i4 = this.a;
            iArr[i4] = i;
            this.c[i4] = obj;
            this.a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public final void e(k21 k21) {
        if (k21.zza() == sy0.e.l) {
            for (int i = this.a - 1; i >= 0; i--) {
                k21.E(this.b[i] >>> 3, this.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.a; i2++) {
            k21.E(this.b[i2] >>> 3, this.c[i2]);
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p11)) {
            return false;
        }
        p11 p11 = (p11) obj;
        int i = this.a;
        if (i == p11.a) {
            int[] iArr = this.b;
            int[] iArr2 = p11.b;
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
                Object[] objArr2 = p11.c;
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

    /* access modifiers changed from: package-private */
    public final void f(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            g01.d(sb, i, String.valueOf(this.b[i2] >>> 3), this.c[i2]);
        }
    }

    public final void h(k21 k21) {
        if (this.a != 0) {
            if (k21.zza() == sy0.e.k) {
                for (int i = 0; i < this.a; i++) {
                    d(this.b[i], this.c[i], k21);
                }
                return;
            }
            for (int i2 = this.a - 1; i2 >= 0; i2--) {
                d(this.b[i2], this.c[i2], k21);
            }
        }
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

    public final void i() {
        this.e = false;
    }

    public final int j() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            i2 += cy0.d0(this.b[i3] >>> 3, (lx0) this.c[i3]);
        }
        this.d = i2;
        return i2;
    }

    public final int k() {
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
                i = cy0.i0(i6, ((Long) this.c[i4]).longValue());
            } else if (i7 == 1) {
                i = cy0.r0(i6, ((Long) this.c[i4]).longValue());
            } else if (i7 == 2) {
                i = cy0.U(i6, (lx0) this.c[i4]);
            } else if (i7 == 3) {
                i = (cy0.h0(i6) << 1) + ((p11) this.c[i4]).k();
            } else if (i7 == 5) {
                i = cy0.y0(i6, ((Integer) this.c[i4]).intValue());
            } else {
                throw new IllegalStateException(ez0.d());
            }
            i3 += i;
        }
        this.d = i3;
        return i3;
    }
}
