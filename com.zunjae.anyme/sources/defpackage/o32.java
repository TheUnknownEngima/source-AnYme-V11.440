package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: o32  reason: default package */
public final class o32 implements ListIterator, j72 {
    public static final o32 e = new o32();

    private o32() {
    }

    public Void a() {
        throw new NoSuchElementException();
    }

    public /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Void b() {
        throw new NoSuchElementException();
    }

    public boolean hasNext() {
        return false;
    }

    public boolean hasPrevious() {
        return false;
    }

    public /* bridge */ /* synthetic */ Object next() {
        a();
        throw null;
    }

    public int nextIndex() {
        return 0;
    }

    public /* bridge */ /* synthetic */ Object previous() {
        b();
        throw null;
    }

    public int previousIndex() {
        return -1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
