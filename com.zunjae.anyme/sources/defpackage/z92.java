package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: z92  reason: default package */
public final class z92 {
    private static final AtomicReferenceFieldUpdater b;
    static final AtomicIntegerFieldUpdater c;
    static final AtomicIntegerFieldUpdater d;
    /* access modifiers changed from: private */
    public final AtomicReferenceArray<t92> a = new AtomicReferenceArray<>(128);
    volatile int consumerIndex = 0;
    private volatile Object lastScheduledTask = null;
    volatile int producerIndex = 0;

    static {
        Class<z92> cls = z92.class;
        b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
    }

    private final void d(p92 p92, t92 t92) {
        if (!p92.a(t92)) {
            throw new IllegalStateException("GlobalQueue could not be closed yet".toString());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: t92} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void g(defpackage.p92 r8) {
        /*
            r7 = this;
            int r0 = r7.e()
            int r0 = r0 / 2
            r1 = 1
            int r0 = defpackage.w72.b(r0, r1)
            r1 = 0
        L_0x000c:
            if (r1 >= r0) goto L_0x0043
        L_0x000e:
            int r2 = r7.consumerIndex
            int r3 = r7.producerIndex
            int r3 = r2 - r3
            r4 = 0
            if (r3 != 0) goto L_0x0018
            goto L_0x003b
        L_0x0018:
            r3 = r2 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r7.a
            java.lang.Object r5 = r5.get(r3)
            t92 r5 = (defpackage.t92) r5
            if (r5 == 0) goto L_0x000e
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = d
            int r6 = r2 + 1
            boolean r2 = r5.compareAndSet(r7, r2, r6)
            if (r2 == 0) goto L_0x000e
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r7.a
            java.lang.Object r2 = r2.getAndSet(r3, r4)
            r4 = r2
            t92 r4 = (defpackage.t92) r4
        L_0x003b:
            if (r4 == 0) goto L_0x0043
            r7.d(r8, r4)
            int r1 = r1 + 1
            goto L_0x000c
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z92.g(p92):void");
    }

    private final boolean j(t92 t92) {
        if (e() == 127) {
            return false;
        }
        int i = this.producerIndex & 127;
        if (this.a.get(i) != null) {
            return false;
        }
        this.a.lazySet(i, t92);
        c.incrementAndGet(this);
        return true;
    }

    private final boolean l(long j, z92 z92, p92 p92) {
        t92 t92 = (t92) z92.lastScheduledTask;
        if (t92 == null || j - t92.e < x92.a || !b.compareAndSet(z92, t92, (Object) null)) {
            return false;
        }
        b(t92, p92);
        return true;
    }

    public final boolean b(t92 t92, p92 p92) {
        v62.f(t92, "task");
        v62.f(p92, "globalQueue");
        t92 t922 = (t92) b.getAndSet(this, t92);
        if (t922 != null) {
            return c(t922, p92);
        }
        return true;
    }

    public final boolean c(t92 t92, p92 p92) {
        v62.f(t92, "task");
        v62.f(p92, "globalQueue");
        boolean z = true;
        while (!j(t92)) {
            g(p92);
            z = false;
        }
        return z;
    }

    public final int e() {
        return this.producerIndex - this.consumerIndex;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        r0 = (defpackage.t92) a(r5).getAndSet(r2, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
        if (r0 == null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1:0x000e, code lost:
        if (r0 != null) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        d(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        r0 = r5.consumerIndex;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        if ((r0 - r5.producerIndex) != 0) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        r2 = r0 & 127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        if (((defpackage.t92) a(r5).get(r2)) == null) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        if (d.compareAndSet(r5, r0, r0 + 1) == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(defpackage.p92 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "globalQueue"
            defpackage.v62.f(r6, r0)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = b
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r5, r1)
            t92 r0 = (defpackage.t92) r0
            if (r0 == 0) goto L_0x0013
        L_0x0010:
            r5.d(r6, r0)
        L_0x0013:
            int r0 = r5.consumerIndex
            int r2 = r5.producerIndex
            int r2 = r0 - r2
            if (r2 != 0) goto L_0x001d
            r0 = r1
            goto L_0x003f
        L_0x001d:
            r2 = r0 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r5.a
            java.lang.Object r3 = r3.get(r2)
            t92 r3 = (defpackage.t92) r3
            if (r3 == 0) goto L_0x0013
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = d
            int r4 = r0 + 1
            boolean r0 = r3.compareAndSet(r5, r0, r4)
            if (r0 == 0) goto L_0x0013
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r5.a
            java.lang.Object r0 = r0.getAndSet(r2, r1)
            t92 r0 = (defpackage.t92) r0
        L_0x003f:
            if (r0 == 0) goto L_0x0042
            goto L_0x0010
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z92.f(p92):void");
    }

    public final t92 h() {
        t92 t92 = (t92) b.getAndSet(this, (Object) null);
        if (t92 != null) {
            return t92;
        }
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (((t92) this.a.get(i2)) != null && d.compareAndSet(this, i, i + 1)) {
                return (t92) this.a.getAndSet(i2, (Object) null);
            }
        }
    }

    public final int i() {
        return this.lastScheduledTask != null ? e() + 1 : e();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: t92} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(defpackage.z92 r19, defpackage.p92 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.String r3 = "victim"
            defpackage.v62.f(r1, r3)
            java.lang.String r3 = "globalQueue"
            defpackage.v62.f(r2, r3)
            y92 r3 = defpackage.x92.f
            long r3 = r3.a()
            int r5 = r19.e()
            if (r5 != 0) goto L_0x0021
            boolean r1 = r0.l(r3, r1, r2)
            return r1
        L_0x0021:
            int r5 = r5 / 2
            r6 = 1
            int r5 = defpackage.w72.b(r5, r6)
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x002b:
            if (r8 >= r5) goto L_0x007c
        L_0x002d:
            int r10 = r1.consumerIndex
            int r11 = r1.producerIndex
            int r11 = r10 - r11
            r12 = 0
            if (r11 != 0) goto L_0x0037
            goto L_0x0073
        L_0x0037:
            r11 = r10 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicReferenceArray r13 = r19.a
            java.lang.Object r13 = r13.get(r11)
            t92 r13 = (defpackage.t92) r13
            if (r13 == 0) goto L_0x002d
            long r13 = r13.e
            long r13 = r3 - r13
            long r15 = defpackage.x92.a
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 >= 0) goto L_0x005a
            int r13 = r19.e()
            int r14 = defpackage.x92.b
            if (r13 <= r14) goto L_0x0058
            goto L_0x005a
        L_0x0058:
            r13 = 0
            goto L_0x005b
        L_0x005a:
            r13 = 1
        L_0x005b:
            if (r13 != 0) goto L_0x005e
            goto L_0x0073
        L_0x005e:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r13 = d
            int r14 = r10 + 1
            boolean r10 = r13.compareAndSet(r1, r10, r14)
            if (r10 == 0) goto L_0x002d
            java.util.concurrent.atomic.AtomicReferenceArray r10 = r19.a
            java.lang.Object r10 = r10.getAndSet(r11, r12)
            r12 = r10
            t92 r12 = (defpackage.t92) r12
        L_0x0073:
            if (r12 == 0) goto L_0x007c
            r0.b(r12, r2)
            int r8 = r8 + 1
            r9 = 1
            goto L_0x002b
        L_0x007c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z92.k(z92, p92):boolean");
    }
}
