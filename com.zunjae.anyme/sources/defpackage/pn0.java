package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: pn0  reason: default package */
class pn0 extends AbstractSet<Map.Entry<K, V>> {
    private final /* synthetic */ in0 e;

    private pn0(in0 in0) {
        this.e = in0;
    }

    /* synthetic */ pn0(in0 in0, hn0 hn0) {
        this(in0);
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
        return new qn0(this.e, (hn0) null);
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
