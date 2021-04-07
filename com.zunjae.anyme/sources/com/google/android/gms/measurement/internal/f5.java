package com.google.android.gms.measurement.internal;

abstract class f5 extends d2 {
    private boolean b;

    f5(h5 h5Var) {
        super(h5Var);
        this.a.d(this);
    }

    /* access modifiers changed from: protected */
    public void A() {
    }

    /* access modifiers changed from: package-private */
    public final boolean v() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    public final void w() {
        if (!v()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void x() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!z()) {
            this.a.t();
            this.b = true;
        }
    }

    public final void y() {
        if (!this.b) {
            A();
            this.a.t();
            this.b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    public abstract boolean z();
}
