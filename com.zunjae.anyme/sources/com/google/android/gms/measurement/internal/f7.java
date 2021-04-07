package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class f7 implements Runnable {
    private final /* synthetic */ AtomicReference e;
    private final /* synthetic */ l6 f;

    f7(l6 l6Var, AtomicReference atomicReference) {
        this.f = l6Var;
        this.e = atomicReference;
    }

    public final void run() {
        synchronized (this.e) {
            try {
                this.e.set(Double.valueOf(this.f.j().v(this.f.q().C(), u.O)));
                this.e.notify();
            } catch (Throwable th) {
                this.e.notify();
                throw th;
            }
        }
    }
}
