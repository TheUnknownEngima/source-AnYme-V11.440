package com.google.android.gms.measurement.internal;

abstract class d6 extends a6 {
    private boolean b;

    d6(h5 h5Var) {
        super(h5Var);
        this.a.i(this);
    }

    /* access modifiers changed from: protected */
    public void k() {
    }

    /* access modifiers changed from: protected */
    public final void m() {
        if (!s()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void p() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!r()) {
            this.a.t();
            this.b = true;
        }
    }

    public final void q() {
        if (!this.b) {
            k();
            this.a.t();
            this.b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    public abstract boolean r();

    /* access modifiers changed from: package-private */
    public final boolean s() {
        return this.b;
    }
}
