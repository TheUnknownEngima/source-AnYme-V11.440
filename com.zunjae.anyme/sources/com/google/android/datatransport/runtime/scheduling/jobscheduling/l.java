package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import defpackage.jq;

final /* synthetic */ class l implements jq.a {
    private final m a;
    private final eo b;
    private final int c;

    private l(m mVar, eo eoVar, int i) {
        this.a = mVar;
        this.b = eoVar;
        this.c = i;
    }

    public static jq.a a(m mVar, eo eoVar, int i) {
        return new l(mVar, eoVar, i);
    }

    public Object h() {
        return this.a.d.a(this.b, this.c + 1);
    }
}
