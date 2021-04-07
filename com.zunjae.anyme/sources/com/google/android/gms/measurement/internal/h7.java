package com.google.android.gms.measurement.internal;

final class h7 implements Runnable {
    private final /* synthetic */ e e;
    private final /* synthetic */ int f;
    private final /* synthetic */ long g;
    private final /* synthetic */ boolean h;
    private final /* synthetic */ l6 i;

    h7(l6 l6Var, e eVar, int i2, long j, boolean z) {
        this.i = l6Var;
        this.e = eVar;
        this.f = i2;
        this.g = j;
        this.h = z;
    }

    public final void run() {
        this.i.I(this.e);
        this.i.K(this.e, this.f, this.g, false, this.h);
    }
}
