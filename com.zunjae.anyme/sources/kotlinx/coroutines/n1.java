package kotlinx.coroutines;

final class n1 extends v1<o1> {
    private final z52<Throwable, u22> i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n1(o1 o1Var, z52<? super Throwable, u22> z52) {
        super(o1Var);
        v62.f(o1Var, "job");
        v62.f(z52, "handler");
        this.i = z52;
    }

    public /* bridge */ /* synthetic */ Object r(Object obj) {
        y((Throwable) obj);
        return u22.a;
    }

    public String toString() {
        return "InvokeOnCompletion[" + l0.a(this) + '@' + l0.b(this) + ']';
    }

    public void y(Throwable th) {
        this.i.r(th);
    }
}
