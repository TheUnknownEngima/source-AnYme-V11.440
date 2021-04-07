package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

final class k8 implements Runnable {
    private final /* synthetic */ la e;
    private final /* synthetic */ c8 f;

    k8(c8 c8Var, la laVar) {
        this.f = c8Var;
        this.e = laVar;
    }

    public final void run() {
        u3 l0 = this.f.d;
        if (l0 == null) {
            this.f.h().E().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            l0.H1(this.e);
            this.f.t().J();
            this.f.L(l0, (m80) null, this.e);
            this.f.e0();
        } catch (RemoteException e2) {
            this.f.h().E().b("Failed to send app launch to the service", e2);
        }
    }
}
