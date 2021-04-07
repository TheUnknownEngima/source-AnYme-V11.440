package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class q6 implements Runnable {
    private final /* synthetic */ AtomicReference e;
    private final /* synthetic */ l6 f;

    q6(l6 l6Var, AtomicReference atomicReference) {
        this.f = l6Var;
        this.e = atomicReference;
    }

    public final void run() {
        synchronized (this.e) {
            try {
                this.e.set(Boolean.valueOf(this.f.j().M(this.f.q().C())));
                this.e.notify();
            } catch (Throwable th) {
                this.e.notify();
                throw th;
            }
        }
    }
}
