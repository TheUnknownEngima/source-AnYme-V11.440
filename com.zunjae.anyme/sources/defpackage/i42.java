package defpackage;

import defpackage.n42;
import defpackage.n42.b;

/* renamed from: i42  reason: default package */
public abstract class i42<B extends n42.b, E extends B> implements n42.c<E> {
    private final n42.c<?> a;
    private final z52<n42.b, E> b;

    public final boolean a(n42.c<?> cVar) {
        v62.e(cVar, "key");
        return cVar == this || this.a == cVar;
    }

    public final E b(n42.b bVar) {
        v62.e(bVar, "element");
        return (n42.b) this.b.r(bVar);
    }
}
