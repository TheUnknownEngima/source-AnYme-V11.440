package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: lm0  reason: default package */
final class lm0 implements im0 {
    lm0() {
    }

    public final Object a(Object obj, Object obj2) {
        jm0 jm0 = (jm0) obj;
        jm0 jm02 = (jm0) obj2;
        if (!jm02.isEmpty()) {
            if (!jm0.b()) {
                jm0 = jm0.e();
            }
            jm0.c(jm02);
        }
        return jm0;
    }

    public final gm0<?, ?> b(Object obj) {
        hm0 hm0 = (hm0) obj;
        throw new NoSuchMethodError();
    }

    public final Object c(Object obj) {
        ((jm0) obj).d();
        return obj;
    }

    public final Map<?, ?> d(Object obj) {
        return (jm0) obj;
    }

    public final int e(int i, Object obj, Object obj2) {
        jm0 jm0 = (jm0) obj;
        hm0 hm0 = (hm0) obj2;
        if (jm0.isEmpty()) {
            return 0;
        }
        Iterator it = jm0.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
