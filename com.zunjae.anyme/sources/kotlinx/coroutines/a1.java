package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.a0;
import kotlinx.coroutines.internal.l;
import kotlinx.coroutines.internal.z;

public abstract class a1 extends b1 implements o0 {
    private static final AtomicReferenceFieldUpdater h;
    private static final AtomicReferenceFieldUpdater i;
    private volatile Object _delayed = null;
    private volatile Object _queue = null;
    /* access modifiers changed from: private */
    public volatile boolean isCompleted;

    private final class a extends b {
        private final i<u22> h;
        final /* synthetic */ a1 i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(a1 a1Var, long j, i<? super u22> iVar) {
            super(j);
            v62.f(iVar, "cont");
            this.i = a1Var;
            this.h = iVar;
        }

        public void run() {
            this.h.j(this.i, u22.a);
        }

        public String toString() {
            return super.toString() + this.h.toString();
        }
    }

    public static abstract class b implements Runnable, Comparable<b>, w0, a0 {
        private Object e;
        private int f = -1;
        public long g;

        public b(long j) {
            this.g = j;
        }

        public void a(z<?> zVar) {
            if (this.e != d1.a) {
                this.e = zVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public z<?> f() {
            Object obj = this.e;
            if (!(obj instanceof z)) {
                obj = null;
            }
            return (z) obj;
        }

        public void h(int i) {
            this.f = i;
        }

        public int i() {
            return this.f;
        }

        public final synchronized void k() {
            Object obj = this.e;
            if (obj != d1.a) {
                if (!(obj instanceof c)) {
                    obj = null;
                }
                c cVar = (c) obj;
                if (cVar != null) {
                    cVar.g(this);
                }
                this.e = d1.a;
            }
        }

        /* renamed from: l */
        public int compareTo(b bVar) {
            v62.f(bVar, "other");
            int i = ((this.g - bVar.g) > 0 ? 1 : ((this.g - bVar.g) == 0 ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            return i < 0 ? -1 : 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0052, code lost:
            r8 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
            return r8;
         */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x004a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized int m(long r8, kotlinx.coroutines.a1.c r10, kotlinx.coroutines.a1 r11) {
            /*
                r7 = this;
                monitor-enter(r7)
                java.lang.String r0 = "delayed"
                defpackage.v62.f(r10, r0)     // Catch:{ all -> 0x0057 }
                java.lang.String r0 = "eventLoop"
                defpackage.v62.f(r11, r0)     // Catch:{ all -> 0x0057 }
                java.lang.Object r0 = r7.e     // Catch:{ all -> 0x0057 }
                kotlinx.coroutines.internal.u r1 = kotlinx.coroutines.d1.a     // Catch:{ all -> 0x0057 }
                if (r0 != r1) goto L_0x0016
                r8 = 2
            L_0x0014:
                monitor-exit(r7)
                return r8
            L_0x0016:
                monitor-enter(r10)     // Catch:{ all -> 0x0057 }
                kotlinx.coroutines.internal.a0 r0 = r10.b()     // Catch:{ all -> 0x0054 }
                kotlinx.coroutines.a1$b r0 = (kotlinx.coroutines.a1.b) r0     // Catch:{ all -> 0x0054 }
                boolean r11 = r11.isCompleted     // Catch:{ all -> 0x0054 }
                if (r11 == 0) goto L_0x0027
                r8 = 1
                monitor-exit(r10)     // Catch:{ all -> 0x0057 }
                monitor-exit(r7)
                return r8
            L_0x0027:
                r1 = 0
                if (r0 != 0) goto L_0x002e
            L_0x002b:
                r10.b = r8     // Catch:{ all -> 0x0054 }
                goto L_0x0041
            L_0x002e:
                long r3 = r0.g     // Catch:{ all -> 0x0054 }
                long r5 = r3 - r8
                int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r11 < 0) goto L_0x0037
                goto L_0x0038
            L_0x0037:
                r8 = r3
            L_0x0038:
                long r3 = r10.b     // Catch:{ all -> 0x0054 }
                long r3 = r8 - r3
                int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r11 <= 0) goto L_0x0041
                goto L_0x002b
            L_0x0041:
                long r8 = r7.g     // Catch:{ all -> 0x0054 }
                long r3 = r10.b     // Catch:{ all -> 0x0054 }
                long r8 = r8 - r3
                int r11 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r11 >= 0) goto L_0x004e
                long r8 = r10.b     // Catch:{ all -> 0x0054 }
                r7.g = r8     // Catch:{ all -> 0x0054 }
            L_0x004e:
                r10.a(r7)     // Catch:{ all -> 0x0054 }
                monitor-exit(r10)     // Catch:{ all -> 0x0057 }
                r8 = 0
                goto L_0x0014
            L_0x0054:
                r8 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x0057 }
                throw r8     // Catch:{ all -> 0x0057 }
            L_0x0057:
                r8 = move-exception
                monitor-exit(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.a1.b.m(long, kotlinx.coroutines.a1$c, kotlinx.coroutines.a1):int");
        }

        public final boolean q(long j) {
            return j - this.g >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.g + ']';
        }
    }

    public static final class c extends z<b> {
        public long b;

        public c(long j) {
            this.b = j;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<a1> cls2 = a1.class;
        h = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue");
        i = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed");
    }

    private final void F0() {
        b bVar;
        l2 a2 = m2.a();
        long b2 = a2 != null ? a2.b() : System.nanoTime();
        while (true) {
            c cVar = (c) this._delayed;
            if (cVar != null && (bVar = (b) cVar.i()) != null) {
                k0(b2, bVar);
            } else {
                return;
            }
        }
    }

    private final int M0(long j, b bVar) {
        if (this.isCompleted) {
            return 1;
        }
        c cVar = (c) this._delayed;
        if (cVar == null) {
            i.compareAndSet(this, (Object) null, new c(j));
            Object obj = this._delayed;
            if (obj != null) {
                cVar = (c) obj;
            } else {
                v62.l();
                throw null;
            }
        }
        return bVar.m(j, cVar, this);
    }

    private final boolean N0(b bVar) {
        c cVar = (c) this._delayed;
        return (cVar != null ? (b) cVar.e() : null) == bVar;
    }

    private final void s0() {
        if (!k0.a() || this.isCompleted) {
            while (true) {
                Object obj = this._queue;
                if (obj == null) {
                    if (h.compareAndSet(this, (Object) null, d1.b)) {
                        return;
                    }
                } else if (obj instanceof l) {
                    ((l) obj).g();
                    return;
                } else if (obj != d1.b) {
                    l lVar = new l(8, true);
                    if (obj != null) {
                        lVar.d((Runnable) obj);
                        if (h.compareAndSet(this, obj, lVar)) {
                            return;
                        }
                    } else {
                        throw new r22("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new AssertionError();
        }
    }

    private final Runnable u0() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof l) {
                if (obj != null) {
                    l lVar = (l) obj;
                    Object m = lVar.m();
                    if (m != l.g) {
                        return (Runnable) m;
                    }
                    h.compareAndSet(this, obj, lVar.l());
                } else {
                    throw new r22("null cannot be cast to non-null type kotlinx.coroutines.Queue<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> /* = kotlinx.coroutines.internal.LockFreeTaskQueueCore<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> */");
                }
            } else if (obj == d1.b) {
                return null;
            } else {
                if (h.compareAndSet(this, obj, (Object) null)) {
                    if (obj != null) {
                        return (Runnable) obj;
                    }
                    throw new r22("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                }
            }
        }
    }

    private final boolean z0(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (this.isCompleted) {
                return false;
            }
            if (obj == null) {
                if (h.compareAndSet(this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof l) {
                if (obj != null) {
                    l lVar = (l) obj;
                    int d = lVar.d(runnable);
                    if (d == 0) {
                        return true;
                    }
                    if (d == 1) {
                        h.compareAndSet(this, obj, lVar.l());
                    } else if (d == 2) {
                        return false;
                    }
                } else {
                    throw new r22("null cannot be cast to non-null type kotlinx.coroutines.Queue<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> /* = kotlinx.coroutines.internal.LockFreeTaskQueueCore<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> */");
                }
            } else if (obj == d1.b) {
                return false;
            } else {
                l lVar2 = new l(8, true);
                if (obj != null) {
                    lVar2.d((Runnable) obj);
                    lVar2.d(runnable);
                    if (h.compareAndSet(this, obj, lVar2)) {
                        return true;
                    }
                } else {
                    throw new r22("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean B0() {
        if (!g0()) {
            return false;
        }
        c cVar = (c) this._delayed;
        if (cVar != null && !cVar.d()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            return obj instanceof l ? ((l) obj).j() : obj == d1.b;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long D0() {
        /*
            r7 = this;
            boolean r0 = r7.h0()
            if (r0 == 0) goto L_0x000b
            long r0 = r7.Z()
            return r0
        L_0x000b:
            java.lang.Object r0 = r7._delayed
            kotlinx.coroutines.a1$c r0 = (kotlinx.coroutines.a1.c) r0
            if (r0 == 0) goto L_0x004d
            boolean r1 = r0.d()
            if (r1 != 0) goto L_0x004d
            kotlinx.coroutines.l2 r1 = kotlinx.coroutines.m2.a()
            if (r1 == 0) goto L_0x0022
            long r1 = r1.b()
            goto L_0x0026
        L_0x0022:
            long r1 = java.lang.System.nanoTime()
        L_0x0026:
            monitor-enter(r0)
            kotlinx.coroutines.internal.a0 r3 = r0.b()     // Catch:{ all -> 0x004a }
            r4 = 0
            if (r3 == 0) goto L_0x0044
            kotlinx.coroutines.a1$b r3 = (kotlinx.coroutines.a1.b) r3     // Catch:{ all -> 0x004a }
            boolean r5 = r3.q(r1)     // Catch:{ all -> 0x004a }
            r6 = 0
            if (r5 == 0) goto L_0x003c
            boolean r3 = r7.z0(r3)     // Catch:{ all -> 0x004a }
            goto L_0x003d
        L_0x003c:
            r3 = 0
        L_0x003d:
            if (r3 == 0) goto L_0x0044
            kotlinx.coroutines.internal.a0 r3 = r0.h(r6)     // Catch:{ all -> 0x004a }
            r4 = r3
        L_0x0044:
            monitor-exit(r0)
            kotlinx.coroutines.a1$b r4 = (kotlinx.coroutines.a1.b) r4
            if (r4 == 0) goto L_0x004d
            goto L_0x0026
        L_0x004a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x004d:
            java.lang.Runnable r0 = r7.u0()
            if (r0 == 0) goto L_0x0056
            r0.run()
        L_0x0056:
            long r0 = r7.Z()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.a1.D0():long");
    }

    /* access modifiers changed from: protected */
    public final void G0() {
        this._queue = null;
        this._delayed = null;
    }

    public final void L0(long j, b bVar) {
        v62.f(bVar, "delayedTask");
        int M0 = M0(j, bVar);
        if (M0 != 0) {
            if (M0 == 1) {
                k0(j, bVar);
            } else if (M0 != 2) {
                throw new IllegalStateException("unexpected result".toString());
            }
        } else if (N0(bVar)) {
            m0();
        }
    }

    public final void N(n42 n42, Runnable runnable) {
        v62.f(n42, "context");
        v62.f(runnable, "block");
        v0(runnable);
    }

    /* access modifiers changed from: protected */
    public long Z() {
        b bVar;
        if (super.Z() == 0) {
            return 0;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof l)) {
                return obj == d1.b ? Long.MAX_VALUE : 0;
            }
            if (!((l) obj).j()) {
                return 0;
            }
        }
        c cVar = (c) this._delayed;
        if (cVar == null || (bVar = (b) cVar.e()) == null) {
            return Long.MAX_VALUE;
        }
        long j = bVar.g;
        l2 a2 = m2.a();
        return w72.c(j - (a2 != null ? a2.b() : System.nanoTime()), 0);
    }

    public void k(long j, i<? super u22> iVar) {
        v62.f(iVar, "continuation");
        long c2 = d1.c(j);
        if (c2 < 4611686018427387903L) {
            l2 a2 = m2.a();
            long b2 = a2 != null ? a2.b() : System.nanoTime();
            a aVar = new a(this, c2 + b2, iVar);
            k.a(iVar, aVar);
            L0(b2, aVar);
        }
    }

    /* access modifiers changed from: protected */
    public void shutdown() {
        k2.b.b();
        this.isCompleted = true;
        s0();
        do {
        } while (D0() <= 0);
        F0();
    }

    public final void v0(Runnable runnable) {
        v62.f(runnable, "task");
        if (z0(runnable)) {
            m0();
        } else {
            m0.k.v0(runnable);
        }
    }
}
