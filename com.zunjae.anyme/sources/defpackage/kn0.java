package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: kn0  reason: default package */
final class kn0 implements Iterator<Map.Entry<K, V>> {
    private int e;
    private Iterator<Map.Entry<K, V>> f;
    private final /* synthetic */ in0 g;

    private kn0(in0 in0) {
        this.g = in0;
        this.e = this.g.f.size();
    }

    /* synthetic */ kn0(in0 in0, hn0 hn0) {
        this(in0);
    }

    private final Iterator<Map.Entry<K, V>> a() {
        if (this.f == null) {
            this.f = this.g.j.entrySet().iterator();
        }
        return this.f;
    }

    public final boolean hasNext() {
        int i = this.e;
        return (i > 0 && i <= this.g.f.size()) || a().hasNext();
    }

    public final /* synthetic */ Object next() {
        Object obj;
        if (a().hasNext()) {
            obj = a().next();
        } else {
            List f2 = this.g.f;
            int i = this.e - 1;
            this.e = i;
            obj = f2.get(i);
        }
        return (Map.Entry) obj;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
