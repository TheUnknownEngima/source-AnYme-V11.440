package com.google.android.gms.cast;

final /* synthetic */ class r0 implements Runnable {
    private final n0 e;
    private final int f;

    r0(n0 n0Var, int i) {
        this.e = n0Var;
        this.f = i;
    }

    public final void run() {
        n0 n0Var = this.e;
        int i = this.f;
        n0Var.a.k0();
        int unused = n0Var.a.k = u1.a;
        synchronized (n0Var.a.D) {
            for (v1 d : n0Var.a.D) {
                d.d(i);
            }
        }
        n0Var.a.i0();
        c0 c0Var = n0Var.a;
        e81 unused2 = c0Var.A(c0Var.i);
    }
}
