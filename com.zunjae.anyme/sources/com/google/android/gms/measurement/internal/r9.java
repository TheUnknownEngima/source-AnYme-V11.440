package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;

final class r9 {
    final /* synthetic */ j9 a;

    r9(j9 j9Var) {
        this.a = j9Var;
    }

    private final void c(long j, boolean z) {
        this.a.b();
        if (this.a.a.p()) {
            this.a.i().u.b(j);
            this.a.h().M().b("Session started, time", Long.valueOf(this.a.l().a()));
            Long valueOf = Long.valueOf(j / 1000);
            this.a.p().Z("auto", "_sid", valueOf, j);
            this.a.i().r.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.a.j().s(u.m0) && z) {
                bundle.putLong("_aib", 1);
            }
            this.a.p().U("auto", "_s", j, bundle);
            if (o31.a() && this.a.j().s(u.r0)) {
                String a2 = this.a.i().z.a();
                if (!TextUtils.isEmpty(a2)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", a2);
                    this.a.p().U("auto", "_ssr", j, bundle2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.a.b();
        if (this.a.i().x(this.a.l().c())) {
            this.a.i().r.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.a.h().M().a("Detected application was in foreground");
                c(this.a.l().c(), false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(long j, boolean z) {
        this.a.b();
        this.a.F();
        if (this.a.i().x(j)) {
            this.a.i().r.a(true);
        }
        this.a.i().u.b(j);
        if (this.a.i().r.b()) {
            c(j, z);
        }
    }
}
