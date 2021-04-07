package defpackage;

import defpackage.e1;
import java.util.HashMap;

/* renamed from: a1  reason: default package */
public class a1 extends j1 {
    private int E0 = 0;
    private boolean F0 = true;
    private int G0 = 0;

    public boolean I0() {
        return this.F0;
    }

    public int J0() {
        return this.E0;
    }

    public int K0() {
        return this.G0;
    }

    public void L0(boolean z) {
        this.F0 = z;
    }

    public void M0(int i) {
        this.E0 = i;
    }

    public void N0(int i) {
        this.G0 = i;
    }

    public void e(u0 u0Var) {
        d1[] d1VarArr;
        boolean z;
        z0 z0Var;
        d1 d1Var;
        int i;
        int i2;
        d1[] d1VarArr2 = this.I;
        d1VarArr2[0] = this.A;
        d1VarArr2[2] = this.B;
        d1VarArr2[1] = this.C;
        d1VarArr2[3] = this.D;
        int i3 = 0;
        while (true) {
            d1VarArr = this.I;
            if (i3 >= d1VarArr.length) {
                break;
            }
            d1VarArr[i3].f = u0Var.q(d1VarArr[i3]);
            i3++;
        }
        int i4 = this.E0;
        if (i4 >= 0) {
            int i5 = 4;
            if (i4 < 4) {
                d1 d1Var2 = d1VarArr[i4];
                int i6 = 0;
                while (true) {
                    if (i6 >= this.D0) {
                        z = false;
                        break;
                    }
                    e1 e1Var = this.C0[i6];
                    if ((this.F0 || e1Var.f()) && ((((i = this.E0) == 0 || i == 1) && e1Var.y() == e1.b.MATCH_CONSTRAINT && e1Var.A.c != null && e1Var.C.c != null) || (((i2 = this.E0) == 2 || i2 == 3) && e1Var.M() == e1.b.MATCH_CONSTRAINT && e1Var.B.c != null && e1Var.D.c != null))) {
                        z = true;
                    } else {
                        i6++;
                    }
                }
                z = true;
                for (int i7 = 0; i7 < this.D0; i7++) {
                    e1 e1Var2 = this.C0[i7];
                    if (this.F0 || e1Var2.f()) {
                        z0 q = u0Var.q(e1Var2.I[this.E0]);
                        d1[] d1VarArr3 = e1Var2.I;
                        int i8 = this.E0;
                        d1VarArr3[i8].f = q;
                        int i9 = (d1VarArr3[i8].c == null || d1VarArr3[i8].c.a != this) ? 0 : d1VarArr3[i8].d + 0;
                        int i10 = this.E0;
                        if (i10 == 0 || i10 == 2) {
                            u0Var.i(d1Var2.f, q, this.G0 - i9, z);
                        } else {
                            u0Var.g(d1Var2.f, q, this.G0 + i9, z);
                        }
                    }
                }
                if (!z) {
                    i5 = 5;
                }
                int i11 = this.E0;
                if (i11 == 0) {
                    u0Var.e(this.C.f, this.A.f, 0, 7);
                    u0Var.e(this.A.f, this.L.C.f, 0, i5);
                    z0Var = this.A.f;
                    d1Var = this.L.A;
                } else if (i11 == 1) {
                    u0Var.e(this.A.f, this.C.f, 0, 7);
                    u0Var.e(this.A.f, this.L.A.f, 0, i5);
                    z0Var = this.A.f;
                    d1Var = this.L.C;
                } else if (i11 == 2) {
                    u0Var.e(this.D.f, this.B.f, 0, 7);
                    u0Var.e(this.B.f, this.L.D.f, 0, i5);
                    z0Var = this.B.f;
                    d1Var = this.L.B;
                } else if (i11 == 3) {
                    u0Var.e(this.B.f, this.D.f, 0, 7);
                    u0Var.e(this.B.f, this.L.B.f, 0, i5);
                    z0Var = this.B.f;
                    d1Var = this.L.D;
                } else {
                    return;
                }
                u0Var.e(z0Var, d1Var.f, 0, 0);
            }
        }
    }

    public boolean f() {
        return true;
    }

    public void k(e1 e1Var, HashMap<e1, e1> hashMap) {
        super.k(e1Var, hashMap);
        a1 a1Var = (a1) e1Var;
        this.E0 = a1Var.E0;
        this.F0 = a1Var.F0;
        this.G0 = a1Var.G0;
    }
}
