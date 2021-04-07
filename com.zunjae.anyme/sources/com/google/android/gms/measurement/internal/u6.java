package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class u6 implements Runnable {
    private final /* synthetic */ String e;
    private final /* synthetic */ String f;
    private final /* synthetic */ long g;
    private final /* synthetic */ Bundle h;
    private final /* synthetic */ boolean i;
    private final /* synthetic */ boolean j;
    private final /* synthetic */ boolean k;
    private final /* synthetic */ String l;
    private final /* synthetic */ l6 m;

    u6(l6 l6Var, String str, String str2, long j2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.m = l6Var;
        this.e = str;
        this.f = str2;
        this.g = j2;
        this.h = bundle;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = str3;
    }

    public final void run() {
        this.m.V(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
    }
}
