package defpackage;

import defpackage.hx;
import defpackage.tt;

/* renamed from: fw  reason: default package */
public final class fw implements ht {
    private final gw a = new gw();
    private final i50 b = new i50(2786);
    private boolean c;

    static {
        aw awVar = aw.a;
    }

    static /* synthetic */ ht[] b() {
        return new ht[]{new fw()};
    }

    public void a() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
        r8.i();
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003c, code lost:
        if ((r4 - r3) < 8192) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d(defpackage.it r8) {
        /*
            r7 = this;
            i50 r0 = new i50
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.a
            r8.l(r4, r2, r1)
            r0.M(r2)
            int r4 = r0.C()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r5) goto L_0x0059
            r8.i()
            r8.e(r3)
            r4 = r3
        L_0x0021:
            r1 = 0
        L_0x0022:
            byte[] r5 = r0.a
            r6 = 6
            r8.l(r5, r2, r6)
            r0.M(r2)
            int r5 = r0.F()
            r6 = 2935(0xb77, float:4.113E-42)
            if (r5 == r6) goto L_0x0043
            r8.i()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r5) goto L_0x003f
            return r2
        L_0x003f:
            r8.e(r4)
            goto L_0x0021
        L_0x0043:
            r5 = 1
            int r1 = r1 + r5
            r6 = 4
            if (r1 < r6) goto L_0x0049
            return r5
        L_0x0049:
            byte[] r5 = r0.a
            int r5 = defpackage.zq.f(r5)
            r6 = -1
            if (r5 != r6) goto L_0x0053
            return r2
        L_0x0053:
            int r5 = r5 + -6
            r8.e(r5)
            goto L_0x0022
        L_0x0059:
            r4 = 3
            r0.N(r4)
            int r4 = r0.y()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r8.e(r4)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw.d(it):boolean");
    }

    public int f(it itVar, st stVar) {
        int a2 = itVar.a(this.b.a, 0, 2786);
        if (a2 == -1) {
            return -1;
        }
        this.b.M(0);
        this.b.L(a2);
        if (!this.c) {
            this.a.f(0, 4);
            this.c = true;
        }
        this.a.b(this.b);
        return 0;
    }

    public void g(jt jtVar) {
        this.a.e(jtVar, new hx.d(0, 1));
        jtVar.p();
        jtVar.f(new tt.b(-9223372036854775807L));
    }

    public void h(long j, long j2) {
        this.c = false;
        this.a.c();
    }
}
