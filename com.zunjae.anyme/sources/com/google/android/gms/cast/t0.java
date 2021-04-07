package com.google.android.gms.cast;

final /* synthetic */ class t0 implements Runnable {
    private final n0 e;
    private final int f;

    t0(n0 n0Var, int i) {
        this.e = n0Var;
        this.f = i;
    }

    public final void run() {
        n0 n0Var = this.e;
        int i = this.f;
        int unused = n0Var.a.k = u1.c;
        synchronized (n0Var.a.D) {
            for (v1 b : n0Var.a.D) {
                b.b(i);
            }
        }
    }
}
