package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

final class h8 implements Runnable {
    private final /* synthetic */ la e;
    private final /* synthetic */ a71 f;
    private final /* synthetic */ c8 g;

    h8(c8 c8Var, la laVar, a71 a71) {
        this.g = c8Var;
        this.e = laVar;
        this.f = a71;
    }

    public final void run() {
        String str = null;
        try {
            if (!c31.a() || !this.g.j().s(u.P0) || this.g.i().K().q()) {
                u3 l0 = this.g.d;
                if (l0 == null) {
                    this.g.h().E().a("Failed to get app instance id");
                } else {
                    str = l0.N0(this.e);
                    if (str != null) {
                        this.g.p().T(str);
                        this.g.i().l.b(str);
                    }
                    this.g.e0();
                }
                this.g.g().R(this.f, str);
            }
            this.g.h().J().a("Analytics storage consent denied; will not get app instance id");
            this.g.p().T((String) null);
            this.g.i().l.b((String) null);
            this.g.g().R(this.f, str);
        } catch (RemoteException e2) {
            this.g.h().E().b("Failed to get app instance id", e2);
        } catch (Throwable th) {
            this.g.g().R(this.f, (String) null);
            throw th;
        }
    }
}
