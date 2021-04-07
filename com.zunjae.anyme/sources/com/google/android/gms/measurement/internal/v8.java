package com.google.android.gms.measurement.internal;

final class v8 implements Runnable {
    private final /* synthetic */ u3 e;
    private final /* synthetic */ w8 f;

    v8(w8 w8Var, u3 u3Var) {
        this.f = w8Var;
        this.e = u3Var;
    }

    public final void run() {
        synchronized (this.f) {
            boolean unused = this.f.a = false;
            if (!this.f.c.V()) {
                this.f.c.h().M().a("Connected to service");
                this.f.c.K(this.e);
            }
        }
    }
}
