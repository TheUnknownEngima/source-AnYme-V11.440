package kotlinx.coroutines;

public final class k2 {
    private static final ThreadLocal<z0> a = new ThreadLocal<>();
    public static final k2 b = new k2();

    private k2() {
    }

    public final z0 a() {
        z0 z0Var = a.get();
        if (z0Var != null) {
            return z0Var;
        }
        z0 a2 = c1.a();
        a.set(a2);
        return a2;
    }

    public final void b() {
        a.set((Object) null);
    }

    public final void c(z0 z0Var) {
        v62.f(z0Var, "eventLoop");
        a.set(z0Var);
    }
}
