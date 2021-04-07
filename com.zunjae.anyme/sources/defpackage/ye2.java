package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ye2  reason: default package */
public final class ye2 {
    private static ExecutorService a;
    public static final ye2 b = new ye2();

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors() * 2);
        v62.b(newScheduledThreadPool, "Executors.newScheduledTh…().availableProcessors())");
        a = newScheduledThreadPool;
    }

    private ye2() {
    }

    public final <T> Future<T> a(o52<? extends T> o52) {
        v62.f(o52, "task");
        Future<T> submit = a.submit(new xe2(o52));
        v62.b(submit, "executor.submit(task)");
        return submit;
    }
}
