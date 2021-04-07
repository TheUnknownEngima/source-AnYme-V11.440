package defpackage;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: in0  reason: default package */
class in0<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int e;
    /* access modifiers changed from: private */
    public List<nn0> f;
    /* access modifiers changed from: private */
    public Map<K, V> g;
    private boolean h;
    private volatile pn0 i;
    /* access modifiers changed from: private */
    public Map<K, V> j;
    private volatile jn0 k;

    private in0(int i2) {
        this.e = i2;
        this.f = Collections.emptyList();
        this.g = Collections.emptyMap();
        this.j = Collections.emptyMap();
    }

    /* synthetic */ in0(int i2, hn0 hn0) {
        this(i2);
    }

    private final int b(K k2) {
        int size = this.f.size() - 1;
        if (size >= 0) {
            int compareTo = k2.compareTo((Comparable) this.f.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            int compareTo2 = k2.compareTo((Comparable) this.f.get(i3).getKey());
            if (compareTo2 < 0) {
                size = i3 - 1;
            } else if (compareTo2 <= 0) {
                return i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    static <FieldDescriptorType extends yk0<FieldDescriptorType>> in0<FieldDescriptorType, Object> g(int i2) {
        return new hn0(i2);
    }

    /* access modifiers changed from: private */
    public final V i(int i2) {
        p();
        V value = this.f.remove(i2).getValue();
        if (!this.g.isEmpty()) {
            Iterator it = q().entrySet().iterator();
            this.f.add(new nn0(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* access modifiers changed from: private */
    public final void p() {
        if (this.h) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> q() {
        p();
        if (this.g.isEmpty() && !(this.g instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.g = treeMap;
            this.j = treeMap.descendingMap();
        }
        return (SortedMap) this.g;
    }

    public final boolean a() {
        return this.h;
    }

    public void clear() {
        p();
        if (!this.f.isEmpty()) {
            this.f.clear();
        }
        if (!this.g.isEmpty()) {
            this.g.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return b(comparable) >= 0 || this.g.containsKey(comparable);
    }

    /* renamed from: d */
    public final V put(K k2, V v) {
        p();
        int b = b(k2);
        if (b >= 0) {
            return this.f.get(b).setValue(v);
        }
        p();
        if (this.f.isEmpty() && !(this.f instanceof ArrayList)) {
            this.f = new ArrayList(this.e);
        }
        int i2 = -(b + 1);
        if (i2 >= this.e) {
            return q().put(k2, v);
        }
        int size = this.f.size();
        int i3 = this.e;
        if (size == i3) {
            nn0 remove = this.f.remove(i3 - 1);
            q().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.f.add(i2, new nn0(this, k2, v));
        return null;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.i == null) {
            this.i = new pn0(this, (hn0) null);
        }
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in0)) {
            return super.equals(obj);
        }
        in0 in0 = (in0) obj;
        int size = size();
        if (size != in0.size()) {
            return false;
        }
        int m = m();
        if (m != in0.m()) {
            return entrySet().equals(in0.entrySet());
        }
        for (int i2 = 0; i2 < m; i2++) {
            if (!h(i2).equals(in0.h(i2))) {
                return false;
            }
        }
        if (m != size) {
            return this.g.equals(in0.g);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int b = b(comparable);
        return b >= 0 ? this.f.get(b).getValue() : this.g.get(comparable);
    }

    public final Map.Entry<K, V> h(int i2) {
        return this.f.get(i2);
    }

    public int hashCode() {
        int m = m();
        int i2 = 0;
        for (int i3 = 0; i3 < m; i3++) {
            i2 += this.f.get(i3).hashCode();
        }
        return this.g.size() > 0 ? i2 + this.g.hashCode() : i2;
    }

    public void l() {
        if (!this.h) {
            this.g = this.g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.g);
            this.j = this.j.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.j);
            this.h = true;
        }
    }

    public final int m() {
        return this.f.size();
    }

    public final Iterable<Map.Entry<K, V>> n() {
        return this.g.isEmpty() ? mn0.a() : this.g.entrySet();
    }

    /* access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> o() {
        if (this.k == null) {
            this.k = new jn0(this, (hn0) null);
        }
        return this.k;
    }

    public V remove(Object obj) {
        p();
        Comparable comparable = (Comparable) obj;
        int b = b(comparable);
        if (b >= 0) {
            return i(b);
        }
        if (this.g.isEmpty()) {
            return null;
        }
        return this.g.remove(comparable);
    }

    public int size() {
        return this.f.size() + this.g.size();
    }
}
