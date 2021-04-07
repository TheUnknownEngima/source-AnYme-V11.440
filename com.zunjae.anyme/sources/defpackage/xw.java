package defpackage;

import defpackage.at;

/* renamed from: xw  reason: default package */
final class xw extends at {

    /* renamed from: xw$b */
    private static final class b implements at.f {
        private final s50 a;
        private final i50 b;

        private b(s50 s50) {
            this.a = s50;
            this.b = new i50();
        }

        private at.e c(i50 i50, long j, long j2) {
            int i = -1;
            long j3 = -9223372036854775807L;
            int i2 = -1;
            while (i50.a() >= 4) {
                if (xw.k(i50.a, i50.c()) != 442) {
                    i50.N(1);
                } else {
                    i50.N(4);
                    long l = yw.l(i50);
                    if (l != -9223372036854775807L) {
                        long b2 = this.a.b(l);
                        if (b2 > j) {
                            return j3 == -9223372036854775807L ? at.e.d(b2, j2) : at.e.e(j2 + ((long) i2));
                        }
                        if (100000 + b2 > j) {
                            return at.e.e(j2 + ((long) i50.c()));
                        }
                        i2 = i50.c();
                        j3 = b2;
                    }
                    d(i50);
                    i = i50.c();
                }
            }
            return j3 != -9223372036854775807L ? at.e.f(j3, j2 + ((long) i)) : at.e.d;
        }

        private static void d(i50 i50) {
            int d = i50.d();
            if (i50.a() < 10) {
                i50.M(d);
                return;
            }
            i50.N(9);
            int z = i50.z() & 7;
            if (i50.a() < z) {
                i50.M(d);
                return;
            }
            i50.N(z);
            if (i50.a() < 4) {
                i50.M(d);
                return;
            }
            if (xw.k(i50.a, i50.c()) == 443) {
                i50.N(4);
                int F = i50.F();
                if (i50.a() < F) {
                    i50.M(d);
                    return;
                }
                i50.N(F);
            }
            while (i50.a() >= 4 && (r1 = xw.k(i50.a, i50.c())) != 442 && r1 != 441 && (r1 >>> 8) == 1) {
                i50.N(4);
                if (i50.a() < 2) {
                    i50.M(d);
                    return;
                } else {
                    i50.M(Math.min(i50.d(), i50.c() + i50.F()));
                }
            }
        }

        public void a() {
            this.b.J(v50.f);
        }

        public at.e b(it itVar, long j) {
            long m = itVar.m();
            int min = (int) Math.min(20000, itVar.g() - m);
            this.b.I(min);
            itVar.l(this.b.a, 0, min);
            return c(this.b, j, m);
        }
    }

    public xw(s50 s50, long j, long j2) {
        super(new at.b(), new b(s50), j, 0, j + 1, 0, j2, 188, 1000);
    }

    /* access modifiers changed from: private */
    public static int k(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
