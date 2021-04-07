package defpackage;

import com.google.android.exoplayer2.f0;
import defpackage.hx;
import defpackage.vt;
import java.util.Collections;

/* renamed from: rw  reason: default package */
public final class rw implements ow {
    private final cx a;
    private String b;
    private vt c;
    private a d;
    private boolean e;
    private final boolean[] f = new boolean[3];
    private final vw g = new vw(32, 128);
    private final vw h = new vw(33, 128);
    private final vw i = new vw(34, 128);
    private final vw j = new vw(39, 128);
    private final vw k = new vw(40, 128);
    private long l;
    private long m;
    private final i50 n = new i50();

    /* renamed from: rw$a */
    private static final class a {
        private final vt a;
        private long b;
        private boolean c;
        private int d;
        private long e;
        private boolean f;
        private boolean g;
        private boolean h;
        private boolean i;
        private boolean j;
        private long k;
        private long l;
        private boolean m;

        public a(vt vtVar) {
            this.a = vtVar;
        }

        private static boolean b(int i2) {
            return (32 <= i2 && i2 <= 35) || i2 == 39;
        }

        private static boolean c(int i2) {
            return i2 < 32 || i2 == 40;
        }

        private void d(int i2) {
            boolean z = this.m;
            int i3 = (int) (this.b - this.k);
            this.a.c(this.l, z ? 1 : 0, i3, i2, (vt.a) null);
        }

        public void a(long j2, int i2, boolean z) {
            if (this.j && this.g) {
                this.m = this.c;
                this.j = false;
            } else if (this.h || this.g) {
                if (z && this.i) {
                    d(i2 + ((int) (j2 - this.b)));
                }
                this.k = this.b;
                this.l = this.e;
                this.m = this.c;
                this.i = true;
            }
        }

        public void e(byte[] bArr, int i2, int i3) {
            if (this.f) {
                int i4 = this.d;
                int i5 = (i2 + 2) - i4;
                if (i5 < i3) {
                    this.g = (bArr[i5] & 128) != 0;
                    this.f = false;
                    return;
                }
                this.d = i4 + (i3 - i2);
            }
        }

        public void f() {
            this.f = false;
            this.g = false;
            this.h = false;
            this.i = false;
            this.j = false;
        }

        public void g(long j2, int i2, int i3, long j3, boolean z) {
            boolean z2 = false;
            this.g = false;
            this.h = false;
            this.e = j3;
            this.d = 0;
            this.b = j2;
            if (!c(i3)) {
                if (this.i && !this.j) {
                    if (z) {
                        d(i2);
                    }
                    this.i = false;
                }
                if (b(i3)) {
                    this.h = !this.j;
                    this.j = true;
                }
            }
            boolean z3 = i3 >= 16 && i3 <= 21;
            this.c = z3;
            if (z3 || i3 <= 9) {
                z2 = true;
            }
            this.f = z2;
        }
    }

    public rw(cx cxVar) {
        this.a = cxVar;
    }

    private void a(long j2, int i2, int i3, long j3) {
        this.d.a(j2, i2, this.e);
        if (!this.e) {
            this.g.b(i3);
            this.h.b(i3);
            this.i.b(i3);
            if (this.g.c() && this.h.c() && this.i.c()) {
                this.c.d(h(this.b, this.g, this.h, this.i));
                this.e = true;
            }
        }
        if (this.j.b(i3)) {
            vw vwVar = this.j;
            this.n.K(this.j.d, f50.k(vwVar.d, vwVar.e));
            this.n.N(5);
            this.a.a(j3, this.n);
        }
        if (this.k.b(i3)) {
            vw vwVar2 = this.k;
            this.n.K(this.k.d, f50.k(vwVar2.d, vwVar2.e));
            this.n.N(5);
            this.a.a(j3, this.n);
        }
    }

    private void g(byte[] bArr, int i2, int i3) {
        this.d.e(bArr, i2, i3);
        if (!this.e) {
            this.g.a(bArr, i2, i3);
            this.h.a(bArr, i2, i3);
            this.i.a(bArr, i2, i3);
        }
        this.j.a(bArr, i2, i3);
        this.k.a(bArr, i2, i3);
    }

    private static f0 h(String str, vw vwVar, vw vwVar2, vw vwVar3) {
        float f2;
        vw vwVar4 = vwVar;
        vw vwVar5 = vwVar2;
        vw vwVar6 = vwVar3;
        int i2 = vwVar4.e;
        byte[] bArr = new byte[(vwVar5.e + i2 + vwVar6.e)];
        System.arraycopy(vwVar4.d, 0, bArr, 0, i2);
        System.arraycopy(vwVar5.d, 0, bArr, vwVar4.e, vwVar5.e);
        System.arraycopy(vwVar6.d, 0, bArr, vwVar4.e + vwVar5.e, vwVar6.e);
        j50 j50 = new j50(vwVar5.d, 0, vwVar5.e);
        j50.l(44);
        int e2 = j50.e(3);
        j50.k();
        j50.l(88);
        j50.l(8);
        int i3 = 0;
        for (int i4 = 0; i4 < e2; i4++) {
            if (j50.d()) {
                i3 += 89;
            }
            if (j50.d()) {
                i3 += 8;
            }
        }
        j50.l(i3);
        if (e2 > 0) {
            j50.l((8 - e2) * 2);
        }
        j50.h();
        int h2 = j50.h();
        if (h2 == 3) {
            j50.k();
        }
        int h3 = j50.h();
        int h4 = j50.h();
        if (j50.d()) {
            int h5 = j50.h();
            int h6 = j50.h();
            int h7 = j50.h();
            int h8 = j50.h();
            h3 -= ((h2 == 1 || h2 == 2) ? 2 : 1) * (h5 + h6);
            h4 -= (h2 == 1 ? 2 : 1) * (h7 + h8);
        }
        int i5 = h3;
        int i6 = h4;
        j50.h();
        j50.h();
        int h9 = j50.h();
        int i7 = j50.d() ? 0 : e2;
        while (true) {
            j50.h();
            j50.h();
            j50.h();
            if (i7 > e2) {
                break;
            }
            i7++;
        }
        j50.h();
        j50.h();
        j50.h();
        if (j50.d() && j50.d()) {
            i(j50);
        }
        j50.l(2);
        if (j50.d()) {
            j50.l(8);
            j50.h();
            j50.h();
            j50.k();
        }
        j(j50);
        if (j50.d()) {
            for (int i8 = 0; i8 < j50.h(); i8++) {
                j50.l(h9 + 4 + 1);
            }
        }
        j50.l(2);
        float f3 = 1.0f;
        if (j50.d() && j50.d()) {
            int e3 = j50.e(8);
            if (e3 == 255) {
                int e4 = j50.e(16);
                int e5 = j50.e(16);
                if (!(e4 == 0 || e5 == 0)) {
                    f3 = ((float) e4) / ((float) e5);
                }
                f2 = f3;
            } else {
                float[] fArr = f50.b;
                if (e3 < fArr.length) {
                    f2 = fArr[e3];
                } else {
                    StringBuilder sb = new StringBuilder(46);
                    sb.append("Unexpected aspect_ratio_idc value: ");
                    sb.append(e3);
                    b50.h("H265Reader", sb.toString());
                }
            }
            return f0.H(str, "video/hevc", (String) null, -1, -1, i5, i6, -1.0f, Collections.singletonList(bArr), -1, f2, (ns) null);
        }
        f2 = 1.0f;
        return f0.H(str, "video/hevc", (String) null, -1, -1, i5, i6, -1.0f, Collections.singletonList(bArr), -1, f2, (ns) null);
    }

    private static void i(j50 j50) {
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = 0;
            while (i3 < 6) {
                int i4 = 1;
                if (!j50.d()) {
                    j50.h();
                } else {
                    int min = Math.min(64, 1 << ((i2 << 1) + 4));
                    if (i2 > 1) {
                        j50.g();
                    }
                    for (int i5 = 0; i5 < min; i5++) {
                        j50.g();
                    }
                }
                if (i2 == 3) {
                    i4 = 3;
                }
                i3 += i4;
            }
        }
    }

    private static void j(j50 j50) {
        int h2 = j50.h();
        boolean z = false;
        int i2 = 0;
        for (int i3 = 0; i3 < h2; i3++) {
            if (i3 != 0) {
                z = j50.d();
            }
            if (z) {
                j50.k();
                j50.h();
                for (int i4 = 0; i4 <= i2; i4++) {
                    if (j50.d()) {
                        j50.k();
                    }
                }
            } else {
                int h3 = j50.h();
                int h4 = j50.h();
                int i5 = h3 + h4;
                for (int i6 = 0; i6 < h3; i6++) {
                    j50.h();
                    j50.k();
                }
                for (int i7 = 0; i7 < h4; i7++) {
                    j50.h();
                    j50.k();
                }
                i2 = i5;
            }
        }
    }

    private void k(long j2, int i2, int i3, long j3) {
        this.d.g(j2, i2, i3, j3, this.e);
        if (!this.e) {
            this.g.e(i3);
            this.h.e(i3);
            this.i.e(i3);
        }
        this.j.e(i3);
        this.k.e(i3);
    }

    public void b(i50 i50) {
        i50 i502 = i50;
        while (i50.a() > 0) {
            int c2 = i50.c();
            int d2 = i50.d();
            byte[] bArr = i502.a;
            this.l += (long) i50.a();
            this.c.b(i502, i50.a());
            while (true) {
                if (c2 < d2) {
                    int c3 = f50.c(bArr, c2, d2, this.f);
                    if (c3 == d2) {
                        g(bArr, c2, d2);
                        return;
                    }
                    int e2 = f50.e(bArr, c3);
                    int i2 = c3 - c2;
                    if (i2 > 0) {
                        g(bArr, c2, c3);
                    }
                    int i3 = d2 - c3;
                    long j2 = this.l - ((long) i3);
                    int i4 = i2 < 0 ? -i2 : 0;
                    long j3 = j2;
                    int i5 = i3;
                    a(j3, i5, i4, this.m);
                    k(j3, i5, e2, this.m);
                    c2 = c3 + 3;
                }
            }
        }
    }

    public void c() {
        f50.a(this.f);
        this.g.d();
        this.h.d();
        this.i.d();
        this.j.d();
        this.k.d();
        this.d.f();
        this.l = 0;
    }

    public void d() {
    }

    public void e(jt jtVar, hx.d dVar) {
        dVar.a();
        this.b = dVar.b();
        vt a2 = jtVar.a(dVar.c(), 2);
        this.c = a2;
        this.d = new a(a2);
        this.a.b(jtVar, dVar);
    }

    public void f(long j2, int i2) {
        this.m = j2;
    }
}
