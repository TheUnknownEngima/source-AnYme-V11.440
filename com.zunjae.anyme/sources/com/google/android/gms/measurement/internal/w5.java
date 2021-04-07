package com.google.android.gms.measurement.internal;

final class w5 implements Runnable {
    private final /* synthetic */ ea e;
    private final /* synthetic */ la f;
    private final /* synthetic */ i5 g;

    w5(i5 i5Var, ea eaVar, la laVar) {
        this.g = i5Var;
        this.e = eaVar;
        this.f = laVar;
    }

    public final void run() {
        this.g.a.i0();
        if (this.e.i() == null) {
            this.g.a.Q(this.e, this.f);
        } else {
            this.g.a.v(this.e, this.f);
        }
    }
}
