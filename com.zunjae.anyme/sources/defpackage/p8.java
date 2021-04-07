package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: p8  reason: default package */
public abstract class p8<V> implements db1<V> {
    static final boolean h = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger i = Logger.getLogger(p8.class.getName());
    static final b j;
    private static final Object k = new Object();
    volatile Object e;
    volatile e f;
    volatile i g;

    /* renamed from: p8$b */
    private static abstract class b {
        private b() {
        }

        /* access modifiers changed from: package-private */
        public abstract boolean a(p8<?> p8Var, e eVar, e eVar2);

        /* access modifiers changed from: package-private */
        public abstract boolean b(p8<?> p8Var, Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        public abstract boolean c(p8<?> p8Var, i iVar, i iVar2);

        /* access modifiers changed from: package-private */
        public abstract void d(i iVar, i iVar2);

        /* access modifiers changed from: package-private */
        public abstract void e(i iVar, Thread thread);
    }

    /* renamed from: p8$c */
    private static final class c {
        static final c c;
        static final c d;
        final boolean a;
        final Throwable b;

        static {
            if (p8.h) {
                d = null;
                c = null;
                return;
            }
            d = new c(false, (Throwable) null);
            c = new c(true, (Throwable) null);
        }

        c(boolean z, Throwable th) {
            this.a = z;
            this.b = th;
        }
    }

    /* renamed from: p8$d */
    private static final class d {
        static final d b = new d(new a("Failure occurred while trying to finish a future."));
        final Throwable a;

        /* renamed from: p8$d$a */
        static class a extends Throwable {
            a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            p8.e(th);
            this.a = th;
        }
    }

    /* renamed from: p8$e */
    private static final class e {
        static final e d = new e((Runnable) null, (Executor) null);
        final Runnable a;
        final Executor b;
        e c;

        e(Runnable runnable, Executor executor) {
            this.a = runnable;
            this.b = executor;
        }
    }

    /* renamed from: p8$f */
    private static final class f extends b {
        final AtomicReferenceFieldUpdater<i, Thread> a;
        final AtomicReferenceFieldUpdater<i, i> b;
        final AtomicReferenceFieldUpdater<p8, i> c;
        final AtomicReferenceFieldUpdater<p8, e> d;
        final AtomicReferenceFieldUpdater<p8, Object> e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<p8, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<p8, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<p8, Object> atomicReferenceFieldUpdater5) {
            super();
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        public boolean a(p8<?> p8Var, e eVar, e eVar2) {
            return this.d.compareAndSet(p8Var, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        public boolean b(p8<?> p8Var, Object obj, Object obj2) {
            return this.e.compareAndSet(p8Var, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        public boolean c(p8<?> p8Var, i iVar, i iVar2) {
            return this.c.compareAndSet(p8Var, iVar, iVar2);
        }

        /* access modifiers changed from: package-private */
        public void d(i iVar, i iVar2) {
            this.b.lazySet(iVar, iVar2);
        }

        /* access modifiers changed from: package-private */
        public void e(i iVar, Thread thread) {
            this.a.lazySet(iVar, thread);
        }
    }

    /* renamed from: p8$g */
    private static final class g<V> implements Runnable {
        final p8<V> e;
        final db1<? extends V> f;

        g(p8<V> p8Var, db1<? extends V> db1) {
            this.e = p8Var;
            this.f = db1;
        }

        public void run() {
            if (this.e.e == this) {
                if (p8.j.b(this.e, this, p8.j(this.f))) {
                    p8.g(this.e);
                }
            }
        }
    }

    /* renamed from: p8$h */
    private static final class h extends b {
        h() {
            super();
        }

        /* access modifiers changed from: package-private */
        public boolean a(p8<?> p8Var, e eVar, e eVar2) {
            synchronized (p8Var) {
                if (p8Var.f != eVar) {
                    return false;
                }
                p8Var.f = eVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(p8<?> p8Var, Object obj, Object obj2) {
            synchronized (p8Var) {
                if (p8Var.e != obj) {
                    return false;
                }
                p8Var.e = obj2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(p8<?> p8Var, i iVar, i iVar2) {
            synchronized (p8Var) {
                if (p8Var.g != iVar) {
                    return false;
                }
                p8Var.g = iVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public void d(i iVar, i iVar2) {
            iVar.b = iVar2;
        }

        /* access modifiers changed from: package-private */
        public void e(i iVar, Thread thread) {
            iVar.a = thread;
        }
    }

    /* renamed from: p8$i */
    private static final class i {
        static final i c = new i(false);
        volatile Thread a;
        volatile i b;

        i() {
            p8.j.e(this, Thread.currentThread());
        }

        i(boolean z) {
        }

        /* access modifiers changed from: package-private */
        public void a(i iVar) {
            p8.j.d(this, iVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            Thread thread = this.a;
            if (thread != null) {
                this.a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: p8$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: p8$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: p8$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: p8$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<p8$i> r0 = defpackage.p8.i.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            h = r1
            java.lang.Class<p8> r1 = defpackage.p8.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            i = r1
            p8$f r1 = new p8$f     // Catch:{ all -> 0x004e }
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r3)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch:{ all -> 0x004e }
            java.lang.Class<p8> r2 = defpackage.p8.class
            java.lang.String r5 = "g"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<p8> r0 = defpackage.p8.class
            java.lang.Class<p8$e> r2 = defpackage.p8.e.class
            java.lang.String r6 = "f"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004e }
            java.lang.Class<p8> r0 = defpackage.p8.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "e"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004e }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = 0
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            p8$h r1 = new p8$h
            r1.<init>()
        L_0x0054:
            j = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L_0x0063
            java.util.logging.Logger r1 = i
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0063:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p8.<clinit>():void");
    }

    protected p8() {
    }

    private void b(StringBuilder sb) {
        String str = "]";
        try {
            Object k2 = k(this);
            sb.append("SUCCESS, result=[");
            sb.append(s(k2));
            sb.append(str);
            return;
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
        } catch (CancellationException unused) {
            str = "CANCELLED";
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            str = " thrown from get()]";
        }
        sb.append(str);
    }

    private static CancellationException d(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static <T> T e(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    private e f(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f;
        } while (!j.a(this, eVar2, e.d));
        e eVar3 = eVar2;
        e eVar4 = eVar;
        e eVar5 = eVar3;
        while (eVar5 != null) {
            e eVar6 = eVar5.c;
            eVar5.c = eVar4;
            eVar4 = eVar5;
            eVar5 = eVar6;
        }
        return eVar4;
    }

    static void g(p8<?> p8Var) {
        e eVar = null;
        p8<V> p8Var2 = p8Var;
        while (true) {
            p8Var2.n();
            p8Var2.c();
            e f2 = p8Var2.f(eVar);
            while (true) {
                if (f2 != null) {
                    eVar = f2.c;
                    Runnable runnable = f2.a;
                    if (runnable instanceof g) {
                        g gVar = (g) runnable;
                        p8<V> p8Var3 = gVar.e;
                        if (p8Var3.e == gVar) {
                            if (j.b(p8Var3, gVar, j(gVar.f))) {
                                p8Var2 = p8Var3;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        h(runnable, f2.b);
                    }
                    f2 = eVar;
                } else {
                    return;
                }
            }
        }
    }

    private static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = i;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e2);
        }
    }

    private V i(Object obj) {
        if (obj instanceof c) {
            throw d("Task was cancelled.", ((c) obj).b);
        } else if (obj instanceof d) {
            throw new ExecutionException(((d) obj).a);
        } else if (obj == k) {
            return null;
        } else {
            return obj;
        }
    }

    static Object j(db1<?> db1) {
        if (db1 instanceof p8) {
            Object obj = ((p8) db1).e;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.a ? cVar.b != null ? new c(false, cVar.b) : c.d : obj;
        }
        boolean isCancelled = db1.isCancelled();
        if ((!h) && isCancelled) {
            return c.d;
        }
        try {
            Object k2 = k(db1);
            return k2 == null ? k : k2;
        } catch (ExecutionException e2) {
            return new d(e2.getCause());
        } catch (CancellationException e3) {
            if (isCancelled) {
                return new c(false, e3);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + db1, e3));
        } catch (Throwable th) {
            return new d(th);
        }
    }

    private static <V> V k(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    private void n() {
        i iVar;
        do {
            iVar = this.g;
        } while (!j.c(this, iVar, i.c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.b;
        }
    }

    private void o(i iVar) {
        iVar.a = null;
        while (true) {
            i iVar2 = this.g;
            if (iVar2 != i.c) {
                i iVar3 = null;
                while (iVar2 != null) {
                    i iVar4 = iVar2.b;
                    if (iVar2.a != null) {
                        iVar3 = iVar2;
                    } else if (iVar3 != null) {
                        iVar3.b = iVar4;
                        if (iVar3.a == null) {
                        }
                    } else if (!j.c(this, iVar2, iVar4)) {
                    }
                    iVar2 = iVar4;
                }
                return;
            }
            return;
        }
    }

    private String s(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    public final void a(Runnable runnable, Executor executor) {
        e(runnable);
        e(executor);
        e eVar = this.f;
        if (eVar != e.d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.c = eVar;
                if (!j.a(this, eVar, eVar2)) {
                    eVar = this.f;
                } else {
                    return;
                }
            } while (eVar != e.d);
        }
        h(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public void c() {
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, db1<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.e
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof defpackage.p8.g
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0061
            boolean r3 = h
            if (r3 == 0) goto L_0x001f
            p8$c r3 = new p8$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            p8$c r3 = defpackage.p8.c.c
            goto L_0x0026
        L_0x0024:
            p8$c r3 = defpackage.p8.c.d
        L_0x0026:
            r5 = 0
            r4 = r7
        L_0x0028:
            p8$b r6 = j
            boolean r6 = r6.b(r4, r0, r3)
            if (r6 == 0) goto L_0x0059
            if (r8 == 0) goto L_0x0035
            r4.l()
        L_0x0035:
            g(r4)
            boolean r4 = r0 instanceof defpackage.p8.g
            if (r4 == 0) goto L_0x0062
            p8$g r0 = (defpackage.p8.g) r0
            db1<? extends V> r0 = r0.f
            boolean r4 = r0 instanceof defpackage.p8
            if (r4 == 0) goto L_0x0055
            r4 = r0
            p8 r4 = (defpackage.p8) r4
            java.lang.Object r0 = r4.e
            if (r0 != 0) goto L_0x004d
            r5 = 1
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            boolean r6 = r0 instanceof defpackage.p8.g
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0062
            r5 = 1
            goto L_0x0028
        L_0x0055:
            r0.cancel(r8)
            goto L_0x0062
        L_0x0059:
            java.lang.Object r0 = r4.e
            boolean r6 = r0 instanceof defpackage.p8.g
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x0062
        L_0x0061:
            r1 = 0
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p8.cancel(boolean):boolean");
    }

    public final V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.e;
            if ((obj2 != null) && (!(obj2 instanceof g))) {
                return i(obj2);
            }
            i iVar = this.g;
            if (iVar != i.c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (j.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.e;
                            } else {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return i(obj);
                    }
                    iVar = this.g;
                } while (iVar != i.c);
            }
            return i(this.e);
        }
        throw new InterruptedException();
    }

    public final V get(long j2, TimeUnit timeUnit) {
        long j3 = j2;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j3);
        if (!Thread.interrupted()) {
            Object obj = this.e;
            if ((obj != null) && (!(obj instanceof g))) {
                return i(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                i iVar = this.g;
                if (iVar != i.c) {
                    i iVar2 = new i();
                    do {
                        iVar2.a(iVar);
                        if (j.c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.e;
                                    if ((obj2 != null) && (!(obj2 instanceof g))) {
                                        return i(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    o(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            o(iVar2);
                        } else {
                            iVar = this.g;
                        }
                    } while (iVar != i.c);
                }
                return i(this.e);
            }
            while (nanos > 0) {
                Object obj3 = this.e;
                if ((obj3 != null) && (!(obj3 instanceof g))) {
                    return i(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String p8Var = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j3 + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j4 = -nanos;
                long convert = timeUnit2.convert(j4, TimeUnit.NANOSECONDS);
                long nanos2 = j4 - timeUnit2.toNanos(convert);
                int i2 = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z = i2 == 0 || nanos2 > 1000;
                if (i2 > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + p8Var);
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.e instanceof c;
    }

    public final boolean isDone() {
        Object obj = this.e;
        return (!(obj instanceof g)) & (obj != null);
    }

    /* access modifiers changed from: protected */
    public void l() {
    }

    /* access modifiers changed from: protected */
    public String m() {
        Object obj = this.e;
        if (obj instanceof g) {
            return "setFuture=[" + s(((g) obj).f) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    /* access modifiers changed from: protected */
    public boolean p(V v) {
        if (v == null) {
            v = k;
        }
        if (!j.b(this, (Object) null, v)) {
            return false;
        }
        g(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean q(Throwable th) {
        e(th);
        if (!j.b(this, (Object) null, new d(th))) {
            return false;
        }
        g(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean r(db1<? extends V> db1) {
        g gVar;
        d dVar;
        e(db1);
        Object obj = this.e;
        if (obj == null) {
            if (db1.isDone()) {
                if (!j.b(this, (Object) null, j(db1))) {
                    return false;
                }
                g(this);
                return true;
            }
            gVar = new g(this, db1);
            if (j.b(this, (Object) null, gVar)) {
                try {
                    db1.a(gVar, q8.INSTANCE);
                } catch (Throwable unused) {
                    dVar = d.b;
                }
                return true;
            }
            obj = this.e;
        }
        if (obj instanceof c) {
            db1.cancel(((c) obj).a);
        }
        return false;
        j.b(this, gVar, dVar);
        return true;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            str2 = "CANCELLED";
        } else {
            if (!isDone()) {
                try {
                    str = m();
                } catch (RuntimeException e2) {
                    str = "Exception thrown from implementation: " + e2.getClass();
                }
                if (str != null && !str.isEmpty()) {
                    sb.append("PENDING, info=[");
                    sb.append(str);
                    sb.append("]");
                    sb.append("]");
                    return sb.toString();
                } else if (!isDone()) {
                    str2 = "PENDING";
                }
            }
            b(sb);
            sb.append("]");
            return sb.toString();
        }
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
