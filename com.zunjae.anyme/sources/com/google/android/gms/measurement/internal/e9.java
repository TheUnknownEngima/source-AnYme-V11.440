package com.google.android.gms.measurement.internal;

import android.content.Intent;

final /* synthetic */ class e9 implements Runnable {
    private final b9 e;
    private final int f;
    private final c4 g;
    private final Intent h;

    e9(b9 b9Var, int i, c4 c4Var, Intent intent) {
        this.e = b9Var;
        this.f = i;
        this.g = c4Var;
        this.h = intent;
    }

    public final void run() {
        this.e.d(this.f, this.g, this.h);
    }
}
