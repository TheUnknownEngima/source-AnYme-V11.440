package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

final class a9 implements Runnable {
    private final /* synthetic */ w8 e;

    a9(w8 w8Var) {
        this.e = w8Var;
    }

    public final void run() {
        this.e.c.D(new ComponentName(this.e.c.n(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
