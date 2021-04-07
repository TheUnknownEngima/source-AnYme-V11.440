package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.i;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.stats.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class c8 extends f5 {
    /* access modifiers changed from: private */
    public final w8 c;
    /* access modifiers changed from: private */
    public u3 d;
    private volatile Boolean e;
    private final k f;
    private final q9 g;
    private final List<Runnable> h = new ArrayList();
    private final k i;

    protected c8(h5 h5Var) {
        super(h5Var);
        this.g = new q9(h5Var.l());
        this.c = new w8(this);
        this.f = new b8(this, h5Var);
        this.i = new l8(this, h5Var);
    }

    /* access modifiers changed from: private */
    public final void D(ComponentName componentName) {
        b();
        if (this.d != null) {
            this.d = null;
            h().M().b("Disconnected from device MeasurementService", componentName);
            b();
            Z();
        }
    }

    private final void Q(Runnable runnable) {
        b();
        if (V()) {
            runnable.run();
        } else if (((long) this.h.size()) >= 1000) {
            h().E().a("Discarding data. Max runnable queue size reached");
        } else {
            this.h.add(runnable);
            this.i.c(60000);
            Z();
        }
    }

    /* access modifiers changed from: private */
    public final void e0() {
        b();
        this.g.a();
        this.f.c(u.J.a(null).longValue());
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean f0() {
        /*
            r5 = this;
            r5.b()
            r5.w()
            java.lang.Boolean r0 = r5.e
            if (r0 != 0) goto L_0x00fb
            r5.b()
            r5.w()
            com.google.android.gms.measurement.internal.p4 r0 = r5.i()
            java.lang.Boolean r0 = r0.G()
            r1 = 1
            if (r0 == 0) goto L_0x0023
            boolean r2 = r0.booleanValue()
            if (r2 == 0) goto L_0x0023
            goto L_0x00f5
        L_0x0023:
            com.google.android.gms.measurement.internal.v3 r2 = r5.q()
            int r2 = r2.H()
            r3 = 0
            if (r2 != r1) goto L_0x0031
        L_0x002e:
            r0 = 1
            goto L_0x00d1
        L_0x0031:
            com.google.android.gms.measurement.internal.c4 r2 = r5.h()
            com.google.android.gms.measurement.internal.e4 r2 = r2.M()
            java.lang.String r4 = "Checking service availability"
            r2.a(r4)
            com.google.android.gms.measurement.internal.fa r2 = r5.g()
            r4 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r2 = r2.t(r4)
            if (r2 == 0) goto L_0x00c2
            if (r2 == r1) goto L_0x00b2
            r4 = 2
            if (r2 == r4) goto L_0x0092
            r0 = 3
            if (r2 == r0) goto L_0x0083
            r0 = 9
            if (r2 == r0) goto L_0x0078
            r0 = 18
            if (r2 == r0) goto L_0x006d
            com.google.android.gms.measurement.internal.c4 r0 = r5.h()
            com.google.android.gms.measurement.internal.e4 r0 = r0.H()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = "Unexpected service status"
            r0.b(r2, r1)
            goto L_0x0090
        L_0x006d:
            com.google.android.gms.measurement.internal.c4 r0 = r5.h()
            com.google.android.gms.measurement.internal.e4 r0 = r0.H()
            java.lang.String r2 = "Service updating"
            goto L_0x00cc
        L_0x0078:
            com.google.android.gms.measurement.internal.c4 r0 = r5.h()
            com.google.android.gms.measurement.internal.e4 r0 = r0.H()
            java.lang.String r1 = "Service invalid"
            goto L_0x008d
        L_0x0083:
            com.google.android.gms.measurement.internal.c4 r0 = r5.h()
            com.google.android.gms.measurement.internal.e4 r0 = r0.H()
            java.lang.String r1 = "Service disabled"
        L_0x008d:
            r0.a(r1)
        L_0x0090:
            r0 = 0
            goto L_0x00c0
        L_0x0092:
            com.google.android.gms.measurement.internal.c4 r2 = r5.h()
            com.google.android.gms.measurement.internal.e4 r2 = r2.L()
            java.lang.String r4 = "Service container out of date"
            r2.a(r4)
            com.google.android.gms.measurement.internal.fa r2 = r5.g()
            int r2 = r2.K0()
            r4 = 17443(0x4423, float:2.4443E-41)
            if (r2 >= r4) goto L_0x00ac
            goto L_0x00bf
        L_0x00ac:
            if (r0 != 0) goto L_0x00af
            goto L_0x00b0
        L_0x00af:
            r1 = 0
        L_0x00b0:
            r0 = 0
            goto L_0x00d1
        L_0x00b2:
            com.google.android.gms.measurement.internal.c4 r0 = r5.h()
            com.google.android.gms.measurement.internal.e4 r0 = r0.M()
            java.lang.String r2 = "Service missing"
            r0.a(r2)
        L_0x00bf:
            r0 = 1
        L_0x00c0:
            r1 = 0
            goto L_0x00d1
        L_0x00c2:
            com.google.android.gms.measurement.internal.c4 r0 = r5.h()
            com.google.android.gms.measurement.internal.e4 r0 = r0.M()
            java.lang.String r2 = "Service available"
        L_0x00cc:
            r0.a(r2)
            goto L_0x002e
        L_0x00d1:
            if (r1 != 0) goto L_0x00eb
            com.google.android.gms.measurement.internal.wa r2 = r5.j()
            boolean r2 = r2.Q()
            if (r2 == 0) goto L_0x00eb
            com.google.android.gms.measurement.internal.c4 r0 = r5.h()
            com.google.android.gms.measurement.internal.e4 r0 = r0.E()
            java.lang.String r2 = "No way to upload. Consider using the full version of Analytics"
            r0.a(r2)
            goto L_0x00ec
        L_0x00eb:
            r3 = r0
        L_0x00ec:
            if (r3 == 0) goto L_0x00f5
            com.google.android.gms.measurement.internal.p4 r0 = r5.i()
            r0.v(r1)
        L_0x00f5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r5.e = r0
        L_0x00fb:
            java.lang.Boolean r0 = r5.e
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.c8.f0():boolean");
    }

    /* access modifiers changed from: private */
    public final void g0() {
        b();
        if (V()) {
            h().M().a("Inactivity, disconnecting from the service");
            b0();
        }
    }

    /* access modifiers changed from: private */
    public final void h0() {
        b();
        h().M().b("Processing queued up service tasks", Integer.valueOf(this.h.size()));
        for (Runnable run : this.h) {
            try {
                run.run();
            } catch (Exception e2) {
                h().E().b("Task exception while flushing queue", e2);
            }
        }
        this.h.clear();
        this.i.e();
    }

    private final la i0(boolean z) {
        return q().B(z ? h().N() : null);
    }

    public final void E(Bundle bundle) {
        b();
        w();
        Q(new m8(this, bundle, i0(false)));
    }

    public final void F(a71 a71) {
        b();
        w();
        Q(new h8(this, i0(false), a71));
    }

    public final void G(a71 a71, s sVar, String str) {
        b();
        w();
        if (g().t(i.a) != 0) {
            h().H().a("Not bundling data. Service unavailable or out of date");
            g().U(a71, new byte[0]);
            return;
        }
        Q(new o8(this, sVar, str, a71));
    }

    /* access modifiers changed from: protected */
    public final void H(a71 a71, String str, String str2) {
        b();
        w();
        Q(new u8(this, str, str2, i0(false), a71));
    }

    /* access modifiers changed from: protected */
    public final void I(a71 a71, String str, String str2, boolean z) {
        b();
        w();
        Q(new e8(this, str, str2, z, i0(false), a71));
    }

    /* access modifiers changed from: protected */
    public final void J(s sVar, String str) {
        r.j(sVar);
        b();
        w();
        Q(new p8(this, true, t().E(sVar), sVar, i0(true), str));
    }

    /* access modifiers changed from: protected */
    public final void K(u3 u3Var) {
        b();
        r.j(u3Var);
        this.d = u3Var;
        e0();
        h0();
    }

    /* access modifiers changed from: package-private */
    public final void L(u3 u3Var, m80 m80, la laVar) {
        int i2;
        e4 E;
        String str;
        b();
        w();
        int i3 = 0;
        int i4 = 100;
        while (i3 < 1001 && i4 == 100) {
            ArrayList arrayList = new ArrayList();
            List<m80> C = t().C(100);
            if (C != null) {
                arrayList.addAll(C);
                i2 = C.size();
            } else {
                i2 = 0;
            }
            if (m80 != null && i2 < 100) {
                arrayList.add(m80);
            }
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                m80 m802 = (m80) obj;
                if (m802 instanceof s) {
                    try {
                        u3Var.k2((s) m802, laVar);
                    } catch (RemoteException e2) {
                        e = e2;
                        E = h().E();
                        str = "Failed to send event to the service";
                    }
                } else if (m802 instanceof ea) {
                    try {
                        u3Var.n0((ea) m802, laVar);
                    } catch (RemoteException e3) {
                        e = e3;
                        E = h().E();
                        str = "Failed to send user property to the service";
                    }
                } else if (m802 instanceof ua) {
                    try {
                        u3Var.M((ua) m802, laVar);
                    } catch (RemoteException e4) {
                        e = e4;
                        E = h().E();
                        str = "Failed to send conditional user property to the service";
                    }
                } else {
                    h().E().a("Discarding data. Unrecognized parcel type.");
                }
            }
            i3++;
            i4 = i2;
        }
        return;
        E.b(str, e);
    }

    /* access modifiers changed from: protected */
    public final void M(u7 u7Var) {
        b();
        w();
        Q(new j8(this, u7Var));
    }

    /* access modifiers changed from: protected */
    public final void O(ea eaVar) {
        b();
        w();
        Q(new d8(this, t().F(eaVar), eaVar, i0(true)));
    }

    /* access modifiers changed from: protected */
    public final void P(ua uaVar) {
        r.j(uaVar);
        b();
        w();
        Q(new s8(this, true, t().G(uaVar), new ua(uaVar), i0(true), uaVar));
    }

    public final void R(AtomicReference<String> atomicReference) {
        b();
        w();
        Q(new i8(this, atomicReference, i0(false)));
    }

    /* access modifiers changed from: protected */
    public final void S(AtomicReference<List<ua>> atomicReference, String str, String str2, String str3) {
        b();
        w();
        Q(new r8(this, atomicReference, str, str2, str3, i0(false)));
    }

    /* access modifiers changed from: protected */
    public final void T(AtomicReference<List<ea>> atomicReference, String str, String str2, String str3, boolean z) {
        b();
        w();
        Q(new t8(this, atomicReference, str, str2, str3, z, i0(false)));
    }

    /* access modifiers changed from: protected */
    public final void U(boolean z) {
        if (c31.a() && j().s(u.P0)) {
            b();
            w();
            if (z) {
                t().H();
            }
            if (d0()) {
                Q(new q8(this, i0(false)));
            }
        }
    }

    public final boolean V() {
        b();
        w();
        return this.d != null;
    }

    /* access modifiers changed from: protected */
    public final void W() {
        b();
        w();
        Q(new n8(this, i0(true)));
    }

    /* access modifiers changed from: protected */
    public final void X() {
        b();
        w();
        la i0 = i0(false);
        t().H();
        Q(new f8(this, i0));
    }

    /* access modifiers changed from: protected */
    public final void Y() {
        b();
        w();
        la i0 = i0(true);
        t().I();
        Q(new k8(this, i0));
    }

    /* access modifiers changed from: package-private */
    public final void Z() {
        b();
        w();
        if (!V()) {
            if (f0()) {
                this.c.d();
            } else if (!j().Q()) {
                List<ResolveInfo> queryIntentServices = n().getPackageManager().queryIntentServices(new Intent().setClassName(n(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices != null && queryIntentServices.size() > 0) {
                    Intent intent = new Intent("com.google.android.gms.measurement.START");
                    intent.setComponent(new ComponentName(n(), "com.google.android.gms.measurement.AppMeasurementService"));
                    this.c.b(intent);
                    return;
                }
                h().E().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final Boolean a0() {
        return this.e;
    }

    public final void b0() {
        b();
        w();
        this.c.a();
        try {
            a.b().c(n(), this.c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.d = null;
    }

    /* access modifiers changed from: package-private */
    public final boolean c0() {
        b();
        w();
        return !f0() || g().K0() >= 200900;
    }

    /* access modifiers changed from: package-private */
    public final boolean d0() {
        b();
        w();
        if (!j().s(u.Q0)) {
            return false;
        }
        return !f0() || g().K0() >= u.R0.a(null).intValue();
    }

    /* access modifiers changed from: protected */
    public final boolean z() {
        return false;
    }
}
