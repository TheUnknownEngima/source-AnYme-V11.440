package com.google.android.gms.measurement.internal;

final class j5 implements Runnable {
    private final /* synthetic */ m6 e;
    private final /* synthetic */ h5 f;

    j5(h5 h5Var, m6 m6Var) {
        this.f = h5Var;
        this.e = m6Var;
    }

    public final void run() {
        this.f.j(this.e);
        this.f.c(this.e.g);
    }
}
