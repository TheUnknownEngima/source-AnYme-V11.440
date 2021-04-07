package defpackage;

import com.google.android.exoplayer2.m0;
import defpackage.hx;
import defpackage.tt;
import java.io.EOFException;

/* renamed from: jw  reason: default package */
public final class jw implements ht {
    private final int a;
    private final kw b;
    private final i50 c;
    private final i50 d;
    private final h50 e;
    private jt f;
    private long g;
    private long h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;

    static {
        cw cwVar = cw.a;
    }

    public jw() {
        this(0);
    }

    public jw(int i2) {
        this.a = i2;
        this.b = new kw(true);
        this.c = new i50(2048);
        this.i = -1;
        this.h = -1;
        i50 i50 = new i50(10);
        this.d = i50;
        this.e = new h50(i50.a);
    }

    private void b(it itVar) {
        if (!this.j) {
            this.i = -1;
            itVar.i();
            long j2 = 0;
            if (itVar.m() == 0) {
                k(itVar);
            }
            int i2 = 0;
            int i3 = 0;
            while (true) {
                try {
                    if (!itVar.c(this.d.a, 0, 2, true)) {
                        break;
                    }
                    this.d.M(0);
                    if (!kw.l(this.d.F())) {
                        break;
                    } else if (!itVar.c(this.d.a, 0, 4, true)) {
                        break;
                    } else {
                        this.e.o(14);
                        int h2 = this.e.h(13);
                        if (h2 > 6) {
                            j2 += (long) h2;
                            i3++;
                            if (i3 != 1000) {
                                if (!itVar.k(h2 - 6, true)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            this.j = true;
                            throw new m0("Malformed ADTS stream");
                        }
                    }
                } catch (EOFException unused) {
                }
            }
            i2 = i3;
            itVar.i();
            if (i2 > 0) {
                this.i = (int) (j2 / ((long) i2));
            } else {
                this.i = -1;
            }
            this.j = true;
        }
    }

    private static int c(int i2, long j2) {
        return (int) ((((long) (i2 * 8)) * 1000000) / j2);
    }

    private tt e(long j2) {
        return new dt(j2, this.h, c(this.i, this.b.j()), this.i);
    }

    static /* synthetic */ ht[] i() {
        return new ht[]{new jw()};
    }

    private void j(long j2, boolean z, boolean z2) {
        if (!this.l) {
            boolean z3 = z && this.i > 0;
            if (!z3 || this.b.j() != -9223372036854775807L || z2) {
                jt jtVar = this.f;
                q40.e(jtVar);
                jtVar.f((!z3 || this.b.j() == -9223372036854775807L) ? new tt.b(-9223372036854775807L) : e(j2));
                this.l = true;
            }
        }
    }

    private int k(it itVar) {
        int i2 = 0;
        while (true) {
            itVar.l(this.d.a, 0, 10);
            this.d.M(0);
            if (this.d.C() != 4801587) {
                break;
            }
            this.d.N(3);
            int y = this.d.y();
            i2 += y + 10;
            itVar.e(y);
        }
        itVar.i();
        itVar.e(i2);
        if (this.h == -1) {
            this.h = (long) i2;
        }
        return i2;
    }

    public void a() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0021, code lost:
        r9.i();
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if ((r3 - r0) < 8192) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d(defpackage.it r9) {
        /*
            r8 = this;
            int r0 = r8.k(r9)
            r1 = 0
            r3 = r0
        L_0x0006:
            r2 = 0
            r4 = 0
        L_0x0008:
            i50 r5 = r8.d
            byte[] r5 = r5.a
            r6 = 2
            r9.l(r5, r1, r6)
            i50 r5 = r8.d
            r5.M(r1)
            i50 r5 = r8.d
            int r5 = r5.F()
            boolean r5 = defpackage.kw.l(r5)
            if (r5 != 0) goto L_0x0031
            r9.i()
            int r3 = r3 + 1
            int r2 = r3 - r0
            r4 = 8192(0x2000, float:1.14794E-41)
            if (r2 < r4) goto L_0x002d
            return r1
        L_0x002d:
            r9.e(r3)
            goto L_0x0006
        L_0x0031:
            r5 = 1
            int r2 = r2 + r5
            r6 = 4
            if (r2 < r6) goto L_0x003b
            r7 = 188(0xbc, float:2.63E-43)
            if (r4 <= r7) goto L_0x003b
            return r5
        L_0x003b:
            i50 r5 = r8.d
            byte[] r5 = r5.a
            r9.l(r5, r1, r6)
            h50 r5 = r8.e
            r6 = 14
            r5.o(r6)
            h50 r5 = r8.e
            r6 = 13
            int r5 = r5.h(r6)
            r6 = 6
            if (r5 > r6) goto L_0x0055
            return r1
        L_0x0055:
            int r6 = r5 + -6
            r9.e(r6)
            int r4 = r4 + r5
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jw.d(it):boolean");
    }

    public int f(it itVar, st stVar) {
        long g2 = itVar.g();
        boolean z = ((this.a & 1) == 0 || g2 == -1) ? false : true;
        if (z) {
            b(itVar);
        }
        int a2 = itVar.a(this.c.a, 0, 2048);
        boolean z2 = a2 == -1;
        j(g2, z, z2);
        if (z2) {
            return -1;
        }
        this.c.M(0);
        this.c.L(a2);
        if (!this.k) {
            this.b.f(this.g, 4);
            this.k = true;
        }
        this.b.b(this.c);
        return 0;
    }

    public void g(jt jtVar) {
        this.f = jtVar;
        this.b.e(jtVar, new hx.d(0, 1));
        jtVar.p();
    }

    public void h(long j2, long j3) {
        this.k = false;
        this.b.c();
        this.g = j3;
    }
}
