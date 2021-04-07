package defpackage;

/* renamed from: nv  reason: default package */
final class nv {
    public dv a;
    public long b;
    public long c;
    public long d;
    public int e;
    public int f;
    public long[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public long[] k;
    public boolean[] l;
    public boolean m;
    public boolean[] n;
    public mv o;
    public int p;
    public i50 q;
    public boolean r;
    public long s;

    nv() {
    }

    public void a(it itVar) {
        itVar.readFully(this.q.a, 0, this.p);
        this.q.M(0);
        this.r = false;
    }

    public void b(i50 i50) {
        i50.h(this.q.a, 0, this.p);
        this.q.M(0);
        this.r = false;
    }

    public long c(int i2) {
        return this.k[i2] + ((long) this.j[i2]);
    }

    public void d(int i2) {
        i50 i50 = this.q;
        if (i50 == null || i50.d() < i2) {
            this.q = new i50(i2);
        }
        this.p = i2;
        this.m = true;
        this.r = true;
    }

    public void e(int i2, int i3) {
        this.e = i2;
        this.f = i3;
        int[] iArr = this.h;
        if (iArr == null || iArr.length < i2) {
            this.g = new long[i2];
            this.h = new int[i2];
        }
        int[] iArr2 = this.i;
        if (iArr2 == null || iArr2.length < i3) {
            int i4 = (i3 * 125) / 100;
            this.i = new int[i4];
            this.j = new int[i4];
            this.k = new long[i4];
            this.l = new boolean[i4];
            this.n = new boolean[i4];
        }
    }

    public void f() {
        this.e = 0;
        this.s = 0;
        this.m = false;
        this.r = false;
        this.o = null;
    }

    public boolean g(int i2) {
        return this.m && this.n[i2];
    }
}
