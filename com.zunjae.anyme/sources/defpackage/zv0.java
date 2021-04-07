package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: zv0  reason: default package */
public abstract class zv0<K, V> implements Serializable, Map<K, V> {
    private transient dw0<Map.Entry<K, V>> e;
    private transient dw0<K> f;
    private transient uv0<V> g;

    zv0() {
    }

    /* access modifiers changed from: package-private */
    public abstract dw0<Map.Entry<K, V>> a();

    /* access modifiers changed from: package-private */
    public abstract dw0<K> b();

    /* access modifiers changed from: package-private */
    public abstract uv0<V> c();

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(@NullableDecl Object obj) {
        return ((uv0) values()).contains(obj);
    }

    public /* synthetic */ Set entrySet() {
        dw0<Map.Entry<K, V>> dw0 = this.e;
        if (dw0 != null) {
            return dw0;
        }
        dw0<Map.Entry<K, V>> a = a();
        this.e = a;
        return a;
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
        return ow0.a((dw0) entrySet());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public /* synthetic */ Set keySet() {
        dw0<K> dw0 = this.f;
        if (dw0 != null) {
            return dw0;
        }
        dw0<K> b = b();
        this.f = b;
        return b;
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
        if (size >= 0) {
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
        StringBuilder sb2 = new StringBuilder("size".length() + 40);
        sb2.append("size");
        sb2.append(" cannot be negative but was: ");
        sb2.append(size);
        throw new IllegalArgumentException(sb2.toString());
    }

    public /* synthetic */ Collection values() {
        uv0<V> uv0 = this.g;
        if (uv0 != null) {
            return uv0;
        }
        uv0<V> c = c();
        this.g = c;
        return c;
    }
}
