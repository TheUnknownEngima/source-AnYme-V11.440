package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

final class y8 implements Runnable {
    private final /* synthetic */ ComponentName e;
    private final /* synthetic */ w8 f;

    y8(w8 w8Var, ComponentName componentName) {
        this.f = w8Var;
        this.e = componentName;
    }

    public final void run() {
        this.f.c.D(this.e);
    }
}
