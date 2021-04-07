package defpackage;

import defpackage.at;
import defpackage.mt;

/* renamed from: cu  reason: default package */
final class cu extends at {

    /* renamed from: cu$b */
    private static final class b implements at.f {
        private final y40 a;
        private final int b;
        private final mt.a c;

        private b(y40 y40, int i) {
            this.a = y40;
            this.b = i;
            this.c = new mt.a();
        }

        private long c(it itVar) {
            while (itVar.d() < itVar.g() - 6 && !mt.h(itVar, this.a, this.b, this.c)) {
                itVar.e(1);
            }
            if (itVar.d() < itVar.g() - 6) {
                return this.c.a;
            }
            itVar.e((int) (itVar.g() - itVar.d()));
            return this.a.j;
        }

        public /* synthetic */ void a() {
            bt.a(this);
        }

        public at.e b(it itVar, long j) {
            long m = itVar.m();
            long c2 = c(itVar);
            long d = itVar.d();
            itVar.e(Math.max(6, this.a.c));
            long c3 = c(itVar);
            return (c2 > j || c3 <= j) ? c3 <= j ? at.e.f(c3, itVar.d()) : at.e.d(c2, m) : at.e.e(d);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public cu(defpackage.y40 r17, int r18, long r19, long r21) {
        /*
            r16 = this;
            r0 = r17
            java.util.Objects.requireNonNull(r17)
            au r1 = new au
            r1.<init>(r0)
            cu$b r2 = new cu$b
            r3 = 0
            r4 = r18
            r2.<init>(r0, r4)
            long r3 = r17.h()
            long r7 = r0.j
            long r13 = r17.e()
            int r0 = r0.c
            r5 = 6
            int r15 = java.lang.Math.max(r5, r0)
            r5 = 0
            r0 = r16
            r9 = r19
            r11 = r21
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cu.<init>(y40, int, long, long):void");
    }
}
