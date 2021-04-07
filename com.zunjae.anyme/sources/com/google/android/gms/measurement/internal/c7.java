package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class c7 implements Runnable {
    private final /* synthetic */ AtomicReference e;
    private final /* synthetic */ l6 f;

    c7(l6 l6Var, AtomicReference atomicReference) {
        this.f = l6Var;
        this.e = atomicReference;
    }

    public final void run() {
        synchronized (this.e) {
            try {
                this.e.set(Integer.valueOf(this.f.j().u(this.f.q().C(), u.N)));
                this.e.notify();
            } catch (Throwable th) {
                this.e.notify();
                throw th;
            }
        }
    }
}
