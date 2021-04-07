package com.google.android.gms.measurement.internal;

final class n9 implements Runnable {
    long e;
    long f;
    final /* synthetic */ k9 g;

    n9(k9 k9Var, long j, long j2) {
        this.g = k9Var;
        this.e = j;
        this.f = j2;
    }

    public final void run() {
        this.g.b.f().y(new m9(this));
    }
}
