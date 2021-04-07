package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: c11  reason: default package */
final class c11 implements Iterator<Object> {
    c11() {
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
