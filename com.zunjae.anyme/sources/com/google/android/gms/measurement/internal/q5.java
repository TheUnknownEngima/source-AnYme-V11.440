package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

final class q5 implements Callable<List<ua>> {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ i5 d;

    q5(i5 i5Var, String str, String str2, String str3) {
        this.d = i5Var;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final /* synthetic */ Object call() {
        this.d.a.i0();
        return this.d.a.Z().k0(this.a, this.b, this.c);
    }
}
