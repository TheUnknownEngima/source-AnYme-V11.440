package com.google.android.gms.cast.framework.media;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.n;

final class k0 extends BroadcastReceiver {
    private final /* synthetic */ MediaNotificationService a;

    k0(MediaNotificationService mediaNotificationService) {
        this.a = mediaNotificationService;
    }

    public final void onReceive(Context context, Intent intent) {
        PendingIntent pendingIntent;
        ComponentName componentName = (ComponentName) intent.getParcelableExtra("targetActivity");
        Intent intent2 = new Intent();
        intent2.setComponent(componentName);
        if (this.a.s.l()) {
            intent2.setFlags(603979776);
            pendingIntent = PendingIntent.getActivity(context, 1, intent2, 134217728);
        } else {
            n g = n.g(this.a);
            g.d(componentName);
            g.a(intent2);
            pendingIntent = g.h(1, 134217728);
        }
        try {
            pendingIntent.send(context, 1, new Intent().setFlags(268435456));
        } catch (PendingIntent.CanceledException e) {
            MediaNotificationService.u.b(e, "Sending PendingIntent failed", new Object[0]);
        }
    }
}
