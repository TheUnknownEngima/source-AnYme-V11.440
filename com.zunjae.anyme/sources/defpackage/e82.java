package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: e82  reason: default package */
public final class e82<T> implements g82<T> {
    private final AtomicReference<g82<T>> a;

    public e82(g82<? extends T> g82) {
        v62.e(g82, "sequence");
        this.a = new AtomicReference<>(g82);
    }

    public Iterator<T> iterator() {
        g82 andSet = this.a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
