package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.internal.j;

public abstract class s<A extends a.b, L> {
    private final j.a<L> a;

    protected s(j.a<L> aVar) {
        this.a = aVar;
    }

    public j.a<L> a() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public abstract void b(A a2, f81<Boolean> f81);
}
