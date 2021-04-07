package com.google.android.gms.measurement.internal;

final class s6 implements Runnable {
    private final /* synthetic */ long e;
    private final /* synthetic */ l6 f;

    s6(l6 l6Var, long j) {
        this.f = l6Var;
        this.e = j;
    }

    public final void run() {
        this.f.i().p.b(this.e);
        this.f.h().L().b("Minimum session duration set", Long.valueOf(this.e));
    }
}
