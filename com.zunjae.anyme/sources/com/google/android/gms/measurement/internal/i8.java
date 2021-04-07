package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

final class i8 implements Runnable {
    private final /* synthetic */ AtomicReference e;
    private final /* synthetic */ la f;
    private final /* synthetic */ c8 g;

    i8(c8 c8Var, AtomicReference atomicReference, la laVar) {
        this.g = c8Var;
        this.e = atomicReference;
        this.f = laVar;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.e) {
            try {
                if (!c31.a() || !this.g.j().s(u.P0) || this.g.i().K().q()) {
                    u3 l0 = this.g.d;
                    if (l0 == null) {
                        this.g.h().E().a("Failed to get app instance id");
                        this.e.notify();
                        return;
                    }
                    this.e.set(l0.N0(this.f));
                    String str = (String) this.e.get();
                    if (str != null) {
                        this.g.p().T(str);
                        this.g.i().l.b(str);
                    }
                    this.g.e0();
                    atomicReference = this.e;
                    atomicReference.notify();
                    return;
                }
                this.g.h().J().a("Analytics storage consent denied; will not get app instance id");
                this.g.p().T((String) null);
                this.g.i().l.b((String) null);
                this.e.set((Object) null);
                this.e.notify();
            } catch (RemoteException e2) {
                try {
                    this.g.h().E().b("Failed to get app instance id", e2);
                    atomicReference = this.e;
                } catch (Throwable th) {
                    this.e.notify();
                    throw th;
                }
            }
        }
    }
}
