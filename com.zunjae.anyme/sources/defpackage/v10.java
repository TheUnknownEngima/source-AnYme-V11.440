package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.m0;
import com.google.android.exoplayer2.source.hls.i;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.upstream.t;
import com.google.android.exoplayer2.upstream.u;
import com.google.android.exoplayer2.upstream.w;
import com.google.android.exoplayer2.v;
import defpackage.c20;
import defpackage.g00;
import defpackage.x10;
import defpackage.y10;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: v10  reason: default package */
public final class v10 implements c20, u.b<w<z10>> {
    public static final c20.a u = t10.a;
    /* access modifiers changed from: private */
    public final i e;
    private final b20 f;
    /* access modifiers changed from: private */
    public final t g;
    private final HashMap<Uri, a> h;
    private final List<c20.b> i;
    /* access modifiers changed from: private */
    public final double j;
    /* access modifiers changed from: private */
    public w.a<z10> k;
    /* access modifiers changed from: private */
    public g00.a l;
    private u m;
    /* access modifiers changed from: private */
    public Handler n;
    private c20.e o;
    private x10 p;
    /* access modifiers changed from: private */
    public Uri q;
    private y10 r;
    private boolean s;
    private long t;

    /* renamed from: v10$a */
    private final class a implements u.b<w<z10>>, Runnable {
        /* access modifiers changed from: private */
        public final Uri e;
        private final u f = new u("DefaultHlsPlaylistTracker:MediaPlaylist");
        private final w<z10> g;
        private y10 h;
        private long i;
        private long j;
        private long k;
        /* access modifiers changed from: private */
        public long l;
        private boolean m;
        private IOException n;

        public a(Uri uri) {
            this.e = uri;
            this.g = new w<>(v10.this.e.a(4), uri, 4, v10.this.k);
        }

        private boolean d(long j2) {
            this.l = SystemClock.elapsedRealtime() + j2;
            return this.e.equals(v10.this.q) && !v10.this.F();
        }

        private void h() {
            long n2 = this.f.n(this.g, this, v10.this.g.c(this.g.b));
            g00.a v = v10.this.l;
            w<z10> wVar = this.g;
            v.y(wVar.a, wVar.b, n2);
        }

        /* access modifiers changed from: private */
        public void o(y10 y10, long j2) {
            y10 y102 = y10;
            y10 y103 = this.h;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.i = elapsedRealtime;
            y10 y = v10.this.B(y103, y102);
            this.h = y;
            if (y != y103) {
                this.n = null;
                this.j = elapsedRealtime;
                v10.this.L(this.e, y);
            } else if (!y.l) {
                y10 y104 = this.h;
                if (y102.i + ((long) y102.o.size()) < y104.i) {
                    this.n = new c20.c(this.e);
                    boolean unused = v10.this.H(this.e, -9223372036854775807L);
                } else if (((double) (elapsedRealtime - this.j)) > ((double) v.b(y104.k)) * v10.this.j) {
                    this.n = new c20.d(this.e);
                    long b = v10.this.g.b(4, j2, this.n, 1);
                    boolean unused2 = v10.this.H(this.e, b);
                    if (b != -9223372036854775807L) {
                        d(b);
                    }
                }
            }
            y10 y105 = this.h;
            this.k = elapsedRealtime + v.b(y105 != y103 ? y105.k : y105.k / 2);
            if (this.e.equals(v10.this.q) && !this.h.l) {
                g();
            }
        }

        public y10 e() {
            return this.h;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
            r0 = r0.d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean f() {
            /*
                r10 = this;
                y10 r0 = r10.h
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                long r2 = android.os.SystemClock.elapsedRealtime()
                r4 = 30000(0x7530, double:1.4822E-319)
                y10 r0 = r10.h
                long r6 = r0.p
                long r6 = com.google.android.exoplayer2.v.b(r6)
                long r4 = java.lang.Math.max(r4, r6)
                y10 r0 = r10.h
                boolean r6 = r0.l
                r7 = 1
                if (r6 != 0) goto L_0x002d
                int r0 = r0.d
                r6 = 2
                if (r0 == r6) goto L_0x002d
                if (r0 == r7) goto L_0x002d
                long r8 = r10.i
                long r8 = r8 + r4
                int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r0 <= 0) goto L_0x002e
            L_0x002d:
                r1 = 1
            L_0x002e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.v10.a.f():boolean");
        }

        public void g() {
            this.l = 0;
            if (!this.m && !this.f.j() && !this.f.i()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime < this.k) {
                    this.m = true;
                    v10.this.n.postDelayed(this, this.k - elapsedRealtime);
                    return;
                }
                h();
            }
        }

        public void i() {
            this.f.a();
            IOException iOException = this.n;
            if (iOException != null) {
                throw iOException;
            }
        }

        /* renamed from: j */
        public void l(w<z10> wVar, long j2, long j3, boolean z) {
            v10.this.l.p(wVar.a, wVar.f(), wVar.d(), 4, j2, j3, wVar.b());
        }

        /* renamed from: k */
        public void m(w<z10> wVar, long j2, long j3) {
            z10 e2 = wVar.e();
            if (e2 instanceof y10) {
                long j4 = j3;
                o((y10) e2, j4);
                v10.this.l.s(wVar.a, wVar.f(), wVar.d(), 4, j2, j4, wVar.b());
                return;
            }
            this.n = new m0("Loaded playlist has unexpected type.");
        }

        /* renamed from: n */
        public u.c t(w<z10> wVar, long j2, long j3, IOException iOException, int i2) {
            u.c cVar;
            w<z10> wVar2 = wVar;
            long b = v10.this.g.b(wVar2.b, j3, iOException, i2);
            boolean z = b != -9223372036854775807L;
            boolean z2 = v10.this.H(this.e, b) || !z;
            if (z) {
                z2 |= d(b);
            }
            if (z2) {
                long a = v10.this.g.a(wVar2.b, j3, iOException, i2);
                cVar = a != -9223372036854775807L ? u.h(false, a) : u.e;
            } else {
                cVar = u.d;
            }
            v10.this.l.v(wVar2.a, wVar.f(), wVar.d(), 4, j2, j3, wVar.b(), iOException, !cVar.c());
            return cVar;
        }

        public void p() {
            this.f.l();
        }

        public void run() {
            this.m = false;
            h();
        }
    }

    public v10(i iVar, t tVar, b20 b20) {
        this(iVar, tVar, b20, 3.5d);
    }

    public v10(i iVar, t tVar, b20 b20, double d) {
        this.e = iVar;
        this.f = b20;
        this.g = tVar;
        this.j = d;
        this.i = new ArrayList();
        this.h = new HashMap<>();
        this.t = -9223372036854775807L;
    }

    private static y10.a A(y10 y10, y10 y102) {
        int i2 = (int) (y102.i - y10.i);
        List<y10.a> list = y10.o;
        if (i2 < list.size()) {
            return list.get(i2);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public y10 B(y10 y10, y10 y102) {
        return !y102.f(y10) ? y102.l ? y10.d() : y10 : y102.c(D(y10, y102), C(y10, y102));
    }

    private int C(y10 y10, y10 y102) {
        y10.a A;
        if (y102.g) {
            return y102.h;
        }
        y10 y103 = this.r;
        int i2 = y103 != null ? y103.h : 0;
        return (y10 == null || (A = A(y10, y102)) == null) ? i2 : (y10.h + A.h) - y102.o.get(0).h;
    }

    private long D(y10 y10, y10 y102) {
        if (y102.m) {
            return y102.f;
        }
        y10 y103 = this.r;
        long j2 = y103 != null ? y103.f : 0;
        if (y10 == null) {
            return j2;
        }
        int size = y10.o.size();
        y10.a A = A(y10, y102);
        return A != null ? y10.f + A.i : ((long) size) == y102.i - y10.i ? y10.e() : j2;
    }

    private boolean E(Uri uri) {
        List<x10.b> list = this.p.e;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (uri.equals(list.get(i2).a)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public boolean F() {
        List<x10.b> list = this.p.e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = this.h.get(list.get(i2).a);
            if (elapsedRealtime > aVar.l) {
                this.q = aVar.e;
                aVar.g();
                return true;
            }
        }
        return false;
    }

    private void G(Uri uri) {
        if (!uri.equals(this.q) && E(uri)) {
            y10 y10 = this.r;
            if (y10 == null || !y10.l) {
                this.q = uri;
                this.h.get(uri).g();
            }
        }
    }

    /* access modifiers changed from: private */
    public boolean H(Uri uri, long j2) {
        int size = this.i.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            z |= !this.i.get(i2).i(uri, j2);
        }
        return z;
    }

    /* access modifiers changed from: private */
    public void L(Uri uri, y10 y10) {
        if (uri.equals(this.q)) {
            if (this.r == null) {
                this.s = !y10.l;
                this.t = y10.f;
            }
            this.r = y10;
            this.o.c(y10);
        }
        int size = this.i.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.i.get(i2).f();
        }
    }

    private void z(List<Uri> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Uri uri = list.get(i2);
            this.h.put(uri, new a(uri));
        }
    }

    /* renamed from: I */
    public void l(w<z10> wVar, long j2, long j3, boolean z) {
        g00.a aVar = this.l;
        l lVar = wVar.a;
        Uri f2 = wVar.f();
        aVar.p(lVar, f2, wVar.d(), 4, j2, j3, wVar.b());
    }

    /* renamed from: J */
    public void m(w<z10> wVar, long j2, long j3) {
        z10 e2 = wVar.e();
        boolean z = e2 instanceof y10;
        x10 e3 = z ? x10.e(e2.a) : (x10) e2;
        this.p = e3;
        this.k = this.f.a(e3);
        this.q = e3.e.get(0).a;
        z(e3.d);
        a aVar = this.h.get(this.q);
        if (z) {
            aVar.o((y10) e2, j3);
        } else {
            long j4 = j3;
            aVar.g();
        }
        this.l.s(wVar.a, wVar.f(), wVar.d(), 4, j2, j3, wVar.b());
    }

    /* renamed from: K */
    public u.c t(w<z10> wVar, long j2, long j3, IOException iOException, int i2) {
        w<z10> wVar2 = wVar;
        long a2 = this.g.a(wVar2.b, j3, iOException, i2);
        boolean z = a2 == -9223372036854775807L;
        this.l.v(wVar2.a, wVar.f(), wVar.d(), 4, j2, j3, wVar.b(), iOException, z);
        return z ? u.e : u.h(false, a2);
    }

    public boolean a(Uri uri) {
        return this.h.get(uri).f();
    }

    public void b(c20.b bVar) {
        this.i.remove(bVar);
    }

    public void c(Uri uri) {
        this.h.get(uri).i();
    }

    public long d() {
        return this.t;
    }

    public boolean e() {
        return this.s;
    }

    public x10 f() {
        return this.p;
    }

    public void g(Uri uri, g00.a aVar, c20.e eVar) {
        this.n = new Handler();
        this.l = aVar;
        this.o = eVar;
        w wVar = new w(this.e.a(4), uri, 4, this.f.b());
        q40.f(this.m == null);
        u uVar = new u("DefaultHlsPlaylistTracker:MasterPlaylist");
        this.m = uVar;
        aVar.y(wVar.a, wVar.b, uVar.n(wVar, this, this.g.c(wVar.b)));
    }

    public void h() {
        u uVar = this.m;
        if (uVar != null) {
            uVar.a();
        }
        Uri uri = this.q;
        if (uri != null) {
            c(uri);
        }
    }

    public void i(Uri uri) {
        this.h.get(uri).g();
    }

    public void j(c20.b bVar) {
        this.i.add(bVar);
    }

    public y10 k(Uri uri, boolean z) {
        y10 e2 = this.h.get(uri).e();
        if (e2 != null && z) {
            G(uri);
        }
        return e2;
    }

    public void stop() {
        this.q = null;
        this.r = null;
        this.p = null;
        this.t = -9223372036854775807L;
        this.m.l();
        this.m = null;
        for (a p2 : this.h.values()) {
            p2.p();
        }
        this.n.removeCallbacksAndMessages((Object) null);
        this.n = null;
        this.h.clear();
    }
}
