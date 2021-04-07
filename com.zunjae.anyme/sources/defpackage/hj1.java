package defpackage;

import defpackage.ql1;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: hj1  reason: default package */
public abstract class hj1 extends dj1 {
    private static final Logger c = Logger.getLogger(hj1.class.getName());
    /* access modifiers changed from: private */
    public static final boolean d = pl1.C();
    ij1 a;
    private boolean b;

    /* renamed from: hj1$b */
    private static class b extends hj1 {
        private final byte[] e;
        private final int f;
        private int g;

        b(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.e = bArr;
                    this.g = i;
                    this.f = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        public final void B0(int i, int i2) {
            T0(i, 0);
            C0(i2);
        }

        public final void C0(int i) {
            if (i >= 0) {
                V0(i);
            } else {
                X0((long) i);
            }
        }

        /* access modifiers changed from: package-private */
        public final void F0(int i, ok1 ok1, el1 el1) {
            T0(i, 2);
            V0(((wi1) ok1).i(el1));
            el1.d(ok1, this.a);
        }

        public final void G0(ok1 ok1) {
            V0(ok1.g());
            ok1.e(this);
        }

        public final void H0(int i, ok1 ok1) {
            T0(1, 3);
            U0(2, i);
            Z0(3, ok1);
            T0(1, 4);
        }

        public final void I0(int i, ej1 ej1) {
            T0(1, 3);
            U0(2, i);
            l0(3, ej1);
            T0(1, 4);
        }

        public final void R0(int i, String str) {
            T0(i, 2);
            S0(str);
        }

        public final void S0(String str) {
            int f2;
            int i = this.g;
            try {
                int W = hj1.W(str.length() * 3);
                int W2 = hj1.W(str.length());
                if (W2 == W) {
                    int i2 = i + W2;
                    this.g = i2;
                    f2 = ql1.f(str, this.e, i2, f0());
                    this.g = i;
                    V0((f2 - i) - W2);
                } else {
                    V0(ql1.g(str));
                    f2 = ql1.f(str, this.e, this.g, f0());
                }
                this.g = f2;
            } catch (ql1.d e2) {
                this.g = i;
                b0(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new c(e3);
            }
        }

        public final void T0(int i, int i2) {
            V0(rl1.c(i, i2));
        }

        public final void U0(int i, int i2) {
            T0(i, 0);
            V0(i2);
        }

        public final void V0(int i) {
            if (!hj1.d || zi1.c() || f0() < 5) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.e;
                    int i3 = this.g;
                    this.g = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e2) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.f), 1}), e2);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.e;
                int i4 = this.g;
                this.g = i4 + 1;
                pl1.I(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.e;
                int i5 = this.g;
                this.g = i5 + 1;
                pl1.I(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.e;
                    int i7 = this.g;
                    this.g = i7 + 1;
                    pl1.I(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.e;
                int i8 = this.g;
                this.g = i8 + 1;
                pl1.I(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.e;
                    int i10 = this.g;
                    this.g = i10 + 1;
                    pl1.I(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.e;
                int i11 = this.g;
                this.g = i11 + 1;
                pl1.I(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.e;
                    int i13 = this.g;
                    this.g = i13 + 1;
                    pl1.I(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.e;
                int i14 = this.g;
                this.g = i14 + 1;
                pl1.I(bArr10, (long) i14, (byte) (i12 | 128));
                byte[] bArr11 = this.e;
                int i15 = this.g;
                this.g = i15 + 1;
                pl1.I(bArr11, (long) i15, (byte) (i12 >>> 7));
            }
        }

        public final void W0(int i, long j) {
            T0(i, 0);
            X0(j);
        }

        public final void X0(long j) {
            if (!hj1.d || f0() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.e;
                    int i = this.g;
                    this.g = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e2) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.f), 1}), e2);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.e;
                    int i3 = this.g;
                    this.g = i3 + 1;
                    pl1.I(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.e;
                int i4 = this.g;
                this.g = i4 + 1;
                pl1.I(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        public final void Y0(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.e, this.g, i2);
                this.g += i2;
            } catch (IndexOutOfBoundsException e2) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(i2)}), e2);
            }
        }

        public final void Z0(int i, ok1 ok1) {
            T0(i, 2);
            G0(ok1);
        }

        public final void a(byte[] bArr, int i, int i2) {
            Y0(bArr, i, i2);
        }

        public final int f0() {
            return this.f - this.g;
        }

        public final void g0(byte b) {
            try {
                byte[] bArr = this.e;
                int i = this.g;
                this.g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e2) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.f), 1}), e2);
            }
        }

        public final void h0(int i, boolean z) {
            T0(i, 0);
            g0(z ? (byte) 1 : 0);
        }

        public final void k0(byte[] bArr, int i, int i2) {
            V0(i2);
            Y0(bArr, i, i2);
        }

        public final void l0(int i, ej1 ej1) {
            T0(i, 2);
            m0(ej1);
        }

        public final void m0(ej1 ej1) {
            V0(ej1.size());
            ej1.E(this);
        }

        public final void r0(int i, int i2) {
            T0(i, 5);
            s0(i2);
        }

        public final void s0(int i) {
            try {
                byte[] bArr = this.e;
                int i2 = this.g;
                int i3 = i2 + 1;
                this.g = i3;
                bArr[i2] = (byte) (i & 255);
                byte[] bArr2 = this.e;
                int i4 = i3 + 1;
                this.g = i4;
                bArr2[i3] = (byte) ((i >> 8) & 255);
                byte[] bArr3 = this.e;
                int i5 = i4 + 1;
                this.g = i5;
                bArr3[i4] = (byte) ((i >> 16) & 255);
                byte[] bArr4 = this.e;
                this.g = i5 + 1;
                bArr4[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e2) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.f), 1}), e2);
            }
        }

        public final void t0(int i, long j) {
            T0(i, 1);
            u0(j);
        }

        public final void u0(long j) {
            try {
                byte[] bArr = this.e;
                int i = this.g;
                int i2 = i + 1;
                this.g = i2;
                bArr[i] = (byte) (((int) j) & 255);
                byte[] bArr2 = this.e;
                int i3 = i2 + 1;
                this.g = i3;
                bArr2[i2] = (byte) (((int) (j >> 8)) & 255);
                byte[] bArr3 = this.e;
                int i4 = i3 + 1;
                this.g = i4;
                bArr3[i3] = (byte) (((int) (j >> 16)) & 255);
                byte[] bArr4 = this.e;
                int i5 = i4 + 1;
                this.g = i5;
                bArr4[i4] = (byte) (((int) (j >> 24)) & 255);
                byte[] bArr5 = this.e;
                int i6 = i5 + 1;
                this.g = i6;
                bArr5[i5] = (byte) (((int) (j >> 32)) & 255);
                byte[] bArr6 = this.e;
                int i7 = i6 + 1;
                this.g = i7;
                bArr6[i6] = (byte) (((int) (j >> 40)) & 255);
                byte[] bArr7 = this.e;
                int i8 = i7 + 1;
                this.g = i8;
                bArr7[i7] = (byte) (((int) (j >> 48)) & 255);
                byte[] bArr8 = this.e;
                this.g = i8 + 1;
                bArr8[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e2) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.f), 1}), e2);
            }
        }
    }

    /* renamed from: hj1$c */
    public static class c extends IOException {
        c(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }

        c(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private hj1() {
    }

    public static int A(int i, bk1 bk1) {
        return U(i) + B(bk1);
    }

    public static int B(bk1 bk1) {
        return C(bk1.b());
    }

    static int C(int i) {
        return W(i) + i;
    }

    public static int D(int i, ok1 ok1) {
        return (U(1) * 2) + V(2, i) + E(3, ok1);
    }

    public static int E(int i, ok1 ok1) {
        return U(i) + G(ok1);
    }

    static int F(int i, ok1 ok1, el1 el1) {
        return U(i) + H(ok1, el1);
    }

    public static int G(ok1 ok1) {
        return C(ok1.g());
    }

    static int H(ok1 ok1, el1 el1) {
        return C(((wi1) ok1).i(el1));
    }

    public static int I(int i, ej1 ej1) {
        return (U(1) * 2) + V(2, i) + g(3, ej1);
    }

    @Deprecated
    public static int J(int i) {
        return W(i);
    }

    public static int K(int i, int i2) {
        return U(i) + L(i2);
    }

    public static int L(int i) {
        return 4;
    }

    public static int M(int i, long j) {
        return U(i) + N(j);
    }

    public static int N(long j) {
        return 8;
    }

    public static int O(int i, int i2) {
        return U(i) + P(i2);
    }

    public static int P(int i) {
        return W(Z(i));
    }

    public static int Q(int i, long j) {
        return U(i) + R(j);
    }

    public static int R(long j) {
        return Y(a0(j));
    }

    public static int S(int i, String str) {
        return U(i) + T(str);
    }

    public static int T(String str) {
        int i;
        try {
            i = ql1.g(str);
        } catch (ql1.d unused) {
            i = str.getBytes(xj1.a).length;
        }
        return C(i);
    }

    public static int U(int i) {
        return W(rl1.c(i, 0));
    }

    public static int V(int i, int i2) {
        return U(i) + W(i2);
    }

    public static int W(int i) {
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

    public static int X(int i, long j) {
        return U(i) + Y(j);
    }

    public static int Y(long j) {
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

    public static int Z(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long a0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int d(int i, boolean z) {
        return U(i) + e(z);
    }

    public static hj1 d0(byte[] bArr) {
        return e0(bArr, 0, bArr.length);
    }

    public static int e(boolean z) {
        return 1;
    }

    public static hj1 e0(byte[] bArr, int i, int i2) {
        return new b(bArr, i, i2);
    }

    public static int f(byte[] bArr) {
        return C(bArr.length);
    }

    public static int g(int i, ej1 ej1) {
        return U(i) + h(ej1);
    }

    public static int h(ej1 ej1) {
        return C(ej1.size());
    }

    public static int i(int i, double d2) {
        return U(i) + j(d2);
    }

    public static int j(double d2) {
        return 8;
    }

    public static int k(int i, int i2) {
        return U(i) + l(i2);
    }

    public static int l(int i) {
        return w(i);
    }

    public static int m(int i, int i2) {
        return U(i) + n(i2);
    }

    public static int n(int i) {
        return 4;
    }

    public static int o(int i, long j) {
        return U(i) + p(j);
    }

    public static int p(long j) {
        return 8;
    }

    public static int q(int i, float f) {
        return U(i) + r(f);
    }

    public static int r(float f) {
        return 4;
    }

    @Deprecated
    static int s(int i, ok1 ok1, el1 el1) {
        return (U(i) * 2) + u(ok1, el1);
    }

    @Deprecated
    public static int t(ok1 ok1) {
        return ok1.g();
    }

    @Deprecated
    static int u(ok1 ok1, el1 el1) {
        return ((wi1) ok1).i(el1);
    }

    public static int v(int i, int i2) {
        return U(i) + w(i2);
    }

    public static int w(int i) {
        if (i >= 0) {
            return W(i);
        }
        return 10;
    }

    public static int x(int i, long j) {
        return U(i) + y(j);
    }

    public static int y(long j) {
        return Y(j);
    }

    public static int z(int i, bk1 bk1) {
        return (U(1) * 2) + V(2, i) + A(3, bk1);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    public final void A0(ok1 ok1, el1 el1) {
        el1.d(ok1, this.a);
    }

    public abstract void B0(int i, int i2);

    public abstract void C0(int i);

    public final void D0(int i, long j) {
        W0(i, j);
    }

    public final void E0(long j) {
        X0(j);
    }

    /* access modifiers changed from: package-private */
    public abstract void F0(int i, ok1 ok1, el1 el1);

    public abstract void G0(ok1 ok1);

    public abstract void H0(int i, ok1 ok1);

    public abstract void I0(int i, ej1 ej1);

    public final void J0(int i, int i2) {
        r0(i, i2);
    }

    public final void K0(int i) {
        s0(i);
    }

    public final void L0(int i, long j) {
        t0(i, j);
    }

    public final void M0(long j) {
        u0(j);
    }

    public final void N0(int i, int i2) {
        U0(i, Z(i2));
    }

    public final void O0(int i) {
        V0(Z(i));
    }

    public final void P0(int i, long j) {
        W0(i, a0(j));
    }

    public final void Q0(long j) {
        X0(a0(j));
    }

    public abstract void R0(int i, String str);

    public abstract void S0(String str);

    public abstract void T0(int i, int i2);

    public abstract void U0(int i, int i2);

    public abstract void V0(int i);

    public abstract void W0(int i, long j);

    public abstract void X0(long j);

    /* access modifiers changed from: package-private */
    public final void b0(String str, ql1.d dVar) {
        c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", dVar);
        byte[] bytes = str.getBytes(xj1.a);
        try {
            V0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new c(e);
        } catch (c e2) {
            throw e2;
        }
    }

    public final void c() {
        if (f0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c0() {
        return this.b;
    }

    public abstract int f0();

    public abstract void g0(byte b2);

    public abstract void h0(int i, boolean z);

    public final void i0(boolean z) {
        g0(z ? (byte) 1 : 0);
    }

    public final void j0(byte[] bArr) {
        k0(bArr, 0, bArr.length);
    }

    /* access modifiers changed from: package-private */
    public abstract void k0(byte[] bArr, int i, int i2);

    public abstract void l0(int i, ej1 ej1);

    public abstract void m0(ej1 ej1);

    public final void n0(int i, double d2) {
        t0(i, Double.doubleToRawLongBits(d2));
    }

    public final void o0(double d2) {
        u0(Double.doubleToRawLongBits(d2));
    }

    public final void p0(int i, int i2) {
        B0(i, i2);
    }

    public final void q0(int i) {
        C0(i);
    }

    public abstract void r0(int i, int i2);

    public abstract void s0(int i);

    public abstract void t0(int i, long j);

    public abstract void u0(long j);

    public final void v0(int i, float f) {
        r0(i, Float.floatToRawIntBits(f));
    }

    public final void w0(float f) {
        s0(Float.floatToRawIntBits(f));
    }

    @Deprecated
    public final void x0(int i, ok1 ok1) {
        T0(i, 3);
        z0(ok1);
        T0(i, 4);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    public final void y0(int i, ok1 ok1, el1 el1) {
        T0(i, 3);
        A0(ok1, el1);
        T0(i, 4);
    }

    @Deprecated
    public final void z0(ok1 ok1) {
        ok1.e(this);
    }
}
