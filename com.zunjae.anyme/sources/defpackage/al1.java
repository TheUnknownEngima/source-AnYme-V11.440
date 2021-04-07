package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: al1  reason: default package */
final class al1 {
    private static final al1 c = new al1();
    private final fl1 a = new gk1();
    private final ConcurrentMap<Class<?>, el1<?>> b = new ConcurrentHashMap();

    private al1() {
    }

    public static al1 a() {
        return c;
    }

    public <T> void b(T t, dl1 dl1, mj1 mj1) {
        e(t).g(t, dl1, mj1);
    }

    public el1<?> c(Class<?> cls, el1<?> el1) {
        xj1.b(cls, "messageType");
        xj1.b(el1, "schema");
        return this.b.putIfAbsent(cls, el1);
    }

    public <T> el1<T> d(Class<T> cls) {
        xj1.b(cls, "messageType");
        el1<T> el1 = (el1) this.b.get(cls);
        if (el1 != null) {
            return el1;
        }
        el1<T> a2 = this.a.a(cls);
        el1<?> c2 = c(cls, a2);
        return c2 != null ? c2 : a2;
    }

    public <T> el1<T> e(T t) {
        return d(t.getClass());
    }
}
