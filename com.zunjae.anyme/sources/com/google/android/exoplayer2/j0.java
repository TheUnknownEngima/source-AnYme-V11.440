package com.google.android.exoplayer2;

import com.google.android.exoplayer2.upstream.e;
import defpackage.f00;

final class j0 {
    public final e00 a;
    public final Object b;
    public final l00[] c;
    public boolean d;
    public boolean e;
    public k0 f;
    private final boolean[] g;
    private final w0[] h;
    private final k40 i;
    private final f00 j;
    private j0 k;
    private p00 l = p00.h;
    private l40 m;
    private long n;

    public j0(w0[] w0VarArr, long j2, k40 k40, e eVar, f00 f00, k0 k0Var, l40 l40) {
        this.h = w0VarArr;
        this.n = j2;
        this.i = k40;
        this.j = f00;
        f00.a aVar = k0Var.a;
        this.b = aVar.a;
        this.f = k0Var;
        this.m = l40;
        this.c = new l00[w0VarArr.length];
        this.g = new boolean[w0VarArr.length];
        this.a = e(aVar, f00, eVar, k0Var.b, k0Var.d);
    }

    private void c(l00[] l00Arr) {
        int i2 = 0;
        while (true) {
            w0[] w0VarArr = this.h;
            if (i2 < w0VarArr.length) {
                if (w0VarArr[i2].j() == 6 && this.m.c(i2)) {
                    l00Arr[i2] = new b00();
                }
                i2++;
            } else {
                return;
            }
        }
    }

    private static e00 e(f00.a aVar, f00 f00, e eVar, long j2, long j3) {
        e00 a2 = f00.a(aVar, eVar, j2);
        return (j3 == -9223372036854775807L || j3 == Long.MIN_VALUE) ? a2 : new wz(a2, true, 0, j3);
    }

    private void f() {
        if (r()) {
            int i2 = 0;
            while (true) {
                l40 l40 = this.m;
                if (i2 < l40.a) {
                    boolean c2 = l40.c(i2);
                    h40 a2 = this.m.c.a(i2);
                    if (c2 && a2 != null) {
                        a2.i();
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    private void g(l00[] l00Arr) {
        int i2 = 0;
        while (true) {
            w0[] w0VarArr = this.h;
            if (i2 < w0VarArr.length) {
                if (w0VarArr[i2].j() == 6) {
                    l00Arr[i2] = null;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    private void h() {
        if (r()) {
            int i2 = 0;
            while (true) {
                l40 l40 = this.m;
                if (i2 < l40.a) {
                    boolean c2 = l40.c(i2);
                    h40 a2 = this.m.c.a(i2);
                    if (c2 && a2 != null) {
                        a2.e();
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    private boolean r() {
        return this.k == null;
    }

    private static void u(long j2, f00 f00, e00 e00) {
        if (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) {
            f00.i(e00);
            return;
        }
        try {
            f00.i(((wz) e00).e);
        } catch (RuntimeException e2) {
            b50.d("MediaPeriodHolder", "Period release failed.", e2);
        }
    }

    public long a(l40 l40, long j2, boolean z) {
        return b(l40, j2, z, new boolean[this.h.length]);
    }

    public long b(l40 l40, long j2, boolean z, boolean[] zArr) {
        l40 l402 = l40;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= l402.a) {
                break;
            }
            boolean[] zArr2 = this.g;
            if (z || !l40.b(this.m, i2)) {
                z2 = false;
            }
            zArr2[i2] = z2;
            i2++;
        }
        g(this.c);
        f();
        this.m = l402;
        h();
        i40 i40 = l402.c;
        long k2 = this.a.k(i40.b(), this.g, this.c, zArr, j2);
        c(this.c);
        this.e = false;
        int i3 = 0;
        while (true) {
            l00[] l00Arr = this.c;
            if (i3 >= l00Arr.length) {
                return k2;
            }
            if (l00Arr[i3] != null) {
                q40.f(l40.c(i3));
                if (this.h[i3].j() != 6) {
                    this.e = true;
                }
            } else {
                q40.f(i40.a(i3) == null);
            }
            i3++;
        }
    }

    public void d(long j2) {
        q40.f(r());
        this.a.c(y(j2));
    }

    public long i() {
        if (!this.d) {
            return this.f.b;
        }
        long g2 = this.e ? this.a.g() : Long.MIN_VALUE;
        return g2 == Long.MIN_VALUE ? this.f.e : g2;
    }

    public j0 j() {
        return this.k;
    }

    public long k() {
        if (!this.d) {
            return 0;
        }
        return this.a.b();
    }

    public long l() {
        return this.n;
    }

    public long m() {
        return this.f.b + this.n;
    }

    public p00 n() {
        return this.l;
    }

    public l40 o() {
        return this.m;
    }

    public void p(float f2, b1 b1Var) {
        this.d = true;
        this.l = this.a.s();
        long a2 = a(v(f2, b1Var), this.f.b, false);
        long j2 = this.n;
        k0 k0Var = this.f;
        this.n = j2 + (k0Var.b - a2);
        this.f = k0Var.b(a2);
    }

    public boolean q() {
        return this.d && (!this.e || this.a.g() == Long.MIN_VALUE);
    }

    public void s(long j2) {
        q40.f(r());
        if (this.d) {
            this.a.h(y(j2));
        }
    }

    public void t() {
        f();
        u(this.f.d, this.j, this.a);
    }

    public l40 v(float f2, b1 b1Var) {
        l40 d2 = this.i.d(this.h, n(), this.f.a, b1Var);
        for (h40 h40 : d2.c.b()) {
            if (h40 != null) {
                h40.n(f2);
            }
        }
        return d2;
    }

    public void w(j0 j0Var) {
        if (j0Var != this.k) {
            f();
            this.k = j0Var;
            h();
        }
    }

    public void x(long j2) {
        this.n = j2;
    }

    public long y(long j2) {
        return j2 - l();
    }

    public long z(long j2) {
        return j2 + l();
    }
}
