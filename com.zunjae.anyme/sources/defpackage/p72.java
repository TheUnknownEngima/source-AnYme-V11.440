package defpackage;

/* renamed from: p72  reason: default package */
final class p72<T> implements q72<Object, T> {
    private T a;

    public void a(Object obj, d82<?> d82, T t) {
        v62.e(d82, "property");
        v62.e(t, "value");
        this.a = t;
    }

    public T b(Object obj, d82<?> d82) {
        v62.e(d82, "property");
        T t = this.a;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Property " + d82.a() + " should be initialized before get.");
    }
}
