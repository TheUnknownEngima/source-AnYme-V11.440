package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.e;
import com.google.android.gms.cast.framework.media.i;
import com.google.android.gms.cast.framework.media.internal.l;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.internal.r;
import java.util.HashSet;
import java.util.Set;

public class c extends f {
    /* access modifiers changed from: private */
    public static final u60 n = new u60("CastSession");
    private final Context d;
    /* access modifiers changed from: private */
    public final Set<e.c> e = new HashSet();
    /* access modifiers changed from: private */
    public final a0 f;
    private final b g;
    /* access modifiers changed from: private */
    public final l h;
    private final uo0 i;
    /* access modifiers changed from: private */
    public so0 j;
    /* access modifiers changed from: private */
    public i k;
    private CastDevice l;
    /* access modifiers changed from: private */
    public e.a m;

    class a implements k<e.a> {
        private String a;

        a(String str) {
            this.a = str;
        }

        public final /* synthetic */ void a(j jVar) {
            e.a aVar = (e.a) jVar;
            e.a unused = c.this.m = aVar;
            try {
                if (aVar.g().l()) {
                    c.n.a("%s() -> success result", this.a);
                    i unused2 = c.this.k = new i(new i70((String) null));
                    c.this.k.Q(c.this.j);
                    c.this.k.U();
                    c.this.h.j(c.this.k, c.this.o());
                    c.this.f.w(aVar.d(), aVar.c(), aVar.h(), aVar.a());
                    return;
                }
                c.n.a("%s() -> failure result", this.a);
                c.this.f.K(aVar.g().i());
            } catch (RemoteException e) {
                c.n.b(e, "Unable to call %s on %s.", "methods", a0.class.getSimpleName());
            }
        }
    }

    class b extends e.c {
        private b() {
        }

        public final void a(int i) {
            for (e.c a2 : new HashSet(c.this.e)) {
                a2.a(i);
            }
        }

        public final void b(int i) {
            c.this.D(i);
            c.this.h(i);
            for (e.c b : new HashSet(c.this.e)) {
                b.b(i);
            }
        }

        public final void c(com.google.android.gms.cast.d dVar) {
            for (e.c c : new HashSet(c.this.e)) {
                c.c(dVar);
            }
        }

        public final void d() {
            for (e.c d : new HashSet(c.this.e)) {
                d.d();
            }
        }

        public final void e(int i) {
            for (e.c e : new HashSet(c.this.e)) {
                e.e(i);
            }
        }

        public final void f() {
            for (e.c f : new HashSet(c.this.e)) {
                f.f();
            }
        }
    }

    /* renamed from: com.google.android.gms.cast.framework.c$c  reason: collision with other inner class name */
    class C0084c extends y {
        private C0084c() {
        }

        public final void D2(String str, com.google.android.gms.cast.j jVar) {
            if (c.this.j != null) {
                c.this.j.h(str, jVar).b(new a("launchApplication"));
            }
        }

        public final int a() {
            return 12451009;
        }

        public final void c3(int i) {
            c.this.D(i);
        }

        public final void l(String str) {
            if (c.this.j != null) {
                c.this.j.l(str);
            }
        }

        public final void o0(String str, String str2) {
            if (c.this.j != null) {
                c.this.j.e(str, str2).b(new a("joinApplication"));
            }
        }
    }

    class d implements co0 {
        private d() {
        }

        public final void a(int i) {
            try {
                c.this.f.q(new com.google.android.gms.common.b(i));
            } catch (RemoteException e) {
                c.n.b(e, "Unable to call %s on %s.", "onConnectionFailed", a0.class.getSimpleName());
            }
        }

        public final void i(int i) {
            try {
                c.this.f.i(i);
            } catch (RemoteException e) {
                c.n.b(e, "Unable to call %s on %s.", "onConnectionSuspended", a0.class.getSimpleName());
            }
        }

        public final void j(Bundle bundle) {
            try {
                if (c.this.k != null) {
                    c.this.k.U();
                }
                c.this.f.j((Bundle) null);
            } catch (RemoteException e) {
                c.n.b(e, "Unable to call %s on %s.", "onConnected", a0.class.getSimpleName());
            }
        }
    }

    public c(Context context, String str, String str2, b bVar, uo0 uo0, l lVar) {
        super(context, str, str2);
        this.d = context.getApplicationContext();
        this.g = bVar;
        this.h = lVar;
        this.i = uo0;
        this.f = t90.c(context, bVar, m(), new C0084c());
    }

    private final void B(Bundle bundle) {
        CastDevice l2 = CastDevice.l(bundle);
        this.l = l2;
        if (l2 != null) {
            so0 so0 = this.j;
            if (so0 != null) {
                so0.d();
                this.j = null;
            }
            n.a("Acquiring a connection to Google Play Services for %s", this.l);
            so0 a2 = this.i.a(this.d, this.l, this.g, new b(), new d());
            this.j = a2;
            a2.g();
        } else if (e()) {
            f(3103);
        } else {
            g(3101);
        }
    }

    /* access modifiers changed from: private */
    public final void D(int i2) {
        this.h.t(i2);
        so0 so0 = this.j;
        if (so0 != null) {
            so0.d();
            this.j = null;
        }
        this.l = null;
        i iVar = this.k;
        if (iVar != null) {
            iVar.Q((so0) null);
            this.k = null;
        }
    }

    /* access modifiers changed from: protected */
    public void a(boolean z) {
        try {
            this.f.z1(z, 0);
        } catch (RemoteException e2) {
            n.b(e2, "Unable to call %s on %s.", "disconnectFromDevice", a0.class.getSimpleName());
        }
        h(0);
    }

    public long b() {
        r.e("Must be called from the main thread.");
        i iVar = this.k;
        if (iVar == null) {
            return 0;
        }
        return iVar.n() - this.k.g();
    }

    /* access modifiers changed from: protected */
    public void i(Bundle bundle) {
        this.l = CastDevice.l(bundle);
    }

    /* access modifiers changed from: protected */
    public void j(Bundle bundle) {
        this.l = CastDevice.l(bundle);
    }

    /* access modifiers changed from: protected */
    public void k(Bundle bundle) {
        B(bundle);
    }

    /* access modifiers changed from: protected */
    public void l(Bundle bundle) {
        B(bundle);
    }

    public void n(e.c cVar) {
        r.e("Must be called from the main thread.");
        if (cVar != null) {
            this.e.add(cVar);
        }
    }

    public CastDevice o() {
        r.e("Must be called from the main thread.");
        return this.l;
    }

    public i p() {
        r.e("Must be called from the main thread.");
        return this.k;
    }

    public boolean q() {
        r.e("Must be called from the main thread.");
        so0 so0 = this.j;
        return so0 != null && so0.i();
    }

    public void r(e.c cVar) {
        r.e("Must be called from the main thread.");
        if (cVar != null) {
            this.e.remove(cVar);
        }
    }

    public void s(boolean z) {
        r.e("Must be called from the main thread.");
        so0 so0 = this.j;
        if (so0 != null) {
            so0.a(z);
        }
    }
}
