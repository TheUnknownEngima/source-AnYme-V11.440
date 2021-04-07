package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: l62  reason: default package */
final class l62<T> implements Iterator<T>, j72 {
    private int e;
    private final T[] f;

    public l62(T[] tArr) {
        v62.e(tArr, "array");
        this.f = tArr;
    }

    public boolean hasNext() {
        return this.e < this.f.length;
    }

    public T next() {
        try {
            T[] tArr = this.f;
            int i = this.e;
            this.e = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.e--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
