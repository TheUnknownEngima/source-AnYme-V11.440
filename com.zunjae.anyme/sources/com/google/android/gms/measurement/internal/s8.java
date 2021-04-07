package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

final class s8 implements Runnable {
    private final /* synthetic */ boolean e = true;
    private final /* synthetic */ boolean f;
    private final /* synthetic */ ua g;
    private final /* synthetic */ la h;
    private final /* synthetic */ ua i;
    private final /* synthetic */ c8 j;

    s8(c8 c8Var, boolean z, boolean z2, ua uaVar, la laVar, ua uaVar2) {
        this.j = c8Var;
        this.f = z2;
        this.g = uaVar;
        this.h = laVar;
        this.i = uaVar2;
    }

    public final void run() {
        u3 l0 = this.j.d;
        if (l0 == null) {
            this.j.h().E().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.e) {
            this.j.L(l0, this.f ? null : this.g, this.h);
        } else {
            try {
                if (TextUtils.isEmpty(this.i.e)) {
                    l0.M(this.g, this.h);
                } else {
                    l0.W1(this.g);
                }
            } catch (RemoteException e2) {
                this.j.h().E().b("Failed to send conditional user property to the service", e2);
            }
        }
        this.j.e0();
    }
}
