package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

final class j8 implements Runnable {
    private final /* synthetic */ u7 e;
    private final /* synthetic */ c8 f;

    j8(c8 c8Var, u7 u7Var) {
        this.f = c8Var;
        this.e = u7Var;
    }

    public final void run() {
        long j;
        String str;
        String str2;
        String packageName;
        u3 l0 = this.f.d;
        if (l0 == null) {
            this.f.h().E().a("Failed to send current screen to service");
            return;
        }
        try {
            if (this.e == null) {
                j = 0;
                str = null;
                str2 = null;
                packageName = this.f.n().getPackageName();
            } else {
                j = this.e.c;
                str = this.e.a;
                str2 = this.e.b;
                packageName = this.f.n().getPackageName();
            }
            l0.j1(j, str, str2, packageName);
            this.f.e0();
        } catch (RemoteException e2) {
            this.f.h().E().b("Failed to send current screen to the service", e2);
        }
    }
}
