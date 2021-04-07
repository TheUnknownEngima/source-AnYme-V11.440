package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: cn0  reason: default package */
final class cn0 {
    private static final cn0 c = new cn0();
    private final gn0 a = new cm0();
    private final ConcurrentMap<Class<?>, dn0<?>> b = new ConcurrentHashMap();

    private cn0() {
    }

    public static cn0 b() {
        return c;
    }

    public final <T> dn0<T> a(Class<T> cls) {
        gl0.d(cls, "messageType");
        dn0<T> dn0 = (dn0) this.b.get(cls);
        if (dn0 != null) {
            return dn0;
        }
        dn0<T> a2 = this.a.a(cls);
        gl0.d(cls, "messageType");
        gl0.d(a2, "schema");
        dn0<T> putIfAbsent = this.b.putIfAbsent(cls, a2);
        return putIfAbsent != null ? putIfAbsent : a2;
    }

    public final <T> dn0<T> c(T t) {
        return a(t.getClass());
    }
}
