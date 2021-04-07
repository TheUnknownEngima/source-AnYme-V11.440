package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

final class x5 implements Callable<byte[]> {
    private final /* synthetic */ s a;
    private final /* synthetic */ String b;
    private final /* synthetic */ i5 c;

    x5(i5 i5Var, s sVar, String str) {
        this.c = i5Var;
        this.a = sVar;
        this.b = str;
    }

    public final /* synthetic */ Object call() {
        this.c.a.i0();
        this.c.a.c0().u(this.a, this.b);
        throw null;
    }
}
