package defpackage;

import defpackage.mt;
import defpackage.nt;
import defpackage.tt;
import defpackage.vt;

/* renamed from: du  reason: default package */
public final class du implements ht {
    private final byte[] a;
    private final i50 b;
    private final boolean c;
    private final mt.a d;
    private jt e;
    private vt f;
    private int g;
    private yx h;
    private y40 i;
    private int j;
    private int k;
    private cu l;
    private int m;
    private long n;

    static {
        bu buVar = bu.a;
    }

    public du() {
        this(0);
    }

    public du(int i2) {
        this.a = new byte[42];
        this.b = new i50(new byte[32768], 0);
        this.c = (i2 & 1) == 0 ? false : true;
        this.d = new mt.a();
        this.g = 0;
    }

    private long b(i50 i50, boolean z) {
        boolean z2;
        q40.e(this.i);
        int c2 = i50.c();
        while (true) {
            if (c2 <= i50.d() - 16) {
                i50.M(c2);
                if (mt.d(i50, this.i, this.k, this.d)) {
                    break;
                }
                c2++;
            } else if (z) {
                while (c2 <= i50.d() - this.j) {
                    i50.M(c2);
                    boolean z3 = false;
                    try {
                        z2 = mt.d(i50, this.i, this.k, this.d);
                    } catch (IndexOutOfBoundsException unused) {
                        z2 = false;
                    }
                    if (i50.c() <= i50.d()) {
                        z3 = z2;
                    }
                    if (!z3) {
                        c2++;
                    }
                }
                i50.M(i50.d());
                return -1;
            } else {
                i50.M(c2);
                return -1;
            }
        }
        i50.M(c2);
        return this.d.a;
    }

    private void c(it itVar) {
        this.k = nt.b(itVar);
        jt jtVar = this.e;
        v50.g(jtVar);
        jtVar.f(e(itVar.m(), itVar.g()));
        this.g = 5;
    }

    private tt e(long j2, long j3) {
        q40.e(this.i);
        y40 y40 = this.i;
        if (y40.k != null) {
            return new ot(y40, j2);
        }
        if (j3 == -1 || y40.j <= 0) {
            return new tt.b(this.i.h());
        }
        cu cuVar = new cu(y40, this.k, j2, j3);
        this.l = cuVar;
        return cuVar.b();
    }

    private void i(it itVar) {
        byte[] bArr = this.a;
        itVar.l(bArr, 0, bArr.length);
        itVar.i();
        this.g = 2;
    }

    static /* synthetic */ ht[] j() {
        return new ht[]{new du()};
    }

    private void k() {
        y40 y40 = this.i;
        v50.g(y40);
        long j2 = (this.n * 1000000) / ((long) y40.e);
        vt vtVar = this.f;
        v50.g(vtVar);
        vtVar.c(j2, 1, this.m, 0, (vt.a) null);
    }

    private int l(it itVar, st stVar) {
        boolean z;
        q40.e(this.f);
        q40.e(this.i);
        cu cuVar = this.l;
        if (cuVar != null && cuVar.d()) {
            return this.l.c(itVar, stVar);
        }
        if (this.n == -1) {
            this.n = mt.i(itVar, this.i);
            return 0;
        }
        int d2 = this.b.d();
        if (d2 < 32768) {
            int a2 = itVar.a(this.b.a, d2, 32768 - d2);
            z = a2 == -1;
            if (!z) {
                this.b.L(d2 + a2);
            } else if (this.b.a() == 0) {
                k();
                return -1;
            }
        } else {
            z = false;
        }
        int c2 = this.b.c();
        int i2 = this.m;
        int i3 = this.j;
        if (i2 < i3) {
            i50 i50 = this.b;
            i50.N(Math.min(i3 - i2, i50.a()));
        }
        long b2 = b(this.b, z);
        int c3 = this.b.c() - c2;
        this.b.M(c2);
        this.f.b(this.b, c3);
        this.m += c3;
        if (b2 != -1) {
            k();
            this.m = 0;
            this.n = b2;
        }
        if (this.b.a() < 16) {
            i50 i502 = this.b;
            byte[] bArr = i502.a;
            int c4 = i502.c();
            i50 i503 = this.b;
            System.arraycopy(bArr, c4, i503.a, 0, i503.a());
            i50 i504 = this.b;
            i504.I(i504.a());
        }
        return 0;
    }

    private void m(it itVar) {
        this.h = nt.d(itVar, !this.c);
        this.g = 1;
    }

    private void n(it itVar) {
        nt.a aVar = new nt.a(this.i);
        boolean z = false;
        while (!z) {
            z = nt.e(itVar, aVar);
            y40 y40 = aVar.a;
            v50.g(y40);
            this.i = y40;
        }
        q40.e(this.i);
        this.j = Math.max(this.i.c, 6);
        vt vtVar = this.f;
        v50.g(vtVar);
        vtVar.d(this.i.i(this.a, this.h));
        this.g = 4;
    }

    private void o(it itVar) {
        nt.j(itVar);
        this.g = 3;
    }

    public void a() {
    }

    public boolean d(it itVar) {
        nt.c(itVar, false);
        return nt.a(itVar);
    }

    public int f(it itVar, st stVar) {
        int i2 = this.g;
        if (i2 == 0) {
            m(itVar);
            return 0;
        } else if (i2 == 1) {
            i(itVar);
            return 0;
        } else if (i2 == 2) {
            o(itVar);
            return 0;
        } else if (i2 == 3) {
            n(itVar);
            return 0;
        } else if (i2 == 4) {
            c(itVar);
            return 0;
        } else if (i2 == 5) {
            return l(itVar, stVar);
        } else {
            throw new IllegalStateException();
        }
    }

    public void g(jt jtVar) {
        this.e = jtVar;
        this.f = jtVar.a(0, 1);
        jtVar.p();
    }

    public void h(long j2, long j3) {
        long j4 = 0;
        if (j2 == 0) {
            this.g = 0;
        } else {
            cu cuVar = this.l;
            if (cuVar != null) {
                cuVar.h(j3);
            }
        }
        if (j3 != 0) {
            j4 = -1;
        }
        this.n = j4;
        this.m = 0;
        this.b.H();
    }
}
