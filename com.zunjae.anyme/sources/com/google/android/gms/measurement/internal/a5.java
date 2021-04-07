package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.r;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

public final class a5 extends d6 {
    /* access modifiers changed from: private */
    public static final AtomicLong l = new AtomicLong(Long.MIN_VALUE);
    /* access modifiers changed from: private */
    public d5 c;
    /* access modifiers changed from: private */
    public d5 d;
    private final PriorityBlockingQueue<e5<?>> e = new PriorityBlockingQueue<>();
    private final BlockingQueue<e5<?>> f = new LinkedBlockingQueue();
    private final Thread.UncaughtExceptionHandler g = new c5(this, "Thread death: Uncaught exception on worker thread");
    private final Thread.UncaughtExceptionHandler h = new c5(this, "Thread death: Uncaught exception on network thread");
    /* access modifiers changed from: private */
    public final Object i = new Object();
    /* access modifiers changed from: private */
    public final Semaphore j = new Semaphore(2);
    /* access modifiers changed from: private */
    public volatile boolean k;

    a5(h5 h5Var) {
        super(h5Var);
    }

    private final void x(e5<?> e5Var) {
        synchronized (this.i) {
            this.e.add(e5Var);
            if (this.c == null) {
                d5 d5Var = new d5(this, "Measurement Worker", this.e);
                this.c = d5Var;
                d5Var.setUncaughtExceptionHandler(this.g);
                this.c.start();
            } else {
                this.c.a();
            }
        }
    }

    public final <V> Future<V> A(Callable<V> callable) {
        m();
        r.j(callable);
        e5 e5Var = new e5(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.c) {
            e5Var.run();
        } else {
            x(e5Var);
        }
        return e5Var;
    }

    public final void B(Runnable runnable) {
        m();
        r.j(runnable);
        x(new e5(this, runnable, true, "Task exception on worker thread"));
    }

    public final void E(Runnable runnable) {
        m();
        r.j(runnable);
        e5 e5Var = new e5(this, runnable, false, "Task exception on network thread");
        synchronized (this.i) {
            this.f.add(e5Var);
            if (this.d == null) {
                d5 d5Var = new d5(this, "Measurement Network", this.f);
                this.d = d5Var;
                d5Var.setUncaughtExceptionHandler(this.h);
                this.d.start();
            } else {
                this.d.a();
            }
        }
    }

    public final boolean H() {
        return Thread.currentThread() == this.c;
    }

    public final void a() {
        if (Thread.currentThread() != this.d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final void b() {
        if (Thread.currentThread() != this.c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* access modifiers changed from: protected */
    public final boolean r() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:15|16|(1:18)(1:19)|20|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r5.length() == 0) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        r4 = "Timed out waiting for ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        r4 = new java.lang.String("Timed out waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        r3.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = h().H();
        r5 = java.lang.String.valueOf(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        if (r5.length() != 0) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        r4 = "Interrupted waiting for ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        r4 = new java.lang.String("Interrupted waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        r3.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000c, code lost:
        r2 = r2.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        if (r2 != null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = h().H();
        r5 = java.lang.String.valueOf(r5);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0035 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T u(java.util.concurrent.atomic.AtomicReference<T> r2, long r3, java.lang.String r5, java.lang.Runnable r6) {
        /*
            r1 = this;
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.a5 r0 = r1.f()     // Catch:{ all -> 0x005a }
            r0.y(r6)     // Catch:{ all -> 0x005a }
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x0035 }
            monitor-exit(r2)     // Catch:{ all -> 0x005a }
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.c4 r3 = r1.h()
            com.google.android.gms.measurement.internal.e4 r3 = r3.H()
            java.lang.String r4 = "Timed out waiting for "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r5.length()
            if (r6 == 0) goto L_0x002b
            java.lang.String r4 = r4.concat(r5)
            goto L_0x0031
        L_0x002b:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r4)
            r4 = r5
        L_0x0031:
            r3.a(r4)
        L_0x0034:
            return r2
        L_0x0035:
            com.google.android.gms.measurement.internal.c4 r3 = r1.h()     // Catch:{ all -> 0x005a }
            com.google.android.gms.measurement.internal.e4 r3 = r3.H()     // Catch:{ all -> 0x005a }
            java.lang.String r4 = "Interrupted waiting for "
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x005a }
            int r6 = r5.length()     // Catch:{ all -> 0x005a }
            if (r6 == 0) goto L_0x004e
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x005a }
            goto L_0x0054
        L_0x004e:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x005a }
            r5.<init>(r4)     // Catch:{ all -> 0x005a }
            r4 = r5
        L_0x0054:
            r3.a(r4)     // Catch:{ all -> 0x005a }
            r3 = 0
            monitor-exit(r2)     // Catch:{ all -> 0x005a }
            return r3
        L_0x005a:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x005a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.a5.u(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    public final <V> Future<V> v(Callable<V> callable) {
        m();
        r.j(callable);
        e5 e5Var = new e5(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.c) {
            if (!this.e.isEmpty()) {
                h().H().a("Callable skipped the worker queue.");
            }
            e5Var.run();
        } else {
            x(e5Var);
        }
        return e5Var;
    }

    public final void y(Runnable runnable) {
        m();
        r.j(runnable);
        x(new e5(this, runnable, false, "Task exception on worker thread"));
    }
}
