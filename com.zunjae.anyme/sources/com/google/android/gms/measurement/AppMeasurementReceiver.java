package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.y4;
import com.google.android.gms.measurement.internal.z4;

public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements y4 {
    private z4 g;

    public final void a(Context context, Intent intent) {
        WakefulBroadcastReceiver.c(context, intent);
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.g == null) {
            this.g = new z4(this);
        }
        this.g.a(context, intent);
    }
}
