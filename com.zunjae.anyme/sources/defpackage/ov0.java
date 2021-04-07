package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: ov0  reason: default package */
final class ov0 extends AbstractSet<K> {
    private final /* synthetic */ iv0 e;

    ov0(iv0 iv0) {
        this.e = iv0;
    }

    public final void clear() {
        this.e.clear();
    }

    public final boolean contains(Object obj) {
        return this.e.containsKey(obj);
    }

    public final Iterator<K> iterator() {
        return this.e.r();
    }

    public final boolean remove(@NullableDecl Object obj) {
        Map l = this.e.l();
        return l != null ? l.keySet().remove(obj) : this.e.k(obj) != iv0.n;
    }

    public final int size() {
        return this.e.size();
    }
}
