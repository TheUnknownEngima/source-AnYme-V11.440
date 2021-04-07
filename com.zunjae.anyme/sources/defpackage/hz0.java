package defpackage;

import java.util.Map;

/* renamed from: hz0  reason: default package */
final class hz0<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, fz0> e;

    private hz0(Map.Entry<K, fz0> entry) {
        this.e = entry;
    }

    public final fz0 a() {
        return this.e.getValue();
    }

    public final K getKey() {
        return this.e.getKey();
    }

    public final Object getValue() {
        if (this.e.getValue() == null) {
            return null;
        }
        fz0.e();
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof f01) {
            return this.e.getValue().a((f01) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
