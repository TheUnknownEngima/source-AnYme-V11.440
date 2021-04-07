package androidx.work.impl.background.systemalarm;

import androidx.work.h;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

class g {
    private static final String f = h.f("WorkTimer");
    private final ThreadFactory a = new a(this);
    private final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor(this.a);
    final Map<String, c> c = new HashMap();
    final Map<String, b> d = new HashMap();
    final Object e = new Object();

    class a implements ThreadFactory {
        private int a = 0;

        a(g gVar) {
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.a);
            this.a = this.a + 1;
            return newThread;
        }
    }

    interface b {
        void a(String str);
    }

    static class c implements Runnable {
        private final g e;
        private final String f;

        c(g gVar, String str) {
            this.e = gVar;
            this.f = str;
        }

        public void run() {
            synchronized (this.e.e) {
                if (this.e.c.remove(this.f) != null) {
                    b remove = this.e.d.remove(this.f);
                    if (remove != null) {
                        remove.a(this.f);
                    }
                } else {
                    h.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[]{this.f}), new Throwable[0]);
                }
            }
        }
    }

    g() {
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.b.shutdownNow();
    }

    /* access modifiers changed from: package-private */
    public void b(String str, long j, b bVar) {
        synchronized (this.e) {
            h.c().a(f, String.format("Starting timer for %s", new Object[]{str}), new Throwable[0]);
            c(str);
            c cVar = new c(this, str);
            this.c.put(str, cVar);
            this.d.put(str, bVar);
            this.b.schedule(cVar, j, TimeUnit.MILLISECONDS);
        }
    }

    /* access modifiers changed from: package-private */
    public void c(String str) {
        synchronized (this.e) {
            if (this.c.remove(str) != null) {
                h.c().a(f, String.format("Stopping timer for %s", new Object[]{str}), new Throwable[0]);
                this.d.remove(str);
            }
        }
    }
}
