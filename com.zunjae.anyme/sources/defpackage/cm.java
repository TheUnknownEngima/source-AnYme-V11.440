package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: cm  reason: default package */
public final class cm extends FilterInputStream {
    private final long e;
    private int f;

    private cm(InputStream inputStream, long j) {
        super(inputStream);
        this.e = j;
    }

    private int a(int i) {
        if (i >= 0) {
            this.f += i;
        } else if (this.e - ((long) this.f) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.e + ", but read: " + this.f);
        }
        return i;
    }

    public static InputStream b(InputStream inputStream, long j) {
        return new cm(inputStream, j);
    }

    public synchronized int available() {
        return (int) Math.max(this.e - ((long) this.f), (long) this.in.available());
    }

    public synchronized int read() {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public synchronized int read(byte[] bArr, int i, int i2) {
        int read;
        read = super.read(bArr, i, i2);
        a(read);
        return read;
    }
}
