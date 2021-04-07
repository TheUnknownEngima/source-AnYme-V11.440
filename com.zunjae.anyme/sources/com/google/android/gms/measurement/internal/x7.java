package com.google.android.gms.measurement.internal;

final class x7 implements Runnable {
    private final /* synthetic */ long e;
    private final /* synthetic */ t7 f;

    x7(t7 t7Var, long j) {
        this.f = t7Var;
        this.e = j;
    }

    public final void run() {
        this.f.m().v(this.e);
        this.f.e = null;
    }
}
