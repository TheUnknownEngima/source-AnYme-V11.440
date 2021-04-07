package defpackage;

import com.github.mikephil.charting.utils.Utils;
import defpackage.d1;
import defpackage.z0;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: u0  reason: default package */
public class u0 {
    private static int q = 1000;
    public static v0 r;
    int a;
    private HashMap<String, z0> b;
    private a c;
    private int d;
    private int e;
    s0[] f;
    public boolean g;
    public boolean h;
    private boolean[] i;
    int j;
    int k;
    private int l;
    final t0 m;
    private z0[] n;
    private int o;
    private final a p;

    /* renamed from: u0$a */
    interface a {
        void a(z0 z0Var);

        z0 b(u0 u0Var, boolean[] zArr);

        void c(a aVar);

        void clear();

        z0 getKey();
    }

    public u0() {
        this.a = 0;
        this.b = null;
        this.d = 32;
        this.e = 32;
        this.f = null;
        this.g = false;
        this.h = false;
        this.i = new boolean[32];
        this.j = 1;
        this.k = 0;
        this.l = 32;
        this.n = new z0[q];
        this.o = 0;
        this.f = new s0[32];
        C();
        t0 t0Var = new t0();
        this.m = t0Var;
        this.c = new w0(t0Var);
        this.p = new s0(this.m);
    }

    private final int B(a aVar, boolean z) {
        v0 v0Var = r;
        if (v0Var != null) {
            v0Var.f++;
        }
        for (int i2 = 0; i2 < this.j; i2++) {
            this.i[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            v0 v0Var2 = r;
            if (v0Var2 != null) {
                v0Var2.g++;
            }
            i3++;
            if (i3 >= this.j * 2) {
                return i3;
            }
            if (aVar.getKey() != null) {
                this.i[aVar.getKey().c] = true;
            }
            z0 b2 = aVar.b(this, this.i);
            if (b2 != null) {
                boolean[] zArr = this.i;
                int i4 = b2.c;
                if (zArr[i4]) {
                    return i3;
                }
                zArr[i4] = true;
            }
            if (b2 != null) {
                float f2 = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.k; i6++) {
                    s0 s0Var = this.f[i6];
                    if (s0Var.a.i != z0.a.UNRESTRICTED && !s0Var.e && s0Var.s(b2)) {
                        float f3 = s0Var.d.f(b2);
                        if (f3 < Utils.FLOAT_EPSILON) {
                            float f4 = (-s0Var.b) / f3;
                            if (f4 < f2) {
                                i5 = i6;
                                f2 = f4;
                            }
                        }
                    }
                }
                if (i5 > -1) {
                    s0 s0Var2 = this.f[i5];
                    s0Var2.a.d = -1;
                    v0 v0Var3 = r;
                    if (v0Var3 != null) {
                        v0Var3.h++;
                    }
                    s0Var2.v(b2);
                    z0 z0Var = s0Var2.a;
                    z0Var.d = i5;
                    z0Var.f(s0Var2);
                }
            } else {
                z2 = true;
            }
        }
        return i3;
    }

    private void C() {
        int i2 = 0;
        while (true) {
            s0[] s0VarArr = this.f;
            if (i2 < s0VarArr.length) {
                s0 s0Var = s0VarArr[i2];
                if (s0Var != null) {
                    this.m.a.c(s0Var);
                }
                this.f[i2] = null;
                i2++;
            } else {
                return;
            }
        }
    }

    private z0 a(z0.a aVar, String str) {
        z0 b2 = this.m.b.b();
        if (b2 == null) {
            b2 = new z0(aVar, str);
        } else {
            b2.d();
        }
        b2.e(aVar, str);
        int i2 = this.o;
        int i3 = q;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            q = i4;
            this.n = (z0[]) Arrays.copyOf(this.n, i4);
        }
        z0[] z0VarArr = this.n;
        int i5 = this.o;
        this.o = i5 + 1;
        z0VarArr[i5] = b2;
        return b2;
    }

    private final void l(s0 s0Var) {
        s0[] s0VarArr = this.f;
        int i2 = this.k;
        if (s0VarArr[i2] != null) {
            this.m.a.c(s0VarArr[i2]);
        }
        s0[] s0VarArr2 = this.f;
        int i3 = this.k;
        s0VarArr2[i3] = s0Var;
        z0 z0Var = s0Var.a;
        z0Var.d = i3;
        this.k = i3 + 1;
        z0Var.f(s0Var);
    }

    private void n() {
        for (int i2 = 0; i2 < this.k; i2++) {
            s0 s0Var = this.f[i2];
            s0Var.a.f = s0Var.b;
        }
    }

    public static s0 s(u0 u0Var, z0 z0Var, z0 z0Var2, float f2) {
        s0 r2 = u0Var.r();
        r2.i(z0Var, z0Var2, f2);
        return r2;
    }

    private int u(a aVar) {
        float f2;
        boolean z;
        int i2 = 0;
        while (true) {
            int i3 = this.k;
            f2 = Utils.FLOAT_EPSILON;
            if (i2 >= i3) {
                z = false;
                break;
            }
            s0[] s0VarArr = this.f;
            if (s0VarArr[i2].a.i != z0.a.UNRESTRICTED && s0VarArr[i2].b < Utils.FLOAT_EPSILON) {
                z = true;
                break;
            }
            i2++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i4 = 0;
        while (!z2) {
            v0 v0Var = r;
            if (v0Var != null) {
                v0Var.i++;
            }
            i4++;
            float f3 = Float.MAX_VALUE;
            int i5 = 0;
            int i6 = -1;
            int i7 = -1;
            int i8 = 0;
            while (i5 < this.k) {
                s0 s0Var = this.f[i5];
                if (s0Var.a.i != z0.a.UNRESTRICTED && !s0Var.e && s0Var.b < f2) {
                    int i9 = 1;
                    while (i9 < this.j) {
                        z0 z0Var = this.m.c[i9];
                        float f4 = s0Var.d.f(z0Var);
                        if (f4 > f2) {
                            for (int i10 = 0; i10 < 8; i10++) {
                                float f5 = z0Var.g[i10] / f4;
                                if ((f5 < f3 && i10 == i8) || i10 > i8) {
                                    i7 = i9;
                                    i8 = i10;
                                    f3 = f5;
                                    i6 = i5;
                                }
                            }
                        }
                        i9++;
                        f2 = Utils.FLOAT_EPSILON;
                    }
                }
                i5++;
                f2 = Utils.FLOAT_EPSILON;
            }
            if (i6 != -1) {
                s0 s0Var2 = this.f[i6];
                s0Var2.a.d = -1;
                v0 v0Var2 = r;
                if (v0Var2 != null) {
                    v0Var2.h++;
                }
                s0Var2.v(this.m.c[i7]);
                z0 z0Var2 = s0Var2.a;
                z0Var2.d = i6;
                z0Var2.f(s0Var2);
            } else {
                z2 = true;
            }
            if (i4 > this.j / 2) {
                z2 = true;
            }
            f2 = Utils.FLOAT_EPSILON;
        }
        return i4;
    }

    public static v0 w() {
        return r;
    }

    private void y() {
        int i2 = this.d * 2;
        this.d = i2;
        this.f = (s0[]) Arrays.copyOf(this.f, i2);
        t0 t0Var = this.m;
        t0Var.c = (z0[]) Arrays.copyOf(t0Var.c, this.d);
        int i3 = this.d;
        this.i = new boolean[i3];
        this.e = i3;
        this.l = i3;
        v0 v0Var = r;
        if (v0Var != null) {
            v0Var.b++;
            v0Var.m = Math.max(v0Var.m, (long) i3);
            v0 v0Var2 = r;
            v0Var2.v = v0Var2.m;
        }
    }

    /* access modifiers changed from: package-private */
    public void A(a aVar) {
        v0 v0Var = r;
        if (v0Var != null) {
            v0Var.r++;
            v0Var.s = Math.max(v0Var.s, (long) this.j);
            v0 v0Var2 = r;
            v0Var2.t = Math.max(v0Var2.t, (long) this.k);
        }
        u(aVar);
        B(aVar, false);
        n();
    }

    public void D() {
        t0 t0Var;
        int i2 = 0;
        while (true) {
            t0Var = this.m;
            z0[] z0VarArr = t0Var.c;
            if (i2 >= z0VarArr.length) {
                break;
            }
            z0 z0Var = z0VarArr[i2];
            if (z0Var != null) {
                z0Var.d();
            }
            i2++;
        }
        t0Var.b.d(this.n, this.o);
        this.o = 0;
        Arrays.fill(this.m.c, (Object) null);
        HashMap<String, z0> hashMap = this.b;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.a = 0;
        this.c.clear();
        this.j = 1;
        for (int i3 = 0; i3 < this.k; i3++) {
            this.f[i3].c = false;
        }
        C();
        this.k = 0;
    }

    /* access modifiers changed from: package-private */
    public final void E(s0 s0Var) {
        if (this.k > 0) {
            s0Var.d.t(s0Var, this.f);
            if (s0Var.d.a == 0) {
                s0Var.e = true;
            }
        }
    }

    public void b(e1 e1Var, e1 e1Var2, float f2, int i2) {
        e1 e1Var3 = e1Var;
        e1 e1Var4 = e1Var2;
        z0 q2 = q(e1Var3.m(d1.b.LEFT));
        z0 q3 = q(e1Var3.m(d1.b.TOP));
        z0 q4 = q(e1Var3.m(d1.b.RIGHT));
        z0 q5 = q(e1Var3.m(d1.b.BOTTOM));
        z0 q6 = q(e1Var4.m(d1.b.LEFT));
        z0 q7 = q(e1Var4.m(d1.b.TOP));
        z0 q8 = q(e1Var4.m(d1.b.RIGHT));
        z0 q9 = q(e1Var4.m(d1.b.BOTTOM));
        s0 r2 = r();
        double d2 = (double) f2;
        z0 z0Var = q4;
        double d3 = (double) i2;
        r2.p(q3, q5, q7, q9, (float) (Math.sin(d2) * d3));
        d(r2);
        s0 r3 = r();
        r3.p(q2, z0Var, q6, q8, (float) (Math.cos(d2) * d3));
        d(r3);
    }

    public void c(z0 z0Var, z0 z0Var2, int i2, float f2, z0 z0Var3, z0 z0Var4, int i3, int i4) {
        int i5 = i4;
        s0 r2 = r();
        r2.g(z0Var, z0Var2, i2, f2, z0Var3, z0Var4, i3);
        if (i5 != 7) {
            r2.d(this, i5);
        }
        d(r2);
    }

    public void d(s0 s0Var) {
        z0 u;
        if (s0Var != null) {
            v0 v0Var = r;
            if (v0Var != null) {
                v0Var.d++;
                if (s0Var.e) {
                    v0Var.e++;
                }
            }
            boolean z = true;
            if (this.k + 1 >= this.l || this.j + 1 >= this.e) {
                y();
            }
            boolean z2 = false;
            if (!s0Var.e) {
                E(s0Var);
                if (!s0Var.t()) {
                    s0Var.q();
                    if (s0Var.f(this)) {
                        z0 p2 = p();
                        s0Var.a = p2;
                        l(s0Var);
                        this.p.c(s0Var);
                        B(this.p, true);
                        if (p2.d == -1) {
                            if (s0Var.a == p2 && (u = s0Var.u(p2)) != null) {
                                v0 v0Var2 = r;
                                if (v0Var2 != null) {
                                    v0Var2.h++;
                                }
                                s0Var.v(u);
                            }
                            if (!s0Var.e) {
                                s0Var.a.f(s0Var);
                            }
                            this.k--;
                        }
                    } else {
                        z = false;
                    }
                    if (s0Var.r()) {
                        z2 = z;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!z2) {
                l(s0Var);
            }
        }
    }

    public s0 e(z0 z0Var, z0 z0Var2, int i2, int i3) {
        s0 r2 = r();
        r2.m(z0Var, z0Var2, i2);
        if (i3 != 7) {
            r2.d(this, i3);
        }
        d(r2);
        return r2;
    }

    public void f(z0 z0Var, int i2) {
        s0 s0Var;
        int i3 = z0Var.d;
        if (i3 != -1) {
            s0 s0Var2 = this.f[i3];
            if (!s0Var2.e) {
                if (s0Var2.d.a == 0) {
                    s0Var2.e = true;
                } else {
                    s0Var = r();
                    s0Var.l(z0Var, i2);
                }
            }
            s0Var2.b = (float) i2;
            return;
        }
        s0Var = r();
        s0Var.h(z0Var, i2);
        d(s0Var);
    }

    public void g(z0 z0Var, z0 z0Var2, int i2, boolean z) {
        s0 r2 = r();
        z0 t = t();
        t.e = 0;
        r2.n(z0Var, z0Var2, t, i2);
        d(r2);
    }

    public void h(z0 z0Var, z0 z0Var2, int i2, int i3) {
        s0 r2 = r();
        z0 t = t();
        t.e = 0;
        r2.n(z0Var, z0Var2, t, i2);
        if (i3 != 7) {
            m(r2, (int) (r2.d.f(t) * -1.0f), i3);
        }
        d(r2);
    }

    public void i(z0 z0Var, z0 z0Var2, int i2, boolean z) {
        s0 r2 = r();
        z0 t = t();
        t.e = 0;
        r2.o(z0Var, z0Var2, t, i2);
        d(r2);
    }

    public void j(z0 z0Var, z0 z0Var2, int i2, int i3) {
        s0 r2 = r();
        z0 t = t();
        t.e = 0;
        r2.o(z0Var, z0Var2, t, i2);
        if (i3 != 7) {
            m(r2, (int) (r2.d.f(t) * -1.0f), i3);
        }
        d(r2);
    }

    public void k(z0 z0Var, z0 z0Var2, z0 z0Var3, z0 z0Var4, float f2, int i2) {
        s0 r2 = r();
        r2.j(z0Var, z0Var2, z0Var3, z0Var4, f2);
        if (i2 != 7) {
            r2.d(this, i2);
        }
        d(r2);
    }

    /* access modifiers changed from: package-private */
    public void m(s0 s0Var, int i2, int i3) {
        s0Var.e(o(i3, (String) null), i2);
    }

    public z0 o(int i2, String str) {
        v0 v0Var = r;
        if (v0Var != null) {
            v0Var.j++;
        }
        if (this.j + 1 >= this.e) {
            y();
        }
        z0 a2 = a(z0.a.ERROR, str);
        int i3 = this.a + 1;
        this.a = i3;
        this.j++;
        a2.c = i3;
        a2.e = i2;
        this.m.c[i3] = a2;
        this.c.a(a2);
        return a2;
    }

    public z0 p() {
        v0 v0Var = r;
        if (v0Var != null) {
            v0Var.l++;
        }
        if (this.j + 1 >= this.e) {
            y();
        }
        z0 a2 = a(z0.a.SLACK, (String) null);
        int i2 = this.a + 1;
        this.a = i2;
        this.j++;
        a2.c = i2;
        this.m.c[i2] = a2;
        return a2;
    }

    public z0 q(Object obj) {
        z0 z0Var = null;
        if (obj == null) {
            return null;
        }
        if (this.j + 1 >= this.e) {
            y();
        }
        if (obj instanceof d1) {
            d1 d1Var = (d1) obj;
            z0Var = d1Var.f();
            if (z0Var == null) {
                d1Var.l(this.m);
                z0Var = d1Var.f();
            }
            int i2 = z0Var.c;
            if (i2 == -1 || i2 > this.a || this.m.c[i2] == null) {
                if (z0Var.c != -1) {
                    z0Var.d();
                }
                int i3 = this.a + 1;
                this.a = i3;
                this.j++;
                z0Var.c = i3;
                z0Var.i = z0.a.UNRESTRICTED;
                this.m.c[i3] = z0Var;
            }
        }
        return z0Var;
    }

    public s0 r() {
        s0 b2 = this.m.a.b();
        if (b2 == null) {
            b2 = new s0(this.m);
        } else {
            b2.w();
        }
        z0.b();
        return b2;
    }

    public z0 t() {
        v0 v0Var = r;
        if (v0Var != null) {
            v0Var.k++;
        }
        if (this.j + 1 >= this.e) {
            y();
        }
        z0 a2 = a(z0.a.SLACK, (String) null);
        int i2 = this.a + 1;
        this.a = i2;
        this.j++;
        a2.c = i2;
        this.m.c[i2] = a2;
        return a2;
    }

    public t0 v() {
        return this.m;
    }

    public int x(Object obj) {
        z0 f2 = ((d1) obj).f();
        if (f2 != null) {
            return (int) (f2.f + 0.5f);
        }
        return 0;
    }

    public void z() {
        v0 v0Var = r;
        if (v0Var != null) {
            v0Var.c++;
        }
        if (this.g || this.h) {
            v0 v0Var2 = r;
            if (v0Var2 != null) {
                v0Var2.o++;
            }
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= this.k) {
                    z = true;
                    break;
                } else if (!this.f[i2].e) {
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                v0 v0Var3 = r;
                if (v0Var3 != null) {
                    v0Var3.n++;
                }
                n();
                return;
            }
        }
        A(this.c);
    }
}
