package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.r;

final class s5 implements Runnable {
    private final /* synthetic */ la e;
    private final /* synthetic */ i5 f;

    s5(i5 i5Var, la laVar) {
        this.f = i5Var;
        this.e = laVar;
    }

    public final void run() {
        this.f.a.i0();
        x9 q3 = this.f.a;
        la laVar = this.e;
        if (c31.a() && q3.L().s(u.Q0)) {
            q3.f().b();
            q3.g0();
            r.f(laVar.e);
            e b = e.b(laVar.A);
            e b2 = q3.b(laVar.e);
            q3.B(laVar.e, b);
            if (b.h(b2)) {
                q3.w(laVar);
            }
        }
    }
}
