package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: lv0  reason: default package */
abstract class lv0<T> implements Iterator<T> {
    private int e;
    private int f;
    private int g;
    private final /* synthetic */ iv0 h;

    private lv0(iv0 iv0) {
        this.h = iv0;
        this.e = this.h.i;
        this.f = this.h.p();
        this.g = -1;
    }

    /* synthetic */ lv0(iv0 iv0, hv0 hv0) {
        this(iv0);
    }

    private final void b() {
        if (this.h.i != this.e) {
            throw new ConcurrentModificationException();
        }
    }

    /* access modifiers changed from: package-private */
    public abstract T a(int i);

    public boolean hasNext() {
        return this.f >= 0;
    }

    public T next() {
        b();
        if (hasNext()) {
            int i = this.f;
            this.g = i;
            T a = a(i);
            this.f = this.h.a(this.f);
            return a;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        b();
        tu0.h(this.g >= 0, "no calls to next() since the last call to remove()");
        this.e += 32;
        iv0 iv0 = this.h;
        iv0.remove(iv0.g[this.g]);
        this.f = iv0.h(this.f, this.g);
        this.g = -1;
    }
}
