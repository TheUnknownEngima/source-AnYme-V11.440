package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.r;

final class k5 implements Runnable {
    private final /* synthetic */ la e;
    private final /* synthetic */ i5 f;

    k5(i5 i5Var, la laVar) {
        this.f = i5Var;
        this.e = laVar;
    }

    public final void run() {
        this.f.a.i0();
        x9 q3 = this.f.a;
        la laVar = this.e;
        q3.f().b();
        q3.g0();
        r.f(laVar.e);
        q3.U(laVar);
    }
}
