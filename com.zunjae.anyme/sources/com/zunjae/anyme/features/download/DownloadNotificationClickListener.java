package com.zunjae.anyme.features.download;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class DownloadNotificationClickListener extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        v62.e(context, "context");
        v62.e(intent, "intent");
        if (v62.a("android.intent.action.DOWNLOAD_NOTIFICATION_CLICKED", intent.getAction())) {
            Intent a = DownloadManagerActivity.G.a(context);
            a.setFlags(268435456);
            context.startActivity(a);
        }
    }
}
