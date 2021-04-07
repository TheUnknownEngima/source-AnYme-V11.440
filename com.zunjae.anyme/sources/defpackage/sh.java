package defpackage;

/* renamed from: sh  reason: default package */
public class sh<T> implements Cif<T> {
    protected final T e;

    public sh(T t) {
        jm.d(t);
        this.e = t;
    }

    public void a() {
    }

    public final int c() {
        return 1;
    }

    public Class<T> d() {
        return this.e.getClass();
    }

    public final T get() {
        return this.e;
    }
}
