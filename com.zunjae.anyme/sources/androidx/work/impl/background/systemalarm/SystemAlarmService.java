package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.LifecycleService;
import androidx.work.h;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.impl.utils.i;

public class SystemAlarmService extends LifecycleService implements e.c {
    private static final String g = h.f("SystemAlarmService");
    private e f;

    public void b() {
        h.c().a(g, "All commands completed in dispatcher", new Throwable[0]);
        i.a();
        stopSelf();
    }

    public void onCreate() {
        super.onCreate();
        e eVar = new e(this);
        this.f = eVar;
        eVar.l(this);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f.i();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (intent == null) {
            return 3;
        }
        this.f.a(intent, i2);
        return 3;
    }
}
