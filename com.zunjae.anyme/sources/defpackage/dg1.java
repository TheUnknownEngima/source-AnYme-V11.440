package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: dg1  reason: default package */
public class dg1 implements eg1 {
    private final Context a;
    /* access modifiers changed from: private */
    public final og1 b;
    /* access modifiers changed from: private */
    public final fg1 c;
    private final nc1 d;
    /* access modifiers changed from: private */
    public final ag1 e;
    /* access modifiers changed from: private */
    public final sg1 f;
    private final oc1 g;
    /* access modifiers changed from: private */
    public final AtomicReference<mg1> h = new AtomicReference<>();
    /* access modifiers changed from: private */
    public final AtomicReference<f81<jg1>> i = new AtomicReference<>(new f81());

    /* renamed from: dg1$a */
    class a implements d81<Void, Void> {
        a() {
        }

        /* renamed from: b */
        public e81<Void> a(Void voidR) {
            JSONObject a2 = dg1.this.f.a(dg1.this.b, true);
            if (a2 != null) {
                ng1 b = dg1.this.c.b(a2);
                dg1.this.e.c(b.d(), a2);
                dg1.this.q(a2, "Loaded settings: ");
                dg1 dg1 = dg1.this;
                boolean unused = dg1.r(dg1.b.f);
                dg1.this.h.set(b);
                ((f81) dg1.this.i.get()).e(b.c());
                f81 f81 = new f81();
                f81.e(b.c());
                dg1.this.i.set(f81);
            }
            return h81.e(null);
        }
    }

    dg1(Context context, og1 og1, nc1 nc1, fg1 fg1, ag1 ag1, sg1 sg1, oc1 oc1) {
        this.a = context;
        this.b = og1;
        this.d = nc1;
        this.c = fg1;
        this.e = ag1;
        this.f = sg1;
        this.g = oc1;
        this.h.set(bg1.e(nc1));
    }

    public static dg1 l(Context context, String str, tc1 tc1, xe1 xe1, String str2, String str3, String str4, oc1 oc1) {
        String e2 = tc1.e();
        dd1 dd1 = new dd1();
        fg1 fg1 = new fg1(dd1);
        ag1 ag1 = new ag1(context);
        String str5 = str4;
        rg1 rg1 = new rg1(str5, String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", new Object[]{str}), xe1);
        String f2 = tc1.f();
        String g2 = tc1.g();
        String h2 = tc1.h();
        String h3 = dc1.h(dc1.p(context), str, str3, str2);
        return new dg1(context, new og1(str, f2, g2, h2, tc1, h3, str3, str2, qc1.determineFrom(e2).getId()), dd1, fg1, ag1, rg1, oc1);
    }

    private ng1 m(cg1 cg1) {
        jb1 f2;
        String str;
        ng1 ng1 = null;
        try {
            if (cg1.SKIP_CACHE_LOOKUP.equals(cg1)) {
                return null;
            }
            JSONObject b2 = this.e.b();
            if (b2 != null) {
                ng1 b3 = this.c.b(b2);
                if (b3 != null) {
                    q(b2, "Loaded cached settings: ");
                    long a2 = this.d.a();
                    if (!cg1.IGNORE_CACHE_EXPIRATION.equals(cg1)) {
                        if (b3.e(a2)) {
                            f2 = jb1.f();
                            str = "Cached settings have expired.";
                        }
                    }
                    try {
                        jb1.f().b("Returning cached settings.");
                        return b3;
                    } catch (Exception e2) {
                        e = e2;
                        ng1 = b3;
                        jb1.f().e("Failed to get cached settings", e);
                        return ng1;
                    }
                } else {
                    jb1.f().e("Failed to parse cached settings data.", (Throwable) null);
                    return null;
                }
            } else {
                f2 = jb1.f();
                str = "No cached settings data found.";
            }
            f2.b(str);
            return null;
        } catch (Exception e3) {
            e = e3;
            jb1.f().e("Failed to get cached settings", e);
            return ng1;
        }
    }

    private String n() {
        return dc1.t(this.a).getString("existing_instance_identifier", "");
    }

    /* access modifiers changed from: private */
    public void q(JSONObject jSONObject, String str) {
        jb1 f2 = jb1.f();
        f2.b(str + jSONObject.toString());
    }

    /* access modifiers changed from: private */
    @SuppressLint({"CommitPrefEdits"})
    public boolean r(String str) {
        SharedPreferences.Editor edit = dc1.t(this.a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }

    public e81<jg1> a() {
        return this.i.get().a();
    }

    public mg1 b() {
        return this.h.get();
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return !n().equals(this.b.f);
    }

    public e81<Void> o(cg1 cg1, Executor executor) {
        ng1 m;
        if (k() || (m = m(cg1)) == null) {
            ng1 m2 = m(cg1.IGNORE_CACHE_EXPIRATION);
            if (m2 != null) {
                this.h.set(m2);
                this.i.get().e(m2.c());
            }
            return this.g.h().s(executor, new a());
        }
        this.h.set(m);
        this.i.get().e(m.c());
        return h81.e(null);
    }

    public e81<Void> p(Executor executor) {
        return o(cg1.USE_CACHE, executor);
    }
}
