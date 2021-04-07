package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.offline.h;
import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.upstream.i;
import com.google.android.exoplayer2.upstream.q;
import com.google.android.exoplayer2.upstream.t;
import com.google.android.exoplayer2.upstream.y;
import com.google.android.exoplayer2.v;
import defpackage.c20;
import defpackage.f00;
import defpackage.y10;
import java.util.List;

public final class HlsMediaSource extends uz implements c20.e {
    private final j j;
    private final Uri k;
    private final i l;
    private final zz m;
    private final rs<?> n;
    private final t o;
    private final boolean p;
    private final int q;
    private final boolean r;
    private final c20 s;
    private final Object t;
    private y u;

    public static final class Factory {
        private final i a;
        private j b;
        private b20 c;
        private List<h> d;
        private c20.a e;
        private zz f;
        private rs<?> g;
        private t h;
        private boolean i;
        private int j;
        private boolean k;
        private Object l;

        public Factory(i iVar) {
            q40.e(iVar);
            this.a = iVar;
            this.c = new u10();
            this.e = v10.u;
            this.b = j.a;
            this.g = qs.d();
            this.h = new q();
            this.f = new a00();
            this.j = 1;
        }

        public Factory(i.a aVar) {
            this((i) new e(aVar));
        }

        public HlsMediaSource a(Uri uri) {
            List<h> list = this.d;
            if (list != null) {
                this.c = new w10(this.c, list);
            }
            i iVar = this.a;
            j jVar = this.b;
            zz zzVar = this.f;
            rs<?> rsVar = this.g;
            t tVar = this.h;
            return new HlsMediaSource(uri, iVar, jVar, zzVar, rsVar, tVar, this.e.a(iVar, tVar, this.c), this.i, this.j, this.k, this.l);
        }
    }

    static {
        e0.a("goog.exo.hls");
    }

    private HlsMediaSource(Uri uri, i iVar, j jVar, zz zzVar, rs<?> rsVar, t tVar, c20 c20, boolean z, int i, boolean z2, Object obj) {
        this.k = uri;
        this.l = iVar;
        this.j = jVar;
        this.m = zzVar;
        this.n = rsVar;
        this.o = tVar;
        this.s = c20;
        this.p = z;
        this.q = i;
        this.r = z2;
        this.t = obj;
    }

    public e00 a(f00.a aVar, e eVar, long j2) {
        return new m(this.j, this.s, this.l, this.u, this.n, this.o, o(aVar), eVar, this.m, this.p, this.q, this.r);
    }

    public void c(y10 y10) {
        n00 n00;
        long j2;
        y10 y102 = y10;
        long b = y102.m ? v.b(y102.f) : -9223372036854775807L;
        int i = y102.d;
        long j3 = (i == 2 || i == 1) ? b : -9223372036854775807L;
        long j4 = y102.e;
        x10 f = this.s.f();
        q40.e(f);
        k kVar = new k(f, y102);
        if (this.s.e()) {
            long d = y102.f - this.s.d();
            long j5 = y102.l ? d + y102.p : -9223372036854775807L;
            List<y10.a> list = y102.o;
            if (j4 != -9223372036854775807L) {
                j2 = j4;
            } else if (!list.isEmpty()) {
                int max = Math.max(0, list.size() - 3);
                long j6 = y102.p - (y102.k * 2);
                while (max > 0 && list.get(max).i > j6) {
                    max--;
                }
                j2 = list.get(max).i;
            } else {
                j2 = 0;
            }
            n00 = new n00(j3, b, j5, y102.p, d, j2, true, !y102.l, true, kVar, this.t);
        } else {
            long j7 = j4 == -9223372036854775807L ? 0 : j4;
            long j8 = y102.p;
            n00 = new n00(j3, b, j8, j8, 0, j7, true, false, false, kVar, this.t);
        }
        v(n00);
    }

    public void h() {
        this.s.h();
    }

    public void i(e00 e00) {
        ((m) e00).B();
    }

    /* access modifiers changed from: protected */
    public void u(y yVar) {
        this.u = yVar;
        this.n.t();
        this.s.g(this.k, o((f00.a) null), this);
    }

    /* access modifiers changed from: protected */
    public void w() {
        this.s.stop();
        this.n.a();
    }
}
