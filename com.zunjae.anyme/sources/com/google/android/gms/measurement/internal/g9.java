package com.google.android.gms.measurement.internal;

final class g9 implements Runnable {
    private final /* synthetic */ x9 e;
    private final /* synthetic */ Runnable f;

    g9(b9 b9Var, x9 x9Var, Runnable runnable) {
        this.e = x9Var;
        this.f = runnable;
    }

    public final void run() {
        this.e.i0();
        this.e.z(this.f);
        this.e.h0();
    }
}
