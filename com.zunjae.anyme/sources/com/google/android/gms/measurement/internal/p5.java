package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

final class p5 implements Callable<List<ga>> {
    private final /* synthetic */ la a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ i5 d;

    p5(i5 i5Var, la laVar, String str, String str2) {
        this.d = i5Var;
        this.a = laVar;
        this.b = str;
        this.c = str2;
    }

    public final /* synthetic */ Object call() {
        this.d.a.i0();
        return this.d.a.Z().K(this.a.e, this.b, this.c);
    }
}
