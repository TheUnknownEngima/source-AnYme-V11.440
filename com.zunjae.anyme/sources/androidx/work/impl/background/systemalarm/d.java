package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.h;
import androidx.work.impl.a;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.impl.background.systemalarm.g;
import androidx.work.impl.utils.i;
import java.util.Collections;
import java.util.List;

public class d implements i7, a, g.b {
    private static final String n = h.f("DelayMetCommandHandler");
    private final Context e;
    private final int f;
    private final String g;
    private final e h;
    private final j7 i = new j7(this.e, this);
    private final Object j = new Object();
    private boolean k = false;
    private PowerManager.WakeLock l;
    private boolean m = false;

    d(Context context, int i2, String str, e eVar) {
        this.e = context;
        this.f = i2;
        this.h = eVar;
        this.g = str;
    }

    private void d() {
        synchronized (this.j) {
            this.h.g().c(this.g);
            if (this.l != null && this.l.isHeld()) {
                h.c().a(n, String.format("Releasing wakelock %s for WorkSpec %s", new Object[]{this.l, this.g}), new Throwable[0]);
                this.l.release();
            }
        }
    }

    private void g() {
        synchronized (this.j) {
            if (!this.k) {
                h.c().a(n, String.format("Stopping work for workspec %s", new Object[]{this.g}), new Throwable[0]);
                this.h.j(new e.b(this.h, b.g(this.e, this.g), this.f));
                if (this.h.e().d(this.g)) {
                    h.c().a(n, String.format("WorkSpec %s needs to be rescheduled", new Object[]{this.g}), new Throwable[0]);
                    this.h.j(new e.b(this.h, b.f(this.e, this.g), this.f));
                } else {
                    h.c().a(n, String.format("Processor does not have WorkSpec %s. No need to reschedule ", new Object[]{this.g}), new Throwable[0]);
                }
                this.k = true;
            } else {
                h.c().a(n, String.format("Already stopped work for %s", new Object[]{this.g}), new Throwable[0]);
            }
        }
    }

    public void a(String str) {
        h.c().a(n, String.format("Exceeded time limits on execution for %s", new Object[]{str}), new Throwable[0]);
        g();
    }

    public void b(List<String> list) {
        g();
    }

    public void c(String str, boolean z) {
        h.c().a(n, String.format("onExecuted %s, %s", new Object[]{str, Boolean.valueOf(z)}), new Throwable[0]);
        d();
        if (z) {
            Intent f2 = b.f(this.e, this.g);
            e eVar = this.h;
            eVar.j(new e.b(eVar, f2, this.f));
        }
        if (this.m) {
            Intent a = b.a(this.e);
            e eVar2 = this.h;
            eVar2.j(new e.b(eVar2, a, this.f));
        }
    }

    public void e(List<String> list) {
        if (list.contains(this.g)) {
            h.c().a(n, String.format("onAllConstraintsMet for %s", new Object[]{this.g}), new Throwable[0]);
            if (this.h.e().f(this.g)) {
                this.h.g().b(this.g, 600000, this);
            } else {
                d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.l = i.b(this.e, String.format("%s (%s)", new Object[]{this.g, Integer.valueOf(this.f)}));
        h.c().a(n, String.format("Acquiring wakelock %s for WorkSpec %s", new Object[]{this.l, this.g}), new Throwable[0]);
        this.l.acquire();
        i8 m2 = this.h.f().m().D().m(this.g);
        if (m2 == null) {
            g();
            return;
        }
        boolean b = m2.b();
        this.m = b;
        if (!b) {
            h.c().a(n, String.format("No constraints for %s", new Object[]{this.g}), new Throwable[0]);
            e(Collections.singletonList(this.g));
            return;
        }
        this.i.d(Collections.singletonList(m2));
    }
}
