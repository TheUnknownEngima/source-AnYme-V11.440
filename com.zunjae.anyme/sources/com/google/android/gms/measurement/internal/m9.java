package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final /* synthetic */ class m9 implements Runnable {
    private final n9 e;

    m9(n9 n9Var) {
        this.e = n9Var;
    }

    public final void run() {
        n9 n9Var = this.e;
        k9 k9Var = n9Var.g;
        long j = n9Var.e;
        long j2 = n9Var.f;
        k9Var.b.b();
        k9Var.b.h().L().a("Application going to the background");
        boolean z = true;
        if (k9Var.b.j().s(u.x0)) {
            k9Var.b.i().w.a(true);
        }
        Bundle bundle = new Bundle();
        if (!k9Var.b.j().H().booleanValue()) {
            k9Var.b.e.f(j2);
            if (k9Var.b.j().s(u.o0)) {
                bundle.putLong("_et", k9Var.b.B(j2));
                t7.O(k9Var.b.s().D(true), bundle, true);
            } else {
                z = false;
            }
            k9Var.b.E(false, z, j2);
        }
        k9Var.b.p().U("auto", "_ab", j, bundle);
    }
}
