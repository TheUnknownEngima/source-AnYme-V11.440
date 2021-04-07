package defpackage;

import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.g0;
import com.google.android.exoplayer2.z0;
import defpackage.e00;

/* renamed from: wz  reason: default package */
public final class wz implements e00, e00.a {
    public final e00 e;
    private e00.a f;
    private a[] g = new a[0];
    private long h;
    long i;
    long j;

    /* renamed from: wz$a */
    private final class a implements l00 {
        public final l00 e;
        private boolean f;

        public a(l00 l00) {
            this.e = l00;
        }

        public void a() {
            this.e.a();
        }

        public void b() {
            this.f = false;
        }

        public boolean f() {
            return !wz.this.i() && this.e.f();
        }

        public int j(g0 g0Var, as asVar, boolean z) {
            if (wz.this.i()) {
                return -3;
            }
            if (this.f) {
                asVar.setFlags(4);
                return -4;
            }
            int j = this.e.j(g0Var, asVar, z);
            if (j == -5) {
                f0 f0Var = g0Var.c;
                q40.e(f0Var);
                f0 f0Var2 = f0Var;
                if (!(f0Var2.C == 0 && f0Var2.D == 0)) {
                    int i = 0;
                    int i2 = wz.this.i != 0 ? 0 : f0Var2.C;
                    if (wz.this.j == Long.MIN_VALUE) {
                        i = f0Var2.D;
                    }
                    g0Var.c = f0Var2.g(i2, i);
                }
                return -5;
            }
            long j2 = wz.this.j;
            if (j2 == Long.MIN_VALUE || ((j != -4 || asVar.h < j2) && (j != -3 || wz.this.g() != Long.MIN_VALUE || asVar.g))) {
                return j;
            }
            asVar.clear();
            asVar.setFlags(4);
            this.f = true;
            return -4;
        }

        public int p(long j) {
            if (wz.this.i()) {
                return -3;
            }
            return this.e.p(j);
        }
    }

    public wz(e00 e00, boolean z, long j2, long j3) {
        this.e = e00;
        this.h = z ? j2 : -9223372036854775807L;
        this.i = j2;
        this.j = j3;
    }

    private z0 f(long j2, z0 z0Var) {
        long p = v50.p(z0Var.a, 0, j2 - this.i);
        long j3 = z0Var.b;
        long j4 = this.j;
        long p2 = v50.p(j3, 0, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j2);
        return (p == z0Var.a && p2 == z0Var.b) ? z0Var : new z0(p, p2);
    }

    private static boolean t(long j2, h40[] h40Arr) {
        if (j2 != 0) {
            for (h40 h40 : h40Arr) {
                if (h40 != null && !e50.l(h40.l().m)) {
                    return true;
                }
            }
        }
        return false;
    }

    public long b() {
        long b = this.e.b();
        if (b != Long.MIN_VALUE) {
            long j2 = this.j;
            if (j2 == Long.MIN_VALUE || b < j2) {
                return b;
            }
        }
        return Long.MIN_VALUE;
    }

    public boolean c(long j2) {
        return this.e.c(j2);
    }

    public boolean d() {
        return this.e.d();
    }

    public long e(long j2, z0 z0Var) {
        long j3 = this.i;
        if (j2 == j3) {
            return j3;
        }
        return this.e.e(j2, f(j2, z0Var));
    }

    public long g() {
        long g2 = this.e.g();
        if (g2 != Long.MIN_VALUE) {
            long j2 = this.j;
            if (j2 == Long.MIN_VALUE || g2 < j2) {
                return g2;
            }
        }
        return Long.MIN_VALUE;
    }

    public void h(long j2) {
        this.e.h(j2);
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return this.h != -9223372036854775807L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        if (r2 > r4) goto L_0x0065;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long k(defpackage.h40[] r13, boolean[] r14, defpackage.l00[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            wz$a[] r2 = new defpackage.wz.a[r2]
            r0.g = r2
            int r2 = r1.length
            l00[] r9 = new defpackage.l00[r2]
            r10 = 0
            r2 = 0
        L_0x000c:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L_0x0025
            wz$a[] r3 = r0.g
            r4 = r1[r2]
            wz$a r4 = (defpackage.wz.a) r4
            r3[r2] = r4
            r4 = r3[r2]
            if (r4 == 0) goto L_0x0020
            r3 = r3[r2]
            l00 r11 = r3.e
        L_0x0020:
            r9[r2] = r11
            int r2 = r2 + 1
            goto L_0x000c
        L_0x0025:
            e00 r2 = r0.e
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.k(r3, r4, r5, r6, r7)
            boolean r4 = r12.i()
            if (r4 == 0) goto L_0x0047
            long r4 = r0.i
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0047
            r6 = r13
            boolean r4 = t(r4, r13)
            if (r4 == 0) goto L_0x0047
            r4 = r2
            goto L_0x004c
        L_0x0047:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x004c:
            r0.h = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L_0x0067
            long r4 = r0.i
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0065
            long r4 = r0.j
            r6 = -9223372036854775808
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0067
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r4 = 0
            goto L_0x0068
        L_0x0067:
            r4 = 1
        L_0x0068:
            defpackage.q40.f(r4)
        L_0x006b:
            int r4 = r1.length
            if (r10 >= r4) goto L_0x0099
            r4 = r9[r10]
            if (r4 != 0) goto L_0x0077
            wz$a[] r4 = r0.g
            r4[r10] = r11
            goto L_0x0090
        L_0x0077:
            wz$a[] r4 = r0.g
            r5 = r4[r10]
            if (r5 == 0) goto L_0x0085
            r4 = r4[r10]
            l00 r4 = r4.e
            r5 = r9[r10]
            if (r4 == r5) goto L_0x0090
        L_0x0085:
            wz$a[] r4 = r0.g
            wz$a r5 = new wz$a
            r6 = r9[r10]
            r5.<init>(r6)
            r4[r10] = r5
        L_0x0090:
            wz$a[] r4 = r0.g
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L_0x006b
        L_0x0099:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wz.k(h40[], boolean[], l00[], boolean[], long):long");
    }

    public void m(e00 e00) {
        e00.a aVar = this.f;
        q40.e(aVar);
        aVar.m(this);
    }

    public void n() {
        this.e.n();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r0 > r7) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long o(long r7) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.h = r0
            wz$a[] r0 = r6.g
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x000c:
            if (r3 >= r1) goto L_0x0018
            r4 = r0[r3]
            if (r4 == 0) goto L_0x0015
            r4.b()
        L_0x0015:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0018:
            e00 r0 = r6.e
            long r0 = r0.o(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0034
            long r7 = r6.i
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x0035
            long r7 = r6.j
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0034
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x0035
        L_0x0034:
            r2 = 1
        L_0x0035:
            defpackage.q40.f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wz.o(long):long");
    }

    /* renamed from: p */
    public void j(e00 e00) {
        e00.a aVar = this.f;
        q40.e(aVar);
        aVar.j(this);
    }

    public long q() {
        if (i()) {
            long j2 = this.h;
            this.h = -9223372036854775807L;
            long q = q();
            return q != -9223372036854775807L ? q : j2;
        }
        long q2 = this.e.q();
        if (q2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        q40.f(q2 >= this.i);
        long j3 = this.j;
        if (j3 != Long.MIN_VALUE && q2 > j3) {
            z = false;
        }
        q40.f(z);
        return q2;
    }

    public void r(e00.a aVar, long j2) {
        this.f = aVar;
        this.e.r(this, j2);
    }

    public p00 s() {
        return this.e.s();
    }

    public void u(long j2, boolean z) {
        this.e.u(j2, z);
    }
}
