package com.google.android.gms.measurement.internal;

final class i9 implements Runnable {
    private final /* synthetic */ long e;
    private final /* synthetic */ j9 f;

    i9(j9 j9Var, long j) {
        this.f = j9Var;
        this.e = j;
    }

    public final void run() {
        this.f.H(this.e);
    }
}
