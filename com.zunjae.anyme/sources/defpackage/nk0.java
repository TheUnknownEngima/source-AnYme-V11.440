package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: nk0  reason: default package */
public abstract class nk0 extends xj0 {
    private static final Logger b = Logger.getLogger(nk0.class.getName());
    /* access modifiers changed from: private */
    public static final boolean c = bo0.y();
    qk0 a;

    /* renamed from: nk0$a */
    static class a extends nk0 {
        private final byte[] d;
        private final int e;
        private int f;

        a(byte[] bArr, int i, int i2) {
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
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(i2)}), e2);
            }
        }

        public final void L(int i, bk0 bk0) {
            b(1, 3);
            j0(2, i);
            k(3, bk0);
            b(1, 4);
        }

        public final void M(int i, boolean z) {
            b(i, 0);
            V(z ? (byte) 1 : 0);
        }

        public final void N(pm0 pm0) {
            q(pm0.e());
            pm0.d(this);
        }

        public final void O(byte[] bArr, int i, int i2) {
            q(i2);
            G0(bArr, 0, i2);
        }

        public final void V(byte b) {
            try {
                byte[] bArr = this.d;
                int i = this.f;
                this.f = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e2) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.e), 1}), e2);
            }
        }

        public final void X(int i, long j) {
            b(i, 1);
            v0(j);
        }

        public final void Y(int i, String str) {
            b(i, 2);
            t(str);
        }

        public final void a(byte[] bArr, int i, int i2) {
            G0(bArr, i, i2);
        }

        public final void b(int i, int i2) {
            q((i << 3) | i2);
        }

        public final void h0(int i, int i2) {
            b(i, 0);
            p(i2);
        }

        public final void j(int i, long j) {
            b(i, 0);
            r0(j);
        }

        public final void j0(int i, int i2) {
            b(i, 0);
            q(i2);
        }

        public final void k(int i, bk0 bk0) {
            b(i, 2);
            n(bk0);
        }

        public final void l(int i, pm0 pm0) {
            b(1, 3);
            j0(2, i);
            b(3, 2);
            N(pm0);
            b(1, 4);
        }

        public final int l0() {
            return this.e - this.f;
        }

        /* access modifiers changed from: package-private */
        public final void m(int i, pm0 pm0, dn0 dn0) {
            b(i, 2);
            sj0 sj0 = (sj0) pm0;
            int i2 = sj0.i();
            if (i2 == -1) {
                i2 = dn0.h(sj0);
                sj0.h(i2);
            }
            q(i2);
            dn0.f(pm0, this.a);
        }

        public final void m0(int i, int i2) {
            b(i, 5);
            s(i2);
        }

        public final void n(bk0 bk0) {
            q(bk0.size());
            bk0.c(this);
        }

        public final void p(int i) {
            if (i >= 0) {
                q(i);
            } else {
                r0((long) i);
            }
        }

        public final void q(int i) {
            if (!nk0.c || yj0.b() || l0() < 5) {
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
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.e), 1}), e2);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.d;
                int i4 = this.f;
                this.f = i4 + 1;
                bo0.i(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.d;
                int i5 = this.f;
                this.f = i5 + 1;
                bo0.i(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.d;
                    int i7 = this.f;
                    this.f = i7 + 1;
                    bo0.i(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.d;
                int i8 = this.f;
                this.f = i8 + 1;
                bo0.i(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.d;
                    int i10 = this.f;
                    this.f = i10 + 1;
                    bo0.i(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.d;
                int i11 = this.f;
                this.f = i11 + 1;
                bo0.i(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.d;
                    int i13 = this.f;
                    this.f = i13 + 1;
                    bo0.i(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.d;
                int i14 = this.f;
                this.f = i14 + 1;
                bo0.i(bArr10, (long) i14, (byte) (i12 | 128));
                byte[] bArr11 = this.d;
                int i15 = this.f;
                this.f = i15 + 1;
                bo0.i(bArr11, (long) i15, (byte) (i12 >>> 7));
            }
        }

        public final void r0(long j) {
            if (!nk0.c || l0() < 10) {
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
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.e), 1}), e2);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.d;
                    int i3 = this.f;
                    this.f = i3 + 1;
                    bo0.i(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.d;
                int i4 = this.f;
                this.f = i4 + 1;
                bo0.i(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        public final void s(int i) {
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
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.e), 1}), e2);
            }
        }

        public final void t(String str) {
            int i = this.f;
            try {
                int x = nk0.x(str.length() * 3);
                int x2 = nk0.x(str.length());
                if (x2 == x) {
                    int i2 = i + x2;
                    this.f = i2;
                    int b = fo0.b(str, this.d, i2, l0());
                    this.f = i;
                    q((b - i) - x2);
                    this.f = b;
                    return;
                }
                q(fo0.a(str));
                this.f = fo0.b(str, this.d, this.f, l0());
            } catch (jo0 e2) {
                this.f = i;
                o(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new b(e3);
            }
        }

        public final void v0(long j) {
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
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.e), 1}), e2);
            }
        }
    }

    /* renamed from: nk0$b */
    public static class b extends IOException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        b(java.lang.String r3, java.lang.Throwable r4) {
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.nk0.b.<init>(java.lang.String, java.lang.Throwable):void");
        }

        b(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private nk0() {
    }

    public static int A(int i) {
        return 4;
    }

    public static int A0(int i, int i2) {
        return x(i << 3) + w(i2);
    }

    public static int B(int i) {
        return w(i);
    }

    public static int B0(long j) {
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

    public static int C(float f) {
        return 4;
    }

    public static int C0(long j) {
        return B0(F0(j));
    }

    public static int D(int i, double d) {
        return x(i << 3) + 8;
    }

    public static int D0(long j) {
        return 8;
    }

    public static int E(int i, float f) {
        return x(i << 3) + 4;
    }

    public static int E0(long j) {
        return 8;
    }

    public static int F(int i, tl0 tl0) {
        return (x(8) << 1) + q0(2, i) + c(3, tl0);
    }

    private static long F0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int G(int i, pm0 pm0) {
        return (x(8) << 1) + q0(2, i) + x(24) + U(pm0);
    }

    static int H(int i, pm0 pm0, dn0 dn0) {
        return x(i << 3) + e(pm0, dn0);
    }

    public static int I(bk0 bk0) {
        int size = bk0.size();
        return x(size) + size;
    }

    public static int J(byte[] bArr) {
        int length = bArr.length;
        return x(length) + length;
    }

    private static int P(int i) {
        return (i >> 31) ^ (i << 1);
    }

    @Deprecated
    public static int Q(int i) {
        return x(i);
    }

    public static int R(int i, bk0 bk0) {
        int x = x(i << 3);
        int size = bk0.size();
        return x + x(size) + size;
    }

    @Deprecated
    static int S(int i, pm0 pm0, dn0 dn0) {
        int x = x(i << 3) << 1;
        sj0 sj0 = (sj0) pm0;
        int i2 = sj0.i();
        if (i2 == -1) {
            i2 = dn0.h(sj0);
            sj0.h(i2);
        }
        return x + i2;
    }

    public static int T(int i, boolean z) {
        return x(i << 3) + 1;
    }

    public static int U(pm0 pm0) {
        int e = pm0.e();
        return x(e) + e;
    }

    public static int Z(double d) {
        return 8;
    }

    public static int a0(int i, long j) {
        return x(i << 3) + B0(j);
    }

    public static int b0(int i, bk0 bk0) {
        return (x(8) << 1) + q0(2, i) + R(3, bk0);
    }

    public static int c(int i, tl0 tl0) {
        int x = x(i << 3);
        int d = tl0.d();
        return x + x(d) + d;
    }

    public static int c0(int i, String str) {
        return x(i << 3) + v(str);
    }

    public static int d(tl0 tl0) {
        int d = tl0.d();
        return x(d) + d;
    }

    @Deprecated
    public static int d0(pm0 pm0) {
        return pm0.e();
    }

    static int e(pm0 pm0, dn0 dn0) {
        sj0 sj0 = (sj0) pm0;
        int i = sj0.i();
        if (i == -1) {
            i = dn0.h(sj0);
            sj0.h(i);
        }
        return x(i) + i;
    }

    public static int e0(int i, long j) {
        return x(i << 3) + B0(j);
    }

    public static nk0 f(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int f0(int i, long j) {
        return x(i << 3) + B0(F0(j));
    }

    public static int g0(int i, long j) {
        return x(i << 3) + 8;
    }

    public static int i0(int i, long j) {
        return x(i << 3) + 8;
    }

    public static int p0(int i, int i2) {
        return x(i << 3) + w(i2);
    }

    public static int q0(int i, int i2) {
        return x(i << 3) + x(i2);
    }

    public static int s0(int i, int i2) {
        return x(i << 3) + x(P(i2));
    }

    public static int u(int i) {
        return x(i << 3);
    }

    public static int u0(int i, int i2) {
        return x(i << 3) + 4;
    }

    public static int v(String str) {
        int i;
        try {
            i = fo0.a(str);
        } catch (jo0 unused) {
            i = str.getBytes(gl0.a).length;
        }
        return x(i) + i;
    }

    public static int w(int i) {
        if (i >= 0) {
            return x(i);
        }
        return 10;
    }

    public static int x(int i) {
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

    public static int x0(int i, int i2) {
        return x(i << 3) + 4;
    }

    public static int y(int i) {
        return x(P(i));
    }

    public static int y0(long j) {
        return B0(j);
    }

    public static int z(int i) {
        return 4;
    }

    public static int z0(boolean z) {
        return 1;
    }

    public final void K(int i, long j) {
        j(i, F0(j));
    }

    public abstract void L(int i, bk0 bk0);

    public abstract void M(int i, boolean z);

    public abstract void N(pm0 pm0);

    /* access modifiers changed from: package-private */
    public abstract void O(byte[] bArr, int i, int i2);

    public abstract void V(byte b2);

    public final void W(double d) {
        v0(Double.doubleToRawLongBits(d));
    }

    public abstract void X(int i, long j);

    public abstract void Y(int i, String str);

    public abstract void b(int i, int i2);

    public final void g(float f) {
        s(Float.floatToRawIntBits(f));
    }

    public final void h(int i, double d) {
        X(i, Double.doubleToRawLongBits(d));
    }

    public abstract void h0(int i, int i2);

    public final void i(int i, float f) {
        m0(i, Float.floatToRawIntBits(f));
    }

    public abstract void j(int i, long j);

    public abstract void j0(int i, int i2);

    public abstract void k(int i, bk0 bk0);

    public final void k0(int i, int i2) {
        j0(i, P(i2));
    }

    public abstract void l(int i, pm0 pm0);

    public abstract int l0();

    /* access modifiers changed from: package-private */
    public abstract void m(int i, pm0 pm0, dn0 dn0);

    public abstract void m0(int i, int i2);

    public abstract void n(bk0 bk0);

    public final void n0() {
        if (l0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    public final void o(String str, jo0 jo0) {
        b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", jo0);
        byte[] bytes = str.getBytes(gl0.a);
        try {
            q(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new b(e);
        } catch (b e2) {
            throw e2;
        }
    }

    public abstract void p(int i);

    public abstract void q(int i);

    public final void r(int i) {
        q(P(i));
    }

    public abstract void r0(long j);

    public abstract void s(int i);

    public abstract void t(String str);

    public final void t0(long j) {
        r0(F0(j));
    }

    public abstract void v0(long j);

    public final void w0(boolean z) {
        V(z ? (byte) 1 : 0);
    }
}
