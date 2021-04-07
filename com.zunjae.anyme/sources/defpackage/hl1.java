package defpackage;

import defpackage.rj1;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: hl1  reason: default package */
class hl1<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int e;
    /* access modifiers changed from: private */
    public List<hl1<K, V>.e> f;
    /* access modifiers changed from: private */
    public Map<K, V> g;
    private boolean h;
    private volatile hl1<K, V>.g i;
    /* access modifiers changed from: private */
    public Map<K, V> j;
    private volatile hl1<K, V>.c k;

    /* renamed from: hl1$a */
    static class a extends hl1<FieldDescriptorType, Object> {
        a(int i) {
            super(i, (a) null);
        }

        public void p() {
            if (!o()) {
                for (int i = 0; i < k(); i++) {
                    Map.Entry j = j(i);
                    if (((rj1.b) j.getKey()).p()) {
                        j.setValue(Collections.unmodifiableList((List) j.getValue()));
                    }
                }
                for (Map.Entry entry : m()) {
                    if (((rj1.b) entry.getKey()).p()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            hl1.super.p();
        }

        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return hl1.super.put((rj1.b) obj, obj2);
        }
    }

    /* renamed from: hl1$b */
    private class b implements Iterator<Map.Entry<K, V>> {
        private int e;
        private Iterator<Map.Entry<K, V>> f;

        private b() {
            this.e = hl1.this.f.size();
        }

        /* synthetic */ b(hl1 hl1, a aVar) {
            this();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f == null) {
                this.f = hl1.this.j.entrySet().iterator();
            }
            return this.f;
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            Object obj;
            if (a().hasNext()) {
                obj = a().next();
            } else {
                List b = hl1.this.f;
                int i = this.e - 1;
                this.e = i;
                obj = b.get(i);
            }
            return (Map.Entry) obj;
        }

        public boolean hasNext() {
            int i = this.e;
            return (i > 0 && i <= hl1.this.f.size()) || a().hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: hl1$c */
    private class c extends hl1<K, V>.g {
        private c() {
            super(hl1.this, (a) null);
        }

        /* synthetic */ c(hl1 hl1, a aVar) {
            this();
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(hl1.this, (a) null);
        }
    }

    /* renamed from: hl1$d */
    private static class d {
        /* access modifiers changed from: private */
        public static final Iterator<Object> a = new a();
        private static final Iterable<Object> b = new b();

        /* renamed from: hl1$d$a */
        static class a implements Iterator<Object> {
            a() {
            }

            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: hl1$d$b */
        static class b implements Iterable<Object> {
            b() {
            }

            public Iterator<Object> iterator() {
                return d.a;
            }
        }

        static <T> Iterable<T> b() {
            return b;
        }
    }

    /* renamed from: hl1$e */
    private class e implements Map.Entry<K, V>, Comparable<hl1<K, V>.e> {
        private final K e;
        private V f;

        e(K k, V v) {
            this.e = k;
            this.f = v;
        }

        e(hl1 hl1, Map.Entry<K, V> entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        private boolean e(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        /* renamed from: a */
        public int compareTo(hl1<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return e(this.e, entry.getKey()) && e(this.f, entry.getValue());
        }

        /* renamed from: f */
        public K getKey() {
            return this.e;
        }

        public V getValue() {
            return this.f;
        }

        public int hashCode() {
            K k = this.e;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            hl1.this.g();
            V v2 = this.f;
            this.f = v;
            return v2;
        }

        public String toString() {
            return this.e + "=" + this.f;
        }
    }

    /* renamed from: hl1$f */
    private class f implements Iterator<Map.Entry<K, V>> {
        private int e;
        private boolean f;
        private Iterator<Map.Entry<K, V>> g;

        private f() {
            this.e = -1;
        }

        /* synthetic */ f(hl1 hl1, a aVar) {
            this();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.g == null) {
                this.g = hl1.this.g.entrySet().iterator();
            }
            return this.g;
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            this.f = true;
            int i = this.e + 1;
            this.e = i;
            return (Map.Entry) (i < hl1.this.f.size() ? hl1.this.f.get(this.e) : a().next());
        }

        public boolean hasNext() {
            if (this.e + 1 >= hl1.this.f.size()) {
                return !hl1.this.g.isEmpty() && a().hasNext();
            }
            return true;
        }

        public void remove() {
            if (this.f) {
                this.f = false;
                hl1.this.g();
                if (this.e < hl1.this.f.size()) {
                    hl1 hl1 = hl1.this;
                    int i = this.e;
                    this.e = i - 1;
                    Object unused = hl1.s(i);
                    return;
                }
                a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    /* renamed from: hl1$g */
    private class g extends AbstractSet<Map.Entry<K, V>> {
        private g() {
        }

        /* synthetic */ g(hl1 hl1, a aVar) {
            this();
        }

        /* renamed from: a */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            hl1.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            hl1.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = hl1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(hl1.this, (a) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            hl1.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return hl1.this.size();
        }
    }

    private hl1(int i2) {
        this.e = i2;
        this.f = Collections.emptyList();
        this.g = Collections.emptyMap();
        this.j = Collections.emptyMap();
    }

    /* synthetic */ hl1(int i2, a aVar) {
        this(i2);
    }

    private int f(K k2) {
        int size = this.f.size() - 1;
        if (size >= 0) {
            int compareTo = k2.compareTo(this.f.get(size).getKey());
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
            int compareTo2 = k2.compareTo(this.f.get(i3).getKey());
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

    /* access modifiers changed from: private */
    public void g() {
        if (this.h) {
            throw new UnsupportedOperationException();
        }
    }

    private void i() {
        g();
        if (this.f.isEmpty() && !(this.f instanceof ArrayList)) {
            this.f = new ArrayList(this.e);
        }
    }

    private SortedMap<K, V> n() {
        g();
        if (this.g.isEmpty() && !(this.g instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.g = treeMap;
            this.j = treeMap.descendingMap();
        }
        return (SortedMap) this.g;
    }

    static <FieldDescriptorType extends rj1.b<FieldDescriptorType>> hl1<FieldDescriptorType, Object> q(int i2) {
        return new a(i2);
    }

    /* access modifiers changed from: private */
    public V s(int i2) {
        g();
        V value = this.f.remove(i2).getValue();
        if (!this.g.isEmpty()) {
            Iterator it = n().entrySet().iterator();
            this.f.add(new e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public void clear() {
        g();
        if (!this.f.isEmpty()) {
            this.f.clear();
        }
        if (!this.g.isEmpty()) {
            this.g.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.g.containsKey(comparable);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.i == null) {
            this.i = new g(this, (a) null);
        }
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hl1)) {
            return super.equals(obj);
        }
        hl1 hl1 = (hl1) obj;
        int size = size();
        if (size != hl1.size()) {
            return false;
        }
        int k2 = k();
        if (k2 != hl1.k()) {
            return entrySet().equals(hl1.entrySet());
        }
        for (int i2 = 0; i2 < k2; i2++) {
            if (!j(i2).equals(hl1.j(i2))) {
                return false;
            }
        }
        if (k2 != size) {
            return this.g.equals(hl1.g);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f2 = f(comparable);
        return f2 >= 0 ? this.f.get(f2).getValue() : this.g.get(comparable);
    }

    /* access modifiers changed from: package-private */
    public Set<Map.Entry<K, V>> h() {
        if (this.k == null) {
            this.k = new c(this, (a) null);
        }
        return this.k;
    }

    public int hashCode() {
        int k2 = k();
        int i2 = 0;
        for (int i3 = 0; i3 < k2; i3++) {
            i2 += this.f.get(i3).hashCode();
        }
        return l() > 0 ? i2 + this.g.hashCode() : i2;
    }

    public Map.Entry<K, V> j(int i2) {
        return this.f.get(i2);
    }

    public int k() {
        return this.f.size();
    }

    public int l() {
        return this.g.size();
    }

    public Iterable<Map.Entry<K, V>> m() {
        return this.g.isEmpty() ? d.b() : this.g.entrySet();
    }

    public boolean o() {
        return this.h;
    }

    public void p() {
        if (!this.h) {
            this.g = this.g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.g);
            this.j = this.j.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.j);
            this.h = true;
        }
    }

    /* renamed from: r */
    public V put(K k2, V v) {
        g();
        int f2 = f(k2);
        if (f2 >= 0) {
            return this.f.get(f2).setValue(v);
        }
        i();
        int i2 = -(f2 + 1);
        if (i2 >= this.e) {
            return n().put(k2, v);
        }
        int size = this.f.size();
        int i3 = this.e;
        if (size == i3) {
            e remove = this.f.remove(i3 - 1);
            n().put(remove.getKey(), remove.getValue());
        }
        this.f.add(i2, new e(k2, v));
        return null;
    }

    public V remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int f2 = f(comparable);
        if (f2 >= 0) {
            return s(f2);
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
