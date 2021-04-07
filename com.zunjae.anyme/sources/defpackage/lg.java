package defpackage;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: lg  reason: default package */
public final class lg implements ExecutorService {
    private static final long f = TimeUnit.SECONDS.toMillis(10);
    private static volatile int g;
    private final ExecutorService e;

    /* renamed from: lg$a */
    public static final class a {
        private final boolean a;
        private int b;
        private int c;
        private c d = c.b;
        private String e;
        private long f;

        a(boolean z) {
            this.a = z;
        }

        public lg a() {
            if (!TextUtils.isEmpty(this.e)) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.b, this.c, this.f, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new b(this.e, this.d, this.a));
                if (this.f != 0) {
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                return new lg(threadPoolExecutor);
            }
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.e);
        }

        public a b(String str) {
            this.e = str;
            return this;
        }

        public a c(int i) {
            this.b = i;
            this.c = i;
            return this;
        }
    }

    /* renamed from: lg$b */
    private static final class b implements ThreadFactory {
        private final String a;
        final c b;
        final boolean c;
        private int d;

        /* renamed from: lg$b$a */
        class a extends Thread {
            a(Runnable runnable, String str) {
                super(runnable, str);
            }

            public void run() {
                Process.setThreadPriority(9);
                if (b.this.c) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    b.this.b.a(th);
                }
            }
        }

        b(String str, c cVar, boolean z) {
            this.a = str;
            this.b = cVar;
            this.c = z;
        }

        public synchronized Thread newThread(Runnable runnable) {
            a aVar;
            aVar = new a(runnable, "glide-" + this.a + "-thread-" + this.d);
            this.d = this.d + 1;
            return aVar;
        }
    }

    /* renamed from: lg$c */
    public interface c {
        public static final c a = new a();
        public static final c b = a;

        /* renamed from: lg$c$a */
        class a implements c {
            a() {
            }

            public void a(Throwable th) {
                if (th != null) {
                    boolean isLoggable = Log.isLoggable("GlideExecutor", 6);
                }
            }
        }

        void a(Throwable th);
    }

    lg(ExecutorService executorService) {
        this.e = executorService;
    }

    public static int a() {
        if (g == 0) {
            g = Math.min(4, mg.a());
        }
        return g;
    }

    public static a b() {
        int i = a() >= 4 ? 2 : 1;
        a aVar = new a(true);
        aVar.c(i);
        aVar.b("animation");
        return aVar;
    }

    public static lg c() {
        return b().a();
    }

    public static a d() {
        a aVar = new a(true);
        aVar.c(1);
        aVar.b("disk-cache");
        return aVar;
    }

    public static lg e() {
        return d().a();
    }

    public static a f() {
        a aVar = new a(false);
        aVar.c(a());
        aVar.b("source");
        return aVar;
    }

    public static lg g() {
        return f().a();
    }

    public static lg h() {
        return new lg(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f, TimeUnit.MILLISECONDS, new SynchronousQueue(), new b("source-unlimited", c.b, false)));
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.e.awaitTermination(j, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.e.execute(runnable);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.e.invokeAll(collection);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return this.e.invokeAll(collection, j, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return this.e.invokeAny(collection);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return this.e.invokeAny(collection, j, timeUnit);
    }

    public boolean isShutdown() {
        return this.e.isShutdown();
    }

    public boolean isTerminated() {
        return this.e.isTerminated();
    }

    public void shutdown() {
        this.e.shutdown();
    }

    public List<Runnable> shutdownNow() {
        return this.e.shutdownNow();
    }

    public Future<?> submit(Runnable runnable) {
        return this.e.submit(runnable);
    }

    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.e.submit(runnable, t);
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return this.e.submit(callable);
    }

    public String toString() {
        return this.e.toString();
    }
}
