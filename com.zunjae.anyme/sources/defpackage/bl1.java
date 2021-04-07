package defpackage;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: bl1  reason: default package */
final class bl1<E> extends yi1<E> implements RandomAccess {
    private static final bl1<Object> h;
    private E[] f;
    private int g;

    static {
        bl1<Object> bl1 = new bl1<>(new Object[0], 0);
        h = bl1;
        bl1.s();
    }

    private bl1(E[] eArr, int i) {
        this.f = eArr;
        this.g = i;
    }

    private static <E> E[] c(int i) {
        return new Object[i];
    }

    public static <E> bl1<E> d() {
        return h;
    }

    private void g(int i) {
        if (i < 0 || i >= this.g) {
            throw new IndexOutOfBoundsException(h(i));
        }
    }

    private String h(int i) {
        return "Index:" + i + ", Size:" + this.g;
    }

    public void add(int i, E e) {
        int i2;
        a();
        if (i < 0 || i > (i2 = this.g)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        E[] eArr = this.f;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] c = c(((i2 * 3) / 2) + 1);
            System.arraycopy(this.f, 0, c, 0, i);
            System.arraycopy(this.f, i, c, i + 1, this.g - i);
            this.f = c;
        }
        this.f[i] = e;
        this.g++;
        this.modCount++;
    }

    public boolean add(E e) {
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

    public E get(int i) {
        g(i);
        return this.f[i];
    }

    /* renamed from: i */
    public bl1<E> w(int i) {
        if (i >= this.g) {
            return new bl1<>(Arrays.copyOf(this.f, i), this.g);
        }
        throw new IllegalArgumentException();
    }

    public E remove(int i) {
        a();
        g(i);
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

    public E set(int i, E e) {
        a();
        g(i);
        E[] eArr = this.f;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public int size() {
        return this.g;
    }
}
