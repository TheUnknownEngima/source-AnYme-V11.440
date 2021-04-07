package com.google.android.gms.measurement.internal;

final class m4 implements Runnable {
    private final /* synthetic */ boolean e;
    private final /* synthetic */ n4 f;

    m4(n4 n4Var, boolean z) {
        this.f = n4Var;
        this.e = z;
    }

    public final void run() {
        this.f.a.C(this.e);
    }
}
