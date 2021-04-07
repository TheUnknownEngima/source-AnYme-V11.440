package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: h11  reason: default package */
final class h11 implements Iterator<Map.Entry<K, V>> {
    private int e;
    private boolean f;
    private Iterator<Map.Entry<K, V>> g;
    private final /* synthetic */ z01 h;

    private h11(z01 z01) {
        this.h = z01;
        this.e = -1;
    }

    /* synthetic */ h11(z01 z01, x01 x01) {
        this(z01);
    }

    private final Iterator<Map.Entry<K, V>> a() {
        if (this.g == null) {
            this.g = this.h.g.entrySet().iterator();
        }
        return this.g;
    }

    public final boolean hasNext() {
        return this.e + 1 < this.h.f.size() || (!this.h.g.isEmpty() && a().hasNext());
    }

    public final /* synthetic */ Object next() {
        this.f = true;
        int i = this.e + 1;
        this.e = i;
        return (Map.Entry) (i < this.h.f.size() ? this.h.f.get(this.e) : a().next());
    }

    public final void remove() {
        if (this.f) {
            this.f = false;
            this.h.p();
            if (this.e < this.h.f.size()) {
                z01 z01 = this.h;
                int i = this.e;
                this.e = i - 1;
                Object unused = z01.k(i);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
