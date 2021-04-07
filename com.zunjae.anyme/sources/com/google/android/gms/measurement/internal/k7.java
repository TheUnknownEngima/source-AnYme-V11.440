package com.google.android.gms.measurement.internal;

final class k7 implements Runnable {
    private final /* synthetic */ boolean e;
    private final /* synthetic */ l6 f;

    k7(l6 l6Var, boolean z) {
        this.f = l6Var;
        this.e = z;
    }

    public final void run() {
        boolean p = this.f.a.p();
        boolean T = this.f.a.T();
        this.f.a.m(this.e);
        if (T == this.e) {
            this.f.a.h().M().b("Default data collection state already set to", Boolean.valueOf(this.e));
        }
        if (this.f.a.p() == p || this.f.a.p() != this.f.a.T()) {
            this.f.a.h().J().c("Default data collection is different than actual status", Boolean.valueOf(this.e), Boolean.valueOf(p));
        }
        this.f.o0();
    }
}
