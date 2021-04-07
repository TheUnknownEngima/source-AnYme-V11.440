package defpackage;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: yb0  reason: default package */
public abstract class yb0<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] e = new Object[0];

    yb0() {
    }

    /* access modifiers changed from: package-private */
    public int a(Object[] objArr, int i) {
        pc0 pc0 = (pc0) iterator();
        while (pc0.hasNext()) {
            objArr[i] = pc0.next();
            i++;
        }
        return i;
    }

    @Deprecated
    public final boolean add(E e2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public abstract pc0<E> iterator();

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(@NullableDecl Object obj);

    /* access modifiers changed from: package-private */
    @NullableDecl
    public Object[] d() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public int g() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int h() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(e);
    }

    public final <T> T[] toArray(T[] tArr) {
        sb0.a(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] d = d();
            if (d != null) {
                return Arrays.copyOfRange(d, g(), h(), tArr.getClass());
            }
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        a(tArr, 0);
        return tArr;
    }
}
