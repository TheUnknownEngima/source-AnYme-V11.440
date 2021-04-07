package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: q01  reason: default package */
final class q01 {
    private static final q01 c = new q01();
    private final w01 a = new rz0();
    private final ConcurrentMap<Class<?>, u01<?>> b = new ConcurrentHashMap();

    private q01() {
    }

    public static q01 a() {
        return c;
    }

    public final <T> u01<T> b(Class<T> cls) {
        uy0.f(cls, "messageType");
        u01<T> u01 = (u01) this.b.get(cls);
        if (u01 != null) {
            return u01;
        }
        u01<T> a2 = this.a.a(cls);
        uy0.f(cls, "messageType");
        uy0.f(a2, "schema");
        u01<T> putIfAbsent = this.b.putIfAbsent(cls, a2);
        return putIfAbsent != null ? putIfAbsent : a2;
    }

    public final <T> u01<T> c(T t) {
        return b(t.getClass());
    }
}
