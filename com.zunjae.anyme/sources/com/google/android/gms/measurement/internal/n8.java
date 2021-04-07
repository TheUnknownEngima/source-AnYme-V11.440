package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

final class n8 implements Runnable {
    private final /* synthetic */ la e;
    private final /* synthetic */ c8 f;

    n8(c8 c8Var, la laVar) {
        this.f = c8Var;
        this.e = laVar;
    }

    public final void run() {
        u3 l0 = this.f.d;
        if (l0 == null) {
            this.f.h().E().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            l0.e2(this.e);
            this.f.e0();
        } catch (RemoteException e2) {
            this.f.h().E().b("Failed to send measurementEnabled to the service", e2);
        }
    }
}
