package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: sm0  reason: default package */
final class sm0<T> implements dn0<T> {
    private final vn0<?, ?> a;
    private final boolean b;
    private final rk0<?> c;

    private sm0(vn0<?, ?> vn0, rk0<?> rk0, pm0 pm0) {
        this.a = vn0;
        this.b = rk0.d(pm0);
        this.c = rk0;
    }

    static <T> sm0<T> a(vn0<?, ?> vn0, rk0<?> rk0, pm0 pm0) {
        return new sm0<>(vn0, rk0, pm0);
    }

    public final boolean b(T t, T t2) {
        if (!this.a.g(t).equals(this.a.g(t2))) {
            return false;
        }
        if (this.b) {
            return this.c.c(t).equals(this.c.c(t2));
        }
        return true;
    }

    public final int c(T t) {
        int hashCode = this.a.g(t).hashCode();
        return this.b ? (hashCode * 53) + this.c.c(t).hashCode() : hashCode;
    }

    public final boolean d(T t) {
        return this.c.c(t).c();
    }

    public final void e(T t, T t2) {
        fn0.f(this.a, t, t2);
        if (this.b) {
            fn0.d(this.c, t, t2);
        }
    }

    public final void f(T t, qo0 qo0) {
        Iterator<Map.Entry<?, Object>> d = this.c.c(t).d();
        while (d.hasNext()) {
            Map.Entry next = d.next();
            yk0 yk0 = (yk0) next.getKey();
            if (yk0.y() != ro0.MESSAGE || yk0.i0() || yk0.q0()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            qo0.B(yk0.zzgj(), next instanceof rl0 ? ((rl0) next).a().c() : next.getValue());
        }
        vn0<?, ?> vn0 = this.a;
        vn0.b(vn0.g(t), qo0);
    }

    public final void g(T t) {
        this.a.e(t);
        this.c.f(t);
    }

    public final int h(T t) {
        vn0<?, ?> vn0 = this.a;
        int h = vn0.h(vn0.g(t)) + 0;
        return this.b ? h + this.c.c(t).s() : h;
    }
}
