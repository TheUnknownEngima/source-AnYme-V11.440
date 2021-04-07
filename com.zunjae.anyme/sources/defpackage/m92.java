package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.internal.u;
import kotlinx.coroutines.k0;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.m2;

/* renamed from: m92  reason: default package */
public final class m92 implements Executor, Closeable {
    private static final AtomicLongFieldUpdater m = AtomicLongFieldUpdater.newUpdater(m92.class, "parkedWorkersStack");
    static final AtomicLongFieldUpdater n = AtomicLongFieldUpdater.newUpdater(m92.class, "controlState");
    private static final AtomicIntegerFieldUpdater o = AtomicIntegerFieldUpdater.newUpdater(m92.class, "_isTerminated");
    /* access modifiers changed from: private */
    public static final int p;
    /* access modifiers changed from: private */
    public static final int q;
    /* access modifiers changed from: private */
    public static final int r = ((int) TimeUnit.SECONDS.toNanos(1));
    /* access modifiers changed from: private */
    public static final int s = ((int) w72.f(w72.c(x92.a / ((long) 4), 10), (long) r));
    /* access modifiers changed from: private */
    public static final u t = new u("NOT_IN_STACK");
    private volatile int _isTerminated;
    volatile long controlState;
    /* access modifiers changed from: private */
    public final p92 e;
    /* access modifiers changed from: private */
    public final Semaphore f;
    /* access modifiers changed from: private */
    public final a[] g;
    /* access modifiers changed from: private */
    public final Random h;
    /* access modifiers changed from: private */
    public final int i;
    private final int j;
    /* access modifiers changed from: private */
    public final long k;
    /* access modifiers changed from: private */
    public final String l;
    private volatile long parkedWorkersStack;

    /* renamed from: m92$a */
    public final class a extends Thread {
        private static final AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(a.class, "terminationState");
        private final z92 e;
        private long f;
        private long g;
        private int h;
        private int i;
        private volatile int indexInArray;
        private int j;
        private volatile Object nextParkedWorker;
        private volatile int spins;
        private volatile b state;
        private volatile int terminationState;

        private a() {
            setDaemon(true);
            this.e = new z92();
            this.state = b.RETIRING;
            this.terminationState = 0;
            this.nextParkedWorker = m92.t;
            this.h = m92.s;
            this.i = m92.this.h.nextInt();
        }

        public a(m92 m92, int i2) {
            this();
            s(i2);
        }

        private final void a(w92 w92) {
            if (w92 != w92.NON_BLOCKING) {
                m92.n.addAndGet(m92.this, -2097152);
                b bVar = this.state;
                if (bVar != b.TERMINATED) {
                    if (k0.a()) {
                        if (!(bVar == b.BLOCKING)) {
                            throw new AssertionError();
                        }
                    }
                    this.state = b.RETIRING;
                }
            }
        }

        private final void b(w92 w92, long j2) {
            if (w92 != w92.NON_BLOCKING) {
                m92.n.addAndGet(m92.this, 2097152);
                if (w(b.BLOCKING)) {
                    m92.this.d0();
                }
            } else if (m92.this.f.availablePermits() != 0) {
                long a = x92.f.a();
                long j3 = x92.a;
                if (a - j2 >= j3 && a - this.g >= j3 * ((long) 5)) {
                    this.g = a;
                    m92.this.d0();
                }
            }
        }

        private final boolean c() {
            t92 e2 = m92.this.e.e(w92.PROBABLY_BLOCKING);
            if (e2 == null) {
                return true;
            }
            this.e.b(e2, m92.this.e);
            return false;
        }

        private final void d() {
            w(b.PARKING);
            if (c()) {
                this.terminationState = 0;
                if (this.f == 0) {
                    this.f = System.nanoTime() + m92.this.k;
                }
                if (f(m92.this.k) && System.nanoTime() - this.f >= 0) {
                    this.f = 0;
                    y();
                }
            }
        }

        private final void e() {
            int i2 = this.spins;
            if (i2 <= m92.q) {
                this.spins = i2 + 1;
                if (i2 >= m92.p) {
                    Thread.yield();
                    return;
                }
                return;
            }
            if (this.h < m92.r) {
                this.h = w72.e((this.h * 3) >>> 1, m92.r);
            }
            w(b.PARKING);
            f((long) this.h);
        }

        private final boolean f(long j2) {
            m92.this.Z(this);
            if (!c()) {
                return false;
            }
            LockSupport.parkNanos(j2);
            return true;
        }

        private final t92 h() {
            t92 t92;
            t92 e2;
            boolean z = r(m92.this.i * 2) == 0;
            if (z && (e2 = m92.this.e.e(w92.NON_BLOCKING)) != null) {
                return e2;
            }
            t92 h2 = this.e.h();
            return h2 != null ? h2 : (z || (t92 = (t92) m92.this.e.d()) == null) ? x() : t92;
        }

        private final void n(w92 w92) {
            this.f = 0;
            this.j = 0;
            if (this.state == b.PARKING) {
                if (k0.a()) {
                    if (!(w92 == w92.PROBABLY_BLOCKING)) {
                        throw new AssertionError();
                    }
                }
                this.state = b.BLOCKING;
                this.h = m92.s;
            }
            this.spins = 0;
        }

        private final t92 x() {
            int h2 = m92.this.U();
            if (h2 < 2) {
                return null;
            }
            int i2 = this.j;
            if (i2 == 0) {
                i2 = r(h2);
            }
            int i3 = 1;
            int i4 = i2 + 1;
            if (i4 <= h2) {
                i3 = i4;
            }
            this.j = i3;
            a aVar = m92.this.g[i3];
            if (aVar == null || aVar == this || !this.e.k(aVar.e, m92.this.e)) {
                return null;
            }
            return this.e.h();
        }

        private final void y() {
            synchronized (m92.this.g) {
                if (!m92.this.isTerminated()) {
                    if (m92.this.U() > m92.this.i) {
                        if (c()) {
                            if (l.compareAndSet(this, 0, 1)) {
                                int i2 = this.indexInArray;
                                s(0);
                                m92.this.c0(this, i2, 0);
                                int andDecrement = (int) (m92.n.getAndDecrement(m92.this) & 2097151);
                                if (andDecrement != i2) {
                                    a aVar = m92.this.g[andDecrement];
                                    if (aVar != null) {
                                        m92.this.g[i2] = aVar;
                                        aVar.s(i2);
                                        m92.this.c0(aVar, andDecrement, i2);
                                    } else {
                                        v62.l();
                                        throw null;
                                    }
                                }
                                m92.this.g[andDecrement] = null;
                                u22 u22 = u22.a;
                                this.state = b.TERMINATED;
                            }
                        }
                    }
                }
            }
        }

        public final t92 g() {
            if (u()) {
                return h();
            }
            t92 h2 = this.e.h();
            return h2 != null ? h2 : m92.this.e.e(w92.PROBABLY_BLOCKING);
        }

        public final int i() {
            return this.indexInArray;
        }

        public final z92 j() {
            return this.e;
        }

        public final Object k() {
            return this.nextParkedWorker;
        }

        public final m92 l() {
            return m92.this;
        }

        public final b m() {
            return this.state;
        }

        public final void o() {
            this.h = m92.s;
            this.spins = 0;
        }

        public final boolean p() {
            return this.state == b.BLOCKING;
        }

        public final boolean q() {
            return this.state == b.PARKING;
        }

        public final int r(int i2) {
            int i3 = this.i;
            int i4 = i3 ^ (i3 << 13);
            this.i = i4;
            int i5 = i4 ^ (i4 >> 17);
            this.i = i5;
            int i6 = i5 ^ (i5 << 5);
            this.i = i6;
            int i7 = i2 - 1;
            return (i7 & i2) == 0 ? i6 & i7 : (i6 & Integer.MAX_VALUE) % i2;
        }

        public void run() {
            boolean z = false;
            while (!m92.this.isTerminated() && this.state != b.TERMINATED) {
                t92 g2 = g();
                if (g2 == null) {
                    if (this.state == b.CPU_ACQUIRED) {
                        e();
                    } else {
                        d();
                    }
                    z = true;
                } else {
                    w92 a = g2.a();
                    if (z) {
                        n(a);
                        z = false;
                    }
                    b(a, g2.e);
                    m92.this.e0(g2);
                    a(a);
                }
            }
            w(b.TERMINATED);
        }

        public final void s(int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append(m92.this.l);
            sb.append("-worker-");
            sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
            setName(sb.toString());
            this.indexInArray = i2;
        }

        public final void t(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean u() {
            if (this.state == b.CPU_ACQUIRED) {
                return true;
            }
            if (!m92.this.f.tryAcquire()) {
                return false;
            }
            this.state = b.CPU_ACQUIRED;
            return true;
        }

        public final boolean v() {
            int i2 = this.terminationState;
            if (i2 == 1 || i2 == -1) {
                return false;
            }
            if (i2 == 0) {
                return l.compareAndSet(this, 0, -1);
            }
            throw new IllegalStateException(("Invalid terminationState = " + i2).toString());
        }

        public final boolean w(b bVar) {
            v62.f(bVar, "newState");
            b bVar2 = this.state;
            boolean z = bVar2 == b.CPU_ACQUIRED;
            if (z) {
                m92.this.f.release();
            }
            if (bVar2 != bVar) {
                this.state = bVar;
            }
            return z;
        }
    }

    /* renamed from: m92$b */
    public enum b {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        RETIRING,
        TERMINATED
    }

    static {
        int f2 = x.d("kotlinx.coroutines.scheduler.spins", 1000, 1, 0, 8, (Object) null);
        p = f2;
        q = f2 + x.d("kotlinx.coroutines.scheduler.yields", 0, 0, 0, 8, (Object) null);
    }

    public m92(int i2, int i3, long j2, String str) {
        v62.f(str, "schedulerName");
        this.i = i2;
        this.j = i3;
        this.k = j2;
        this.l = str;
        if (i2 >= 1) {
            if (this.j >= this.i) {
                if (this.j <= 2097150) {
                    if (this.k > 0) {
                        this.e = new p92();
                        this.f = new Semaphore(this.i, false);
                        this.parkedWorkersStack = 0;
                        this.g = new a[(this.j + 1)];
                        this.controlState = 0;
                        this.h = new Random();
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + this.k + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + this.j + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + this.j + " should be greater than or equals to core pool size " + this.i).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + this.i + " should be at least 1").toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007b, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000b, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int L() {
        /*
            r10 = this;
            m92$a[] r0 = r10.g
            monitor-enter(r0)
            boolean r1 = r10.isTerminated()     // Catch:{ all -> 0x007c }
            if (r1 == 0) goto L_0x000c
            r1 = -1
        L_0x000a:
            monitor-exit(r0)
            return r1
        L_0x000c:
            long r1 = r10.controlState     // Catch:{ all -> 0x007c }
            r3 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r1 & r3
            int r6 = (int) r5     // Catch:{ all -> 0x007c }
            r7 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r1 = r1 & r7
            r5 = 21
            long r1 = r1 >> r5
            int r2 = (int) r1     // Catch:{ all -> 0x007c }
            int r1 = r6 - r2
            int r2 = r10.i     // Catch:{ all -> 0x007c }
            r5 = 0
            if (r1 < r2) goto L_0x0027
            monitor-exit(r0)
            return r5
        L_0x0027:
            int r2 = r10.j     // Catch:{ all -> 0x007c }
            if (r6 >= r2) goto L_0x007a
            java.util.concurrent.Semaphore r2 = r10.f     // Catch:{ all -> 0x007c }
            int r2 = r2.availablePermits()     // Catch:{ all -> 0x007c }
            if (r2 != 0) goto L_0x0034
            goto L_0x007a
        L_0x0034:
            long r6 = r10.controlState     // Catch:{ all -> 0x007c }
            long r6 = r6 & r3
            int r2 = (int) r6     // Catch:{ all -> 0x007c }
            r6 = 1
            int r2 = r2 + r6
            if (r2 <= 0) goto L_0x0044
            m92$a[] r7 = r10.g     // Catch:{ all -> 0x007c }
            r7 = r7[r2]     // Catch:{ all -> 0x007c }
            if (r7 != 0) goto L_0x0044
            r7 = 1
            goto L_0x0045
        L_0x0044:
            r7 = 0
        L_0x0045:
            if (r7 == 0) goto L_0x006e
            m92$a r7 = new m92$a     // Catch:{ all -> 0x007c }
            r7.<init>(r10, r2)     // Catch:{ all -> 0x007c }
            r7.start()     // Catch:{ all -> 0x007c }
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = n     // Catch:{ all -> 0x007c }
            long r8 = r8.incrementAndGet(r10)     // Catch:{ all -> 0x007c }
            long r3 = r3 & r8
            int r4 = (int) r3     // Catch:{ all -> 0x007c }
            if (r2 != r4) goto L_0x005a
            r5 = 1
        L_0x005a:
            if (r5 == 0) goto L_0x0062
            m92$a[] r3 = r10.g     // Catch:{ all -> 0x007c }
            r3[r2] = r7     // Catch:{ all -> 0x007c }
            int r1 = r1 + r6
            goto L_0x000a
        L_0x0062:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007c }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x007c }
            r2.<init>(r1)     // Catch:{ all -> 0x007c }
            throw r2     // Catch:{ all -> 0x007c }
        L_0x006e:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007c }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x007c }
            r2.<init>(r1)     // Catch:{ all -> 0x007c }
            throw r2     // Catch:{ all -> 0x007c }
        L_0x007a:
            monitor-exit(r0)
            return r5
        L_0x007c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m92.L():int");
    }

    private final a N() {
        Thread currentThread = Thread.currentThread();
        if (!(currentThread instanceof a)) {
            currentThread = null;
        }
        a aVar = (a) currentThread;
        if (aVar == null || !v62.a(aVar.l(), this)) {
            return null;
        }
        return aVar;
    }

    public static /* synthetic */ void Q(m92 m92, Runnable runnable, u92 u92, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            u92 = s92.f;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        m92.P(runnable, u92, z);
    }

    /* access modifiers changed from: private */
    public final int U() {
        return (int) (this.controlState & 2097151);
    }

    private final int V(a aVar) {
        int i2;
        do {
            Object k2 = aVar.k();
            if (k2 == t) {
                return -1;
            }
            if (k2 == null) {
                return 0;
            }
            aVar = (a) k2;
            i2 = aVar.i();
        } while (i2 == 0);
        return i2;
    }

    private final a Y() {
        while (true) {
            long j2 = this.parkedWorkersStack;
            a aVar = this.g[(int) (2097151 & j2)];
            if (aVar == null) {
                return null;
            }
            long j3 = (2097152 + j2) & -2097152;
            int V = V(aVar);
            if (V >= 0) {
                if (m.compareAndSet(this, j2, ((long) V) | j3)) {
                    aVar.t(t);
                    return aVar;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final void Z(a aVar) {
        long j2;
        long j3;
        int i2;
        if (aVar.k() == t) {
            do {
                j2 = this.parkedWorkersStack;
                int i3 = (int) (2097151 & j2);
                j3 = (2097152 + j2) & -2097152;
                i2 = aVar.i();
                if (k0.a()) {
                    if (!(i2 != 0)) {
                        throw new AssertionError();
                    }
                }
                aVar.t(this.g[i3]);
            } while (!m.compareAndSet(this, j2, ((long) i2) | j3));
        }
    }

    /* access modifiers changed from: private */
    public final void c0(a aVar, int i2, int i3) {
        while (true) {
            long j2 = this.parkedWorkersStack;
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & -2097152;
            if (i4 == i2) {
                i4 = i3 == 0 ? V(aVar) : i3;
            }
            if (i4 >= 0) {
                if (m.compareAndSet(this, j2, j3 | ((long) i4))) {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final void d0() {
        if (this.f.availablePermits() == 0) {
            j0();
        } else if (!j0()) {
            long j2 = this.controlState;
            if (((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21)) < this.i) {
                int L = L();
                if (L == 1 && this.i > 1) {
                    L();
                }
                if (L > 0) {
                    return;
                }
            }
            j0();
        }
    }

    /* access modifiers changed from: private */
    public final void e0(t92 t92) {
        l2 a2;
        try {
            t92.run();
            a2 = m2.a();
            if (a2 == null) {
                return;
            }
        } catch (Throwable th) {
            l2 a3 = m2.a();
            if (a3 != null) {
                a3.d();
            }
            throw th;
        }
        a2.d();
    }

    private final int h0(t92 t92, boolean z) {
        a N = N();
        if (N == null || N.m() == b.TERMINATED) {
            return 1;
        }
        int i2 = -1;
        if (t92.a() == w92.NON_BLOCKING) {
            if (N.p()) {
                i2 = 0;
            } else if (!N.u()) {
                return 1;
            }
        }
        if (!(z ? N.j().c(t92, this.e) : N.j().b(t92, this.e)) || N.j().e() > x92.b) {
            return 0;
        }
        return i2;
    }

    /* access modifiers changed from: private */
    public final boolean isTerminated() {
        return this._isTerminated != 0;
    }

    private final boolean j0() {
        while (true) {
            a Y = Y();
            if (Y == null) {
                return false;
            }
            Y.o();
            boolean q2 = Y.q();
            LockSupport.unpark(Y);
            if (q2 && Y.v()) {
                return true;
            }
        }
    }

    public final t92 M(Runnable runnable, u92 u92) {
        v62.f(runnable, "block");
        v62.f(u92, "taskContext");
        long a2 = x92.f.a();
        if (!(runnable instanceof t92)) {
            return new v92(runnable, a2, u92);
        }
        t92 t92 = (t92) runnable;
        t92.e = a2;
        t92.f = u92;
        return t92;
    }

    public final void P(Runnable runnable, u92 u92, boolean z) {
        v62.f(runnable, "block");
        v62.f(u92, "taskContext");
        l2 a2 = m2.a();
        if (a2 != null) {
            a2.h();
        }
        t92 M = M(runnable, u92);
        int h0 = h0(M, z);
        if (h0 == -1) {
            return;
        }
        if (h0 == 1 && !this.e.a(M)) {
            throw new RejectedExecutionException(this.l + " was terminated");
        }
        d0();
    }

    public void close() {
        g0(10000);
    }

    public void execute(Runnable runnable) {
        v62.f(runnable, "command");
        Q(this, runnable, (u92) null, false, 6, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006a, code lost:
        if (r9 != null) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g0(long r9) {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = o
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            m92$a r0 = r8.N()
            m92$a[] r3 = r8.g
            monitor-enter(r3)
            long r4 = r8.controlState     // Catch:{ all -> 0x00a3 }
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r5 = (int) r4
            monitor-exit(r3)
            if (r2 > r5) goto L_0x005f
            r3 = 1
        L_0x001d:
            m92$a[] r4 = r8.g
            r4 = r4[r3]
            if (r4 == 0) goto L_0x005a
            if (r4 == r0) goto L_0x0055
        L_0x0025:
            boolean r6 = r4.isAlive()
            if (r6 == 0) goto L_0x0032
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r4.join(r9)
            goto L_0x0025
        L_0x0032:
            m92$b r6 = r4.m()
            boolean r7 = kotlinx.coroutines.k0.a()
            if (r7 == 0) goto L_0x004c
            m92$b r7 = defpackage.m92.b.TERMINATED
            if (r6 != r7) goto L_0x0042
            r6 = 1
            goto L_0x0043
        L_0x0042:
            r6 = 0
        L_0x0043:
            if (r6 == 0) goto L_0x0046
            goto L_0x004c
        L_0x0046:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L_0x004c:
            z92 r4 = r4.j()
            p92 r6 = r8.e
            r4.f(r6)
        L_0x0055:
            if (r3 == r5) goto L_0x005f
            int r3 = r3 + 1
            goto L_0x001d
        L_0x005a:
            defpackage.v62.l()
            r9 = 0
            throw r9
        L_0x005f:
            p92 r9 = r8.e
            r9.b()
        L_0x0064:
            if (r0 == 0) goto L_0x006d
            t92 r9 = r0.g()
            if (r9 == 0) goto L_0x006d
            goto L_0x0075
        L_0x006d:
            p92 r9 = r8.e
            java.lang.Object r9 = r9.d()
            t92 r9 = (defpackage.t92) r9
        L_0x0075:
            if (r9 == 0) goto L_0x007b
            r8.e0(r9)
            goto L_0x0064
        L_0x007b:
            if (r0 == 0) goto L_0x0082
            m92$b r9 = defpackage.m92.b.TERMINATED
            r0.w(r9)
        L_0x0082:
            boolean r9 = kotlinx.coroutines.k0.a()
            if (r9 == 0) goto L_0x009c
            java.util.concurrent.Semaphore r9 = r8.f
            int r9 = r9.availablePermits()
            int r10 = r8.i
            if (r9 != r10) goto L_0x0093
            r1 = 1
        L_0x0093:
            if (r1 == 0) goto L_0x0096
            goto L_0x009c
        L_0x0096:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L_0x009c:
            r9 = 0
            r8.parkedWorkersStack = r9
            r8.controlState = r9
            return
        L_0x00a3:
            r9 = move-exception
            monitor-exit(r3)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m92.g0(long):void");
    }

    public String toString() {
        String str;
        StringBuilder sb;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (a aVar : this.g) {
            if (aVar != null) {
                int i7 = aVar.j().i();
                int i8 = l92.a[aVar.m().ordinal()];
                if (i8 != 1) {
                    if (i8 == 2) {
                        i3++;
                        sb = new StringBuilder();
                        sb.append(String.valueOf(i7));
                        str = "b";
                    } else if (i8 == 3) {
                        i2++;
                        sb = new StringBuilder();
                        sb.append(String.valueOf(i7));
                        str = "c";
                    } else if (i8 == 4) {
                        i5++;
                        if (i7 > 0) {
                            sb = new StringBuilder();
                            sb.append(String.valueOf(i7));
                            str = "r";
                        }
                    } else if (i8 == 5) {
                        i6++;
                    }
                    sb.append(str);
                    arrayList.add(sb.toString());
                } else {
                    i4++;
                }
            }
        }
        long j2 = this.controlState;
        return this.l + '@' + l0.b(this) + '[' + "Pool Size {" + "core = " + this.i + ", " + "max = " + this.j + "}, " + "Worker States {" + "CPU = " + i2 + ", " + "blocking = " + i3 + ", " + "parked = " + i4 + ", " + "retired = " + i5 + ", " + "terminated = " + i6 + "}, " + "running workers queues = " + arrayList + ", " + "global queue size = " + this.e.c() + ", " + "Control State Workers {" + "created = " + ((int) (2097151 & j2)) + ", " + "blocking = " + ((int) ((j2 & 4398044413952L) >> 21)) + '}' + "]";
    }
}
