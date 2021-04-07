package defpackage;

import com.google.android.exoplayer2.f0;
import defpackage.hx;
import defpackage.vt;

/* renamed from: mw  reason: default package */
public final class mw implements ow {
    private final i50 a = new i50(new byte[18]);
    private final String b;
    private String c;
    private vt d;
    private int e = 0;
    private int f;
    private int g;
    private long h;
    private f0 i;
    private int j;
    private long k;

    public mw(String str) {
        this.b = str;
    }

    private boolean a(i50 i50, byte[] bArr, int i2) {
        int min = Math.min(i50.a(), i2 - this.f);
        i50.h(bArr, this.f, min);
        int i3 = this.f + min;
        this.f = i3;
        return i3 == i2;
    }

    private void g() {
        byte[] bArr = this.a.a;
        if (this.i == null) {
            f0 g2 = nr.g(bArr, this.c, this.b, (ns) null);
            this.i = g2;
            this.d.d(g2);
        }
        this.j = nr.a(bArr);
        this.h = (long) ((int) ((((long) nr.f(bArr)) * 1000000) / ((long) this.i.A)));
    }

    private boolean h(i50 i50) {
        while (i50.a() > 0) {
            int i2 = this.g << 8;
            this.g = i2;
            int z = i2 | i50.z();
            this.g = z;
            if (nr.d(z)) {
                byte[] bArr = this.a.a;
                int i3 = this.g;
                bArr[0] = (byte) ((i3 >> 24) & 255);
                bArr[1] = (byte) ((i3 >> 16) & 255);
                bArr[2] = (byte) ((i3 >> 8) & 255);
                bArr[3] = (byte) (i3 & 255);
                this.f = 4;
                this.g = 0;
                return true;
            }
        }
        return false;
    }

    public void b(i50 i50) {
        while (i50.a() > 0) {
            int i2 = this.e;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        int min = Math.min(i50.a(), this.j - this.f);
                        this.d.b(i50, min);
                        int i3 = this.f + min;
                        this.f = i3;
                        int i4 = this.j;
                        if (i3 == i4) {
                            this.d.c(this.k, 1, i4, 0, (vt.a) null);
                            this.k += this.h;
                            this.e = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (a(i50, this.a.a, 18)) {
                    g();
                    this.a.M(0);
                    this.d.b(this.a, 18);
                    this.e = 2;
                }
            } else if (h(i50)) {
                this.e = 1;
            }
        }
    }

    public void c() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
    }

    public void d() {
    }

    public void e(jt jtVar, hx.d dVar) {
        dVar.a();
        this.c = dVar.b();
        this.d = jtVar.a(dVar.c(), 1);
    }

    public void f(long j2, int i2) {
        this.k = j2;
    }
}
