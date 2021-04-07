package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.b9;
import com.google.android.gms.measurement.internal.f9;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements f9 {
    private b9<AppMeasurementJobService> e;

    private final b9<AppMeasurementJobService> c() {
        if (this.e == null) {
            this.e = new b9<>(this);
        }
        return this.e;
    }

    public final void a(Intent intent) {
    }

    @TargetApi(24)
    public final void b(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    public final boolean f(int i) {
        throw new UnsupportedOperationException();
    }

    public final void onCreate() {
        super.onCreate();
        c().c();
    }

    public final void onDestroy() {
        c().h();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        c().k(intent);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        return c().g(jobParameters);
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onUnbind(Intent intent) {
        return c().i(intent);
    }
}
