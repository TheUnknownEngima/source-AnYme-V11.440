package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class w7 implements Runnable {
    private final /* synthetic */ Bundle e;
    private final /* synthetic */ u7 f;
    private final /* synthetic */ u7 g;
    private final /* synthetic */ long h;
    private final /* synthetic */ t7 i;

    w7(t7 t7Var, Bundle bundle, u7 u7Var, u7 u7Var2, long j) {
        this.i = t7Var;
        this.e = bundle;
        this.f = u7Var;
        this.g = u7Var2;
        this.h = j;
    }

    public final void run() {
        this.i.K(this.e, this.f, this.g, this.h);
    }
}
