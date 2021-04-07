package com.google.android.exoplayer2.source.smoothstreaming;

import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.source.smoothstreaming.c;
import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.upstream.t;
import com.google.android.exoplayer2.upstream.v;
import com.google.android.exoplayer2.upstream.y;
import com.google.android.exoplayer2.z0;
import defpackage.d20;
import defpackage.e00;
import defpackage.g00;
import defpackage.m00;
import java.util.ArrayList;

final class d implements e00, m00.a<y00<c>> {
    private final c.a e;
    private final y f;
    private final v g;
    private final rs<?> h;
    private final t i;
    private final g00.a j;
    private final e k;
    private final p00 l;
    private final zz m;
    private e00.a n;
    private d20 o;
    private y00<c>[] p;
    private m00 q;
    private boolean r;

    public d(d20 d20, c.a aVar, y yVar, zz zzVar, rs<?> rsVar, t tVar, g00.a aVar2, v vVar, e eVar) {
        this.o = d20;
        this.e = aVar;
        this.f = yVar;
        this.g = vVar;
        this.h = rsVar;
        this.i = tVar;
        this.j = aVar2;
        this.k = eVar;
        this.m = zzVar;
        this.l = i(d20, rsVar);
        y00<c>[] p2 = p(0);
        this.p = p2;
        this.q = zzVar.a(p2);
        aVar2.z();
    }

    private y00<c> f(h40 h40, long j2) {
        int b = this.l.b(h40.a());
        return new y00(this.o.f[b].a, (int[]) null, (f0[]) null, this.e.a(this.g, this.o, b, h40, this.f), this, this.k, j2, this.h, this.i, this.j);
    }

    private static p00 i(d20 d20, rs<?> rsVar) {
        o00[] o00Arr = new o00[d20.f.length];
        int i2 = 0;
        while (true) {
            d20.b[] bVarArr = d20.f;
            if (i2 >= bVarArr.length) {
                return new p00(o00Arr);
            }
            f0[] f0VarArr = bVarArr[i2].j;
            f0[] f0VarArr2 = new f0[f0VarArr.length];
            for (int i3 = 0; i3 < f0VarArr.length; i3++) {
                f0 f0Var = f0VarArr[i3];
                ns nsVar = f0Var.p;
                if (nsVar != null) {
                    f0Var = f0Var.e(rsVar.b(nsVar));
                }
                f0VarArr2[i3] = f0Var;
            }
            o00Arr[i2] = new o00(f0VarArr2);
            i2++;
        }
    }

    private static y00<c>[] p(int i2) {
        return new y00[i2];
    }

    public long b() {
        return this.q.b();
    }

    public boolean c(long j2) {
        return this.q.c(j2);
    }

    public boolean d() {
        return this.q.d();
    }

    public long e(long j2, z0 z0Var) {
        for (y00<c> y00 : this.p) {
            if (y00.e == 2) {
                return y00.e(j2, z0Var);
            }
        }
        return j2;
    }

    public long g() {
        return this.q.g();
    }

    public void h(long j2) {
        this.q.h(j2);
    }

    public long k(h40[] h40Arr, boolean[] zArr, l00[] l00Arr, boolean[] zArr2, long j2) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < h40Arr.length; i2++) {
            if (l00Arr[i2] != null) {
                y00 y00 = l00Arr[i2];
                if (h40Arr[i2] == null || !zArr[i2]) {
                    y00.N();
                    l00Arr[i2] = null;
                } else {
                    ((c) y00.C()).b(h40Arr[i2]);
                    arrayList.add(y00);
                }
            }
            if (l00Arr[i2] == null && h40Arr[i2] != null) {
                y00<c> f2 = f(h40Arr[i2], j2);
                arrayList.add(f2);
                l00Arr[i2] = f2;
                zArr2[i2] = true;
            }
        }
        y00<c>[] p2 = p(arrayList.size());
        this.p = p2;
        arrayList.toArray(p2);
        this.q = this.m.a(this.p);
        return j2;
    }

    public void n() {
        this.g.a();
    }

    public long o(long j2) {
        for (y00<c> P : this.p) {
            P.P(j2);
        }
        return j2;
    }

    public long q() {
        if (this.r) {
            return -9223372036854775807L;
        }
        this.j.C();
        this.r = true;
        return -9223372036854775807L;
    }

    public void r(e00.a aVar, long j2) {
        this.n = aVar;
        aVar.m(this);
    }

    public p00 s() {
        return this.l;
    }

    /* renamed from: t */
    public void j(y00<c> y00) {
        this.n.j(this);
    }

    public void u(long j2, boolean z) {
        for (y00<c> u : this.p) {
            u.u(j2, z);
        }
    }

    public void v() {
        for (y00<c> N : this.p) {
            N.N();
        }
        this.n = null;
        this.j.A();
    }

    public void w(d20 d20) {
        this.o = d20;
        for (y00<c> C : this.p) {
            C.C().c(d20);
        }
        this.n.j(this);
    }
}
