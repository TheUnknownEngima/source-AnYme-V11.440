package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: b11  reason: default package */
final class b11 implements Iterator<Map.Entry<K, V>> {
    private int e;
    private Iterator<Map.Entry<K, V>> f;
    private final /* synthetic */ z01 g;

    private b11(z01 z01) {
        this.g = z01;
        this.e = this.g.f.size();
    }

    /* synthetic */ b11(z01 z01, x01 x01) {
        this(z01);
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
            List g2 = this.g.f;
            int i = this.e - 1;
            this.e = i;
            obj = g2.get(i);
        }
        return (Map.Entry) obj;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
