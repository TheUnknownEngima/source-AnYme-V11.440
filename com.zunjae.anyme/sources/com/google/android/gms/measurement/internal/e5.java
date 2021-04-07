package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.r;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

final class e5<V> extends FutureTask<V> implements Comparable<e5<V>> {
    private final long e;
    final boolean f;
    private final String g;
    private final /* synthetic */ a5 h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    e5(a5 a5Var, Runnable runnable, boolean z, String str) {
        super(runnable, (Object) null);
        this.h = a5Var;
        a31.a().b(runnable);
        r.j(str);
        long andIncrement = a5.l.getAndIncrement();
        this.e = andIncrement;
        this.g = str;
        this.f = z;
        if (andIncrement == Long.MAX_VALUE) {
            a5Var.h().E().a("Tasks index overflow");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    e5(a5 a5Var, Callable<V> callable, boolean z, String str) {
        super(callable);
        this.h = a5Var;
        a31.a().a(callable);
        r.j(str);
        long andIncrement = a5.l.getAndIncrement();
        this.e = andIncrement;
        this.g = str;
        this.f = z;
        if (andIncrement == Long.MAX_VALUE) {
            a5Var.h().E().a("Tasks index overflow");
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        e5 e5Var = (e5) obj;
        boolean z = this.f;
        if (z != e5Var.f) {
            return z ? -1 : 1;
        }
        long j = this.e;
        long j2 = e5Var.e;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.h.h().F().b("Two tasks share the same index. index", Long.valueOf(this.e));
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        this.h.h().E().b(this.g, th);
        super.setException(th);
    }
}
