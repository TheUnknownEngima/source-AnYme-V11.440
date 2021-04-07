package com.google.android.gms.measurement.internal;

final class m5 implements Runnable {
    private final /* synthetic */ ua e;
    private final /* synthetic */ i5 f;

    m5(i5 i5Var, ua uaVar) {
        this.f = i5Var;
        this.e = uaVar;
    }

    public final void run() {
        this.f.a.i0();
        if (this.e.g.i() == null) {
            this.f.a.S(this.e);
        } else {
            this.f.a.x(this.e);
        }
    }
}
