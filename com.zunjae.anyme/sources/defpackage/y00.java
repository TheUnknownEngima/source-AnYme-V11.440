package defpackage;

import android.os.Looper;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.g0;
import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.upstream.t;
import com.google.android.exoplayer2.upstream.u;
import com.google.android.exoplayer2.z0;
import defpackage.g00;
import defpackage.m00;
import defpackage.z00;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: y00  reason: default package */
public class y00<T extends z00> implements l00, m00, u.b<v00>, u.f {
    public final int e;
    /* access modifiers changed from: private */
    public final int[] f;
    /* access modifiers changed from: private */
    public final f0[] g;
    /* access modifiers changed from: private */
    public final boolean[] h;
    private final T i;
    private final m00.a<y00<T>> j;
    /* access modifiers changed from: private */
    public final g00.a k;
    private final t l;
    private final u m = new u("Loader:ChunkSampleStream");
    private final x00 n = new x00();
    private final ArrayList<s00> o;
    private final List<s00> p;
    private final k00 q;
    private final k00[] r;
    private final u00 s;
    private f0 t;
    private b<T> u;
    private long v;
    /* access modifiers changed from: private */
    public long w;
    private int x;
    long y;
    boolean z;

    /* renamed from: y00$a */
    public final class a implements l00 {
        public final y00<T> e;
        private final k00 f;
        private final int g;
        private boolean h;

        public a(y00<T> y00, k00 k00, int i2) {
            this.e = y00;
            this.f = k00;
            this.g = i2;
        }

        private void b() {
            if (!this.h) {
                y00.this.k.c(y00.this.f[this.g], y00.this.g[this.g], 0, (Object) null, y00.this.w);
                this.h = true;
            }
        }

        public void a() {
        }

        public void c() {
            q40.f(y00.this.h[this.g]);
            y00.this.h[this.g] = false;
        }

        public boolean f() {
            return !y00.this.G() && this.f.E(y00.this.z);
        }

        public int j(g0 g0Var, as asVar, boolean z) {
            if (y00.this.G()) {
                return -3;
            }
            b();
            k00 k00 = this.f;
            y00 y00 = y00.this;
            return k00.K(g0Var, asVar, z, y00.z, y00.y);
        }

        public int p(long j) {
            if (y00.this.G()) {
                return 0;
            }
            b();
            return (!y00.this.z || j <= this.f.v()) ? this.f.e(j) : this.f.f();
        }
    }

    /* renamed from: y00$b */
    public interface b<T extends z00> {
        void f(y00<T> y00);
    }

    public y00(int i2, int[] iArr, f0[] f0VarArr, T t2, m00.a<y00<T>> aVar, e eVar, long j2, rs<?> rsVar, t tVar, g00.a aVar2) {
        this.e = i2;
        this.f = iArr;
        this.g = f0VarArr;
        this.i = t2;
        this.j = aVar;
        this.k = aVar2;
        this.l = tVar;
        ArrayList<s00> arrayList = new ArrayList<>();
        this.o = arrayList;
        this.p = Collections.unmodifiableList(arrayList);
        int i3 = 0;
        int length = iArr == null ? 0 : iArr.length;
        this.r = new k00[length];
        this.h = new boolean[length];
        int i4 = length + 1;
        int[] iArr2 = new int[i4];
        k00[] k00Arr = new k00[i4];
        Looper myLooper = Looper.myLooper();
        q40.e(myLooper);
        k00 k00 = new k00(eVar, myLooper, rsVar);
        this.q = k00;
        iArr2[0] = i2;
        k00Arr[0] = k00;
        while (i3 < length) {
            Looper myLooper2 = Looper.myLooper();
            q40.e(myLooper2);
            k00 k002 = new k00(eVar, myLooper2, qs.d());
            this.r[i3] = k002;
            int i5 = i3 + 1;
            k00Arr[i5] = k002;
            iArr2[i5] = iArr[i3];
            i3 = i5;
        }
        this.s = new u00(iArr2, k00Arr);
        this.v = j2;
        this.w = j2;
    }

    private void A(int i2) {
        int min = Math.min(M(i2, 0), this.x);
        if (min > 0) {
            v50.u0(this.o, 0, min);
            this.x -= min;
        }
    }

    private s00 B(int i2) {
        s00 s00 = this.o.get(i2);
        ArrayList<s00> arrayList = this.o;
        v50.u0(arrayList, i2, arrayList.size());
        this.x = Math.max(this.x, this.o.size());
        k00 k00 = this.q;
        int i3 = 0;
        while (true) {
            k00.q(s00.i(i3));
            k00[] k00Arr = this.r;
            if (i3 >= k00Arr.length) {
                return s00;
            }
            k00 = k00Arr[i3];
            i3++;
        }
    }

    private s00 D() {
        ArrayList<s00> arrayList = this.o;
        return arrayList.get(arrayList.size() - 1);
    }

    private boolean E(int i2) {
        int x2;
        s00 s00 = this.o.get(i2);
        if (this.q.x() > s00.i(0)) {
            return true;
        }
        int i3 = 0;
        do {
            k00[] k00Arr = this.r;
            if (i3 >= k00Arr.length) {
                return false;
            }
            x2 = k00Arr[i3].x();
            i3++;
        } while (x2 <= s00.i(i3));
        return true;
    }

    private boolean F(v00 v00) {
        return v00 instanceof s00;
    }

    private void H() {
        int M = M(this.q.x(), this.x - 1);
        while (true) {
            int i2 = this.x;
            if (i2 <= M) {
                this.x = i2 + 1;
                I(i2);
            } else {
                return;
            }
        }
    }

    private void I(int i2) {
        s00 s00 = this.o.get(i2);
        f0 f0Var = s00.c;
        if (!f0Var.equals(this.t)) {
            this.k.c(this.e, f0Var, s00.d, s00.e, s00.f);
        }
        this.t = f0Var;
    }

    private int M(int i2, int i3) {
        do {
            i3++;
            if (i3 >= this.o.size()) {
                return this.o.size() - 1;
            }
        } while (this.o.get(i3).i(0) <= i2);
        return i3 - 1;
    }

    public T C() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public boolean G() {
        return this.v != -9223372036854775807L;
    }

    /* renamed from: J */
    public void l(v00 v00, long j2, long j3, boolean z2) {
        v00 v002 = v00;
        this.k.o(v002.a, v00.f(), v00.e(), v002.b, this.e, v002.c, v002.d, v002.e, v002.f, v002.g, j2, j3, v00.b());
        if (!z2) {
            this.q.O();
            for (k00 O : this.r) {
                O.O();
            }
            this.j.j(this);
        }
    }

    /* renamed from: K */
    public void m(v00 v00, long j2, long j3) {
        v00 v002 = v00;
        this.i.h(v002);
        this.k.r(v002.a, v00.f(), v00.e(), v002.b, this.e, v002.c, v002.d, v002.e, v002.f, v002.g, j2, j3, v00.b());
        this.j.j(this);
    }

    /* renamed from: L */
    public u.c t(v00 v00, long j2, long j3, IOException iOException, int i2) {
        v00 v002 = v00;
        long b2 = v00.b();
        boolean F = F(v00);
        int size = this.o.size() - 1;
        boolean z2 = b2 == 0 || !F || !E(size);
        u.c cVar = null;
        if (this.i.d(v00, z2, iOException, z2 ? this.l.b(v002.b, j3, iOException, i2) : -9223372036854775807L)) {
            if (z2) {
                cVar = u.d;
                if (F) {
                    q40.f(B(size) == v002);
                    if (this.o.isEmpty()) {
                        this.v = this.w;
                    }
                }
            } else {
                b50.h("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            }
        }
        if (cVar == null) {
            long a2 = this.l.a(v002.b, j3, iOException, i2);
            cVar = a2 != -9223372036854775807L ? u.h(false, a2) : u.e;
        }
        u.c cVar2 = cVar;
        boolean z3 = !cVar2.c();
        this.k.u(v002.a, v00.f(), v00.e(), v002.b, this.e, v002.c, v002.d, v002.e, v002.f, v002.g, j2, j3, b2, iOException, z3);
        if (z3) {
            this.j.j(this);
        }
        return cVar2;
    }

    public void N() {
        O((b) null);
    }

    public void O(b<T> bVar) {
        this.u = bVar;
        this.q.J();
        for (k00 J : this.r) {
            J.J();
        }
        this.m.m(this);
    }

    public void P(long j2) {
        boolean S;
        long j3;
        this.w = j2;
        if (G()) {
            this.v = j2;
            return;
        }
        s00 s00 = null;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= this.o.size()) {
                break;
            }
            s00 s002 = this.o.get(i3);
            int i4 = (s002.f > j2 ? 1 : (s002.f == j2 ? 0 : -1));
            if (i4 == 0 && s002.j == -9223372036854775807L) {
                s00 = s002;
                break;
            } else if (i4 > 0) {
                break;
            } else {
                i3++;
            }
        }
        if (s00 != null) {
            S = this.q.R(s00.i(0));
            j3 = 0;
        } else {
            S = this.q.S(j2, j2 < b());
            j3 = this.w;
        }
        this.y = j3;
        if (S) {
            this.x = M(this.q.x(), 0);
            k00[] k00Arr = this.r;
            int length = k00Arr.length;
            while (i2 < length) {
                k00Arr[i2].S(j2, true);
                i2++;
            }
            return;
        }
        this.v = j2;
        this.z = false;
        this.o.clear();
        this.x = 0;
        if (this.m.j()) {
            this.m.f();
            return;
        }
        this.m.g();
        this.q.O();
        k00[] k00Arr2 = this.r;
        int length2 = k00Arr2.length;
        while (i2 < length2) {
            k00Arr2[i2].O();
            i2++;
        }
    }

    public y00<T>.a Q(long j2, int i2) {
        for (int i3 = 0; i3 < this.r.length; i3++) {
            if (this.f[i3] == i2) {
                q40.f(!this.h[i3]);
                this.h[i3] = true;
                this.r[i3].S(j2, true);
                return new a(this, this.r[i3], i3);
            }
        }
        throw new IllegalStateException();
    }

    public void a() {
        this.m.a();
        this.q.G();
        if (!this.m.j()) {
            this.i.a();
        }
    }

    public long b() {
        if (G()) {
            return this.v;
        }
        if (this.z) {
            return Long.MIN_VALUE;
        }
        return D().g;
    }

    public boolean c(long j2) {
        long j3;
        List<s00> list;
        boolean z2 = false;
        if (this.z || this.m.j() || this.m.i()) {
            return false;
        }
        boolean G = G();
        if (G) {
            list = Collections.emptyList();
            j3 = this.v;
        } else {
            list = this.p;
            j3 = D().g;
        }
        this.i.i(j2, j3, list, this.n);
        x00 x00 = this.n;
        boolean z3 = x00.b;
        v00 v00 = x00.a;
        x00.a();
        if (z3) {
            this.v = -9223372036854775807L;
            this.z = true;
            return true;
        } else if (v00 == null) {
            return false;
        } else {
            if (F(v00)) {
                s00 s00 = (s00) v00;
                if (G) {
                    if (s00.f == this.v) {
                        z2 = true;
                    }
                    this.y = z2 ? 0 : this.v;
                    this.v = -9223372036854775807L;
                }
                s00.k(this.s);
                this.o.add(s00);
            } else if (v00 instanceof c10) {
                ((c10) v00).g(this.s);
            }
            this.k.x(v00.a, v00.b, this.e, v00.c, v00.d, v00.e, v00.f, v00.g, this.m.n(v00, this, this.l.c(v00.b)));
            return true;
        }
    }

    public boolean d() {
        return this.m.j();
    }

    public long e(long j2, z0 z0Var) {
        return this.i.e(j2, z0Var);
    }

    public boolean f() {
        return !G() && this.q.E(this.z);
    }

    public long g() {
        if (this.z) {
            return Long.MIN_VALUE;
        }
        if (G()) {
            return this.v;
        }
        long j2 = this.w;
        s00 D = D();
        if (!D.h()) {
            if (this.o.size() > 1) {
                ArrayList<s00> arrayList = this.o;
                D = arrayList.get(arrayList.size() - 2);
            } else {
                D = null;
            }
        }
        if (D != null) {
            j2 = Math.max(j2, D.g);
        }
        return Math.max(j2, this.q.v());
    }

    public void h(long j2) {
        int size;
        int g2;
        if (!this.m.j() && !this.m.i() && !G() && (size = this.o.size()) > (g2 = this.i.g(j2, this.p))) {
            while (true) {
                if (g2 >= size) {
                    g2 = size;
                    break;
                } else if (!E(g2)) {
                    break;
                } else {
                    g2++;
                }
            }
            if (g2 != size) {
                long j3 = D().g;
                s00 B = B(g2);
                if (this.o.isEmpty()) {
                    this.v = this.w;
                }
                this.z = false;
                this.k.E(this.e, B.f, j3);
            }
        }
    }

    public void i() {
        this.q.M();
        for (k00 M : this.r) {
            M.M();
        }
        b<T> bVar = this.u;
        if (bVar != null) {
            bVar.f(this);
        }
    }

    public int j(g0 g0Var, as asVar, boolean z2) {
        if (G()) {
            return -3;
        }
        H();
        return this.q.K(g0Var, asVar, z2, this.z, this.y);
    }

    public int p(long j2) {
        if (G()) {
            return 0;
        }
        int e2 = (!this.z || j2 <= this.q.v()) ? this.q.e(j2) : this.q.f();
        H();
        return e2;
    }

    public void u(long j2, boolean z2) {
        if (!G()) {
            int t2 = this.q.t();
            this.q.m(j2, z2, true);
            int t3 = this.q.t();
            if (t3 > t2) {
                long u2 = this.q.u();
                int i2 = 0;
                while (true) {
                    k00[] k00Arr = this.r;
                    if (i2 >= k00Arr.length) {
                        break;
                    }
                    k00Arr[i2].m(u2, z2, this.h[i2]);
                    i2++;
                }
            }
            A(t3);
        }
    }
}
