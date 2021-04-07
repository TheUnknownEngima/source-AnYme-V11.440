package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.n;
import java.lang.reflect.InvocationTargetException;

public final class wa extends a6 {
    private Boolean b;
    private b c = c.a;
    private Boolean d;

    wa(h5 h5Var) {
        super(h5Var);
    }

    public static long J() {
        return u.D.a(null).longValue();
    }

    public static long L() {
        return u.d.a(null).longValue();
    }

    private final Bundle R() {
        try {
            if (n().getPackageManager() == null) {
                h().E().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c2 = v80.a(n()).c(n().getPackageName(), 128);
            if (c2 != null) {
                return c2.metaData;
            }
            h().E().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            h().E().b("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    private final String e(String str, String str2) {
        String str3;
        e4 e4Var;
        Class<String> cls = String.class;
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, str2});
        } catch (ClassNotFoundException e) {
            e = e;
            e4Var = h().E();
            str3 = "Could not find SystemProperties class";
            e4Var.b(str3, e);
            return str2;
        } catch (NoSuchMethodException e2) {
            e = e2;
            e4Var = h().E();
            str3 = "Could not find SystemProperties.get() method";
            e4Var.b(str3, e);
            return str2;
        } catch (IllegalAccessException e3) {
            e = e3;
            e4Var = h().E();
            str3 = "Could not access SystemProperties.get()";
            e4Var.b(str3, e);
            return str2;
        } catch (InvocationTargetException e4) {
            e = e4;
            e4Var = h().E();
            str3 = "SystemProperties.get() threw an exception";
            e4Var.b(str3, e);
            return str2;
        }
    }

    private final int m(String str, r3<Integer> r3Var, int i, int i2) {
        return Math.max(Math.min(u(str, r3Var), i2), i);
    }

    /* access modifiers changed from: package-private */
    public final long A(String str) {
        return p(str, u.b);
    }

    public final boolean B() {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    ApplicationInfo applicationInfo = n().getApplicationInfo();
                    String a = n.a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.d = Boolean.valueOf(str != null && str.equals(a));
                    }
                    if (this.d == null) {
                        this.d = Boolean.TRUE;
                        h().E().a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.d.booleanValue();
    }

    public final boolean C(String str, r3<Boolean> r3Var) {
        return z(str, r3Var);
    }

    /* access modifiers changed from: package-private */
    public final Boolean D(String str) {
        r.f(str);
        Bundle R = R();
        if (R == null) {
            h().E().a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!R.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(R.getBoolean(str));
        }
    }

    public final boolean E() {
        Boolean D = D("firebase_analytics_collection_deactivated");
        return D != null && D.booleanValue();
    }

    public final Boolean F() {
        Boolean D = D("google_analytics_adid_collection_enabled");
        return Boolean.valueOf(D == null || D.booleanValue());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b A[SYNTHETIC, Splitter:B:9:0x002b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> G(java.lang.String r4) {
        /*
            r3 = this;
            com.google.android.gms.common.internal.r.f(r4)
            android.os.Bundle r0 = r3.R()
            r1 = 0
            if (r0 != 0) goto L_0x0019
            com.google.android.gms.measurement.internal.c4 r4 = r3.h()
            com.google.android.gms.measurement.internal.e4 r4 = r4.E()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L_0x0017:
            r4 = r1
            goto L_0x0028
        L_0x0019:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L_0x0020
            goto L_0x0017
        L_0x0020:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x0028:
            if (r4 != 0) goto L_0x002b
            return r1
        L_0x002b:
            android.content.Context r0 = r3.n()     // Catch:{ NotFoundException -> 0x0043 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x0043 }
            int r4 = r4.intValue()     // Catch:{ NotFoundException -> 0x0043 }
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch:{ NotFoundException -> 0x0043 }
            if (r4 != 0) goto L_0x003e
            return r1
        L_0x003e:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ NotFoundException -> 0x0043 }
            return r4
        L_0x0043:
            r4 = move-exception
            com.google.android.gms.measurement.internal.c4 r0 = r3.h()
            com.google.android.gms.measurement.internal.e4 r0 = r0.E()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.wa.G(java.lang.String):java.util.List");
    }

    public final Boolean H() {
        if (!g51.a() || !s(u.w0)) {
            return Boolean.TRUE;
        }
        Boolean D = D("google_analytics_automatic_screen_reporting_enabled");
        return Boolean.valueOf(D == null || D.booleanValue());
    }

    public final boolean I(String str) {
        return "1".equals(this.c.e(str, "gaia_collection_enabled"));
    }

    public final boolean K(String str) {
        return "1".equals(this.c.e(str, "measurement.event_sampling_enabled"));
    }

    /* access modifiers changed from: package-private */
    public final boolean M(String str) {
        return z(str, u.K);
    }

    /* access modifiers changed from: package-private */
    public final String N(String str) {
        r3<String> r3Var = u.L;
        return r3Var.a(str == null ? null : this.c.e(str, r3Var.b()));
    }

    public final String O() {
        return e("debug.firebase.analytics.app", "");
    }

    public final String P() {
        return e("debug.deferred.deeplink", "");
    }

    /* access modifiers changed from: package-private */
    public final boolean Q() {
        if (this.b == null) {
            Boolean D = D("app_measurement_lite");
            this.b = D;
            if (D == null) {
                this.b = Boolean.FALSE;
            }
        }
        return this.b.booleanValue() || !this.a.N();
    }

    public final int k(String str) {
        return m(str, u.I, 25, 100);
    }

    public final long p(String str, r3<Long> r3Var) {
        if (str != null) {
            String e = this.c.e(str, r3Var.b());
            if (!TextUtils.isEmpty(e)) {
                try {
                    return r3Var.a(Long.valueOf(Long.parseLong(e))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return r3Var.a(null).longValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String q(com.google.android.gms.measurement.internal.f4 r6) {
        /*
            r5 = this;
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = r6.A()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0033
            boolean r1 = defpackage.s41.a()
            if (r1 == 0) goto L_0x002f
            com.google.android.gms.measurement.internal.wa r1 = r5.j()
            java.lang.String r2 = r6.t()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.u.k0
            boolean r1 = r1.z(r2, r3)
            if (r1 == 0) goto L_0x002f
            java.lang.String r1 = r6.G()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0033
        L_0x002f:
            java.lang.String r1 = r6.D()
        L_0x0033:
            com.google.android.gms.measurement.internal.r3<java.lang.String> r2 = com.google.android.gms.measurement.internal.u.e
            r3 = 0
            java.lang.Object r2 = r2.a(r3)
            java.lang.String r2 = (java.lang.String) r2
            android.net.Uri$Builder r2 = r0.scheme(r2)
            com.google.android.gms.measurement.internal.r3<java.lang.String> r4 = com.google.android.gms.measurement.internal.u.f
            java.lang.Object r3 = r4.a(r3)
            java.lang.String r3 = (java.lang.String) r3
            android.net.Uri$Builder r2 = r2.encodedAuthority(r3)
            java.lang.String r3 = "config/app/"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r4 = r1.length()
            if (r4 == 0) goto L_0x005d
            java.lang.String r1 = r3.concat(r1)
            goto L_0x0062
        L_0x005d:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
        L_0x0062:
            android.net.Uri$Builder r1 = r2.path(r1)
            java.lang.String r6 = r6.x()
            java.lang.String r2 = "app_instance_id"
            android.net.Uri$Builder r6 = r1.appendQueryParameter(r2, r6)
            java.lang.String r1 = "platform"
            java.lang.String r2 = "android"
            android.net.Uri$Builder r6 = r6.appendQueryParameter(r1, r2)
            java.lang.String r1 = "gmp_version"
            java.lang.String r2 = "31049"
            r6.appendQueryParameter(r1, r2)
            android.net.Uri r6 = r0.build()
            java.lang.String r6 = r6.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.wa.q(com.google.android.gms.measurement.internal.f4):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    public final void r(b bVar) {
        this.c = bVar;
    }

    public final boolean s(r3<Boolean> r3Var) {
        return z((String) null, r3Var);
    }

    /* access modifiers changed from: package-private */
    public final int t(String str) {
        if (!b31.a() || !z((String) null, u.E0)) {
            return 500;
        }
        return m(str, u.H, 500, 2000);
    }

    public final int u(String str, r3<Integer> r3Var) {
        if (str != null) {
            String e = this.c.e(str, r3Var.b());
            if (!TextUtils.isEmpty(e)) {
                try {
                    return r3Var.a(Integer.valueOf(Integer.parseInt(e))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return r3Var.a(null).intValue();
    }

    public final double v(String str, r3<Double> r3Var) {
        if (str != null) {
            String e = this.c.e(str, r3Var.b());
            if (!TextUtils.isEmpty(e)) {
                try {
                    return r3Var.a(Double.valueOf(Double.parseDouble(e))).doubleValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return r3Var.a(null).doubleValue();
    }

    public final int w(String str) {
        return u(str, u.o);
    }

    public final int x() {
        if (b31.a() && j().z((String) null, u.F0)) {
            fa g = g();
            Boolean a0 = g.a.P().a0();
            if (g.K0() >= 201500 || (a0 != null && !a0.booleanValue())) {
                return 100;
            }
        }
        return 25;
    }

    /* access modifiers changed from: package-private */
    public final int y(String str) {
        if (!b31.a() || !z((String) null, u.E0)) {
            return 25;
        }
        return m(str, u.G, 25, 100);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.android.gms.measurement.internal.r3, com.google.android.gms.measurement.internal.r3<java.lang.Boolean>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean z(java.lang.String r4, com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r5) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x000e
        L_0x0003:
            java.lang.Object r4 = r5.a(r0)
        L_0x0007:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L_0x000e:
            com.google.android.gms.measurement.internal.b r1 = r3.c
            java.lang.String r2 = r5.b()
            java.lang.String r4 = r1.e(r4, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L_0x001f
            goto L_0x0003
        L_0x001f:
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r4 = r5.a(r4)
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.wa.z(java.lang.String, com.google.android.gms.measurement.internal.r3):boolean");
    }
}
