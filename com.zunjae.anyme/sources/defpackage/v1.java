package defpackage;

import defpackage.s1;

/* renamed from: v1  reason: default package */
class v1 extends z1 {
    public v1(e1 e1Var) {
        super(e1Var);
    }

    private void q(s1 s1Var) {
        this.h.k.add(s1Var);
        s1Var.l.add(this.h);
    }

    public void a(q1 q1Var) {
        a1 a1Var = (a1) this.b;
        int J0 = a1Var.J0();
        int i = 0;
        int i2 = -1;
        for (s1 s1Var : this.h.l) {
            int i3 = s1Var.g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (J0 == 0 || J0 == 2) {
            this.h.d(i2 + a1Var.K0());
        } else {
            this.h.d(i + a1Var.K0());
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        z1 z1Var;
        e1 e1Var = this.b;
        if (e1Var instanceof a1) {
            this.h.b = true;
            a1 a1Var = (a1) e1Var;
            int J0 = a1Var.J0();
            boolean I0 = a1Var.I0();
            int i = 0;
            if (J0 == 0) {
                this.h.e = s1.a.LEFT;
                while (i < a1Var.D0) {
                    e1 e1Var2 = a1Var.C0[i];
                    if (I0 || e1Var2.O() != 8) {
                        s1 s1Var = e1Var2.d.h;
                        s1Var.k.add(this.h);
                        this.h.l.add(s1Var);
                    }
                    i++;
                }
            } else if (J0 != 1) {
                if (J0 == 2) {
                    this.h.e = s1.a.TOP;
                    while (i < a1Var.D0) {
                        e1 e1Var3 = a1Var.C0[i];
                        if (I0 || e1Var3.O() != 8) {
                            s1 s1Var2 = e1Var3.e.h;
                            s1Var2.k.add(this.h);
                            this.h.l.add(s1Var2);
                        }
                        i++;
                    }
                } else if (J0 == 3) {
                    this.h.e = s1.a.BOTTOM;
                    while (i < a1Var.D0) {
                        e1 e1Var4 = a1Var.C0[i];
                        if (I0 || e1Var4.O() != 8) {
                            s1 s1Var3 = e1Var4.e.i;
                            s1Var3.k.add(this.h);
                            this.h.l.add(s1Var3);
                        }
                        i++;
                    }
                } else {
                    return;
                }
                q(this.b.e.h);
                z1Var = this.b.e;
                q(z1Var.i);
            } else {
                this.h.e = s1.a.RIGHT;
                while (i < a1Var.D0) {
                    e1 e1Var5 = a1Var.C0[i];
                    if (I0 || e1Var5.O() != 8) {
                        s1 s1Var4 = e1Var5.d.i;
                        s1Var4.k.add(this.h);
                        this.h.l.add(s1Var4);
                    }
                    i++;
                }
            }
            q(this.b.d.h);
            z1Var = this.b.d;
            q(z1Var.i);
        }
    }

    public void e() {
        e1 e1Var = this.b;
        if (e1Var instanceof a1) {
            int J0 = ((a1) e1Var).J0();
            if (J0 == 0 || J0 == 1) {
                this.b.D0(this.h.g);
            } else {
                this.b.E0(this.h.g);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.c = null;
        this.h.c();
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return false;
    }
}
