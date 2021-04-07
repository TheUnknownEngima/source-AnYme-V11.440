package com.google.android.gms.cast;

import com.google.android.gms.cast.h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.r;

final class z1 extends h.a {
    private final /* synthetic */ f81 a;
    private final /* synthetic */ a2 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    z1(a2 a2Var, f81 f81) {
        super((y1) null);
        this.b = a2Var;
        this.a = f81;
    }

    public final void c2() {
        this.b.c.i.a("onDisconnected", new Object[0]);
        this.b.c.A();
        r.a(Status.i, this.a);
    }

    public final void l3(int i) {
        this.b.c.i.a("onError: %d", Integer.valueOf(i));
        this.b.c.A();
        r.a(Status.j, this.a);
    }
}
