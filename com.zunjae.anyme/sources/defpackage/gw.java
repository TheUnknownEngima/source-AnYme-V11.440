package defpackage;

import com.google.android.exoplayer2.f0;
import defpackage.hx;
import defpackage.vt;
import defpackage.zq;
import java.util.List;

/* renamed from: gw  reason: default package */
public final class gw implements ow {
    private final h50 a;
    private final i50 b;
    private final String c;
    private String d;
    private vt e;
    private int f;
    private int g;
    private boolean h;
    private long i;
    private f0 j;
    private int k;
    private long l;

    public gw() {
        this((String) null);
    }

    public gw(String str) {
        h50 h50 = new h50(new byte[128]);
        this.a = h50;
        this.b = new i50(h50.a);
        this.f = 0;
        this.c = str;
    }

    private boolean a(i50 i50, byte[] bArr, int i2) {
        int min = Math.min(i50.a(), i2 - this.g);
        i50.h(bArr, this.g, min);
        int i3 = this.g + min;
        this.g = i3;
        return i3 == i2;
    }

    private void g() {
        this.a.o(0);
        zq.b e2 = zq.e(this.a);
        f0 f0Var = this.j;
        if (!(f0Var != null && e2.c == f0Var.z && e2.b == f0Var.A && e2.a == f0Var.m)) {
            f0 p = f0.p(this.d, e2.a, (String) null, -1, -1, e2.c, e2.b, (List<byte[]>) null, (ns) null, 0, this.c);
            this.j = p;
            this.e.d(p);
        }
        this.k = e2.d;
        this.i = (((long) e2.e) * 1000000) / ((long) this.j.A);
    }

    private boolean h(i50 i50) {
        while (true) {
            boolean z = false;
            if (i50.a() <= 0) {
                return false;
            }
            if (this.h) {
                int z2 = i50.z();
                if (z2 == 119) {
                    this.h = false;
                    return true;
                } else if (z2 != 11) {
                    this.h = z;
                }
            } else if (i50.z() != 11) {
                this.h = z;
            }
            z = true;
            this.h = z;
        }
    }

    public void b(i50 i50) {
        while (i50.a() > 0) {
            int i2 = this.f;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        int min = Math.min(i50.a(), this.k - this.g);
                        this.e.b(i50, min);
                        int i3 = this.g + min;
                        this.g = i3;
                        int i4 = this.k;
                        if (i3 == i4) {
                            this.e.c(this.l, 1, i4, 0, (vt.a) null);
                            this.l += this.i;
                            this.f = 0;
                        }
                    }
                } else if (a(i50, this.b.a, 128)) {
                    g();
                    this.b.M(0);
                    this.e.b(this.b, 128);
                    this.f = 2;
                }
            } else if (h(i50)) {
                this.f = 1;
                byte[] bArr = this.b.a;
                bArr[0] = 11;
                bArr[1] = 119;
                this.g = 2;
            }
        }
    }

    public void c() {
        this.f = 0;
        this.g = 0;
        this.h = false;
    }

    public void d() {
    }

    public void e(jt jtVar, hx.d dVar) {
        dVar.a();
        this.d = dVar.b();
        this.e = jtVar.a(dVar.c(), 1);
    }

    public void f(long j2, int i2) {
        this.l = j2;
    }
}
