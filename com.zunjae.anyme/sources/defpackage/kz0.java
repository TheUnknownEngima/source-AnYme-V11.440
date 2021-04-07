package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: kz0  reason: default package */
final class kz0<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> e;

    public kz0(Iterator<Map.Entry<K, Object>> it) {
        this.e = it;
    }

    public final boolean hasNext() {
        return this.e.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.e.next();
        return next.getValue() instanceof fz0 ? new hz0(next) : next;
    }

    public final void remove() {
        this.e.remove();
    }
}
