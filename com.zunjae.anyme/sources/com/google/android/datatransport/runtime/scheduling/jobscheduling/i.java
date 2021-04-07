package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import defpackage.jq;

final /* synthetic */ class i implements jq.a {
    private final m a;
    private final eo b;

    private i(m mVar, eo eoVar) {
        this.a = mVar;
        this.b = eoVar;
    }

    public static jq.a a(m mVar, eo eoVar) {
        return new i(mVar, eoVar);
    }

    public Object h() {
        return this.a.c.s(this.b);
    }
}
