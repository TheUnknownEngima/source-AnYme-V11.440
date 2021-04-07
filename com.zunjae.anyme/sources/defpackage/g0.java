package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: g0  reason: default package */
abstract class g0<K, V> {
    g0<K, V>.b a;
    g0<K, V>.c b;
    g0<K, V>.e c;

    /* renamed from: g0$a */
    final class a<T> implements Iterator<T> {
        final int e;
        int f;
        int g;
        boolean h = false;

        a(int i2) {
            this.e = i2;
            this.f = g0.this.d();
        }

        public boolean hasNext() {
            return this.g < this.f;
        }

        public T next() {
            if (hasNext()) {
                T b = g0.this.b(this.g, this.e);
                this.g++;
                this.h = true;
                return b;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.h) {
                int i2 = this.g - 1;
                this.g = i2;
                this.f--;
                this.h = false;
                g0.this.h(i2);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: g0$b */
    final class b implements Set<Map.Entry<K, V>> {
        b() {
        }

        public boolean a(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            a((Map.Entry) obj);
            throw null;
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d = g0.this.d();
            for (Map.Entry entry : collection) {
                g0.this.g(entry.getKey(), entry.getValue());
            }
            return d != g0.this.d();
        }

        public void clear() {
            g0.this.a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e2 = g0.this.e(entry.getKey());
            if (e2 < 0) {
                return false;
            }
            return d0.c(g0.this.b(e2, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return g0.k(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int d = g0.this.d() - 1; d >= 0; d--) {
                Object b = g0.this.b(d, 0);
                Object b2 = g0.this.b(d, 1);
                i += (b == null ? 0 : b.hashCode()) ^ (b2 == null ? 0 : b2.hashCode());
            }
            return i;
        }

        public boolean isEmpty() {
            return g0.this.d() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return g0.this.d();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: g0$c */
    final class c implements Set<K> {
        c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            g0.this.a();
        }

        public boolean contains(Object obj) {
            return g0.this.e(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return g0.j(g0.this.c(), collection);
        }

        public boolean equals(Object obj) {
            return g0.k(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int d = g0.this.d() - 1; d >= 0; d--) {
                Object b = g0.this.b(d, 0);
                i += b == null ? 0 : b.hashCode();
            }
            return i;
        }

        public boolean isEmpty() {
            return g0.this.d() == 0;
        }

        public Iterator<K> iterator() {
            return new a(0);
        }

        public boolean remove(Object obj) {
            int e2 = g0.this.e(obj);
            if (e2 < 0) {
                return false;
            }
            g0.this.h(e2);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return g0.o(g0.this.c(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return g0.p(g0.this.c(), collection);
        }

        public int size() {
            return g0.this.d();
        }

        public Object[] toArray() {
            return g0.this.q(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return g0.this.r(tArr, 0);
        }
    }

    /* renamed from: g0$d */
    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        int e;
        int f;
        boolean g = false;

        d() {
            this.e = g0.this.d() - 1;
            this.f = -1;
        }

        public Map.Entry<K, V> a() {
            if (hasNext()) {
                this.f++;
                this.g = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public boolean equals(Object obj) {
            if (!this.g) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                return d0.c(entry.getKey(), g0.this.b(this.f, 0)) && d0.c(entry.getValue(), g0.this.b(this.f, 1));
            }
        }

        public K getKey() {
            if (this.g) {
                return g0.this.b(this.f, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.g) {
                return g0.this.b(this.f, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f < this.e;
        }

        public int hashCode() {
            if (this.g) {
                int i = 0;
                Object b = g0.this.b(this.f, 0);
                Object b2 = g0.this.b(this.f, 1);
                int hashCode = b == null ? 0 : b.hashCode();
                if (b2 != null) {
                    i = b2.hashCode();
                }
                return hashCode ^ i;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public /* bridge */ /* synthetic */ Object next() {
            a();
            return this;
        }

        public void remove() {
            if (this.g) {
                g0.this.h(this.f);
                this.f--;
                this.e--;
                this.g = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.g) {
                return g0.this.i(this.f, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: g0$e */
    final class e implements Collection<V> {
        e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            g0.this.a();
        }

        public boolean contains(Object obj) {
            return g0.this.f(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return g0.this.d() == 0;
        }

        public Iterator<V> iterator() {
            return new a(1);
        }

        public boolean remove(Object obj) {
            int f = g0.this.f(obj);
            if (f < 0) {
                return false;
            }
            g0.this.h(f);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int d = g0.this.d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (collection.contains(g0.this.b(i, 1))) {
                    g0.this.h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int d = g0.this.d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (!collection.contains(g0.this.b(i, 1))) {
                    g0.this.h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return g0.this.d();
        }

        public Object[] toArray() {
            return g0.this.q(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return g0.this.r(tArr, 1);
        }
    }

    g0() {
    }

    public static <K, V> boolean j(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    public static <K, V> boolean p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract Object b(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract Map<K, V> c();

    /* access modifiers changed from: protected */
    public abstract int d();

    /* access modifiers changed from: protected */
    public abstract int e(Object obj);

    /* access modifiers changed from: protected */
    public abstract int f(Object obj);

    /* access modifiers changed from: protected */
    public abstract void g(K k, V v);

    /* access modifiers changed from: protected */
    public abstract void h(int i);

    /* access modifiers changed from: protected */
    public abstract V i(int i, V v);

    public Set<Map.Entry<K, V>> l() {
        if (this.a == null) {
            this.a = new b();
        }
        return this.a;
    }

    public Set<K> m() {
        if (this.b == null) {
            this.b = new c();
        }
        return this.b;
    }

    public Collection<V> n() {
        if (this.c == null) {
            this.c = new e();
        }
        return this.c;
    }

    public Object[] q(int i) {
        int d2 = d();
        Object[] objArr = new Object[d2];
        for (int i2 = 0; i2 < d2; i2++) {
            objArr[i2] = b(i2, i);
        }
        return objArr;
    }

    public <T> T[] r(T[] tArr, int i) {
        int d2 = d();
        if (tArr.length < d2) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), d2);
        }
        for (int i2 = 0; i2 < d2; i2++) {
            tArr[i2] = b(i2, i);
        }
        if (tArr.length > d2) {
            tArr[d2] = null;
        }
        return tArr;
    }
}
