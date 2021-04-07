package defpackage;

import defpackage.e1;

/* renamed from: k1  reason: default package */
public class k1 {
    static boolean[] a = new boolean[3];

    static void a(f1 f1Var, u0 u0Var, e1 e1Var) {
        e1Var.h = -1;
        e1Var.i = -1;
        if (f1Var.K[0] != e1.b.WRAP_CONTENT && e1Var.K[0] == e1.b.MATCH_PARENT) {
            int i = e1Var.A.d;
            int P = f1Var.P() - e1Var.C.d;
            d1 d1Var = e1Var.A;
            d1Var.f = u0Var.q(d1Var);
            d1 d1Var2 = e1Var.C;
            d1Var2.f = u0Var.q(d1Var2);
            u0Var.f(e1Var.A.f, i);
            u0Var.f(e1Var.C.f, P);
            e1Var.h = 2;
            e1Var.j0(i, P);
        }
        if (f1Var.K[1] != e1.b.WRAP_CONTENT && e1Var.K[1] == e1.b.MATCH_PARENT) {
            int i2 = e1Var.B.d;
            int v = f1Var.v() - e1Var.D.d;
            d1 d1Var3 = e1Var.B;
            d1Var3.f = u0Var.q(d1Var3);
            d1 d1Var4 = e1Var.D;
            d1Var4.f = u0Var.q(d1Var4);
            u0Var.f(e1Var.B.f, i2);
            u0Var.f(e1Var.D.f, v);
            if (e1Var.W > 0 || e1Var.O() == 8) {
                d1 d1Var5 = e1Var.E;
                d1Var5.f = u0Var.q(d1Var5);
                u0Var.f(e1Var.E.f, e1Var.W + i2);
            }
            e1Var.i = 2;
            e1Var.x0(i2, v);
        }
    }

    public static final boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
