package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class v6 implements Runnable {
    private final /* synthetic */ long e;
    private final /* synthetic */ l6 f;

    v6(l6 l6Var, long j) {
        this.f = l6Var;
        this.e = j;
    }

    public final void run() {
        this.f.F(this.e, true);
        this.f.r().R(new AtomicReference());
    }
}
