package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.r;
import java.lang.Thread;

final class c5 implements Thread.UncaughtExceptionHandler {
    private final String a;
    private final /* synthetic */ a5 b;

    public c5(a5 a5Var, String str) {
        this.b = a5Var;
        r.j(str);
        this.a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.b.h().E().b(this.a, th);
    }
}
