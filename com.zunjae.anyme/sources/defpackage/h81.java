package defpackage;

import com.google.android.gms.common.internal.r;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: h81  reason: default package */
public final class h81 {

    /* renamed from: h81$a */
    private static final class a implements c {
        private final CountDownLatch a;

        private a() {
            this.a = new CountDownLatch(1);
        }

        /* synthetic */ a(e91 e91) {
            this();
        }

        public final void a(Object obj) {
            this.a.countDown();
        }

        public final void b() {
            this.a.await();
        }

        public final void c() {
            this.a.countDown();
        }

        public final void d(Exception exc) {
            this.a.countDown();
        }

        public final boolean e(long j, TimeUnit timeUnit) {
            return this.a.await(j, timeUnit);
        }
    }

    /* renamed from: h81$b */
    private static final class b implements c {
        private final Object a = new Object();
        private final int b;
        private final a91<Void> c;
        @GuardedBy("mLock")
        private int d;
        @GuardedBy("mLock")
        private int e;
        @GuardedBy("mLock")
        private int f;
        @GuardedBy("mLock")
        private Exception g;
        @GuardedBy("mLock")
        private boolean h;

        public b(int i, a91<Void> a91) {
            this.b = i;
            this.c = a91;
        }

        @GuardedBy("mLock")
        private final void b() {
            if (this.d + this.e + this.f != this.b) {
                return;
            }
            if (this.g != null) {
                a91<Void> a91 = this.c;
                int i = this.e;
                int i2 = this.b;
                StringBuilder sb = new StringBuilder(54);
                sb.append(i);
                sb.append(" out of ");
                sb.append(i2);
                sb.append(" underlying tasks failed");
                a91.t(new ExecutionException(sb.toString(), this.g));
            } else if (this.h) {
                this.c.v();
            } else {
                this.c.u(null);
            }
        }

        public final void a(Object obj) {
            synchronized (this.a) {
                this.d++;
                b();
            }
        }

        public final void c() {
            synchronized (this.a) {
                this.f++;
                this.h = true;
                b();
            }
        }

        public final void d(Exception exc) {
            synchronized (this.a) {
                this.e++;
                this.g = exc;
                b();
            }
        }
    }

    /* renamed from: h81$c */
    interface c extends y71, a81, b81<Object> {
    }

    public static <TResult> TResult a(e81<TResult> e81) {
        r.h();
        r.k(e81, "Task must not be null");
        if (e81.p()) {
            return j(e81);
        }
        a aVar = new a((e91) null);
        k(e81, aVar);
        aVar.b();
        return j(e81);
    }

    public static <TResult> TResult b(e81<TResult> e81, long j, TimeUnit timeUnit) {
        r.h();
        r.k(e81, "Task must not be null");
        r.k(timeUnit, "TimeUnit must not be null");
        if (e81.p()) {
            return j(e81);
        }
        a aVar = new a((e91) null);
        k(e81, aVar);
        if (aVar.e(j, timeUnit)) {
            return j(e81);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static <TResult> e81<TResult> c(Executor executor, Callable<TResult> callable) {
        r.k(executor, "Executor must not be null");
        r.k(callable, "Callback must not be null");
        a91 a91 = new a91();
        executor.execute(new e91(a91, callable));
        return a91;
    }

    public static <TResult> e81<TResult> d(Exception exc) {
        a91 a91 = new a91();
        a91.t(exc);
        return a91;
    }

    public static <TResult> e81<TResult> e(TResult tresult) {
        a91 a91 = new a91();
        a91.u(tresult);
        return a91;
    }

    public static e81<Void> f(Collection<? extends e81<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return e((Object) null);
        }
        for (e81 e81 : collection) {
            if (e81 == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        a91 a91 = new a91();
        b bVar = new b(collection.size(), a91);
        for (e81 k : collection) {
            k(k, bVar);
        }
        return a91;
    }

    public static e81<Void> g(e81<?>... e81Arr) {
        return (e81Arr == null || e81Arr.length == 0) ? e((Object) null) : f(Arrays.asList(e81Arr));
    }

    public static e81<List<e81<?>>> h(Collection<? extends e81<?>> collection) {
        return (collection == null || collection.isEmpty()) ? e(Collections.emptyList()) : f(collection).j(new i81(collection));
    }

    public static e81<List<e81<?>>> i(e81<?>... e81Arr) {
        return (e81Arr == null || e81Arr.length == 0) ? e(Collections.emptyList()) : h(Arrays.asList(e81Arr));
    }

    private static <TResult> TResult j(e81<TResult> e81) {
        if (e81.q()) {
            return e81.m();
        }
        if (e81.o()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(e81.l());
    }

    private static void k(e81<?> e81, c cVar) {
        e81.g(g81.b, cVar);
        e81.e(g81.b, cVar);
        e81.a(g81.b, cVar);
    }
}
