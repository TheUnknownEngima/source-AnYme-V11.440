package defpackage;

/* renamed from: o02  reason: default package */
public final class o02<T> implements n02<T> {
    private final T a;

    private o02(T t) {
        this.a = t;
    }

    public static <T> n02<T> a(T t) {
        p02.c(t, "instance cannot be null");
        return new o02(t);
    }

    public T get() {
        return this.a;
    }
}
