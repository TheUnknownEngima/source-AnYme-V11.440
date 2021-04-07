package defpackage;

import defpackage.hx;

/* renamed from: ww  reason: default package */
public final class ww implements hx {
    private final ow a;
    private final h50 b = new h50(new byte[10]);
    private int c = 0;
    private int d;
    private s50 e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private boolean k;
    private long l;

    public ww(ow owVar) {
        this.a = owVar;
    }

    private boolean d(i50 i50, byte[] bArr, int i2) {
        int min = Math.min(i50.a(), i2 - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            i50.N(min);
        } else {
            i50.h(bArr, this.d, min);
        }
        int i3 = this.d + min;
        this.d = i3;
        return i3 == i2;
    }

    private boolean e() {
        this.b.o(0);
        int h2 = this.b.h(24);
        if (h2 != 1) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Unexpected start code prefix: ");
            sb.append(h2);
            b50.h("PesReader", sb.toString());
            this.j = -1;
            return false;
        }
        this.b.q(8);
        int h3 = this.b.h(16);
        this.b.q(5);
        this.k = this.b.g();
        this.b.q(2);
        this.f = this.b.g();
        this.g = this.b.g();
        this.b.q(6);
        int h4 = this.b.h(8);
        this.i = h4;
        if (h3 == 0) {
            this.j = -1;
        } else {
            this.j = ((h3 + 6) - 9) - h4;
        }
        return true;
    }

    private void f() {
        this.b.o(0);
        this.l = -9223372036854775807L;
        if (this.f) {
            this.b.q(4);
            this.b.q(1);
            this.b.q(1);
            long h2 = (((long) this.b.h(3)) << 30) | ((long) (this.b.h(15) << 15)) | ((long) this.b.h(15));
            this.b.q(1);
            if (!this.h && this.g) {
                this.b.q(4);
                this.b.q(1);
                this.b.q(1);
                this.b.q(1);
                this.e.b((((long) this.b.h(3)) << 30) | ((long) (this.b.h(15) << 15)) | ((long) this.b.h(15)));
                this.h = true;
            }
            this.l = this.e.b(h2);
        }
    }

    private void g(int i2) {
        this.c = i2;
        this.d = 0;
    }

    public void a(s50 s50, jt jtVar, hx.d dVar) {
        this.e = s50;
        this.a.e(jtVar, dVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d3 A[SYNTHETIC] */
    public final void b(defpackage.i50 r9, int r10) {
        /*
            r8 = this;
            r0 = r10 & 1
            r1 = -1
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0042
            int r0 = r8.c
            if (r0 == 0) goto L_0x003f
            if (r0 == r4) goto L_0x003f
            java.lang.String r5 = "PesReader"
            if (r0 == r3) goto L_0x003a
            if (r0 != r2) goto L_0x0034
            int r0 = r8.j
            if (r0 == r1) goto L_0x0077
            r6 = 59
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            java.lang.String r6 = "Unexpected start indicator: expected "
            r7.append(r6)
            r7.append(r0)
            java.lang.String r0 = " more bytes"
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            defpackage.b50.h(r5, r0)
            goto L_0x0077
        L_0x0034:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        L_0x003a:
            java.lang.String r0 = "Unexpected start indicator reading extended header"
            defpackage.b50.h(r5, r0)
        L_0x003f:
            r8.g(r4)
        L_0x0042:
            int r0 = r9.a()
            if (r0 <= 0) goto L_0x00d3
            int r0 = r8.c
            if (r0 == 0) goto L_0x00ca
            r5 = 0
            if (r0 == r4) goto L_0x00b2
            if (r0 == r3) goto L_0x0083
            if (r0 != r2) goto L_0x007d
            int r0 = r9.a()
            int r6 = r8.j
            if (r6 != r1) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            int r5 = r0 - r6
        L_0x005e:
            if (r5 <= 0) goto L_0x0069
            int r0 = r0 - r5
            int r5 = r9.c()
            int r5 = r5 + r0
            r9.L(r5)
        L_0x0069:
            ow r5 = r8.a
            r5.b(r9)
            int r5 = r8.j
            if (r5 == r1) goto L_0x0042
            int r5 = r5 - r0
            r8.j = r5
            if (r5 != 0) goto L_0x0042
        L_0x0077:
            ow r0 = r8.a
            r0.d()
            goto L_0x003f
        L_0x007d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        L_0x0083:
            r0 = 10
            int r6 = r8.i
            int r0 = java.lang.Math.min(r0, r6)
            h50 r6 = r8.b
            byte[] r6 = r6.a
            boolean r0 = r8.d(r9, r6, r0)
            if (r0 == 0) goto L_0x0042
            r0 = 0
            int r6 = r8.i
            boolean r0 = r8.d(r9, r0, r6)
            if (r0 == 0) goto L_0x0042
            r8.f()
            boolean r0 = r8.k
            if (r0 == 0) goto L_0x00a6
            r5 = 4
        L_0x00a6:
            r10 = r10 | r5
            ow r0 = r8.a
            long r5 = r8.l
            r0.f(r5, r10)
            r8.g(r2)
            goto L_0x0042
        L_0x00b2:
            h50 r0 = r8.b
            byte[] r0 = r0.a
            r6 = 9
            boolean r0 = r8.d(r9, r0, r6)
            if (r0 == 0) goto L_0x0042
            boolean r0 = r8.e()
            if (r0 == 0) goto L_0x00c5
            r5 = 2
        L_0x00c5:
            r8.g(r5)
            goto L_0x0042
        L_0x00ca:
            int r0 = r9.a()
            r9.N(r0)
            goto L_0x0042
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ww.b(i50, int):void");
    }

    public final void c() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.c();
    }
}
