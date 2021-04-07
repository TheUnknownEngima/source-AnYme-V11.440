package defpackage;

import defpackage.n42;

/* renamed from: h42  reason: default package */
public abstract class h42 implements n42.b {
    private final n42.c<?> key;

    public h42(n42.c<?> cVar) {
        v62.e(cVar, "key");
        this.key = cVar;
    }

    public <R> R fold(R r, d62<? super R, ? super n42.b, ? extends R> d62) {
        v62.e(d62, "operation");
        return n42.b.a.a(this, r, d62);
    }

    public <E extends n42.b> E get(n42.c<E> cVar) {
        v62.e(cVar, "key");
        return n42.b.a.b(this, cVar);
    }

    public n42.c<?> getKey() {
        return this.key;
    }

    public n42 minusKey(n42.c<?> cVar) {
        v62.e(cVar, "key");
        return n42.b.a.c(this, cVar);
    }

    public n42 plus(n42 n42) {
        v62.e(n42, "context");
        return n42.b.a.d(this, n42);
    }
}
