package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.e1;

/* renamed from: q92  reason: default package */
final class q92 extends e1 implements u92, Executor {
    private static final AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(q92.class, "inFlightTasks");
    private final ConcurrentLinkedQueue<Runnable> e = new ConcurrentLinkedQueue<>();
    private final o92 f;
    private final int g;
    private final w92 h;
    private volatile int inFlightTasks = 0;

    public q92(o92 o92, int i2, w92 w92) {
        v62.f(o92, "dispatcher");
        v62.f(w92, "taskMode");
        this.f = o92;
        this.g = i2;
        this.h = w92;
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0010  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void V(java.lang.Runnable r3, boolean r4) {
        /*
            r2 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = i
            int r0 = r0.incrementAndGet(r2)
            int r1 = r2.g
            if (r0 > r1) goto L_0x0010
            o92 r0 = r2.f
            r0.Z(r3, r2, r4)
            return
        L_0x0010:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r0 = r2.e
            r0.add(r3)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = i
            int r3 = r3.decrementAndGet(r2)
            int r0 = r2.g
            if (r3 < r0) goto L_0x0020
            return
        L_0x0020:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r3 = r2.e
            java.lang.Object r3 = r3.poll()
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            if (r3 == 0) goto L_0x002b
            goto L_0x0000
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q92.V(java.lang.Runnable, boolean):void");
    }

    public w92 E() {
        return this.h;
    }

    public void N(n42 n42, Runnable runnable) {
        v62.f(n42, "context");
        v62.f(runnable, "block");
        V(runnable, false);
    }

    public Executor U() {
        return this;
    }

    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    public void execute(Runnable runnable) {
        v62.f(runnable, "command");
        V(runnable, false);
    }

    public void t() {
        Runnable poll = this.e.poll();
        if (poll != null) {
            this.f.Z(poll, this, true);
            return;
        }
        i.decrementAndGet(this);
        Runnable poll2 = this.e.poll();
        if (poll2 != null) {
            V(poll2, true);
        }
    }

    public String toString() {
        return super.toString() + "[dispatcher = " + this.f + ']';
    }
}
