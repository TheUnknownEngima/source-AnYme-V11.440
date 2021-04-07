package defpackage;

import java.util.Iterator;

/* renamed from: t11  reason: default package */
final class t11 implements Iterator<String> {
    private Iterator<String> e = this.f.e.iterator();
    private final /* synthetic */ r11 f;

    t11(r11 r11) {
        this.f = r11;
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
