package defpackage;

import defpackage.e1;

/* renamed from: z1  reason: default package */
public abstract class z1 implements q1 {
    public int a;
    e1 b;
    x1 c;
    protected e1.b d;
    t1 e = new t1(this);
    public int f = 0;
    boolean g = false;
    public s1 h = new s1(this);
    public s1 i = new s1(this);
    protected b j = b.NONE;

    /* renamed from: z1$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                d1$b[] r0 = defpackage.d1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                d1$b r1 = defpackage.d1.b.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                d1$b r1 = defpackage.d1.b.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                d1$b r1 = defpackage.d1.b.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                d1$b r1 = defpackage.d1.b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                d1$b r1 = defpackage.d1.b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.z1.a.<clinit>():void");
        }
    }

    /* renamed from: z1$b */
    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public z1(e1 e1Var) {
        this.b = e1Var;
    }

    private void l(int i2, int i3) {
        int i4;
        t1 t1Var;
        int i5 = this.a;
        if (i5 != 0) {
            if (i5 == 1) {
                int g2 = g(this.e.m, i2);
                t1Var = this.e;
                i4 = Math.min(g2, i3);
                t1Var.d(i4);
            } else if (i5 == 2) {
                e1 G = this.b.G();
                if (G != null) {
                    z1 z1Var = i2 == 0 ? G.d : G.e;
                    if (z1Var.e.j) {
                        e1 e1Var = this.b;
                        i3 = (int) ((((float) z1Var.e.g) * (i2 == 0 ? e1Var.o : e1Var.r)) + 0.5f);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (i5 == 3) {
                e1 e1Var2 = this.b;
                w1 w1Var = e1Var2.d;
                e1.b bVar = w1Var.d;
                e1.b bVar2 = e1.b.MATCH_CONSTRAINT;
                if (bVar == bVar2 && w1Var.a == 3) {
                    y1 y1Var = e1Var2.e;
                    if (y1Var.d == bVar2 && y1Var.a == 3) {
                        return;
                    }
                }
                e1 e1Var3 = this.b;
                z1 z1Var2 = i2 == 0 ? e1Var3.e : e1Var3.d;
                if (z1Var2.e.j) {
                    float t = this.b.t();
                    this.e.d(i2 == 1 ? (int) ((((float) z1Var2.e.g) / t) + 0.5f) : (int) ((t * ((float) z1Var2.e.g)) + 0.5f));
                    return;
                }
                return;
            } else {
                return;
            }
        }
        t1Var = this.e;
        i4 = g(i3, i2);
        t1Var.d(i4);
    }

    public void a(q1 q1Var) {
    }

    /* access modifiers changed from: protected */
    public final void b(s1 s1Var, s1 s1Var2, int i2) {
        s1Var.l.add(s1Var2);
        s1Var.f = i2;
        s1Var2.k.add(s1Var);
    }

    /* access modifiers changed from: protected */
    public final void c(s1 s1Var, s1 s1Var2, int i2, t1 t1Var) {
        s1Var.l.add(s1Var2);
        s1Var.l.add(this.e);
        s1Var.h = i2;
        s1Var.i = t1Var;
        s1Var2.k.add(s1Var);
        t1Var.k.add(s1Var);
    }

    /* access modifiers changed from: package-private */
    public abstract void d();

    /* access modifiers changed from: package-private */
    public abstract void e();

    /* access modifiers changed from: package-private */
    public abstract void f();

    /* access modifiers changed from: protected */
    public final int g(int i2, int i3) {
        int i4;
        if (i3 == 0) {
            e1 e1Var = this.b;
            int i5 = e1Var.n;
            i4 = Math.max(e1Var.m, i2);
            if (i5 > 0) {
                i4 = Math.min(i5, i2);
            }
            if (i4 == i2) {
                return i2;
            }
        } else {
            e1 e1Var2 = this.b;
            int i6 = e1Var2.q;
            int max = Math.max(e1Var2.p, i2);
            if (i6 > 0) {
                max = Math.min(i6, i2);
            }
            if (i4 == i2) {
                return i2;
            }
        }
        return i4;
    }

    /* access modifiers changed from: protected */
    public final s1 h(d1 d1Var) {
        z1 z1Var;
        z1 z1Var2;
        d1 d1Var2 = d1Var.c;
        if (d1Var2 == null) {
            return null;
        }
        e1 e1Var = d1Var2.a;
        int i2 = a.a[d1Var2.b.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                z1Var2 = e1Var.d;
            } else if (i2 == 3) {
                z1Var = e1Var.e;
            } else if (i2 == 4) {
                return e1Var.e.k;
            } else {
                if (i2 != 5) {
                    return null;
                }
                z1Var2 = e1Var.e;
            }
            return z1Var2.i;
        }
        z1Var = e1Var.d;
        return z1Var.h;
    }

    /* access modifiers changed from: protected */
    public final s1 i(d1 d1Var, int i2) {
        d1 d1Var2 = d1Var.c;
        if (d1Var2 == null) {
            return null;
        }
        e1 e1Var = d1Var2.a;
        z1 z1Var = i2 == 0 ? e1Var.d : e1Var.e;
        int i3 = a.a[d1Var.c.b.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 5) {
                        return null;
                    }
                }
            }
            return z1Var.i;
        }
        return z1Var.h;
    }

    public long j() {
        t1 t1Var = this.e;
        if (t1Var.j) {
            return (long) t1Var.g;
        }
        return 0;
    }

    public boolean k() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public abstract boolean m();

    /* access modifiers changed from: protected */
    public void n(q1 q1Var, d1 d1Var, d1 d1Var2, int i2) {
        s1 s1Var;
        s1 h2 = h(d1Var);
        s1 h3 = h(d1Var2);
        if (h2.j && h3.j) {
            int c2 = h2.g + d1Var.c();
            int c3 = h3.g - d1Var2.c();
            int i3 = c3 - c2;
            if (!this.e.j && this.d == e1.b.MATCH_CONSTRAINT) {
                l(i2, i3);
            }
            t1 t1Var = this.e;
            if (t1Var.j) {
                if (t1Var.g == i3) {
                    this.h.d(c2);
                    s1Var = this.i;
                } else {
                    e1 e1Var = this.b;
                    float w = i2 == 0 ? e1Var.w() : e1Var.K();
                    if (h2 == h3) {
                        c2 = h2.g;
                        c3 = h3.g;
                        w = 0.5f;
                    }
                    this.h.d((int) (((float) c2) + 0.5f + (((float) ((c3 - c2) - this.e.g)) * w)));
                    s1Var = this.i;
                    c3 = this.h.g + this.e.g;
                }
                s1Var.d(c3);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void o(q1 q1Var) {
    }

    /* access modifiers changed from: protected */
    public void p(q1 q1Var) {
    }
}
