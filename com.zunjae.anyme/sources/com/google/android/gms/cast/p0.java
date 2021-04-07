package com.google.android.gms.cast;

final /* synthetic */ class p0 implements Runnable {
    private final n0 e;
    private final int f;

    p0(n0 n0Var, int i) {
        this.e = n0Var;
        this.f = i;
    }

    public final void run() {
        n0 n0Var = this.e;
        int i = this.f;
        if (i == 0) {
            int unused = n0Var.a.k = u1.b;
            boolean unused2 = n0Var.a.l = true;
            boolean unused3 = n0Var.a.m = true;
            synchronized (n0Var.a.D) {
                for (v1 a : n0Var.a.D) {
                    a.a();
                }
            }
            return;
        }
        int unused4 = n0Var.a.k = u1.a;
        synchronized (n0Var.a.D) {
            for (v1 c : n0Var.a.D) {
                c.c(i);
            }
        }
        n0Var.a.i0();
    }
}
