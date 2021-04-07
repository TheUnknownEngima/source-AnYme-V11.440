package com.google.android.gms.cast;

final /* synthetic */ class s0 implements Runnable {
    private final n0 e;
    private final int f;

    s0(n0 n0Var, int i) {
        this.e = n0Var;
        this.f = i;
    }

    public final void run() {
        n0 n0Var = this.e;
        n0Var.a.C.b(this.f);
    }
}
