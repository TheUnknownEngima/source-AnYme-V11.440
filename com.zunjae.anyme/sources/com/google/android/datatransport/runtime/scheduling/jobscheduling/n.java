package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.e;
import java.util.concurrent.Executor;

public final class n implements n02<m> {
    private final j12<Context> a;
    private final j12<e> b;
    private final j12<bp> c;
    private final j12<s> d;
    private final j12<Executor> e;
    private final j12<jq> f;
    private final j12<kq> g;

    public n(j12<Context> j12, j12<e> j122, j12<bp> j123, j12<s> j124, j12<Executor> j125, j12<jq> j126, j12<kq> j127) {
        this.a = j12;
        this.b = j122;
        this.c = j123;
        this.d = j124;
        this.e = j125;
        this.f = j126;
        this.g = j127;
    }

    public static n a(j12<Context> j12, j12<e> j122, j12<bp> j123, j12<s> j124, j12<Executor> j125, j12<jq> j126, j12<kq> j127) {
        return new n(j12, j122, j123, j124, j125, j126, j127);
    }

    /* renamed from: b */
    public m get() {
        return new m(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
