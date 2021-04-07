package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.d;

public abstract class f1 extends e1 implements o0 {
    private boolean e;

    private final ScheduledFuture<?> Y(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            Executor U = U();
            if (!(U instanceof ScheduledExecutorService)) {
                U = null;
            }
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) U;
            if (scheduledExecutorService != null) {
                return scheduledExecutorService.schedule(runnable, j, timeUnit);
            }
            return null;
        } catch (RejectedExecutionException unused) {
            return null;
        }
    }

    public void N(n42 n42, Runnable runnable) {
        Runnable runnable2;
        v62.f(n42, "context");
        v62.f(runnable, "block");
        try {
            Executor U = U();
            l2 a = m2.a();
            if (a == null || (runnable2 = a.a(runnable)) == null) {
                runnable2 = runnable;
            }
            U.execute(runnable2);
        } catch (RejectedExecutionException unused) {
            l2 a2 = m2.a();
            if (a2 != null) {
                a2.d();
            }
            m0.k.v0(runnable);
        }
    }

    public final void V() {
        this.e = d.b(U());
    }

    public void close() {
        Executor U = U();
        if (!(U instanceof ExecutorService)) {
            U = null;
        }
        ExecutorService executorService = (ExecutorService) U;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof f1) && ((f1) obj).U() == U();
    }

    public int hashCode() {
        return System.identityHashCode(U());
    }

    public void k(long j, i<? super u22> iVar) {
        v62.f(iVar, "continuation");
        ScheduledFuture<?> Y = this.e ? Y(new f2(this, iVar), j, TimeUnit.MILLISECONDS) : null;
        if (Y != null) {
            s1.g(iVar, Y);
        } else {
            m0.k.k(j, iVar);
        }
    }

    public String toString() {
        return U().toString();
    }
}
