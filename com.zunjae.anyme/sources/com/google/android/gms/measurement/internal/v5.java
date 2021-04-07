package com.google.android.gms.measurement.internal;

final class v5 implements Runnable {
    private final /* synthetic */ s e;
    private final /* synthetic */ la f;
    private final /* synthetic */ i5 g;

    v5(i5 i5Var, s sVar, la laVar) {
        this.g = i5Var;
        this.e = sVar;
        this.f = laVar;
    }

    public final void run() {
        s u3 = this.g.u3(this.e, this.f);
        this.g.a.i0();
        this.g.a.p(u3, this.f);
    }
}
