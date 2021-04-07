package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.e;

final class q9 {
    private final e a;
    private long b;

    public q9(e eVar) {
        r.j(eVar);
        this.a = eVar;
    }

    public final void a() {
        this.b = this.a.a();
    }

    public final boolean b(long j) {
        return this.b == 0 || this.a.a() - this.b >= 3600000;
    }

    public final void c() {
        this.b = 0;
    }
}
