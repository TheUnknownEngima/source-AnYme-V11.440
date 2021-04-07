package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: qv0  reason: default package */
final class qv0 extends AbstractCollection<V> {
    private final /* synthetic */ iv0 e;

    qv0(iv0 iv0) {
        this.e = iv0;
    }

    public final void clear() {
        this.e.clear();
    }

    public final Iterator<V> iterator() {
        return this.e.t();
    }

    public final int size() {
        return this.e.size();
    }
}
