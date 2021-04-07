package defpackage;

import defpackage.at;

/* renamed from: ex  reason: default package */
final class ex extends at {

    /* renamed from: ex$a */
    private static final class a implements at.f {
        private final s50 a;
        private final i50 b = new i50();
        private final int c;

        public a(int i, s50 s50) {
            this.c = i;
            this.a = s50;
        }

        private at.e c(i50 i50, long j, long j2) {
            int a2;
            int i;
            i50 i502 = i50;
            long j3 = j2;
            int d = i50.d();
            long j4 = -1;
            long j5 = -1;
            long j6 = -9223372036854775807L;
            while (i50.a() >= 188 && (i = a2 + 188) <= d) {
                long b2 = ix.b(i502, (a2 = ix.a(i502.a, i50.c(), d)), this.c);
                if (b2 != -9223372036854775807L) {
                    long b3 = this.a.b(b2);
                    if (b3 > j) {
                        return j6 == -9223372036854775807L ? at.e.d(b3, j3) : at.e.e(j3 + j5);
                    }
                    if (100000 + b3 > j) {
                        return at.e.e(j3 + ((long) a2));
                    }
                    j5 = (long) a2;
                    j6 = b3;
                }
                i502.M(i);
                j4 = (long) i;
            }
            return j6 != -9223372036854775807L ? at.e.f(j6, j3 + j4) : at.e.d;
        }

        public void a() {
            this.b.J(v50.f);
        }

        public at.e b(it itVar, long j) {
            long m = itVar.m();
            int min = (int) Math.min(112800, itVar.g() - m);
            this.b.I(min);
            itVar.l(this.b.a, 0, min);
            return c(this.b, j, m);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ex(defpackage.s50 r17, long r18, long r20, int r22) {
        /*
            r16 = this;
            at$b r1 = new at$b
            r1.<init>()
            ex$a r2 = new ex$a
            r0 = r17
            r3 = r22
            r2.<init>(r3, r0)
            r3 = 1
            long r7 = r18 + r3
            r5 = 0
            r9 = 0
            r13 = 188(0xbc, double:9.3E-322)
            r15 = 940(0x3ac, float:1.317E-42)
            r0 = r16
            r3 = r18
            r11 = r20
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ex.<init>(s50, long, long, int):void");
    }
}
