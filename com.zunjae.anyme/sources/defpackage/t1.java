package defpackage;

import defpackage.s1;

/* renamed from: t1  reason: default package */
class t1 extends s1 {
    public int m;

    public t1(z1 z1Var) {
        super(z1Var);
        this.e = z1Var instanceof w1 ? s1.a.HORIZONTAL_DIMENSION : s1.a.VERTICAL_DIMENSION;
    }

    public void d(int i) {
        if (!this.j) {
            this.j = true;
            this.g = i;
            for (q1 next : this.k) {
                next.a(next);
            }
        }
    }
}
