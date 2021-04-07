package defpackage;

/* renamed from: u1  reason: default package */
class u1 extends z1 {
    public u1(e1 e1Var) {
        super(e1Var);
        e1Var.d.f();
        e1Var.e.f();
        this.f = ((h1) e1Var).I0();
    }

    private void q(s1 s1Var) {
        this.h.k.add(s1Var);
        s1Var.l.add(this.h);
    }

    public void a(q1 q1Var) {
        s1 s1Var = this.h;
        if (s1Var.c && !s1Var.j) {
            this.h.d((int) ((((float) s1Var.l.get(0).g) * ((h1) this.b).L0()) + 0.5f));
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        z1 z1Var;
        s1 s1Var;
        s1 s1Var2;
        h1 h1Var = (h1) this.b;
        int J0 = h1Var.J0();
        int K0 = h1Var.K0();
        h1Var.L0();
        if (h1Var.I0() == 1) {
            s1 s1Var3 = this.h;
            if (J0 != -1) {
                s1Var3.l.add(this.b.L.d.h);
                this.b.L.d.h.k.add(this.h);
                s1Var2 = this.h;
            } else if (K0 != -1) {
                s1Var3.l.add(this.b.L.d.i);
                this.b.L.d.i.k.add(this.h);
                s1Var2 = this.h;
                J0 = -K0;
            } else {
                s1Var3.b = true;
                s1Var3.l.add(this.b.L.d.i);
                this.b.L.d.i.k.add(this.h);
                q(this.b.d.h);
                z1Var = this.b.d;
            }
            s1Var2.f = J0;
            q(this.b.d.h);
            z1Var = this.b.d;
        } else {
            s1 s1Var4 = this.h;
            if (J0 != -1) {
                s1Var4.l.add(this.b.L.e.h);
                this.b.L.e.h.k.add(this.h);
                s1Var = this.h;
            } else if (K0 != -1) {
                s1Var4.l.add(this.b.L.e.i);
                this.b.L.e.i.k.add(this.h);
                s1Var = this.h;
                J0 = -K0;
            } else {
                s1Var4.b = true;
                s1Var4.l.add(this.b.L.e.i);
                this.b.L.e.i.k.add(this.h);
                q(this.b.e.h);
                z1Var = this.b.e;
            }
            s1Var.f = J0;
            q(this.b.e.h);
            z1Var = this.b.e;
        }
        q(z1Var.i);
    }

    public void e() {
        if (((h1) this.b).I0() == 1) {
            this.b.D0(this.h.g);
        } else {
            this.b.E0(this.h.g);
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.h.c();
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return false;
    }
}
