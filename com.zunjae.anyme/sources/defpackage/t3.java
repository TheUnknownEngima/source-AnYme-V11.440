package defpackage;

/* renamed from: t3  reason: default package */
public class t3<T> extends s3<T> {
    private final Object c = new Object();

    public t3(int i) {
        super(i);
    }

    public T b() {
        T b;
        synchronized (this.c) {
            b = super.b();
        }
        return b;
    }

    public boolean c(T t) {
        boolean c2;
        synchronized (this.c) {
            c2 = super.c(t);
        }
        return c2;
    }
}
