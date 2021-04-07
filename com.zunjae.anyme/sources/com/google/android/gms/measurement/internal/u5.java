package com.google.android.gms.measurement.internal;

final class u5 implements Runnable {
    private final /* synthetic */ s e;
    private final /* synthetic */ String f;
    private final /* synthetic */ i5 g;

    u5(i5 i5Var, s sVar, String str) {
        this.g = i5Var;
        this.e = sVar;
        this.f = str;
    }

    public final void run() {
        this.g.a.i0();
        this.g.a.q(this.e, this.f);
    }
}
