package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.common.d;

public abstract class m<A extends a.b, L> {
    private final j<L> a;
    private final d[] b;
    private final boolean c;

    protected m(j<L> jVar, d[] dVarArr, boolean z) {
        this.a = jVar;
        this.b = dVarArr;
        this.c = z;
    }

    public void a() {
        this.a.a();
    }

    public j.a<L> b() {
        return this.a.b();
    }

    public d[] c() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    public abstract void d(A a2, f81<Void> f81);

    public final boolean e() {
        return this.c;
    }
}
