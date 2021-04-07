package com.google.android.gms.measurement.internal;

final class n5 implements Runnable {
    private final /* synthetic */ ua e;
    private final /* synthetic */ la f;
    private final /* synthetic */ i5 g;

    n5(i5 i5Var, ua uaVar, la laVar) {
        this.g = i5Var;
        this.e = uaVar;
        this.f = laVar;
    }

    public final void run() {
        this.g.a.i0();
        if (this.e.g.i() == null) {
            this.g.a.T(this.e, this.f);
        } else {
            this.g.a.y(this.e, this.f);
        }
    }
}
