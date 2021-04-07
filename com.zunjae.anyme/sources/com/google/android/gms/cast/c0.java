package com.google.android.gms.cast;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.cast.e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.internal.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@SuppressLint({"UseSparseArrays"})
public final class c0 extends e<e.b> implements t1 {
    /* access modifiers changed from: private */
    public static final u60 E = new u60("CastClient");
    private static final a.C0087a<h80, e.b> F;
    private static final a<e.b> G;
    private final Map<Long, f81<Void>> A;
    final Map<String, e.d> B;
    /* access modifiers changed from: private */
    public final e.c C;
    /* access modifiers changed from: private */
    public final List<v1> D = Collections.synchronizedList(new ArrayList());
    final n0 i = new n0(this);
    /* access modifiers changed from: private */
    public final Handler j;
    /* access modifiers changed from: private */
    public int k;
    /* access modifiers changed from: private */
    public boolean l;
    /* access modifiers changed from: private */
    public boolean m;
    private f81<e.a> n;
    private f81<Status> o;
    private final AtomicLong p;
    private final Object q = new Object();
    private final Object r = new Object();
    /* access modifiers changed from: private */
    public d s;
    /* access modifiers changed from: private */
    public String t;
    private double u;
    private boolean v;
    private int w;
    private int x;
    private y y;
    /* access modifiers changed from: private */
    public final CastDevice z;

    static {
        o0 o0Var = new o0();
        F = o0Var;
        G = new a<>("Cast.API_CXLESS", o0Var, g70.b);
    }

    c0(Context context, e.b bVar) {
        super(context, G, bVar, e.a.c);
        r.k(context, "context cannot be null");
        r.k(bVar, "CastOptions cannot be null");
        this.C = bVar.b;
        this.z = bVar.a;
        this.A = new HashMap();
        this.B = new HashMap();
        this.p = new AtomicLong(0);
        this.k = u1.a;
        l0();
        this.j = new mb0(s());
    }

    /* access modifiers changed from: private */
    public final e81<Boolean> A(d70 d70) {
        j.a b = t(d70, "castDeviceControllerListenerKey").b();
        r.k(b, "Key must not be null");
        return o(b);
    }

    /* access modifiers changed from: private */
    public final void D(long j2, int i2) {
        f81 f81;
        synchronized (this.A) {
            f81 = this.A.get(Long.valueOf(j2));
            this.A.remove(Long.valueOf(j2));
        }
        if (f81 == null) {
            return;
        }
        if (i2 == 0) {
            f81.c(null);
        } else {
            f81.b(f0(i2));
        }
    }

    /* access modifiers changed from: private */
    public final void E(e.a aVar) {
        synchronized (this.q) {
            if (this.n != null) {
                this.n.c(aVar);
            }
            this.n = null;
        }
    }

    /* access modifiers changed from: private */
    public final void G(x60 x60) {
        boolean z2;
        String i2 = x60.i();
        if (!t60.f(i2, this.t)) {
            this.t = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        E.a("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(this.m));
        if (this.C != null && (z2 || this.m)) {
            this.C.d();
        }
        this.m = false;
    }

    /* access modifiers changed from: private */
    public final void H(j80 j80) {
        boolean z2;
        boolean z3;
        boolean z4;
        d d = j80.d();
        if (!t60.f(d, this.s)) {
            this.s = d;
            this.C.c(d);
        }
        double k2 = j80.k();
        if (Double.isNaN(k2) || Math.abs(k2 - this.u) <= 1.0E-7d) {
            z2 = false;
        } else {
            this.u = k2;
            z2 = true;
        }
        boolean l2 = j80.l();
        if (l2 != this.v) {
            this.v = l2;
            z2 = true;
        }
        E.a("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(this.l));
        if (this.C != null && (z2 || this.l)) {
            this.C.f();
        }
        boolean isNaN = Double.isNaN(j80.n());
        int i2 = j80.i();
        if (i2 != this.w) {
            this.w = i2;
            z3 = true;
        } else {
            z3 = false;
        }
        E.a("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(this.l));
        if (this.C != null && (z3 || this.l)) {
            this.C.a(this.w);
        }
        int j2 = j80.j();
        if (j2 != this.x) {
            this.x = j2;
            z4 = true;
        } else {
            z4 = false;
        }
        E.a("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z4), Boolean.valueOf(this.l));
        if (this.C != null && (z4 || this.l)) {
            this.C.e(this.x);
        }
        if (!t60.f(this.y, j80.m())) {
            this.y = j80.m();
        }
        this.l = false;
    }

    private final void O(f81<e.a> f81) {
        synchronized (this.q) {
            if (this.n != null) {
                b0(2002);
            }
            this.n = f81;
        }
    }

    static final /* synthetic */ void W(h80 h80, f81 f81) {
        ((b70) h80.D()).d();
        f81.c(null);
    }

    /* access modifiers changed from: private */
    public final void b0(int i2) {
        synchronized (this.q) {
            if (this.n != null) {
                this.n.b(f0(i2));
            }
            this.n = null;
        }
    }

    static final /* synthetic */ void c0(h80 h80, f81 f81) {
        ((b70) h80.D()).m1();
        f81.c(Boolean.TRUE);
    }

    /* access modifiers changed from: private */
    public final void e0(int i2) {
        synchronized (this.r) {
            if (this.o != null) {
                if (i2 == 0) {
                    this.o.c(new Status(i2));
                } else {
                    this.o.b(f0(i2));
                }
                this.o = null;
            }
        }
    }

    private static b f0(int i2) {
        return com.google.android.gms.common.internal.b.a(new Status(i2));
    }

    /* access modifiers changed from: private */
    public final void i0() {
        E.a("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.B) {
            this.B.clear();
        }
    }

    private final void j0() {
        r.n(this.k != u1.a, "Not active connection");
    }

    /* access modifiers changed from: private */
    public final void k0() {
        this.w = -1;
        this.x = -1;
        this.s = null;
        this.t = null;
        this.u = Utils.DOUBLE_EPSILON;
        l0();
        this.v = false;
        this.y = null;
    }

    private final double l0() {
        if (this.z.p(2048)) {
            return 0.02d;
        }
        return (!this.z.p(4) || this.z.p(1) || "Chromecast Audio".equals(this.z.n())) ? 0.05d : 0.02d;
    }

    private final void x() {
        r.n(this.k == u1.b, "Not connected to device");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void F(e.d dVar, String str, h80 h80, f81 f81) {
        j0();
        if (dVar != null) {
            ((b70) h80.D()).X0(str);
        }
        f81.c(null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void N(tb0 tb0, String str, String str2, h80 h80, f81 f81) {
        long incrementAndGet = this.p.incrementAndGet();
        x();
        try {
            this.A.put(Long.valueOf(incrementAndGet), f81);
            if (tb0 == null) {
                ((b70) h80.D()).f0(str, str2, incrementAndGet);
                return;
            }
            ((b70) h80.D()).h0(str, str2, incrementAndGet, (String) tb0.a());
        } catch (RemoteException e) {
            this.A.remove(Long.valueOf(incrementAndGet));
            f81.b(e);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void P(String str, e.d dVar, h80 h80, f81 f81) {
        j0();
        ((b70) h80.D()).X0(str);
        if (dVar != null) {
            ((b70) h80.D()).v2(str);
        }
        f81.c(null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void Q(String str, j jVar, h80 h80, f81 f81) {
        x();
        ((b70) h80.D()).g3(str, jVar);
        O(f81);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void R(String str, h80 h80, f81 f81) {
        x();
        ((b70) h80.D()).l(str);
        synchronized (this.r) {
            if (this.o != null) {
                f81.b(f0(2001));
            } else {
                this.o = f81;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void S(String str, String str2, w0 w0Var, h80 h80, f81 f81) {
        x();
        ((b70) h80.D()).d0(str, str2, w0Var);
        O(f81);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void T(boolean z2, h80 h80, f81 f81) {
        ((b70) h80.D()).W0(z2, this.u, this.v);
        f81.c(null);
    }

    public final e81<Void> b() {
        j t2 = t(this.i, "castDeviceControllerListenerKey");
        n.a a = n.a();
        e0 e0Var = new e0(this);
        o oVar = d0.a;
        a.e(t2);
        a.b(e0Var);
        a.d(oVar);
        a.c(a0.b);
        return g(a.a());
    }

    public final e81<Void> c() {
        q.a a = q.a();
        a.b(i0.a);
        e81<Void> p2 = p(a.a());
        i0();
        A(this.i);
        return p2;
    }

    public final e81<Void> e(String str, String str2) {
        t60.d(str);
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        } else if (str2.length() <= 524288) {
            q.a a = q.a();
            a.b(new k0(this, (tb0) null, str, str2));
            return p(a.a());
        } else {
            E.g("Message send failed. Message exceeds maximum size", new Object[0]);
            throw new IllegalArgumentException("Message exceeds maximum size524288");
        }
    }

    public final e81<Status> f(String str) {
        q.a a = q.a();
        a.b(new l0(this, str));
        return p(a.a());
    }

    public final e81<Void> h(String str) {
        e.d remove;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.B) {
                remove = this.B.remove(str);
            }
            q.a a = q.a();
            a.b(new g0(this, remove, str));
            return p(a.a());
        }
        throw new IllegalArgumentException("Channel namespace cannot be null or empty");
    }

    public final boolean i() {
        x();
        return this.v;
    }

    public final e81<e.a> j(String str, j jVar) {
        q.a a = q.a();
        a.b(new j0(this, str, jVar));
        return p(a.a());
    }

    public final void k(v1 v1Var) {
        r.j(v1Var);
        this.D.add(v1Var);
    }

    public final e81<Void> l(boolean z2) {
        q.a a = q.a();
        a.b(new f0(this, z2));
        return p(a.a());
    }

    public final e81<e.a> m(String str, String str2) {
        q.a a = q.a();
        a.b(new m0(this, str, str2, (w0) null));
        return p(a.a());
    }

    public final e81<Void> n(String str, e.d dVar) {
        t60.d(str);
        if (dVar != null) {
            synchronized (this.B) {
                this.B.put(str, dVar);
            }
        }
        q.a a = q.a();
        a.b(new h0(this, str, dVar));
        return p(a.a());
    }
}
