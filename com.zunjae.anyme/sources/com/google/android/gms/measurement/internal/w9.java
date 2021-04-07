package com.google.android.gms.measurement.internal;

final class w9 implements Runnable {
    private final /* synthetic */ ca e;
    private final /* synthetic */ x9 f;

    w9(x9 x9Var, ca caVar) {
        this.f = x9Var;
        this.e = caVar;
    }

    public final void run() {
        this.f.u(this.e);
        this.f.g();
    }
}
