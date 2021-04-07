package defpackage;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: rc1  reason: default package */
public final class rc1 {

    /* renamed from: rc1$a */
    class a implements ThreadFactory {
        final /* synthetic */ String a;
        final /* synthetic */ AtomicLong b;

        /* renamed from: rc1$a$a  reason: collision with other inner class name */
        class C0137a extends zb1 {
            final /* synthetic */ Runnable e;

            C0137a(a aVar, Runnable runnable) {
                this.e = runnable;
            }

            public void a() {
                this.e.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.a = str;
            this.b = atomicLong;
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C0137a(this, runnable));
            newThread.setName(this.a + this.b.getAndIncrement());
            return newThread;
        }
    }

    /* renamed from: rc1$b */
    class b extends zb1 {
        final /* synthetic */ String e;
        final /* synthetic */ ExecutorService f;
        final /* synthetic */ long g;
        final /* synthetic */ TimeUnit h;

        b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
            this.e = str;
            this.f = executorService;
            this.g = j;
            this.h = timeUnit;
        }

        public void a() {
            try {
                jb1 f2 = jb1.f();
                f2.b("Executing shutdown hook for " + this.e);
                this.f.shutdown();
                if (!this.f.awaitTermination(this.g, this.h)) {
                    jb1 f3 = jb1.f();
                    f3.b(this.e + " did not shut down in the allocated time. Requesting immediate shutdown.");
                    this.f.shutdownNow();
                }
            } catch (InterruptedException unused) {
                jb1.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{this.e}));
                this.f.shutdownNow();
            }
        }
    }

    private static final void a(String str, ExecutorService executorService) {
        b(str, executorService, 2, TimeUnit.SECONDS);
    }

    public static final void b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        b bVar = new b(str, executorService, j, timeUnit);
        runtime.addShutdownHook(new Thread(bVar, "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService c(String str) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(d(str));
        a(str, newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    public static final ThreadFactory d(String str) {
        return new a(str, new AtomicLong(1));
    }
}
