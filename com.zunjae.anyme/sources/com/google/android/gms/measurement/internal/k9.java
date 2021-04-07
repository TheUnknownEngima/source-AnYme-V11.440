package com.google.android.gms.measurement.internal;

final class k9 {
    private n9 a;
    final /* synthetic */ j9 b;

    k9(j9 j9Var) {
        this.b = j9Var;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.b.b();
        if (this.b.j().s(u.l0) && this.a != null) {
            this.b.c.removeCallbacks(this.a);
        }
        if (this.b.j().s(u.x0)) {
            this.b.i().w.a(false);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(long j) {
        if (this.b.j().s(u.l0)) {
            this.a = new n9(this, this.b.l().c(), j);
            this.b.c.postDelayed(this.a, 2000);
        }
    }
}
