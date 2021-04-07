package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: cy0  reason: default package */
public abstract class cy0 extends mx0 {
    private static final Logger b = Logger.getLogger(cy0.class.getName());
    /* access modifiers changed from: private */
    public static final boolean c = s11.m();
    ey0 a;

    /* renamed from: cy0$a */
    public static class a extends IOException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        a(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L_0x0011
                java.lang.String r3 = r1.concat(r3)
                goto L_0x0016
            L_0x0011:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L_0x0016:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.cy0.a.<init>(java.lang.String, java.lang.Throwable):void");
        }

        a(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    /* renamed from: cy0$b */
    static class b extends cy0 {
        private final byte[] d;
        private final int e;
        private int f;

        b(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            } else if ((i2 | 0 | (bArr.length - i2)) >= 0) {
                this.d = bArr;
                this.f = 0;
                this.e = i2;
            } else {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)}));
            }
        }

        private final void G0(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.d, this.f, i2);
                this.f += i2;
            } catch (IndexOutOfBoundsException e2) {
                throw new a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(i2)}), e2);
            }
        }

        public final void O(int i) {
            if (!cy0.c || ix0.b() || b() < 5) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.d;
                    int i2 = this.f;
                    this.f = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.d;
                    int i3 = this.f;
                    this.f = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e2) {
                    throw new a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.e), 1}), e2);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.d;
                int i4 = this.f;
                this.f = i4 + 1;
                s11.l(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.d;
                int i5 = this.f;
                this.f = i5 + 1;
                s11.l(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.d;
                    int i7 = this.f;
                    this.f = i7 + 1;
                    s11.l(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.d;
                int i8 = this.f;
                this.f = i8 + 1;
                s11.l(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.d;
                    int i10 = this.f;
                    this.f = i10 + 1;
                    s11.l(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.d;
                int i11 = this.f;
                this.f = i11 + 1;
                s11.l(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.d;
                    int i13 = this.f;
                    this.f = i13 + 1;
                    s11.l(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.d;
                int i14 = this.f;
                this.f = i14 + 1;
                s11.l(bArr10, (long) i14, (byte) (i12 | 128));
                byte[] bArr11 = this.d;
                int i15 = this.f;
                this.f = i15 + 1;
                s11.l(bArr11, (long) i15, (byte) (i12 >>> 7));
            }
        }

        public final void P(int i, int i2) {
            m(i, 0);
            j(i2);
        }

        public final void R(int i, lx0 lx0) {
            m(1, 3);
            Y(2, i);
            o(3, lx0);
            m(1, 4);
        }

        public final void T(byte[] bArr, int i, int i2) {
            O(i2);
            G0(bArr, 0, i2);
        }

        public final void Y(int i, int i2) {
            m(i, 0);
            O(i2);
        }

        public final void Z(int i, long j) {
            m(i, 1);
            a0(j);
        }

        public final void a(byte[] bArr, int i, int i2) {
            G0(bArr, i, i2);
        }

        public final void a0(long j) {
            try {
                byte[] bArr = this.d;
                int i = this.f;
                int i2 = i + 1;
                this.f = i2;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.d;
                int i3 = i2 + 1;
                this.f = i3;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.d;
                int i4 = i3 + 1;
                this.f = i4;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.d;
                int i5 = i4 + 1;
                this.f = i5;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.d;
                int i6 = i5 + 1;
                this.f = i6;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.d;
                int i7 = i6 + 1;
                this.f = i7;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.d;
                int i8 = i7 + 1;
                this.f = i8;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.d;
                this.f = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e2) {
                throw new a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.e), 1}), e2);
            }
        }

        public final int b() {
            return this.e - this.f;
        }

        public final void f0(int i) {
            try {
                byte[] bArr = this.d;
                int i2 = this.f;
                int i3 = i2 + 1;
                this.f = i3;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.d;
                int i4 = i3 + 1;
                this.f = i4;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.d;
                int i5 = i4 + 1;
                this.f = i5;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.d;
                this.f = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e2) {
                throw new a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.e), 1}), e2);
            }
        }

        public final void g(byte b) {
            try {
                byte[] bArr = this.d;
                int i = this.f;
                this.f = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e2) {
                throw new a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.e), 1}), e2);
            }
        }

        public final void j(int i) {
            if (i >= 0) {
                O(i);
            } else {
                t((long) i);
            }
        }

        public final void k0(int i, int i2) {
            m(i, 5);
            f0(i2);
        }

        public final void m(int i, int i2) {
            O((i << 3) | i2);
        }

        public final void n(int i, long j) {
            m(i, 0);
            t(j);
        }

        public final void o(int i, lx0 lx0) {
            m(i, 2);
            u(lx0);
        }

        public final void p(int i, f01 f01) {
            m(1, 3);
            Y(2, i);
            m(3, 2);
            v(f01);
            m(1, 4);
        }

        /* access modifiers changed from: package-private */
        public final void q(int i, f01 f01, u01 u01) {
            m(i, 2);
            cx0 cx0 = (cx0) f01;
            int i2 = cx0.i();
            if (i2 == -1) {
                i2 = u01.d(cx0);
                cx0.l(i2);
            }
            O(i2);
            u01.g(f01, this.a);
        }

        public final void r(int i, String str) {
            m(i, 2);
            w(str);
        }

        public final void s(int i, boolean z) {
            m(i, 0);
            g(z ? (byte) 1 : 0);
        }

        public final void t(long j) {
            if (!cy0.c || b() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.d;
                    int i = this.f;
                    this.f = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.d;
                    int i2 = this.f;
                    this.f = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e2) {
                    throw new a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.e), 1}), e2);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.d;
                    int i3 = this.f;
                    this.f = i3 + 1;
                    s11.l(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.d;
                int i4 = this.f;
                this.f = i4 + 1;
                s11.l(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        public final void u(lx0 lx0) {
            O(lx0.c());
            lx0.k(this);
        }

        public final void v(f01 f01) {
            O(f01.d());
            f01.e(this);
        }

        public final void w(String str) {
            int i = this.f;
            try {
                int p0 = cy0.p0(str.length() * 3);
                int p02 = cy0.p0(str.length());
                if (p02 == p0) {
                    int i2 = i + p02;
                    this.f = i2;
                    int e2 = v11.e(str, this.d, i2, b());
                    this.f = i;
                    O((e2 - i) - p02);
                    this.f = e2;
                    return;
                }
                O(v11.d(str));
                this.f = v11.e(str, this.d, this.f, b());
            } catch (y11 e3) {
                this.f = i;
                x(str, e3);
            } catch (IndexOutOfBoundsException e4) {
                throw new a(e4);
            }
        }
    }

    private cy0() {
    }

    public static int A(float f) {
        return 4;
    }

    public static int A0(int i) {
        return 4;
    }

    public static int B(int i, double d) {
        return p0(i << 3) + 8;
    }

    public static int B0(int i, int i2) {
        return p0(i << 3) + 4;
    }

    public static int C(int i, float f) {
        return p0(i << 3) + 4;
    }

    public static int C0(int i) {
        return l0(i);
    }

    public static int D(int i, jz0 jz0) {
        return (p0(8) << 1) + q0(2, i) + c(3, jz0);
    }

    public static int D0(int i, int i2) {
        return p0(i << 3) + l0(i2);
    }

    public static int E(int i, f01 f01) {
        return (p0(8) << 1) + q0(2, i) + p0(24) + J(f01);
    }

    @Deprecated
    public static int E0(int i) {
        return p0(i);
    }

    static int F(int i, f01 f01, u01 u01) {
        return p0(i << 3) + e(f01, u01);
    }

    private static int F0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static int G(int i, String str) {
        return p0(i << 3) + K(str);
    }

    public static int H(int i, boolean z) {
        return p0(i << 3) + 1;
    }

    public static int I(lx0 lx0) {
        int c2 = lx0.c();
        return p0(c2) + c2;
    }

    public static int J(f01 f01) {
        int d = f01.d();
        return p0(d) + d;
    }

    public static int K(String str) {
        int i;
        try {
            i = v11.d(str);
        } catch (y11 unused) {
            i = str.getBytes(uy0.a).length;
        }
        return p0(i) + i;
    }

    public static int L(boolean z) {
        return 1;
    }

    public static int M(byte[] bArr) {
        int length = bArr.length;
        return p0(length) + length;
    }

    public static int U(int i, lx0 lx0) {
        int p0 = p0(i << 3);
        int c2 = lx0.c();
        return p0 + p0(c2) + c2;
    }

    @Deprecated
    static int V(int i, f01 f01, u01 u01) {
        int p0 = p0(i << 3) << 1;
        cx0 cx0 = (cx0) f01;
        int i2 = cx0.i();
        if (i2 == -1) {
            i2 = u01.d(cx0);
            cx0.l(i2);
        }
        return p0 + i2;
    }

    @Deprecated
    public static int W(f01 f01) {
        return f01.d();
    }

    public static int c(int i, jz0 jz0) {
        int p0 = p0(i << 3);
        int b2 = jz0.b();
        return p0 + p0(b2) + b2;
    }

    public static int c0(int i, long j) {
        return p0(i << 3) + j0(j);
    }

    public static int d(jz0 jz0) {
        int b2 = jz0.b();
        return p0(b2) + b2;
    }

    public static int d0(int i, lx0 lx0) {
        return (p0(8) << 1) + q0(2, i) + U(3, lx0);
    }

    static int e(f01 f01, u01 u01) {
        cx0 cx0 = (cx0) f01;
        int i = cx0.i();
        if (i == -1) {
            i = u01.d(cx0);
            cx0.l(i);
        }
        return p0(i) + i;
    }

    public static int e0(long j) {
        return j0(j);
    }

    public static cy0 f(byte[] bArr) {
        return new b(bArr, 0, bArr.length);
    }

    public static int h0(int i) {
        return p0(i << 3);
    }

    public static int i0(int i, long j) {
        return p0(i << 3) + j0(j);
    }

    public static int j0(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    public static int l0(int i) {
        if (i >= 0) {
            return p0(i);
        }
        return 10;
    }

    public static int m0(int i, int i2) {
        return p0(i << 3) + l0(i2);
    }

    public static int n0(int i, long j) {
        return p0(i << 3) + j0(z0(j));
    }

    public static int o0(long j) {
        return j0(z0(j));
    }

    public static int p0(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    public static int q0(int i, int i2) {
        return p0(i << 3) + p0(i2);
    }

    public static int r0(int i, long j) {
        return p0(i << 3) + 8;
    }

    public static int s0(long j) {
        return 8;
    }

    public static int t0(int i) {
        return p0(F0(i));
    }

    public static int u0(int i, int i2) {
        return p0(i << 3) + p0(F0(i2));
    }

    public static int v0(int i, long j) {
        return p0(i << 3) + 8;
    }

    public static int w0(long j) {
        return 8;
    }

    public static int x0(int i) {
        return 4;
    }

    public static int y0(int i, int i2) {
        return p0(i << 3) + 4;
    }

    public static int z(double d) {
        return 8;
    }

    private static long z0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public final void N() {
        if (b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void O(int i);

    public abstract void P(int i, int i2);

    public final void Q(int i, long j) {
        n(i, z0(j));
    }

    public abstract void R(int i, lx0 lx0);

    public final void S(long j) {
        t(z0(j));
    }

    /* access modifiers changed from: package-private */
    public abstract void T(byte[] bArr, int i, int i2);

    public final void X(int i) {
        O(F0(i));
    }

    public abstract void Y(int i, int i2);

    public abstract void Z(int i, long j);

    public abstract void a0(long j);

    public abstract int b();

    public abstract void f0(int i);

    public abstract void g(byte b2);

    public final void g0(int i, int i2) {
        Y(i, F0(i2));
    }

    public final void h(double d) {
        a0(Double.doubleToRawLongBits(d));
    }

    public final void i(float f) {
        f0(Float.floatToRawIntBits(f));
    }

    public abstract void j(int i);

    public final void k(int i, double d) {
        Z(i, Double.doubleToRawLongBits(d));
    }

    public abstract void k0(int i, int i2);

    public final void l(int i, float f) {
        k0(i, Float.floatToRawIntBits(f));
    }

    public abstract void m(int i, int i2);

    public abstract void n(int i, long j);

    public abstract void o(int i, lx0 lx0);

    public abstract void p(int i, f01 f01);

    /* access modifiers changed from: package-private */
    public abstract void q(int i, f01 f01, u01 u01);

    public abstract void r(int i, String str);

    public abstract void s(int i, boolean z);

    public abstract void t(long j);

    public abstract void u(lx0 lx0);

    public abstract void v(f01 f01);

    public abstract void w(String str);

    /* access modifiers changed from: package-private */
    public final void x(String str, y11 y11) {
        b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", y11);
        byte[] bytes = str.getBytes(uy0.a);
        try {
            O(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new a(e);
        } catch (a e2) {
            throw e2;
        }
    }

    public final void y(boolean z) {
        g(z ? (byte) 1 : 0);
    }
}
