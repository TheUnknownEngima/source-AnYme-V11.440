package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import defpackage.jq;

final /* synthetic */ class k implements jq.a {
    private final bp a;

    private k(bp bpVar) {
        this.a = bpVar;
    }

    public static jq.a a(bp bpVar) {
        return new k(bpVar);
    }

    public Object h() {
        return Integer.valueOf(this.a.g());
    }
}
