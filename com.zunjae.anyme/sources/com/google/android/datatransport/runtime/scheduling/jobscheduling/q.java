package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.concurrent.Executor;

public class q {
    private final Executor a;
    private final bp b;
    private final s c;
    private final jq d;

    q(Executor executor, bp bpVar, s sVar, jq jqVar) {
        this.a = executor;
        this.b = bpVar;
        this.c = sVar;
        this.d = jqVar;
    }

    static /* synthetic */ Object b(q qVar) {
        for (eo a2 : qVar.b.y()) {
            qVar.c.a(a2, 1);
        }
        return null;
    }

    public void a() {
        this.a.execute(o.a(this));
    }
}
