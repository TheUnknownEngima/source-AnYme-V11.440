package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: hm  reason: default package */
public class hm extends FilterInputStream {
    private int e = Integer.MIN_VALUE;

    public hm(InputStream inputStream) {
        super(inputStream);
    }

    private long a(long j) {
        int i = this.e;
        if (i == 0) {
            return -1;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : (long) i;
    }

    private void b(long j) {
        int i = this.e;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.e = (int) (((long) i) - j);
        }
    }

    public int available() {
        int i = this.e;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    public synchronized void mark(int i) {
        super.mark(i);
        this.e = i;
    }

    public int read() {
        if (a(1) == -1) {
            return -1;
        }
        int read = super.read();
        b(1);
        return read;
    }

    public int read(byte[] bArr, int i, int i2) {
        int a = (int) a((long) i2);
        if (a == -1) {
            return -1;
        }
        int read = super.read(bArr, i, a);
        b((long) read);
        return read;
    }

    public synchronized void reset() {
        super.reset();
        this.e = Integer.MIN_VALUE;
    }

    public long skip(long j) {
        long a = a(j);
        if (a == -1) {
            return 0;
        }
        long skip = super.skip(a);
        b(skip);
        return skip;
    }
}
