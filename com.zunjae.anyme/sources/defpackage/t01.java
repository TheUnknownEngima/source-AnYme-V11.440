package defpackage;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: t01  reason: default package */
final class t01<E> extends fx0<E> implements RandomAccess {
    private static final t01<Object> h;
    private E[] f;
    private int g;

    static {
        t01<Object> t01 = new t01<>(new Object[0], 0);
        h = t01;
        t01.f0();
    }

    private t01(E[] eArr, int i) {
        this.f = eArr;
        this.g = i;
    }

    private final void c(int i) {
        if (i < 0 || i >= this.g) {
            throw new IndexOutOfBoundsException(d(i));
        }
    }

    private final String d(int i) {
        int i2 = this.g;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public static <E> t01<E> g() {
        return h;
    }

    public final void add(int i, E e) {
        int i2;
        a();
        if (i < 0 || i > (i2 = this.g)) {
            throw new IndexOutOfBoundsException(d(i));
        }
        E[] eArr = this.f;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f, i, eArr2, i + 1, this.g - i);
            this.f = eArr2;
        }
        this.f[i] = e;
        this.g++;
        this.modCount++;
    }

    public final boolean add(E e) {
        a();
        int i = this.g;
        E[] eArr = this.f;
        if (i == eArr.length) {
            this.f = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f;
        int i2 = this.g;
        this.g = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    public final /* synthetic */ bz0 f(int i) {
        if (i >= this.g) {
            return new t01(Arrays.copyOf(this.f, i), this.g);
        }
        throw new IllegalArgumentException();
    }

    public final E get(int i) {
        c(i);
        return this.f[i];
    }

    public final E remove(int i) {
        a();
        c(i);
        E[] eArr = this.f;
        E e = eArr[i];
        int i2 = this.g;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.g--;
        this.modCount++;
        return e;
    }

    public final E set(int i, E e) {
        a();
        c(i);
        E[] eArr = this.f;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.g;
    }
}
