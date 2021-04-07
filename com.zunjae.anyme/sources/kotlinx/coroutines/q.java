package kotlinx.coroutines;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class q extends e1 {
    private static final int e;
    private static boolean f;
    public static final q g = new q();
    private static volatile Executor pool;

    static final class a implements ThreadFactory {
        final /* synthetic */ AtomicInteger a;

        a(AtomicInteger atomicInteger) {
            this.a = atomicInteger;
        }

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "CommonPool-worker-" + this.a.incrementAndGet());
            thread.setDaemon(true);
            return thread;
        }
    }

    static final class b implements Runnable {
        public static final b e = new b();

        b() {
        }

        public final void run() {
        }
    }

    static {
        String str;
        int i;
        try {
            str = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable unused) {
            str = null;
        }
        if (str != null) {
            Integer g2 = e92.g(str);
            if (g2 == null || g2.intValue() < 1) {
                throw new IllegalStateException(("Expected positive number in kotlinx.coroutines.default.parallelism, but has " + str).toString());
            }
            i = g2.intValue();
        } else {
            i = -1;
        }
        e = i;
    }

    private q() {
    }

    private final ExecutorService V() {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(c0(), new a(new AtomicInteger()));
        v62.b(newFixedThreadPool, "Executors.newFixedThread…Daemon = true }\n        }");
        return newFixedThreadPool;
    }

    private final ExecutorService Y() {
        Class<?> cls;
        ExecutorService executorService;
        if (System.getSecurityManager() != null) {
            return V();
        }
        ExecutorService executorService2 = null;
        try {
            cls = Class.forName("java.util.concurrent.ForkJoinPool");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return V();
        }
        if (!f && e < 0) {
            try {
                Method method = cls.getMethod("commonPool", new Class[0]);
                Object invoke = method != null ? method.invoke((Object) null, new Object[0]) : null;
                if (!(invoke instanceof ExecutorService)) {
                    invoke = null;
                }
                executorService = (ExecutorService) invoke;
            } catch (Throwable unused2) {
                executorService = null;
            }
            if (executorService != null) {
                if (!g.d0(cls, executorService)) {
                    executorService = null;
                }
                if (executorService != null) {
                    return executorService;
                }
            }
        }
        try {
            Object newInstance = cls.getConstructor(new Class[]{Integer.TYPE}).newInstance(new Object[]{Integer.valueOf(g.c0())});
            if (!(newInstance instanceof ExecutorService)) {
                newInstance = null;
            }
            executorService2 = (ExecutorService) newInstance;
        } catch (Throwable unused3) {
        }
        return executorService2 != null ? executorService2 : V();
    }

    private final synchronized Executor Z() {
        Executor executor;
        executor = pool;
        if (executor == null) {
            executor = Y();
            pool = executor;
        }
        return executor;
    }

    private final int c0() {
        Integer valueOf = Integer.valueOf(e);
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.intValue() : w72.b(Runtime.getRuntime().availableProcessors() - 1, 1);
    }

    public void N(n42 n42, Runnable runnable) {
        Runnable runnable2;
        v62.f(n42, "context");
        v62.f(runnable, "block");
        try {
            Executor executor = pool;
            if (executor == null) {
                executor = Z();
            }
            l2 a2 = m2.a();
            if (a2 == null || (runnable2 = a2.a(runnable)) == null) {
                runnable2 = runnable;
            }
            executor.execute(runnable2);
        } catch (RejectedExecutionException unused) {
            l2 a3 = m2.a();
            if (a3 != null) {
                a3.d();
            }
            m0.k.v0(runnable);
        }
    }

    public Executor U() {
        Executor executor = pool;
        return executor != null ? executor : Z();
    }

    public void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    public final boolean d0(Class<?> cls, ExecutorService executorService) {
        v62.f(cls, "fjpClass");
        v62.f(executorService, "executor");
        executorService.submit(b.e);
        Integer num = null;
        try {
            Object invoke = cls.getMethod("getPoolSize", new Class[0]).invoke(executorService, new Object[0]);
            if (!(invoke instanceof Integer)) {
                invoke = null;
            }
            num = (Integer) invoke;
        } catch (Throwable unused) {
        }
        return num != null && num.intValue() >= 1;
    }

    public String toString() {
        return "CommonPool";
    }
}
