package defpackage;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.g0;
import com.google.android.exoplayer2.m0;
import com.google.android.exoplayer2.upstream.i;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.upstream.t;
import com.google.android.exoplayer2.upstream.u;
import com.google.android.exoplayer2.upstream.x;
import com.google.android.exoplayer2.z0;
import defpackage.d00;
import defpackage.e00;
import defpackage.g00;
import defpackage.k00;
import defpackage.tt;
import defpackage.vt;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: h00  reason: default package */
final class h00 implements e00, jt, u.b<a>, u.f, k00.b {
    /* access modifiers changed from: private */
    public static final Map<String, String> Q = G();
    /* access modifiers changed from: private */
    public static final f0 R = f0.u("icy", "application/x-icy", Long.MAX_VALUE);
    private d A;
    private boolean B;
    private int C;
    private boolean D;
    private boolean E;
    private boolean F;
    private int G;
    private long H;
    private long I;
    private boolean J;
    private long K;
    private long L;
    private boolean M;
    private int N;
    private boolean O;
    private boolean P;
    private final Uri e;
    private final i f;
    private final rs<?> g;
    private final t h;
    private final g00.a i;
    private final c j;
    private final com.google.android.exoplayer2.upstream.e k;
    /* access modifiers changed from: private */
    public final String l;
    /* access modifiers changed from: private */
    public final long m;
    private final u n = new u("Loader:ProgressiveMediaPeriod");
    private final b o;
    private final u40 p;
    private final Runnable q;
    /* access modifiers changed from: private */
    public final Runnable r;
    /* access modifiers changed from: private */
    public final Handler s;
    private e00.a t;
    private tt u;
    /* access modifiers changed from: private */
    public ly v;
    private k00[] w;
    private f[] x;
    private boolean y;
    private boolean z;

    /* renamed from: h00$a */
    final class a implements u.e, d00.a {
        private final Uri a;
        /* access modifiers changed from: private */
        public final x b;
        private final b c;
        private final jt d;
        private final u40 e;
        private final st f = new st();
        private volatile boolean g;
        private boolean h = true;
        /* access modifiers changed from: private */
        public long i;
        /* access modifiers changed from: private */
        public l j = i(0);
        /* access modifiers changed from: private */
        public long k = -1;
        private vt l;
        private boolean m;

        public a(Uri uri, i iVar, b bVar, jt jtVar, u40 u40) {
            this.a = uri;
            this.b = new x(iVar);
            this.c = bVar;
            this.d = jtVar;
            this.e = u40;
        }

        private l i(long j2) {
            return new l(this.a, j2, -1, h00.this.l, 6, (Map<String, String>) h00.Q);
        }

        /* access modifiers changed from: private */
        public void j(long j2, long j3) {
            this.f.a = j2;
            this.i = j3;
            this.h = true;
            this.m = false;
        }

        public void a() {
            int i2 = 0;
            while (i2 == 0 && !this.g) {
                et etVar = null;
                try {
                    long j2 = this.f.a;
                    l i3 = i(j2);
                    this.j = i3;
                    long c2 = this.b.c(i3);
                    this.k = c2;
                    if (c2 != -1) {
                        this.k = c2 + j2;
                    }
                    Uri e2 = this.b.e();
                    q40.e(e2);
                    Uri uri = e2;
                    ly unused = h00.this.v = ly.a(this.b.d());
                    i iVar = this.b;
                    if (!(h00.this.v == null || h00.this.v.j == -1)) {
                        iVar = new d00(this.b, h00.this.v.j, this);
                        vt K = h00.this.K();
                        this.l = K;
                        K.d(h00.R);
                    }
                    et etVar2 = new et(iVar, j2, this.k);
                    try {
                        ht b2 = this.c.b(etVar2, this.d, uri);
                        if (h00.this.v != null && (b2 instanceof vu)) {
                            ((vu) b2).b();
                        }
                        if (this.h) {
                            b2.h(j2, this.i);
                            this.h = false;
                        }
                        while (i2 == 0 && !this.g) {
                            this.e.a();
                            i2 = b2.f(etVar2, this.f);
                            if (etVar2.m() > h00.this.m + j2) {
                                j2 = etVar2.m();
                                this.e.b();
                                h00.this.s.post(h00.this.r);
                            }
                        }
                        if (i2 == 1) {
                            i2 = 0;
                        } else {
                            this.f.a = etVar2.m();
                        }
                        v50.k(this.b);
                    } catch (Throwable th) {
                        th = th;
                        etVar = etVar2;
                        this.f.a = etVar.m();
                        v50.k(this.b);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (!(i2 == 1 || etVar == null)) {
                        this.f.a = etVar.m();
                    }
                    v50.k(this.b);
                    throw th;
                }
            }
        }

        public void b(i50 i50) {
            long max = !this.m ? this.i : Math.max(h00.this.I(), this.i);
            int a2 = i50.a();
            vt vtVar = this.l;
            q40.e(vtVar);
            vt vtVar2 = vtVar;
            vtVar2.b(i50, a2);
            vtVar2.c(max, 1, a2, 0, (vt.a) null);
            this.m = true;
        }

        public void c() {
            this.g = true;
        }
    }

    /* renamed from: h00$b */
    private static final class b {
        private final ht[] a;
        private ht b;

        public b(ht[] htVarArr) {
            this.a = htVarArr;
        }

        public void a() {
            ht htVar = this.b;
            if (htVar != null) {
                htVar.a();
                this.b = null;
            }
        }

        public ht b(it itVar, jt jtVar, Uri uri) {
            ht htVar = this.b;
            if (htVar != null) {
                return htVar;
            }
            ht[] htVarArr = this.a;
            int i = 0;
            if (htVarArr.length == 1) {
                this.b = htVarArr[0];
            } else {
                int length = htVarArr.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    ht htVar2 = htVarArr[i];
                    try {
                        if (htVar2.d(itVar)) {
                            this.b = htVar2;
                            itVar.i();
                            break;
                        }
                        itVar.i();
                        i++;
                    } catch (EOFException unused) {
                    } catch (Throwable th) {
                        itVar.i();
                        throw th;
                    }
                }
                if (this.b == null) {
                    String C = v50.C(this.a);
                    StringBuilder sb = new StringBuilder(String.valueOf(C).length() + 58);
                    sb.append("None of the available extractors (");
                    sb.append(C);
                    sb.append(") could read the stream.");
                    throw new q00(sb.toString(), uri);
                }
            }
            this.b.g(jtVar);
            return this.b;
        }
    }

    /* renamed from: h00$c */
    interface c {
        void g(long j, boolean z, boolean z2);
    }

    /* renamed from: h00$d */
    private static final class d {
        public final tt a;
        public final p00 b;
        public final boolean[] c;
        public final boolean[] d;
        public final boolean[] e;

        public d(tt ttVar, p00 p00, boolean[] zArr) {
            this.a = ttVar;
            this.b = p00;
            this.c = zArr;
            int i = p00.e;
            this.d = new boolean[i];
            this.e = new boolean[i];
        }
    }

    /* renamed from: h00$e */
    private final class e implements l00 {
        /* access modifiers changed from: private */
        public final int e;

        public e(int i) {
            this.e = i;
        }

        public void a() {
            h00.this.T(this.e);
        }

        public boolean f() {
            return h00.this.M(this.e);
        }

        public int j(g0 g0Var, as asVar, boolean z) {
            return h00.this.Y(this.e, g0Var, asVar, z);
        }

        public int p(long j) {
            return h00.this.b0(this.e, j);
        }
    }

    /* renamed from: h00$f */
    private static final class f {
        public final int a;
        public final boolean b;

        public f(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || f.class != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            return this.a == fVar.a && this.b == fVar.b;
        }

        public int hashCode() {
            return (this.a * 31) + (this.b ? 1 : 0);
        }
    }

    public h00(Uri uri, i iVar, ht[] htVarArr, rs<?> rsVar, t tVar, g00.a aVar, c cVar, com.google.android.exoplayer2.upstream.e eVar, String str, int i2) {
        this.e = uri;
        this.f = iVar;
        this.g = rsVar;
        this.h = tVar;
        this.i = aVar;
        this.j = cVar;
        this.k = eVar;
        this.l = str;
        this.m = (long) i2;
        this.o = new b(htVarArr);
        this.p = new u40();
        this.q = new tz(this);
        this.r = new sz(this);
        this.s = new Handler();
        this.x = new f[0];
        this.w = new k00[0];
        this.L = -9223372036854775807L;
        this.I = -1;
        this.H = -9223372036854775807L;
        this.C = 1;
        aVar.z();
    }

    private boolean E(a aVar, int i2) {
        tt ttVar;
        if (this.I == -1 && ((ttVar = this.u) == null || ttVar.j() == -9223372036854775807L)) {
            if (!this.z || d0()) {
                this.E = this.z;
                this.K = 0;
                this.N = 0;
                for (k00 O2 : this.w) {
                    O2.O();
                }
                aVar.j(0, 0);
                return true;
            }
            this.M = true;
            return false;
        }
        this.N = i2;
        return true;
    }

    private void F(a aVar) {
        if (this.I == -1) {
            this.I = aVar.k;
        }
    }

    private static Map<String, String> G() {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(hashMap);
    }

    private int H() {
        int i2 = 0;
        for (k00 A2 : this.w) {
            i2 += A2.A();
        }
        return i2;
    }

    /* access modifiers changed from: private */
    public long I() {
        long j2 = Long.MIN_VALUE;
        for (k00 v2 : this.w) {
            j2 = Math.max(j2, v2.v());
        }
        return j2;
    }

    private d J() {
        d dVar = this.A;
        q40.e(dVar);
        return dVar;
    }

    private boolean L() {
        return this.L != -9223372036854775807L;
    }

    /* access modifiers changed from: private */
    public void P() {
        int i2;
        tt ttVar = this.u;
        if (!this.P && !this.z && this.y && ttVar != null) {
            k00[] k00Arr = this.w;
            int length = k00Arr.length;
            boolean z2 = false;
            int i3 = 0;
            while (i3 < length) {
                if (k00Arr[i3].z() != null) {
                    i3++;
                } else {
                    return;
                }
            }
            this.p.b();
            int length2 = this.w.length;
            o00[] o00Arr = new o00[length2];
            boolean[] zArr = new boolean[length2];
            this.H = ttVar.j();
            for (int i4 = 0; i4 < length2; i4++) {
                f0 z3 = this.w[i4].z();
                String str = z3.m;
                boolean l2 = e50.l(str);
                boolean z4 = l2 || e50.n(str);
                zArr[i4] = z4;
                this.B = z4 | this.B;
                ly lyVar = this.v;
                if (lyVar != null) {
                    if (l2 || this.x[i4].b) {
                        yx yxVar = z3.k;
                        z3 = z3.k(yxVar == null ? new yx(lyVar) : yxVar.a(lyVar));
                    }
                    if (l2 && z3.i == -1 && (i2 = lyVar.e) != -1) {
                        z3 = z3.b(i2);
                    }
                }
                ns nsVar = z3.p;
                if (nsVar != null) {
                    z3 = z3.e(this.g.b(nsVar));
                }
                o00Arr[i4] = new o00(z3);
            }
            if (this.I == -1 && ttVar.j() == -9223372036854775807L) {
                z2 = true;
            }
            this.J = z2;
            this.C = z2 ? 7 : 1;
            this.A = new d(ttVar, new p00(o00Arr), zArr);
            this.z = true;
            this.j.g(this.H, ttVar.e(), this.J);
            e00.a aVar = this.t;
            q40.e(aVar);
            aVar.m(this);
        }
    }

    private void Q(int i2) {
        d J2 = J();
        boolean[] zArr = J2.e;
        if (!zArr[i2]) {
            f0 a2 = J2.b.a(i2).a(0);
            this.i.c(e50.h(a2.m), a2, 0, (Object) null, this.K);
            zArr[i2] = true;
        }
    }

    private void R(int i2) {
        boolean[] zArr = J().c;
        if (this.M && zArr[i2]) {
            if (!this.w[i2].E(false)) {
                this.L = 0;
                this.M = false;
                this.E = true;
                this.K = 0;
                this.N = 0;
                for (k00 O2 : this.w) {
                    O2.O();
                }
                e00.a aVar = this.t;
                q40.e(aVar);
                aVar.j(this);
            }
        }
    }

    private vt X(f fVar) {
        int length = this.w.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (fVar.equals(this.x[i2])) {
                return this.w[i2];
            }
        }
        k00 k00 = new k00(this.k, this.s.getLooper(), this.g);
        k00.V(this);
        int i3 = length + 1;
        f[] fVarArr = (f[]) Arrays.copyOf(this.x, i3);
        fVarArr[length] = fVar;
        v50.h(fVarArr);
        this.x = fVarArr;
        k00[] k00Arr = (k00[]) Arrays.copyOf(this.w, i3);
        k00Arr[length] = k00;
        v50.h(k00Arr);
        this.w = k00Arr;
        return k00;
    }

    private boolean a0(boolean[] zArr, long j2) {
        int length = this.w.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (!this.w[i2].S(j2, false) && (zArr[i2] || !this.B)) {
                return false;
            }
        }
        return true;
    }

    private void c0() {
        a aVar = new a(this.e, this.f, this.o, this, this.p);
        if (this.z) {
            tt ttVar = J().a;
            q40.f(L());
            long j2 = this.H;
            if (j2 == -9223372036854775807L || this.L <= j2) {
                aVar.j(ttVar.i(this.L).a.b, this.L);
                this.L = -9223372036854775807L;
            } else {
                this.O = true;
                this.L = -9223372036854775807L;
                return;
            }
        }
        this.N = H();
        this.i.x(aVar.j, 1, -1, (f0) null, 0, (Object) null, aVar.i, this.H, this.n.n(aVar, this, this.h.c(this.C)));
    }

    private boolean d0() {
        return this.E || L();
    }

    /* access modifiers changed from: package-private */
    public vt K() {
        return X(new f(0, true));
    }

    /* access modifiers changed from: package-private */
    public boolean M(int i2) {
        return !d0() && this.w[i2].E(this.O);
    }

    public /* synthetic */ void O() {
        if (!this.P) {
            e00.a aVar = this.t;
            q40.e(aVar);
            aVar.j(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void S() {
        this.n.k(this.h.c(this.C));
    }

    /* access modifiers changed from: package-private */
    public void T(int i2) {
        this.w[i2].G();
        S();
    }

    /* renamed from: U */
    public void l(a aVar, long j2, long j3, boolean z2) {
        this.i.o(aVar.j, aVar.b.g(), aVar.b.h(), 1, -1, (f0) null, 0, (Object) null, aVar.i, this.H, j2, j3, aVar.b.f());
        if (!z2) {
            F(aVar);
            for (k00 O2 : this.w) {
                O2.O();
            }
            if (this.G > 0) {
                e00.a aVar2 = this.t;
                q40.e(aVar2);
                aVar2.j(this);
            }
        }
    }

    /* renamed from: V */
    public void m(a aVar, long j2, long j3) {
        tt ttVar;
        if (this.H == -9223372036854775807L && (ttVar = this.u) != null) {
            boolean e2 = ttVar.e();
            long I2 = I();
            long j4 = I2 == Long.MIN_VALUE ? 0 : I2 + 10000;
            this.H = j4;
            this.j.g(j4, e2, this.J);
        }
        this.i.r(aVar.j, aVar.b.g(), aVar.b.h(), 1, -1, (f0) null, 0, (Object) null, aVar.i, this.H, j2, j3, aVar.b.f());
        F(aVar);
        this.O = true;
        e00.a aVar2 = this.t;
        q40.e(aVar2);
        aVar2.j(this);
    }

    /* renamed from: W */
    public u.c t(a aVar, long j2, long j3, IOException iOException, int i2) {
        u.c cVar;
        a aVar2;
        boolean z2;
        F(aVar);
        long a2 = this.h.a(this.C, j3, iOException, i2);
        if (a2 == -9223372036854775807L) {
            cVar = u.e;
            a aVar3 = aVar;
        } else {
            int H2 = H();
            if (H2 > this.N) {
                aVar2 = aVar;
                z2 = true;
            } else {
                z2 = false;
                aVar2 = aVar;
            }
            cVar = E(aVar2, H2) ? u.h(z2, a2) : u.d;
        }
        this.i.u(aVar.j, aVar.b.g(), aVar.b.h(), 1, -1, (f0) null, 0, (Object) null, aVar.i, this.H, j2, j3, aVar.b.f(), iOException, !cVar.c());
        return cVar;
    }

    /* access modifiers changed from: package-private */
    public int Y(int i2, g0 g0Var, as asVar, boolean z2) {
        if (d0()) {
            return -3;
        }
        Q(i2);
        int K2 = this.w[i2].K(g0Var, asVar, z2, this.O, this.K);
        if (K2 == -3) {
            R(i2);
        }
        return K2;
    }

    public void Z() {
        if (this.z) {
            for (k00 J2 : this.w) {
                J2.J();
            }
        }
        this.n.m(this);
        this.s.removeCallbacksAndMessages((Object) null);
        this.t = null;
        this.P = true;
        this.i.A();
    }

    public vt a(int i2, int i3) {
        return X(new f(i2, false));
    }

    public long b() {
        if (this.G == 0) {
            return Long.MIN_VALUE;
        }
        return g();
    }

    /* access modifiers changed from: package-private */
    public int b0(int i2, long j2) {
        if (d0()) {
            return 0;
        }
        Q(i2);
        k00 k00 = this.w[i2];
        int e2 = (!this.O || j2 <= k00.v()) ? k00.e(j2) : k00.f();
        if (e2 == 0) {
            R(i2);
        }
        return e2;
    }

    public boolean c(long j2) {
        if (this.O || this.n.i() || this.M) {
            return false;
        }
        if (this.z && this.G == 0) {
            return false;
        }
        boolean d2 = this.p.d();
        if (this.n.j()) {
            return d2;
        }
        c0();
        return true;
    }

    public boolean d() {
        return this.n.j() && this.p.c();
    }

    public long e(long j2, z0 z0Var) {
        tt ttVar = J().a;
        if (!ttVar.e()) {
            return 0;
        }
        tt.a i2 = ttVar.i(j2);
        return v50.v0(j2, z0Var, i2.a.a, i2.b.a);
    }

    public void f(tt ttVar) {
        if (this.v != null) {
            ttVar = new tt.b(-9223372036854775807L);
        }
        this.u = ttVar;
        this.s.post(this.q);
    }

    public long g() {
        long j2;
        boolean[] zArr = J().c;
        if (this.O) {
            return Long.MIN_VALUE;
        }
        if (L()) {
            return this.L;
        }
        if (this.B) {
            int length = this.w.length;
            j2 = Long.MAX_VALUE;
            for (int i2 = 0; i2 < length; i2++) {
                if (zArr[i2] && !this.w[i2].D()) {
                    j2 = Math.min(j2, this.w[i2].v());
                }
            }
        } else {
            j2 = Long.MAX_VALUE;
        }
        if (j2 == Long.MAX_VALUE) {
            j2 = I();
        }
        return j2 == Long.MIN_VALUE ? this.K : j2;
    }

    public void h(long j2) {
    }

    public void i() {
        for (k00 M2 : this.w) {
            M2.M();
        }
        this.o.a();
    }

    public void j(f0 f0Var) {
        this.s.post(this.q);
    }

    public long k(h40[] h40Arr, boolean[] zArr, l00[] l00Arr, boolean[] zArr2, long j2) {
        d J2 = J();
        p00 p00 = J2.b;
        boolean[] zArr3 = J2.d;
        int i2 = this.G;
        int i3 = 0;
        for (int i4 = 0; i4 < h40Arr.length; i4++) {
            if (l00Arr[i4] != null && (h40Arr[i4] == null || !zArr[i4])) {
                int b2 = l00Arr[i4].e;
                q40.f(zArr3[b2]);
                this.G--;
                zArr3[b2] = false;
                l00Arr[i4] = null;
            }
        }
        boolean z2 = !this.D ? j2 != 0 : i2 == 0;
        for (int i5 = 0; i5 < h40Arr.length; i5++) {
            if (l00Arr[i5] == null && h40Arr[i5] != null) {
                h40 h40 = h40Arr[i5];
                q40.f(h40.length() == 1);
                q40.f(h40.f(0) == 0);
                int b3 = p00.b(h40.a());
                q40.f(!zArr3[b3]);
                this.G++;
                zArr3[b3] = true;
                l00Arr[i5] = new e(b3);
                zArr2[i5] = true;
                if (!z2) {
                    k00 k00 = this.w[b3];
                    z2 = !k00.S(j2, true) && k00.x() != 0;
                }
            }
        }
        if (this.G == 0) {
            this.M = false;
            this.E = false;
            if (this.n.j()) {
                k00[] k00Arr = this.w;
                int length = k00Arr.length;
                while (i3 < length) {
                    k00Arr[i3].n();
                    i3++;
                }
                this.n.f();
            } else {
                k00[] k00Arr2 = this.w;
                int length2 = k00Arr2.length;
                while (i3 < length2) {
                    k00Arr2[i3].O();
                    i3++;
                }
            }
        } else if (z2) {
            j2 = o(j2);
            while (i3 < l00Arr.length) {
                if (l00Arr[i3] != null) {
                    zArr2[i3] = true;
                }
                i3++;
            }
        }
        this.D = true;
        return j2;
    }

    public void n() {
        S();
        if (this.O && !this.z) {
            throw new m0("Loading finished before preparation is complete.");
        }
    }

    public long o(long j2) {
        d J2 = J();
        tt ttVar = J2.a;
        boolean[] zArr = J2.c;
        if (!ttVar.e()) {
            j2 = 0;
        }
        this.E = false;
        this.K = j2;
        if (L()) {
            this.L = j2;
            return j2;
        } else if (this.C != 7 && a0(zArr, j2)) {
            return j2;
        } else {
            this.M = false;
            this.L = j2;
            this.O = false;
            if (this.n.j()) {
                this.n.f();
            } else {
                this.n.g();
                for (k00 O2 : this.w) {
                    O2.O();
                }
            }
            return j2;
        }
    }

    public void p() {
        this.y = true;
        this.s.post(this.q);
    }

    public long q() {
        if (!this.F) {
            this.i.C();
            this.F = true;
        }
        if (!this.E) {
            return -9223372036854775807L;
        }
        if (!this.O && H() <= this.N) {
            return -9223372036854775807L;
        }
        this.E = false;
        return this.K;
    }

    public void r(e00.a aVar, long j2) {
        this.t = aVar;
        this.p.d();
        c0();
    }

    public p00 s() {
        return J().b;
    }

    public void u(long j2, boolean z2) {
        if (!L()) {
            boolean[] zArr = J().d;
            int length = this.w.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.w[i2].m(j2, z2, zArr[i2]);
            }
        }
    }
}
