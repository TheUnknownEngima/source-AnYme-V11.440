package defpackage;

import java.util.Map;

/* renamed from: e11  reason: default package */
final class e11 implements Comparable<e11>, Map.Entry<K, V> {
    private final K e;
    private V f;
    private final /* synthetic */ z01 g;

    e11(z01 z01, K k, V v) {
        this.g = z01;
        this.e = k;
        this.f = v;
    }

    e11(z01 z01, Map.Entry<K, V> entry) {
        this(z01, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((e11) obj).getKey());
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
