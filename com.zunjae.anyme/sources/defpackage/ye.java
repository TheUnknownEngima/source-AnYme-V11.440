package defpackage;

import com.bumptech.glide.load.g;
import defpackage.cf;
import defpackage.lm;
import defpackage.ue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ye  reason: default package */
class ye<R> implements ue.b<R>, lm.f {
    private static final c C = new c();
    private ue<R> A;
    private volatile boolean B;
    final e e;
    private final nm f;
    private final cf.a g;
    private final r3<ye<?>> h;
    private final c i;
    private final ze j;
    private final lg k;
    private final lg l;
    private final lg m;
    private final lg n;
    private final AtomicInteger o;
    private g p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private Cif<?> u;
    com.bumptech.glide.load.a v;
    private boolean w;
    df x;
    private boolean y;
    cf<?> z;

    /* renamed from: ye$a */
    private class a implements Runnable {
        private final dl e;

        a(dl dlVar) {
            this.e = dlVar;
        }

        public void run() {
            synchronized (this.e.g()) {
                synchronized (ye.this) {
                    if (ye.this.e.c(this.e)) {
                        ye.this.e(this.e);
                    }
                    ye.this.i();
                }
            }
        }
    }

    /* renamed from: ye$b */
    private class b implements Runnable {
        private final dl e;

        b(dl dlVar) {
            this.e = dlVar;
        }

        public void run() {
            synchronized (this.e.g()) {
                synchronized (ye.this) {
                    if (ye.this.e.c(this.e)) {
                        ye.this.z.b();
                        ye.this.f(this.e);
                        ye.this.r(this.e);
                    }
                    ye.this.i();
                }
            }
        }
    }

    /* renamed from: ye$c */
    static class c {
        c() {
        }

        public <R> cf<R> a(Cif<R> ifVar, boolean z, g gVar, cf.a aVar) {
            return new cf(ifVar, z, true, gVar, aVar);
        }
    }

    /* renamed from: ye$d */
    static final class d {
        final dl a;
        final Executor b;

        d(dl dlVar, Executor executor) {
            this.a = dlVar;
            this.b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.a.equals(((d) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    /* renamed from: ye$e */
    static final class e implements Iterable<d> {
        private final List<d> e;

        e() {
            this(new ArrayList(2));
        }

        e(List<d> list) {
            this.e = list;
        }

        private static d g(dl dlVar) {
            return new d(dlVar, em.a());
        }

        /* access modifiers changed from: package-private */
        public void a(dl dlVar, Executor executor) {
            this.e.add(new d(dlVar, executor));
        }

        /* access modifiers changed from: package-private */
        public boolean c(dl dlVar) {
            return this.e.contains(g(dlVar));
        }

        /* access modifiers changed from: package-private */
        public void clear() {
            this.e.clear();
        }

        /* access modifiers changed from: package-private */
        public e d() {
            return new e(new ArrayList(this.e));
        }

        /* access modifiers changed from: package-private */
        public void h(dl dlVar) {
            this.e.remove(g(dlVar));
        }

        /* access modifiers changed from: package-private */
        public boolean isEmpty() {
            return this.e.isEmpty();
        }

        public Iterator<d> iterator() {
            return this.e.iterator();
        }

        /* access modifiers changed from: package-private */
        public int size() {
            return this.e.size();
        }
    }

    ye(lg lgVar, lg lgVar2, lg lgVar3, lg lgVar4, ze zeVar, cf.a aVar, r3<ye<?>> r3Var) {
        this(lgVar, lgVar2, lgVar3, lgVar4, zeVar, aVar, r3Var, C);
    }

    ye(lg lgVar, lg lgVar2, lg lgVar3, lg lgVar4, ze zeVar, cf.a aVar, r3<ye<?>> r3Var, c cVar) {
        this.e = new e();
        this.f = nm.a();
        this.o = new AtomicInteger();
        this.k = lgVar;
        this.l = lgVar2;
        this.m = lgVar3;
        this.n = lgVar4;
        this.j = zeVar;
        this.g = aVar;
        this.h = r3Var;
        this.i = cVar;
    }

    private lg j() {
        return this.r ? this.m : this.s ? this.n : this.l;
    }

    private boolean m() {
        return this.y || this.w || this.B;
    }

    private synchronized void q() {
        if (this.p != null) {
            this.e.clear();
            this.p = null;
            this.z = null;
            this.u = null;
            this.y = false;
            this.B = false;
            this.w = false;
            this.A.H(false);
            this.A = null;
            this.x = null;
            this.v = null;
            this.h.c(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void a(df dfVar) {
        synchronized (this) {
            this.x = dfVar;
        }
        n();
    }

    /* access modifiers changed from: package-private */
    public synchronized void b(dl dlVar, Executor executor) {
        Runnable aVar;
        this.f.c();
        this.e.a(dlVar, executor);
        boolean z2 = true;
        if (this.w) {
            k(1);
            aVar = new b(dlVar);
        } else if (this.y) {
            k(1);
            aVar = new a(dlVar);
        } else {
            if (this.B) {
                z2 = false;
            }
            jm.a(z2, "Cannot add callbacks to a cancelled EngineJob");
        }
        executor.execute(aVar);
    }

    public void c(Cif<R> ifVar, com.bumptech.glide.load.a aVar) {
        synchronized (this) {
            this.u = ifVar;
            this.v = aVar;
        }
        o();
    }

    public void d(ue<?> ueVar) {
        j().execute(ueVar);
    }

    /* access modifiers changed from: package-private */
    public void e(dl dlVar) {
        try {
            dlVar.a(this.x);
        } catch (Throwable th) {
            throw new oe(th);
        }
    }

    /* access modifiers changed from: package-private */
    public void f(dl dlVar) {
        try {
            dlVar.c(this.z, this.v);
        } catch (Throwable th) {
            throw new oe(th);
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        if (!m()) {
            this.B = true;
            this.A.i();
            this.j.c(this, this.p);
        }
    }

    public nm h() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        cf<?> cfVar;
        synchronized (this) {
            this.f.c();
            jm.a(m(), "Not yet complete!");
            int decrementAndGet = this.o.decrementAndGet();
            jm.a(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                cfVar = this.z;
                q();
            } else {
                cfVar = null;
            }
        }
        if (cfVar != null) {
            cfVar.g();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void k(int i2) {
        jm.a(m(), "Not yet complete!");
        if (this.o.getAndAdd(i2) == 0 && this.z != null) {
            this.z.b();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized ye<R> l(g gVar, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.p = gVar;
        this.q = z2;
        this.r = z3;
        this.s = z4;
        this.t = z5;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r4.j.b(r4, r1, (defpackage.cf<?>) null);
        r0 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r0.hasNext() == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r1 = r0.next();
        r1.b.execute(new defpackage.ye.a(r4, r1.a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n() {
        /*
            r4 = this;
            monitor-enter(r4)
            nm r0 = r4.f     // Catch:{ all -> 0x0066 }
            r0.c()     // Catch:{ all -> 0x0066 }
            boolean r0 = r4.B     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x000f
            r4.q()     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            return
        L_0x000f:
            ye$e r0 = r4.e     // Catch:{ all -> 0x0066 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x005e
            boolean r0 = r4.y     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x0056
            r0 = 1
            r4.y = r0     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.g r1 = r4.p     // Catch:{ all -> 0x0066 }
            ye$e r2 = r4.e     // Catch:{ all -> 0x0066 }
            ye$e r2 = r2.d()     // Catch:{ all -> 0x0066 }
            int r3 = r2.size()     // Catch:{ all -> 0x0066 }
            int r3 = r3 + r0
            r4.k(r3)     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            ze r0 = r4.j
            r3 = 0
            r0.b(r4, r1, r3)
            java.util.Iterator r0 = r2.iterator()
        L_0x0039:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0052
            java.lang.Object r1 = r0.next()
            ye$d r1 = (defpackage.ye.d) r1
            java.util.concurrent.Executor r2 = r1.b
            ye$a r3 = new ye$a
            dl r1 = r1.a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x0039
        L_0x0052:
            r4.i()
            return
        L_0x0056:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Already failed once"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x005e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Received an exception without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye.n():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        r5.j.b(r5, r0, r2);
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (r0.hasNext() == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        r1 = r0.next();
        r1.b.execute(new defpackage.ye.b(r5, r1.a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o() {
        /*
            r5 = this;
            monitor-enter(r5)
            nm r0 = r5.f     // Catch:{ all -> 0x007c }
            r0.c()     // Catch:{ all -> 0x007c }
            boolean r0 = r5.B     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x0014
            if<?> r0 = r5.u     // Catch:{ all -> 0x007c }
            r0.a()     // Catch:{ all -> 0x007c }
            r5.q()     // Catch:{ all -> 0x007c }
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            return
        L_0x0014:
            ye$e r0 = r5.e     // Catch:{ all -> 0x007c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x0074
            boolean r0 = r5.w     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x006c
            ye$c r0 = r5.i     // Catch:{ all -> 0x007c }
            if<?> r1 = r5.u     // Catch:{ all -> 0x007c }
            boolean r2 = r5.q     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.g r3 = r5.p     // Catch:{ all -> 0x007c }
            cf$a r4 = r5.g     // Catch:{ all -> 0x007c }
            cf r0 = r0.a(r1, r2, r3, r4)     // Catch:{ all -> 0x007c }
            r5.z = r0     // Catch:{ all -> 0x007c }
            r0 = 1
            r5.w = r0     // Catch:{ all -> 0x007c }
            ye$e r1 = r5.e     // Catch:{ all -> 0x007c }
            ye$e r1 = r1.d()     // Catch:{ all -> 0x007c }
            int r2 = r1.size()     // Catch:{ all -> 0x007c }
            int r2 = r2 + r0
            r5.k(r2)     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.g r0 = r5.p     // Catch:{ all -> 0x007c }
            cf<?> r2 = r5.z     // Catch:{ all -> 0x007c }
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            ze r3 = r5.j
            r3.b(r5, r0, r2)
            java.util.Iterator r0 = r1.iterator()
        L_0x004f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0068
            java.lang.Object r1 = r0.next()
            ye$d r1 = (defpackage.ye.d) r1
            java.util.concurrent.Executor r2 = r1.b
            ye$b r3 = new ye$b
            dl r1 = r1.a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x004f
        L_0x0068:
            r5.i()
            return
        L_0x006c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "Already have resource"
            r0.<init>(r1)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x0074:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "Received a resource without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x007c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye.o():void");
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return this.t;
    }

    /* access modifiers changed from: package-private */
    public synchronized void r(dl dlVar) {
        boolean z2;
        this.f.c();
        this.e.h(dlVar);
        if (this.e.isEmpty()) {
            g();
            if (!this.w) {
                if (!this.y) {
                    z2 = false;
                    if (z2 && this.o.get() == 0) {
                        q();
                    }
                }
            }
            z2 = true;
            q();
        }
    }

    public synchronized void s(ue<R> ueVar) {
        this.A = ueVar;
        (ueVar.N() ? this.k : j()).execute(ueVar);
    }
}
