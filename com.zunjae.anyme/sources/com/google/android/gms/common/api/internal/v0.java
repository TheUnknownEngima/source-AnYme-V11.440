package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.d;

public final class v0 extends t0<Void> {
    private final m<a.b, ?> b;
    private final s<a.b, ?> c;

    public v0(f0 f0Var, f81<Void> f81) {
        super(3, f81);
        this.b = f0Var.a;
        this.c = f0Var.b;
    }

    public final /* bridge */ /* synthetic */ void c(a1 a1Var, boolean z) {
    }

    public final d[] g(f.a<?> aVar) {
        return this.b.c();
    }

    public final boolean h(f.a<?> aVar) {
        return this.b.e();
    }

    public final void i(f.a<?> aVar) {
        this.b.d(aVar.n(), this.a);
        if (this.b.b() != null) {
            aVar.x().put(this.b.b(), new f0(this.b, this.c));
        }
    }
}
