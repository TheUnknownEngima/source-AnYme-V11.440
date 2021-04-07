package defpackage;

/* renamed from: fx  reason: default package */
final class fx {
    private final s50 a = new s50(0);
    private final i50 b = new i50();
    private boolean c;
    private boolean d;
    private boolean e;
    private long f = -9223372036854775807L;
    private long g = -9223372036854775807L;
    private long h = -9223372036854775807L;

    fx() {
    }

    private int a(it itVar) {
        this.b.J(v50.f);
        this.c = true;
        itVar.i();
        return 0;
    }

    private int f(it itVar, st stVar, int i) {
        int min = (int) Math.min(112800, itVar.g());
        long j = (long) 0;
        if (itVar.m() != j) {
            stVar.a = j;
            return 1;
        }
        this.b.I(min);
        itVar.i();
        itVar.l(this.b.a, 0, min);
        this.f = g(this.b, i);
        this.d = true;
        return 0;
    }

    private long g(i50 i50, int i) {
        int d2 = i50.d();
        for (int c2 = i50.c(); c2 < d2; c2++) {
            if (i50.a[c2] == 71) {
                long b2 = ix.b(i50, c2, i);
                if (b2 != -9223372036854775807L) {
                    return b2;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int h(it itVar, st stVar, int i) {
        long g2 = itVar.g();
        int min = (int) Math.min(112800, g2);
        long j = g2 - ((long) min);
        if (itVar.m() != j) {
            stVar.a = j;
            return 1;
        }
        this.b.I(min);
        itVar.i();
        itVar.l(this.b.a, 0, min);
        this.g = i(this.b, i);
        this.e = true;
        return 0;
    }

    private long i(i50 i50, int i) {
        int c2 = i50.c();
        int d2 = i50.d();
        while (true) {
            d2--;
            if (d2 < c2) {
                return -9223372036854775807L;
            }
            if (i50.a[d2] == 71) {
                long b2 = ix.b(i50, d2, i);
                if (b2 != -9223372036854775807L) {
                    return b2;
                }
            }
        }
    }

    public long b() {
        return this.h;
    }

    public s50 c() {
        return this.a;
    }

    public boolean d() {
        return this.c;
    }

    public int e(it itVar, st stVar, int i) {
        if (i <= 0) {
            return a(itVar);
        }
        if (!this.e) {
            return h(itVar, stVar, i);
        }
        if (this.g == -9223372036854775807L) {
            return a(itVar);
        }
        if (!this.d) {
            return f(itVar, stVar, i);
        }
        long j = this.f;
        if (j == -9223372036854775807L) {
            return a(itVar);
        }
        this.h = this.a.b(this.g) - this.a.b(j);
        return a(itVar);
    }
}
