package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.backends.g;
import defpackage.jq;

final /* synthetic */ class j implements jq.a {
    private final m a;
    private final g b;
    private final Iterable c;
    private final eo d;
    private final int e;

    private j(m mVar, g gVar, Iterable iterable, eo eoVar, int i) {
        this.a = mVar;
        this.b = gVar;
        this.c = iterable;
        this.d = eoVar;
        this.e = i;
    }

    public static jq.a a(m mVar, g gVar, Iterable iterable, eo eoVar, int i) {
        return new j(mVar, gVar, iterable, eoVar, i);
    }

    public Object h() {
        return m.c(this.a, this.b, this.c, this.d, this.e);
    }
}
