package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

final class f8 implements Runnable {
    private final /* synthetic */ la e;
    private final /* synthetic */ c8 f;

    f8(c8 c8Var, la laVar) {
        this.f = c8Var;
        this.e = laVar;
    }

    public final void run() {
        u3 l0 = this.f.d;
        if (l0 == null) {
            this.f.h().E().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            l0.n1(this.e);
        } catch (RemoteException e2) {
            this.f.h().E().b("Failed to reset data on the service: remote exception", e2);
        }
        this.f.e0();
    }
}
