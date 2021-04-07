package com.google.android.gms.measurement.internal;

final class e7 implements Runnable {
    private final /* synthetic */ Boolean e;
    private final /* synthetic */ l6 f;

    e7(l6 l6Var, Boolean bool) {
        this.f = l6Var;
        this.e = bool;
    }

    public final void run() {
        this.f.S(this.e, true);
    }
}
