package com.google.android.gms.cast.framework.media;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.e;
import com.google.android.gms.cast.o;
import com.google.android.gms.cast.p;
import com.google.android.gms.cast.q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.internal.r;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

public class i implements e.d {
    /* access modifiers changed from: private */
    public final Object a = new Object();
    /* access modifiers changed from: private */
    public final Handler b = new mb0(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public final i70 c;
    private final f d = new f();
    private final d e;
    private so0 f;
    /* access modifiers changed from: private */
    public final List<b> g = new CopyOnWriteArrayList();
    final List<a> h = new CopyOnWriteArrayList();
    private final Map<e, j> i = new ConcurrentHashMap();
    private final Map<Long, j> j = new ConcurrentHashMap();
    /* access modifiers changed from: private */
    public d k;

    public static abstract class a {
        public void a() {
        }

        public void b(MediaError mediaError) {
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }

        public void f() {
        }

        public void g() {
        }

        public void h(int[] iArr) {
        }

        public void i(int[] iArr, int i) {
        }

        public void j(o[] oVarArr) {
        }

        public void k(int[] iArr) {
        }

        public void l(int[] iArr) {
        }
    }

    @Deprecated
    public interface b {
        void a();

        void b();

        void c();

        void d();

        void e();

        void f();
    }

    public interface c extends com.google.android.gms.common.api.j {
    }

    public interface d {
        List<com.google.android.gms.cast.b> a(q qVar);

        boolean b(q qVar);
    }

    public interface e {
        void a(long j, long j2);
    }

    class f implements l70 {
        private so0 a;
        private long b = 0;

        public f() {
        }

        public final void a(so0 so0) {
            this.a = so0;
        }

        public final long e() {
            long j = this.b + 1;
            this.b = j;
            return j;
        }

        public final void f(String str, String str2, long j, String str3) {
            so0 so0 = this.a;
            if (so0 != null) {
                so0.b(str, str2).b(new s(this, j));
                return;
            }
            throw new IllegalStateException("No GoogleApiClient available");
        }
    }

    static class g extends BasePendingResult<c> {
        g() {
            super((com.google.android.gms.common.api.f) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public final c c(Status status) {
            return new t(this, status);
        }
    }

    abstract class h extends BasePendingResult<c> {
        o70 n;
        private final boolean o;

        h(i iVar) {
            this(false);
        }

        h(boolean z) {
            super((com.google.android.gms.common.api.f) null);
            this.o = z;
            this.n = new v(this, i.this);
        }

        public /* synthetic */ com.google.android.gms.common.api.j c(Status status) {
            return new u(this, status);
        }

        /* access modifiers changed from: package-private */
        public abstract void n();

        public final void o() {
            if (!this.o) {
                for (b f : i.this.g) {
                    f.f();
                }
                for (a f2 : i.this.h) {
                    f2.f();
                }
            }
            try {
                synchronized (i.this.a) {
                    n();
                }
            } catch (j70 unused) {
                g((c) c(new Status(2100)));
            }
        }
    }

    /* renamed from: com.google.android.gms.cast.framework.media.i$i  reason: collision with other inner class name */
    static final class C0086i implements c {
        private final Status e;

        C0086i(Status status, JSONObject jSONObject, MediaError mediaError) {
            this.e = status;
        }

        public final Status g() {
            return this.e;
        }
    }

    class j {
        /* access modifiers changed from: private */
        public final Set<e> a = new HashSet();
        /* access modifiers changed from: private */
        public final long b;
        private final Runnable c;
        private boolean d;

        public j(long j) {
            this.b = j;
            this.c = new x(this, i.this);
        }

        public final boolean a() {
            return !this.a.isEmpty();
        }

        public final boolean b() {
            return this.d;
        }

        public final void c() {
            i.this.b.removeCallbacks(this.c);
            this.d = true;
            i.this.b.postDelayed(this.c, this.b);
        }

        public final void d() {
            i.this.b.removeCallbacks(this.c);
            this.d = false;
        }

        public final void f(e eVar) {
            this.a.add(eVar);
        }

        public final void h(e eVar) {
            this.a.remove(eVar);
        }

        public final long i() {
            return this.b;
        }
    }

    static {
        String str = i70.B;
    }

    public i(i70 i70) {
        r.j(i70);
        i70 i702 = i70;
        this.c = i702;
        i702.B(new r0(this));
        this.c.c(this.d);
        this.e = new d(this);
    }

    private static h M(h hVar) {
        try {
            hVar.o();
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (Throwable unused) {
            hVar.g((c) hVar.c(new Status(2100)));
        }
        return hVar;
    }

    public static com.google.android.gms.common.api.g<c> N(int i2, String str) {
        g gVar = new g();
        gVar.g(gVar.c(new Status(i2, str)));
        return gVar;
    }

    /* access modifiers changed from: private */
    public final void S(Set<e> set) {
        HashSet<e> hashSet = new HashSet<>(set);
        if (t() || s() || p() || W()) {
            for (e a2 : hashSet) {
                a2.a(g(), n());
            }
        } else if (r()) {
            o i2 = i();
            if (i2 != null && i2.m() != null) {
                for (e a3 : hashSet) {
                    a3.a(0, i2.m().y());
                }
            }
        } else {
            for (e a4 : hashSet) {
                a4.a(0, 0);
            }
        }
    }

    private final boolean W() {
        r.e("Must be called from the main thread.");
        q k2 = k();
        return k2 != null && k2.D() == 5;
    }

    private final boolean X() {
        return this.f != null;
    }

    /* access modifiers changed from: private */
    public final void Z() {
        for (j next : this.j.values()) {
            if (o() && !next.b()) {
                next.c();
            } else if (!o() && next.b()) {
                next.d();
            }
            if (next.b() && (p() || W() || s() || r())) {
                S(next.a);
            }
        }
    }

    public com.google.android.gms.common.api.g<c> A(JSONObject jSONObject) {
        r.e("Must be called from the main thread.");
        if (!X()) {
            return N(17, (String) null);
        }
        l lVar = new l(this, jSONObject);
        M(lVar);
        return lVar;
    }

    public com.google.android.gms.common.api.g<c> B(JSONObject jSONObject) {
        r.e("Must be called from the main thread.");
        if (!X()) {
            return N(17, (String) null);
        }
        m mVar = new m(this, jSONObject);
        M(mVar);
        return mVar;
    }

    public void C(a aVar) {
        r.e("Must be called from the main thread.");
        if (aVar != null) {
            this.h.add(aVar);
        }
    }

    @Deprecated
    public void D(b bVar) {
        r.e("Must be called from the main thread.");
        if (bVar != null) {
            this.g.remove(bVar);
        }
    }

    public void E(e eVar) {
        r.e("Must be called from the main thread.");
        j remove = this.i.remove(eVar);
        if (remove != null) {
            remove.h(eVar);
            if (!remove.a()) {
                this.j.remove(Long.valueOf(remove.i()));
                remove.d();
            }
        }
    }

    public com.google.android.gms.common.api.g<c> F() {
        r.e("Must be called from the main thread.");
        if (!X()) {
            return N(17, (String) null);
        }
        s0 s0Var = new s0(this);
        M(s0Var);
        return s0Var;
    }

    @Deprecated
    public com.google.android.gms.common.api.g<c> G(long j2) {
        return H(j2, 0, (JSONObject) null);
    }

    @Deprecated
    public com.google.android.gms.common.api.g<c> H(long j2, int i2, JSONObject jSONObject) {
        p.a aVar = new p.a();
        aVar.d(j2);
        aVar.e(i2);
        aVar.b(jSONObject);
        return I(aVar.a());
    }

    public com.google.android.gms.common.api.g<c> I(p pVar) {
        r.e("Must be called from the main thread.");
        if (!X()) {
            return N(17, (String) null);
        }
        r rVar = new r(this, pVar);
        M(rVar);
        return rVar;
    }

    public com.google.android.gms.common.api.g<c> J(long[] jArr) {
        r.e("Must be called from the main thread.");
        if (!X()) {
            return N(17, (String) null);
        }
        u0 u0Var = new u0(this, jArr);
        M(u0Var);
        return u0Var;
    }

    public com.google.android.gms.common.api.g<c> K() {
        r.e("Must be called from the main thread.");
        if (!X()) {
            return N(17, (String) null);
        }
        t0 t0Var = new t0(this);
        M(t0Var);
        return t0Var;
    }

    public void L() {
        r.e("Must be called from the main thread.");
        int m = m();
        if (m == 4 || m == 2) {
            w();
        } else {
            y();
        }
    }

    public final void Q(so0 so0) {
        so0 so02 = this.f;
        if (so02 != so0) {
            if (so02 != null) {
                this.c.e();
                this.e.a();
                try {
                    this.f.f(l());
                } catch (IOException unused) {
                }
                this.d.a((so0) null);
                this.b.removeCallbacksAndMessages((Object) null);
            }
            this.f = so0;
            if (so0 != null) {
                this.d.a(so0);
            }
        }
    }

    public final void U() {
        so0 so0 = this.f;
        if (so0 != null) {
            try {
                so0.c(l(), this);
            } catch (IOException unused) {
            }
            F();
        }
    }

    public final com.google.android.gms.common.api.g<c> V() {
        r.e("Must be called from the main thread.");
        if (!X()) {
            return N(17, (String) null);
        }
        o oVar = new o(this, true);
        M(oVar);
        return oVar;
    }

    public void a(CastDevice castDevice, String str, String str2) {
        this.c.K(str2);
    }

    @Deprecated
    public void b(b bVar) {
        r.e("Must be called from the main thread.");
        if (bVar != null) {
            this.g.add(bVar);
        }
    }

    public boolean c(e eVar, long j2) {
        r.e("Must be called from the main thread.");
        if (eVar == null || this.i.containsKey(eVar)) {
            return false;
        }
        j jVar = this.j.get(Long.valueOf(j2));
        if (jVar == null) {
            jVar = new j(j2);
            this.j.put(Long.valueOf(j2), jVar);
        }
        jVar.f(eVar);
        this.i.put(eVar, jVar);
        if (!o()) {
            return true;
        }
        jVar.c();
        return true;
    }

    public final com.google.android.gms.common.api.g<c> c0(int[] iArr) {
        r.e("Must be called from the main thread.");
        if (!X()) {
            return N(17, (String) null);
        }
        n nVar = new n(this, true, iArr);
        M(nVar);
        return nVar;
    }

    public long d() {
        long i2;
        synchronized (this.a) {
            r.e("Must be called from the main thread.");
            i2 = this.c.i();
        }
        return i2;
    }

    public long e() {
        long j2;
        synchronized (this.a) {
            r.e("Must be called from the main thread.");
            j2 = this.c.j();
        }
        return j2;
    }

    public long f() {
        long k2;
        synchronized (this.a) {
            r.e("Must be called from the main thread.");
            k2 = this.c.k();
        }
        return k2;
    }

    public long g() {
        long l;
        synchronized (this.a) {
            r.e("Must be called from the main thread.");
            l = this.c.l();
        }
        return l;
    }

    public int h() {
        int m;
        synchronized (this.a) {
            r.e("Must be called from the main thread.");
            q k2 = k();
            m = k2 != null ? k2.m() : 0;
        }
        return m;
    }

    public o i() {
        r.e("Must be called from the main thread.");
        q k2 = k();
        if (k2 == null) {
            return null;
        }
        return k2.J(k2.u());
    }

    public MediaInfo j() {
        MediaInfo m;
        synchronized (this.a) {
            r.e("Must be called from the main thread.");
            m = this.c.m();
        }
        return m;
    }

    public q k() {
        q n;
        synchronized (this.a) {
            r.e("Must be called from the main thread.");
            n = this.c.n();
        }
        return n;
    }

    public String l() {
        r.e("Must be called from the main thread.");
        return this.c.a();
    }

    public int m() {
        int D;
        synchronized (this.a) {
            r.e("Must be called from the main thread.");
            q k2 = k();
            D = k2 != null ? k2.D() : 1;
        }
        return D;
    }

    public long n() {
        long o;
        synchronized (this.a) {
            r.e("Must be called from the main thread.");
            o = this.c.o();
        }
        return o;
    }

    public boolean o() {
        r.e("Must be called from the main thread.");
        return p() || W() || t() || s() || r();
    }

    public boolean p() {
        r.e("Must be called from the main thread.");
        q k2 = k();
        return k2 != null && k2.D() == 4;
    }

    public boolean q() {
        r.e("Must be called from the main thread.");
        MediaInfo j2 = j();
        return j2 != null && j2.z() == 2;
    }

    public boolean r() {
        r.e("Must be called from the main thread.");
        q k2 = k();
        return (k2 == null || k2.u() == 0) ? false : true;
    }

    public boolean s() {
        r.e("Must be called from the main thread.");
        q k2 = k();
        if (k2 == null) {
            return false;
        }
        if (k2.D() != 3) {
            return q() && h() == 2;
        }
        return true;
    }

    public boolean t() {
        r.e("Must be called from the main thread.");
        q k2 = k();
        return k2 != null && k2.D() == 2;
    }

    public boolean u() {
        r.e("Must be called from the main thread.");
        q k2 = k();
        return k2 != null && k2.j0();
    }

    public final boolean v() {
        r.e("Must be called from the main thread.");
        if (!q()) {
            return true;
        }
        q k2 = k();
        return (k2 == null || !k2.d0(2) || k2.p() == null) ? false : true;
    }

    public com.google.android.gms.common.api.g<c> w() {
        return x((JSONObject) null);
    }

    public com.google.android.gms.common.api.g<c> x(JSONObject jSONObject) {
        r.e("Must be called from the main thread.");
        if (!X()) {
            return N(17, (String) null);
        }
        p pVar = new p(this, jSONObject);
        M(pVar);
        return pVar;
    }

    public com.google.android.gms.common.api.g<c> y() {
        return z((JSONObject) null);
    }

    public com.google.android.gms.common.api.g<c> z(JSONObject jSONObject) {
        r.e("Must be called from the main thread.");
        if (!X()) {
            return N(17, (String) null);
        }
        q qVar = new q(this, jSONObject);
        M(qVar);
        return qVar;
    }
}
