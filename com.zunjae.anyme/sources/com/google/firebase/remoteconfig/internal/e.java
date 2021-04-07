package com.google.firebase.remoteconfig.internal;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class e {
    private static final Map<String, e> d = new HashMap();
    private static final Executor e = d.a();
    private final ExecutorService a;
    private final n b;
    private e81<f> c = null;

    private static class b<TResult> implements b81<TResult>, a81, y71 {
        private final CountDownLatch a;

        private b() {
            this.a = new CountDownLatch(1);
        }

        public void a(TResult tresult) {
            this.a.countDown();
        }

        public boolean b(long j, TimeUnit timeUnit) {
            return this.a.await(j, timeUnit);
        }

        public void c() {
            this.a.countDown();
        }

        public void d(Exception exc) {
            this.a.countDown();
        }
    }

    private e(ExecutorService executorService, n nVar) {
        this.a = executorService;
        this.b = nVar;
    }

    private static <TResult> TResult a(e81<TResult> e81, long j, TimeUnit timeUnit) {
        b bVar = new b();
        e81.g(e, bVar);
        e81.e(e, bVar);
        e81.a(e, bVar);
        if (!bVar.b(j, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        } else if (e81.q()) {
            return e81.m();
        } else {
            throw new ExecutionException(e81.l());
        }
    }

    public static synchronized e f(ExecutorService executorService, n nVar) {
        e eVar;
        synchronized (e.class) {
            String b2 = nVar.b();
            if (!d.containsKey(b2)) {
                d.put(b2, new e(executorService, nVar));
            }
            eVar = d.get(b2);
        }
        return eVar;
    }

    static /* synthetic */ e81 h(e eVar, boolean z, f fVar, Void voidR) {
        if (z) {
            eVar.k(fVar);
        }
        return h81.e(fVar);
    }

    private synchronized void k(f fVar) {
        this.c = h81.e(fVar);
    }

    public void b() {
        synchronized (this) {
            this.c = h81.e(null);
        }
        this.b.a();
    }

    public synchronized e81<f> c() {
        if (this.c == null || (this.c.p() && !this.c.q())) {
            ExecutorService executorService = this.a;
            n nVar = this.b;
            nVar.getClass();
            this.c = h81.c(executorService, c.a(nVar));
        }
        return this.c;
    }

    public f d() {
        return e(5);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        return (com.google.firebase.remoteconfig.internal.f) a(c(), r3, java.util.concurrent.TimeUnit.SECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.remoteconfig.internal.f e(long r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            e81<com.google.firebase.remoteconfig.internal.f> r0 = r2.c     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0017
            e81<com.google.firebase.remoteconfig.internal.f> r0 = r2.c     // Catch:{ all -> 0x0027 }
            boolean r0 = r0.q()     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0017
            e81<com.google.firebase.remoteconfig.internal.f> r3 = r2.c     // Catch:{ all -> 0x0027 }
            java.lang.Object r3 = r3.m()     // Catch:{ all -> 0x0027 }
            com.google.firebase.remoteconfig.internal.f r3 = (com.google.firebase.remoteconfig.internal.f) r3     // Catch:{ all -> 0x0027 }
            monitor-exit(r2)     // Catch:{ all -> 0x0027 }
            return r3
        L_0x0017:
            monitor-exit(r2)     // Catch:{ all -> 0x0027 }
            e81 r0 = r2.c()     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0025 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0025 }
            java.lang.Object r3 = a(r0, r3, r1)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0025 }
            com.google.firebase.remoteconfig.internal.f r3 = (com.google.firebase.remoteconfig.internal.f) r3     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0025 }
            return r3
        L_0x0025:
            r3 = 0
            return r3
        L_0x0027:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0027 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.e.e(long):com.google.firebase.remoteconfig.internal.f");
    }

    public e81<f> i(f fVar) {
        return j(fVar, true);
    }

    public e81<f> j(f fVar, boolean z) {
        return h81.c(this.a, a.a(this, fVar)).s(this.a, b.b(this, z, fVar));
    }
}
