package defpackage;

import com.bumptech.glide.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ch  reason: default package */
public class ch {
    private final eh a;
    private final a b;

    /* renamed from: ch$a */
    private static class a {
        private final Map<Class<?>, C0069a<?>> a = new HashMap();

        /* renamed from: ch$a$a  reason: collision with other inner class name */
        private static class C0069a<Model> {
            final List<ah<Model, ?>> a;

            public C0069a(List<ah<Model, ?>> list) {
                this.a = list;
            }
        }

        a() {
        }

        public void a() {
            this.a.clear();
        }

        public <Model> List<ah<Model, ?>> b(Class<Model> cls) {
            C0069a aVar = this.a.get(cls);
            if (aVar == null) {
                return null;
            }
            return aVar.a;
        }

        public <Model> void c(Class<Model> cls, List<ah<Model, ?>> list) {
            if (this.a.put(cls, new C0069a(list)) != null) {
                throw new IllegalStateException("Already cached loaders for model: " + cls);
            }
        }
    }

    private ch(eh ehVar) {
        this.b = new a();
        this.a = ehVar;
    }

    public ch(r3<List<Throwable>> r3Var) {
        this(new eh(r3Var));
    }

    private static <A> Class<A> b(A a2) {
        return a2.getClass();
    }

    private synchronized <A> List<ah<A, ?>> e(Class<A> cls) {
        List<ah<A, ?>> b2;
        b2 = this.b.b(cls);
        if (b2 == null) {
            b2 = Collections.unmodifiableList(this.a.e(cls));
            this.b.c(cls, b2);
        }
        return b2;
    }

    public synchronized <Model, Data> void a(Class<Model> cls, Class<Data> cls2, bh<? extends Model, ? extends Data> bhVar) {
        this.a.b(cls, cls2, bhVar);
        this.b.a();
    }

    public synchronized List<Class<?>> c(Class<?> cls) {
        return this.a.g(cls);
    }

    public <A> List<ah<A, ?>> d(A a2) {
        List e = e(b(a2));
        if (!e.isEmpty()) {
            int size = e.size();
            List<ah<A, ?>> emptyList = Collections.emptyList();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                ah ahVar = (ah) e.get(i);
                if (ahVar.a(a2)) {
                    if (z) {
                        emptyList = new ArrayList<>(size - i);
                        z = false;
                    }
                    emptyList.add(ahVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new h.c(a2, e);
        }
        throw new h.c(a2);
    }
}
