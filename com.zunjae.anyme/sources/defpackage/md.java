package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: md  reason: default package */
class md implements Closeable {
    private final InputStream e;
    /* access modifiers changed from: private */
    public final Charset f;
    private byte[] g;
    private int h;
    private int i;

    /* renamed from: md$a */
    class a extends ByteArrayOutputStream {
        a(int i) {
            super(i);
        }

        public String toString() {
            int i = this.count;
            try {
                return new String(this.buf, 0, (i <= 0 || this.buf[i + -1] != 13) ? this.count : i - 1, md.this.f.name());
            } catch (UnsupportedEncodingException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public md(InputStream inputStream, int i2, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i2 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(nd.a)) {
            this.e = inputStream;
            this.f = charset;
            this.g = new byte[i2];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public md(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void b() {
        InputStream inputStream = this.e;
        byte[] bArr = this.g;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.h = 0;
            this.i = read;
            return;
        }
        throw new EOFException();
    }

    public void close() {
        synchronized (this.e) {
            if (this.g != null) {
                this.g = null;
                this.e.close();
            }
        }
    }

    public boolean h() {
        return this.i == -1;
    }

    public String i() {
        int i2;
        int i3;
        synchronized (this.e) {
            if (this.g != null) {
                if (this.h >= this.i) {
                    b();
                }
                for (int i4 = this.h; i4 != this.i; i4++) {
                    if (this.g[i4] == 10) {
                        if (i4 != this.h) {
                            i3 = i4 - 1;
                            if (this.g[i3] == 13) {
                                String str = new String(this.g, this.h, i3 - this.h, this.f.name());
                                this.h = i4 + 1;
                                return str;
                            }
                        }
                        i3 = i4;
                        String str2 = new String(this.g, this.h, i3 - this.h, this.f.name());
                        this.h = i4 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.i - this.h) + 80);
                loop1:
                while (true) {
                    aVar.write(this.g, this.h, this.i - this.h);
                    this.i = -1;
                    b();
                    i2 = this.h;
                    while (true) {
                        if (i2 != this.i) {
                            if (this.g[i2] == 10) {
                                break loop1;
                            }
                            i2++;
                        }
                    }
                }
                if (i2 != this.h) {
                    aVar.write(this.g, this.h, i2 - this.h);
                }
                this.h = i2 + 1;
                String aVar2 = aVar.toString();
                return aVar2;
            }
            throw new IOException("LineReader is closed");
        }
    }
}
