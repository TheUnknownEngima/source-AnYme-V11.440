package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;

public final class t9 extends u9 {
    private final AlarmManager d = ((AlarmManager) n().getSystemService("alarm"));
    private final k e;
    private Integer f;

    protected t9(x9 x9Var) {
        super(x9Var);
        this.e = new s9(this, x9Var.k0(), x9Var);
    }

    @TargetApi(24)
    private final void w() {
        ((JobScheduler) n().getSystemService("jobscheduler")).cancel(x());
    }

    private final int x() {
        if (this.f == null) {
            String valueOf = String.valueOf(n().getPackageName());
            this.f = Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new String("measurement")).hashCode());
        }
        return this.f.intValue();
    }

    private final PendingIntent y() {
        Context n = n();
        return PendingIntent.getBroadcast(n, 0, new Intent().setClassName(n, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }

    /* access modifiers changed from: protected */
    public final boolean t() {
        this.d.cancel(y());
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        w();
        return false;
    }

    public final void u(long j) {
        r();
        Context n = n();
        if (!z4.b(n)) {
            h().L().a("Receiver not registered/enabled");
        }
        if (!fa.Y(n, false)) {
            h().L().a("Service not registered/enabled");
        }
        v();
        h().M().b("Scheduling upload, millis", Long.valueOf(j));
        long a = l().a() + j;
        if (j < Math.max(0, u.x.a(null).longValue()) && !this.e.d()) {
            this.e.c(j);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Context n2 = n();
            ComponentName componentName = new ComponentName(n2, "com.google.android.gms.measurement.AppMeasurementJobService");
            int x = x();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            yx0.b(n2, new JobInfo.Builder(x, componentName).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        this.d.setInexactRepeating(2, a, Math.max(u.s.a(null).longValue(), j), y());
    }

    public final void v() {
        r();
        h().M().a("Unscheduling upload");
        this.d.cancel(y());
        this.e.e();
        if (Build.VERSION.SDK_INT >= 24) {
            w();
        }
    }
}
