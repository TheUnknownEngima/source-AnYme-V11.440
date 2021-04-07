package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.h;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.e;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ForceStopRunnable implements Runnable {
    private static final String g = h.f("ForceStopRunnable");
    private static final long h = TimeUnit.DAYS.toMillis(3650);
    private final Context e;
    private final androidx.work.impl.h f;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        private static final String a = h.f("ForceStopRunnable$Rcvr");

        public void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                h.c().g(a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
                ForceStopRunnable.d(context);
            }
        }
    }

    public ForceStopRunnable(Context context, androidx.work.impl.h hVar) {
        this.e = context.getApplicationContext();
        this.f = hVar;
    }

    static Intent a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static PendingIntent b(Context context, int i) {
        return PendingIntent.getBroadcast(context, -1, a(context), i);
    }

    static void d(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent b = b(context, 134217728);
        long currentTimeMillis = System.currentTimeMillis() + h;
        if (alarmManager == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            alarmManager.setExact(0, currentTimeMillis, b);
        } else {
            alarmManager.set(0, currentTimeMillis, b);
        }
    }

    public boolean c() {
        if (b(this.e, 536870912) != null) {
            return false;
        }
        d(this.e);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return this.f.j().b();
    }

    /* JADX INFO: finally extract failed */
    public void run() {
        if (e()) {
            h.c().a(g, "Rescheduling Workers.", new Throwable[0]);
            this.f.q();
            this.f.j().c(false);
        } else if (c()) {
            h.c().a(g, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f.q();
        } else {
            WorkDatabase m = this.f.m();
            j8 D = m.D();
            try {
                m.c();
                List<i8> i = D.i();
                if (i != null && !i.isEmpty()) {
                    h.c().a(g, "Found unfinished work, scheduling it.", new Throwable[0]);
                    for (i8 i8Var : i) {
                        D.b(i8Var.a, -1);
                    }
                    e.b(this.f.h(), m, this.f.l());
                }
                m.v();
                m.h();
                h.c().a(g, "Unfinished Workers exist, rescheduling.", new Throwable[0]);
            } catch (Throwable th) {
                m.h();
                throw th;
            }
        }
        this.f.p();
    }
}
