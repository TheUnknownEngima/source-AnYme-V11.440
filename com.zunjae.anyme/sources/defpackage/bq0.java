package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: bq0  reason: default package */
final class bq0 extends FilterInputStream {
    private long e;
    private long f = -1;

    bq0(InputStream inputStream, long j) {
        super(inputStream);
        wp0.a(inputStream);
        this.e = 1048577;
    }

    public final int available() {
        return (int) Math.min((long) this.in.available(), this.e);
    }

    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.f = this.e;
    }

    public final int read() {
        if (this.e == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.e--;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        long j = this.e;
        if (j == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.e -= (long) read;
        }
        return read;
    }

    public final synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.f != -1) {
            this.in.reset();
            this.e = this.f;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public final long skip(long j) {
        long skip = this.in.skip(Math.min(j, this.e));
        this.e -= skip;
        return skip;
    }
}
