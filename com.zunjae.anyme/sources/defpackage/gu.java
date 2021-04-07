package defpackage;

import defpackage.tt;

/* renamed from: gu  reason: default package */
public final class gu implements ht {
    private final i50 a = new i50(4);
    private final i50 b = new i50(9);
    private final i50 c = new i50(11);
    private final i50 d = new i50();
    private final hu e = new hu();
    private jt f;
    private int g = 1;
    private boolean h;
    private long i;
    private int j;
    private int k;
    private int l;
    private long m;
    private boolean n;
    private fu o;
    private ju p;

    static {
        eu euVar = eu.a;
    }

    private void b() {
        if (!this.n) {
            this.f.f(new tt.b(-9223372036854775807L));
            this.n = true;
        }
    }

    private long c() {
        if (this.h) {
            return this.i + this.m;
        }
        if (this.e.d() == -9223372036854775807L) {
            return 0;
        }
        return this.m;
    }

    static /* synthetic */ ht[] e() {
        return new ht[]{new gu()};
    }

    private i50 i(it itVar) {
        if (this.l > this.d.b()) {
            i50 i50 = this.d;
            i50.K(new byte[Math.max(i50.b() * 2, this.l)], 0);
        } else {
            this.d.M(0);
        }
        this.d.L(this.l);
        itVar.readFully(this.d.a, 0, this.l);
        return this.d;
    }

    private boolean j(it itVar) {
        boolean z = false;
        if (!itVar.b(this.b.a, 0, 9, true)) {
            return false;
        }
        this.b.M(0);
        this.b.N(4);
        int z2 = this.b.z();
        boolean z3 = (z2 & 4) != 0;
        if ((z2 & 1) != 0) {
            z = true;
        }
        if (z3 && this.o == null) {
            this.o = new fu(this.f.a(8, 1));
        }
        if (z && this.p == null) {
            this.p = new ju(this.f.a(9, 2));
        }
        this.f.p();
        this.j = (this.b.k() - 9) + 4;
        this.g = 2;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean k(defpackage.it r9) {
        /*
            r8 = this;
            long r0 = r8.c()
            int r2 = r8.k
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r6 = 1
            r7 = 8
            if (r2 != r7) goto L_0x0024
            fu r2 = r8.o
            if (r2 == 0) goto L_0x0024
            r8.b()
            fu r2 = r8.o
        L_0x001a:
            i50 r9 = r8.i(r9)
            boolean r5 = r2.a(r9, r0)
        L_0x0022:
            r9 = 1
            goto L_0x0065
        L_0x0024:
            int r2 = r8.k
            r7 = 9
            if (r2 != r7) goto L_0x0034
            ju r2 = r8.p
            if (r2 == 0) goto L_0x0034
            r8.b()
            ju r2 = r8.p
            goto L_0x001a
        L_0x0034:
            int r2 = r8.k
            r7 = 18
            if (r2 != r7) goto L_0x005f
            boolean r2 = r8.n
            if (r2 != 0) goto L_0x005f
            hu r2 = r8.e
            i50 r9 = r8.i(r9)
            boolean r5 = r2.a(r9, r0)
            hu r9 = r8.e
            long r0 = r9.d()
            int r9 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r9 == 0) goto L_0x0022
            jt r9 = r8.f
            tt$b r2 = new tt$b
            r2.<init>(r0)
            r9.f(r2)
            r8.n = r6
            goto L_0x0022
        L_0x005f:
            int r0 = r8.l
            r9.j(r0)
            r9 = 0
        L_0x0065:
            boolean r0 = r8.h
            if (r0 != 0) goto L_0x007f
            if (r5 == 0) goto L_0x007f
            r8.h = r6
            hu r0 = r8.e
            long r0 = r0.d()
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x007b
            long r0 = r8.m
            long r0 = -r0
            goto L_0x007d
        L_0x007b:
            r0 = 0
        L_0x007d:
            r8.i = r0
        L_0x007f:
            r0 = 4
            r8.j = r0
            r0 = 2
            r8.g = r0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gu.k(it):boolean");
    }

    private boolean l(it itVar) {
        if (!itVar.b(this.c.a, 0, 11, true)) {
            return false;
        }
        this.c.M(0);
        this.k = this.c.z();
        this.l = this.c.C();
        this.m = (long) this.c.C();
        this.m = (((long) (this.c.z() << 24)) | this.m) * 1000;
        this.c.N(3);
        this.g = 4;
        return true;
    }

    private void m(it itVar) {
        itVar.j(this.j);
        this.j = 0;
        this.g = 3;
    }

    public void a() {
    }

    public boolean d(it itVar) {
        itVar.l(this.a.a, 0, 3);
        this.a.M(0);
        if (this.a.C() != 4607062) {
            return false;
        }
        itVar.l(this.a.a, 0, 2);
        this.a.M(0);
        if ((this.a.F() & 250) != 0) {
            return false;
        }
        itVar.l(this.a.a, 0, 4);
        this.a.M(0);
        int k2 = this.a.k();
        itVar.i();
        itVar.e(k2);
        itVar.l(this.a.a, 0, 4);
        this.a.M(0);
        return this.a.k() == 0;
    }

    public int f(it itVar, st stVar) {
        while (true) {
            int i2 = this.g;
            if (i2 != 1) {
                if (i2 == 2) {
                    m(itVar);
                } else if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException();
                    } else if (k(itVar)) {
                        return 0;
                    }
                } else if (!l(itVar)) {
                    return -1;
                }
            } else if (!j(itVar)) {
                return -1;
            }
        }
    }

    public void g(jt jtVar) {
        this.f = jtVar;
    }

    public void h(long j2, long j3) {
        this.g = 1;
        this.h = false;
        this.j = 0;
    }
}
