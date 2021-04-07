package defpackage;

import defpackage.z;
import java.util.HashMap;
import java.util.Map;

/* renamed from: y  reason: default package */
public class y<K, V> extends z<K, V> {
    private HashMap<K, z.c<K, V>> i = new HashMap<>();

    public boolean contains(K k) {
        return this.i.containsKey(k);
    }

    /* access modifiers changed from: protected */
    public z.c<K, V> d(K k) {
        return this.i.get(k);
    }

    public V j(K k, V v) {
        z.c d = d(k);
        if (d != null) {
            return d.f;
        }
        this.i.put(k, i(k, v));
        return null;
    }

    public V k(K k) {
        V k2 = super.k(k);
        this.i.remove(k);
        return k2;
    }

    public Map.Entry<K, V> l(K k) {
        if (contains(k)) {
            return this.i.get(k).h;
        }
        return null;
    }
}
