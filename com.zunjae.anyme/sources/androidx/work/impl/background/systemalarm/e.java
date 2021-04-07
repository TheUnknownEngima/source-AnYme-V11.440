package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.h;
import androidx.work.impl.utils.i;
import java.util.ArrayList;
import java.util.List;

public class e implements androidx.work.impl.a {
    static final String n = h.f("SystemAlarmDispatcher");
    final Context e;
    private final g f;
    private final androidx.work.impl.c g;
    private final androidx.work.impl.h h;
    final b i;
    private final Handler j;
    final List<Intent> k;
    Intent l;
    private c m;

    class a implements Runnable {
        a() {
        }

        public void run() {
            d dVar;
            e eVar;
            synchronized (e.this.k) {
                e.this.l = e.this.k.get(0);
            }
            Intent intent = e.this.l;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = e.this.l.getIntExtra("KEY_START_ID", 0);
                h.c().a(e.n, String.format("Processing command %s, %s", new Object[]{e.this.l, Integer.valueOf(intExtra)}), new Throwable[0]);
                PowerManager.WakeLock b = i.b(e.this.e, String.format("%s (%s)", new Object[]{action, Integer.valueOf(intExtra)}));
                try {
                    h.c().a(e.n, String.format("Acquiring operation wake lock (%s) %s", new Object[]{action, b}), new Throwable[0]);
                    b.acquire();
                    e.this.i.p(e.this.l, intExtra, e.this);
                    h.c().a(e.n, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, b}), new Throwable[0]);
                    b.release();
                    eVar = e.this;
                    dVar = new d(eVar);
                } catch (Throwable th) {
                    h.c().a(e.n, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, b}), new Throwable[0]);
                    b.release();
                    e eVar2 = e.this;
                    eVar2.j(new d(eVar2));
                    throw th;
                }
                eVar.j(dVar);
            }
        }
    }

    static class b implements Runnable {
        private final e e;
        private final Intent f;
        private final int g;

        b(e eVar, Intent intent, int i) {
            this.e = eVar;
            this.f = intent;
            this.g = i;
        }

        public void run() {
            this.e.a(this.f, this.g);
        }
    }

    interface c {
        void b();
    }

    static class d implements Runnable {
        private final e e;

        d(e eVar) {
            this.e = eVar;
        }

        public void run() {
            this.e.d();
        }
    }

    e(Context context) {
        this(context, (androidx.work.impl.c) null, (androidx.work.impl.h) null);
    }

    e(Context context, androidx.work.impl.c cVar, androidx.work.impl.h hVar) {
        this.e = context.getApplicationContext();
        this.i = new b(this.e);
        this.f = new g();
        hVar = hVar == null ? androidx.work.impl.h.i() : hVar;
        this.h = hVar;
        cVar = cVar == null ? hVar.k() : cVar;
        this.g = cVar;
        cVar.a(this);
        this.k = new ArrayList();
        this.l = null;
        this.j = new Handler(Looper.getMainLooper());
    }

    private void b() {
        if (this.j.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private boolean h(String str) {
        b();
        synchronized (this.k) {
            for (Intent action : this.k) {
                if (str.equals(action.getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    private void k() {
        b();
        PowerManager.WakeLock b2 = i.b(this.e, "ProcessCommand");
        try {
            b2.acquire();
            this.h.n().c(new a());
        } finally {
            b2.release();
        }
    }

    public boolean a(Intent intent, int i2) {
        boolean z = false;
        h.c().a(n, String.format("Adding command %s (%s)", new Object[]{intent, Integer.valueOf(i2)}), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            h.c().h(n, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && h("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i2);
            synchronized (this.k) {
                if (!this.k.isEmpty()) {
                    z = true;
                }
                this.k.add(intent);
                if (!z) {
                    k();
                }
            }
            return true;
        }
    }

    public void c(String str, boolean z) {
        j(new b(this, b.d(this.e, str, z), 0));
    }

    /* access modifiers changed from: package-private */
    public void d() {
        h.c().a(n, "Checking if commands are complete.", new Throwable[0]);
        b();
        synchronized (this.k) {
            if (this.l != null) {
                h.c().a(n, String.format("Removing command %s", new Object[]{this.l}), new Throwable[0]);
                if (this.k.remove(0).equals(this.l)) {
                    this.l = null;
                } else {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
            }
            if (!this.i.o() && this.k.isEmpty()) {
                h.c().a(n, "No more commands & intents.", new Throwable[0]);
                if (this.m != null) {
                    this.m.b();
                }
            } else if (!this.k.isEmpty()) {
                k();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public androidx.work.impl.c e() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public androidx.work.impl.h f() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public g g() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        this.g.e(this);
        this.f.a();
        this.m = null;
    }

    /* access modifiers changed from: package-private */
    public void j(Runnable runnable) {
        this.j.post(runnable);
    }

    /* access modifiers changed from: package-private */
    public void l(c cVar) {
        if (this.m != null) {
            h.c().b(n, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.m = cVar;
        }
    }
}
