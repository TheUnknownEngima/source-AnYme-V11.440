package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.work.h;
import androidx.work.impl.d;

public class f implements d {
    private static final String f = h.f("SystemAlarmScheduler");
    private final Context e;

    public f(Context context) {
        this.e = context.getApplicationContext();
    }

    private void b(i8 i8Var) {
        h.c().a(f, String.format("Scheduling work with workSpecId %s", new Object[]{i8Var.a}), new Throwable[0]);
        this.e.startService(b.f(this.e, i8Var.a));
    }

    public void a(i8... i8VarArr) {
        for (i8 b : i8VarArr) {
            b(b);
        }
    }

    public void d(String str) {
        this.e.startService(b.g(this.e, str));
    }
}
