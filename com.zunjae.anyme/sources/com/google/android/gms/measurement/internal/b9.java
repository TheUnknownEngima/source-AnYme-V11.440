package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.measurement.internal.f9;

public final class b9<T extends Context & f9> {
    private final T a;

    public b9(T t) {
        r.j(t);
        this.a = t;
    }

    private final void f(Runnable runnable) {
        x9 d = x9.d(this.a);
        d.f().y(new g9(this, d, runnable));
    }

    private final c4 j() {
        return h5.a(this.a, (sq0) null, (Long) null).h();
    }

    public final int a(Intent intent, int i, int i2) {
        c4 h = h5.a(this.a, (sq0) null, (Long) null).h();
        if (intent == null) {
            h.H().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        h.M().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            f(new e9(this, i2, h, intent));
        }
        return 2;
    }

    public final IBinder b(Intent intent) {
        if (intent == null) {
            j().E().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new i5(x9.d(this.a));
        }
        j().H().b("onBind received unknown action", action);
        return null;
    }

    public final void c() {
        h5.a(this.a, (sq0) null, (Long) null).h().M().a("Local AppMeasurementService is starting up");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(int i, c4 c4Var, Intent intent) {
        if (((f9) this.a).f(i)) {
            c4Var.M().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            j().M().a("Completed wakeful intent.");
            ((f9) this.a).a(intent);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e(c4 c4Var, JobParameters jobParameters) {
        c4Var.M().a("AppMeasurementJobService processed last upload request.");
        ((f9) this.a).b(jobParameters, false);
    }

    @TargetApi(24)
    public final boolean g(JobParameters jobParameters) {
        c4 h = h5.a(this.a, (sq0) null, (Long) null).h();
        String string = jobParameters.getExtras().getString("action");
        h.M().b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        f(new d9(this, h, jobParameters));
        return true;
    }

    public final void h() {
        h5.a(this.a, (sq0) null, (Long) null).h().M().a("Local AppMeasurementService is shutting down");
    }

    public final boolean i(Intent intent) {
        if (intent == null) {
            j().E().a("onUnbind called with null intent");
            return true;
        }
        j().M().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    public final void k(Intent intent) {
        if (intent == null) {
            j().E().a("onRebind called with null intent");
            return;
        }
        j().M().b("onRebind called. action", intent.getAction());
    }
}
