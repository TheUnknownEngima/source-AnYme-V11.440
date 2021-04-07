package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;

public final class j9 extends f5 {
    /* access modifiers changed from: private */
    public Handler c;
    protected final r9 d = new r9(this);
    protected final p9 e = new p9(this);
    private final k9 f = new k9(this);

    j9(h5 h5Var) {
        super(h5Var);
    }

    /* access modifiers changed from: private */
    public final void F() {
        b();
        if (this.c == null) {
            this.c = new v61(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: private */
    public final void H(long j) {
        b();
        F();
        h().M().b("Activity resumed, time", Long.valueOf(j));
        if (j().s(u.x0)) {
            if (j().H().booleanValue() || i().w.b()) {
                this.e.b(j);
            }
            this.f.a();
        } else {
            this.f.a();
            if (j().H().booleanValue()) {
                this.e.b(j);
            }
        }
        r9 r9Var = this.d;
        r9Var.a.b();
        if (r9Var.a.a.p()) {
            if (!r9Var.a.j().s(u.x0)) {
                r9Var.a.i().w.a(false);
            }
            r9Var.b(r9Var.a.l().c(), false);
        }
    }

    /* access modifiers changed from: private */
    public final void J(long j) {
        b();
        F();
        h().M().b("Activity paused, time", Long.valueOf(j));
        this.f.b(j);
        if (j().H().booleanValue()) {
            this.e.f(j);
        }
        r9 r9Var = this.d;
        if (!r9Var.a.j().s(u.x0)) {
            r9Var.a.i().w.a(true);
        }
    }

    /* access modifiers changed from: package-private */
    public final long B(long j) {
        return this.e.g(j);
    }

    public final boolean E(boolean z, boolean z2, long j) {
        return this.e.d(z, z2, j);
    }

    /* access modifiers changed from: protected */
    public final boolean z() {
        return false;
    }
}
