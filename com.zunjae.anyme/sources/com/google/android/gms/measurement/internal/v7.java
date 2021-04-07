package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class v7 implements Runnable {
    private final /* synthetic */ u7 e;
    private final /* synthetic */ u7 f;
    private final /* synthetic */ long g;
    private final /* synthetic */ boolean h;
    private final /* synthetic */ t7 i;

    v7(t7 t7Var, u7 u7Var, u7 u7Var2, long j, boolean z) {
        this.i = t7Var;
        this.e = u7Var;
        this.f = u7Var2;
        this.g = j;
        this.h = z;
    }

    public final void run() {
        this.i.P(this.e, this.f, this.g, this.h, (Bundle) null);
    }
}
