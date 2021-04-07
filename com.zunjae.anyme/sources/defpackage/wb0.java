package defpackage;

import java.util.NoSuchElementException;

/* renamed from: wb0  reason: default package */
abstract class wb0<E> extends oc0<E> {
    private final int e;
    private int f;

    protected wb0(int i, int i2) {
        sb0.e(i2, i);
        this.e = i;
        this.f = i2;
    }

    /* access modifiers changed from: protected */
    public abstract E a(int i);

    public final boolean hasNext() {
        return this.f < this.e;
    }

    public final boolean hasPrevious() {
        return this.f > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f;
            this.f = i + 1;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f - 1;
            this.f = i;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f - 1;
    }
}
