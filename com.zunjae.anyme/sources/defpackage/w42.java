package defpackage;

import defpackage.n42;

/* renamed from: w42  reason: default package */
public abstract class w42 extends t42 {
    private transient k42<Object> f;
    private final n42 g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public w42(k42<Object> k42) {
        this(k42, k42 != null ? k42.e() : null);
    }

    public w42(k42<Object> k42, n42 n42) {
        super(k42);
        this.g = n42;
    }

    public n42 e() {
        n42 n42 = this.g;
        v62.c(n42);
        return n42;
    }

    /* access modifiers changed from: protected */
    public void n() {
        k42<Object> k42 = this.f;
        if (!(k42 == null || k42 == this)) {
            n42.b bVar = e().get(l42.b);
            v62.c(bVar);
            ((l42) bVar).a(k42);
        }
        this.f = v42.e;
    }

    public final k42<Object> o() {
        k42<Object> k42 = this.f;
        if (k42 == null) {
            l42 l42 = (l42) e().get(l42.b);
            if (l42 == null || (k42 = l42.h(this)) == null) {
                k42 = this;
            }
            this.f = k42;
        }
        return k42;
    }
}
