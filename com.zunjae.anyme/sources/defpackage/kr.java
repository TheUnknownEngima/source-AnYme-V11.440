package defpackage;

import defpackage.er;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: kr  reason: default package */
public abstract class kr implements er {
    protected er.a b;
    protected er.a c;
    private er.a d;
    private er.a e;
    private ByteBuffer f;
    private ByteBuffer g;
    private boolean h;

    public kr() {
        ByteBuffer byteBuffer = er.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        er.a aVar = er.a.e;
        this.d = aVar;
        this.e = aVar;
        this.b = aVar;
        this.c = aVar;
    }

    public final void a() {
        flush();
        this.f = er.a;
        er.a aVar = er.a.e;
        this.d = aVar;
        this.e = aVar;
        this.b = aVar;
        this.c = aVar;
        l();
    }

    public boolean b() {
        return this.e != er.a.e;
    }

    public boolean c() {
        return this.h && this.g == er.a;
    }

    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.g;
        this.g = er.a;
        return byteBuffer;
    }

    public final er.a f(er.a aVar) {
        this.d = aVar;
        this.e = i(aVar);
        return b() ? this.e : er.a.e;
    }

    public final void flush() {
        this.g = er.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        j();
    }

    public final void g() {
        this.h = true;
        k();
    }

    /* access modifiers changed from: protected */
    public final boolean h() {
        return this.g.hasRemaining();
    }

    /* access modifiers changed from: protected */
    public abstract er.a i(er.a aVar);

    /* access modifiers changed from: protected */
    public void j() {
    }

    /* access modifiers changed from: protected */
    public void k() {
    }

    /* access modifiers changed from: protected */
    public void l() {
    }

    /* access modifiers changed from: protected */
    public final ByteBuffer m(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }
}
