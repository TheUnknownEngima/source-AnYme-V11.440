package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.h;

public class RescheduleReceiver extends BroadcastReceiver {
    private static final String a = h.f("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        h.c().a(a, String.format("Received intent %s", new Object[]{intent}), new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 23) {
            androidx.work.impl.h i = androidx.work.impl.h.i();
            if (i == null) {
                h.c().b(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", new Throwable[0]);
            } else {
                i.r(goAsync());
            }
        } else {
            context.startService(b.e(context));
        }
    }
}
