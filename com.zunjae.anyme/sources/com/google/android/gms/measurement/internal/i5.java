package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.i;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.j;
import com.google.android.gms.common.util.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class i5 extends t3 {
    /* access modifiers changed from: private */
    public final x9 a;
    private Boolean b;
    private String c;

    public i5(x9 x9Var) {
        this(x9Var, (String) null);
    }

    private i5(x9 x9Var, String str) {
        r.j(x9Var);
        this.a = x9Var;
        this.c = null;
    }

    private final void s3(Runnable runnable) {
        r.j(runnable);
        if (this.a.f().H()) {
            runnable.run();
        } else {
            this.a.f().y(runnable);
        }
    }

    private final void t3(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.b == null) {
                        if (!"com.google.android.gms".equals(this.c) && !p.a(this.a.n(), Binder.getCallingUid())) {
                            if (!j.a(this.a.n()).c(Binder.getCallingUid())) {
                                z2 = false;
                                this.b = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.b = Boolean.valueOf(z2);
                    }
                    if (this.b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.a.h().E().b("Measurement Service called with invalid calling package. appId", c4.w(str));
                    throw e;
                }
            }
            if (this.c == null && i.k(this.a.n(), Binder.getCallingUid(), str)) {
                this.c = str;
            }
            if (!str.equals(this.c)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.a.h().E().a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    private final void v3(la laVar, boolean z) {
        r.j(laVar);
        t3(laVar.e, false);
        this.a.f0().i0(laVar.f, laVar.v, laVar.z);
    }

    public final List<ea> E1(String str, String str2, boolean z, la laVar) {
        v3(laVar, false);
        try {
            List<ga> list = (List) this.a.f().v(new p5(this, laVar, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (ga gaVar : list) {
                if (z || !fa.C0(gaVar.c)) {
                    arrayList.add(new ea(gaVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.h().E().c("Failed to query user properties. appId", c4.w(laVar.e), e);
            return Collections.emptyList();
        }
    }

    public final List<ea> F1(la laVar, boolean z) {
        v3(laVar, false);
        try {
            List<ga> list = (List) this.a.f().v(new z5(this, laVar)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (ga gaVar : list) {
                if (z || !fa.C0(gaVar.c)) {
                    arrayList.add(new ea(gaVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.h().E().c("Failed to get user properties. appId", c4.w(laVar.e), e);
            return null;
        }
    }

    public final void F2(Bundle bundle, la laVar) {
        if (t41.a() && this.a.L().s(u.I0)) {
            v3(laVar, false);
            s3(new l5(this, laVar, bundle));
        }
    }

    public final void H1(la laVar) {
        v3(laVar, false);
        s3(new y5(this, laVar));
    }

    public final void M(ua uaVar, la laVar) {
        r.j(uaVar);
        r.j(uaVar.g);
        v3(laVar, false);
        ua uaVar2 = new ua(uaVar);
        uaVar2.e = laVar.e;
        s3(new n5(this, uaVar2, laVar));
    }

    public final String N0(la laVar) {
        v3(laVar, false);
        return this.a.Y(laVar);
    }

    public final void T(la laVar) {
        if (c31.a() && this.a.L().s(u.Q0)) {
            r.f(laVar.e);
            r.j(laVar.A);
            s5 s5Var = new s5(this, laVar);
            r.j(s5Var);
            if (this.a.f().H()) {
                s5Var.run();
            } else {
                this.a.f().B(s5Var);
            }
        }
    }

    public final void W1(ua uaVar) {
        r.j(uaVar);
        r.j(uaVar.g);
        t3(uaVar.e, true);
        s3(new m5(this, new ua(uaVar)));
    }

    public final void a3(s sVar, String str, String str2) {
        r.j(sVar);
        r.f(str);
        t3(str, true);
        s3(new u5(this, sVar, str));
    }

    public final void e2(la laVar) {
        v3(laVar, false);
        s3(new k5(this, laVar));
    }

    public final void j1(long j, String str, String str2, String str3) {
        s3(new b6(this, str2, str3, str, j));
    }

    public final byte[] j2(s sVar, String str) {
        r.f(str);
        r.j(sVar);
        t3(str, true);
        this.a.h().L().b("Log and bundle. event", this.a.e0().v(sVar.e));
        long b2 = this.a.l().b() / 1000000;
        try {
            byte[] bArr = (byte[]) this.a.f().A(new x5(this, sVar, str)).get();
            if (bArr == null) {
                this.a.h().E().b("Log and bundle returned null. appId", c4.w(str));
                bArr = new byte[0];
            }
            this.a.h().L().d("Log and bundle processed. event, size, time_ms", this.a.e0().v(sVar.e), Integer.valueOf(bArr.length), Long.valueOf((this.a.l().b() / 1000000) - b2));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.a.h().E().d("Failed to log and bundle. appId, event, error", c4.w(str), this.a.e0().v(sVar.e), e);
            return null;
        }
    }

    public final void k2(s sVar, la laVar) {
        r.j(sVar);
        v3(laVar, false);
        s3(new v5(this, sVar, laVar));
    }

    public final void n0(ea eaVar, la laVar) {
        r.j(eaVar);
        v3(laVar, false);
        s3(new w5(this, eaVar, laVar));
    }

    public final void n1(la laVar) {
        t3(laVar.e, false);
        s3(new t5(this, laVar));
    }

    public final List<ua> o1(String str, String str2, String str3) {
        t3(str, true);
        try {
            return (List) this.a.f().v(new q5(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.h().E().b("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    public final List<ua> p1(String str, String str2, la laVar) {
        v3(laVar, false);
        try {
            return (List) this.a.f().v(new r5(this, laVar, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.h().E().b("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void r3(la laVar, Bundle bundle) {
        this.a.Z().X(laVar.e, bundle);
    }

    /* access modifiers changed from: package-private */
    public final s u3(s sVar, la laVar) {
        n nVar;
        boolean z = false;
        if (!(!"_cmp".equals(sVar.e) || (nVar = sVar.f) == null || nVar.i() == 0)) {
            String o = sVar.f.o("_cis");
            if (!TextUtils.isEmpty(o) && (("referrer broadcast".equals(o) || "referrer API".equals(o)) && this.a.L().C(laVar.e, u.S))) {
                z = true;
            }
        }
        if (!z) {
            return sVar;
        }
        this.a.h().K().b("Event has been filtered ", sVar.toString());
        return new s("_cmpx", sVar.f, sVar.g, sVar.h);
    }

    public final List<ea> v0(String str, String str2, String str3, boolean z) {
        t3(str, true);
        try {
            List<ga> list = (List) this.a.f().v(new o5(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (ga gaVar : list) {
                if (z || !fa.C0(gaVar.c)) {
                    arrayList.add(new ea(gaVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.h().E().c("Failed to get user properties as. appId", c4.w(str), e);
            return Collections.emptyList();
        }
    }
}
