package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class l6 extends f5 {
    protected j7 c;
    private k6 d;
    private final Set<j6> e = new CopyOnWriteArraySet();
    private boolean f;
    private final AtomicReference<String> g = new AtomicReference<>();
    private final Object h = new Object();
    private e i = new e((Boolean) null, (Boolean) null);
    private int j = 100;
    private final AtomicLong k = new AtomicLong(0);
    private long l = -1;
    private int m = 100;
    final na n;
    private boolean o = true;

    protected l6(h5 h5Var) {
        super(h5Var);
        this.n = new na(h5Var);
    }

    /* access modifiers changed from: private */
    public final void K(e eVar, int i2, long j2, boolean z, boolean z2) {
        b();
        w();
        if (j2 <= this.l && e.g(this.m, i2)) {
            h().K().b("Dropped out-of-date consent setting, proposed settings", eVar);
        } else if (i().y(eVar, i2)) {
            this.l = j2;
            this.m = i2;
            r().U(z);
            if (z2) {
                r().R(new AtomicReference());
            }
        } else {
            h().K().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i2));
        }
    }

    /* access modifiers changed from: private */
    public final void S(Boolean bool, boolean z) {
        b();
        w();
        h().L().b("Setting app measurement enabled (FE)", bool);
        i().u(bool);
        if (c31.a() && j().s(u.P0) && z) {
            i().z(bool);
        }
        if (!c31.a() || !j().s(u.P0) || this.a.r() || !bool.booleanValue()) {
            o0();
        }
    }

    private final void W(String str, String str2, long j2, Object obj) {
        f().y(new t6(this, str, str2, obj, j2));
    }

    /* access modifiers changed from: private */
    public final void o0() {
        b();
        String a = i().s.a();
        if (a != null) {
            if ("unset".equals(a)) {
                Z("app", "_npa", (Object) null, l().c());
            } else {
                Z("app", "_npa", Long.valueOf("true".equals(a) ? 1 : 0), l().c());
            }
        }
        if (!this.a.p() || !this.o) {
            h().L().a("Updating Scion state (FE)");
            r().W();
            return;
        }
        h().L().a("Recording app launch after enabling measurement for the first time (FE)");
        k0();
        if (g41.a() && j().s(u.s0)) {
            u().d.a();
        }
        if (u31.a() && j().s(u.v0)) {
            if (!(this.a.D().a.x().k.a() > 0)) {
                u4 D = this.a.D();
                D.b(D.a.n().getPackageName());
            }
        }
        if (j().s(u.L0)) {
            f().y(new p6(this));
        }
    }

    private final ArrayList<Bundle> p0(String str, String str2, String str3) {
        if (f().H()) {
            h().E().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        } else if (va.a()) {
            h().E().a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.a.f().u(atomicReference, 5000, "get conditional user properties", new b7(this, atomicReference, str, str2, str3));
            List list = (List) atomicReference.get();
            if (list != null) {
                return fa.s0(list);
            }
            h().E().b("Timed out waiting for get conditional user properties", str);
            return new ArrayList<>();
        }
    }

    private final Map<String, Object> q0(String str, String str2, String str3, boolean z) {
        e4 E;
        String str4;
        if (f().H()) {
            E = h().E();
            str4 = "Cannot get user properties from analytics worker thread";
        } else if (va.a()) {
            E = h().E();
            str4 = "Cannot get user properties from main thread";
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.a.f().u(atomicReference, 5000, "get user properties", new a7(this, atomicReference, str, str2, str3, z));
            List<ea> list = (List) atomicReference.get();
            if (list == null) {
                h().E().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
                return Collections.emptyMap();
            }
            b0 b0Var = new b0(list.size());
            for (ea eaVar : list) {
                b0Var.put(eaVar.f, eaVar.i());
            }
            return b0Var;
        }
        E.a(str4);
        return Collections.emptyMap();
    }

    private final void s0(Bundle bundle, long j2) {
        Class<Long> cls = Long.class;
        Class<String> cls2 = String.class;
        r.j(bundle);
        f6.a(bundle, "app_id", cls2, null);
        f6.a(bundle, "origin", cls2, null);
        f6.a(bundle, "name", cls2, null);
        f6.a(bundle, "value", Object.class, null);
        f6.a(bundle, "trigger_event_name", cls2, null);
        f6.a(bundle, "trigger_timeout", cls, 0L);
        f6.a(bundle, "timed_out_event_name", cls2, null);
        f6.a(bundle, "timed_out_event_params", Bundle.class, null);
        f6.a(bundle, "triggered_event_name", cls2, null);
        f6.a(bundle, "triggered_event_params", Bundle.class, null);
        f6.a(bundle, "time_to_live", cls, 0L);
        f6.a(bundle, "expired_event_name", cls2, null);
        f6.a(bundle, "expired_event_params", Bundle.class, null);
        r.f(bundle.getString("name"));
        r.f(bundle.getString("origin"));
        r.j(bundle.get("value"));
        bundle.putLong("creation_timestamp", j2);
        String string = bundle.getString("name");
        Object obj = bundle.get("value");
        if (g().p0(string) != 0) {
            h().E().b("Invalid conditional user property name", d().z(string));
        } else if (g().q0(string, obj) != 0) {
            h().E().c("Invalid conditional user property value", d().z(string), obj);
        } else {
            Object y0 = g().y0(string, obj);
            if (y0 == null) {
                h().E().c("Unable to normalize conditional user property value", d().z(string), obj);
                return;
            }
            f6.b(bundle, y0);
            long j3 = bundle.getLong("trigger_timeout");
            if (TextUtils.isEmpty(bundle.getString("trigger_event_name")) || (j3 <= 15552000000L && j3 >= 1)) {
                long j4 = bundle.getLong("time_to_live");
                if (j4 > 15552000000L || j4 < 1) {
                    h().E().c("Invalid conditional user property time to live", d().z(string), Long.valueOf(j4));
                } else {
                    f().y(new w6(this, bundle));
                }
            } else {
                h().E().c("Invalid conditional user property timeout", d().z(string), Long.valueOf(j3));
            }
        }
    }

    private final void w0(String str, String str2, String str3, Bundle bundle) {
        long c2 = l().c();
        r.f(str2);
        Bundle bundle2 = new Bundle();
        if (str != null) {
            bundle2.putString("app_id", str);
        }
        bundle2.putString("name", str2);
        bundle2.putLong("creation_timestamp", c2);
        if (str3 != null) {
            bundle2.putString("expired_event_name", str3);
            bundle2.putBundle("expired_event_params", bundle);
        }
        f().y(new y6(this, bundle2));
    }

    /* access modifiers changed from: private */
    public final void x0(Bundle bundle) {
        Bundle bundle2 = bundle;
        b();
        w();
        r.j(bundle);
        r.f(bundle2.getString("name"));
        r.f(bundle2.getString("origin"));
        r.j(bundle2.get("value"));
        if (!this.a.p()) {
            h().M().a("Conditional property not set since app measurement is disabled");
            return;
        }
        try {
            r().P(new ua(bundle2.getString("app_id"), bundle2.getString("origin"), new ea(bundle2.getString("name"), bundle2.getLong("triggered_timestamp"), bundle2.get("value"), bundle2.getString("origin")), bundle2.getLong("creation_timestamp"), false, bundle2.getString("trigger_event_name"), g().E(bundle2.getString("app_id"), bundle2.getString("timed_out_event_name"), bundle2.getBundle("timed_out_event_params"), bundle2.getString("origin"), 0, true, false, j21.a() && j().s(u.S0)), bundle2.getLong("trigger_timeout"), g().E(bundle2.getString("app_id"), bundle2.getString("triggered_event_name"), bundle2.getBundle("triggered_event_params"), bundle2.getString("origin"), 0, true, false, j21.a() && j().s(u.S0)), bundle2.getLong("time_to_live"), g().E(bundle2.getString("app_id"), bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), bundle2.getString("origin"), 0, true, false, j21.a() && j().s(u.S0))));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* access modifiers changed from: private */
    public final void z0(Bundle bundle) {
        Bundle bundle2 = bundle;
        b();
        w();
        r.j(bundle);
        r.f(bundle2.getString("name"));
        if (!this.a.p()) {
            h().M().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        ea eaVar = new ea(bundle2.getString("name"), 0, (Object) null, (String) null);
        try {
            r().P(new ua(bundle2.getString("app_id"), bundle2.getString("origin"), eaVar, bundle2.getLong("creation_timestamp"), bundle2.getBoolean("active"), bundle2.getString("trigger_event_name"), (s) null, bundle2.getLong("trigger_timeout"), (s) null, bundle2.getLong("time_to_live"), g().E(bundle2.getString("app_id"), bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), bundle2.getString("origin"), bundle2.getLong("creation_timestamp"), true, false, j21.a() && j().s(u.S0))));
        } catch (IllegalArgumentException unused) {
        }
    }

    public final ArrayList<Bundle> B(String str, String str2) {
        return p0((String) null, str, str2);
    }

    public final ArrayList<Bundle> C(String str, String str2, String str3) {
        r.f(str);
        k();
        throw null;
    }

    public final Map<String, Object> D(String str, String str2, String str3, boolean z) {
        r.f(str);
        k();
        throw null;
    }

    public final Map<String, Object> E(String str, String str2, boolean z) {
        return q0((String) null, str, str2, z);
    }

    /* access modifiers changed from: package-private */
    public final void F(long j2, boolean z) {
        b();
        w();
        h().L().a("Resetting analytics data (FE)");
        j9 u = u();
        u.b();
        u.e.a();
        boolean p = this.a.p();
        p4 i2 = i();
        i2.j.b(j2);
        if (!TextUtils.isEmpty(i2.i().z.a())) {
            i2.z.b((String) null);
        }
        if (g41.a() && i2.j().s(u.s0)) {
            i2.u.b(0);
        }
        if (!i2.j().E()) {
            i2.B(!p);
        }
        i2.A.b((String) null);
        i2.B.b(0);
        i2.C.b((Bundle) null);
        if (z) {
            r().X();
        }
        if (g41.a() && j().s(u.s0)) {
            u().d.a();
        }
        this.o = !p;
    }

    public final void G(Bundle bundle) {
        H(bundle, l().c());
    }

    public final void H(Bundle bundle, long j2) {
        r.j(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            h().H().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        s0(bundle2, j2);
    }

    /* access modifiers changed from: package-private */
    public final void I(e eVar) {
        b();
        boolean z = (eVar.q() && eVar.o()) || r().d0();
        if (z != this.a.r()) {
            this.a.A(z);
            Boolean J = i().J();
            if (!z || J == null || J.booleanValue()) {
                S(Boolean.valueOf(z), false);
            }
        }
    }

    public final void J(e eVar, int i2, long j2) {
        boolean z;
        boolean z2;
        boolean z3;
        e eVar2 = eVar;
        if (c31.a() && j().s(u.P0)) {
            w();
            if (eVar.l() == null && eVar.p() == null) {
                h().J().a("Discarding empty consent settings");
                return;
            }
            synchronized (this.h) {
                int i3 = i2;
                z = true;
                z2 = false;
                if (e.g(i2, this.j)) {
                    boolean h2 = eVar.h(this.i);
                    if (eVar.q() && !this.i.q()) {
                        z2 = true;
                    }
                    eVar2 = eVar.n(this.i);
                    this.i = eVar2;
                    z3 = z2;
                    z2 = h2;
                } else {
                    z = false;
                    z3 = false;
                }
            }
            if (!z) {
                h().K().b("Ignoring lower-priority consent settings, proposed settings", eVar2);
                return;
            }
            long andIncrement = this.k.getAndIncrement();
            if (z2) {
                T((String) null);
                f().B(new i7(this, eVar2, j2, i2, andIncrement, z3));
                return;
            }
            f().y(new h7(this, eVar2, i2, andIncrement, z3));
        }
    }

    public final void L(j6 j6Var) {
        w();
        r.j(j6Var);
        if (!this.e.add(j6Var)) {
            h().H().a("OnEventListener already registered");
        }
    }

    public final void M(k6 k6Var) {
        k6 k6Var2;
        b();
        w();
        if (!(k6Var == null || k6Var == (k6Var2 = this.d))) {
            r.n(k6Var2 == null, "EventInterceptor already set.");
        }
        this.d = k6Var;
    }

    public final void R(Boolean bool) {
        w();
        f().y(new e7(this, bool));
    }

    /* access modifiers changed from: package-private */
    public final void T(String str) {
        this.g.set(str);
    }

    /* access modifiers changed from: package-private */
    public final void U(String str, String str2, long j2, Bundle bundle) {
        b();
        V(str, str2, j2, bundle, true, this.d == null || fa.C0(str2), false, (String) null);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03e9  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0403  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0435  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0519  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0591  */
    /* JADX WARNING: Removed duplicated region for block: B:223:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0152  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void V(java.lang.String r28, java.lang.String r29, long r30, android.os.Bundle r32, boolean r33, boolean r34, boolean r35, java.lang.String r36) {
        /*
            r27 = this;
            r7 = r27
            r8 = r28
            r15 = r29
            r13 = r30
            r12 = r32
            java.lang.String r0 = "com.google.android.gms.tagmanager.TagManagerService"
            com.google.android.gms.common.internal.r.f(r28)
            com.google.android.gms.common.internal.r.j(r32)
            r27.b()
            r27.w()
            com.google.android.gms.measurement.internal.h5 r1 = r7.a
            boolean r1 = r1.p()
            if (r1 != 0) goto L_0x002e
            com.google.android.gms.measurement.internal.c4 r0 = r27.h()
            com.google.android.gms.measurement.internal.e4 r0 = r0.L()
            java.lang.String r1 = "Event not sent since app measurement is disabled"
            r0.a(r1)
            return
        L_0x002e:
            com.google.android.gms.measurement.internal.v3 r1 = r27.q()
            java.util.List r1 = r1.I()
            if (r1 == 0) goto L_0x004c
            boolean r1 = r1.contains(r15)
            if (r1 != 0) goto L_0x004c
            com.google.android.gms.measurement.internal.c4 r0 = r27.h()
            com.google.android.gms.measurement.internal.e4 r0 = r0.L()
            java.lang.String r1 = "Dropping non-safelisted event. event name, origin"
            r0.c(r1, r15, r8)
            return
        L_0x004c:
            boolean r1 = r7.f
            r11 = 0
            r10 = 0
            r9 = 1
            if (r1 != 0) goto L_0x00a2
            r7.f = r9
            com.google.android.gms.measurement.internal.h5 r1 = r7.a     // Catch:{ ClassNotFoundException -> 0x0095 }
            boolean r1 = r1.N()     // Catch:{ ClassNotFoundException -> 0x0095 }
            if (r1 != 0) goto L_0x006a
            android.content.Context r1 = r27.n()     // Catch:{ ClassNotFoundException -> 0x0095 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0095 }
            java.lang.Class r0 = java.lang.Class.forName(r0, r9, r1)     // Catch:{ ClassNotFoundException -> 0x0095 }
            goto L_0x006e
        L_0x006a:
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0095 }
        L_0x006e:
            java.lang.String r1 = "initialize"
            java.lang.Class[] r2 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x0086 }
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r10] = r3     // Catch:{ Exception -> 0x0086 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch:{ Exception -> 0x0086 }
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0086 }
            android.content.Context r2 = r27.n()     // Catch:{ Exception -> 0x0086 }
            r1[r10] = r2     // Catch:{ Exception -> 0x0086 }
            r0.invoke(r11, r1)     // Catch:{ Exception -> 0x0086 }
            goto L_0x00a2
        L_0x0086:
            r0 = move-exception
            com.google.android.gms.measurement.internal.c4 r1 = r27.h()     // Catch:{ ClassNotFoundException -> 0x0095 }
            com.google.android.gms.measurement.internal.e4 r1 = r1.H()     // Catch:{ ClassNotFoundException -> 0x0095 }
            java.lang.String r2 = "Failed to invoke Tag Manager's initialize() method"
            r1.b(r2, r0)     // Catch:{ ClassNotFoundException -> 0x0095 }
            goto L_0x00a2
        L_0x0095:
            com.google.android.gms.measurement.internal.c4 r0 = r27.h()
            com.google.android.gms.measurement.internal.e4 r0 = r0.K()
            java.lang.String r1 = "Tag Manager is not found and thus will not be used"
            r0.a(r1)
        L_0x00a2:
            com.google.android.gms.measurement.internal.wa r0 = r27.j()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.u.f0
            boolean r0 = r0.s(r1)
            if (r0 == 0) goto L_0x00d3
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x00d3
            java.lang.String r0 = "gclid"
            boolean r1 = r12.containsKey(r0)
            if (r1 == 0) goto L_0x00d3
            java.lang.String r4 = r12.getString(r0)
            com.google.android.gms.common.util.e r0 = r27.l()
            long r5 = r0.c()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_lgclid"
            r1 = r27
            r1.Z(r2, r3, r4, r5)
        L_0x00d3:
            boolean r0 = defpackage.t41.a()
            if (r0 == 0) goto L_0x00fe
            com.google.android.gms.measurement.internal.wa r0 = r27.j()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.u.H0
            boolean r0 = r0.s(r1)
            if (r0 == 0) goto L_0x00fe
            if (r33 == 0) goto L_0x00fe
            boolean r0 = com.google.android.gms.measurement.internal.fa.F0(r29)
            if (r0 == 0) goto L_0x00fe
            com.google.android.gms.measurement.internal.fa r0 = r27.g()
            com.google.android.gms.measurement.internal.p4 r1 = r27.i()
            com.google.android.gms.measurement.internal.q4 r1 = r1.C
            android.os.Bundle r1 = r1.a()
            r0.M(r12, r1)
        L_0x00fe:
            r0 = 40
            if (r35 == 0) goto L_0x0182
            java.lang.String r1 = "_iap"
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x0182
            com.google.android.gms.measurement.internal.h5 r1 = r7.a
            com.google.android.gms.measurement.internal.fa r1 = r1.G()
            boolean r2 = defpackage.j21.a()
            if (r2 == 0) goto L_0x0124
            com.google.android.gms.measurement.internal.wa r2 = r27.j()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.u.S0
            boolean r2 = r2.s(r3)
            if (r2 == 0) goto L_0x0124
            r2 = 1
            goto L_0x0125
        L_0x0124:
            r2 = 0
        L_0x0125:
            java.lang.String r3 = "event"
            boolean r4 = r1.g0(r3, r15)
            r5 = 13
            r6 = 2
            if (r4 != 0) goto L_0x0132
        L_0x0130:
            r5 = 2
            goto L_0x0150
        L_0x0132:
            if (r2 == 0) goto L_0x013f
            java.lang.String[] r2 = com.google.android.gms.measurement.internal.e6.a
            java.lang.String[] r4 = com.google.android.gms.measurement.internal.e6.b
            boolean r2 = r1.m0(r3, r2, r4, r15)
            if (r2 != 0) goto L_0x0148
            goto L_0x0150
        L_0x013f:
            java.lang.String[] r2 = com.google.android.gms.measurement.internal.e6.a
            boolean r2 = r1.l0(r3, r2, r15)
            if (r2 != 0) goto L_0x0148
            goto L_0x0150
        L_0x0148:
            boolean r1 = r1.f0(r3, r0, r15)
            if (r1 != 0) goto L_0x014f
            goto L_0x0130
        L_0x014f:
            r5 = 0
        L_0x0150:
            if (r5 == 0) goto L_0x0182
            com.google.android.gms.measurement.internal.c4 r1 = r27.h()
            com.google.android.gms.measurement.internal.e4 r1 = r1.G()
            com.google.android.gms.measurement.internal.a4 r2 = r27.d()
            java.lang.String r2 = r2.v(r15)
            java.lang.String r3 = "Invalid public event name. Event will not be logged (FE)"
            r1.b(r3, r2)
            com.google.android.gms.measurement.internal.h5 r1 = r7.a
            r1.G()
            java.lang.String r0 = com.google.android.gms.measurement.internal.fa.H(r15, r0, r9)
            if (r15 == 0) goto L_0x0176
            int r10 = r29.length()
        L_0x0176:
            com.google.android.gms.measurement.internal.h5 r1 = r7.a
            com.google.android.gms.measurement.internal.fa r1 = r1.G()
            java.lang.String r2 = "_ev"
            r1.J(r5, r2, r0, r10)
            return
        L_0x0182:
            com.google.android.gms.measurement.internal.t7 r1 = r27.s()
            com.google.android.gms.measurement.internal.u7 r1 = r1.D(r10)
            java.lang.String r2 = "_sc"
            if (r1 == 0) goto L_0x0196
            boolean r3 = r12.containsKey(r2)
            if (r3 != 0) goto L_0x0196
            r1.d = r9
        L_0x0196:
            if (r33 == 0) goto L_0x019c
            if (r35 == 0) goto L_0x019c
            r3 = 1
            goto L_0x019d
        L_0x019c:
            r3 = 0
        L_0x019d:
            com.google.android.gms.measurement.internal.t7.O(r1, r12, r3)
            java.lang.String r3 = "am"
            boolean r16 = r3.equals(r8)
            boolean r3 = com.google.android.gms.measurement.internal.fa.C0(r29)
            if (r33 == 0) goto L_0x01df
            com.google.android.gms.measurement.internal.k6 r4 = r7.d
            if (r4 == 0) goto L_0x01df
            if (r3 != 0) goto L_0x01df
            if (r16 != 0) goto L_0x01df
            com.google.android.gms.measurement.internal.c4 r0 = r27.h()
            com.google.android.gms.measurement.internal.e4 r0 = r0.L()
            com.google.android.gms.measurement.internal.a4 r1 = r27.d()
            java.lang.String r1 = r1.v(r15)
            com.google.android.gms.measurement.internal.a4 r2 = r27.d()
            java.lang.String r2 = r2.t(r12)
            java.lang.String r3 = "Passing event to registered event handler (FE)"
            r0.c(r3, r1, r2)
            com.google.android.gms.measurement.internal.k6 r1 = r7.d
            r2 = r28
            r3 = r29
            r4 = r32
            r5 = r30
            r1.a(r2, r3, r4, r5)
            return
        L_0x01df:
            com.google.android.gms.measurement.internal.h5 r3 = r7.a
            boolean r3 = r3.u()
            if (r3 != 0) goto L_0x01e8
            return
        L_0x01e8:
            com.google.android.gms.measurement.internal.fa r3 = r27.g()
            boolean r4 = defpackage.j21.a()
            if (r4 == 0) goto L_0x0200
            com.google.android.gms.measurement.internal.wa r4 = r27.j()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.u.S0
            boolean r4 = r4.s(r5)
            if (r4 == 0) goto L_0x0200
            r4 = 1
            goto L_0x0201
        L_0x0200:
            r4 = 0
        L_0x0201:
            int r3 = r3.v(r15, r4)
            if (r3 == 0) goto L_0x0241
            com.google.android.gms.measurement.internal.c4 r1 = r27.h()
            com.google.android.gms.measurement.internal.e4 r1 = r1.G()
            com.google.android.gms.measurement.internal.a4 r2 = r27.d()
            java.lang.String r2 = r2.v(r15)
            java.lang.String r4 = "Invalid event name. Event will not be logged (FE)"
            r1.b(r4, r2)
            r27.g()
            java.lang.String r0 = com.google.android.gms.measurement.internal.fa.H(r15, r0, r9)
            if (r15 == 0) goto L_0x0229
            int r10 = r29.length()
        L_0x0229:
            com.google.android.gms.measurement.internal.h5 r1 = r7.a
            com.google.android.gms.measurement.internal.fa r1 = r1.G()
            java.lang.String r2 = "_ev"
            r28 = r1
            r29 = r36
            r30 = r3
            r31 = r2
            r32 = r0
            r33 = r10
            r28.W(r29, r30, r31, r32, r33)
            return
        L_0x0241:
            java.lang.String r0 = "_o"
            java.lang.String r3 = "_sn"
            java.lang.String r4 = "_si"
            java.lang.String[] r5 = new java.lang.String[]{r0, r3, r2, r4}
            java.util.List r17 = com.google.android.gms.common.util.f.c(r5)
            com.google.android.gms.measurement.internal.fa r5 = r27.g()
            r6 = 1
            r9 = r5
            r5 = 0
            r10 = r36
            r19 = r11
            r11 = r29
            r12 = r32
            r13 = r17
            r14 = r35
            r15 = r6
            android.os.Bundle r15 = r9.C(r10, r11, r12, r13, r14, r15)
            if (r15 == 0) goto L_0x0290
            boolean r6 = r15.containsKey(r2)
            if (r6 == 0) goto L_0x0290
            boolean r6 = r15.containsKey(r4)
            if (r6 != 0) goto L_0x0276
            goto L_0x0290
        L_0x0276:
            java.lang.String r3 = r15.getString(r3)
            java.lang.String r2 = r15.getString(r2)
            long r9 = r15.getLong(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            com.google.android.gms.measurement.internal.u7 r11 = new com.google.android.gms.measurement.internal.u7
            long r9 = r4.longValue()
            r11.<init>(r3, r2, r9)
            goto L_0x0292
        L_0x0290:
            r11 = r19
        L_0x0292:
            if (r11 != 0) goto L_0x0296
            r14 = r1
            goto L_0x0297
        L_0x0296:
            r14 = r11
        L_0x0297:
            com.google.android.gms.measurement.internal.wa r1 = r27.j()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.u.U
            boolean r1 = r1.s(r2)
            java.lang.String r13 = "_ae"
            r9 = 0
            if (r1 == 0) goto L_0x02cf
            com.google.android.gms.measurement.internal.t7 r1 = r27.s()
            com.google.android.gms.measurement.internal.u7 r1 = r1.D(r5)
            if (r1 == 0) goto L_0x02cf
            r12 = r29
            boolean r1 = r13.equals(r12)
            if (r1 == 0) goto L_0x02d1
            com.google.android.gms.measurement.internal.j9 r1 = r27.u()
            com.google.android.gms.measurement.internal.p9 r1 = r1.e
            long r1 = r1.e()
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x02d1
            com.google.android.gms.measurement.internal.fa r3 = r27.g()
            r3.L(r15, r1)
            goto L_0x02d1
        L_0x02cf:
            r12 = r29
        L_0x02d1:
            boolean r1 = defpackage.o31.a()
            if (r1 == 0) goto L_0x0353
            com.google.android.gms.measurement.internal.wa r1 = r27.j()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.u.r0
            boolean r1 = r1.s(r2)
            if (r1 == 0) goto L_0x0353
            java.lang.String r1 = "auto"
            boolean r1 = r1.equals(r8)
            java.lang.String r2 = "_ffr"
            if (r1 != 0) goto L_0x0336
            java.lang.String r1 = "_ssr"
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x0336
            com.google.android.gms.measurement.internal.fa r1 = r27.g()
            java.lang.String r2 = r15.getString(r2)
            boolean r3 = com.google.android.gms.common.util.o.a(r2)
            if (r3 == 0) goto L_0x0306
            r11 = r19
            goto L_0x030a
        L_0x0306:
            java.lang.String r11 = r2.trim()
        L_0x030a:
            com.google.android.gms.measurement.internal.p4 r2 = r1.i()
            com.google.android.gms.measurement.internal.v4 r2 = r2.z
            java.lang.String r2 = r2.a()
            boolean r2 = com.google.android.gms.measurement.internal.fa.B0(r11, r2)
            if (r2 == 0) goto L_0x0329
            com.google.android.gms.measurement.internal.c4 r1 = r1.h()
            com.google.android.gms.measurement.internal.e4 r1 = r1.L()
            java.lang.String r2 = "Not logging duplicate session_start_with_rollout event"
            r1.a(r2)
            r1 = 0
            goto L_0x0333
        L_0x0329:
            com.google.android.gms.measurement.internal.p4 r1 = r1.i()
            com.google.android.gms.measurement.internal.v4 r1 = r1.z
            r1.b(r11)
            r1 = 1
        L_0x0333:
            if (r1 != 0) goto L_0x0353
            return
        L_0x0336:
            boolean r1 = r13.equals(r12)
            if (r1 == 0) goto L_0x0353
            com.google.android.gms.measurement.internal.fa r1 = r27.g()
            com.google.android.gms.measurement.internal.p4 r1 = r1.i()
            com.google.android.gms.measurement.internal.v4 r1 = r1.z
            java.lang.String r1 = r1.a()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x0353
            r15.putString(r2, r1)
        L_0x0353:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r11.add(r15)
            com.google.android.gms.measurement.internal.fa r1 = r27.g()
            java.security.SecureRandom r1 = r1.H0()
            long r3 = r1.nextLong()
            com.google.android.gms.measurement.internal.p4 r1 = r27.i()
            com.google.android.gms.measurement.internal.t4 r1 = r1.u
            long r1 = r1.a()
            int r6 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x03d7
            com.google.android.gms.measurement.internal.p4 r1 = r27.i()
            r9 = r30
            boolean r1 = r1.x(r9)
            if (r1 == 0) goto L_0x03d9
            com.google.android.gms.measurement.internal.p4 r1 = r27.i()
            com.google.android.gms.measurement.internal.r4 r1 = r1.w
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x03d9
            com.google.android.gms.measurement.internal.c4 r1 = r27.h()
            com.google.android.gms.measurement.internal.e4 r1 = r1.M()
            java.lang.String r2 = "Current session is expired, remove the session number, ID, and engagement time"
            r1.a(r2)
            r6 = 0
            com.google.android.gms.common.util.e r1 = r27.l()
            long r19 = r1.c()
            java.lang.String r2 = "auto"
            java.lang.String r21 = "_sid"
            r1 = r27
            r22 = r3
            r3 = r21
            r4 = r6
            r5 = r19
            r1.Z(r2, r3, r4, r5)
            r4 = 0
            com.google.android.gms.common.util.e r1 = r27.l()
            long r5 = r1.c()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sno"
            r1 = r27
            r1.Z(r2, r3, r4, r5)
            com.google.android.gms.common.util.e r1 = r27.l()
            long r5 = r1.c()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_se"
            r1 = r27
            r1.Z(r2, r3, r4, r5)
            goto L_0x03db
        L_0x03d7:
            r9 = r30
        L_0x03d9:
            r22 = r3
        L_0x03db:
            java.lang.String r1 = "extend_session"
            r2 = 0
            long r1 = r15.getLong(r1, r2)
            r3 = 1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0403
            com.google.android.gms.measurement.internal.c4 r1 = r27.h()
            com.google.android.gms.measurement.internal.e4 r1 = r1.M()
            java.lang.String r2 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r1.a(r2)
            com.google.android.gms.measurement.internal.h5 r1 = r7.a
            com.google.android.gms.measurement.internal.j9 r1 = r1.C()
            com.google.android.gms.measurement.internal.r9 r1 = r1.d
            r5 = 1
            r1.b(r9, r5)
            goto L_0x0404
        L_0x0403:
            r5 = 1
        L_0x0404:
            java.util.Set r1 = r15.keySet()
            int r2 = r15.size()
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.util.Arrays.sort(r1)
            boolean r2 = defpackage.i31.a()
            if (r2 == 0) goto L_0x0456
            com.google.android.gms.measurement.internal.wa r2 = r27.j()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.u.B0
            boolean r2 = r2.s(r3)
            if (r2 == 0) goto L_0x0456
            com.google.android.gms.measurement.internal.wa r2 = r27.j()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.u.A0
            boolean r2 = r2.s(r3)
            if (r2 == 0) goto L_0x0456
            int r2 = r1.length
            r3 = 0
        L_0x0437:
            if (r3 >= r2) goto L_0x044e
            r4 = r1[r3]
            r27.g()
            java.lang.Object r6 = r15.get(r4)
            android.os.Bundle[] r6 = com.google.android.gms.measurement.internal.fa.x0(r6)
            if (r6 == 0) goto L_0x044b
            r15.putParcelableArray(r4, r6)
        L_0x044b:
            int r3 = r3 + 1
            goto L_0x0437
        L_0x044e:
            r10 = r11
            r11 = r12
            r26 = r13
            r24 = 1
            goto L_0x0512
        L_0x0456:
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L_0x0459:
            java.lang.String r6 = "_eid"
            if (r3 >= r2) goto L_0x04ff
            r5 = r1[r3]
            java.lang.Object r19 = r15.get(r5)
            r27.g()
            r32 = r1
            android.os.Bundle[] r1 = com.google.android.gms.measurement.internal.fa.x0(r19)
            r19 = r2
            if (r1 == 0) goto L_0x04de
            int r2 = r1.length
            r15.putInt(r5, r2)
            r2 = 0
        L_0x0475:
            int r9 = r1.length
            if (r2 >= r9) goto L_0x04d0
            r10 = r1[r2]
            r9 = 1
            com.google.android.gms.measurement.internal.t7.O(r14, r10, r9)
            com.google.android.gms.measurement.internal.fa r18 = r27.g()
            r20 = 0
            java.lang.String r21 = "_ep"
            r24 = 1
            r9 = r18
            r18 = r10
            r10 = r36
            r25 = r11
            r11 = r21
            r12 = r18
            r26 = r13
            r13 = r17
            r18 = r14
            r14 = r35
            r7 = r15
            r15 = r20
            android.os.Bundle r9 = r9.C(r10, r11, r12, r13, r14, r15)
            java.lang.String r10 = "_en"
            r11 = r29
            r9.putString(r10, r11)
            r12 = r22
            r9.putLong(r6, r12)
            java.lang.String r10 = "_gn"
            r9.putString(r10, r5)
            int r10 = r1.length
            java.lang.String r14 = "_ll"
            r9.putInt(r14, r10)
            java.lang.String r10 = "_i"
            r9.putInt(r10, r2)
            r10 = r25
            r10.add(r9)
            int r2 = r2 + 1
            r15 = r7
            r14 = r18
            r13 = r26
            r7 = r27
            r12 = r11
            r11 = r10
            goto L_0x0475
        L_0x04d0:
            r10 = r11
            r11 = r12
            r26 = r13
            r18 = r14
            r7 = r15
            r12 = r22
            r24 = 1
            int r1 = r1.length
            int r4 = r4 + r1
            goto L_0x04e9
        L_0x04de:
            r10 = r11
            r11 = r12
            r26 = r13
            r18 = r14
            r7 = r15
            r12 = r22
            r24 = 1
        L_0x04e9:
            int r3 = r3 + 1
            r1 = r32
            r15 = r7
            r22 = r12
            r14 = r18
            r2 = r19
            r13 = r26
            r5 = 1
            r7 = r27
            r12 = r11
            r11 = r10
            r9 = r30
            goto L_0x0459
        L_0x04ff:
            r10 = r11
            r11 = r12
            r26 = r13
            r7 = r15
            r12 = r22
            r24 = 1
            if (r4 == 0) goto L_0x0512
            r7.putLong(r6, r12)
            java.lang.String r1 = "_epc"
            r7.putInt(r1, r4)
        L_0x0512:
            r7 = 0
        L_0x0513:
            int r1 = r10.size()
            if (r7 >= r1) goto L_0x057b
            java.lang.Object r1 = r10.get(r7)
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r7 == 0) goto L_0x0523
            r2 = 1
            goto L_0x0524
        L_0x0523:
            r2 = 0
        L_0x0524:
            if (r2 == 0) goto L_0x0529
            java.lang.String r2 = "_ep"
            goto L_0x052a
        L_0x0529:
            r2 = r11
        L_0x052a:
            r1.putString(r0, r8)
            if (r34 == 0) goto L_0x0537
            com.google.android.gms.measurement.internal.fa r3 = r27.g()
            android.os.Bundle r1 = r3.B(r1)
        L_0x0537:
            r9 = r1
            com.google.android.gms.measurement.internal.s r12 = new com.google.android.gms.measurement.internal.s
            com.google.android.gms.measurement.internal.n r3 = new com.google.android.gms.measurement.internal.n
            r3.<init>(r9)
            r1 = r12
            r4 = r28
            r13 = 1
            r5 = r30
            r1.<init>(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.c8 r1 = r27.r()
            r14 = r36
            r1.J(r12, r14)
            r12 = r27
            if (r16 != 0) goto L_0x0576
            java.util.Set<com.google.android.gms.measurement.internal.j6> r1 = r12.e
            java.util.Iterator r15 = r1.iterator()
        L_0x055b:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x0576
            java.lang.Object r1 = r15.next()
            com.google.android.gms.measurement.internal.j6 r1 = (com.google.android.gms.measurement.internal.j6) r1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r9)
            r2 = r28
            r3 = r29
            r5 = r30
            r1.a(r2, r3, r4, r5)
            goto L_0x055b
        L_0x0576:
            int r7 = r7 + 1
            r24 = 1
            goto L_0x0513
        L_0x057b:
            r12 = r27
            r13 = 1
            com.google.android.gms.measurement.internal.t7 r0 = r27.s()
            r1 = 0
            com.google.android.gms.measurement.internal.u7 r0 = r0.D(r1)
            if (r0 == 0) goto L_0x05a0
            r0 = r26
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x05a0
            com.google.android.gms.measurement.internal.j9 r0 = r27.u()
            com.google.android.gms.common.util.e r1 = r27.l()
            long r1 = r1.a()
            r0.E(r13, r13, r1)
        L_0x05a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.l6.V(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    public final void X(String str, String str2, Bundle bundle) {
        Y(str, str2, bundle, true, true, l().c());
    }

    public final void Y(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (!j().s(u.x0)) {
            String str4 = str2;
        } else if (fa.B0(str2, "screen_view")) {
            s().J(bundle2, j2);
            return;
        }
        long j3 = j2;
        f().y(new u6(this, str3, str2, j2, fa.r0(bundle2), z2, !z2 || this.d == null || fa.C0(str2), !z, (String) null));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Z(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.r.f(r9)
            com.google.android.gms.common.internal.r.f(r10)
            r8.b()
            r8.w()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L_0x0060
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L_0x0050
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0050
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            if (r10 == 0) goto L_0x0035
            r4 = r2
            goto L_0x0037
        L_0x0035:
            r4 = 0
        L_0x0037:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.p4 r0 = r8.i()
            com.google.android.gms.measurement.internal.v4 r0 = r0.s
            long r4 = r10.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x004b
            java.lang.String r11 = "true"
        L_0x004b:
            r0.b(r11)
            r6 = r10
            goto L_0x005e
        L_0x0050:
            if (r11 != 0) goto L_0x0060
            com.google.android.gms.measurement.internal.p4 r10 = r8.i()
            com.google.android.gms.measurement.internal.v4 r10 = r10.s
            java.lang.String r0 = "unset"
            r10.b(r0)
            r6 = r11
        L_0x005e:
            r3 = r1
            goto L_0x0062
        L_0x0060:
            r3 = r10
            r6 = r11
        L_0x0062:
            com.google.android.gms.measurement.internal.h5 r10 = r8.a
            boolean r10 = r10.p()
            if (r10 != 0) goto L_0x0078
            com.google.android.gms.measurement.internal.c4 r9 = r8.h()
            com.google.android.gms.measurement.internal.e4 r9 = r9.M()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.a(r10)
            return
        L_0x0078:
            com.google.android.gms.measurement.internal.h5 r10 = r8.a
            boolean r10 = r10.u()
            if (r10 != 0) goto L_0x0081
            return
        L_0x0081:
            com.google.android.gms.measurement.internal.ea r10 = new com.google.android.gms.measurement.internal.ea
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.c8 r9 = r8.r()
            r9.O(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.l6.Z(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void a0(String str, String str2, Object obj, boolean z) {
        b0(str, str2, obj, true, l().c());
    }

    public final void b0(String str, String str2, Object obj, boolean z, long j2) {
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        int i2 = 6;
        int i3 = 0;
        if (z) {
            i2 = g().p0(str2);
        } else {
            fa g2 = g();
            if (g2.g0("user property", str2)) {
                if (!g2.l0("user property", h6.a, str2)) {
                    i2 = 15;
                } else if (g2.f0("user property", 24, str2)) {
                    i2 = 0;
                }
            }
        }
        if (i2 != 0) {
            g();
            String H = fa.H(str2, 24, true);
            if (str2 != null) {
                i3 = str2.length();
            }
            this.a.G().J(i2, "_ev", H, i3);
        } else if (obj != null) {
            int q0 = g().q0(str2, obj);
            if (q0 != 0) {
                g();
                String H2 = fa.H(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i3 = String.valueOf(obj).length();
                }
                this.a.G().J(q0, "_ev", H2, i3);
                return;
            }
            Object y0 = g().y0(str2, obj);
            if (y0 != null) {
                W(str3, str2, j2, y0);
            }
        } else {
            W(str3, str2, j2, (Object) null);
        }
    }

    public final void c0(String str, String str2, String str3, Bundle bundle) {
        r.f(str);
        k();
        throw null;
    }

    public final void d0() {
        if (n().getApplicationContext() instanceof Application) {
            ((Application) n().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.c);
        }
    }

    public final Boolean e0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) f().u(atomicReference, 15000, "boolean test flag value", new q6(this, atomicReference));
    }

    public final String f0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) f().u(atomicReference, 15000, "String test flag value", new z6(this, atomicReference));
    }

    public final Long g0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) f().u(atomicReference, 15000, "long test flag value", new d7(this, atomicReference));
    }

    public final Integer h0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) f().u(atomicReference, 15000, "int test flag value", new c7(this, atomicReference));
    }

    public final Double i0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) f().u(atomicReference, 15000, "double test flag value", new f7(this, atomicReference));
    }

    public final String j0() {
        return this.g.get();
    }

    public final void k0() {
        b();
        w();
        if (this.a.u()) {
            if (j().s(u.e0)) {
                Boolean D = j().D("google_analytics_deferred_deep_link_enabled");
                if (D != null && D.booleanValue()) {
                    h().L().a("Deferred Deep Link feature enabled.");
                    f().y(new n6(this));
                }
            }
            r().Y();
            this.o = false;
            String L = i().L();
            if (!TextUtils.isEmpty(L)) {
                c().m();
                if (!L.equals(Build.VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", L);
                    X("auto", "_ou", bundle);
                }
            }
        }
    }

    public final String l0() {
        u7 S = this.a.O().S();
        if (S != null) {
            return S.a;
        }
        return null;
    }

    public final String m0() {
        u7 S = this.a.O().S();
        if (S != null) {
            return S.b;
        }
        return null;
    }

    public final String n0() {
        if (this.a.K() != null) {
            return this.a.K();
        }
        try {
            return r7.b(n(), "google_app_id");
        } catch (IllegalStateException e2) {
            this.a.h().E().b("getGoogleAppId failed with exception", e2);
            return null;
        }
    }

    public final void r0(Bundle bundle) {
        r.j(bundle);
        r.f(bundle.getString("app_id"));
        k();
        throw null;
    }

    public final void t0(j6 j6Var) {
        w();
        r.j(j6Var);
        if (!this.e.remove(j6Var)) {
            h().H().a("OnEventListener had not been registered");
        }
    }

    /* access modifiers changed from: package-private */
    public final void v0(String str, String str2, Bundle bundle) {
        b();
        U(str, str2, l().c(), bundle);
    }

    public final void y0(String str, String str2, Bundle bundle) {
        w0((String) null, str, str2, bundle);
    }

    /* access modifiers changed from: protected */
    public final boolean z() {
        return false;
    }
}
