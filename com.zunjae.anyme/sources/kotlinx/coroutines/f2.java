package kotlinx.coroutines;

final class f2 implements Runnable {
    private final a0 e;
    private final i<u22> f;

    public f2(a0 a0Var, i<? super u22> iVar) {
        v62.f(a0Var, "dispatcher");
        v62.f(iVar, "continuation");
        this.e = a0Var;
        this.f = iVar;
    }

    public void run() {
        this.f.j(this.e, u22.a);
    }
}
