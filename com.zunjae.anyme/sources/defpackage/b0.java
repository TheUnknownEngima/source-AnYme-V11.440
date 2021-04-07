package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: b0  reason: default package */
public class b0<K, V> extends h0<K, V> implements Map<K, V> {
    g0<K, V> l;

    /* renamed from: b0$a */
    class a extends g0<K, V> {
        a() {
        }

        /* access modifiers changed from: protected */
        public void a() {
            b0.this.clear();
        }

        /* access modifiers changed from: protected */
        public Object b(int i, int i2) {
            return b0.this.f[(i << 1) + i2];
        }

        /* access modifiers changed from: protected */
        public Map<K, V> c() {
            return b0.this;
        }

        /* access modifiers changed from: protected */
        public int d() {
            return b0.this.g;
        }

        /* access modifiers changed from: protected */
        public int e(Object obj) {
            return b0.this.f(obj);
        }

        /* access modifiers changed from: protected */
        public int f(Object obj) {
            return b0.this.h(obj);
        }

        /* access modifiers changed from: protected */
        public void g(K k, V v) {
            b0.this.put(k, v);
        }

        /* access modifiers changed from: protected */
        public void h(int i) {
            b0.this.k(i);
        }

        /* access modifiers changed from: protected */
        public V i(int i, V v) {
            return b0.this.l(i, v);
        }
    }

    public b0() {
    }

    public b0(int i) {
        super(i);
    }

    public b0(h0 h0Var) {
        super(h0Var);
    }

    private g0<K, V> n() {
        if (this.l == null) {
            this.l = new a();
        }
        return this.l;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return n().l();
    }

    public Set<K> keySet() {
        return n().m();
    }

    public boolean o(Collection<?> collection) {
        return g0.p(this, collection);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        c(this.g + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public Collection<V> values() {
        return n().n();
    }
}
