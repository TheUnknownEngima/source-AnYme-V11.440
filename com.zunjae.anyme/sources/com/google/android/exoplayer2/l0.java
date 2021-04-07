package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.b1;
import defpackage.f00;

final class l0 {
    private final b1.b a = new b1.b();
    private final b1.c b = new b1.c();
    private long c;
    private b1 d = b1.a;
    private int e;
    private boolean f;
    private j0 g;
    private j0 h;
    private j0 i;
    private int j;
    private Object k;
    private long l;

    private boolean A() {
        j0 j0Var = this.g;
        if (j0Var == null) {
            return true;
        }
        int b2 = this.d.b(j0Var.b);
        while (true) {
            b2 = this.d.d(b2, this.a, this.b, this.e, this.f);
            while (j0Var.j() != null && !j0Var.f.f) {
                j0Var = j0Var.j();
            }
            j0 j2 = j0Var.j();
            if (b2 == -1 || j2 == null || this.d.b(j2.b) != b2) {
                boolean u = u(j0Var);
                j0Var.f = p(j0Var.f);
            } else {
                j0Var = j2;
            }
        }
        boolean u2 = u(j0Var);
        j0Var.f = p(j0Var.f);
        return !u2;
    }

    private boolean c(long j2, long j3) {
        return j2 == -9223372036854775807L || j2 == j3;
    }

    private boolean d(k0 k0Var, k0 k0Var2) {
        return k0Var.b == k0Var2.b && k0Var.a.equals(k0Var2.a);
    }

    private k0 g(n0 n0Var) {
        return j(n0Var.b, n0Var.d, n0Var.c);
    }

    private k0 h(j0 j0Var, long j2) {
        long j3;
        long j4;
        long j5;
        Object obj;
        long j6;
        k0 k0Var = j0Var.f;
        long l2 = (j0Var.l() + k0Var.e) - j2;
        long j7 = 0;
        if (k0Var.f) {
            int d2 = this.d.d(this.d.b(k0Var.a.a), this.a, this.b, this.e, this.f);
            if (d2 == -1) {
                return null;
            }
            int i2 = this.d.g(d2, this.a, true).c;
            Object obj2 = this.a.b;
            long j8 = k0Var.a.d;
            if (this.d.n(i2, this.b).i == d2) {
                Pair<Object, Long> k2 = this.d.k(this.b, this.a, i2, -9223372036854775807L, Math.max(0, l2));
                if (k2 == null) {
                    return null;
                }
                Object obj3 = k2.first;
                long longValue = ((Long) k2.second).longValue();
                j0 j9 = j0Var.j();
                if (j9 == null || !j9.b.equals(obj3)) {
                    j6 = this.c;
                    this.c = 1 + j6;
                } else {
                    j6 = j9.f.a.d;
                }
                j4 = longValue;
                j7 = -9223372036854775807L;
                j5 = j6;
                obj = obj3;
            } else {
                obj = obj2;
                j5 = j8;
                j4 = 0;
            }
            return j(w(obj, j4, j5), j7, j4);
        }
        f00.a aVar = k0Var.a;
        this.d.h(aVar.a, this.a);
        if (aVar.a()) {
            int i3 = aVar.b;
            int a2 = this.a.a(i3);
            if (a2 == -1) {
                return null;
            }
            int j10 = this.a.j(i3, aVar.c);
            if (j10 >= a2) {
                long j11 = k0Var.c;
                if (j11 == -9223372036854775807L) {
                    b1 b1Var = this.d;
                    b1.c cVar = this.b;
                    b1.b bVar = this.a;
                    Pair<Object, Long> k3 = b1Var.k(cVar, bVar, bVar.c, -9223372036854775807L, Math.max(0, l2));
                    if (k3 == null) {
                        return null;
                    }
                    j3 = ((Long) k3.second).longValue();
                } else {
                    j3 = j11;
                }
                return l(aVar.a, j3, aVar.d);
            } else if (!this.a.n(i3, j10)) {
                return null;
            } else {
                return k(aVar.a, i3, j10, k0Var.c, aVar.d);
            }
        } else {
            int e2 = this.a.e(k0Var.d);
            if (e2 == -1) {
                return l(aVar.a, k0Var.e, aVar.d);
            }
            int i4 = this.a.i(e2);
            if (!this.a.n(e2, i4)) {
                return null;
            }
            return k(aVar.a, e2, i4, k0Var.e, aVar.d);
        }
    }

    private k0 j(f00.a aVar, long j2, long j3) {
        this.d.h(aVar.a, this.a);
        if (!aVar.a()) {
            return l(aVar.a, j3, aVar.d);
        } else if (!this.a.n(aVar.b, aVar.c)) {
            return null;
        } else {
            return k(aVar.a, aVar.b, aVar.c, j2, aVar.d);
        }
    }

    private k0 k(Object obj, int i2, int i3, long j2, long j3) {
        f00.a aVar = new f00.a(obj, i2, i3, j3);
        return new k0(aVar, i3 == this.a.i(i2) ? this.a.g() : 0, j2, -9223372036854775807L, this.d.h(aVar.a, this.a).b(aVar.b, aVar.c), false, false);
    }

    private k0 l(Object obj, long j2, long j3) {
        int d2 = this.a.d(j2);
        Object obj2 = obj;
        f00.a aVar = new f00.a(obj, j3, d2);
        boolean q = q(aVar);
        boolean r = r(aVar, q);
        long f2 = d2 != -1 ? this.a.f(d2) : -9223372036854775807L;
        return new k0(aVar, j2, -9223372036854775807L, f2, (f2 == -9223372036854775807L || f2 == Long.MIN_VALUE) ? this.a.d : f2, q, r);
    }

    private boolean q(f00.a aVar) {
        return !aVar.a() && aVar.e == -1;
    }

    private boolean r(f00.a aVar, boolean z) {
        int b2 = this.d.b(aVar.a);
        return !this.d.n(this.d.f(b2, this.a).c, this.b).g && this.d.r(b2, this.a, this.b, this.e, this.f) && z;
    }

    private f00.a w(Object obj, long j2, long j3) {
        this.d.h(obj, this.a);
        int e2 = this.a.e(j2);
        if (e2 == -1) {
            return new f00.a(obj, j3, this.a.d(j2));
        }
        return new f00.a(obj, e2, this.a.i(e2), j3);
    }

    private long x(Object obj) {
        j0 j0Var;
        int b2;
        int i2 = this.d.h(obj, this.a).c;
        Object obj2 = this.k;
        if (obj2 != null && (b2 = this.d.b(obj2)) != -1 && this.d.f(b2, this.a).c == i2) {
            return this.l;
        }
        j0 j0Var2 = this.g;
        while (true) {
            if (j0Var == null) {
                j0Var = this.g;
                while (j0Var != null) {
                    int b3 = this.d.b(j0Var.b);
                    if (b3 == -1 || this.d.f(b3, this.a).c != i2) {
                        j0Var = j0Var.j();
                    }
                }
                long j2 = this.c;
                this.c = 1 + j2;
                if (this.g == null) {
                    this.k = obj;
                    this.l = j2;
                }
                return j2;
            } else if (j0Var.b.equals(obj)) {
                break;
            } else {
                j0Var2 = j0Var.j();
            }
        }
        return j0Var.f.a.d;
    }

    public boolean B(long j2, long j3) {
        k0 k0Var;
        j0 j0Var = this.g;
        j0 j0Var2 = null;
        while (j0Var != null) {
            k0 k0Var2 = j0Var.f;
            if (j0Var2 == null) {
                k0Var = p(k0Var2);
            } else {
                k0 h2 = h(j0Var2, j2);
                if (h2 == null) {
                    return !u(j0Var2);
                }
                if (!d(k0Var2, h2)) {
                    return !u(j0Var2);
                }
                k0Var = h2;
            }
            j0Var.f = k0Var.a(k0Var2.c);
            if (!c(k0Var2.e, k0Var.e)) {
                long j4 = k0Var.e;
                return !u(j0Var) && !(j0Var == this.h && ((j3 > Long.MIN_VALUE ? 1 : (j3 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j3 > ((j4 > -9223372036854775807L ? 1 : (j4 == -9223372036854775807L ? 0 : -1)) == 0 ? Long.MAX_VALUE : j0Var.z(j4)) ? 1 : (j3 == ((j4 > -9223372036854775807L ? 1 : (j4 == -9223372036854775807L ? 0 : -1)) == 0 ? Long.MAX_VALUE : j0Var.z(j4)) ? 0 : -1)) >= 0));
            }
            j0Var2 = j0Var;
            j0Var = j0Var.j();
        }
        return true;
    }

    public boolean C(int i2) {
        this.e = i2;
        return A();
    }

    public boolean D(boolean z) {
        this.f = z;
        return A();
    }

    public j0 a() {
        j0 j0Var = this.g;
        if (j0Var == null) {
            return null;
        }
        if (j0Var == this.h) {
            this.h = j0Var.j();
        }
        this.g.t();
        int i2 = this.j - 1;
        this.j = i2;
        if (i2 == 0) {
            this.i = null;
            j0 j0Var2 = this.g;
            this.k = j0Var2.b;
            this.l = j0Var2.f.a.d;
        }
        j0 j2 = this.g.j();
        this.g = j2;
        return j2;
    }

    public j0 b() {
        j0 j0Var = this.h;
        q40.f((j0Var == null || j0Var.j() == null) ? false : true);
        j0 j2 = this.h.j();
        this.h = j2;
        return j2;
    }

    public void e(boolean z) {
        j0 j0Var = this.g;
        if (j0Var != null) {
            this.k = z ? j0Var.b : null;
            this.l = j0Var.f.a.d;
            u(j0Var);
            j0Var.t();
        } else if (!z) {
            this.k = null;
        }
        this.g = null;
        this.i = null;
        this.h = null;
        this.j = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r1 != -9223372036854775807L) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.j0 f(com.google.android.exoplayer2.w0[] r12, defpackage.k40 r13, com.google.android.exoplayer2.upstream.e r14, defpackage.f00 r15, com.google.android.exoplayer2.k0 r16, defpackage.l40 r17) {
        /*
            r11 = this;
            r0 = r11
            r8 = r16
            com.google.android.exoplayer2.j0 r1 = r0.i
            if (r1 != 0) goto L_0x001e
            f00$a r1 = r8.a
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x001b
            long r1 = r8.c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x001b
            goto L_0x002c
        L_0x001b:
            r1 = 0
            goto L_0x002c
        L_0x001e:
            long r1 = r1.l()
            com.google.android.exoplayer2.j0 r3 = r0.i
            com.google.android.exoplayer2.k0 r3 = r3.f
            long r3 = r3.e
            long r1 = r1 + r3
            long r3 = r8.b
            long r1 = r1 - r3
        L_0x002c:
            r3 = r1
            com.google.android.exoplayer2.j0 r10 = new com.google.android.exoplayer2.j0
            r1 = r10
            r2 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r1.<init>(r2, r3, r5, r6, r7, r8, r9)
            com.google.android.exoplayer2.j0 r1 = r0.i
            if (r1 == 0) goto L_0x0043
            r1.w(r10)
            goto L_0x0047
        L_0x0043:
            r0.g = r10
            r0.h = r10
        L_0x0047:
            r1 = 0
            r0.k = r1
            r0.i = r10
            int r1 = r0.j
            int r1 = r1 + 1
            r0.j = r1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.l0.f(com.google.android.exoplayer2.w0[], k40, com.google.android.exoplayer2.upstream.e, f00, com.google.android.exoplayer2.k0, l40):com.google.android.exoplayer2.j0");
    }

    public j0 i() {
        return this.i;
    }

    public k0 m(long j2, n0 n0Var) {
        j0 j0Var = this.i;
        return j0Var == null ? g(n0Var) : h(j0Var, j2);
    }

    public j0 n() {
        return this.g;
    }

    public j0 o() {
        return this.h;
    }

    public k0 p(k0 k0Var) {
        long j2;
        f00.a aVar = k0Var.a;
        boolean q = q(aVar);
        boolean r = r(aVar, q);
        this.d.h(k0Var.a.a, this.a);
        if (aVar.a()) {
            j2 = this.a.b(aVar.b, aVar.c);
        } else {
            j2 = k0Var.d;
            if (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) {
                j2 = this.a.h();
            }
        }
        return new k0(aVar, k0Var.b, k0Var.c, k0Var.d, j2, q, r);
    }

    public boolean s(e00 e00) {
        j0 j0Var = this.i;
        return j0Var != null && j0Var.a == e00;
    }

    public void t(long j2) {
        j0 j0Var = this.i;
        if (j0Var != null) {
            j0Var.s(j2);
        }
    }

    public boolean u(j0 j0Var) {
        boolean z = false;
        q40.f(j0Var != null);
        this.i = j0Var;
        while (j0Var.j() != null) {
            j0Var = j0Var.j();
            if (j0Var == this.h) {
                this.h = this.g;
                z = true;
            }
            j0Var.t();
            this.j--;
        }
        this.i.w((j0) null);
        return z;
    }

    public f00.a v(Object obj, long j2) {
        return w(obj, j2, x(obj));
    }

    public void y(b1 b1Var) {
        this.d = b1Var;
    }

    public boolean z() {
        j0 j0Var = this.i;
        return j0Var == null || (!j0Var.f.g && j0Var.q() && this.i.f.e != -9223372036854775807L && this.j < 100);
    }
}
