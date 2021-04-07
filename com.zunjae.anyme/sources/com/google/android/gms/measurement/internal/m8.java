package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;

final class m8 implements Runnable {
    private final /* synthetic */ Bundle e;
    private final /* synthetic */ la f;
    private final /* synthetic */ c8 g;

    m8(c8 c8Var, Bundle bundle, la laVar) {
        this.g = c8Var;
        this.e = bundle;
        this.f = laVar;
    }

    public final void run() {
        u3 l0 = this.g.d;
        if (l0 == null) {
            this.g.h().E().a("Failed to send default event parameters to service");
            return;
        }
        try {
            l0.F2(this.e, this.f);
        } catch (RemoteException e2) {
            this.g.h().E().b("Failed to send default event parameters to service", e2);
        }
    }
}
