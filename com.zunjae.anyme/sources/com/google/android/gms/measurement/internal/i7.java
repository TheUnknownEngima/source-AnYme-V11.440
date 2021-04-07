package com.google.android.gms.measurement.internal;

final class i7 implements Runnable {
    private final /* synthetic */ e e;
    private final /* synthetic */ long f;
    private final /* synthetic */ int g;
    private final /* synthetic */ long h;
    private final /* synthetic */ boolean i;
    private final /* synthetic */ l6 j;

    i7(l6 l6Var, e eVar, long j2, int i2, long j3, boolean z) {
        this.j = l6Var;
        this.e = eVar;
        this.f = j2;
        this.g = i2;
        this.h = j3;
        this.i = z;
    }

    public final void run() {
        this.j.I(this.e);
        this.j.F(this.f, false);
        this.j.K(this.e, this.g, this.h, true, this.i);
    }
}
