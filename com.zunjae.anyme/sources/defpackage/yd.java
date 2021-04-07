package defpackage;

import defpackage.xd;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: yd  reason: default package */
public class yd {
    private static final xd.a<?> b = new a();
    private final Map<Class<?>, xd.a<?>> a = new HashMap();

    /* renamed from: yd$a */
    class a implements xd.a<Object> {
        a() {
        }

        public Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        public xd<Object> b(Object obj) {
            return new b(obj);
        }
    }

    /* renamed from: yd$b */
    private static final class b implements xd<Object> {
        private final Object a;

        b(Object obj) {
            this.a = obj;
        }

        public Object a() {
            return this.a;
        }

        public void b() {
        }
    }

    public synchronized <T> xd<T> a(T t) {
        xd.a<?> aVar;
        jm.d(t);
        aVar = this.a.get(t.getClass());
        if (aVar == null) {
            Iterator<xd.a<?>> it = this.a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                xd.a<?> next = it.next();
                if (next.a().isAssignableFrom(t.getClass())) {
                    aVar = next;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = b;
        }
        return aVar.b(t);
    }

    public synchronized void b(xd.a<?> aVar) {
        this.a.put(aVar.a(), aVar);
    }
}
