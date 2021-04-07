package defpackage;

import android.content.Context;
import defpackage.of1;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ic1  reason: default package */
public class ic1 {
    private final Context a;
    private final com.google.firebase.c b;
    private final oc1 c;
    private final long d = System.currentTimeMillis();
    /* access modifiers changed from: private */
    public jc1 e;
    private jc1 f;
    /* access modifiers changed from: private */
    public gc1 g;
    private final tc1 h;
    private final ub1 i;
    private final nb1 j;
    private ExecutorService k;
    private ec1 l;
    private ib1 m;

    /* renamed from: ic1$a */
    class a implements Callable<e81<Void>> {
        final /* synthetic */ eg1 a;

        a(eg1 eg1) {
            this.a = eg1;
        }

        /* renamed from: a */
        public e81<Void> call() {
            return ic1.this.f(this.a);
        }
    }

    /* renamed from: ic1$b */
    class b implements Runnable {
        final /* synthetic */ eg1 e;

        b(eg1 eg1) {
            this.e = eg1;
        }

        public void run() {
            e81 unused = ic1.this.f(this.e);
        }
    }

    /* renamed from: ic1$c */
    class c implements Callable<Boolean> {
        c() {
        }

        /* renamed from: a */
        public Boolean call() {
            try {
                boolean d = ic1.this.e.d();
                jb1 f = jb1.f();
                f.b("Initialization marker file removed: " + d);
                return Boolean.valueOf(d);
            } catch (Exception e) {
                jb1.f().e("Problem encountered deleting Crashlytics initialization marker.", e);
                return Boolean.FALSE;
            }
        }
    }

    /* renamed from: ic1$d */
    class d implements Callable<Boolean> {
        d() {
        }

        /* renamed from: a */
        public Boolean call() {
            return Boolean.valueOf(ic1.this.g.H());
        }
    }

    public ic1(com.google.firebase.c cVar, tc1 tc1, ib1 ib1, oc1 oc1, ub1 ub1, nb1 nb1, ExecutorService executorService) {
        this.b = cVar;
        this.c = oc1;
        this.a = cVar.g();
        this.h = tc1;
        this.m = ib1;
        this.i = ub1;
        this.j = nb1;
        this.k = executorService;
        this.l = new ec1(executorService);
    }

    private void d() {
        try {
            Boolean.TRUE.equals((Boolean) gd1.a(this.l.h(new d())));
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public e81<Void> f(eg1 eg1) {
        n();
        this.g.B();
        try {
            this.i.a(hc1.b(this));
            mg1 b2 = eg1.b();
            if (!b2.a().a) {
                jb1.f().b("Collection of crash reports disabled in Crashlytics settings.");
                return h81.d(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.g.Q(b2.b().a)) {
                jb1.f().b("Could not finalize previous sessions.");
            }
            e81<Void> x0 = this.g.x0(1.0f, eg1.a());
            m();
            return x0;
        } catch (Exception e2) {
            jb1.f().e("Crashlytics encountered a problem during asynchronous initialization.", e2);
            return h81.d(e2);
        } finally {
            m();
        }
    }

    private void h(eg1 eg1) {
        String str;
        jb1 jb1;
        Future<?> submit = this.k.submit(new b(eg1));
        jb1.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4, TimeUnit.SECONDS);
            return;
        } catch (InterruptedException e2) {
            e = e2;
            jb1 = jb1.f();
            str = "Crashlytics was interrupted during initialization.";
        } catch (ExecutionException e3) {
            e = e3;
            jb1 = jb1.f();
            str = "Problem encountered during Crashlytics initialization.";
        } catch (TimeoutException e4) {
            e = e4;
            jb1 = jb1.f();
            str = "Crashlytics timed out during initialization.";
        }
        jb1.e(str, e);
    }

    public static String i() {
        return "17.2.1";
    }

    static boolean j(String str, boolean z) {
        if (z) {
            return !dc1.D(str);
        }
        jb1.f().b("Configured not to require a build ID.");
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return this.e.c();
    }

    public e81<Void> g(eg1 eg1) {
        return gd1.b(this.k, new a(eg1));
    }

    public void k(String str) {
        this.g.R0(System.currentTimeMillis() - this.d, str);
    }

    public void l(Throwable th) {
        this.g.I0(Thread.currentThread(), th);
    }

    /* access modifiers changed from: package-private */
    public void m() {
        this.l.h(new c());
    }

    /* access modifiers changed from: package-private */
    public void n() {
        this.l.b();
        this.e.a();
        jb1.f().b("Initialization marker file created.");
    }

    public boolean o(eg1 eg1) {
        String p = dc1.p(this.a);
        jb1 f2 = jb1.f();
        f2.b("Mapping file ID is: " + p);
        if (j(p, dc1.l(this.a, "com.crashlytics.RequireBuildId", true))) {
            String c2 = this.b.j().c();
            try {
                jb1 f3 = jb1.f();
                f3.g("Initializing Crashlytics " + i());
                hf1 hf1 = new hf1(this.a);
                this.f = new jc1("crash_marker", hf1);
                this.e = new jc1("initialization_marker", hf1);
                xe1 xe1 = new xe1();
                xb1 a2 = xb1.a(this.a, this.h, c2, p);
                zg1 zg1 = new zg1(this.a);
                jb1 f4 = jb1.f();
                f4.b("Installer package name is: " + a2.c);
                this.g = new gc1(this.a, this.l, xe1, this.h, this.c, hf1, this.f, a2, (nf1) null, (of1.b) null, this.m, zg1, this.j, eg1);
                boolean e2 = e();
                d();
                this.g.N(Thread.getDefaultUncaughtExceptionHandler(), eg1);
                if (!e2 || !dc1.c(this.a)) {
                    jb1.f().b("Exception handling initialization successful");
                    return true;
                }
                jb1.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                h(eg1);
                return false;
            } catch (Exception e3) {
                jb1.f().e("Crashlytics was not started due to an exception during initialization", e3);
                this.g = null;
                return false;
            }
        } else {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
        }
    }

    public void p(String str, String str2) {
        this.g.w0(str, str2);
    }
}
