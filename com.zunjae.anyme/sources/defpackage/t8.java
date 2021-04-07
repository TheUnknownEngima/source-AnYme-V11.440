package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: t8  reason: default package */
public class t8 implements s8 {
    private final Handler a = new Handler(Looper.getMainLooper());
    private final Executor b = new a();
    volatile Thread c;
    private final ThreadFactory d;
    private final ExecutorService e;

    /* renamed from: t8$a */
    class a implements Executor {
        a() {
        }

        public void execute(Runnable runnable) {
            t8.this.e(runnable);
        }
    }

    /* renamed from: t8$b */
    class b implements ThreadFactory {
        private int a = 0;

        b() {
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkManagerTaskExecutor-thread-" + this.a);
            this.a = this.a + 1;
            t8.this.c = newThread;
            return newThread;
        }
    }

    public t8() {
        b bVar = new b();
        this.d = bVar;
        this.e = Executors.newSingleThreadExecutor(bVar);
    }

    public Thread a() {
        return this.c;
    }

    public Executor b() {
        return this.b;
    }

    public void c(Runnable runnable) {
        this.e.execute(runnable);
    }

    public Executor d() {
        return this.e;
    }

    public void e(Runnable runnable) {
        this.a.post(runnable);
    }
}
