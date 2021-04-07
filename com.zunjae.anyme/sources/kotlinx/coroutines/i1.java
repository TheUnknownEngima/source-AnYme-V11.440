package kotlinx.coroutines;

public final class i1 implements j1 {
    private final a2 e;

    public i1(a2 a2Var) {
        v62.f(a2Var, "list");
        this.e = a2Var;
    }

    public a2 a() {
        return this.e;
    }

    public boolean b() {
        return false;
    }

    public String toString() {
        return k0.c() ? a().y("New") : super.toString();
    }
}
