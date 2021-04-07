package defpackage;

import java.util.Collection;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: dv0  reason: default package */
abstract class dv0<K, V> implements hw0<K, V> {
    dv0() {
    }

    public boolean a(@NullableDecl Object obj) {
        for (Collection contains : zza().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hw0) {
            return zza().equals(((hw0) obj).zza());
        }
        return false;
    }

    public int hashCode() {
        return zza().hashCode();
    }

    public String toString() {
        return zza().toString();
    }

    public abstract Map<K, Collection<V>> zza();
}
