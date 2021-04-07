package defpackage;

import com.google.android.exoplayer2.m0;
import defpackage.uy;
import defpackage.vt;
import defpackage.yx;
import java.io.EOFException;

/* renamed from: vu  reason: default package */
public final class vu implements ht {
    private static final uy.a q = su.a;
    private final int a;
    private final long b;
    private final i50 c;
    private final rt d;
    private final pt e;
    private final qt f;
    private jt g;
    private vt h;
    private int i;
    private yx j;
    private wu k;
    private boolean l;
    private long m;
    private long n;
    private long o;
    private int p;

    static {
        ru ruVar = ru.a;
    }

    public vu() {
        this(0);
    }

    public vu(int i2) {
        this(i2, -9223372036854775807L);
    }

    public vu(int i2, long j2) {
        this.a = i2;
        this.b = j2;
        this.c = new i50(10);
        this.d = new rt();
        this.e = new pt();
        this.m = -9223372036854775807L;
        this.f = new qt();
    }

    private wu c(it itVar) {
        itVar.l(this.c.a, 0, 4);
        this.c.M(0);
        rt.e(this.c.k(), this.d);
        return new tu(itVar.g(), itVar.m(), this.d);
    }

    private static int e(i50 i50, int i2) {
        if (i50.d() >= i2 + 4) {
            i50.M(i2);
            int k2 = i50.k();
            if (k2 == 1483304551 || k2 == 1231971951) {
                return k2;
            }
        }
        if (i50.d() < 40) {
            return 0;
        }
        i50.M(36);
        return i50.k() == 1447187017 ? 1447187017 : 0;
    }

    private static boolean i(int i2, long j2) {
        return ((long) (i2 & -128000)) == (j2 & -128000);
    }

    static /* synthetic */ ht[] j() {
        return new ht[]{new vu()};
    }

    static /* synthetic */ boolean k(int i2, int i3, int i4, int i5, int i6) {
        return (i3 == 67 && i4 == 79 && i5 == 77 && (i6 == 77 || i2 == 2)) || (i3 == 77 && i4 == 76 && i5 == 76 && (i6 == 84 || i2 == 2));
    }

    private static uu l(yx yxVar, long j2) {
        if (yxVar == null) {
            return null;
        }
        int d2 = yxVar.d();
        for (int i2 = 0; i2 < d2; i2++) {
            yx.b c2 = yxVar.c(i2);
            if (c2 instanceof xy) {
                return uu.a(j2, (xy) c2);
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003b A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private defpackage.wu m(defpackage.it r11) {
        /*
            r10 = this;
            i50 r5 = new i50
            rt r0 = r10.d
            int r0 = r0.c
            r5.<init>((int) r0)
            byte[] r0 = r5.a
            rt r1 = r10.d
            int r1 = r1.c
            r6 = 0
            r11.l(r0, r6, r1)
            rt r0 = r10.d
            int r1 = r0.a
            r2 = 1
            r1 = r1 & r2
            r3 = 21
            int r0 = r0.e
            if (r1 == 0) goto L_0x0026
            if (r0 == r2) goto L_0x0028
            r3 = 36
            r7 = 36
            goto L_0x002f
        L_0x0026:
            if (r0 == r2) goto L_0x002b
        L_0x0028:
            r7 = 21
            goto L_0x002f
        L_0x002b:
            r3 = 13
            r7 = 13
        L_0x002f:
            int r8 = e(r5, r7)
            r0 = 1483304551(0x58696e67, float:1.02664153E15)
            r9 = 1231971951(0x496e666f, float:976486.94)
            if (r8 == r0) goto L_0x005e
            if (r8 != r9) goto L_0x003e
            goto L_0x005e
        L_0x003e:
            r0 = 1447187017(0x56425249, float:5.3414667E13)
            if (r8 != r0) goto L_0x0059
            long r0 = r11.g()
            long r2 = r11.m()
            rt r4 = r10.d
            xu r0 = defpackage.xu.a(r0, r2, r4, r5)
            rt r1 = r10.d
            int r1 = r1.c
            r11.j(r1)
            goto L_0x00ac
        L_0x0059:
            r0 = 0
            r11.i()
            goto L_0x00ac
        L_0x005e:
            long r0 = r11.g()
            long r2 = r11.m()
            rt r4 = r10.d
            yu r0 = defpackage.yu.a(r0, r2, r4, r5)
            if (r0 == 0) goto L_0x0096
            pt r1 = r10.e
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x0096
            r11.i()
            int r7 = r7 + 141
            r11.e(r7)
            i50 r1 = r10.c
            byte[] r1 = r1.a
            r2 = 3
            r11.l(r1, r6, r2)
            i50 r1 = r10.c
            r1.M(r6)
            pt r1 = r10.e
            i50 r2 = r10.c
            int r2 = r2.C()
            r1.d(r2)
        L_0x0096:
            rt r1 = r10.d
            int r1 = r1.c
            r11.j(r1)
            if (r0 == 0) goto L_0x00ac
            boolean r1 = r0.e()
            if (r1 != 0) goto L_0x00ac
            if (r8 != r9) goto L_0x00ac
            wu r11 = r10.c(r11)
            return r11
        L_0x00ac:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vu.m(it):wu");
    }

    private boolean n(it itVar) {
        wu wuVar = this.k;
        if (wuVar != null) {
            long c2 = wuVar.c();
            if (c2 != -1 && itVar.d() > c2 - 4) {
                return true;
            }
        }
        try {
            return !itVar.c(this.c.a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private int o(it itVar) {
        if (this.p == 0) {
            itVar.i();
            if (n(itVar)) {
                return -1;
            }
            this.c.M(0);
            int k2 = this.c.k();
            if (!i(k2, (long) this.i) || rt.b(k2) == -1) {
                itVar.j(1);
                this.i = 0;
                return 0;
            }
            rt.e(k2, this.d);
            if (this.m == -9223372036854775807L) {
                this.m = this.k.b(itVar.m());
                if (this.b != -9223372036854775807L) {
                    this.m += this.b - this.k.b(0);
                }
            }
            this.p = this.d.c;
        }
        int a2 = this.h.a(itVar, this.p, true);
        if (a2 == -1) {
            return -1;
        }
        int i2 = this.p - a2;
        this.p = i2;
        if (i2 > 0) {
            return 0;
        }
        long j2 = this.m;
        rt rtVar = this.d;
        this.h.c(j2 + ((this.n * 1000000) / ((long) rtVar.d)), 1, rtVar.c, 0, (vt.a) null);
        this.n += (long) this.d.g;
        this.p = 0;
        return 0;
    }

    private boolean p(it itVar, boolean z) {
        int i2;
        int i3;
        int b2;
        int i4 = z ? 16384 : 131072;
        itVar.i();
        if (itVar.m() == 0) {
            yx a2 = this.f.a(itVar, (this.a & 2) == 0 ? null : q);
            this.j = a2;
            if (a2 != null) {
                this.e.c(a2);
            }
            i2 = (int) itVar.d();
            if (!z) {
                itVar.j(i2);
            }
            i3 = 0;
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (!n(itVar)) {
                this.c.M(0);
                int k2 = this.c.k();
                if ((i3 == 0 || i(k2, (long) i3)) && (b2 = rt.b(k2)) != -1) {
                    i5++;
                    if (i5 != 1) {
                        if (i5 == 4) {
                            break;
                        }
                    } else {
                        rt.e(k2, this.d);
                        i3 = k2;
                    }
                    itVar.e(b2 - 4);
                } else {
                    int i7 = i6 + 1;
                    if (i6 != i4) {
                        if (z) {
                            itVar.i();
                            itVar.e(i2 + i7);
                        } else {
                            itVar.j(1);
                        }
                        i6 = i7;
                        i3 = 0;
                        i5 = 0;
                    } else if (z) {
                        return false;
                    } else {
                        throw new m0("Searched too many bytes.");
                    }
                }
            } else if (i5 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            itVar.j(i2 + i6);
        } else {
            itVar.i();
        }
        this.i = i3;
        return true;
    }

    public void a() {
    }

    public void b() {
        this.l = true;
    }

    public boolean d(it itVar) {
        return p(itVar, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int f(defpackage.it r20, defpackage.st r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            int r2 = r0.i
            if (r2 != 0) goto L_0x000f
            r2 = 0
            r0.p(r1, r2)     // Catch:{ EOFException -> 0x000d }
            goto L_0x000f
        L_0x000d:
            r1 = -1
            return r1
        L_0x000f:
            wu r2 = r0.k
            if (r2 != 0) goto L_0x0099
            wu r2 = r19.m(r20)
            yx r3 = r0.j
            long r4 = r20.m()
            uu r3 = l(r3, r4)
            boolean r4 = r0.l
            if (r4 == 0) goto L_0x002d
            wu$a r2 = new wu$a
            r2.<init>()
        L_0x002a:
            r0.k = r2
            goto L_0x004b
        L_0x002d:
            if (r3 == 0) goto L_0x0032
            r0.k = r3
            goto L_0x0036
        L_0x0032:
            if (r2 == 0) goto L_0x0036
            r0.k = r2
        L_0x0036:
            wu r2 = r0.k
            if (r2 == 0) goto L_0x0046
            boolean r2 = r2.e()
            if (r2 != 0) goto L_0x004b
            int r2 = r0.a
            r2 = r2 & 1
            if (r2 == 0) goto L_0x004b
        L_0x0046:
            wu r2 = r19.c(r20)
            goto L_0x002a
        L_0x004b:
            jt r2 = r0.g
            wu r3 = r0.k
            r2.f(r3)
            vt r2 = r0.h
            r3 = 0
            rt r4 = r0.d
            java.lang.String r5 = r4.b
            r6 = 0
            r7 = -1
            r8 = 4096(0x1000, float:5.74E-42)
            int r9 = r4.e
            int r10 = r4.d
            r11 = -1
            pt r4 = r0.e
            int r12 = r4.a
            int r13 = r4.b
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            int r4 = r0.a
            r4 = r4 & 2
            if (r4 == 0) goto L_0x0076
            r4 = 0
            goto L_0x0078
        L_0x0076:
            yx r4 = r0.j
        L_0x0078:
            r18 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            com.google.android.exoplayer2.f0 r3 = com.google.android.exoplayer2.f0.n(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r2.d(r3)
            long r2 = r20.m()
            r0.o = r2
            goto L_0x00b0
        L_0x0099:
            long r2 = r0.o
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x00b0
            long r2 = r20.m()
            long r4 = r0.o
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x00b0
            long r4 = r4 - r2
            int r2 = (int) r4
            r1.j(r2)
        L_0x00b0:
            int r1 = r19.o(r20)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vu.f(it, st):int");
    }

    public void g(jt jtVar) {
        this.g = jtVar;
        this.h = jtVar.a(0, 1);
        this.g.p();
    }

    public void h(long j2, long j3) {
        this.i = 0;
        this.m = -9223372036854775807L;
        this.n = 0;
        this.p = 0;
    }
}
