package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: yd2  reason: default package */
final class yd2 implements pd2 {
    public final nd2 e = new nd2();
    public final de2 f;
    boolean g;

    /* renamed from: yd2$a */
    class a extends InputStream {
        a() {
        }

        public int available() {
            yd2 yd2 = yd2.this;
            if (!yd2.g) {
                return (int) Math.min(yd2.e.f, 2147483647L);
            }
            throw new IOException("closed");
        }

        public void close() {
            yd2.this.close();
        }

        public int read() {
            yd2 yd2 = yd2.this;
            if (!yd2.g) {
                nd2 nd2 = yd2.e;
                if (nd2.f == 0 && yd2.f.y0(nd2, 8192) == -1) {
                    return -1;
                }
                return yd2.this.e.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public int read(byte[] bArr, int i, int i2) {
            if (!yd2.this.g) {
                fe2.b((long) bArr.length, (long) i, (long) i2);
                yd2 yd2 = yd2.this;
                nd2 nd2 = yd2.e;
                if (nd2.f == 0 && yd2.f.y0(nd2, 8192) == -1) {
                    return -1;
                }
                return yd2.this.e.P(bArr, i, i2);
            }
            throw new IOException("closed");
        }

        public String toString() {
            return yd2.this + ".inputStream()";
        }
    }

    yd2(de2 de2) {
        if (de2 != null) {
            this.f = de2;
            return;
        }
        throw new NullPointerException("source == null");
    }

    public long A0(ce2 ce2) {
        nd2 nd2;
        if (ce2 != null) {
            long j = 0;
            while (true) {
                int i = (this.f.y0(this.e, 8192) > -1 ? 1 : (this.f.y0(this.e, 8192) == -1 ? 0 : -1));
                nd2 = this.e;
                if (i == 0) {
                    break;
                }
                long t = nd2.t();
                if (t > 0) {
                    j += t;
                    ce2.X(this.e, t);
                }
            }
            if (nd2.k0() <= 0) {
                return j;
            }
            long k0 = j + this.e.k0();
            nd2 nd22 = this.e;
            ce2.X(nd22, nd22.k0());
            return k0;
        }
        throw new IllegalArgumentException("sink == null");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long H() {
        /*
            r6 = this;
            r0 = 1
            r6.H0(r0)
            r0 = 0
            r1 = 0
        L_0x0007:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.f0(r3)
            if (r3 == 0) goto L_0x0040
            nd2 r3 = r6.e
            long r4 = (long) r1
            byte r3 = r3.C(r4)
            r4 = 48
            if (r3 < r4) goto L_0x001f
            r4 = 57
            if (r3 <= r4) goto L_0x0026
        L_0x001f:
            if (r1 != 0) goto L_0x0028
            r4 = 45
            if (r3 == r4) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r1 = r2
            goto L_0x0007
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            goto L_0x0040
        L_0x002b:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9] or '-' character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L_0x0040:
            nd2 r0 = r6.e
            long r0 = r0.H()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yd2.H():long");
    }

    public void H0(long j) {
        if (!f0(j)) {
            throw new EOFException();
        }
    }

    public String I(long j) {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            long a2 = a((byte) 10, 0, j2);
            if (a2 != -1) {
                return this.e.h0(a2);
            }
            if (j2 < Long.MAX_VALUE && f0(j2) && this.e.C(j2 - 1) == 13 && f0(1 + j2) && this.e.C(j2) == 10) {
                return this.e.h0(j2);
            }
            nd2 nd2 = new nd2();
            nd2 nd22 = this.e;
            nd22.A(nd2, 0, Math.min(32, nd22.k0()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.e.k0(), j) + " content=" + nd2.V().r() + 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + j);
    }

    public long J0(byte b) {
        return a(b, 0, Long.MAX_VALUE);
    }

    public long K0() {
        H0(1);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!f0((long) i2)) {
                break;
            }
            byte C = this.e.C((long) i);
            if ((C >= 48 && C <= 57) || ((C >= 97 && C <= 102) || (C >= 65 && C <= 70))) {
                i = i2;
            } else if (i == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[]{Byte.valueOf(C)}));
            }
        }
        return this.e.K0();
    }

    public boolean S(long j, qd2 qd2) {
        return b(j, qd2, 0, qd2.A());
    }

    public String T(Charset charset) {
        if (charset != null) {
            this.e.a0(this.f);
            return this.e.T(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public long a(byte b, long j, long j2) {
        if (this.g) {
            throw new IllegalStateException("closed");
        } else if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
        } else {
            while (j < j2) {
                long G = this.e.G(b, j, j2);
                if (G == -1) {
                    nd2 nd2 = this.e;
                    long j3 = nd2.f;
                    if (j3 >= j2 || this.f.y0(nd2, 8192) == -1) {
                        break;
                    }
                    j = Math.max(j, j3);
                } else {
                    return G;
                }
            }
            return -1;
        }
    }

    public boolean b(long j, qd2 qd2, int i, int i2) {
        if (this.g) {
            throw new IllegalStateException("closed");
        } else if (j < 0 || i < 0 || i2 < 0 || qd2.A() - i < i2) {
            return false;
        } else {
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = ((long) i3) + j;
                if (!f0(1 + j2) || this.e.C(j2) != qd2.q(i + i3)) {
                    return false;
                }
            }
            return true;
        }
    }

    public ee2 c() {
        return this.f.c();
    }

    public void close() {
        if (!this.g) {
            this.g = true;
            this.f.close();
            this.e.b();
        }
    }

    public nd2 d() {
        return this.e;
    }

    public void e(long j) {
        if (!this.g) {
            while (j > 0) {
                nd2 nd2 = this.e;
                if (nd2.f == 0 && this.f.y0(nd2, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.e.k0());
                this.e.e(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public InputStream f() {
        return new a();
    }

    public boolean f0(long j) {
        nd2 nd2;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (!this.g) {
            do {
                nd2 = this.e;
                if (nd2.f >= j) {
                    return true;
                }
            } while (this.f.y0(nd2, 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public boolean isOpen() {
        return !this.g;
    }

    public String l0() {
        return I(Long.MAX_VALUE);
    }

    public qd2 n(long j) {
        H0(j);
        return this.e.n(j);
    }

    public int n0() {
        H0(4);
        return this.e.n0();
    }

    public byte[] o0(long j) {
        H0(j);
        return this.e.o0(j);
    }

    public int read(ByteBuffer byteBuffer) {
        nd2 nd2 = this.e;
        if (nd2.f == 0 && this.f.y0(nd2, 8192) == -1) {
            return -1;
        }
        return this.e.read(byteBuffer);
    }

    public byte readByte() {
        H0(1);
        return this.e.readByte();
    }

    public void readFully(byte[] bArr) {
        try {
            H0((long) bArr.length);
            this.e.readFully(bArr);
        } catch (EOFException e2) {
            int i = 0;
            while (true) {
                nd2 nd2 = this.e;
                long j = nd2.f;
                if (j > 0) {
                    int P = nd2.P(bArr, i, (int) j);
                    if (P != -1) {
                        i += P;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e2;
                }
            }
        }
    }

    public int readInt() {
        H0(4);
        return this.e.readInt();
    }

    public short readShort() {
        H0(2);
        return this.e.readShort();
    }

    public String toString() {
        return "buffer(" + this.f + ")";
    }

    public boolean v() {
        if (!this.g) {
            return this.e.v() && this.f.y0(this.e, 8192) == -1;
        }
        throw new IllegalStateException("closed");
    }

    public short w0() {
        H0(2);
        return this.e.w0();
    }

    public long y0(nd2 nd2, long j) {
        if (nd2 == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (!this.g) {
            nd2 nd22 = this.e;
            if (nd22.f == 0 && this.f.y0(nd22, 8192) == -1) {
                return -1;
            }
            return this.e.y0(nd2, Math.min(j, this.e.f));
        } else {
            throw new IllegalStateException("closed");
        }
    }
}
