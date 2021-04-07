package defpackage;

import defpackage.hx;
import defpackage.tt;

/* renamed from: hw  reason: default package */
public final class hw implements ht {
    private final iw a = new iw();
    private final i50 b = new i50(16384);
    private boolean c;

    static {
        bw bwVar = bw.a;
    }

    static /* synthetic */ ht[] b() {
        return new ht[]{new hw()};
    }

    public void a() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        if ((r4 - r3) < 8192) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0044, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0039, code lost:
        r9.i();
        r4 = r4 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d(defpackage.it r9) {
        /*
            r8 = this;
            i50 r0 = new i50
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.a
            r9.l(r4, r2, r1)
            r0.M(r2)
            int r4 = r0.C()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r5) goto L_0x005f
            r9.i()
            r9.e(r3)
            r4 = r3
        L_0x0021:
            r1 = 0
        L_0x0022:
            byte[] r5 = r0.a
            r6 = 7
            r9.l(r5, r2, r6)
            r0.M(r2)
            int r5 = r0.F()
            r6 = 44096(0xac40, float:6.1792E-41)
            if (r5 == r6) goto L_0x0049
            r6 = 44097(0xac41, float:6.1793E-41)
            if (r5 == r6) goto L_0x0049
            r9.i()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r5) goto L_0x0045
            return r2
        L_0x0045:
            r9.e(r4)
            goto L_0x0021
        L_0x0049:
            r6 = 1
            int r1 = r1 + r6
            r7 = 4
            if (r1 < r7) goto L_0x004f
            return r6
        L_0x004f:
            byte[] r6 = r0.a
            int r5 = defpackage.ar.e(r6, r5)
            r6 = -1
            if (r5 != r6) goto L_0x0059
            return r2
        L_0x0059:
            int r5 = r5 + -7
            r9.e(r5)
            goto L_0x0022
        L_0x005f:
            r4 = 3
            r0.N(r4)
            int r4 = r0.y()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r9.e(r4)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hw.d(it):boolean");
    }

    public int f(it itVar, st stVar) {
        int a2 = itVar.a(this.b.a, 0, 16384);
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
