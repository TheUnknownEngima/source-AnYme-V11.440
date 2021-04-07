package com.google.android.gms.cast;

import com.google.android.gms.cast.e;

final /* synthetic */ class x0 implements Runnable {
    private final n0 e;
    private final String f;
    private final String g;

    x0(n0 n0Var, String str, String str2) {
        this.e = n0Var;
        this.f = str;
        this.g = str2;
    }

    public final void run() {
        e.d dVar;
        n0 n0Var = this.e;
        String str = this.f;
        String str2 = this.g;
        synchronized (n0Var.a.B) {
            dVar = n0Var.a.B.get(str);
        }
        if (dVar != null) {
            dVar.a(n0Var.a.z, str, str2);
            return;
        }
        c0.E.a("Discarded message for unknown namespace '%s'", str);
    }
}
