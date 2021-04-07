package defpackage;

import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.framework.f;
import com.google.android.gms.cast.framework.h;

/* renamed from: kg0  reason: default package */
final class kg0 implements h<c> {
    private final /* synthetic */ jf0 a;

    private kg0(jf0 jf0) {
        this.a = jf0;
    }

    public final /* synthetic */ void g(f fVar, int i) {
        this.a.v((c) fVar);
        this.a.a.b(this.a.b.b(this.a.f, i), kf0.APP_SESSION_SUSPENDED);
        this.a.k();
        this.a.i();
    }

    public final /* synthetic */ void h(f fVar, String str) {
        c cVar = (c) fVar;
        jf0 jf0 = this.a;
        jf0.c(jf0.e, str);
        this.a.a.b(this.a.b.f(this.a.f), kf0.APP_SESSION_RESUMING);
    }

    public final /* synthetic */ void i(f fVar, int i) {
        this.a.n((c) fVar, i);
    }

    public final /* synthetic */ void j(f fVar, String str) {
        this.a.v((c) fVar);
        this.a.f.e = str;
        this.a.a.b(this.a.b.a(this.a.f), kf0.APP_SESSION_RUNNING);
        this.a.k();
        this.a.h();
    }

    public final /* synthetic */ void k(f fVar, int i) {
        this.a.n((c) fVar, i);
    }

    public final /* synthetic */ void l(f fVar, boolean z) {
        this.a.v((c) fVar);
        this.a.a.b(this.a.b.c(this.a.f, z), kf0.APP_SESSION_RESUMED);
        this.a.k();
        this.a.h();
    }

    public final /* synthetic */ void m(f fVar, int i) {
        this.a.n((c) fVar, i);
    }

    public final /* synthetic */ void n(f fVar) {
        c cVar = (c) fVar;
        if (this.a.f != null) {
            jf0.g.g("Start a session while there's already an active session. Create a new one.", new Object[0]);
        }
        this.a.u(cVar);
        this.a.a.b(this.a.b.a(this.a.f), kf0.APP_SESSION_STARTING);
    }

    public final /* bridge */ /* synthetic */ void o(f fVar) {
        c cVar = (c) fVar;
    }
}
