package defpackage;

import com.google.android.exoplayer2.f0;
import defpackage.tt;
import defpackage.vt;

/* renamed from: xv  reason: default package */
abstract class xv {
    private final tv a = new tv();
    private vt b;
    private jt c;
    private vv d;
    private long e;
    private long f;
    private long g;
    private int h;
    private int i;
    private b j;
    private long k;
    private boolean l;
    private boolean m;

    /* renamed from: xv$b */
    static class b {
        f0 a;
        vv b;

        b() {
        }
    }

    /* renamed from: xv$c */
    private static final class c implements vv {
        private c() {
        }

        public tt a() {
            return new tt.b(-9223372036854775807L);
        }

        public long b(it itVar) {
            return -1;
        }

        public void c(long j) {
        }
    }

    private int g(it itVar) {
        boolean z = true;
        while (z) {
            if (!this.a.d(itVar)) {
                this.h = 3;
                return -1;
            }
            this.k = itVar.m() - this.f;
            z = h(this.a.c(), this.f, this.j);
            if (z) {
                this.f = itVar.m();
            }
        }
        it itVar2 = itVar;
        f0 f0Var = this.j.a;
        this.i = f0Var.A;
        if (!this.m) {
            this.b.d(f0Var);
            this.m = true;
        }
        vv vvVar = this.j.b;
        if (vvVar != null) {
            this.d = vvVar;
        } else if (itVar.g() == -1) {
            this.d = new c();
        } else {
            uv b2 = this.a.b();
            this.d = new qv(this, this.f, itVar.g(), (long) (b2.e + b2.f), b2.c, (b2.b & 4) != 0);
        }
        this.j = null;
        this.h = 2;
        this.a.f();
        return 0;
    }

    private int i(it itVar, st stVar) {
        it itVar2 = itVar;
        long b2 = this.d.b(itVar2);
        if (b2 >= 0) {
            stVar.a = b2;
            return 1;
        }
        if (b2 < -1) {
            d(-(b2 + 2));
        }
        if (!this.l) {
            this.c.f(this.d.a());
            this.l = true;
        }
        if (this.k > 0 || this.a.d(itVar2)) {
            this.k = 0;
            i50 c2 = this.a.c();
            long e2 = e(c2);
            if (e2 >= 0) {
                long j2 = this.g;
                if (j2 + e2 >= this.e) {
                    long a2 = a(j2);
                    this.b.b(c2, c2.d());
                    this.b.c(a2, 1, c2.d(), 0, (vt.a) null);
                    this.e = -1;
                }
            }
            this.g += e2;
            return 0;
        }
        this.h = 3;
        return -1;
    }

    /* access modifiers changed from: protected */
    public long a(long j2) {
        return (j2 * 1000000) / ((long) this.i);
    }

    /* access modifiers changed from: protected */
    public long b(long j2) {
        return (((long) this.i) * j2) / 1000000;
    }

    /* access modifiers changed from: package-private */
    public void c(jt jtVar, vt vtVar) {
        this.c = jtVar;
        this.b = vtVar;
        j(true);
    }

    /* access modifiers changed from: protected */
    public void d(long j2) {
        this.g = j2;
    }

    /* access modifiers changed from: protected */
    public abstract long e(i50 i50);

    /* access modifiers changed from: package-private */
    public final int f(it itVar, st stVar) {
        int i2 = this.h;
        if (i2 == 0) {
            return g(itVar);
        }
        if (i2 == 1) {
            itVar.j((int) this.f);
            this.h = 2;
            return 0;
        } else if (i2 == 2) {
            return i(itVar, stVar);
        } else {
            throw new IllegalStateException();
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean h(i50 i50, long j2, b bVar);

    /* access modifiers changed from: protected */
    public void j(boolean z) {
        int i2;
        if (z) {
            this.j = new b();
            this.f = 0;
            i2 = 0;
        } else {
            i2 = 1;
        }
        this.h = i2;
        this.e = -1;
        this.g = 0;
    }

    /* access modifiers changed from: package-private */
    public final void k(long j2, long j3) {
        this.a.e();
        if (j2 == 0) {
            j(!this.l);
        } else if (this.h != 0) {
            long b2 = b(j3);
            this.e = b2;
            this.d.c(b2);
            this.h = 2;
        }
    }
}
