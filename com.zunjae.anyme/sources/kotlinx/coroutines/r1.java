package kotlinx.coroutines;

public class r1 extends w1 implements r {
    private final boolean f = p0();

    public r1(o1 o1Var) {
        super(true);
        O(o1Var);
    }

    private final boolean p0() {
        w1 w1Var;
        n nVar = this.parentHandle;
        if (!(nVar instanceof o)) {
            nVar = null;
        }
        o oVar = (o) nVar;
        if (!(oVar == null || (w1Var = (w1) oVar.h) == null)) {
            while (!w1Var.D()) {
                n nVar2 = w1Var.parentHandle;
                if (!(nVar2 instanceof o)) {
                    nVar2 = null;
                }
                o oVar2 = (o) nVar2;
                if (oVar2 != null) {
                    w1Var = (w1) oVar2.h;
                    if (w1Var == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean D() {
        return this.f;
    }

    public boolean E() {
        return true;
    }
}
