package defpackage;

import android.util.SparseArray;
import defpackage.tt;

/* renamed from: zw  reason: default package */
public final class zw implements ht {
    private final s50 a;
    private final SparseArray<a> b;
    private final i50 c;
    private final yw d;
    private boolean e;
    private boolean f;
    private boolean g;
    private long h;
    private xw i;
    private jt j;
    private boolean k;

    /* renamed from: zw$a */
    private static final class a {
        private final ow a;
        private final s50 b;
        private final h50 c = new h50(new byte[64]);
        private boolean d;
        private boolean e;
        private boolean f;
        private int g;
        private long h;

        public a(ow owVar, s50 s50) {
            this.a = owVar;
            this.b = s50;
        }

        private void b() {
            this.c.q(8);
            this.d = this.c.g();
            this.e = this.c.g();
            this.c.q(6);
            this.g = this.c.h(8);
        }

        private void c() {
            this.h = 0;
            if (this.d) {
                this.c.q(4);
                this.c.q(1);
                this.c.q(1);
                long h2 = (((long) this.c.h(3)) << 30) | ((long) (this.c.h(15) << 15)) | ((long) this.c.h(15));
                this.c.q(1);
                if (!this.f && this.e) {
                    this.c.q(4);
                    this.c.q(1);
                    this.c.q(1);
                    this.c.q(1);
                    this.b.b((((long) this.c.h(3)) << 30) | ((long) (this.c.h(15) << 15)) | ((long) this.c.h(15)));
                    this.f = true;
                }
                this.h = this.b.b(h2);
            }
        }

        public void a(i50 i50) {
            i50.h(this.c.a, 0, 3);
            this.c.o(0);
            b();
            i50.h(this.c.a, 0, this.g);
            this.c.o(0);
            c();
            this.a.f(this.h, 4);
            this.a.b(i50);
            this.a.d();
        }

        public void d() {
            this.f = false;
            this.a.c();
        }
    }

    static {
        dw dwVar = dw.a;
    }

    public zw() {
        this(new s50(0));
    }

    public zw(s50 s50) {
        this.a = s50;
        this.c = new i50(4096);
        this.b = new SparseArray<>();
        this.d = new yw();
    }

    static /* synthetic */ ht[] b() {
        return new ht[]{new zw()};
    }

    private void c(long j2) {
        tt ttVar;
        jt jtVar;
        if (!this.k) {
            this.k = true;
            if (this.d.c() != -9223372036854775807L) {
                xw xwVar = new xw(this.d.d(), this.d.c(), j2);
                this.i = xwVar;
                jtVar = this.j;
                ttVar = xwVar.b();
            } else {
                jtVar = this.j;
                ttVar = new tt.b(this.d.c());
            }
            jtVar.f(ttVar);
        }
    }

    public void a() {
    }

    public boolean d(it itVar) {
        byte[] bArr = new byte[14];
        itVar.l(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        itVar.e(bArr[13] & 7);
        itVar.l(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int f(defpackage.it r11, defpackage.st r12) {
        /*
            r10 = this;
            long r0 = r11.g()
            r2 = -1
            r4 = 1
            r5 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x000e
            r7 = 1
            goto L_0x000f
        L_0x000e:
            r7 = 0
        L_0x000f:
            if (r7 == 0) goto L_0x0020
            yw r7 = r10.d
            boolean r7 = r7.e()
            if (r7 != 0) goto L_0x0020
            yw r0 = r10.d
            int r11 = r0.g(r11, r12)
            return r11
        L_0x0020:
            r10.c(r0)
            xw r7 = r10.i
            if (r7 == 0) goto L_0x0034
            boolean r7 = r7.d()
            if (r7 == 0) goto L_0x0034
            xw r0 = r10.i
            int r11 = r0.c(r11, r12)
            return r11
        L_0x0034:
            r11.i()
            if (r6 == 0) goto L_0x003f
            long r6 = r11.d()
            long r0 = r0 - r6
            goto L_0x0040
        L_0x003f:
            r0 = r2
        L_0x0040:
            r12 = -1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x004c
            r2 = 4
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x004c
            return r12
        L_0x004c:
            i50 r0 = r10.c
            byte[] r0 = r0.a
            r1 = 4
            boolean r0 = r11.c(r0, r5, r1, r4)
            if (r0 != 0) goto L_0x0058
            return r12
        L_0x0058:
            i50 r0 = r10.c
            r0.M(r5)
            i50 r0 = r10.c
            int r0 = r0.k()
            r1 = 441(0x1b9, float:6.18E-43)
            if (r0 != r1) goto L_0x0068
            return r12
        L_0x0068:
            r12 = 442(0x1ba, float:6.2E-43)
            if (r0 != r12) goto L_0x008a
            i50 r12 = r10.c
            byte[] r12 = r12.a
            r0 = 10
            r11.l(r12, r5, r0)
            i50 r12 = r10.c
            r0 = 9
            r12.M(r0)
            i50 r12 = r10.c
            int r12 = r12.z()
            r12 = r12 & 7
            int r12 = r12 + 14
        L_0x0086:
            r11.j(r12)
            return r5
        L_0x008a:
            r12 = 443(0x1bb, float:6.21E-43)
            r1 = 2
            r2 = 6
            if (r0 != r12) goto L_0x00a4
            i50 r12 = r10.c
            byte[] r12 = r12.a
            r11.l(r12, r5, r1)
            i50 r12 = r10.c
            r12.M(r5)
            i50 r12 = r10.c
            int r12 = r12.F()
            int r12 = r12 + r2
            goto L_0x0086
        L_0x00a4:
            r12 = r0 & -256(0xffffffffffffff00, float:NaN)
            int r12 = r12 >> 8
            if (r12 == r4) goto L_0x00ae
            r11.j(r4)
            return r5
        L_0x00ae:
            r12 = r0 & 255(0xff, float:3.57E-43)
            android.util.SparseArray<zw$a> r0 = r10.b
            java.lang.Object r0 = r0.get(r12)
            zw$a r0 = (defpackage.zw.a) r0
            boolean r3 = r10.e
            if (r3 != 0) goto L_0x0125
            if (r0 != 0) goto L_0x0105
            r3 = 0
            r6 = 189(0xbd, float:2.65E-43)
            if (r12 != r6) goto L_0x00d1
            gw r3 = new gw
            r3.<init>()
        L_0x00c8:
            r10.f = r4
        L_0x00ca:
            long r6 = r11.m()
            r10.h = r6
            goto L_0x00eb
        L_0x00d1:
            r6 = r12 & 224(0xe0, float:3.14E-43)
            r7 = 192(0xc0, float:2.69E-43)
            if (r6 != r7) goto L_0x00dd
            uw r3 = new uw
            r3.<init>()
            goto L_0x00c8
        L_0x00dd:
            r6 = r12 & 240(0xf0, float:3.36E-43)
            r7 = 224(0xe0, float:3.14E-43)
            if (r6 != r7) goto L_0x00eb
            pw r3 = new pw
            r3.<init>()
            r10.g = r4
            goto L_0x00ca
        L_0x00eb:
            if (r3 == 0) goto L_0x0105
            hx$d r0 = new hx$d
            r6 = 256(0x100, float:3.59E-43)
            r0.<init>(r12, r6)
            jt r6 = r10.j
            r3.e(r6, r0)
            zw$a r0 = new zw$a
            s50 r6 = r10.a
            r0.<init>(r3, r6)
            android.util.SparseArray<zw$a> r3 = r10.b
            r3.put(r12, r0)
        L_0x0105:
            boolean r12 = r10.f
            if (r12 == 0) goto L_0x0113
            boolean r12 = r10.g
            if (r12 == 0) goto L_0x0113
            long r6 = r10.h
            r8 = 8192(0x2000, double:4.0474E-320)
            long r6 = r6 + r8
            goto L_0x0116
        L_0x0113:
            r6 = 1048576(0x100000, double:5.180654E-318)
        L_0x0116:
            long r8 = r11.m()
            int r12 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r12 <= 0) goto L_0x0125
            r10.e = r4
            jt r12 = r10.j
            r12.p()
        L_0x0125:
            i50 r12 = r10.c
            byte[] r12 = r12.a
            r11.l(r12, r5, r1)
            i50 r12 = r10.c
            r12.M(r5)
            i50 r12 = r10.c
            int r12 = r12.F()
            int r12 = r12 + r2
            if (r0 != 0) goto L_0x013e
            r11.j(r12)
            goto L_0x015d
        L_0x013e:
            i50 r1 = r10.c
            r1.I(r12)
            i50 r1 = r10.c
            byte[] r1 = r1.a
            r11.readFully(r1, r5, r12)
            i50 r11 = r10.c
            r11.M(r2)
            i50 r11 = r10.c
            r0.a(r11)
            i50 r11 = r10.c
            int r12 = r11.b()
            r11.L(r12)
        L_0x015d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zw.f(it, st):int");
    }

    public void g(jt jtVar) {
        this.j = jtVar;
    }

    public void h(long j2, long j3) {
        if ((this.a.e() == -9223372036854775807L) || !(this.a.c() == 0 || this.a.c() == j3)) {
            this.a.g();
            this.a.h(j3);
        }
        xw xwVar = this.i;
        if (xwVar != null) {
            xwVar.h(j3);
        }
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            this.b.valueAt(i2).d();
        }
    }
}
