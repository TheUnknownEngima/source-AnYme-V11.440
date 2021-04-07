package com.google.android.gms.measurement.internal;

final /* synthetic */ class n6 implements Runnable {
    private final l6 e;

    n6(l6 l6Var) {
        this.e = l6Var;
    }

    public final void run() {
        l6 l6Var = this.e;
        l6Var.b();
        if (l6Var.i().x.b()) {
            l6Var.h().L().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long a = l6Var.i().y.a();
        l6Var.i().y.b(1 + a);
        if (a >= 5) {
            l6Var.h().H().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            l6Var.i().x.a(true);
            return;
        }
        l6Var.a.v();
    }
}
