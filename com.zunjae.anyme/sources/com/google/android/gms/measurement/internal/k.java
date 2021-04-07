package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.r;

abstract class k {
    private static volatile Handler d;
    private final c6 a;
    private final Runnable b;
    /* access modifiers changed from: private */
    public volatile long c;

    k(c6 c6Var) {
        r.j(c6Var);
        this.a = c6Var;
        this.b = new j(this, c6Var);
    }

    private final Handler f() {
        Handler handler;
        if (d != null) {
            return d;
        }
        synchronized (k.class) {
            if (d == null) {
                d = new v61(this.a.n().getMainLooper());
            }
            handler = d;
        }
        return handler;
    }

    public abstract void b();

    public final void c(long j) {
        e();
        if (j >= 0) {
            this.c = this.a.l().c();
            if (!f().postDelayed(this.b, j)) {
                this.a.h().E().b("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    public final boolean d() {
        return this.c != 0;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        this.c = 0;
        f().removeCallbacks(this.b);
    }
}
