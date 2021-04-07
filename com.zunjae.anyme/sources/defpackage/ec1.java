package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: ec1  reason: default package */
class ec1 {
    private final ExecutorService a;
    private e81<Void> b = h81.e(null);
    private final Object c = new Object();
    /* access modifiers changed from: private */
    public ThreadLocal<Boolean> d = new ThreadLocal<>();

    /* renamed from: ec1$a */
    class a implements Runnable {
        a() {
        }

        public void run() {
            ec1.this.d.set(Boolean.TRUE);
        }
    }

    /* renamed from: ec1$b */
    class b implements Callable<Void> {
        final /* synthetic */ Runnable a;

        b(ec1 ec1, Runnable runnable) {
            this.a = runnable;
        }

        /* renamed from: a */
        public Void call() {
            this.a.run();
            return null;
        }
    }

    /* renamed from: ec1$c */
    class c implements x71<Void, T> {
        final /* synthetic */ Callable a;

        c(ec1 ec1, Callable callable) {
            this.a = callable;
        }

        public T a(e81<Void> e81) {
            return this.a.call();
        }
    }

    /* renamed from: ec1$d */
    class d implements x71<T, Void> {
        d(ec1 ec1) {
        }

        /* renamed from: b */
        public Void a(e81<T> e81) {
            return null;
        }
    }

    public ec1(ExecutorService executorService) {
        this.a = executorService;
        executorService.submit(new a());
    }

    private <T> e81<Void> d(e81<T> e81) {
        return e81.i(this.a, new d(this));
    }

    private boolean e() {
        return Boolean.TRUE.equals(this.d.get());
    }

    private <T> x71<Void, T> f(Callable<T> callable) {
        return new c(this, callable);
    }

    public void b() {
        if (!e()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public Executor c() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public e81<Void> g(Runnable runnable) {
        return h(new b(this, runnable));
    }

    public <T> e81<T> h(Callable<T> callable) {
        e81<TContinuationResult> i;
        synchronized (this.c) {
            i = this.b.i(this.a, f(callable));
            this.b = d(i);
        }
        return i;
    }

    public <T> e81<T> i(Callable<e81<T>> callable) {
        e81<TContinuationResult> k;
        synchronized (this.c) {
            k = this.b.k(this.a, f(callable));
            this.b = d(k);
        }
        return k;
    }
}
