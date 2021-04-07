package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

@Deprecated
public final class AppMeasurementInstallReferrerReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        uq0.a(context).h(5, "Install Referrer Broadcast deprecated", (Object) null, (Object) null, (Object) null);
    }
}
