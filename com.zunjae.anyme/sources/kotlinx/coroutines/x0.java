package kotlinx.coroutines;

final class x0 extends g {
    private final w0 e;

    public x0(w0 w0Var) {
        v62.f(w0Var, "handle");
        this.e = w0Var;
    }

    public void a(Throwable th) {
        this.e.k();
    }

    public /* bridge */ /* synthetic */ Object r(Object obj) {
        a((Throwable) obj);
        return u22.a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.e + ']';
    }
}
