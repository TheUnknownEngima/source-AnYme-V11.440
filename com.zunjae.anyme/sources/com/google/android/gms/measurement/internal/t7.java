package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.r;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class t7 extends f5 {
    private volatile u7 c;
    private u7 d;
    protected u7 e;
    private final Map<Activity, u7> f = new ConcurrentHashMap();
    private Activity g;
    private volatile boolean h;
    private volatile u7 i;
    /* access modifiers changed from: private */
    public u7 j;
    private boolean k;
    private final Object l = new Object();
    private String m;

    public t7(h5 h5Var) {
        super(h5Var);
    }

    private static String E(String str) {
        String[] split = str.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    private final void H(Activity activity, u7 u7Var, boolean z) {
        u7 u7Var2;
        u7 u7Var3 = u7Var;
        u7 u7Var4 = this.c == null ? this.d : this.c;
        if (u7Var3.b == null) {
            u7Var2 = new u7(u7Var3.a, activity != null ? E(activity.getClass().getCanonicalName()) : null, u7Var3.c, u7Var3.e, u7Var3.f);
        } else {
            u7Var2 = u7Var3;
        }
        this.d = this.c;
        this.c = u7Var2;
        f().y(new v7(this, u7Var2, u7Var4, l().a(), z));
    }

    /* access modifiers changed from: private */
    public final void K(Bundle bundle, u7 u7Var, u7 u7Var2, long j2) {
        if (bundle != null) {
            bundle.remove("screen_name");
            bundle.remove("screen_class");
        }
        P(u7Var, u7Var2, j2, true, g().C((String) null, "screen_view", bundle, (List<String>) null, true, true));
    }

    public static void O(u7 u7Var, Bundle bundle, boolean z) {
        if (bundle != null && u7Var != null && (!bundle.containsKey("_sc") || z)) {
            String str = u7Var.a;
            if (str != null) {
                bundle.putString("_sn", str);
            } else {
                bundle.remove("_sn");
            }
            String str2 = u7Var.b;
            if (str2 != null) {
                bundle.putString("_sc", str2);
            } else {
                bundle.remove("_sc");
            }
            bundle.putLong("_si", u7Var.c);
        } else if (bundle != null && u7Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* access modifiers changed from: private */
    public final void P(u7 u7Var, u7 u7Var2, long j2, boolean z, Bundle bundle) {
        boolean z2;
        long j3;
        u7 u7Var3;
        b();
        boolean z3 = false;
        if (j().s(u.U)) {
            z2 = z && this.e != null;
            if (z2) {
                Q(this.e, true, j2);
            }
        } else {
            if (z && (u7Var3 = this.e) != null) {
                Q(u7Var3, true, j2);
            }
            z2 = false;
        }
        if (u7Var2 == null || u7Var2.c != u7Var.c || !fa.B0(u7Var2.b, u7Var.b) || !fa.B0(u7Var2.a, u7Var.a)) {
            z3 = true;
        }
        if (z3) {
            Bundle bundle2 = new Bundle();
            if (j().s(u.x0)) {
                bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            }
            Bundle bundle3 = bundle2;
            O(u7Var, bundle3, true);
            if (u7Var2 != null) {
                String str = u7Var2.a;
                if (str != null) {
                    bundle3.putString("_pn", str);
                }
                String str2 = u7Var2.b;
                if (str2 != null) {
                    bundle3.putString("_pc", str2);
                }
                bundle3.putLong("_pi", u7Var2.c);
            }
            if (j().s(u.U) && z2) {
                long e2 = (!h41.a() || !j().s(u.W)) ? u().e.e() : u().B(j2);
                if (e2 > 0) {
                    g().L(bundle3, e2);
                }
            }
            String str3 = "auto";
            if (j().s(u.x0)) {
                if (!j().H().booleanValue()) {
                    bundle3.putLong("_mst", 1);
                }
                if (u7Var.e) {
                    str3 = "app";
                }
            }
            String str4 = str3;
            if (j().s(u.x0)) {
                long c2 = l().c();
                if (u7Var.e) {
                    long j4 = u7Var.f;
                    if (j4 != 0) {
                        j3 = j4;
                        p().U(str4, "_vs", j3, bundle3);
                    }
                }
                j3 = c2;
                p().U(str4, "_vs", j3, bundle3);
            } else {
                p().v0(str4, "_vs", bundle3);
            }
        }
        this.e = u7Var;
        if (j().s(u.x0) && u7Var.e) {
            this.j = u7Var;
        }
        r().M(u7Var);
    }

    /* access modifiers changed from: private */
    public final void Q(u7 u7Var, boolean z, long j2) {
        m().v(l().a());
        if (u().E(u7Var != null && u7Var.d, z, j2) && u7Var != null) {
            u7Var.d = false;
        }
    }

    private final u7 W(Activity activity) {
        r.j(activity);
        u7 u7Var = this.f.get(activity);
        if (u7Var == null) {
            u7 u7Var2 = new u7((String) null, E(activity.getClass().getCanonicalName()), g().E0());
            this.f.put(activity, u7Var2);
            u7Var = u7Var2;
        }
        return (j().s(u.x0) && this.i != null) ? this.i : u7Var;
    }

    public final u7 D(boolean z) {
        w();
        b();
        if (!j().s(u.x0) || !z) {
            return this.e;
        }
        u7 u7Var = this.e;
        return u7Var != null ? u7Var : this.j;
    }

    public final void F(Activity activity) {
        if (j().s(u.x0)) {
            synchronized (this.l) {
                this.k = true;
                if (activity != this.g) {
                    synchronized (this.l) {
                        this.g = activity;
                        this.h = false;
                    }
                    if (j().s(u.w0) && j().H().booleanValue()) {
                        this.i = null;
                        f().y(new z7(this));
                    }
                }
            }
        }
        if (!j().s(u.w0) || j().H().booleanValue()) {
            H(activity, W(activity), false);
            a m2 = m();
            m2.f().y(new e3(m2, m2.l().a()));
            return;
        }
        this.c = this.i;
        f().y(new y7(this));
    }

    public final void G(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (j().H().booleanValue() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f.put(activity, new u7(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }

    @Deprecated
    public final void I(Activity activity, String str, String str2) {
        if (!j().H().booleanValue()) {
            h().J().a("setCurrentScreen cannot be called while screen reporting is disabled.");
        } else if (this.c == null) {
            h().J().a("setCurrentScreen cannot be called while no activity active");
        } else if (this.f.get(activity) == null) {
            h().J().a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = E(activity.getClass().getCanonicalName());
            }
            boolean B0 = fa.B0(this.c.b, str2);
            boolean B02 = fa.B0(this.c.a, str);
            if (B0 && B02) {
                h().J().a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > 100)) {
                h().J().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 == null || (str2.length() > 0 && str2.length() <= 100)) {
                h().M().c("Setting current screen to name, class", str == null ? "null" : str, str2);
                u7 u7Var = new u7(str, str2, g().E0());
                this.f.put(activity, u7Var);
                H(activity, u7Var, true);
            } else {
                h().J().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00da, code lost:
        r1 = h().M();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e4, code lost:
        if (r10 != null) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e6, code lost:
        r3 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e9, code lost:
        r3 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ea, code lost:
        if (r11 != null) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ec, code lost:
        r4 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ef, code lost:
        r4 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f0, code lost:
        r1.c("Logging screen view with name, class", r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f5, code lost:
        if (r8.c != null) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f7, code lost:
        r1 = r8.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00fa, code lost:
        r1 = r8.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00fc, code lost:
        r5 = r1;
        r9 = new com.google.android.gms.measurement.internal.u7(r10, r11, g().E0(), true, r19);
        r8.c = r9;
        r8.d = r5;
        r8.i = r9;
        f().y(new com.google.android.gms.measurement.internal.w7(r17, r18, r9, r5, l().a()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x012d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void J(android.os.Bundle r18, long r19) {
        /*
            r17 = this;
            r8 = r17
            r0 = r18
            com.google.android.gms.measurement.internal.wa r1 = r17.j()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.u.x0
            boolean r1 = r1.s(r2)
            if (r1 != 0) goto L_0x001e
            com.google.android.gms.measurement.internal.c4 r0 = r17.h()
            com.google.android.gms.measurement.internal.e4 r0 = r0.J()
            java.lang.String r1 = "Manual screen reporting is disabled."
            r0.a(r1)
            return
        L_0x001e:
            java.lang.Object r1 = r8.l
            monitor-enter(r1)
            boolean r2 = r8.k     // Catch:{ all -> 0x012e }
            if (r2 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.c4 r0 = r17.h()     // Catch:{ all -> 0x012e }
            com.google.android.gms.measurement.internal.e4 r0 = r0.J()     // Catch:{ all -> 0x012e }
            java.lang.String r2 = "Cannot log screen view event when the app is in the background."
            r0.a(r2)     // Catch:{ all -> 0x012e }
            monitor-exit(r1)     // Catch:{ all -> 0x012e }
            return
        L_0x0034:
            r2 = 0
            if (r0 == 0) goto L_0x0092
            java.lang.String r2 = "screen_name"
            java.lang.String r2 = r0.getString(r2)     // Catch:{ all -> 0x012e }
            r3 = 100
            if (r2 == 0) goto L_0x0064
            int r4 = r2.length()     // Catch:{ all -> 0x012e }
            if (r4 <= 0) goto L_0x004d
            int r4 = r2.length()     // Catch:{ all -> 0x012e }
            if (r4 <= r3) goto L_0x0064
        L_0x004d:
            com.google.android.gms.measurement.internal.c4 r0 = r17.h()     // Catch:{ all -> 0x012e }
            com.google.android.gms.measurement.internal.e4 r0 = r0.J()     // Catch:{ all -> 0x012e }
            java.lang.String r3 = "Invalid screen name length for screen view. Length"
            int r2 = r2.length()     // Catch:{ all -> 0x012e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x012e }
            r0.b(r3, r2)     // Catch:{ all -> 0x012e }
            monitor-exit(r1)     // Catch:{ all -> 0x012e }
            return
        L_0x0064:
            java.lang.String r4 = "screen_class"
            java.lang.String r4 = r0.getString(r4)     // Catch:{ all -> 0x012e }
            if (r4 == 0) goto L_0x008f
            int r5 = r4.length()     // Catch:{ all -> 0x012e }
            if (r5 <= 0) goto L_0x0078
            int r5 = r4.length()     // Catch:{ all -> 0x012e }
            if (r5 <= r3) goto L_0x008f
        L_0x0078:
            com.google.android.gms.measurement.internal.c4 r0 = r17.h()     // Catch:{ all -> 0x012e }
            com.google.android.gms.measurement.internal.e4 r0 = r0.J()     // Catch:{ all -> 0x012e }
            java.lang.String r2 = "Invalid screen class length for screen view. Length"
            int r3 = r4.length()     // Catch:{ all -> 0x012e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x012e }
            r0.b(r2, r3)     // Catch:{ all -> 0x012e }
            monitor-exit(r1)     // Catch:{ all -> 0x012e }
            return
        L_0x008f:
            r10 = r2
            r2 = r4
            goto L_0x0093
        L_0x0092:
            r10 = r2
        L_0x0093:
            if (r2 != 0) goto L_0x00aa
            android.app.Activity r2 = r8.g     // Catch:{ all -> 0x012e }
            if (r2 == 0) goto L_0x00a8
            android.app.Activity r2 = r8.g     // Catch:{ all -> 0x012e }
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x012e }
            java.lang.String r2 = r2.getCanonicalName()     // Catch:{ all -> 0x012e }
            java.lang.String r2 = E(r2)     // Catch:{ all -> 0x012e }
            goto L_0x00aa
        L_0x00a8:
            java.lang.String r2 = "Activity"
        L_0x00aa:
            r11 = r2
            boolean r2 = r8.h     // Catch:{ all -> 0x012e }
            if (r2 == 0) goto L_0x00d9
            com.google.android.gms.measurement.internal.u7 r2 = r8.c     // Catch:{ all -> 0x012e }
            if (r2 == 0) goto L_0x00d9
            r2 = 0
            r8.h = r2     // Catch:{ all -> 0x012e }
            com.google.android.gms.measurement.internal.u7 r2 = r8.c     // Catch:{ all -> 0x012e }
            java.lang.String r2 = r2.b     // Catch:{ all -> 0x012e }
            boolean r2 = com.google.android.gms.measurement.internal.fa.B0(r2, r11)     // Catch:{ all -> 0x012e }
            com.google.android.gms.measurement.internal.u7 r3 = r8.c     // Catch:{ all -> 0x012e }
            java.lang.String r3 = r3.a     // Catch:{ all -> 0x012e }
            boolean r3 = com.google.android.gms.measurement.internal.fa.B0(r3, r10)     // Catch:{ all -> 0x012e }
            if (r2 == 0) goto L_0x00d9
            if (r3 == 0) goto L_0x00d9
            com.google.android.gms.measurement.internal.c4 r0 = r17.h()     // Catch:{ all -> 0x012e }
            com.google.android.gms.measurement.internal.e4 r0 = r0.J()     // Catch:{ all -> 0x012e }
            java.lang.String r2 = "Ignoring call to log screen view event with duplicate parameters."
            r0.a(r2)     // Catch:{ all -> 0x012e }
            monitor-exit(r1)     // Catch:{ all -> 0x012e }
            return
        L_0x00d9:
            monitor-exit(r1)     // Catch:{ all -> 0x012e }
            com.google.android.gms.measurement.internal.c4 r1 = r17.h()
            com.google.android.gms.measurement.internal.e4 r1 = r1.M()
            java.lang.String r2 = "Logging screen view with name, class"
            if (r10 != 0) goto L_0x00e9
            java.lang.String r3 = "null"
            goto L_0x00ea
        L_0x00e9:
            r3 = r10
        L_0x00ea:
            if (r11 != 0) goto L_0x00ef
            java.lang.String r4 = "null"
            goto L_0x00f0
        L_0x00ef:
            r4 = r11
        L_0x00f0:
            r1.c(r2, r3, r4)
            com.google.android.gms.measurement.internal.u7 r1 = r8.c
            if (r1 != 0) goto L_0x00fa
            com.google.android.gms.measurement.internal.u7 r1 = r8.d
            goto L_0x00fc
        L_0x00fa:
            com.google.android.gms.measurement.internal.u7 r1 = r8.c
        L_0x00fc:
            r5 = r1
            com.google.android.gms.measurement.internal.u7 r4 = new com.google.android.gms.measurement.internal.u7
            com.google.android.gms.measurement.internal.fa r1 = r17.g()
            long r12 = r1.E0()
            r14 = 1
            r9 = r4
            r15 = r19
            r9.<init>(r10, r11, r12, r14, r15)
            r8.c = r4
            r8.d = r5
            r8.i = r4
            com.google.android.gms.common.util.e r1 = r17.l()
            long r6 = r1.a()
            com.google.android.gms.measurement.internal.a5 r9 = r17.f()
            com.google.android.gms.measurement.internal.w7 r10 = new com.google.android.gms.measurement.internal.w7
            r1 = r10
            r2 = r17
            r3 = r18
            r1.<init>(r2, r3, r4, r5, r6)
            r9.y(r10)
            return
        L_0x012e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x012e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.t7.J(android.os.Bundle, long):void");
    }

    public final void R(String str, u7 u7Var) {
        b();
        synchronized (this) {
            if (this.m == null || this.m.equals(str) || u7Var != null) {
                this.m = str;
            }
        }
    }

    public final u7 S() {
        return this.c;
    }

    public final void T(Activity activity) {
        if (j().s(u.x0)) {
            synchronized (this.l) {
                this.k = false;
                this.h = true;
            }
        }
        long a = l().a();
        if (!j().s(u.w0) || j().H().booleanValue()) {
            u7 W = W(activity);
            this.d = this.c;
            this.c = null;
            f().y(new a8(this, W, a));
            return;
        }
        this.c = null;
        f().y(new x7(this, a));
    }

    public final void U(Activity activity, Bundle bundle) {
        u7 u7Var;
        if (j().H().booleanValue() && bundle != null && (u7Var = this.f.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", u7Var.c);
            bundle2.putString("name", u7Var.a);
            bundle2.putString("referrer_name", u7Var.b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    public final void V(Activity activity) {
        synchronized (this.l) {
            if (activity == this.g) {
                this.g = null;
            }
        }
        if (j().H().booleanValue()) {
            this.f.remove(activity);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean z() {
        return false;
    }
}
