package defpackage;

import defpackage.bd;
import defpackage.eb;
import defpackage.fb;
import defpackage.gb;
import defpackage.ib;
import defpackage.jb;
import defpackage.yc;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* renamed from: x9  reason: default package */
public class x9 {
    private final String a;
    /* access modifiers changed from: private */
    public final ScheduledExecutorService b;
    private final bd c;
    private final ExecutorService d;
    private final ExecutorService e;
    /* access modifiers changed from: private */
    public final yc f;
    private final String g;
    private final String h;
    private final ac i;
    private final ab<String> j;
    /* access modifiers changed from: private */
    public final xa k;
    /* access modifiers changed from: private */
    public final ua l;
    private final kb m;
    private final id n;
    /* access modifiers changed from: private */
    public volatile fb o;
    /* access modifiers changed from: private */
    public volatile boolean p = false;
    /* access modifiers changed from: private */
    public volatile boolean q = false;
    private volatile boolean r = false;
    private final List<Callable<?>> s;
    private long t = 5242880;
    private AtomicLong u = new AtomicLong();

    /* renamed from: x9$a */
    class a implements bd.c {
        a() {
        }

        public void a(ThreadPoolExecutor threadPoolExecutor, boolean z) {
            x9 x9Var = x9.this;
            threadPoolExecutor.submit(x9Var.g(x9Var.p(ib.c.D, "bf_log_memory_pressure", "Bugfender received a memory warning. New incoming logs will be discarded until the logs pending to be processed are reduced.")));
        }
    }

    /* renamed from: x9$b */
    class b implements w9<fb> {
        b() {
        }

        public void b(Throwable th) {
            if (th instanceof ja) {
                x9.this.Y();
            } else if (x9.this.o == null) {
                fb unused = x9.this.o = fb.d;
            }
        }

        /* renamed from: c */
        public void a(fb fbVar) {
            fb unused = x9.this.o = new fb.b(fbVar).c();
        }
    }

    /* renamed from: x9$c */
    class c implements Runnable {
        final /* synthetic */ jb e;

        /* renamed from: x9$c$a */
        class a extends yc.b {
            a() {
            }

            private void h(pc<?> pcVar) {
                if (pcVar.b() instanceof la) {
                    fb unused = x9.this.o = fb.d;
                } else if (pcVar.b() instanceof ma) {
                    throw new vb();
                }
            }

            /* access modifiers changed from: protected */
            public void d(long j) {
                x9.this.f.a();
                x9.this.f.b(j, new yc.a(this));
            }

            public void e() {
                boolean z = x9.this.o != null && x9.this.o.c();
                boolean a = x9.this.k.a();
                if ((a && z) || (a && x9.this.q)) {
                    h((pc) x9.this.U().get());
                    h((pc) x9.this.X().get());
                }
                if (a) {
                    h((pc) x9.this.S().get());
                    h((pc) x9.this.Q().get());
                    h((pc) x9.this.P().get());
                }
            }
        }

        /* renamed from: x9$c$b */
        class b implements Runnable {
            b() {
            }

            public void run() {
                x9.this.N();
            }
        }

        /* renamed from: x9$c$c  reason: collision with other inner class name */
        class C0143c implements Runnable {
            C0143c() {
            }

            public void run() {
                x9.this.B();
            }
        }

        c(jb jbVar) {
            this.e = jbVar;
        }

        public void run() {
            boolean z;
            try {
                fb unused = x9.this.o = (fb) x9.this.M().get(60, TimeUnit.SECONDS);
            } catch (ja | InterruptedException | ExecutionException | TimeoutException e2) {
                if (e2.getCause() instanceof ja) {
                    x9.this.Y();
                } else {
                    fb unused2 = x9.this.o = fb.d;
                }
            }
            try {
                z = ((Boolean) x9.this.q(this.e).get()).booleanValue();
            } catch (InterruptedException | ExecutionException e3) {
                e3.printStackTrace();
                z = false;
            }
            int a2 = x9.this.o.a();
            if (z) {
                try {
                    x9.this.D().get();
                    if (x9.this.k.a() && x9.this.o.c()) {
                        x9.this.X().get();
                    }
                } catch (InterruptedException | ExecutionException e4) {
                    e4.printStackTrace();
                }
                x9.this.f.b(yc.b, new a());
                x9.this.b.scheduleWithFixedDelay(new b(), 5, 10, TimeUnit.SECONDS);
                x9.this.b.scheduleWithFixedDelay(new C0143c(), 0, 5, TimeUnit.MINUTES);
                x9.this.k(new hb("$package_id", x9.this.l.b()));
                x9.this.k(new hb("$android_id", x9.this.l.f()));
                boolean unused3 = x9.this.p = true;
                return;
            }
            boolean unused4 = x9.this.p = false;
        }
    }

    public x9(String str, ac acVar, kb kbVar, ab<String> abVar, xa xaVar, ua uaVar, id idVar, String str2) {
        this.g = str;
        this.i = acVar;
        this.j = abVar;
        this.k = xaVar;
        this.l = uaVar;
        this.m = kbVar;
        this.n = idVar;
        this.h = str2;
        this.b = Executors.newSingleThreadScheduledExecutor();
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(1);
        this.d = newFixedThreadPool;
        this.c = new bd((ThreadPoolExecutor) newFixedThreadPool, 5000, 20, new a());
        this.e = Executors.newFixedThreadPool(1);
        this.f = new yc();
        this.s = new CopyOnWriteArrayList();
        this.a = c0();
        s(str);
    }

    /* access modifiers changed from: private */
    public void B() {
        this.e.submit(new hc(this.m, a0(), this.j, new b()));
    }

    /* access modifiers changed from: private */
    public Future<Boolean> D() {
        return this.e.submit(new fc(this.i, this.t, this.u));
    }

    private void H() {
        K();
        I();
    }

    private void I() {
        this.c.a(new rc(this.i));
    }

    private void K() {
        this.c.a(new vc(this.i));
    }

    /* access modifiers changed from: private */
    public Future<fb> M() {
        return this.e.submit(new gc(this.m, a0(), this.j));
    }

    /* access modifiers changed from: private */
    public void N() {
        if (this.s.size() > 0) {
            d0();
        }
        H();
        D();
    }

    /* access modifiers changed from: private */
    public Future<pc<Boolean>> P() {
        return this.e.submit(new tc(this.m, this.j, a0()));
    }

    /* access modifiers changed from: private */
    public Future<pc<Integer>> Q() {
        return this.e.submit(new qc(this.i, this.m, this.g, this.l, this.o));
    }

    /* access modifiers changed from: private */
    public Future<pc<Boolean>> S() {
        return this.e.submit(new sc(this.i, this.m, this.g));
    }

    /* access modifiers changed from: private */
    public Future<pc<Boolean>> U() {
        return this.e.submit(new wc(this.i, this.m));
    }

    /* access modifiers changed from: private */
    public Future<pc<Boolean>> X() {
        return this.e.submit(new xc(this.m, this.i, this.g, new qc(this.i, this.m, this.g, this.l, this.o)));
    }

    /* access modifiers changed from: private */
    public void Y() {
        this.c.b();
        this.e.shutdown();
        this.b.shutdown();
    }

    private void Z() {
        fb.b bVar = new fb.b(this.o);
        bVar.b(true);
        this.o = bVar.c();
        if (this.p) {
            H();
            U();
            S();
            Q();
        }
    }

    private eb a0() {
        eb.b bVar = new eb.b();
        bVar.n(this.l.a());
        bVar.i(this.l.o(this.h));
        bVar.g(this.l.k());
        bVar.j(this.l.q());
        bVar.o(this.l.r());
        bVar.f(this.l.c());
        bVar.h(this.l.n());
        bVar.m(this.l.j());
        bVar.k(this.l.p());
        bVar.e(this.l.l());
        bVar.a(this.l.d());
        bVar.b(this.g);
        bVar.l(String.valueOf(20200526));
        bVar.c(this.l.e());
        return bVar.d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0028, code lost:
        r1 = java.lang.Thread.currentThread().getStackTrace();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Map<java.lang.Integer, java.lang.String> b0() {
        /*
            r8 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 3
            r0.<init>(r1)
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = ""
            r0.put(r2, r3)
            r4 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r4, r3)
            r3 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.put(r3, r1)
            boolean r1 = r8.r
            if (r1 != 0) goto L_0x006f
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r1 = r1.getStackTrace()
            java.lang.StackTraceElement r5 = r8.d(r1)
            r6 = 6
            if (r5 != 0) goto L_0x003a
            int r7 = r1.length
            if (r7 < r6) goto L_0x006f
        L_0x003a:
            if (r5 != 0) goto L_0x003e
            r5 = r1[r6]
        L_0x003e:
            java.lang.String r1 = r5.getFileName()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r5.getClassName()
            r6.append(r7)
            java.lang.String r7 = "."
            r6.append(r7)
            java.lang.String r7 = r5.getMethodName()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r0.put(r2, r6)
            r0.put(r4, r1)
            int r1 = r5.getLineNumber()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.put(r3, r1)
        L_0x006f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x9.b0():java.util.Map");
    }

    private jb c(String str, long j2) {
        jb.a aVar = new jb.a();
        aVar.i(j2);
        aVar.d(new db(new cb(str), this.l.r(), this.l.c()));
        aVar.a(this.l.h());
        aVar.e(a0());
        aVar.c(this.l.s());
        aVar.f(this.l.n());
        aVar.b(this.l.i());
        aVar.j(this.l.q());
        aVar.k(this.l.m());
        aVar.l(this.l.p());
        aVar.o(this.l.g());
        aVar.p(this.l.j());
        aVar.g(new Date());
        aVar.n(sa.g(UUID.fromString(u())).toString());
        return aVar.h();
    }

    private String c0() {
        Class<x9> cls = x9.class;
        if (cls.getPackage() == null) {
            return null;
        }
        String[] split = cls.getPackage().getName().split(Pattern.quote("."));
        if (split.length <= 1) {
            return split[0];
        }
        return split[0] + "." + split[1];
    }

    private StackTraceElement d(StackTraceElement[] stackTraceElementArr) {
        if (this.a != null) {
            if (stackTraceElementArr.length > 4) {
                for (int i2 = 4; i2 < stackTraceElementArr.length; i2++) {
                    StackTraceElement stackTraceElement = stackTraceElementArr[i2];
                    if (!stackTraceElement.getClassName().startsWith(this.a)) {
                        return stackTraceElement;
                    }
                }
            }
        }
        return null;
    }

    private void d0() {
        for (Callable<?> a2 : this.s) {
            this.c.a(a2);
        }
        this.s.clear();
    }

    private UUID e(String str, String str2, String str3, String str4) {
        UUID a2 = ta.a(u());
        gb.b j2 = gb.j();
        j2.d(a2);
        j2.i(str);
        j2.g(str2);
        j2.k(str3);
        gb e2 = j2.e();
        n(new ec(this.i, new kc(this.i), e2, this.m, new jc(), this.u));
        l(ib.c.F, str4, a2.toString());
        return a2;
    }

    /* access modifiers changed from: private */
    public Callable<Boolean> g(ib ibVar) {
        return new ec(this.i, new lc(this.i), ibVar, this.m, new mc(), this.u);
    }

    private void l(ib.c cVar, String str, String str2) {
        n(g(p(cVar, str, str2)));
    }

    private void m(jb jbVar) {
        ThreadPoolExecutor.DiscardPolicy discardPolicy = new ThreadPoolExecutor.DiscardPolicy();
        ((ThreadPoolExecutor) this.e).setRejectedExecutionHandler(discardPolicy);
        ((ThreadPoolExecutor) this.d).setRejectedExecutionHandler(discardPolicy);
        this.b.execute(new c(jbVar));
    }

    private void n(Callable<?> callable) {
        if (this.p) {
            if (this.s.size() > 0) {
                d0();
            }
            this.c.a(callable);
            return;
        }
        this.s.add(callable);
        if (this.s.size() > 500) {
            this.s.clear();
        }
    }

    /* access modifiers changed from: private */
    public ib p(ib.c cVar, String str, String str2) {
        Map<Integer, String> b0 = b0();
        Date date = new Date(System.currentTimeMillis());
        String name = Thread.currentThread().getName();
        String valueOf = String.valueOf(Thread.currentThread().getId());
        ib.b bVar = new ib.b();
        bVar.h(str);
        bVar.i(str2);
        bVar.g(b0.get(0));
        bVar.d(date);
        bVar.b(this.u.getAndIncrement());
        bVar.c(b0.get(1));
        bVar.a(cVar.a());
        bVar.f(Integer.valueOf(b0.get(2)).intValue());
        bVar.k(name);
        bVar.j(valueOf);
        return bVar.e();
    }

    /* access modifiers changed from: private */
    public Future<Boolean> q(jb jbVar) {
        return this.c.a(new oc(this.i, jbVar));
    }

    private void s(String str) {
        m(c(str, System.currentTimeMillis()));
    }

    public UUID C(String str, String str2) {
        return e(str, str2, "user-feedback", "bf_issue");
    }

    public URL F(String str, String str2) {
        return this.n.b(C(str, str2).toString());
    }

    public void j(long j2) {
        if (j2 <= 0 || j2 > 52428800) {
            j2 = 52428800;
        }
        this.t = j2;
    }

    public <T> void k(hb<T> hbVar) {
        this.e.submit(new uc(this.j, hbVar));
        Date date = new Date();
        ib.b bVar = new ib.b();
        bVar.h("bf_key_value");
        bVar.i("Set device data \"" + hbVar.a() + "\"=\"" + hbVar.b() + "\"");
        bVar.g("");
        bVar.d(date);
        bVar.b(this.u.getAndIncrement());
        bVar.c("");
        bVar.a(ib.c.D.a());
        bVar.f(0);
        n(g(bVar.e()));
    }

    public void r() {
        if (this.k.a()) {
            Z();
        }
    }

    public String u() {
        return this.l.a();
    }

    public void x(String str, String str2) {
        l(ib.c.I, str, str2);
    }
}
