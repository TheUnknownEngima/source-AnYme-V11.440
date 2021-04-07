package defpackage;

import defpackage.er;
import java.nio.ByteBuffer;

/* renamed from: ur  reason: default package */
final class ur extends kr {
    private int i;
    private int j;
    private boolean k;
    private int l;
    private byte[] m = v50.f;
    private int n;
    private long o;

    public boolean c() {
        return super.c() && this.n == 0;
    }

    public ByteBuffer d() {
        int i2;
        if (super.c() && (i2 = this.n) > 0) {
            m(i2).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.d();
    }

    public void e(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        if (i2 != 0) {
            int min = Math.min(i2, this.l);
            this.o += (long) (min / this.b.d);
            this.l -= min;
            byteBuffer.position(position + min);
            if (this.l <= 0) {
                int i3 = i2 - min;
                int length = (this.n + i3) - this.m.length;
                ByteBuffer m2 = m(length);
                int o2 = v50.o(length, 0, this.n);
                m2.put(this.m, 0, o2);
                int o3 = v50.o(length - o2, 0, i3);
                byteBuffer.limit(byteBuffer.position() + o3);
                m2.put(byteBuffer);
                byteBuffer.limit(limit);
                int i4 = i3 - o3;
                int i5 = this.n - o2;
                this.n = i5;
                byte[] bArr = this.m;
                System.arraycopy(bArr, o2, bArr, 0, i5);
                byteBuffer.get(this.m, this.n, i4);
                this.n += i4;
                m2.flip();
            }
        }
    }

    public er.a i(er.a aVar) {
        if (aVar.c == 2) {
            this.k = true;
            return (this.i == 0 && this.j == 0) ? er.a.e : aVar;
        }
        throw new er.b(aVar);
    }

    /* access modifiers changed from: protected */
    public void j() {
        if (this.k) {
            this.k = false;
            int i2 = this.j;
            int i3 = this.b.d;
            this.m = new byte[(i2 * i3)];
            this.l = this.i * i3;
        }
        this.n = 0;
    }

    /* access modifiers changed from: protected */
    public void k() {
        if (this.k) {
            int i2 = this.n;
            if (i2 > 0) {
                this.o += (long) (i2 / this.b.d);
            }
            this.n = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void l() {
        this.m = v50.f;
    }

    public long n() {
        return this.o;
    }

    public void o() {
        this.o = 0;
    }

    public void p(int i2, int i3) {
        this.i = i2;
        this.j = i3;
    }
}
