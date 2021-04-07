package defpackage;

import java.util.Iterator;

/* renamed from: do0  reason: default package */
final class do0 implements Iterator<String> {
    private Iterator<String> e = this.f.e.iterator();
    private final /* synthetic */ ao0 f;

    do0(ao0 ao0) {
        this.f = ao0;
    }

    public final boolean hasNext() {
        return this.e.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.e.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
