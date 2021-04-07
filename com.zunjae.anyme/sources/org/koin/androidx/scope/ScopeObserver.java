package org.koin.androidx.scope;

import androidx.lifecycle.h;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import defpackage.og2;

public final class ScopeObserver implements m, og2 {
    private final h.a e;
    private final Object f;
    private final sh2 g;

    public mg2 m() {
        return og2.a.a(this);
    }

    @v(h.a.ON_DESTROY)
    public final void onDestroy() {
        if (this.e == h.a.ON_DESTROY) {
            kh2 b = ng2.c.b();
            b.a(this.f + " received ON_DESTROY");
            this.g.b();
        }
    }

    @v(h.a.ON_STOP)
    public final void onStop() {
        if (this.e == h.a.ON_STOP) {
            kh2 b = ng2.c.b();
            b.a(this.f + " received ON_STOP");
            this.g.b();
        }
    }
}
