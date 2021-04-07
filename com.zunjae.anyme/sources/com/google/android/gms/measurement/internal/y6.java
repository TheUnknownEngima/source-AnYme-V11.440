package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class y6 implements Runnable {
    private final /* synthetic */ Bundle e;
    private final /* synthetic */ l6 f;

    y6(l6 l6Var, Bundle bundle) {
        this.f = l6Var;
        this.e = bundle;
    }

    public final void run() {
        this.f.z0(this.e);
    }
}
