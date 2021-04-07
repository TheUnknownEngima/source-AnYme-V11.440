package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

final class x {
    private static WeakReference<x> d;
    private final SharedPreferences a;
    private v b;
    private final Executor c;

    private x(SharedPreferences sharedPreferences, Executor executor) {
        this.c = executor;
        this.a = sharedPreferences;
    }

    public static synchronized x b(Context context, Executor executor) {
        x xVar;
        synchronized (x.class) {
            xVar = null;
            if (d != null) {
                xVar = (x) d.get();
            }
            if (xVar == null) {
                xVar = new x(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                xVar.d();
                d = new WeakReference<>(xVar);
            }
        }
        return xVar;
    }

    private final synchronized void d() {
        this.b = v.d(this.a, "topic_operation_queue", ",", this.c);
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean a(w wVar) {
        return this.b.a(wVar.e());
    }

    /* access modifiers changed from: package-private */
    public final synchronized w c() {
        return w.a(this.b.f());
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean e(w wVar) {
        return this.b.g(wVar.e());
    }
}
