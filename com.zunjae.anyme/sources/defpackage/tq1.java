package defpackage;

import java.util.Map;
import java.util.Set;

/* renamed from: tq1  reason: default package */
interface tq1 {
    public static final tq1 a = new a();

    /* renamed from: tq1$a */
    static class a implements tq1 {
        a() {
        }

        public Map<Class<?>, Set<rq1>> a(Object obj) {
            return oq1.b(obj);
        }

        public Map<Class<?>, sq1> b(Object obj) {
            return oq1.a(obj);
        }
    }

    Map<Class<?>, Set<rq1>> a(Object obj);

    Map<Class<?>, sq1> b(Object obj);
}
