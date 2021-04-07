package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.b9;
import com.google.android.gms.measurement.internal.f9;

public final class AppMeasurementService extends Service implements f9 {
    private b9<AppMeasurementService> e;

    private final b9<AppMeasurementService> c() {
        if (this.e == null) {
            this.e = new b9<>(this);
        }
        return this.e;
    }

    public final void a(Intent intent) {
        WakefulBroadcastReceiver.b(intent);
    }

    public final void b(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    public final boolean f(int i) {
        return stopSelfResult(i);
    }

    public final IBinder onBind(Intent intent) {
        return c().b(intent);
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

    public final int onStartCommand(Intent intent, int i, int i2) {
        return c().a(intent, i, i2);
    }

    public final boolean onUnbind(Intent intent) {
        return c().i(intent);
    }
}
