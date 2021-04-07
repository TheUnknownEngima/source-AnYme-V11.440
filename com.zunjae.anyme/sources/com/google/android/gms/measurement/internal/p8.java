package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

final class p8 implements Runnable {
    private final /* synthetic */ boolean e;
    private final /* synthetic */ boolean f;
    private final /* synthetic */ s g;
    private final /* synthetic */ la h;
    private final /* synthetic */ String i;
    private final /* synthetic */ c8 j;

    p8(c8 c8Var, boolean z, boolean z2, s sVar, la laVar, String str) {
        this.j = c8Var;
        this.e = z;
        this.f = z2;
        this.g = sVar;
        this.h = laVar;
        this.i = str;
    }

    public final void run() {
        u3 l0 = this.j.d;
        if (l0 == null) {
            this.j.h().E().a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.e) {
            this.j.L(l0, this.f ? null : this.g, this.h);
        } else {
            try {
                if (TextUtils.isEmpty(this.i)) {
                    l0.k2(this.g, this.h);
                } else {
                    l0.a3(this.g, this.i, this.j.h().N());
                }
            } catch (RemoteException e2) {
                this.j.h().E().b("Failed to send event to the service", e2);
            }
        }
        this.j.e0();
    }
}
