package com.google.android.gms.measurement.internal;

final class d8 implements Runnable {
    private final /* synthetic */ boolean e;
    private final /* synthetic */ ea f;
    private final /* synthetic */ la g;
    private final /* synthetic */ c8 h;

    d8(c8 c8Var, boolean z, ea eaVar, la laVar) {
        this.h = c8Var;
        this.e = z;
        this.f = eaVar;
        this.g = laVar;
    }

    public final void run() {
        u3 l0 = this.h.d;
        if (l0 == null) {
            this.h.h().E().a("Discarding data. Failed to set user property");
            return;
        }
        this.h.L(l0, this.e ? null : this.f, this.g);
        this.h.e0();
    }
}
