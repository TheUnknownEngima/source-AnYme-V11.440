package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: mv0  reason: default package */
final class mv0 extends AbstractSet<Map.Entry<K, V>> {
    private final /* synthetic */ iv0 e;

    mv0(iv0 iv0) {
        this.e = iv0;
    }

    public final void clear() {
        this.e.clear();
    }

    public final boolean contains(@NullableDecl Object obj) {
        Map l = this.e.l();
        if (l != null) {
            return l.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int j = this.e.d(entry.getKey());
            return j != -1 && ru0.a(this.e.h[j], entry.getValue());
        }
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        return this.e.s();
    }

    public final boolean remove(@NullableDecl Object obj) {
        Map l = this.e.l();
        if (l != null) {
            return l.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.e.g()) {
            return false;
        }
        int i = this.e.v();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object n = this.e.e;
        iv0 iv0 = this.e;
        int c = pv0.c(key, value, i, n, iv0.f, iv0.g, iv0.h);
        if (c == -1) {
            return false;
        }
        this.e.f(c, i);
        iv0.q(this.e);
        this.e.o();
        return true;
    }

    public final int size() {
        return this.e.size();
    }
}
