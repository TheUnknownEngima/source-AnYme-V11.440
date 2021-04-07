package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: ul0  reason: default package */
final class ul0<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> e;

    public ul0(Iterator<Map.Entry<K, Object>> it) {
        this.e = it;
    }

    public final boolean hasNext() {
        return this.e.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.e.next();
        return next.getValue() instanceof pl0 ? new rl0(next) : next;
    }

    public final void remove() {
        this.e.remove();
    }
}
