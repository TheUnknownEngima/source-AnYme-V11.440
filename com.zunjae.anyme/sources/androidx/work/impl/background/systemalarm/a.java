package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.h;
import androidx.work.impl.utils.c;

class a {
    private static final String a = h.f("Alarms");

    public static void a(Context context, androidx.work.impl.h hVar, String str) {
        d8 B = hVar.m().B();
        c8 b = B.b(str);
        if (b != null) {
            b(context, str, b.b);
            h.c().a(a, String.format("Removing SystemIdInfo for workSpecId (%s)", new Object[]{str}), new Throwable[0]);
            B.c(str);
        }
    }

    private static void b(Context context, String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, b.b(context, str), 536870912);
        if (service != null && alarmManager != null) {
            h.c().a(a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", new Object[]{str, Integer.valueOf(i)}), new Throwable[0]);
            alarmManager.cancel(service);
        }
    }

    public static void c(Context context, androidx.work.impl.h hVar, String str, long j) {
        d8 B = hVar.m().B();
        c8 b = B.b(str);
        if (b != null) {
            b(context, str, b.b);
            d(context, str, b.b, j);
            return;
        }
        int b2 = new c(context).b();
        B.a(new c8(str, b2));
        d(context, str, b2, j);
    }

    private static void d(Context context, String str, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, b.b(context, str), 1073741824);
        if (alarmManager == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            alarmManager.setExact(0, j, service);
        } else {
            alarmManager.set(0, j, service);
        }
    }
}
