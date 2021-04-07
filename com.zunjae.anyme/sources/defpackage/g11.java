package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: g11  reason: default package */
class g11 extends AbstractSet<Map.Entry<K, V>> {
    private final /* synthetic */ z01 e;

    private g11(z01 z01) {
        this.e = z01;
    }

    /* synthetic */ g11(z01 z01, x01 x01) {
        this(z01);
    }

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.e.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.e.clear();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.e.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new h11(this.e, (x01) null);
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.e.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.e.size();
    }
}
