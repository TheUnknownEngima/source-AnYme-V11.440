package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: zd  reason: default package */
public final class zd extends FilterInputStream {
    private static final byte[] g;
    private static final int h;
    private static final int i;
    private final byte e;
    private int f;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        g = bArr;
        int length = bArr.length;
        h = length;
        i = length + 2;
    }

    public zd(InputStream inputStream, int i2) {
        super(inputStream);
        if (i2 < -1 || i2 > 8) {
            throw new IllegalArgumentException("Cannot add invalid orientation: " + i2);
        }
        this.e = (byte) i2;
    }

    public void mark(int i2) {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported() {
        return false;
    }

    public int read() {
        int i2;
        int i3 = this.f;
        int read = (i3 < 2 || i3 > (i2 = i)) ? super.read() : i3 == i2 ? this.e : g[i3 - 2] & 255;
        if (read != -1) {
            this.f++;
        }
        return read;
    }

    public int read(byte[] bArr, int i2, int i3) {
        int i4;
        int i5 = this.f;
        int i6 = i;
        if (i5 > i6) {
            i4 = super.read(bArr, i2, i3);
        } else if (i5 == i6) {
            bArr[i2] = this.e;
            i4 = 1;
        } else if (i5 < 2) {
            i4 = super.read(bArr, i2, 2 - i5);
        } else {
            int min = Math.min(i6 - i5, i3);
            System.arraycopy(g, this.f - 2, bArr, i2, min);
            i4 = min;
        }
        if (i4 > 0) {
            this.f += i4;
        }
        return i4;
    }

    public void reset() {
        throw new UnsupportedOperationException();
    }

    public long skip(long j) {
        long skip = super.skip(j);
        if (skip > 0) {
            this.f = (int) (((long) this.f) + skip);
        }
        return skip;
    }
}
