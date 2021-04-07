package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.common.d;

public final class w0 extends t0<Boolean> {
    private final j.a<?> b;

    public w0(j.a<?> aVar, f81<Boolean> f81) {
        super(4, f81);
        this.b = aVar;
    }

    public final /* bridge */ /* synthetic */ void c(a1 a1Var, boolean z) {
    }

    public final d[] g(f.a<?> aVar) {
        f0 f0Var = aVar.x().get(this.b);
        if (f0Var == null) {
            return null;
        }
        return f0Var.a.c();
    }

    public final boolean h(f.a<?> aVar) {
        f0 f0Var = aVar.x().get(this.b);
        return f0Var != null && f0Var.a.e();
    }

    public final void i(f.a<?> aVar) {
        f0 remove = aVar.x().remove(this.b);
        if (remove != null) {
            remove.b.b(aVar.n(), this.a);
            remove.a.a();
            return;
        }
        this.a.e(Boolean.FALSE);
    }
}
