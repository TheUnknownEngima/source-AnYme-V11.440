package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final /* synthetic */ class o6 implements Runnable {
    private final l6 e;
    private final Bundle f;

    o6(l6 l6Var, Bundle bundle) {
        this.e = l6Var;
        this.f = bundle;
    }

    public final void run() {
        l6 l6Var = this.e;
        Bundle bundle = this.f;
        if (t41.a() && l6Var.j().s(u.H0)) {
            if (bundle == null) {
                l6Var.i().C.b(new Bundle());
                return;
            }
            Bundle a = l6Var.i().C.a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    l6Var.g();
                    if (fa.c0(obj)) {
                        l6Var.g().J(27, (String) null, (String) null, 0);
                    }
                    l6Var.h().J().c("Invalid default event parameter type. Name, value", str, obj);
                } else if (fa.C0(str)) {
                    l6Var.h().J().b("Invalid default event parameter name. Name", str);
                } else if (obj == null) {
                    a.remove(str);
                } else if (l6Var.g().h0("param", str, 100, obj)) {
                    l6Var.g().N(a, str, obj);
                }
            }
            l6Var.g();
            if (fa.a0(a, l6Var.j().x())) {
                l6Var.g().J(26, (String) null, (String) null, 0);
                l6Var.h().J().a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
            l6Var.i().C.b(a);
            l6Var.r().E(a);
        }
    }
}
