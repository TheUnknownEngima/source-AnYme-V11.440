package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.concurrent.Executor;

public final class r implements n02<q> {
    private final j12<Executor> a;
    private final j12<bp> b;
    private final j12<s> c;
    private final j12<jq> d;

    public r(j12<Executor> j12, j12<bp> j122, j12<s> j123, j12<jq> j124) {
        this.a = j12;
        this.b = j122;
        this.c = j123;
        this.d = j124;
    }

    public static r a(j12<Executor> j12, j12<bp> j122, j12<s> j123, j12<jq> j124) {
        return new r(j12, j122, j123, j124);
    }

    /* renamed from: b */
    public q get() {
        return new q(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
