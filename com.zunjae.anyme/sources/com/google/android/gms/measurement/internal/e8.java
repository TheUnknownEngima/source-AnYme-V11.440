package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;

final class e8 implements Runnable {
    private final /* synthetic */ String e;
    private final /* synthetic */ String f;
    private final /* synthetic */ boolean g;
    private final /* synthetic */ la h;
    private final /* synthetic */ a71 i;
    private final /* synthetic */ c8 j;

    e8(c8 c8Var, String str, String str2, boolean z, la laVar, a71 a71) {
        this.j = c8Var;
        this.e = str;
        this.f = str2;
        this.g = z;
        this.h = laVar;
        this.i = a71;
    }

    public final void run() {
        Bundle bundle = new Bundle();
        try {
            u3 l0 = this.j.d;
            if (l0 == null) {
                this.j.h().E().c("Failed to get user properties; not connected to service", this.e, this.f);
            } else {
                bundle = fa.D(l0.E1(this.e, this.f, this.g, this.h));
                this.j.e0();
            }
        } catch (RemoteException e2) {
            this.j.h().E().c("Failed to get user properties; remote exception", this.e, e2);
        } catch (Throwable th) {
            this.j.g().Q(this.i, bundle);
            throw th;
        }
        this.j.g().Q(this.i, bundle);
    }
}
