package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.h;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.a;
import androidx.work.impl.background.systemalarm.e;
import java.util.HashMap;
import java.util.Map;

public class b implements a {
    private static final String h = h.f("CommandHandler");
    private final Context e;
    private final Map<String, a> f = new HashMap();
    private final Object g = new Object();

    b(Context context) {
        this.e = context;
    }

    static Intent a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static Intent b(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent d(Context context, String str, boolean z) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return intent;
    }

    static Intent e(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    static Intent f(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent g(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    private void h(Intent intent, int i, e eVar) {
        h.c().a(h, String.format("Handling constraints changed %s", new Object[]{intent}), new Throwable[0]);
        new c(this.e, i, eVar).a();
    }

    private void i(Intent intent, int i, e eVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.g) {
            String string = extras.getString("KEY_WORKSPEC_ID");
            h.c().a(h, String.format("Handing delay met for %s", new Object[]{string}), new Throwable[0]);
            if (!this.f.containsKey(string)) {
                d dVar = new d(this.e, i, string, eVar);
                this.f.put(string, dVar);
                dVar.f();
            } else {
                h.c().a(h, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", new Object[]{string}), new Throwable[0]);
            }
        }
    }

    private void j(Intent intent, int i, e eVar) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        h.c().a(h, String.format("Handling onExecutionCompleted %s, %s", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        c(string, z);
    }

    private void k(Intent intent, int i, e eVar) {
        h.c().a(h, String.format("Handling reschedule %s, %s", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        eVar.f().q();
    }

    private void l(Intent intent, int i, e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        h.c().a(h, String.format("Handling schedule work for %s", new Object[]{string}), new Throwable[0]);
        WorkDatabase m = eVar.f().m();
        m.c();
        try {
            i8 m2 = m.D().m(string);
            if (m2 == null) {
                h c = h.c();
                String str = h;
                c.h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
            } else if (m2.b.isFinished()) {
                h c2 = h.c();
                String str2 = h;
                c2.h(str2, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                m.h();
            } else {
                long a = m2.a();
                if (!m2.b()) {
                    h.c().a(h, String.format("Setting up Alarms for %s at %s", new Object[]{string, Long.valueOf(a)}), new Throwable[0]);
                    a.c(this.e, eVar.f(), string, a);
                } else {
                    h.c().a(h, String.format("Opportunistically setting an alarm for %s at %s", new Object[]{string, Long.valueOf(a)}), new Throwable[0]);
                    a.c(this.e, eVar.f(), string, a);
                    eVar.j(new e.b(eVar, a(this.e), i));
                }
                m.v();
                m.h();
            }
        } finally {
            m.h();
        }
    }

    private void m(Intent intent, int i, e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        h.c().a(h, String.format("Handing stopWork work for %s", new Object[]{string}), new Throwable[0]);
        eVar.f().u(string);
        a.a(this.e, eVar.f(), string);
        eVar.c(string, false);
    }

    private static boolean n(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    public void c(String str, boolean z) {
        synchronized (this.g) {
            a remove = this.f.remove(str);
            if (remove != null) {
                remove.c(str, z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean o() {
        boolean z;
        synchronized (this.g) {
            z = !this.f.isEmpty();
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public void p(Intent intent, int i, e eVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            h(intent, i, eVar);
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            k(intent, i, eVar);
        } else if (!n(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            h.c().b(h, String.format("Invalid request for %s, requires %s.", new Object[]{action, "KEY_WORKSPEC_ID"}), new Throwable[0]);
        } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
            l(intent, i, eVar);
        } else if ("ACTION_DELAY_MET".equals(action)) {
            i(intent, i, eVar);
        } else if ("ACTION_STOP_WORK".equals(action)) {
            m(intent, i, eVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            j(intent, i, eVar);
        } else {
            h.c().h(h, String.format("Ignoring intent %s", new Object[]{intent}), new Throwable[0]);
        }
    }
}
