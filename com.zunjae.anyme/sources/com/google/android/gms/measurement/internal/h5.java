package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

public class h5 implements c6 {
    private static volatile h5 H;
    private volatile Boolean A;
    private Boolean B;
    private Boolean C;
    private volatile boolean D;
    private int E;
    private AtomicInteger F = new AtomicInteger(0);
    final long G;
    private final Context a;
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;
    private final va f;
    private final wa g;
    private final p4 h;
    private final c4 i;
    private final a5 j;
    private final j9 k;
    private final fa l;
    private final a4 m;
    private final e n;
    private final t7 o;
    private final l6 p;
    private final a q;
    private final o7 r;
    private y3 s;
    private c8 t;
    private m u;
    private v3 v;
    private u4 w;
    private boolean x = false;
    private Boolean y;
    private long z;

    private h5(m6 m6Var) {
        String str;
        e4 e4Var;
        Bundle bundle;
        boolean z2 = false;
        r.j(m6Var);
        va vaVar = new va(m6Var.a);
        this.f = vaVar;
        s3.a = vaVar;
        this.a = m6Var.a;
        this.b = m6Var.b;
        this.c = m6Var.c;
        this.d = m6Var.d;
        this.e = m6Var.h;
        this.A = m6Var.e;
        this.D = true;
        sq0 sq0 = m6Var.g;
        if (!(sq0 == null || (bundle = sq0.k) == null)) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.B = (Boolean) obj;
            }
            Object obj2 = sq0.k.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.C = (Boolean) obj2;
            }
        }
        zt0.h(this.a);
        e d2 = h.d();
        this.n = d2;
        Long l2 = m6Var.i;
        this.G = l2 != null ? l2.longValue() : d2.c();
        this.g = new wa(this);
        p4 p4Var = new p4(this);
        p4Var.p();
        this.h = p4Var;
        c4 c4Var = new c4(this);
        c4Var.p();
        this.i = c4Var;
        fa faVar = new fa(this);
        faVar.p();
        this.l = faVar;
        a4 a4Var = new a4(this);
        a4Var.p();
        this.m = a4Var;
        this.q = new a(this);
        t7 t7Var = new t7(this);
        t7Var.x();
        this.o = t7Var;
        l6 l6Var = new l6(this);
        l6Var.x();
        this.p = l6Var;
        j9 j9Var = new j9(this);
        j9Var.x();
        this.k = j9Var;
        o7 o7Var = new o7(this);
        o7Var.p();
        this.r = o7Var;
        a5 a5Var = new a5(this);
        a5Var.p();
        this.j = a5Var;
        sq0 sq02 = m6Var.g;
        if (!(sq02 == null || sq02.f == 0)) {
            z2 = true;
        }
        boolean z3 = !z2;
        if (this.a.getApplicationContext() instanceof Application) {
            l6 F2 = F();
            if (F2.n().getApplicationContext() instanceof Application) {
                Application application = (Application) F2.n().getApplicationContext();
                if (F2.c == null) {
                    F2.c = new j7(F2, (q6) null);
                }
                if (z3) {
                    application.unregisterActivityLifecycleCallbacks(F2.c);
                    application.registerActivityLifecycleCallbacks(F2.c);
                    e4Var = F2.h().M();
                    str = "Registered activity lifecycle callback";
                }
            }
            this.j.y(new j5(this, m6Var));
        }
        e4Var = h().H();
        str = "Application context is not an Application";
        e4Var.a(str);
        this.j.y(new j5(this, m6Var));
    }

    public static h5 a(Context context, sq0 sq0, Long l2) {
        Bundle bundle;
        if (sq0 != null && (sq0.i == null || sq0.j == null)) {
            sq0 = new sq0(sq0.e, sq0.f, sq0.g, sq0.h, (String) null, (String) null, sq0.k);
        }
        r.j(context);
        r.j(context.getApplicationContext());
        if (H == null) {
            synchronized (h5.class) {
                if (H == null) {
                    H = new h5(new m6(context, sq0, l2));
                }
            }
        } else if (!(sq0 == null || (bundle = sq0.k) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            H.m(sq0.k.getBoolean("dataCollectionDefaultEnabled"));
        }
        return H;
    }

    private static void g(a6 a6Var) {
        if (a6Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* access modifiers changed from: private */
    public final void j(m6 m6Var) {
        e4 e4Var;
        String str;
        f().b();
        m mVar = new m(this);
        mVar.p();
        this.u = mVar;
        v3 v3Var = new v3(this, m6Var.f);
        v3Var.x();
        this.v = v3Var;
        y3 y3Var = new y3(this);
        y3Var.x();
        this.s = y3Var;
        c8 c8Var = new c8(this);
        c8Var.x();
        this.t = c8Var;
        this.l.q();
        this.h.q();
        this.w = new u4(this);
        this.v.y();
        h().K().b("App measurement initialized, version", 31049L);
        h().K().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String C2 = v3Var.C();
        if (TextUtils.isEmpty(this.b)) {
            if (G().D0(C2)) {
                e4Var = h().K();
                str = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                e4 K = h().K();
                String valueOf = String.valueOf(C2);
                e4 e4Var2 = K;
                str = valueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
                e4Var = e4Var2;
            }
            e4Var.a(str);
        }
        h().L().a("Debug-level message logging enabled");
        if (this.E != this.F.get()) {
            h().E().c("Not all components initialized", Integer.valueOf(this.E), Integer.valueOf(this.F.get()));
        }
        this.x = true;
    }

    private final o7 w() {
        z(this.r);
        return this.r;
    }

    private static void y(f5 f5Var) {
        if (f5Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!f5Var.v()) {
            String valueOf = String.valueOf(f5Var.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    private static void z(d6 d6Var) {
        if (d6Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!d6Var.s()) {
            String valueOf = String.valueOf(d6Var.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final void A(boolean z2) {
        f().b();
        this.D = z2;
    }

    public final c4 B() {
        c4 c4Var = this.i;
        if (c4Var == null || !c4Var.s()) {
            return null;
        }
        return this.i;
    }

    public final j9 C() {
        y(this.k);
        return this.k;
    }

    public final u4 D() {
        return this.w;
    }

    /* access modifiers changed from: package-private */
    public final a5 E() {
        return this.j;
    }

    public final l6 F() {
        y(this.p);
        return this.p;
    }

    public final fa G() {
        g(this.l);
        return this.l;
    }

    public final a4 H() {
        g(this.m);
        return this.m;
    }

    public final y3 I() {
        y(this.s);
        return this.s;
    }

    public final boolean J() {
        return TextUtils.isEmpty(this.b);
    }

    public final String K() {
        return this.b;
    }

    public final String L() {
        return this.c;
    }

    public final String M() {
        return this.d;
    }

    public final boolean N() {
        return this.e;
    }

    public final t7 O() {
        y(this.o);
        return this.o;
    }

    public final c8 P() {
        y(this.t);
        return this.t;
    }

    public final m Q() {
        z(this.u);
        return this.u;
    }

    public final v3 R() {
        y(this.v);
        return this.v;
    }

    public final a S() {
        a aVar = this.q;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public final boolean T() {
        return this.A != null && this.A.booleanValue();
    }

    public final wa b() {
        return this.g;
    }

    /* access modifiers changed from: protected */
    public final void c(sq0 sq0) {
        f().b();
        if (c31.a() && this.g.s(u.P0)) {
            e K = x().K();
            if (!(sq0 == null || sq0.k == null || !x().w(30))) {
                e j2 = e.j(sq0.k);
                if (!j2.equals(e.c)) {
                    F().J(j2, 30, this.G);
                    K = j2;
                }
            }
            F().I(K);
        }
        if (x().e.a() == 0) {
            x().e.b(this.n.c());
        }
        if (Long.valueOf(x().j.a()).longValue() == 0) {
            h().M().b("Persisting first open", Long.valueOf(this.G));
            x().j.b(this.G);
        }
        if (this.g.s(u.L0)) {
            F().n.c();
        }
        if (u()) {
            if (!TextUtils.isEmpty(R().D()) || !TextUtils.isEmpty(R().E())) {
                G();
                if (fa.j0(R().D(), x().E(), R().E(), x().F())) {
                    h().K().a("Rechecking which service to use due to a GMP App Id change");
                    x().H();
                    I().H();
                    this.t.b0();
                    this.t.Z();
                    x().j.b(this.G);
                    x().l.b((String) null);
                }
                x().A(R().D());
                x().C(R().E());
            }
            if (c31.a() && this.g.s(u.P0) && !x().K().q()) {
                x().l.b((String) null);
            }
            F().T(x().l.a());
            if (o31.a() && this.g.s(u.r0) && !G().N0() && !TextUtils.isEmpty(x().z.a())) {
                h().H().a("Remote config removed with active feature rollouts");
                x().z.b((String) null);
            }
            if (!TextUtils.isEmpty(R().D()) || !TextUtils.isEmpty(R().E())) {
                boolean p2 = p();
                if (!x().M() && !this.g.E()) {
                    x().B(!p2);
                }
                if (p2) {
                    F().k0();
                }
                C().d.a();
                P().R(new AtomicReference());
                if (t41.a() && this.g.s(u.H0)) {
                    P().E(x().C.a());
                }
            }
        } else if (p()) {
            if (!G().A0("android.permission.INTERNET")) {
                h().E().a("App is missing INTERNET permission");
            }
            if (!G().A0("android.permission.ACCESS_NETWORK_STATE")) {
                h().E().a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!v80.a(this.a).g() && !this.g.Q()) {
                if (!z4.b(this.a)) {
                    h().E().a("AppMeasurementReceiver not registered/enabled");
                }
                if (!fa.Y(this.a, false)) {
                    h().E().a("AppMeasurementService not registered/enabled");
                }
            }
            h().E().a("Uploading is not possible. App measurement disabled");
        }
        x().t.a(this.g.s(u.Z));
    }

    /* access modifiers changed from: package-private */
    public final void d(f5 f5Var) {
        this.E++;
    }

    public final a5 f() {
        z(this.j);
        return this.j;
    }

    public final c4 h() {
        z(this.i);
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public final void i(d6 d6Var) {
        this.E++;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void k(String str, int i2, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        boolean z2 = true;
        if (!((i2 == 200 || i2 == 204 || i2 == 304) && th == null)) {
            h().H().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), th);
            return;
        }
        x().x.a(true);
        if (bArr.length == 0) {
            h().L().a("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String optString = jSONObject.optString("deeplink", "");
            String optString2 = jSONObject.optString("gclid", "");
            double optDouble = jSONObject.optDouble("timestamp", Utils.DOUBLE_EPSILON);
            if (TextUtils.isEmpty(optString)) {
                h().L().a("Deferred Deep Link is empty.");
                return;
            }
            fa G2 = G();
            if (TextUtils.isEmpty(optString) || (queryIntentActivities = G2.n().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) == null || queryIntentActivities.isEmpty()) {
                z2 = false;
            }
            if (!z2) {
                h().H().c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gclid", optString2);
            bundle.putString("_cis", "ddp");
            this.p.X("auto", "_cmp", bundle);
            fa G3 = G();
            if (!TextUtils.isEmpty(optString) && G3.e0(optString, optDouble)) {
                G3.n().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
            }
        } catch (JSONException e2) {
            h().E().b("Failed to parse the Deferred Deep Link response. exception", e2);
        }
    }

    public final e l() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public final void m(boolean z2) {
        this.A = Boolean.valueOf(z2);
    }

    public final Context n() {
        return this.a;
    }

    public final va o() {
        return this.f;
    }

    public final boolean p() {
        return q() == 0;
    }

    public final int q() {
        f().b();
        if (this.g.E()) {
            return 1;
        }
        Boolean bool = this.C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (c31.a() && this.g.s(u.P0) && !r()) {
            return 8;
        }
        Boolean I = x().I();
        if (I != null) {
            return I.booleanValue() ? 0 : 3;
        }
        Boolean D2 = this.g.D("firebase_analytics_collection_enabled");
        if (D2 != null) {
            return D2.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.B;
        if (bool2 != null) {
            return bool2.booleanValue() ? 0 : 5;
        }
        if (g.d()) {
            return 6;
        }
        return (!this.g.s(u.T) || this.A == null || this.A.booleanValue()) ? 0 : 7;
    }

    public final boolean r() {
        f().b();
        return this.D;
    }

    /* access modifiers changed from: package-private */
    public final void s() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* access modifiers changed from: package-private */
    public final void t() {
        this.F.incrementAndGet();
    }

    /* access modifiers changed from: protected */
    public final boolean u() {
        if (this.x) {
            f().b();
            Boolean bool = this.y;
            if (bool == null || this.z == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.n.a() - this.z) > 1000)) {
                this.z = this.n.a();
                boolean z2 = true;
                Boolean valueOf = Boolean.valueOf(G().A0("android.permission.INTERNET") && G().A0("android.permission.ACCESS_NETWORK_STATE") && (v80.a(this.a).g() || this.g.Q() || (z4.b(this.a) && fa.Y(this.a, false))));
                this.y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!G().i0(R().D(), R().E(), R().F()) && TextUtils.isEmpty(R().E())) {
                        z2 = false;
                    }
                    this.y = Boolean.valueOf(z2);
                }
            }
            return this.y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    public final void v() {
        f().b();
        z(w());
        String C2 = R().C();
        Pair<String, Boolean> t2 = x().t(C2);
        if (!this.g.F().booleanValue() || ((Boolean) t2.second).booleanValue() || TextUtils.isEmpty((CharSequence) t2.first)) {
            h().L().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
        } else if (!w().w()) {
            h().H().a("Network is not available for Deferred Deep Link request. Skipping");
        } else {
            fa G2 = G();
            R();
            URL I = G2.I(31049, C2, (String) t2.first, x().y.a() - 1);
            o7 w2 = w();
            g5 g5Var = new g5(this);
            w2.b();
            w2.m();
            r.j(I);
            r.j(g5Var);
            w2.f().E(new q7(w2, C2, I, (byte[]) null, (Map<String, String>) null, g5Var));
        }
    }

    public final p4 x() {
        g(this.h);
        return this.h;
    }
}
