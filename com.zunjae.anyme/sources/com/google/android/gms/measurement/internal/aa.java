package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

final class aa implements Callable<String> {
    private final /* synthetic */ la a;
    private final /* synthetic */ x9 b;

    aa(x9 x9Var, la laVar) {
        this.b = x9Var;
        this.a = laVar;
    }

    public final /* synthetic */ Object call() {
        e4 H;
        String str;
        if (!c31.a() || !this.b.L().s(u.Q0) || (this.b.b(this.a.e).q() && e.b(this.a.A).q())) {
            f4 U = this.b.U(this.a);
            if (U != null) {
                return U.x();
            }
            H = this.b.h().H();
            str = "App info was null when attempting to get app instance id";
        } else {
            H = this.b.h().M();
            str = "Analytics storage consent denied. Returning null app instance id";
        }
        H.a(str);
        return null;
    }
}
