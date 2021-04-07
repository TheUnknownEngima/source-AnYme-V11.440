package defpackage;

import java.util.NoSuchElementException;

/* renamed from: ew0  reason: default package */
final class ew0 extends qw0<T> {
    private boolean e;
    private final /* synthetic */ Object f;

    ew0(Object obj) {
        this.f = obj;
    }

    public final boolean hasNext() {
        return !this.e;
    }

    public final T next() {
        if (!this.e) {
            this.e = true;
            return this.f;
        }
        throw new NoSuchElementException();
    }
}
