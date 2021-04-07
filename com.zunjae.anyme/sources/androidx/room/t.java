package androidx.room;

import defpackage.n42;

public final class t implements n42.b {
    public static final a f = new a((r62) null);
    private final l42 e;

    public static final class a implements n42.c<t> {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }
    }

    public final l42 c() {
        return this.e;
    }

    public <R> R fold(R r, d62<? super R, ? super n42.b, ? extends R> d62) {
        v62.f(d62, "operation");
        return n42.b.a.a(this, r, d62);
    }

    public <E extends n42.b> E get(n42.c<E> cVar) {
        v62.f(cVar, "key");
        return n42.b.a.b(this, cVar);
    }

    public n42.c<t> getKey() {
        return f;
    }

    public n42 minusKey(n42.c<?> cVar) {
        v62.f(cVar, "key");
        return n42.b.a.c(this, cVar);
    }

    public n42 plus(n42 n42) {
        v62.f(n42, "context");
        return n42.b.a.d(this, n42);
    }
}
