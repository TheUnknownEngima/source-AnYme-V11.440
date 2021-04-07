package defpackage;

import java.util.Map;

/* renamed from: rl0  reason: default package */
final class rl0<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, pl0> e;

    private rl0(Map.Entry<K, pl0> entry) {
        this.e = entry;
    }

    public final pl0 a() {
        return this.e.getValue();
    }

    public final K getKey() {
        return this.e.getKey();
    }

    public final Object getValue() {
        if (this.e.getValue() == null) {
            return null;
        }
        pl0.e();
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof pm0) {
            return this.e.getValue().b((pm0) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
