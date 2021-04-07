package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: w22  reason: default package */
final class w22<T> implements Collection<T>, j72 {
    private final T[] e;
    private final boolean f;

    public w22(T[] tArr, boolean z) {
        v62.e(tArr, "values");
        this.e = tArr;
        this.f = z;
    }

    public int a() {
        return this.e.length;
    }

    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return b32.g(this.e, obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        v62.e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return this.e.length == 0;
    }

    public Iterator<T> iterator() {
        return m62.a(this.e);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return a();
    }

    public final Object[] toArray() {
        return e32.a(this.e, this.f);
    }

    public <T> T[] toArray(T[] tArr) {
        return q62.b(this, tArr);
    }
}
