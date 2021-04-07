package com.google.android.gms.measurement.internal;

final class j implements Runnable {
    private final /* synthetic */ c6 e;
    private final /* synthetic */ k f;

    j(k kVar, c6 c6Var) {
        this.f = kVar;
        this.e = c6Var;
    }

    public final void run() {
        this.e.o();
        if (va.a()) {
            this.e.f().y(this);
            return;
        }
        boolean d = this.f.d();
        long unused = this.f.c = 0;
        if (d) {
            this.f.b();
        }
    }
}
