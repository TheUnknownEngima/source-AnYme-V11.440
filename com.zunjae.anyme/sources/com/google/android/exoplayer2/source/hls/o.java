package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.g0;
import com.google.android.exoplayer2.m0;
import com.google.android.exoplayer2.source.hls.h;
import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.upstream.t;
import com.google.android.exoplayer2.upstream.u;
import defpackage.g00;
import defpackage.k00;
import defpackage.m00;
import defpackage.vt;
import defpackage.yx;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

final class o implements u.b<v00>, u.f, m00, jt, k00.b {
    private static final Set<Integer> Z = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{1, 2, 4})));
    private vt A;
    private int B;
    private int C;
    private boolean D;
    private boolean E;
    private int F;
    private f0 G;
    private f0 H;
    private boolean I;
    private p00 J;
    private Set<o00> K;
    private int[] L;
    private int M;
    private boolean N;
    private boolean[] O = new boolean[0];
    private boolean[] P = new boolean[0];
    private long Q;
    private long R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private long W;
    private ns X;
    private int Y;
    private final int e;
    private final a f;
    private final h g;
    private final e h;
    private final f0 i;
    private final rs<?> j;
    private final t k;
    private final u l = new u("Loader:HlsSampleStreamWrapper");
    private final g00.a m;
    private final int n;
    private final h.b o = new h.b();
    private final ArrayList<l> p;
    private final List<l> q;
    private final Runnable r;
    private final Runnable s;
    private final Handler t;
    private final ArrayList<n> u;
    private final Map<String, ns> v;
    private c[] w = new c[0];
    private int[] x = new int[0];
    private Set<Integer> y = new HashSet(Z.size());
    private SparseIntArray z = new SparseIntArray(Z.size());

    public interface a extends m00.a<o> {
        void a();

        void l(Uri uri);
    }

    private static class b implements vt {
        private static final f0 g = f0.u((String) null, "application/id3", Long.MAX_VALUE);
        private static final f0 h = f0.u((String) null, "application/x-emsg", Long.MAX_VALUE);
        private final gy a = new gy();
        private final vt b;
        private final f0 c;
        private f0 d;
        private byte[] e;
        private int f;

        public b(vt vtVar, int i) {
            f0 f0Var;
            this.b = vtVar;
            if (i == 1) {
                f0Var = g;
            } else if (i == 3) {
                f0Var = h;
            } else {
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unknown metadataType: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
            this.c = f0Var;
            this.e = new byte[0];
            this.f = 0;
        }

        private boolean e(fy fyVar) {
            f0 C = fyVar.C();
            return C != null && v50.b(this.c.m, C.m);
        }

        private void f(int i) {
            byte[] bArr = this.e;
            if (bArr.length < i) {
                this.e = Arrays.copyOf(bArr, i + (i / 2));
            }
        }

        private i50 g(int i, int i2) {
            int i3 = this.f - i2;
            i50 i50 = new i50(Arrays.copyOfRange(this.e, i3 - i, i3));
            byte[] bArr = this.e;
            System.arraycopy(bArr, i3, bArr, 0, i2);
            this.f = i2;
            return i50;
        }

        public int a(it itVar, int i, boolean z) {
            f(this.f + i);
            int a2 = itVar.a(this.e, this.f, i);
            if (a2 != -1) {
                this.f += a2;
                return a2;
            } else if (z) {
                return -1;
            } else {
                throw new EOFException();
            }
        }

        public void b(i50 i50, int i) {
            f(this.f + i);
            i50.h(this.e, this.f, i);
            this.f += i;
        }

        public void c(long j, int i, int i2, int i3, vt.a aVar) {
            q40.e(this.d);
            i50 g2 = g(i2, i3);
            if (!v50.b(this.d.m, this.c.m)) {
                if ("application/x-emsg".equals(this.d.m)) {
                    fy b2 = this.a.b(g2);
                    if (!e(b2)) {
                        b50.h("EmsgUnwrappingTrackOutput", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", new Object[]{this.c.m, b2.C()}));
                        return;
                    }
                    byte[] F0 = b2.F0();
                    q40.e(F0);
                    g2 = new i50(F0);
                } else {
                    String valueOf = String.valueOf(this.d.m);
                    b50.h("EmsgUnwrappingTrackOutput", valueOf.length() != 0 ? "Ignoring sample for unsupported format: ".concat(valueOf) : new String("Ignoring sample for unsupported format: "));
                    return;
                }
            }
            int a2 = g2.a();
            this.b.b(g2, a2);
            this.b.c(j, i, a2, i3, aVar);
        }

        public void d(f0 f0Var) {
            this.d = f0Var;
            this.b.d(this.c);
        }
    }

    private static final class c extends k00 {
        private final Map<String, ns> F;
        private ns G;

        public c(e eVar, Looper looper, rs<?> rsVar, Map<String, ns> map) {
            super(eVar, looper, rsVar);
            this.F = map;
        }

        private yx Y(yx yxVar) {
            if (yxVar == null) {
                return null;
            }
            int d = yxVar.d();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= d) {
                    i2 = -1;
                    break;
                }
                yx.b c = yxVar.c(i2);
                if ((c instanceof yy) && "com.apple.streaming.transportStreamTimestamp".equals(((yy) c).f)) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                return yxVar;
            }
            if (d == 1) {
                return null;
            }
            yx.b[] bVarArr = new yx.b[(d - 1)];
            while (i < d) {
                if (i != i2) {
                    bVarArr[i < i2 ? i : i - 1] = yxVar.c(i);
                }
                i++;
            }
            return new yx(bVarArr);
        }

        public void Z(ns nsVar) {
            this.G = nsVar;
            C();
        }

        public f0 s(f0 f0Var) {
            ns nsVar;
            ns nsVar2 = this.G;
            if (nsVar2 == null) {
                nsVar2 = f0Var.p;
            }
            if (!(nsVar2 == null || (nsVar = this.F.get(nsVar2.g)) == null)) {
                nsVar2 = nsVar;
            }
            return super.s(f0Var.a(nsVar2, Y(f0Var.k)));
        }
    }

    public o(int i2, a aVar, h hVar, Map<String, ns> map, e eVar, long j2, f0 f0Var, rs<?> rsVar, t tVar, g00.a aVar2, int i3) {
        this.e = i2;
        this.f = aVar;
        this.g = hVar;
        this.v = map;
        this.h = eVar;
        this.i = f0Var;
        this.j = rsVar;
        this.k = tVar;
        this.m = aVar2;
        this.n = i3;
        ArrayList<l> arrayList = new ArrayList<>();
        this.p = arrayList;
        this.q = Collections.unmodifiableList(arrayList);
        this.u = new ArrayList<>();
        this.r = new b(this);
        this.s = new c(this);
        this.t = new Handler();
        this.Q = j2;
        this.R = j2;
    }

    private k00 A(int i2, int i3) {
        int length = this.w.length;
        boolean z2 = true;
        if (!(i3 == 1 || i3 == 2)) {
            z2 = false;
        }
        c cVar = new c(this.h, this.t.getLooper(), this.j, this.v);
        if (z2) {
            cVar.Z(this.X);
        }
        cVar.T(this.W);
        cVar.W(this.Y);
        cVar.V(this);
        int i4 = length + 1;
        int[] copyOf = Arrays.copyOf(this.x, i4);
        this.x = copyOf;
        copyOf[length] = i2;
        this.w = (c[]) v50.n0(this.w, cVar);
        boolean[] copyOf2 = Arrays.copyOf(this.P, i4);
        this.P = copyOf2;
        copyOf2[length] = z2;
        this.N = copyOf2[length] | this.N;
        this.y.add(Integer.valueOf(i3));
        this.z.append(i3, length);
        if (H(i3) > H(this.B)) {
            this.C = length;
            this.B = i3;
        }
        this.O = Arrays.copyOf(this.O, i4);
        return cVar;
    }

    private p00 B(o00[] o00Arr) {
        for (int i2 = 0; i2 < o00Arr.length; i2++) {
            o00 o00 = o00Arr[i2];
            f0[] f0VarArr = new f0[o00.e];
            for (int i3 = 0; i3 < o00.e; i3++) {
                f0 a2 = o00.a(i3);
                ns nsVar = a2.p;
                if (nsVar != null) {
                    a2 = a2.e(this.j.b(nsVar));
                }
                f0VarArr[i3] = a2;
            }
            o00Arr[i2] = new o00(f0VarArr);
        }
        return new p00(o00Arr);
    }

    private static f0 C(f0 f0Var, f0 f0Var2, boolean z2) {
        if (f0Var == null) {
            return f0Var2;
        }
        int i2 = z2 ? f0Var.i : -1;
        int i3 = f0Var.z;
        if (i3 == -1) {
            i3 = f0Var2.z;
        }
        int i4 = i3;
        String B2 = v50.B(f0Var.j, e50.h(f0Var2.m));
        String e2 = e50.e(B2);
        if (e2 == null) {
            e2 = f0Var2.m;
        }
        return f0Var2.c(f0Var.e, f0Var.f, e2, B2, f0Var.k, i2, f0Var.r, f0Var.s, i4, f0Var.g, f0Var.E);
    }

    private boolean D(l lVar) {
        int i2 = lVar.j;
        int length = this.w.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (this.O[i3] && this.w[i3].I() == i2) {
                return false;
            }
        }
        return true;
    }

    private static boolean E(f0 f0Var, f0 f0Var2) {
        String str = f0Var.m;
        String str2 = f0Var2.m;
        int h2 = e50.h(str);
        if (h2 != 3) {
            return h2 == e50.h(str2);
        }
        if (!v50.b(str, str2)) {
            return false;
        }
        return (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || f0Var.F == f0Var2.F;
    }

    private l F() {
        ArrayList<l> arrayList = this.p;
        return arrayList.get(arrayList.size() - 1);
    }

    private vt G(int i2, int i3) {
        q40.a(Z.contains(Integer.valueOf(i3)));
        int i4 = this.z.get(i3, -1);
        if (i4 == -1) {
            return null;
        }
        if (this.y.add(Integer.valueOf(i3))) {
            this.x[i4] = i2;
        }
        return this.x[i4] == i2 ? this.w[i4] : z(i2, i3);
    }

    private static int H(int i2) {
        if (i2 == 1) {
            return 2;
        }
        if (i2 != 2) {
            return i2 != 3 ? 0 : 1;
        }
        return 3;
    }

    private static boolean J(v00 v00) {
        return v00 instanceof l;
    }

    private boolean K() {
        return this.R != -9223372036854775807L;
    }

    @RequiresNonNull({"trackGroups"})
    @EnsuresNonNull({"trackGroupToSampleQueueIndex"})
    private void O() {
        int i2 = this.J.e;
        int[] iArr = new int[i2];
        this.L = iArr;
        Arrays.fill(iArr, -1);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = 0;
            while (true) {
                c[] cVarArr = this.w;
                if (i4 >= cVarArr.length) {
                    break;
                } else if (E(cVarArr[i4].z(), this.J.a(i3).a(0))) {
                    this.L[i3] = i4;
                    break;
                } else {
                    i4++;
                }
            }
        }
        Iterator<n> it = this.u.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    /* access modifiers changed from: private */
    public void P() {
        if (!this.I && this.L == null && this.D) {
            c[] cVarArr = this.w;
            int length = cVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                if (cVarArr[i2].z() != null) {
                    i2++;
                } else {
                    return;
                }
            }
            if (this.J != null) {
                O();
                return;
            }
            x();
            g0();
            this.f.a();
        }
    }

    /* access modifiers changed from: private */
    public void X() {
        this.D = true;
        P();
    }

    private void b0() {
        for (c P2 : this.w) {
            P2.P(this.S);
        }
        this.S = false;
    }

    private boolean c0(long j2) {
        int length = this.w.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (!this.w[i2].S(j2, false) && (this.P[i2] || !this.N)) {
                return false;
            }
        }
        return true;
    }

    @RequiresNonNull({"trackGroups", "optionalTrackGroups"})
    private void g0() {
        this.E = true;
    }

    private void l0(l00[] l00Arr) {
        this.u.clear();
        for (n nVar : l00Arr) {
            if (nVar != null) {
                this.u.add(nVar);
            }
        }
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups"})
    private void v() {
        q40.f(this.E);
        q40.e(this.J);
        q40.e(this.K);
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups", "trackGroupToSampleQueueIndex"})
    private void x() {
        int length = this.w.length;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 6;
        int i4 = -1;
        while (true) {
            int i5 = 2;
            if (i2 >= length) {
                break;
            }
            String str = this.w[i2].z().m;
            if (!e50.n(str)) {
                i5 = e50.l(str) ? 1 : e50.m(str) ? 3 : 6;
            }
            if (H(i5) > H(i3)) {
                i4 = i2;
                i3 = i5;
            } else if (i5 == i3 && i4 != -1) {
                i4 = -1;
            }
            i2++;
        }
        o00 e2 = this.g.e();
        int i6 = e2.e;
        this.M = -1;
        this.L = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            this.L[i7] = i7;
        }
        o00[] o00Arr = new o00[length];
        for (int i8 = 0; i8 < length; i8++) {
            f0 z3 = this.w[i8].z();
            if (i8 == i4) {
                f0[] f0VarArr = new f0[i6];
                if (i6 == 1) {
                    f0VarArr[0] = z3.i(e2.a(0));
                } else {
                    for (int i9 = 0; i9 < i6; i9++) {
                        f0VarArr[i9] = C(e2.a(i9), z3, true);
                    }
                }
                o00Arr[i8] = new o00(f0VarArr);
                this.M = i8;
            } else {
                o00Arr[i8] = new o00(C((i3 != 2 || !e50.l(z3.m)) ? null : this.i, z3, false));
            }
        }
        this.J = B(o00Arr);
        if (this.K == null) {
            z2 = true;
        }
        q40.f(z2);
        this.K = Collections.emptySet();
    }

    private static gt z(int i2, int i3) {
        StringBuilder sb = new StringBuilder(54);
        sb.append("Unmapped track with id ");
        sb.append(i2);
        sb.append(" of type ");
        sb.append(i3);
        b50.h("HlsSampleStreamWrapper", sb.toString());
        return new gt();
    }

    public void I(int i2, boolean z2) {
        this.Y = i2;
        for (c W2 : this.w) {
            W2.W(i2);
        }
        if (z2) {
            for (c X2 : this.w) {
                X2.X();
            }
        }
    }

    public boolean L(int i2) {
        return !K() && this.w[i2].E(this.U);
    }

    public void Q() {
        this.l.a();
        this.g.i();
    }

    public void R(int i2) {
        Q();
        this.w[i2].G();
    }

    /* renamed from: S */
    public void l(v00 v00, long j2, long j3, boolean z2) {
        v00 v002 = v00;
        this.m.o(v002.a, v00.f(), v00.e(), v002.b, this.e, v002.c, v002.d, v002.e, v002.f, v002.g, j2, j3, v00.b());
        if (!z2) {
            b0();
            if (this.F > 0) {
                this.f.j(this);
            }
        }
    }

    /* renamed from: T */
    public void m(v00 v00, long j2, long j3) {
        v00 v002 = v00;
        this.g.j(v002);
        this.m.r(v002.a, v00.f(), v00.e(), v002.b, this.e, v002.c, v002.d, v002.e, v002.f, v002.g, j2, j3, v00.b());
        if (!this.E) {
            c(this.Q);
        } else {
            this.f.j(this);
        }
    }

    /* renamed from: U */
    public u.c t(v00 v00, long j2, long j3, IOException iOException, int i2) {
        u.c h2;
        v00 v002 = v00;
        long b2 = v00.b();
        boolean J2 = J(v00);
        long b3 = this.k.b(v002.b, j3, iOException, i2);
        boolean z2 = false;
        boolean g2 = b3 != -9223372036854775807L ? this.g.g(v002, b3) : false;
        if (g2) {
            if (J2 && b2 == 0) {
                ArrayList<l> arrayList = this.p;
                if (arrayList.remove(arrayList.size() - 1) == v002) {
                    z2 = true;
                }
                q40.f(z2);
                if (this.p.isEmpty()) {
                    this.R = this.Q;
                }
            }
            h2 = u.d;
        } else {
            long a2 = this.k.a(v002.b, j3, iOException, i2);
            h2 = a2 != -9223372036854775807L ? u.h(false, a2) : u.e;
        }
        u.c cVar = h2;
        this.m.u(v002.a, v00.f(), v00.e(), v002.b, this.e, v002.c, v002.d, v002.e, v002.f, v002.g, j2, j3, b2, iOException, !cVar.c());
        if (g2) {
            if (!this.E) {
                c(this.Q);
            } else {
                this.f.j(this);
            }
        }
        return cVar;
    }

    public void V() {
        this.y.clear();
    }

    public boolean W(Uri uri, long j2) {
        return this.g.k(uri, j2);
    }

    public void Y(o00[] o00Arr, int i2, int... iArr) {
        this.J = B(o00Arr);
        this.K = new HashSet();
        for (int a2 : iArr) {
            this.K.add(this.J.a(a2));
        }
        this.M = i2;
        Handler handler = this.t;
        a aVar = this.f;
        Objects.requireNonNull(aVar);
        handler.post(new a(aVar));
        g0();
    }

    public int Z(int i2, g0 g0Var, as asVar, boolean z2) {
        f0 f0Var;
        if (K()) {
            return -3;
        }
        int i3 = 0;
        if (!this.p.isEmpty()) {
            int i4 = 0;
            while (i4 < this.p.size() - 1 && D(this.p.get(i4))) {
                i4++;
            }
            v50.u0(this.p, 0, i4);
            l lVar = this.p.get(0);
            f0 f0Var2 = lVar.c;
            if (!f0Var2.equals(this.H)) {
                this.m.c(this.e, f0Var2, lVar.d, lVar.e, lVar.f);
            }
            this.H = f0Var2;
        }
        int K2 = this.w[i2].K(g0Var, asVar, z2, this.U, this.Q);
        if (K2 == -5) {
            f0 f0Var3 = g0Var.c;
            q40.e(f0Var3);
            f0 f0Var4 = f0Var3;
            if (i2 == this.C) {
                int I2 = this.w[i2].I();
                while (i3 < this.p.size() && this.p.get(i3).j != I2) {
                    i3++;
                }
                if (i3 < this.p.size()) {
                    f0Var = this.p.get(i3).c;
                } else {
                    f0 f0Var5 = this.G;
                    q40.e(f0Var5);
                    f0Var = f0Var5;
                }
                f0Var4 = f0Var4.i(f0Var);
            }
            g0Var.c = f0Var4;
        }
        return K2;
    }

    public vt a(int i2, int i3) {
        vt vtVar;
        if (!Z.contains(Integer.valueOf(i3))) {
            int i4 = 0;
            while (true) {
                vt[] vtVarArr = this.w;
                if (i4 >= vtVarArr.length) {
                    vtVar = null;
                    break;
                } else if (this.x[i4] == i2) {
                    vtVar = vtVarArr[i4];
                    break;
                } else {
                    i4++;
                }
            }
        } else {
            vtVar = G(i2, i3);
        }
        if (vtVar == null) {
            if (this.V) {
                return z(i2, i3);
            }
            vtVar = A(i2, i3);
        }
        if (i3 != 4) {
            return vtVar;
        }
        if (this.A == null) {
            this.A = new b(vtVar, this.n);
        }
        return this.A;
    }

    public void a0() {
        if (this.E) {
            for (c J2 : this.w) {
                J2.J();
            }
        }
        this.l.m(this);
        this.t.removeCallbacksAndMessages((Object) null);
        this.I = true;
        this.u.clear();
    }

    public long b() {
        if (K()) {
            return this.R;
        }
        if (this.U) {
            return Long.MIN_VALUE;
        }
        return F().g;
    }

    public boolean c(long j2) {
        List<l> list;
        long max;
        if (this.U || this.l.j() || this.l.i()) {
            return false;
        }
        if (K()) {
            list = Collections.emptyList();
            max = this.R;
        } else {
            list = this.q;
            l F2 = F();
            max = F2.h() ? F2.g : Math.max(this.Q, F2.f);
        }
        List<l> list2 = list;
        this.g.d(j2, max, list2, this.E || !list2.isEmpty(), this.o);
        h.b bVar = this.o;
        boolean z2 = bVar.b;
        v00 v00 = bVar.a;
        Uri uri = bVar.c;
        bVar.a();
        if (z2) {
            this.R = -9223372036854775807L;
            this.U = true;
            return true;
        } else if (v00 == null) {
            if (uri != null) {
                this.f.l(uri);
            }
            return false;
        } else {
            if (J(v00)) {
                this.R = -9223372036854775807L;
                l lVar = (l) v00;
                lVar.m(this);
                this.p.add(lVar);
                this.G = lVar.c;
            }
            this.m.x(v00.a, v00.b, this.e, v00.c, v00.d, v00.e, v00.f, v00.g, this.l.n(v00, this, this.k.c(v00.b)));
            return true;
        }
    }

    public boolean d() {
        return this.l.j();
    }

    public boolean d0(long j2, boolean z2) {
        this.Q = j2;
        if (K()) {
            this.R = j2;
            return true;
        } else if (this.D && !z2 && c0(j2)) {
            return false;
        } else {
            this.R = j2;
            this.U = false;
            this.p.clear();
            if (this.l.j()) {
                this.l.f();
            } else {
                this.l.g();
                b0();
            }
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0131  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e0(defpackage.h40[] r20, boolean[] r21, defpackage.l00[] r22, boolean[] r23, long r24, boolean r26) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r22
            r12 = r24
            r19.v()
            int r3 = r0.F
            r14 = 0
            r4 = 0
        L_0x000f:
            int r5 = r1.length
            r6 = 0
            r15 = 1
            if (r4 >= r5) goto L_0x002f
            r5 = r2[r4]
            com.google.android.exoplayer2.source.hls.n r5 = (com.google.android.exoplayer2.source.hls.n) r5
            if (r5 == 0) goto L_0x002c
            r7 = r1[r4]
            if (r7 == 0) goto L_0x0022
            boolean r7 = r21[r4]
            if (r7 != 0) goto L_0x002c
        L_0x0022:
            int r7 = r0.F
            int r7 = r7 - r15
            r0.F = r7
            r5.d()
            r2[r4] = r6
        L_0x002c:
            int r4 = r4 + 1
            goto L_0x000f
        L_0x002f:
            if (r26 != 0) goto L_0x0041
            boolean r4 = r0.T
            if (r4 == 0) goto L_0x0038
            if (r3 != 0) goto L_0x003f
            goto L_0x0041
        L_0x0038:
            long r3 = r0.Q
            int r5 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r3 = 0
            goto L_0x0042
        L_0x0041:
            r3 = 1
        L_0x0042:
            com.google.android.exoplayer2.source.hls.h r4 = r0.g
            h40 r4 = r4.f()
            r16 = r3
            r11 = r4
            r3 = 0
        L_0x004c:
            int r5 = r1.length
            if (r3 >= r5) goto L_0x00a3
            r5 = r1[r3]
            if (r5 != 0) goto L_0x0054
            goto L_0x00a0
        L_0x0054:
            p00 r7 = r0.J
            o00 r8 = r5.a()
            int r7 = r7.b(r8)
            int r8 = r0.M
            if (r7 != r8) goto L_0x0068
            com.google.android.exoplayer2.source.hls.h r8 = r0.g
            r8.o(r5)
            r11 = r5
        L_0x0068:
            r5 = r2[r3]
            if (r5 != 0) goto L_0x00a0
            int r5 = r0.F
            int r5 = r5 + r15
            r0.F = r5
            com.google.android.exoplayer2.source.hls.n r5 = new com.google.android.exoplayer2.source.hls.n
            r5.<init>(r0, r7)
            r2[r3] = r5
            r23[r3] = r15
            int[] r5 = r0.L
            if (r5 == 0) goto L_0x00a0
            r5 = r2[r3]
            com.google.android.exoplayer2.source.hls.n r5 = (com.google.android.exoplayer2.source.hls.n) r5
            r5.b()
            if (r16 != 0) goto L_0x00a0
            com.google.android.exoplayer2.source.hls.o$c[] r5 = r0.w
            int[] r8 = r0.L
            r7 = r8[r7]
            r5 = r5[r7]
            boolean r7 = r5.S(r12, r15)
            if (r7 != 0) goto L_0x009d
            int r5 = r5.x()
            if (r5 == 0) goto L_0x009d
            r5 = 1
            goto L_0x009e
        L_0x009d:
            r5 = 0
        L_0x009e:
            r16 = r5
        L_0x00a0:
            int r3 = r3 + 1
            goto L_0x004c
        L_0x00a3:
            int r1 = r0.F
            if (r1 != 0) goto L_0x00da
            com.google.android.exoplayer2.source.hls.h r1 = r0.g
            r1.l()
            r0.H = r6
            r0.S = r15
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.l> r1 = r0.p
            r1.clear()
            com.google.android.exoplayer2.upstream.u r1 = r0.l
            boolean r1 = r1.j()
            if (r1 == 0) goto L_0x00d5
            boolean r1 = r0.D
            if (r1 == 0) goto L_0x00ce
            com.google.android.exoplayer2.source.hls.o$c[] r1 = r0.w
            int r3 = r1.length
        L_0x00c4:
            if (r14 >= r3) goto L_0x00ce
            r4 = r1[r14]
            r4.n()
            int r14 = r14 + 1
            goto L_0x00c4
        L_0x00ce:
            com.google.android.exoplayer2.upstream.u r1 = r0.l
            r1.f()
            goto L_0x0140
        L_0x00d5:
            r19.b0()
            goto L_0x0140
        L_0x00da:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.l> r1 = r0.p
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x012d
            boolean r1 = defpackage.v50.b(r11, r4)
            if (r1 != 0) goto L_0x012d
            boolean r1 = r0.T
            if (r1 != 0) goto L_0x0124
            r3 = 0
            int r1 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x00f3
            long r3 = -r12
        L_0x00f3:
            r6 = r3
            com.google.android.exoplayer2.source.hls.l r1 = r19.F()
            com.google.android.exoplayer2.source.hls.h r3 = r0.g
            e10[] r17 = r3.a(r1, r12)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.util.List<com.google.android.exoplayer2.source.hls.l> r10 = r0.q
            r3 = r11
            r4 = r24
            r18 = r11
            r11 = r17
            r3.j(r4, r6, r8, r10, r11)
            com.google.android.exoplayer2.source.hls.h r3 = r0.g
            o00 r3 = r3.e()
            com.google.android.exoplayer2.f0 r1 = r1.c
            int r1 = r3.b(r1)
            int r3 = r18.k()
            if (r3 == r1) goto L_0x0122
            goto L_0x0124
        L_0x0122:
            r1 = 0
            goto L_0x0125
        L_0x0124:
            r1 = 1
        L_0x0125:
            if (r1 == 0) goto L_0x012d
            r0.S = r15
            r1 = 1
            r16 = 1
            goto L_0x012f
        L_0x012d:
            r1 = r26
        L_0x012f:
            if (r16 == 0) goto L_0x0140
            r0.d0(r12, r1)
        L_0x0134:
            int r1 = r2.length
            if (r14 >= r1) goto L_0x0140
            r1 = r2[r14]
            if (r1 == 0) goto L_0x013d
            r23[r14] = r15
        L_0x013d:
            int r14 = r14 + 1
            goto L_0x0134
        L_0x0140:
            r0.l0(r2)
            r0.T = r15
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.o.e0(h40[], boolean[], l00[], boolean[], long, boolean):boolean");
    }

    public void f(tt ttVar) {
    }

    public void f0(ns nsVar) {
        if (!v50.b(this.X, nsVar)) {
            this.X = nsVar;
            int i2 = 0;
            while (true) {
                c[] cVarArr = this.w;
                if (i2 < cVarArr.length) {
                    if (this.P[i2]) {
                        cVarArr[i2].Z(nsVar);
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public long g() {
        if (this.U) {
            return Long.MIN_VALUE;
        }
        if (K()) {
            return this.R;
        }
        long j2 = this.Q;
        l F2 = F();
        if (!F2.h()) {
            if (this.p.size() > 1) {
                ArrayList<l> arrayList = this.p;
                F2 = arrayList.get(arrayList.size() - 2);
            } else {
                F2 = null;
            }
        }
        if (F2 != null) {
            j2 = Math.max(j2, F2.g);
        }
        if (this.D) {
            for (c v2 : this.w) {
                j2 = Math.max(j2, v2.v());
            }
        }
        return j2;
    }

    public void h(long j2) {
    }

    public void h0(boolean z2) {
        this.g.n(z2);
    }

    public void i() {
        for (c M2 : this.w) {
            M2.M();
        }
    }

    public void i0(long j2) {
        if (this.W != j2) {
            this.W = j2;
            for (c T2 : this.w) {
                T2.T(j2);
            }
        }
    }

    public void j(f0 f0Var) {
        this.t.post(this.r);
    }

    public int j0(int i2, long j2) {
        if (K()) {
            return 0;
        }
        c cVar = this.w[i2];
        return (!this.U || j2 <= cVar.v()) ? cVar.e(j2) : cVar.f();
    }

    public void k0(int i2) {
        v();
        q40.e(this.L);
        int i3 = this.L[i2];
        q40.f(this.O[i3]);
        this.O[i3] = false;
    }

    public void n() {
        Q();
        if (this.U && !this.E) {
            throw new m0("Loading finished before preparation is complete.");
        }
    }

    public void p() {
        this.V = true;
        this.t.post(this.s);
    }

    public p00 s() {
        v();
        return this.J;
    }

    public void u(long j2, boolean z2) {
        if (this.D && !K()) {
            int length = this.w.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.w[i2].m(j2, z2, this.O[i2]);
            }
        }
    }

    public int w(int i2) {
        v();
        q40.e(this.L);
        int i3 = this.L[i2];
        if (i3 == -1) {
            return this.K.contains(this.J.a(i2)) ? -3 : -2;
        }
        boolean[] zArr = this.O;
        if (zArr[i3]) {
            return -2;
        }
        zArr[i3] = true;
        return i3;
    }

    public void y() {
        if (!this.E) {
            c(this.Q);
        }
    }
}
