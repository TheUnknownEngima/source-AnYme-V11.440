package defpackage;

import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: kf1  reason: default package */
public final class kf1 implements Flushable {
    private final byte[] e;
    private final int f;
    private int g = 0;
    private final OutputStream h;

    /* renamed from: kf1$a */
    static class a extends IOException {
        a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private kf1(OutputStream outputStream, byte[] bArr) {
        this.h = outputStream;
        this.e = bArr;
        this.f = bArr.length;
    }

    private void A() {
        OutputStream outputStream = this.h;
        if (outputStream != null) {
            outputStream.write(this.e, 0, this.g);
            this.g = 0;
            return;
        }
        throw new a();
    }

    public static int a(int i, boolean z) {
        return r(i) + b(z);
    }

    public static int b(boolean z) {
        return 1;
    }

    public static int e(int i, if1 if1) {
        return r(i) + f(if1);
    }

    public static int f(if1 if1) {
        return l(if1.f()) + if1.f();
    }

    public static int g(int i, int i2) {
        return r(i) + h(i2);
    }

    public static int h(int i) {
        return k(i);
    }

    public static int i(int i, float f2) {
        return r(i) + j(f2);
    }

    public static int j(float f2) {
        return 4;
    }

    public static int k(int i) {
        if (i >= 0) {
            return l(i);
        }
        return 10;
    }

    public static int l(int i) {
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

    public static int m(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int n(int i, int i2) {
        return r(i) + p(i2);
    }

    public static int p(int i) {
        return l(x(i));
    }

    public static int r(int i) {
        return l(mf1.a(i, 0));
    }

    public static int s(int i, int i2) {
        return r(i) + t(i2);
    }

    public static int t(int i) {
        return l(i);
    }

    public static int u(int i, long j) {
        return r(i) + v(j);
    }

    public static int v(long j) {
        return m(j);
    }

    public static int x(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static kf1 y(OutputStream outputStream) {
        return z(outputStream, 4096);
    }

    public static kf1 z(OutputStream outputStream, int i) {
        return new kf1(outputStream, new byte[i]);
    }

    public void B(int i, boolean z) {
        Z(i, 0);
        C(z);
    }

    public void C(boolean z) {
        M(z ? 1 : 0);
    }

    public void E(int i, if1 if1) {
        Z(i, 2);
        F(if1);
    }

    public void F(if1 if1) {
        T(if1.f());
        N(if1);
    }

    public void G(int i, int i2) {
        Z(i, 0);
        H(i2);
    }

    public void H(int i) {
        K(i);
    }

    public void I(int i, float f2) {
        Z(i, 5);
        J(f2);
    }

    public void J(float f2) {
        S(Float.floatToRawIntBits(f2));
    }

    public void K(int i) {
        if (i >= 0) {
            T(i);
        } else {
            U((long) i);
        }
    }

    public void L(byte b) {
        if (this.g == this.f) {
            A();
        }
        byte[] bArr = this.e;
        int i = this.g;
        this.g = i + 1;
        bArr[i] = b;
    }

    public void M(int i) {
        L((byte) i);
    }

    public void N(if1 if1) {
        P(if1, 0, if1.f());
    }

    public void P(if1 if1, int i, int i2) {
        int i3 = this.f;
        int i4 = this.g;
        if (i3 - i4 >= i2) {
            if1.d(this.e, i, i4, i2);
            this.g += i2;
            return;
        }
        int i5 = i3 - i4;
        if1.d(this.e, i, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.g = this.f;
        A();
        if (i7 <= this.f) {
            if1.d(this.e, i6, 0, i7);
            this.g = i7;
            return;
        }
        InputStream e2 = if1.e();
        long j = (long) i6;
        if (j == e2.skip(j)) {
            while (i7 > 0) {
                int min = Math.min(i7, this.f);
                int read = e2.read(this.e, 0, min);
                if (read == min) {
                    this.h.write(this.e, 0, read);
                    i7 -= read;
                } else {
                    throw new IllegalStateException("Read failed.");
                }
            }
            return;
        }
        throw new IllegalStateException("Skip failed.");
    }

    public void Q(byte[] bArr) {
        R(bArr, 0, bArr.length);
    }

    public void R(byte[] bArr, int i, int i2) {
        int i3 = this.f;
        int i4 = this.g;
        if (i3 - i4 >= i2) {
            System.arraycopy(bArr, i, this.e, i4, i2);
            this.g += i2;
            return;
        }
        int i5 = i3 - i4;
        System.arraycopy(bArr, i, this.e, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.g = this.f;
        A();
        if (i7 <= this.f) {
            System.arraycopy(bArr, i6, this.e, 0, i7);
            this.g = i7;
            return;
        }
        this.h.write(bArr, i6, i7);
    }

    public void S(int i) {
        M(i & 255);
        M((i >> 8) & 255);
        M((i >> 16) & 255);
        M((i >> 24) & 255);
    }

    public void T(int i) {
        while ((i & -128) != 0) {
            M((i & 127) | 128);
            i >>>= 7;
        }
        M(i);
    }

    public void U(long j) {
        while ((-128 & j) != 0) {
            M((((int) j) & 127) | 128);
            j >>>= 7;
        }
        M((int) j);
    }

    public void V(int i, int i2) {
        Z(i, 0);
        Y(i2);
    }

    public void Y(int i) {
        T(x(i));
    }

    public void Z(int i, int i2) {
        T(mf1.a(i, i2));
    }

    public void c0(int i, int i2) {
        Z(i, 0);
        d0(i2);
    }

    public void d0(int i) {
        T(i);
    }

    public void e0(int i, long j) {
        Z(i, 0);
        f0(j);
    }

    public void f0(long j) {
        U(j);
    }

    public void flush() {
        if (this.h != null) {
            A();
        }
    }
}
