package defpackage;

import defpackage.e1;
import defpackage.o1;

/* renamed from: l1  reason: default package */
public class l1 extends j1 {
    private int E0 = 0;
    private int F0 = 0;
    private int G0 = 0;
    private int H0 = 0;
    private int I0 = 0;
    private int J0 = 0;
    private boolean K0 = false;
    private int L0 = 0;
    private int M0 = 0;
    protected o1.a N0 = new o1.a();
    o1.b O0 = null;

    public void I0(boolean z) {
        int i;
        if (this.G0 > 0 || this.H0 > 0) {
            if (z) {
                this.I0 = this.H0;
                i = this.G0;
            } else {
                this.I0 = this.G0;
                i = this.H0;
            }
            this.J0 = i;
        }
    }

    public void J0() {
        for (int i = 0; i < this.D0; i++) {
            e1 e1Var = this.C0[i];
            if (e1Var != null) {
                e1Var.o0(true);
            }
        }
    }

    public int K0() {
        return this.M0;
    }

    public int L0() {
        return this.L0;
    }

    public int M0() {
        return this.F0;
    }

    public int N0() {
        return this.I0;
    }

    public int O0() {
        return this.J0;
    }

    public int P0() {
        return this.E0;
    }

    public void Q0(int i, int i2, int i3, int i4) {
    }

    /* access modifiers changed from: protected */
    public void R0(e1 e1Var, e1.b bVar, int i, e1.b bVar2, int i2) {
        while (this.O0 == null && G() != null) {
            this.O0 = ((f1) G()).T0();
        }
        o1.a aVar = this.N0;
        aVar.a = bVar;
        aVar.b = bVar2;
        aVar.c = i;
        aVar.d = i2;
        this.O0.b(e1Var, aVar);
        e1Var.C0(this.N0.e);
        e1Var.g0(this.N0.f);
        e1Var.f0(this.N0.h);
        e1Var.a0(this.N0.g);
    }

    /* access modifiers changed from: protected */
    public boolean S0() {
        e1 e1Var = this.L;
        o1.b T0 = e1Var != null ? ((f1) e1Var).T0() : null;
        if (T0 == null) {
            return false;
        }
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= this.D0) {
                return true;
            }
            e1 e1Var2 = this.C0[i];
            if (e1Var2 != null && !(e1Var2 instanceof h1)) {
                e1.b s = e1Var2.s(0);
                e1.b s2 = e1Var2.s(1);
                e1.b bVar = e1.b.MATCH_CONSTRAINT;
                if (s != bVar || e1Var2.j == 1 || s2 != bVar || e1Var2.k == 1) {
                    z = false;
                }
                if (!z) {
                    if (s == e1.b.MATCH_CONSTRAINT) {
                        s = e1.b.WRAP_CONTENT;
                    }
                    if (s2 == e1.b.MATCH_CONSTRAINT) {
                        s2 = e1.b.WRAP_CONTENT;
                    }
                    o1.a aVar = this.N0;
                    aVar.a = s;
                    aVar.b = s2;
                    aVar.c = e1Var2.P();
                    this.N0.d = e1Var2.v();
                    T0.b(e1Var2, this.N0);
                    e1Var2.C0(this.N0.e);
                    e1Var2.g0(this.N0.f);
                    e1Var2.a0(this.N0.g);
                }
            }
            i++;
        }
    }

    public boolean T0() {
        return this.K0;
    }

    /* access modifiers changed from: protected */
    public void U0(boolean z) {
        this.K0 = z;
    }

    public void V0(int i, int i2) {
        this.L0 = i;
        this.M0 = i2;
    }

    public void W0(int i) {
        this.E0 = i;
        this.F0 = i;
        this.G0 = i;
        this.H0 = i;
    }

    public void X0(int i) {
        this.F0 = i;
    }

    public void Y0(int i) {
        this.H0 = i;
    }

    public void Z0(int i) {
        this.I0 = i;
    }

    public void a1(int i) {
        this.J0 = i;
    }

    public void b1(int i) {
        this.G0 = i;
        this.I0 = i;
        this.J0 = i;
    }

    public void c(f1 f1Var) {
        J0();
    }

    public void c1(int i) {
        this.E0 = i;
    }
}
