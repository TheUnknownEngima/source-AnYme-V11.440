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

/* renamed from: z01  reason: default package */
class z01<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int e;
    /* access modifiers changed from: private */
    public List<e11> f;
    /* access modifiers changed from: private */
    public Map<K, V> g;
    private boolean h;
    private volatile g11 i;
    /* access modifiers changed from: private */
    public Map<K, V> j;
    private volatile a11 k;

    private z01(int i2) {
        this.e = i2;
        this.f = Collections.emptyList();
        this.g = Collections.emptyMap();
        this.j = Collections.emptyMap();
    }

    /* synthetic */ z01(int i2, x01 x01) {
        this(i2);
    }

    private final int a(K k2) {
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

    static <FieldDescriptorType extends ny0<FieldDescriptorType>> z01<FieldDescriptorType, Object> b(int i2) {
        return new x01(i2);
    }

    /* access modifiers changed from: private */
    public final V k(int i2) {
        p();
        V value = this.f.remove(i2).getValue();
        if (!this.g.isEmpty()) {
            Iterator it = q().entrySet().iterator();
            this.f.add(new e11(this, (Map.Entry) it.next()));
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
        return a(comparable) >= 0 || this.g.containsKey(comparable);
    }

    /* renamed from: d */
    public final V put(K k2, V v) {
        p();
        int a = a(k2);
        if (a >= 0) {
            return this.f.get(a).setValue(v);
        }
        p();
        if (this.f.isEmpty() && !(this.f instanceof ArrayList)) {
            this.f = new ArrayList(this.e);
        }
        int i2 = -(a + 1);
        if (i2 >= this.e) {
            return q().put(k2, v);
        }
        int size = this.f.size();
        int i3 = this.e;
        if (size == i3) {
            e11 remove = this.f.remove(i3 - 1);
            q().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.f.add(i2, new e11(this, k2, v));
        return null;
    }

    public void e() {
        if (!this.h) {
            this.g = this.g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.g);
            this.j = this.j.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.j);
            this.h = true;
        }
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.i == null) {
            this.i = new g11(this, (x01) null);
        }
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z01)) {
            return super.equals(obj);
        }
        z01 z01 = (z01) obj;
        int size = size();
        if (size != z01.size()) {
            return false;
        }
        int j2 = j();
        if (j2 != z01.j()) {
            return entrySet().equals(z01.entrySet());
        }
        for (int i2 = 0; i2 < j2; i2++) {
            if (!h(i2).equals(z01.h(i2))) {
                return false;
            }
        }
        if (j2 != size) {
            return this.g.equals(z01.g);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        return a >= 0 ? this.f.get(a).getValue() : this.g.get(comparable);
    }

    public final Map.Entry<K, V> h(int i2) {
        return this.f.get(i2);
    }

    public int hashCode() {
        int j2 = j();
        int i2 = 0;
        for (int i3 = 0; i3 < j2; i3++) {
            i2 += this.f.get(i3).hashCode();
        }
        return this.g.size() > 0 ? i2 + this.g.hashCode() : i2;
    }

    public final boolean i() {
        return this.h;
    }

    public final int j() {
        return this.f.size();
    }

    public final Iterable<Map.Entry<K, V>> m() {
        return this.g.isEmpty() ? d11.a() : this.g.entrySet();
    }

    /* access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> o() {
        if (this.k == null) {
            this.k = new a11(this, (x01) null);
        }
        return this.k;
    }

    public V remove(Object obj) {
        p();
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return k(a);
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
