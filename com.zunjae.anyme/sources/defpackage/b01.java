package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: b01  reason: default package */
final class b01 implements xz0 {
    b01() {
    }

    public final Map<?, ?> a(Object obj) {
        return (zz0) obj;
    }

    public final Object b(Object obj) {
        ((zz0) obj).f();
        return obj;
    }

    public final boolean c(Object obj) {
        return !((zz0) obj).g();
    }

    public final Map<?, ?> d(Object obj) {
        return (zz0) obj;
    }

    public final Object e(Object obj, Object obj2) {
        zz0 zz0 = (zz0) obj;
        zz0 zz02 = (zz0) obj2;
        if (!zz02.isEmpty()) {
            if (!zz0.g()) {
                zz0 = zz0.e();
            }
            zz0.d(zz02);
        }
        return zz0;
    }

    public final vz0<?, ?> f(Object obj) {
        wz0 wz0 = (wz0) obj;
        throw new NoSuchMethodError();
    }

    public final Object g(Object obj) {
        return zz0.c().e();
    }

    public final int h(int i, Object obj, Object obj2) {
        zz0 zz0 = (zz0) obj;
        wz0 wz0 = (wz0) obj2;
        if (zz0.isEmpty()) {
            return 0;
        }
        Iterator it = zz0.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
