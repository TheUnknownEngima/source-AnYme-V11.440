package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.e;
import com.google.android.gms.cast.framework.b;
import com.google.android.gms.cast.j;
import com.google.android.gms.cast.t1;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;

/* renamed from: to0  reason: default package */
public final class to0 implements so0 {
    private static final u60 h = new u60("CastApiAdapter");
    private final bp0 a;
    private final Context b;
    private final CastDevice c;
    private final b d;
    private final e.c e;
    /* access modifiers changed from: private */
    public final co0 f;
    private t1 g;

    public to0(bp0 bp0, Context context, CastDevice castDevice, b bVar, e.c cVar, co0 co0) {
        this.a = bp0;
        this.b = context;
        this.c = castDevice;
        this.d = bVar;
        this.e = cVar;
        this.f = co0;
    }

    static final /* synthetic */ e.a j(Status status) {
        return new o90(status);
    }

    static final /* synthetic */ Status k(Void voidR) {
        return new Status(0);
    }

    static final /* synthetic */ e.a n(e.a aVar) {
        return aVar;
    }

    static final /* synthetic */ e.a o(Status status) {
        return new o90(status);
    }

    static final /* synthetic */ e.a p(e.a aVar) {
        return aVar;
    }

    static final /* synthetic */ Status q(Status status) {
        return status;
    }

    public final void a(boolean z) {
        t1 t1Var = this.g;
        if (t1Var != null) {
            t1Var.l(z);
        }
    }

    public final g<Status> b(String str, String str2) {
        t1 t1Var = this.g;
        if (t1Var != null) {
            return ea0.a(t1Var.e(str, str2), wo0.a, vo0.a);
        }
        return null;
    }

    public final void c(String str, e.d dVar) {
        t1 t1Var = this.g;
        if (t1Var != null) {
            t1Var.n(str, dVar);
        }
    }

    public final void d() {
        t1 t1Var = this.g;
        if (t1Var != null) {
            t1Var.c();
            this.g = null;
        }
    }

    public final g<e.a> e(String str, String str2) {
        t1 t1Var = this.g;
        if (t1Var != null) {
            return ea0.a(t1Var.m(str, str2), yo0.a, xo0.a);
        }
        return null;
    }

    public final void f(String str) {
        t1 t1Var = this.g;
        if (t1Var != null) {
            t1Var.h(str);
        }
    }

    public final void g() {
        t1 t1Var = this.g;
        if (t1Var != null) {
            t1Var.c();
            this.g = null;
        }
        boolean z = true;
        h.a("Acquiring a connection to Google Play Services for %s", this.c);
        p90 p90 = new p90(this);
        bp0 bp0 = this.a;
        Context context = this.b;
        Bundle bundle = new Bundle();
        b bVar = this.d;
        bundle.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", (bVar == null || bVar.i() == null || this.d.i().m() == null) ? false : true);
        b bVar2 = this.d;
        if (bVar2 == null || bVar2.i() == null || !this.d.i().n()) {
            z = false;
        }
        bundle.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z);
        e.b.a aVar = new e.b.a(this.c, this.e);
        aVar.c(bundle);
        t1 a2 = bp0.a(context, aVar.a(), p90);
        this.g = a2;
        a2.b();
    }

    public final g<e.a> h(String str, j jVar) {
        t1 t1Var = this.g;
        if (t1Var != null) {
            return ea0.a(t1Var.j(str, jVar), ap0.a, zo0.a);
        }
        return null;
    }

    public final boolean i() {
        t1 t1Var = this.g;
        return t1Var != null && t1Var.i();
    }

    public final void l(String str) {
        t1 t1Var = this.g;
        if (t1Var != null) {
            t1Var.f(str);
        }
    }
}
