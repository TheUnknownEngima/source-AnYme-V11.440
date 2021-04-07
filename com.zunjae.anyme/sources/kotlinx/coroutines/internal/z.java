package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.a0;
import kotlinx.coroutines.k0;

public class z<T extends a0 & Comparable<? super T>> {
    private volatile int _size = 0;
    private T[] a;

    static {
        AtomicIntegerFieldUpdater.newUpdater(z.class, "_size");
    }

    private final T[] f() {
        T[] tArr = this.a;
        if (tArr == null) {
            T[] tArr2 = new a0[4];
            this.a = tArr2;
            return tArr2;
        } else if (c() < tArr.length) {
            return tArr;
        } else {
            T[] copyOf = Arrays.copyOf(tArr, c() * 2);
            v62.b(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            T[] tArr3 = (a0[]) copyOf;
            this.a = tArr3;
            return tArr3;
        }
    }

    private final void j(int i) {
        this._size = i;
    }

    private final void k(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 < c()) {
                T[] tArr = this.a;
                if (tArr != null) {
                    int i3 = i2 + 1;
                    if (i3 < c()) {
                        T t = tArr[i3];
                        if (t != null) {
                            Comparable comparable = (Comparable) t;
                            T t2 = tArr[i2];
                            if (t2 == null) {
                                v62.l();
                                throw null;
                            } else if (comparable.compareTo(t2) < 0) {
                                i2 = i3;
                            }
                        } else {
                            v62.l();
                            throw null;
                        }
                    }
                    T t3 = tArr[i];
                    if (t3 != null) {
                        Comparable comparable2 = (Comparable) t3;
                        T t4 = tArr[i2];
                        if (t4 == null) {
                            v62.l();
                            throw null;
                        } else if (comparable2.compareTo(t4) > 0) {
                            m(i, i2);
                            i = i2;
                        } else {
                            return;
                        }
                    } else {
                        v62.l();
                        throw null;
                    }
                } else {
                    v62.l();
                    throw null;
                }
            } else {
                return;
            }
        }
    }

    private final void l(int i) {
        while (i > 0) {
            T[] tArr = this.a;
            if (tArr != null) {
                int i2 = (i - 1) / 2;
                T t = tArr[i2];
                if (t != null) {
                    Comparable comparable = (Comparable) t;
                    T t2 = tArr[i];
                    if (t2 == null) {
                        v62.l();
                        throw null;
                    } else if (comparable.compareTo(t2) > 0) {
                        m(i, i2);
                        i = i2;
                    } else {
                        return;
                    }
                } else {
                    v62.l();
                    throw null;
                }
            } else {
                v62.l();
                throw null;
            }
        }
    }

    private final void m(int i, int i2) {
        T[] tArr = this.a;
        if (tArr != null) {
            T t = tArr[i2];
            if (t != null) {
                T t2 = tArr[i];
                if (t2 != null) {
                    tArr[i] = t;
                    tArr[i2] = t2;
                    t.h(i);
                    t2.h(i2);
                    return;
                }
                v62.l();
                throw null;
            }
            v62.l();
            throw null;
        }
        v62.l();
        throw null;
    }

    public final void a(T t) {
        v62.f(t, "node");
        if (k0.a()) {
            if (!(t.f() == null)) {
                throw new AssertionError();
            }
        }
        t.a(this);
        a0[] f = f();
        int c = c();
        j(c + 1);
        f[c] = t;
        t.h(c);
        l(c);
    }

    public final T b() {
        T[] tArr = this.a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int c() {
        return this._size;
    }

    public final boolean d() {
        return c() == 0;
    }

    public final T e() {
        T b;
        synchronized (this) {
            b = b();
        }
        return b;
    }

    public final boolean g(T t) {
        boolean z;
        v62.f(t, "node");
        synchronized (this) {
            z = true;
            boolean z2 = false;
            if (t.f() == null) {
                z = false;
            } else {
                int i = t.i();
                if (k0.a()) {
                    if (i >= 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        throw new AssertionError();
                    }
                }
                h(i);
            }
        }
        return z;
    }

    public final T h(int i) {
        boolean z = false;
        if (k0.a()) {
            if (!(c() > 0)) {
                throw new AssertionError();
            }
        }
        T[] tArr = this.a;
        if (tArr != null) {
            j(c() - 1);
            if (i < c()) {
                m(i, c());
                int i2 = (i - 1) / 2;
                if (i > 0) {
                    T t = tArr[i];
                    if (t != null) {
                        Comparable comparable = (Comparable) t;
                        T t2 = tArr[i2];
                        if (t2 == null) {
                            v62.l();
                            throw null;
                        } else if (comparable.compareTo(t2) < 0) {
                            m(i, i2);
                            l(i2);
                        }
                    } else {
                        v62.l();
                        throw null;
                    }
                }
                k(i);
            }
            T t3 = tArr[c()];
            if (t3 != null) {
                if (k0.a()) {
                    if (t3.f() == this) {
                        z = true;
                    }
                    if (!z) {
                        throw new AssertionError();
                    }
                }
                t3.a((z<?>) null);
                t3.h(-1);
                tArr[c()] = null;
                return t3;
            }
            v62.l();
            throw null;
        }
        v62.l();
        throw null;
    }

    public final T i() {
        T h;
        synchronized (this) {
            h = c() > 0 ? h(0) : null;
        }
        return h;
    }
}
