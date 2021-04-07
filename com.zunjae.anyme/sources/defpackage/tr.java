package defpackage;

import defpackage.er;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: tr  reason: default package */
public final class tr implements er {
    private int b;
    private float c = 1.0f;
    private float d = 1.0f;
    private er.a e;
    private er.a f;
    private er.a g;
    private er.a h;
    private boolean i;
    private sr j;
    private ByteBuffer k;
    private ShortBuffer l;
    private ByteBuffer m;
    private long n;
    private long o;
    private boolean p;

    public tr() {
        er.a aVar = er.a.e;
        this.e = aVar;
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        ByteBuffer byteBuffer = er.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = er.a;
        this.b = -1;
    }

    public void a() {
        this.c = 1.0f;
        this.d = 1.0f;
        er.a aVar = er.a.e;
        this.e = aVar;
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        ByteBuffer byteBuffer = er.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = er.a;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0;
        this.o = 0;
        this.p = false;
    }

    public boolean b() {
        return this.f.a != -1 && (Math.abs(this.c - 1.0f) >= 0.01f || Math.abs(this.d - 1.0f) >= 0.01f || this.f.a != this.e.a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c() {
        /*
            r1 = this;
            boolean r0 = r1.p
            if (r0 == 0) goto L_0x0010
            sr r0 = r1.j
            if (r0 == 0) goto L_0x000e
            int r0 = r0.k()
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tr.c():boolean");
    }

    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.m;
        this.m = er.a;
        return byteBuffer;
    }

    public void e(ByteBuffer byteBuffer) {
        sr srVar = this.j;
        q40.e(srVar);
        sr srVar2 = srVar;
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.n += (long) remaining;
            srVar2.s(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int k2 = srVar2.k();
        if (k2 > 0) {
            if (this.k.capacity() < k2) {
                ByteBuffer order = ByteBuffer.allocateDirect(k2).order(ByteOrder.nativeOrder());
                this.k = order;
                this.l = order.asShortBuffer();
            } else {
                this.k.clear();
                this.l.clear();
            }
            srVar2.j(this.l);
            this.o += (long) k2;
            this.k.limit(k2);
            this.m = this.k;
        }
    }

    public er.a f(er.a aVar) {
        if (aVar.c == 2) {
            int i2 = this.b;
            if (i2 == -1) {
                i2 = aVar.a;
            }
            this.e = aVar;
            er.a aVar2 = new er.a(i2, aVar.b, 2);
            this.f = aVar2;
            this.i = true;
            return aVar2;
        }
        throw new er.b(aVar);
    }

    public void flush() {
        if (b()) {
            er.a aVar = this.e;
            this.g = aVar;
            er.a aVar2 = this.f;
            this.h = aVar2;
            if (this.i) {
                this.j = new sr(aVar.a, aVar.b, this.c, this.d, aVar2.a);
            } else {
                sr srVar = this.j;
                if (srVar != null) {
                    srVar.i();
                }
            }
        }
        this.m = er.a;
        this.n = 0;
        this.o = 0;
        this.p = false;
    }

    public void g() {
        sr srVar = this.j;
        if (srVar != null) {
            srVar.r();
        }
        this.p = true;
    }

    public long h(long j2) {
        long j3 = this.o;
        if (j3 < 1024) {
            return (long) (((double) this.c) * ((double) j2));
        }
        int i2 = this.h.a;
        int i3 = this.g.a;
        long j4 = this.n;
        if (i2 == i3) {
            return v50.w0(j2, j4, j3);
        }
        return v50.w0(j2, j4 * ((long) i2), j3 * ((long) i3));
    }

    public float i(float f2) {
        float n2 = v50.n(f2, 0.1f, 8.0f);
        if (this.d != n2) {
            this.d = n2;
            this.i = true;
        }
        return n2;
    }

    public float j(float f2) {
        float n2 = v50.n(f2, 0.1f, 8.0f);
        if (this.c != n2) {
            this.c = n2;
            this.i = true;
        }
        return n2;
    }
}
