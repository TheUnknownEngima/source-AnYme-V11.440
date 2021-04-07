package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: va  reason: default package */
public class va implements Closeable {
    /* access modifiers changed from: private */
    public final int e;
    /* access modifiers changed from: private */
    public final Charset f;
    /* access modifiers changed from: private */
    public final RandomAccessFile g;
    /* access modifiers changed from: private */
    public final byte[][] h;
    /* access modifiers changed from: private */
    public final int i;
    /* access modifiers changed from: private */
    public final int j;
    private b k;
    private boolean l;

    /* renamed from: va$b */
    private class b {
        private final long a;
        private final byte[] b;
        private byte[] c;
        private int d;

        private b(long j, int i, byte[] bArr) {
            this.a = j;
            this.b = new byte[((bArr != null ? bArr.length : 0) + i)];
            long a2 = (j - 1) * ((long) va.this.e);
            if (j > 0) {
                va.this.g.seek(a2);
                if (va.this.g.read(this.b, 0, i) != i) {
                    throw new IllegalStateException("Count of requested bytes and actually read bytes don't match");
                }
            }
            if (bArr != null) {
                System.arraycopy(bArr, 0, this.b, i, bArr.length);
            }
            this.d = this.b.length - 1;
            this.c = null;
        }

        private int a(byte[] bArr, int i) {
            for (byte[] bArr2 : va.this.h) {
                boolean z = true;
                for (int length = bArr2.length - 1; length >= 0; length--) {
                    int length2 = (i + length) - (bArr2.length - 1);
                    z &= length2 >= 0 && bArr[length2] == bArr2[length];
                }
                if (z) {
                    return bArr2.length;
                }
            }
            return 0;
        }

        private void c() {
            int i = this.d + 1;
            if (i > 0) {
                byte[] bArr = new byte[i];
                this.c = bArr;
                System.arraycopy(this.b, 0, bArr, 0, i);
            } else {
                this.c = null;
            }
            this.d = -1;
        }

        /* access modifiers changed from: private */
        public String e() {
            String str;
            boolean z = this.a == 1;
            int i = this.d;
            while (true) {
                if (i > -1) {
                    if (!z && i < va.this.i) {
                        break;
                    }
                    int a2 = a(this.b, i);
                    if (a2 <= 0) {
                        i -= va.this.j;
                        if (i < 0) {
                            break;
                        }
                    } else {
                        int i2 = i + 1;
                        int i3 = (this.d - i2) + 1;
                        if (i3 >= 0) {
                            byte[] bArr = new byte[i3];
                            System.arraycopy(this.b, i2, bArr, 0, i3);
                            str = new String(bArr, va.this.f);
                            this.d = i - a2;
                        } else {
                            throw new IllegalStateException("Unexpected negative line length=" + i3);
                        }
                    }
                } else {
                    break;
                }
            }
            c();
            str = null;
            if (!z || this.c == null) {
                return str;
            }
            String str2 = new String(this.c, va.this.f);
            this.c = null;
            return str2;
        }

        /* access modifiers changed from: private */
        public b f() {
            if (this.d <= -1) {
                long j = this.a;
                if (j > 1) {
                    va vaVar = va.this;
                    return new b(j - 1, vaVar.e, this.c);
                } else if (this.c == null) {
                    return null;
                } else {
                    throw new IllegalStateException("Unexpected leftover of the last block: leftOverOfThisFilePart=" + new String(this.c, va.this.f));
                }
            } else {
                throw new IllegalStateException("Current currentLastCharPos unexpectedly positive... last readLine() should have returned something! currentLastCharPos=" + this.d);
            }
        }
    }

    private va(File file, int i2, Charset charset) {
        int i3;
        long j2;
        this.l = false;
        this.e = i2;
        this.f = charset;
        if (charset.newEncoder().maxBytesPerChar() == 1.0f || charset == wa.a) {
            this.j = 1;
            byte[][] bArr = {"\r\n".getBytes(charset), "\n".getBytes(charset), "\r".getBytes(charset)};
            this.h = bArr;
            this.i = bArr[0].length;
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            this.g = randomAccessFile;
            long length = randomAccessFile.length();
            long j3 = (long) i2;
            int i4 = (int) (length % j3);
            if (i4 > 0) {
                i3 = i4;
                j2 = (length / j3) + 1;
            } else {
                long j4 = length / j3;
                i3 = length > 0 ? i2 : i4;
                j2 = j4;
            }
            this.k = new b(j2, i3, (byte[]) null);
            return;
        }
        throw new UnsupportedEncodingException("Encoding " + charset + " is not supported yet (feel free to submit a patch)");
    }

    public va(File file, Charset charset) {
        this(file, 4096, charset);
    }

    public void close() {
        this.g.close();
    }

    public String h() {
        String b2 = this.k.e();
        while (b2 == null) {
            b d = this.k.f();
            this.k = d;
            if (d == null) {
                break;
            }
            b2 = d.e();
        }
        if (!"".equals(b2) || this.l) {
            return b2;
        }
        this.l = true;
        return h();
    }
}
