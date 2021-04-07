package defpackage;

import defpackage.er;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: rr  reason: default package */
public final class rr extends kr {
    private final long i;
    private final long j;
    private final short k;
    private int l;
    private boolean m;
    private byte[] n;
    private byte[] o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private long t;

    public rr() {
        this(150000, 20000, 1024);
    }

    public rr(long j2, long j3, short s2) {
        q40.a(j3 <= j2);
        this.i = j2;
        this.j = j3;
        this.k = s2;
        byte[] bArr = v50.f;
        this.n = bArr;
        this.o = bArr;
    }

    private int n(long j2) {
        return (int) ((j2 * ((long) this.b.a)) / 1000000);
    }

    private int o(ByteBuffer byteBuffer) {
        q40.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
        int limit = byteBuffer.limit();
        while (true) {
            limit -= 2;
            if (limit < byteBuffer.position()) {
                return byteBuffer.position();
            }
            if (Math.abs(byteBuffer.getShort(limit)) > this.k) {
                int i2 = this.l;
                return ((limit / i2) * i2) + i2;
            }
        }
    }

    private int p(ByteBuffer byteBuffer) {
        q40.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs(byteBuffer.getShort(position)) > this.k) {
                int i2 = this.l;
                return i2 * (position / i2);
            }
        }
        return byteBuffer.limit();
    }

    private void r(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        m(remaining).put(byteBuffer).flip();
        if (remaining > 0) {
            this.s = true;
        }
    }

    private void s(byte[] bArr, int i2) {
        m(i2).put(bArr, 0, i2).flip();
        if (i2 > 0) {
            this.s = true;
        }
    }

    private void t(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int p2 = p(byteBuffer);
        int position = p2 - byteBuffer.position();
        byte[] bArr = this.n;
        int length = bArr.length;
        int i2 = this.q;
        int i3 = length - i2;
        if (p2 >= limit || position >= i3) {
            int min = Math.min(position, i3);
            byteBuffer.limit(byteBuffer.position() + min);
            byteBuffer.get(this.n, this.q, min);
            int i4 = this.q + min;
            this.q = i4;
            byte[] bArr2 = this.n;
            if (i4 == bArr2.length) {
                if (this.s) {
                    s(bArr2, this.r);
                    this.t += (long) ((this.q - (this.r * 2)) / this.l);
                } else {
                    this.t += (long) ((i4 - this.r) / this.l);
                }
                x(byteBuffer, this.n, this.q);
                this.q = 0;
                this.p = 2;
            }
            byteBuffer.limit(limit);
            return;
        }
        s(bArr, i2);
        this.q = 0;
        this.p = 0;
    }

    private void u(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.n.length));
        int o2 = o(byteBuffer);
        if (o2 == byteBuffer.position()) {
            this.p = 1;
        } else {
            byteBuffer.limit(o2);
            r(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    private void v(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int p2 = p(byteBuffer);
        byteBuffer.limit(p2);
        this.t += (long) (byteBuffer.remaining() / this.l);
        x(byteBuffer, this.o, this.r);
        if (p2 < limit) {
            s(this.o, this.r);
            this.p = 0;
            byteBuffer.limit(limit);
        }
    }

    private void x(ByteBuffer byteBuffer, byte[] bArr, int i2) {
        int min = Math.min(byteBuffer.remaining(), this.r);
        int i3 = this.r - min;
        System.arraycopy(bArr, i2 - i3, this.o, 0, i3);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.o, i3, min);
    }

    public boolean b() {
        return this.m;
    }

    public void e(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !h()) {
            int i2 = this.p;
            if (i2 == 0) {
                u(byteBuffer);
            } else if (i2 == 1) {
                t(byteBuffer);
            } else if (i2 == 2) {
                v(byteBuffer);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public er.a i(er.a aVar) {
        if (aVar.c == 2) {
            return this.m ? aVar : er.a.e;
        }
        throw new er.b(aVar);
    }

    /* access modifiers changed from: protected */
    public void j() {
        if (this.m) {
            this.l = this.b.d;
            int n2 = n(this.i) * this.l;
            if (this.n.length != n2) {
                this.n = new byte[n2];
            }
            int n3 = n(this.j) * this.l;
            this.r = n3;
            if (this.o.length != n3) {
                this.o = new byte[n3];
            }
        }
        this.p = 0;
        this.t = 0;
        this.q = 0;
        this.s = false;
    }

    /* access modifiers changed from: protected */
    public void k() {
        int i2 = this.q;
        if (i2 > 0) {
            s(this.n, i2);
        }
        if (!this.s) {
            this.t += (long) (this.r / this.l);
        }
    }

    /* access modifiers changed from: protected */
    public void l() {
        this.m = false;
        this.r = 0;
        byte[] bArr = v50.f;
        this.n = bArr;
        this.o = bArr;
    }

    public long q() {
        return this.t;
    }

    public void w(boolean z) {
        this.m = z;
    }
}
