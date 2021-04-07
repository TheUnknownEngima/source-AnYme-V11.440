package androidx.lifecycle;

public class c0 {
    private final a a;
    private final d0 b;

    public interface a {
        <T extends a0> T a(Class<T> cls);
    }

    static abstract class b extends c implements a {
        b() {
        }

        public <T extends a0> T a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        public abstract <T extends a0> T c(String str, Class<T> cls);
    }

    static class c {
        c() {
        }

        /* access modifiers changed from: package-private */
        public void b(a0 a0Var) {
        }
    }

    public c0(d0 d0Var, a aVar) {
        this.a = aVar;
        this.b = d0Var;
    }

    public <T extends a0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends a0> T b(String str, Class<T> cls) {
        T b2 = this.b.b(str);
        if (cls.isInstance(b2)) {
            a aVar = this.a;
            if (aVar instanceof c) {
                ((c) aVar).b(b2);
            }
            return b2;
        }
        a aVar2 = this.a;
        T c2 = aVar2 instanceof b ? ((b) aVar2).c(str, cls) : aVar2.a(cls);
        this.b.d(str, c2);
        return c2;
    }
}
