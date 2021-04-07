package com.google.android.gms.measurement.internal;

final class a8 implements Runnable {
    private final /* synthetic */ u7 e;
    private final /* synthetic */ long f;
    private final /* synthetic */ t7 g;

    a8(t7 t7Var, u7 u7Var, long j) {
        this.g = t7Var;
        this.e = u7Var;
        this.f = j;
    }

    public final void run() {
        this.g.Q(this.e, false, this.f);
        t7 t7Var = this.g;
        t7Var.e = null;
        t7Var.r().M((u7) null);
    }
}
