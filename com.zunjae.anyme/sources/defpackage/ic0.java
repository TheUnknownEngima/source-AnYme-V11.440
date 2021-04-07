package defpackage;

import java.util.Map;

/* renamed from: ic0  reason: default package */
final class ic0<K, V> extends hc0<Map.Entry<K, V>> {
    private final transient dc0<K, V> g;
    /* access modifiers changed from: private */
    public final transient Object[] h;
    /* access modifiers changed from: private */
    public final transient int i = 0;

    ic0(dc0<K, V> dc0, Object[] objArr, int i2, int i3) {
        this.g = dc0;
        this.h = objArr;
    }

    /* access modifiers changed from: package-private */
    public final int a(Object[] objArr, int i2) {
        return i().a(objArr, i2);
    }

    /* renamed from: c */
    public final pc0<Map.Entry<K, V>> iterator() {
        return (pc0) i().iterator();
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
    public final zb0<Map.Entry<K, V>> j() {
        return new lc0(this);
    }

    public final int size() {
        return this.i;
    }
}
