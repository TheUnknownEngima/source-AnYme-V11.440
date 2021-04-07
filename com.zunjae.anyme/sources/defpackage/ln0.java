package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: ln0  reason: default package */
final class ln0 implements Iterator<Object> {
    ln0() {
    }

    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
