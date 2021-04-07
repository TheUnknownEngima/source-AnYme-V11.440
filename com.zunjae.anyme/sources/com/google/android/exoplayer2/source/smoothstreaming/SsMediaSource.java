package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.offline.g;
import com.google.android.exoplayer2.offline.h;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import com.google.android.exoplayer2.source.smoothstreaming.c;
import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.upstream.i;
import com.google.android.exoplayer2.upstream.q;
import com.google.android.exoplayer2.upstream.t;
import com.google.android.exoplayer2.upstream.u;
import com.google.android.exoplayer2.upstream.v;
import com.google.android.exoplayer2.upstream.w;
import com.google.android.exoplayer2.upstream.y;
import defpackage.d20;
import defpackage.f00;
import defpackage.g00;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class SsMediaSource extends uz implements u.b<w<d20>> {
    private d20 A;
    private Handler B;
    private final boolean j;
    private final Uri k;
    private final i.a l;
    private final c.a m;
    private final zz n;
    private final rs<?> o;
    private final t p;
    private final long q;
    private final g00.a r;
    private final w.a<? extends d20> s;
    private final ArrayList<d> t;
    private final Object u;
    private i v;
    private u w;
    private v x;
    private y y;
    private long z;

    public static final class Factory {
        private final c.a a;
        private final i.a b;
        private w.a<? extends d20> c;
        private List<h> d;
        private zz e;
        private rs<?> f;
        private t g;
        private long h;
        private Object i;

        public Factory(c.a aVar, i.a aVar2) {
            q40.e(aVar);
            this.a = aVar;
            this.b = aVar2;
            this.f = qs.d();
            this.g = new q();
            this.h = 30000;
            this.e = new a00();
        }

        public Factory(i.a aVar) {
            this(new b.a(aVar), aVar);
        }

        public SsMediaSource a(Uri uri) {
            if (this.c == null) {
                this.c = new e20();
            }
            List<h> list = this.d;
            if (list != null) {
                this.c = new g(this.c, list);
            }
            q40.e(uri);
            return new SsMediaSource((d20) null, uri, this.b, this.c, this.a, this.e, this.f, this.g, this.h, this.i);
        }
    }

    static {
        e0.a("goog.exo.smoothstreaming");
    }

    private SsMediaSource(d20 d20, Uri uri, i.a aVar, w.a<? extends d20> aVar2, c.a aVar3, zz zzVar, rs<?> rsVar, t tVar, long j2, Object obj) {
        boolean z2 = false;
        q40.f(d20 == null || !d20.d);
        this.A = d20;
        this.k = uri == null ? null : f20.a(uri);
        this.l = aVar;
        this.s = aVar2;
        this.m = aVar3;
        this.n = zzVar;
        this.o = rsVar;
        this.p = tVar;
        this.q = j2;
        this.r = o((f00.a) null);
        this.u = obj;
        this.j = d20 != null ? true : z2;
        this.t = new ArrayList<>();
    }

    private void B() {
        n00 n00;
        for (int i = 0; i < this.t.size(); i++) {
            this.t.get(i).w(this.A);
        }
        long j2 = Long.MIN_VALUE;
        long j3 = Long.MAX_VALUE;
        for (d20.b bVar : this.A.f) {
            if (bVar.k > 0) {
                j3 = Math.min(j3, bVar.e(0));
                j2 = Math.max(j2, bVar.e(bVar.k - 1) + bVar.c(bVar.k - 1));
            }
        }
        if (j3 == Long.MAX_VALUE) {
            long j4 = this.A.d ? -9223372036854775807L : 0;
            d20 d20 = this.A;
            boolean z2 = d20.d;
            n00 = new n00(j4, 0, 0, 0, true, z2, z2, d20, this.u);
        } else {
            d20 d202 = this.A;
            if (d202.d) {
                long j5 = d202.h;
                if (j5 != -9223372036854775807L && j5 > 0) {
                    j3 = Math.max(j3, j2 - j5);
                }
                long j6 = j3;
                long j7 = j2 - j6;
                long a2 = j7 - com.google.android.exoplayer2.v.a(this.q);
                if (a2 < 5000000) {
                    a2 = Math.min(5000000, j7 / 2);
                }
                n00 = new n00(-9223372036854775807L, j7, j6, a2, true, true, true, this.A, this.u);
            } else {
                long j8 = d202.g;
                long j9 = j8 != -9223372036854775807L ? j8 : j2 - j3;
                n00 = new n00(j3 + j9, j9, j3, 0, true, false, false, this.A, this.u);
            }
        }
        v(n00);
    }

    private void C() {
        if (this.A.d) {
            this.B.postDelayed(new a(this), Math.max(0, (this.z + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    /* access modifiers changed from: private */
    public void D() {
        if (!this.w.i()) {
            w wVar = new w(this.v, this.k, 4, this.s);
            this.r.y(wVar.a, wVar.b, this.w.n(wVar, this, this.p.c(wVar.b)));
        }
    }

    /* renamed from: A */
    public u.c t(w<d20> wVar, long j2, long j3, IOException iOException, int i) {
        w<d20> wVar2 = wVar;
        long a2 = this.p.a(4, j3, iOException, i);
        u.c h = a2 == -9223372036854775807L ? u.e : u.h(false, a2);
        this.r.v(wVar2.a, wVar.f(), wVar.d(), wVar2.b, j2, j3, wVar.b(), iOException, !h.c());
        return h;
    }

    public e00 a(f00.a aVar, e eVar, long j2) {
        d dVar = new d(this.A, this.m, this.y, this.n, this.o, this.p, o(aVar), this.x, eVar);
        this.t.add(dVar);
        return dVar;
    }

    public void h() {
        this.x.a();
    }

    public void i(e00 e00) {
        ((d) e00).v();
        this.t.remove(e00);
    }

    /* access modifiers changed from: protected */
    public void u(y yVar) {
        this.y = yVar;
        this.o.t();
        if (this.j) {
            this.x = new v.a();
            B();
            return;
        }
        this.v = this.l.a();
        u uVar = new u("Loader:Manifest");
        this.w = uVar;
        this.x = uVar;
        this.B = new Handler();
        D();
    }

    /* access modifiers changed from: protected */
    public void w() {
        this.A = this.j ? this.A : null;
        this.v = null;
        this.z = 0;
        u uVar = this.w;
        if (uVar != null) {
            uVar.l();
            this.w = null;
        }
        Handler handler = this.B;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.B = null;
        }
        this.o.a();
    }

    /* renamed from: y */
    public void l(w<d20> wVar, long j2, long j3, boolean z2) {
        w<d20> wVar2 = wVar;
        this.r.p(wVar2.a, wVar.f(), wVar.d(), wVar2.b, j2, j3, wVar.b());
    }

    /* renamed from: z */
    public void m(w<d20> wVar, long j2, long j3) {
        w<d20> wVar2 = wVar;
        this.r.s(wVar2.a, wVar.f(), wVar.d(), wVar2.b, j2, j3, wVar.b());
        this.A = wVar.e();
        this.z = j2 - j3;
        B();
        C();
    }
}
