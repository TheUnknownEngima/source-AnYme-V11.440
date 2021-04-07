package com.google.android.gms.measurement.internal;

abstract class u9 extends v9 {
    private boolean c;

    u9(x9 x9Var) {
        super(x9Var);
        this.b.s(this);
    }

    /* access modifiers changed from: package-private */
    public final boolean q() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public final void r() {
        if (!q()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void s() {
        if (!this.c) {
            t();
            this.b.j0();
            this.c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    public abstract boolean t();
}
