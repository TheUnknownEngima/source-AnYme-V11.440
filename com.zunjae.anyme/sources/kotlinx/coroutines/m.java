package kotlinx.coroutines;

public final class m extends q1<o1> {
    public final j<?> i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(o1 o1Var, j<?> jVar) {
        super(o1Var);
        v62.f(o1Var, "parent");
        v62.f(jVar, "child");
        this.i = jVar;
    }

    public /* bridge */ /* synthetic */ Object r(Object obj) {
        y((Throwable) obj);
        return u22.a;
    }

    public String toString() {
        return "ChildContinuation[" + this.i + ']';
    }

    public void y(Throwable th) {
        j<?> jVar = this.i;
        jVar.o(jVar.r(this.h));
    }
}
