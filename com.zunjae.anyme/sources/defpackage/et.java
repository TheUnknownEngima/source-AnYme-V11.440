package defpackage;

import com.google.android.exoplayer2.upstream.i;
import java.io.EOFException;
import java.util.Arrays;

/* renamed from: et  reason: default package */
public final class et implements it {
    private final byte[] a = new byte[4096];
    private final i b;
    private final long c;
    private long d;
    private byte[] e = new byte[65536];
    private int f;
    private int g;

    public et(i iVar, long j, long j2) {
        this.b = iVar;
        this.d = j;
        this.c = j2;
    }

    private void n(int i) {
        if (i != -1) {
            this.d += (long) i;
        }
    }

    private void o(int i) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, v50.o(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    private int p(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int a2 = this.b.a(bArr, i + i3, i2 - i3);
            if (a2 != -1) {
                return i3 + a2;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }

    private int q(byte[] bArr, int i, int i2) {
        int i3 = this.g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.e, 0, bArr, i, min);
        t(min);
        return min;
    }

    private int r(int i) {
        int min = Math.min(this.g, i);
        t(min);
        return min;
    }

    private void t(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        if (i2 < bArr.length - 524288) {
            bArr = new byte[(i2 + 65536)];
        }
        System.arraycopy(this.e, i, bArr, 0, this.g);
        this.e = bArr;
    }

    public int a(byte[] bArr, int i, int i2) {
        int q = q(bArr, i, i2);
        if (q == 0) {
            q = p(bArr, i, i2, 0, true);
        }
        n(q);
        return q;
    }

    public boolean b(byte[] bArr, int i, int i2, boolean z) {
        int q = q(bArr, i, i2);
        while (q < i2 && q != -1) {
            q = p(bArr, i, i2, q, z);
        }
        n(q);
        return q != -1;
    }

    public boolean c(byte[] bArr, int i, int i2, boolean z) {
        if (!k(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    public long d() {
        return this.d + ((long) this.f);
    }

    public void e(int i) {
        k(i, false);
    }

    public int f(int i) {
        int r = r(i);
        if (r == 0) {
            byte[] bArr = this.a;
            r = p(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        n(r);
        return r;
    }

    public long g() {
        return this.c;
    }

    public int h(byte[] bArr, int i, int i2) {
        int i3;
        o(i2);
        int i4 = this.g;
        int i5 = this.f;
        int i6 = i4 - i5;
        if (i6 == 0) {
            i3 = p(this.e, i5, i2, 0, true);
            if (i3 == -1) {
                return -1;
            }
            this.g += i3;
        } else {
            i3 = Math.min(i2, i6);
        }
        System.arraycopy(this.e, this.f, bArr, i, i3);
        this.f += i3;
        return i3;
    }

    public void i() {
        this.f = 0;
    }

    public void j(int i) {
        s(i, false);
    }

    public boolean k(int i, boolean z) {
        o(i);
        int i2 = this.g - this.f;
        while (i2 < i) {
            i2 = p(this.e, this.f, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.g = this.f + i2;
        }
        this.f += i;
        return true;
    }

    public void l(byte[] bArr, int i, int i2) {
        c(bArr, i, i2, false);
    }

    public long m() {
        return this.d;
    }

    public void readFully(byte[] bArr, int i, int i2) {
        b(bArr, i, i2, false);
    }

    public boolean s(int i, boolean z) {
        int r = r(i);
        while (r < i && r != -1) {
            r = p(this.a, -r, Math.min(i, this.a.length + r), r, z);
        }
        n(r);
        return r != -1;
    }
}
