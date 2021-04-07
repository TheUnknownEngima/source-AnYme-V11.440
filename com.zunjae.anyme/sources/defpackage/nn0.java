package defpackage;

import java.util.Map;

/* renamed from: nn0  reason: default package */
final class nn0 implements Comparable<nn0>, Map.Entry<K, V> {
    private final K e;
    private V f;
    private final /* synthetic */ in0 g;

    nn0(in0 in0, K k, V v) {
        this.g = in0;
        this.e = k;
        this.f = v;
    }

    nn0(in0 in0, Map.Entry<K, V> entry) {
        this(in0, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((nn0) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return a(this.e, entry.getKey()) && a(this.f, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.e;
    }

    public final V getValue() {
        return this.f;
    }

    public final int hashCode() {
        K k = this.e;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.f;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    public final V setValue(V v) {
        this.g.p();
        V v2 = this.f;
        this.f = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.e);
        String valueOf2 = String.valueOf(this.f);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
