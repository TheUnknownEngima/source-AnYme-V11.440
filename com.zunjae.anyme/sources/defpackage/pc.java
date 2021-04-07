package defpackage;

/* renamed from: pc  reason: default package */
public class pc<T> {
    private final T a;
    private final Throwable b;

    public pc(T t) {
        this.a = t;
        this.b = null;
    }

    public pc(T t, Throwable th) {
        this.a = t;
        this.b = th;
    }

    public T a() {
        return this.a;
    }

    public Throwable b() {
        return this.b;
    }
}
