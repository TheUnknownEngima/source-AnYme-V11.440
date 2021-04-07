package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final /* synthetic */ class l5 implements Runnable {
    private final i5 e;
    private final la f;
    private final Bundle g;

    l5(i5 i5Var, la laVar, Bundle bundle) {
        this.e = i5Var;
        this.f = laVar;
        this.g = bundle;
    }

    public final void run() {
        this.e.r3(this.f, this.g);
    }
}
