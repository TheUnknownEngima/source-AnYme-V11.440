package com.mikepenz.materialdrawer;

import com.mikepenz.fastadapter.b;

public class f {
    protected b<go1> a;
    protected tl1<go1> b;
    private a c;
    private nn1 d;
    private boolean e = false;
    private boolean f = false;
    private boolean g = true;

    public go1 a(go1 go1) {
        if (go1 instanceof do1) {
            if (!this.e) {
                return null;
            }
            yn1 yn1 = new yn1((do1) go1);
            yn1.f0(this.f);
            yn1.F(false);
            return yn1;
        } else if (go1 instanceof ao1) {
            yn1 yn12 = new yn1((ao1) go1);
            yn12.f0(this.f);
            yn12.F(false);
            return yn12;
        } else if (!(go1 instanceof bo1)) {
            return null;
        } else {
            zn1 zn1 = new zn1((bo1) go1);
            zn1.B(this.g);
            return zn1;
        }
    }

    public boolean b(go1 go1) {
        if (!go1.b()) {
            return true;
        }
        nn1 nn1 = this.d;
        if (nn1 != null && nn1.a()) {
            this.d.b();
        }
        d(go1.c());
        return false;
    }

    public void c() {
        nn1 nn1 = this.d;
        if (nn1 != null && nn1.a()) {
            this.d.b();
        }
        a aVar = this.c;
        if (aVar != null) {
            ho1 a2 = aVar.a();
            if (a2 instanceof go1) {
                this.b.B(0, a((go1) a2));
            }
        }
    }

    public void d(long j) {
        if (j == -1) {
            this.a.P();
        }
        int g2 = this.a.g();
        for (int i = 0; i < g2; i++) {
            go1 Y = this.a.Y(i);
            if (Y.c() == j && !Y.f()) {
                this.a.P();
                this.a.y0(i);
            }
        }
    }

    public f e(a aVar) {
        this.c = aVar;
        return this;
    }

    public f f(c cVar) {
        return this;
    }
}
