package kotlinx.coroutines;

public final class o extends q1<w1> implements n {
    public final p i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(w1 w1Var, p pVar) {
        super(w1Var);
        v62.f(w1Var, "parent");
        v62.f(pVar, "childJob");
        this.i = pVar;
    }

    public boolean e(Throwable th) {
        v62.f(th, "cause");
        return ((w1) this.h).s(th);
    }

    public /* bridge */ /* synthetic */ Object r(Object obj) {
        y((Throwable) obj);
        return u22.a;
    }

    public String toString() {
        return "ChildHandle[" + this.i + ']';
    }

    public void y(Throwable th) {
        this.i.C((d2) this.h);
    }
}
