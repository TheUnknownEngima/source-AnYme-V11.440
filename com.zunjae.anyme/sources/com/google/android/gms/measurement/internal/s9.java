package com.google.android.gms.measurement.internal;

final class s9 extends k {
    private final /* synthetic */ x9 e;
    private final /* synthetic */ t9 f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    s9(t9 t9Var, c6 c6Var, x9 x9Var) {
        super(c6Var);
        this.f = t9Var;
        this.e = x9Var;
    }

    public final void b() {
        this.f.v();
        this.f.h().M().a("Starting upload from DelayedRunnable");
        this.e.h0();
    }
}
