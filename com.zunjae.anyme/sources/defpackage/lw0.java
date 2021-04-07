package defpackage;

import java.util.Map;

/* renamed from: lw0  reason: default package */
final class lw0<K, V> extends dw0<Map.Entry<K, V>> {
    private final transient zv0<K, V> g;
    /* access modifiers changed from: private */
    public final transient Object[] h;
    /* access modifiers changed from: private */
    public final transient int i;

    lw0(zv0<K, V> zv0, Object[] objArr, int i2, int i3) {
        this.g = zv0;
        this.h = objArr;
        this.i = i3;
    }

    /* access modifiers changed from: package-private */
    public final int a(Object[] objArr, int i2) {
        return k().a(objArr, i2);
    }

    /* renamed from: c */
    public final qw0<Map.Entry<K, V>> iterator() {
        return (qw0) k().iterator();
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.g.get(key));
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final tv0<Map.Entry<K, V>> l() {
        return new kw0(this);
    }

    public final int size() {
        return this.i;
    }
}
