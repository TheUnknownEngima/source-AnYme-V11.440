package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: dc0  reason: default package */
public abstract class dc0<K, V> implements Serializable, Map<K, V> {
    private transient hc0<Map.Entry<K, V>> e;
    private transient hc0<K> f;
    private transient yb0<V> g;

    dc0() {
    }

    public static <K, V> dc0<K, V> a() {
        return jc0.i;
    }

    /* access modifiers changed from: package-private */
    public abstract hc0<Map.Entry<K, V>> b();

    /* access modifiers changed from: package-private */
    public abstract hc0<K> c();

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(@NullableDecl Object obj) {
        return ((yb0) values()).contains(obj);
    }

    /* access modifiers changed from: package-private */
    public abstract yb0<V> d();

    public /* synthetic */ Set entrySet() {
        hc0<Map.Entry<K, V>> hc0 = this.e;
        if (hc0 != null) {
            return hc0;
        }
        hc0<Map.Entry<K, V>> b = b();
        this.e = b;
        return b;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public abstract V get(@NullableDecl Object obj);

    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    public int hashCode() {
        return mc0.b((hc0) entrySet());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public /* synthetic */ Set keySet() {
        hc0<K> hc0 = this.f;
        if (hc0 != null) {
            return hc0;
        }
        hc0<K> c = c();
        this.f = c;
        return c;
    }

    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        int size = size();
        vb0.a(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) << 3, 1073741824));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ Collection values() {
        yb0<V> yb0 = this.g;
        if (yb0 != null) {
            return yb0;
        }
        yb0<V> d = d();
        this.g = d;
        return d;
    }
}
