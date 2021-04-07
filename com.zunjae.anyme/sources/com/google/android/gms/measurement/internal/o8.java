package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

final class o8 implements Runnable {
    private final /* synthetic */ s e;
    private final /* synthetic */ String f;
    private final /* synthetic */ a71 g;
    private final /* synthetic */ c8 h;

    o8(c8 c8Var, s sVar, String str, a71 a71) {
        this.h = c8Var;
        this.e = sVar;
        this.f = str;
        this.g = a71;
    }

    public final void run() {
        byte[] bArr = null;
        try {
            u3 l0 = this.h.d;
            if (l0 == null) {
                this.h.h().E().a("Discarding data. Failed to send event to service to bundle");
            } else {
                bArr = l0.j2(this.e, this.f);
                this.h.e0();
            }
        } catch (RemoteException e2) {
            this.h.h().E().b("Failed to send event to the service to bundle", e2);
        } catch (Throwable th) {
            this.h.g().U(this.g, bArr);
            throw th;
        }
        this.h.g().U(this.g, bArr);
    }
}
