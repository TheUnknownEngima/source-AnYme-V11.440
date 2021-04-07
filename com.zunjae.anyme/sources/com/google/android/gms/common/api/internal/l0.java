package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.t;
import java.util.Set;

public final class l0 extends l71 implements f.a, f.b {
    private static a.C0087a<? extends v71, g71> h = u71.c;
    private final Context a;
    private final Handler b;
    private final a.C0087a<? extends v71, g71> c;
    private Set<Scope> d;
    private d e;
    private v71 f;
    /* access modifiers changed from: private */
    public m0 g;

    public l0(Context context, Handler handler, d dVar) {
        this(context, handler, dVar, h);
    }

    public l0(Context context, Handler handler, d dVar, a.C0087a<? extends v71, g71> aVar) {
        this.a = context;
        this.b = handler;
        r.k(dVar, "ClientSettings must not be null");
        this.e = dVar;
        this.d = dVar.g();
        this.c = aVar;
    }

    /* access modifiers changed from: private */
    public final void u3(s71 s71) {
        b i = s71.i();
        if (i.m()) {
            t j = s71.j();
            i = j.j();
            if (!i.m()) {
                String valueOf = String.valueOf(i);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
            } else {
                this.g.b(j.i(), this.d);
                this.f.d();
            }
        }
        this.g.c(i);
        this.f.d();
    }

    public final void D0(s71 s71) {
        this.b.post(new n0(this, s71));
    }

    public final void i(int i) {
        this.f.d();
    }

    public final void j(Bundle bundle) {
        this.f.c(this);
    }

    public final void q(b bVar) {
        this.g.c(bVar);
    }

    public final void s3(m0 m0Var) {
        v71 v71 = this.f;
        if (v71 != null) {
            v71.d();
        }
        this.e.i(Integer.valueOf(System.identityHashCode(this)));
        a.C0087a<? extends v71, g71> aVar = this.c;
        Context context = this.a;
        Looper looper = this.b.getLooper();
        d dVar = this.e;
        this.f = (v71) aVar.a(context, looper, dVar, dVar.h(), this, this);
        this.g = m0Var;
        Set<Scope> set = this.d;
        if (set == null || set.isEmpty()) {
            this.b.post(new k0(this));
        } else {
            this.f.g();
        }
    }

    public final void t3() {
        v71 v71 = this.f;
        if (v71 != null) {
            v71.d();
        }
    }
}
