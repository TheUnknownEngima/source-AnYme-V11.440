package com.google.android.gms.measurement.internal;

final class r6 implements Runnable {
    private final /* synthetic */ long e;
    private final /* synthetic */ l6 f;

    r6(l6 l6Var, long j) {
        this.f = l6Var;
        this.e = j;
    }

    public final void run() {
        this.f.i().q.b(this.e);
        this.f.h().L().b("Session timeout duration set", Long.valueOf(this.e));
    }
}
