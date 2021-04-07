package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: lm  reason: default package */
public final class lm {
    private static final g<Object> a = new a();

    /* renamed from: lm$a */
    class a implements g<Object> {
        a() {
        }

        public void a(Object obj) {
        }
    }

    /* renamed from: lm$b */
    class b implements d<List<T>> {
        b() {
        }

        /* renamed from: b */
        public List<T> a() {
            return new ArrayList();
        }
    }

    /* renamed from: lm$c */
    class c implements g<List<T>> {
        c() {
        }

        /* renamed from: b */
        public void a(List<T> list) {
            list.clear();
        }
    }

    /* renamed from: lm$d */
    public interface d<T> {
        T a();
    }

    /* renamed from: lm$e */
    private static final class e<T> implements r3<T> {
        private final d<T> a;
        private final g<T> b;
        private final r3<T> c;

        e(r3<T> r3Var, d<T> dVar, g<T> gVar) {
            this.c = r3Var;
            this.a = dVar;
            this.b = gVar;
        }

        public T b() {
            T b2 = this.c.b();
            if (b2 == null) {
                b2 = this.a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    "Created new " + b2.getClass();
                }
            }
            if (b2 instanceof f) {
                ((f) b2).h().b(false);
            }
            return b2;
        }

        public boolean c(T t) {
            if (t instanceof f) {
                ((f) t).h().b(true);
            }
            this.b.a(t);
            return this.c.c(t);
        }
    }

    /* renamed from: lm$f */
    public interface f {
        nm h();
    }

    /* renamed from: lm$g */
    public interface g<T> {
        void a(T t);
    }

    private static <T extends f> r3<T> a(r3<T> r3Var, d<T> dVar) {
        return b(r3Var, dVar, c());
    }

    private static <T> r3<T> b(r3<T> r3Var, d<T> dVar, g<T> gVar) {
        return new e(r3Var, dVar, gVar);
    }

    private static <T> g<T> c() {
        return a;
    }

    public static <T extends f> r3<T> d(int i, d<T> dVar) {
        return a(new t3(i), dVar);
    }

    public static <T> r3<List<T>> e() {
        return f(20);
    }

    public static <T> r3<List<T>> f(int i) {
        return b(new t3(i), new b(), new c());
    }
}
