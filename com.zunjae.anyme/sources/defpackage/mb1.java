package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.concurrent.Executor;

/* renamed from: mb1  reason: default package */
public class mb1 {
    private final xe1 a = new xe1();
    private final com.google.firebase.c b;
    private final Context c;
    private PackageManager d;
    private String e;
    private PackageInfo f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private tc1 l;
    private oc1 m;

    /* renamed from: mb1$a */
    class a implements d81<jg1, Void> {
        final /* synthetic */ String a;
        final /* synthetic */ dg1 b;
        final /* synthetic */ Executor c;

        a(String str, dg1 dg1, Executor executor) {
            this.a = str;
            this.b = dg1;
            this.c = executor;
        }

        /* renamed from: b */
        public e81<Void> a(jg1 jg1) {
            try {
                mb1.this.i(jg1, this.a, this.b, this.c, true);
                return null;
            } catch (Exception e) {
                jb1.f().e("Error performing auto configuration.", e);
                throw e;
            }
        }
    }

    /* renamed from: mb1$b */
    class b implements d81<Void, jg1> {
        final /* synthetic */ dg1 a;

        b(mb1 mb1, dg1 dg1) {
            this.a = dg1;
        }

        /* renamed from: b */
        public e81<jg1> a(Void voidR) {
            return this.a.a();
        }
    }

    /* renamed from: mb1$c */
    class c implements x71<Void, Object> {
        c(mb1 mb1) {
        }

        public Object a(e81<Void> e81) {
            if (e81.q()) {
                return null;
            }
            jb1.f().e("Error fetching settings.", e81.l());
            return null;
        }
    }

    public mb1(com.google.firebase.c cVar, Context context, tc1 tc1, oc1 oc1) {
        this.b = cVar;
        this.c = context;
        this.l = tc1;
        this.m = oc1;
    }

    private ig1 b(String str, String str2) {
        return new ig1(str, str2, e().d(), this.h, this.g, dc1.h(dc1.p(d()), str2, this.h, this.g), this.j, qc1.determineFrom(this.i).getId(), this.k, "0");
    }

    private tc1 e() {
        return this.l;
    }

    private static String g() {
        return ic1.i();
    }

    /* access modifiers changed from: private */
    public void i(jg1 jg1, String str, dg1 dg1, Executor executor, boolean z) {
        if ("new".equals(jg1.a)) {
            if (!j(jg1, str, z)) {
                jb1.f().e("Failed to create app with Crashlytics service.", (Throwable) null);
                return;
            }
        } else if (!"configured".equals(jg1.a)) {
            if (jg1.f) {
                jb1.f().b("Server says an update is required - forcing a full App update.");
                k(jg1, str, z);
                return;
            }
            return;
        }
        dg1.o(cg1.SKIP_CACHE_LOOKUP, executor);
    }

    private boolean j(jg1 jg1, String str, boolean z) {
        return new qg1(f(), jg1.b, this.a, g()).i(b(jg1.e, str), z);
    }

    private boolean k(jg1 jg1, String str, boolean z) {
        return new tg1(f(), jg1.b, this.a, g()).i(b(jg1.e, str), z);
    }

    public void c(Executor executor, dg1 dg1) {
        this.m.h().s(executor, new b(this, dg1)).s(executor, new a(this.b.j().c(), dg1, executor));
    }

    public Context d() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public String f() {
        return dc1.u(this.c, "com.crashlytics.ApiEndpoint");
    }

    public boolean h() {
        try {
            this.i = this.l.e();
            this.d = this.c.getPackageManager();
            String packageName = this.c.getPackageName();
            this.e = packageName;
            PackageInfo packageInfo = this.d.getPackageInfo(packageName, 0);
            this.f = packageInfo;
            this.g = Integer.toString(packageInfo.versionCode);
            this.h = this.f.versionName == null ? "0.0" : this.f.versionName;
            this.j = this.d.getApplicationLabel(this.c.getApplicationInfo()).toString();
            this.k = Integer.toString(this.c.getApplicationInfo().targetSdkVersion);
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            jb1.f().e("Failed init", e2);
            return false;
        }
    }

    public dg1 l(Context context, com.google.firebase.c cVar, Executor executor) {
        dg1 l2 = dg1.l(context, cVar.j().c(), this.l, this.a, this.g, this.h, f(), this.m);
        l2.p(executor).i(executor, new c(this));
        return l2;
    }
}
