package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.m0;
import defpackage.hx;
import defpackage.vt;
import java.util.Collections;

/* renamed from: tw  reason: default package */
public final class tw implements ow {
    private final String a;
    private final i50 b;
    private final h50 c;
    private vt d;
    private f0 e;
    private String f;
    private int g;
    private int h;
    private int i;
    private int j;
    private long k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private long q;
    private int r;
    private long s;
    private int t;

    public tw(String str) {
        this.a = str;
        i50 i50 = new i50(1024);
        this.b = i50;
        this.c = new h50(i50.a);
    }

    private static long a(h50 h50) {
        return (long) h50.h((h50.h(2) + 1) * 8);
    }

    private void g(h50 h50) {
        if (!h50.g()) {
            this.l = true;
            l(h50);
        } else if (!this.l) {
            return;
        }
        if (this.m != 0) {
            throw new m0();
        } else if (this.n == 0) {
            k(h50, j(h50));
            if (this.p) {
                h50.q((int) this.q);
            }
        } else {
            throw new m0();
        }
    }

    private int h(h50 h50) {
        int b2 = h50.b();
        Pair<Integer, Integer> i2 = s40.i(h50, true);
        this.r = ((Integer) i2.first).intValue();
        this.t = ((Integer) i2.second).intValue();
        return b2 - h50.b();
    }

    private void i(h50 h50) {
        int i2;
        int h2 = h50.h(3);
        this.o = h2;
        if (h2 == 0) {
            i2 = 8;
        } else if (h2 == 1) {
            i2 = 9;
        } else if (h2 == 3 || h2 == 4 || h2 == 5) {
            h50.q(6);
            return;
        } else if (h2 == 6 || h2 == 7) {
            h50.q(1);
            return;
        } else {
            throw new IllegalStateException();
        }
        h50.q(i2);
    }

    private int j(h50 h50) {
        int h2;
        if (this.o == 0) {
            int i2 = 0;
            do {
                h2 = h50.h(8);
                i2 += h2;
            } while (h2 == 255);
            return i2;
        }
        throw new m0();
    }

    private void k(h50 h50, int i2) {
        int e2 = h50.e();
        if ((e2 & 7) == 0) {
            this.b.M(e2 >> 3);
        } else {
            h50.i(this.b.a, 0, i2 * 8);
            this.b.M(0);
        }
        this.d.b(this.b, i2);
        this.d.c(this.k, 1, i2, 0, (vt.a) null);
        this.k += this.s;
    }

    private void l(h50 h50) {
        boolean g2;
        h50 h502 = h50;
        int h2 = h502.h(1);
        int h3 = h2 == 1 ? h502.h(1) : 0;
        this.m = h3;
        if (h3 == 0) {
            if (h2 == 1) {
                a(h50);
            }
            if (h50.g()) {
                this.n = h502.h(6);
                int h4 = h502.h(4);
                int h5 = h502.h(3);
                if (h4 == 0 && h5 == 0) {
                    if (h2 == 0) {
                        int e2 = h50.e();
                        int h6 = h(h50);
                        h502.o(e2);
                        byte[] bArr = new byte[((h6 + 7) / 8)];
                        h502.i(bArr, 0, h6);
                        f0 p2 = f0.p(this.f, "audio/mp4a-latm", (String) null, -1, -1, this.t, this.r, Collections.singletonList(bArr), (ns) null, 0, this.a);
                        if (!p2.equals(this.e)) {
                            this.e = p2;
                            this.s = 1024000000 / ((long) p2.A);
                            this.d.d(p2);
                        }
                    } else {
                        h502.q(((int) a(h50)) - h(h50));
                    }
                    i(h50);
                    boolean g3 = h50.g();
                    this.p = g3;
                    this.q = 0;
                    if (g3) {
                        if (h2 == 1) {
                            this.q = a(h50);
                        } else {
                            do {
                                g2 = h50.g();
                                this.q = (this.q << 8) + ((long) h502.h(8));
                            } while (g2);
                        }
                    }
                    if (h50.g()) {
                        h502.q(8);
                        return;
                    }
                    return;
                }
                throw new m0();
            }
            throw new m0();
        }
        throw new m0();
    }

    private void m(int i2) {
        this.b.I(i2);
        this.c.m(this.b.a);
    }

    public void b(i50 i50) {
        while (i50.a() > 0) {
            int i2 = this.g;
            if (i2 != 0) {
                if (i2 == 1) {
                    int z = i50.z();
                    if ((z & 224) == 224) {
                        this.j = z;
                        this.g = 2;
                    } else if (z == 86) {
                    }
                } else if (i2 == 2) {
                    int z2 = ((this.j & -225) << 8) | i50.z();
                    this.i = z2;
                    if (z2 > this.b.a.length) {
                        m(z2);
                    }
                    this.h = 0;
                    this.g = 3;
                } else if (i2 == 3) {
                    int min = Math.min(i50.a(), this.i - this.h);
                    i50.h(this.c.a, this.h, min);
                    int i3 = this.h + min;
                    this.h = i3;
                    if (i3 == this.i) {
                        this.c.o(0);
                        g(this.c);
                    }
                } else {
                    throw new IllegalStateException();
                }
                this.g = 0;
            } else if (i50.z() == 86) {
                this.g = 1;
            }
        }
    }

    public void c() {
        this.g = 0;
        this.l = false;
    }

    public void d() {
    }

    public void e(jt jtVar, hx.d dVar) {
        dVar.a();
        this.d = jtVar.a(dVar.c(), 1);
        this.f = dVar.b();
    }

    public void f(long j2, int i2) {
        this.k = j2;
    }
}
