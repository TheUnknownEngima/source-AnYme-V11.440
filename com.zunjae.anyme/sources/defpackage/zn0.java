package defpackage;

import java.util.ListIterator;

/* renamed from: zn0  reason: default package */
final class zn0 implements ListIterator<String> {
    private ListIterator<String> e = this.g.e.listIterator(this.f);
    private final /* synthetic */ int f;
    private final /* synthetic */ ao0 g;

    zn0(ao0 ao0, int i) {
        this.g = ao0;
        this.f = i;
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.e.hasNext();
    }

    public final boolean hasPrevious() {
        return this.e.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return this.e.next();
    }

    public final int nextIndex() {
        return this.e.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return this.e.previous();
    }

    public final int previousIndex() {
        return this.e.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
