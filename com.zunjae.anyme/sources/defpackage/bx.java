package defpackage;

import defpackage.hx;

/* renamed from: bx  reason: default package */
public final class bx implements hx {
    private final ax a;
    private final i50 b = new i50(32);
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    public bx(ax axVar) {
        this.a = axVar;
    }

    public void a(s50 s50, jt jtVar, hx.d dVar) {
        this.a.a(s50, jtVar, dVar);
        this.f = true;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f6 A[SYNTHETIC] */
    public void b(defpackage.i50 r9, int r10) {
        /*
            r8 = this;
            r0 = 1
            r10 = r10 & r0
            r1 = 0
            if (r10 == 0) goto L_0x0007
            r10 = 1
            goto L_0x0008
        L_0x0007:
            r10 = 0
        L_0x0008:
            r2 = -1
            if (r10 == 0) goto L_0x0015
            int r3 = r9.z()
            int r4 = r9.c()
            int r4 = r4 + r3
            goto L_0x0016
        L_0x0015:
            r4 = -1
        L_0x0016:
            boolean r3 = r8.f
            if (r3 == 0) goto L_0x0024
            if (r10 != 0) goto L_0x001d
            return
        L_0x001d:
            r8.f = r1
            r9.M(r4)
        L_0x0022:
            r8.d = r1
        L_0x0024:
            int r10 = r9.a()
            if (r10 <= 0) goto L_0x00f6
            int r10 = r8.d
            r3 = 3
            if (r10 >= r3) goto L_0x00ae
            if (r10 != 0) goto L_0x0044
            int r10 = r9.z()
            int r4 = r9.c()
            int r4 = r4 - r0
            r9.M(r4)
            r4 = 255(0xff, float:3.57E-43)
            if (r10 != r4) goto L_0x0044
            r8.f = r0
            return
        L_0x0044:
            int r10 = r9.a()
            int r4 = r8.d
            int r4 = 3 - r4
            int r10 = java.lang.Math.min(r10, r4)
            i50 r4 = r8.b
            byte[] r4 = r4.a
            int r5 = r8.d
            r9.h(r4, r5, r10)
            int r4 = r8.d
            int r4 = r4 + r10
            r8.d = r4
            if (r4 != r3) goto L_0x0024
            i50 r10 = r8.b
            r10.I(r3)
            i50 r10 = r8.b
            r10.N(r0)
            i50 r10 = r8.b
            int r10 = r10.z()
            i50 r4 = r8.b
            int r4 = r4.z()
            r5 = r10 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x007c
            r5 = 1
            goto L_0x007d
        L_0x007c:
            r5 = 0
        L_0x007d:
            r8.e = r5
            r10 = r10 & 15
            int r10 = r10 << 8
            r10 = r10 | r4
            int r10 = r10 + r3
            r8.c = r10
            i50 r10 = r8.b
            int r10 = r10.b()
            int r4 = r8.c
            if (r10 >= r4) goto L_0x0024
            i50 r10 = r8.b
            byte[] r5 = r10.a
            r6 = 4098(0x1002, float:5.743E-42)
            int r7 = r5.length
            int r7 = r7 * 2
            int r4 = java.lang.Math.max(r4, r7)
            int r4 = java.lang.Math.min(r6, r4)
            r10.I(r4)
            i50 r10 = r8.b
            byte[] r10 = r10.a
            java.lang.System.arraycopy(r5, r1, r10, r1, r3)
            goto L_0x0024
        L_0x00ae:
            int r10 = r9.a()
            int r3 = r8.c
            int r4 = r8.d
            int r3 = r3 - r4
            int r10 = java.lang.Math.min(r10, r3)
            i50 r3 = r8.b
            byte[] r3 = r3.a
            int r4 = r8.d
            r9.h(r3, r4, r10)
            int r3 = r8.d
            int r3 = r3 + r10
            r8.d = r3
            int r10 = r8.c
            if (r3 != r10) goto L_0x0024
            boolean r3 = r8.e
            if (r3 == 0) goto L_0x00e8
            i50 r3 = r8.b
            byte[] r3 = r3.a
            int r10 = defpackage.v50.r(r3, r1, r10, r2)
            if (r10 == 0) goto L_0x00de
            r8.f = r0
            return
        L_0x00de:
            i50 r10 = r8.b
            int r3 = r8.c
            int r3 = r3 + -4
            r10.I(r3)
            goto L_0x00ed
        L_0x00e8:
            i50 r3 = r8.b
            r3.I(r10)
        L_0x00ed:
            ax r10 = r8.a
            i50 r3 = r8.b
            r10.b(r3)
            goto L_0x0022
        L_0x00f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx.b(i50, int):void");
    }

    public void c() {
        this.f = true;
    }
}
