package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

/* renamed from: nd2  reason: default package */
public final class nd2 implements pd2, od2, Cloneable, ByteChannel {
    private static final byte[] g = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    @Nullable
    zd2 e;
    long f;

    /* renamed from: nd2$a */
    class a extends OutputStream {
        a() {
        }

        public void close() {
        }

        public void flush() {
        }

        public String toString() {
            return nd2.this + ".outputStream()";
        }

        public void write(int i) {
            nd2.this.F0((byte) i);
        }

        public void write(byte[] bArr, int i, int i2) {
            nd2.this.D0(bArr, i, i2);
        }
    }

    /* renamed from: nd2$b */
    class b extends InputStream {
        b() {
        }

        public int available() {
            return (int) Math.min(nd2.this.f, 2147483647L);
        }

        public void close() {
        }

        public int read() {
            nd2 nd2 = nd2.this;
            if (nd2.f > 0) {
                return nd2.readByte() & 255;
            }
            return -1;
        }

        public int read(byte[] bArr, int i, int i2) {
            return nd2.this.P(bArr, i, i2);
        }

        public String toString() {
            return nd2.this + ".inputStream()";
        }
    }

    public final nd2 A(nd2 nd2, long j, long j2) {
        if (nd2 != null) {
            fe2.b(this.f, j, j2);
            if (j2 == 0) {
                return this;
            }
            nd2.f += j2;
            zd2 zd2 = this.e;
            while (true) {
                int i = zd2.c;
                int i2 = zd2.b;
                if (j < ((long) (i - i2))) {
                    break;
                }
                j -= (long) (i - i2);
                zd2 = zd2.f;
            }
            while (j2 > 0) {
                zd2 d = zd2.d();
                int i3 = (int) (((long) d.b) + j);
                d.b = i3;
                d.c = Math.min(i3 + ((int) j2), d.c);
                zd2 zd22 = nd2.e;
                if (zd22 == null) {
                    d.g = d;
                    d.f = d;
                    nd2.e = d;
                } else {
                    zd22.g.c(d);
                }
                j2 -= (long) (d.c - d.b);
                zd2 = zd2.f;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public long A0(ce2 ce2) {
        long j = this.f;
        if (j > 0) {
            ce2.X(this, j);
        }
        return j;
    }

    public nd2 B() {
        return this;
    }

    public final byte C(long j) {
        int i;
        fe2.b(this.f, j, 1);
        long j2 = this.f;
        if (j2 - j > j) {
            zd2 zd2 = this.e;
            while (true) {
                int i2 = zd2.c;
                int i3 = zd2.b;
                long j3 = (long) (i2 - i3);
                if (j < j3) {
                    return zd2.a[i3 + ((int) j)];
                }
                j -= j3;
                zd2 = zd2.f;
            }
        } else {
            long j4 = j - j2;
            zd2 zd22 = this.e;
            do {
                zd22 = zd22.g;
                int i4 = zd22.c;
                i = zd22.b;
                j4 += (long) (i4 - i);
            } while (j4 < 0);
            return zd22.a[i + ((int) j4)];
        }
    }

    public /* bridge */ /* synthetic */ od2 D() {
        B();
        return this;
    }

    public nd2 D0(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            fe2.b((long) bArr.length, (long) i, j);
            int i3 = i2 + i;
            while (i < i3) {
                zd2 u0 = u0(1);
                int min = Math.min(i3 - i, 8192 - u0.c);
                System.arraycopy(bArr, i, u0.a, u0.c, min);
                i += min;
                u0.c += min;
            }
            this.f += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public nd2 F0(int i) {
        zd2 u0 = u0(1);
        byte[] bArr = u0.a;
        int i2 = u0.c;
        u0.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f++;
        return this;
    }

    public long G(byte b2, long j, long j2) {
        zd2 zd2;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(this.f), Long.valueOf(j), Long.valueOf(j2)}));
        }
        long j4 = this.f;
        if (j2 <= j4) {
            j4 = j2;
        }
        if (j == j4 || (zd2 = this.e) == null) {
            return -1;
        }
        long j5 = this.f;
        if (j5 - j < j) {
            while (j5 > j) {
                zd2 = zd2.g;
                j5 -= (long) (zd2.c - zd2.b);
            }
        } else {
            while (true) {
                long j6 = ((long) (zd2.c - zd2.b)) + j3;
                if (j6 >= j) {
                    break;
                }
                zd2 = zd2.f;
                j3 = j6;
            }
            j5 = j3;
        }
        long j7 = j;
        while (j5 < j4) {
            byte[] bArr = zd2.a;
            int min = (int) Math.min((long) zd2.c, (((long) zd2.b) + j4) - j5);
            for (int i = (int) ((((long) zd2.b) + j7) - j5); i < min; i++) {
                if (bArr[i] == b2) {
                    return ((long) (i - zd2.b)) + j5;
                }
            }
            byte b3 = b2;
            j5 += (long) (zd2.c - zd2.b);
            zd2 = zd2.f;
            j7 = j5;
        }
        return -1;
    }

    public nd2 G0(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            F0(48);
            return this;
        }
        boolean z = false;
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                P0("-9223372036854775808");
                return this;
            }
            z = true;
        }
        if (j >= 100000000) {
            i2 = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i2 = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i2 = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i2 = 2;
        }
        if (z) {
            i2++;
        }
        zd2 u0 = u0(i2);
        byte[] bArr = u0.a;
        int i3 = u0.c + i2;
        while (j != 0) {
            i3--;
            bArr[i3] = g[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i3 - 1] = 45;
        }
        u0.c += i2;
        this.f += (long) i2;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bd, code lost:
        if (r8 == false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return -r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long H() {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.f
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00c2
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            r5 = -7
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x0014:
            zd2 r10 = r0.e
            byte[] r11 = r10.a
            int r12 = r10.b
            int r13 = r10.c
        L_0x001c:
            if (r12 >= r13) goto L_0x009b
            byte r15 = r11[r12]
            r14 = 48
            if (r15 < r14) goto L_0x0068
            r14 = 57
            if (r15 > r14) goto L_0x0068
            int r14 = 48 - r15
            int r16 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r16 < 0) goto L_0x003d
            if (r16 != 0) goto L_0x0036
            long r1 = (long) r14
            int r16 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r16 >= 0) goto L_0x0036
            goto L_0x003d
        L_0x0036:
            r1 = 10
            long r3 = r3 * r1
            long r1 = (long) r14
            long r3 = r3 + r1
            goto L_0x0072
        L_0x003d:
            nd2 r1 = new nd2
            r1.<init>()
            r1.G0(r3)
            r1.F0(r15)
            if (r8 != 0) goto L_0x004d
            r1.readByte()
        L_0x004d:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Number too large: "
            r3.append(r4)
            java.lang.String r1 = r1.c0()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0068:
            r1 = 45
            if (r15 != r1) goto L_0x007c
            if (r7 != 0) goto L_0x007c
            r1 = 1
            long r5 = r5 - r1
            r8 = 1
        L_0x0072:
            int r12 = r12 + 1
            int r7 = r7 + 1
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            goto L_0x001c
        L_0x007c:
            if (r7 == 0) goto L_0x0080
            r9 = 1
            goto L_0x009b
        L_0x0080:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected leading [0-9] or '-' character but was 0x"
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r15)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x009b:
            if (r12 != r13) goto L_0x00a7
            zd2 r1 = r10.b()
            r0.e = r1
            defpackage.ae2.a(r10)
            goto L_0x00a9
        L_0x00a7:
            r10.b = r12
        L_0x00a9:
            if (r9 != 0) goto L_0x00b7
            zd2 r1 = r0.e
            if (r1 != 0) goto L_0x00b0
            goto L_0x00b7
        L_0x00b0:
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            goto L_0x0014
        L_0x00b7:
            long r1 = r0.f
            long r5 = (long) r7
            long r1 = r1 - r5
            r0.f = r1
            if (r8 == 0) goto L_0x00c0
            goto L_0x00c1
        L_0x00c0:
            long r3 = -r3
        L_0x00c1:
            return r3
        L_0x00c2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "size == 0"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nd2.H():long");
    }

    public void H0(long j) {
        if (this.f < j) {
            throw new EOFException();
        }
    }

    public String I(long j) {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long G = G((byte) 10, 0, j2);
            if (G != -1) {
                return h0(G);
            }
            if (j2 < k0() && C(j2 - 1) == 13 && C(j2) == 10) {
                return h0(j2);
            }
            nd2 nd2 = new nd2();
            A(nd2, 0, Math.min(32, k0()));
            throw new EOFException("\\n not found: limit=" + Math.min(k0(), j) + " content=" + nd2.V().r() + 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + j);
    }

    public /* bridge */ /* synthetic */ od2 I0(long j) {
        G0(j);
        return this;
    }

    public long J0(byte b2) {
        return G(b2, 0, Long.MAX_VALUE);
    }

    public OutputStream K() {
        return new a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008f, code lost:
        if (r8 != r9) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0091, code lost:
        r15.e = r6.b();
        defpackage.ae2.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009b, code lost:
        r6.b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009d, code lost:
        if (r1 != false) goto L_0x00a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0074 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long K0() {
        /*
            r15 = this;
            long r0 = r15.f
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00aa
            r0 = 0
            r4 = r2
            r1 = 0
        L_0x000b:
            zd2 r6 = r15.e
            byte[] r7 = r6.a
            int r8 = r6.b
            int r9 = r6.c
        L_0x0013:
            if (r8 >= r9) goto L_0x008f
            byte r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L_0x0022
            r11 = 57
            if (r10 > r11) goto L_0x0022
            int r11 = r10 + -48
            goto L_0x003a
        L_0x0022:
            r11 = 97
            if (r10 < r11) goto L_0x002f
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L_0x002f
            int r11 = r10 + -97
        L_0x002c:
            int r11 = r11 + 10
            goto L_0x003a
        L_0x002f:
            r11 = 65
            if (r10 < r11) goto L_0x0070
            r11 = 70
            if (r10 > r11) goto L_0x0070
            int r11 = r10 + -65
            goto L_0x002c
        L_0x003a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x004a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0013
        L_0x004a:
            nd2 r0 = new nd2
            r0.<init>()
            r0.L0(r4)
            r0.F0(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.c0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0070:
            if (r0 == 0) goto L_0x0074
            r1 = 1
            goto L_0x008f
        L_0x0074:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x008f:
            if (r8 != r9) goto L_0x009b
            zd2 r7 = r6.b()
            r15.e = r7
            defpackage.ae2.a(r6)
            goto L_0x009d
        L_0x009b:
            r6.b = r8
        L_0x009d:
            if (r1 != 0) goto L_0x00a3
            zd2 r6 = r15.e
            if (r6 != 0) goto L_0x000b
        L_0x00a3:
            long r1 = r15.f
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.f = r1
            return r4
        L_0x00aa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nd2.K0():long");
    }

    public boolean L(long j, qd2 qd2, int i, int i2) {
        if (j < 0 || i < 0 || i2 < 0 || this.f - j < ((long) i2) || qd2.A() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (C(((long) i3) + j) != qd2.q(i + i3)) {
                return false;
            }
        }
        return true;
    }

    public nd2 L0(long j) {
        if (j == 0) {
            F0(48);
            return this;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        zd2 u0 = u0(numberOfTrailingZeros);
        byte[] bArr = u0.a;
        int i = u0.c;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = g[(int) (15 & j)];
            j >>>= 4;
        }
        u0.c += numberOfTrailingZeros;
        this.f += (long) numberOfTrailingZeros;
        return this;
    }

    public nd2 M0(int i) {
        zd2 u0 = u0(4);
        byte[] bArr = u0.a;
        int i2 = u0.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        u0.c = i5 + 1;
        this.f += 4;
        return this;
    }

    public nd2 N0(int i) {
        zd2 u0 = u0(2);
        byte[] bArr = u0.a;
        int i2 = u0.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        u0.c = i3 + 1;
        this.f += 2;
        return this;
    }

    public /* bridge */ /* synthetic */ od2 O(String str) {
        P0(str);
        return this;
    }

    public nd2 O0(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        } else if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        } else if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (charset.equals(fe2.a)) {
            Q0(str, i, i2);
            return this;
        } else {
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            D0(bytes, 0, bytes.length);
            return this;
        }
    }

    public int P(byte[] bArr, int i, int i2) {
        fe2.b((long) bArr.length, (long) i, (long) i2);
        zd2 zd2 = this.e;
        if (zd2 == null) {
            return -1;
        }
        int min = Math.min(i2, zd2.c - zd2.b);
        System.arraycopy(zd2.a, zd2.b, bArr, i, min);
        int i3 = zd2.b + min;
        zd2.b = i3;
        this.f -= (long) min;
        if (i3 == zd2.c) {
            this.e = zd2.b();
            ae2.a(zd2);
        }
        return min;
    }

    public nd2 P0(String str) {
        Q0(str, 0, str.length());
        return this;
    }

    public nd2 Q0(String str, int i, int i2) {
        int i3;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    zd2 u0 = u0(1);
                    byte[] bArr = u0.a;
                    int i4 = u0.c - i;
                    int min = Math.min(i2, 8192 - i4);
                    int i5 = i + 1;
                    bArr[i + i4] = (byte) charAt;
                    while (i5 < min) {
                        char charAt2 = str.charAt(i5);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i5 + i4] = (byte) charAt2;
                        i5++;
                    }
                    int i6 = u0.c;
                    int i7 = (i4 + i5) - i6;
                    u0.c = i6 + i7;
                    this.f += (long) i7;
                    i = i5;
                } else {
                    if (charAt < 2048) {
                        i3 = (charAt >> 6) | 192;
                    } else if (charAt < 55296 || charAt > 57343) {
                        F0((charAt >> 12) | 224);
                        i3 = ((charAt >> 6) & 63) | 128;
                    } else {
                        int i8 = i + 1;
                        char charAt3 = i8 < i2 ? str.charAt(i8) : 0;
                        if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                            F0(63);
                            i = i8;
                        } else {
                            int i9 = (((charAt & 10239) << 10) | (9215 & charAt3)) + 0;
                            F0((i9 >> 18) | 240);
                            F0(((i9 >> 12) & 63) | 128);
                            F0(((i9 >> 6) & 63) | 128);
                            F0((i9 & 63) | 128);
                            i += 2;
                        }
                    }
                    F0(i3);
                    F0((charAt & '?') | 128);
                    i++;
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
    }

    public nd2 R0(int i) {
        int i2;
        int i3;
        if (i >= 128) {
            if (i < 2048) {
                i3 = (i >> 6) | 192;
            } else {
                if (i < 65536) {
                    if (i < 55296 || i > 57343) {
                        i2 = (i >> 12) | 224;
                    } else {
                        F0(63);
                        return this;
                    }
                } else if (i <= 1114111) {
                    F0((i >> 18) | 240);
                    i2 = ((i >> 12) & 63) | 128;
                } else {
                    throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
                }
                F0(i2);
                i3 = ((i >> 6) & 63) | 128;
            }
            F0(i3);
            i = (i & 63) | 128;
        }
        F0(i);
        return this;
    }

    public boolean S(long j, qd2 qd2) {
        return L(j, qd2, 0, qd2.A());
    }

    public String T(Charset charset) {
        try {
            return Z(this.f, charset);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public byte[] U() {
        try {
            return o0(this.f);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public qd2 V() {
        return new qd2(U());
    }

    public /* bridge */ /* synthetic */ od2 W(byte[] bArr, int i, int i2) {
        D0(bArr, i, i2);
        return this;
    }

    public void X(nd2 nd2, long j) {
        if (nd2 == null) {
            throw new IllegalArgumentException("source == null");
        } else if (nd2 != this) {
            fe2.b(nd2.f, 0, j);
            while (j > 0) {
                zd2 zd2 = nd2.e;
                if (j < ((long) (zd2.c - zd2.b))) {
                    zd2 zd22 = this.e;
                    zd2 zd23 = zd22 != null ? zd22.g : null;
                    if (zd23 != null && zd23.e) {
                        if ((((long) zd23.c) + j) - ((long) (zd23.d ? 0 : zd23.b)) <= 8192) {
                            nd2.e.f(zd23, (int) j);
                            nd2.f -= j;
                            this.f += j;
                            return;
                        }
                    }
                    nd2.e = nd2.e.e((int) j);
                }
                zd2 zd24 = nd2.e;
                long j2 = (long) (zd24.c - zd24.b);
                nd2.e = zd24.b();
                zd2 zd25 = this.e;
                if (zd25 == null) {
                    this.e = zd24;
                    zd24.g = zd24;
                    zd24.f = zd24;
                } else {
                    zd25.g.c(zd24);
                    zd24.a();
                }
                nd2.f -= j2;
                this.f += j2;
                j -= j2;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    public String Z(long j, Charset charset) {
        fe2.b(this.f, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        } else if (j == 0) {
            return "";
        } else {
            zd2 zd2 = this.e;
            if (((long) zd2.b) + j > ((long) zd2.c)) {
                return new String(o0(j), charset);
            }
            String str = new String(zd2.a, zd2.b, (int) j, charset);
            int i = (int) (((long) zd2.b) + j);
            zd2.b = i;
            this.f -= j;
            if (i == zd2.c) {
                this.e = zd2.b();
                ae2.a(zd2);
            }
            return str;
        }
    }

    public long a0(de2 de2) {
        if (de2 != null) {
            long j = 0;
            while (true) {
                long y0 = de2.y0(this, 8192);
                if (y0 == -1) {
                    return j;
                }
                j += y0;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    public final void b() {
        try {
            e(this.f);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public /* bridge */ /* synthetic */ od2 b0(long j) {
        L0(j);
        return this;
    }

    public ee2 c() {
        return ee2.d;
    }

    public String c0() {
        try {
            return Z(this.f, fe2.a);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public void close() {
    }

    public nd2 d() {
        return this;
    }

    public void e(long j) {
        while (j > 0) {
            zd2 zd2 = this.e;
            if (zd2 != null) {
                int min = (int) Math.min(j, (long) (zd2.c - zd2.b));
                long j2 = (long) min;
                this.f -= j2;
                j -= j2;
                zd2 zd22 = this.e;
                int i = zd22.b + min;
                zd22.b = i;
                if (i == zd22.c) {
                    this.e = zd22.b();
                    ae2.a(zd22);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public String e0(long j) {
        return Z(j, fe2.a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nd2)) {
            return false;
        }
        nd2 nd2 = (nd2) obj;
        long j = this.f;
        if (j != nd2.f) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        zd2 zd2 = this.e;
        zd2 zd22 = nd2.e;
        int i = zd2.b;
        int i2 = zd22.b;
        while (j2 < this.f) {
            long min = (long) Math.min(zd2.c - i, zd22.c - i2);
            int i3 = 0;
            while (((long) i3) < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (zd2.a[i] != zd22.a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == zd2.c) {
                zd2 = zd2.f;
                i = zd2.b;
            }
            if (i2 == zd22.c) {
                zd22 = zd22.f;
                i2 = zd22.b;
            }
            j2 += min;
        }
        return true;
    }

    public InputStream f() {
        return new b();
    }

    public boolean f0(long j) {
        return this.f >= j;
    }

    public void flush() {
    }

    public int g0() {
        byte b2;
        int i;
        byte b3;
        if (this.f != 0) {
            byte C = C(0);
            int i2 = 1;
            if ((C & 128) == 0) {
                b3 = C & Byte.MAX_VALUE;
                i = 1;
                b2 = 0;
            } else if ((C & 224) == 192) {
                b3 = C & 31;
                i = 2;
                b2 = 128;
            } else if ((C & 240) == 224) {
                b3 = C & 15;
                i = 3;
                b2 = 2048;
            } else if ((C & 248) == 240) {
                b3 = C & 7;
                i = 4;
                b2 = 65536;
            } else {
                e(1);
                return 65533;
            }
            long j = (long) i;
            if (this.f >= j) {
                while (i2 < i) {
                    long j2 = (long) i2;
                    byte C2 = C(j2);
                    if ((C2 & 192) == 128) {
                        b3 = (b3 << 6) | (C2 & 63);
                        i2++;
                    } else {
                        e(j2);
                        return 65533;
                    }
                }
                e(j);
                if (b3 > 1114111) {
                    return 65533;
                }
                if ((b3 < 55296 || b3 > 57343) && b3 >= b2) {
                    return b3;
                }
                return 65533;
            }
            throw new EOFException("size < " + i + ": " + this.f + " (to read code point prefixed 0x" + Integer.toHexString(C) + ")");
        }
        throw new EOFException();
    }

    /* access modifiers changed from: package-private */
    public String h0(long j) {
        String e0;
        long j2 = 1;
        if (j > 0) {
            long j3 = j - 1;
            if (C(j3) == 13) {
                e0 = e0(j3);
                j2 = 2;
                e(j2);
                return e0;
            }
        }
        e0 = e0(j);
        e(j2);
        return e0;
    }

    public int hashCode() {
        zd2 zd2 = this.e;
        if (zd2 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = zd2.c;
            for (int i3 = zd2.b; i3 < i2; i3++) {
                i = (i * 31) + zd2.a[i3];
            }
            zd2 = zd2.f;
        } while (zd2 != this.e);
        return i;
    }

    public boolean isOpen() {
        return true;
    }

    public final long k0() {
        return this.f;
    }

    public String l0() {
        return I(Long.MAX_VALUE);
    }

    public qd2 n(long j) {
        return new qd2(o0(j));
    }

    public int n0() {
        return fe2.c(readInt());
    }

    public /* bridge */ /* synthetic */ od2 o(int i) {
        N0(i);
        return this;
    }

    public byte[] o0(long j) {
        fe2.b(this.f, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[((int) j)];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
    }

    public final qd2 p0() {
        long j = this.f;
        if (j <= 2147483647L) {
            return s0((int) j);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f);
    }

    public /* bridge */ /* synthetic */ od2 q(int i) {
        M0(i);
        return this;
    }

    /* renamed from: r */
    public nd2 clone() {
        nd2 nd2 = new nd2();
        if (this.f == 0) {
            return nd2;
        }
        zd2 d = this.e.d();
        nd2.e = d;
        d.g = d;
        d.f = d;
        zd2 zd2 = this.e;
        while (true) {
            zd2 = zd2.f;
            if (zd2 != this.e) {
                nd2.e.g.c(zd2.d());
            } else {
                nd2.f = this.f;
                return nd2;
            }
        }
    }

    public /* bridge */ /* synthetic */ od2 r0(byte[] bArr) {
        z0(bArr);
        return this;
    }

    public int read(ByteBuffer byteBuffer) {
        zd2 zd2 = this.e;
        if (zd2 == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), zd2.c - zd2.b);
        byteBuffer.put(zd2.a, zd2.b, min);
        int i = zd2.b + min;
        zd2.b = i;
        this.f -= (long) min;
        if (i == zd2.c) {
            this.e = zd2.b();
            ae2.a(zd2);
        }
        return min;
    }

    public byte readByte() {
        long j = this.f;
        if (j != 0) {
            zd2 zd2 = this.e;
            int i = zd2.b;
            int i2 = zd2.c;
            int i3 = i + 1;
            byte b2 = zd2.a[i];
            this.f = j - 1;
            if (i3 == i2) {
                this.e = zd2.b();
                ae2.a(zd2);
            } else {
                zd2.b = i3;
            }
            return b2;
        }
        throw new IllegalStateException("size == 0");
    }

    public void readFully(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int P = P(bArr, i, bArr.length - i);
            if (P != -1) {
                i += P;
            } else {
                throw new EOFException();
            }
        }
    }

    public int readInt() {
        long j = this.f;
        if (j >= 4) {
            zd2 zd2 = this.e;
            int i = zd2.b;
            int i2 = zd2.c;
            if (i2 - i < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = zd2.a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b2 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i5 = i4 + 1;
            byte b3 = b2 | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b4 = b3 | (bArr[i5] & 255);
            this.f = j - 4;
            if (i6 == i2) {
                this.e = zd2.b();
                ae2.a(zd2);
            } else {
                zd2.b = i6;
            }
            return b4;
        }
        throw new IllegalStateException("size < 4: " + this.f);
    }

    public short readShort() {
        long j = this.f;
        if (j >= 2) {
            zd2 zd2 = this.e;
            int i = zd2.b;
            int i2 = zd2.c;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = zd2.a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b2 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.f = j - 2;
            if (i4 == i2) {
                this.e = zd2.b();
                ae2.a(zd2);
            } else {
                zd2.b = i4;
            }
            return (short) b2;
        }
        throw new IllegalStateException("size < 2: " + this.f);
    }

    public final qd2 s0(int i) {
        return i == 0 ? qd2.i : new be2(this, i);
    }

    public final long t() {
        long j = this.f;
        if (j == 0) {
            return 0;
        }
        zd2 zd2 = this.e.g;
        int i = zd2.c;
        return (i >= 8192 || !zd2.e) ? j : j - ((long) (i - zd2.b));
    }

    public /* bridge */ /* synthetic */ od2 t0(qd2 qd2) {
        v0(qd2);
        return this;
    }

    public String toString() {
        return p0().toString();
    }

    /* access modifiers changed from: package-private */
    public zd2 u0(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        zd2 zd2 = this.e;
        if (zd2 == null) {
            zd2 b2 = ae2.b();
            this.e = b2;
            b2.g = b2;
            b2.f = b2;
            return b2;
        }
        zd2 zd22 = zd2.g;
        if (zd22.c + i <= 8192 && zd22.e) {
            return zd22;
        }
        zd2 b3 = ae2.b();
        zd22.c(b3);
        return b3;
    }

    public boolean v() {
        return this.f == 0;
    }

    public nd2 v0(qd2 qd2) {
        if (qd2 != null) {
            qd2.H(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    public /* bridge */ /* synthetic */ od2 w(int i) {
        F0(i);
        return this;
    }

    public short w0() {
        return fe2.d(readShort());
    }

    public int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                zd2 u0 = u0(1);
                int min = Math.min(i, 8192 - u0.c);
                byteBuffer.get(u0.a, u0.c, min);
                i -= min;
                u0.c += min;
            }
            this.f += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    public long y0(nd2 nd2, long j) {
        if (nd2 == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j >= 0) {
            long j2 = this.f;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            nd2.X(this, j);
            return j;
        } else {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
    }

    public nd2 z0(byte[] bArr) {
        if (bArr != null) {
            D0(bArr, 0, bArr.length);
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }
}
