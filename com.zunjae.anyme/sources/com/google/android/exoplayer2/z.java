package com.google.android.exoplayer2;

final class z implements d50 {
    private final o50 e;
    private final a f;
    private u0 g;
    private d50 h;
    private boolean i = true;
    private boolean j;

    public interface a {
        void c(o0 o0Var);
    }

    public z(a aVar, r40 r40) {
        this.f = aVar;
        this.e = new o50(r40);
    }

    private boolean d(boolean z) {
        u0 u0Var = this.g;
        return u0Var == null || u0Var.c() || (!this.g.f() && (z || this.g.k()));
    }

    private void j(boolean z) {
        if (d(z)) {
            this.i = true;
            if (this.j) {
                this.e.b();
                return;
            }
            return;
        }
        long o = this.h.o();
        if (this.i) {
            if (o < this.e.o()) {
                this.e.c();
                return;
            }
            this.i = false;
            if (this.j) {
                this.e.b();
            }
        }
        this.e.a(o);
        o0 e2 = this.h.e();
        if (!e2.equals(this.e.e())) {
            this.e.g(e2);
            this.f.c(e2);
        }
    }

    public void a(u0 u0Var) {
        if (u0Var == this.g) {
            this.h = null;
            this.g = null;
            this.i = true;
        }
    }

    public void b(u0 u0Var) {
        d50 d50;
        d50 x = u0Var.x();
        if (x != null && x != (d50 = this.h)) {
            if (d50 == null) {
                this.h = x;
                this.g = u0Var;
                x.g(this.e.e());
                return;
            }
            throw b0.d(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
    }

    public void c(long j2) {
        this.e.a(j2);
    }

    public o0 e() {
        d50 d50 = this.h;
        return d50 != null ? d50.e() : this.e.e();
    }

    public void f() {
        this.j = true;
        this.e.b();
    }

    public void g(o0 o0Var) {
        d50 d50 = this.h;
        if (d50 != null) {
            d50.g(o0Var);
            o0Var = this.h.e();
        }
        this.e.g(o0Var);
    }

    public void h() {
        this.j = false;
        this.e.c();
    }

    public long i(boolean z) {
        j(z);
        return o();
    }

    public long o() {
        return this.i ? this.e.o() : this.h.o();
    }
}
