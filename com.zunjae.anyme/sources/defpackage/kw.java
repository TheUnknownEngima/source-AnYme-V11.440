package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.f0;
import defpackage.hx;
import defpackage.vt;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: kw  reason: default package */
public final class kw implements ow {
    private static final byte[] v = {73, 68, 51};
    private final boolean a;
    private final h50 b;
    private final i50 c;
    private final String d;
    private String e;
    private vt f;
    private vt g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private long q;
    private int r;
    private long s;
    private vt t;
    private long u;

    public kw(boolean z) {
        this(z, (String) null);
    }

    public kw(boolean z, String str) {
        this.b = new h50(new byte[7]);
        this.c = new i50(Arrays.copyOf(v, 10));
        r();
        this.m = -1;
        this.n = -1;
        this.q = -9223372036854775807L;
        this.a = z;
        this.d = str;
    }

    private void a(i50 i50) {
        if (i50.a() != 0) {
            this.b.a[0] = i50.a[i50.c()];
            this.b.o(2);
            int h2 = this.b.h(4);
            int i2 = this.n;
            if (i2 == -1 || h2 == i2) {
                if (!this.l) {
                    this.l = true;
                    this.m = this.o;
                    this.n = h2;
                }
                s();
                return;
            }
            p();
        }
    }

    private boolean g(i50 i50, int i2) {
        i50.M(i2 + 1);
        if (!v(i50, this.b.a, 1)) {
            return false;
        }
        this.b.o(4);
        int h2 = this.b.h(1);
        int i3 = this.m;
        if (i3 != -1 && h2 != i3) {
            return false;
        }
        if (this.n != -1) {
            if (!v(i50, this.b.a, 1)) {
                return true;
            }
            this.b.o(2);
            if (this.b.h(4) != this.n) {
                return false;
            }
            i50.M(i2 + 2);
        }
        if (!v(i50, this.b.a, 4)) {
            return true;
        }
        this.b.o(14);
        int h3 = this.b.h(13);
        if (h3 < 7) {
            return false;
        }
        byte[] bArr = i50.a;
        int d2 = i50.d();
        int i4 = i2 + h3;
        if (i4 >= d2) {
            return true;
        }
        if (bArr[i4] == -1) {
            int i5 = i4 + 1;
            if (i5 == d2) {
                return true;
            }
            return k((byte) -1, bArr[i5]) && ((bArr[i5] & 8) >> 3) == h2;
        } else if (bArr[i4] != 73) {
            return false;
        } else {
            int i6 = i4 + 1;
            if (i6 == d2) {
                return true;
            }
            if (bArr[i6] != 68) {
                return false;
            }
            int i7 = i4 + 2;
            return i7 == d2 || bArr[i7] == 51;
        }
    }

    private boolean h(i50 i50, byte[] bArr, int i2) {
        int min = Math.min(i50.a(), i2 - this.i);
        i50.h(bArr, this.i, min);
        int i3 = this.i + min;
        this.i = i3;
        return i3 == i2;
    }

    private void i(i50 i50) {
        int i2;
        byte[] bArr = i50.a;
        int c2 = i50.c();
        int d2 = i50.d();
        while (c2 < d2) {
            int i3 = c2 + 1;
            byte b2 = bArr[c2] & 255;
            if (this.j != 512 || !k((byte) -1, (byte) b2) || (!this.l && !g(i50, i3 - 2))) {
                int i4 = this.j;
                byte b3 = b2 | i4;
                if (b3 != 329) {
                    if (b3 == 511) {
                        this.j = 512;
                    } else if (b3 == 836) {
                        i2 = 1024;
                    } else if (b3 == 1075) {
                        t();
                        i50.M(i3);
                        return;
                    } else if (i4 != 256) {
                        this.j = 256;
                        i3--;
                    }
                    c2 = i3;
                } else {
                    i2 = 768;
                }
                this.j = i2;
                c2 = i3;
            } else {
                this.o = (b2 & 8) >> 3;
                boolean z = true;
                if ((b2 & 1) != 0) {
                    z = false;
                }
                this.k = z;
                if (!this.l) {
                    q();
                } else {
                    s();
                }
                i50.M(i3);
                return;
            }
        }
        i50.M(c2);
    }

    private boolean k(byte b2, byte b3) {
        return l(((b2 & 255) << 8) | (b3 & 255));
    }

    public static boolean l(int i2) {
        return (i2 & 65526) == 65520;
    }

    private void m() {
        this.b.o(0);
        if (!this.p) {
            int h2 = this.b.h(2) + 1;
            if (h2 != 2) {
                StringBuilder sb = new StringBuilder(61);
                sb.append("Detected audio object type: ");
                sb.append(h2);
                sb.append(", but assuming AAC LC.");
                b50.h("AdtsReader", sb.toString());
                h2 = 2;
            }
            this.b.q(5);
            byte[] a2 = s40.a(h2, this.n, this.b.h(3));
            Pair<Integer, Integer> j2 = s40.j(a2);
            f0 p2 = f0.p(this.e, "audio/mp4a-latm", (String) null, -1, -1, ((Integer) j2.second).intValue(), ((Integer) j2.first).intValue(), Collections.singletonList(a2), (ns) null, 0, this.d);
            this.q = 1024000000 / ((long) p2.A);
            this.f.d(p2);
            this.p = true;
        } else {
            this.b.q(10);
        }
        this.b.q(4);
        int h3 = (this.b.h(13) - 2) - 5;
        if (this.k) {
            h3 -= 2;
        }
        u(this.f, this.q, 0, h3);
    }

    private void n() {
        this.g.b(this.c, 10);
        this.c.M(6);
        u(this.g, 0, 10, this.c.y() + 10);
    }

    private void o(i50 i50) {
        int min = Math.min(i50.a(), this.r - this.i);
        this.t.b(i50, min);
        int i2 = this.i + min;
        this.i = i2;
        int i3 = this.r;
        if (i2 == i3) {
            this.t.c(this.s, 1, i3, 0, (vt.a) null);
            this.s += this.u;
            r();
        }
    }

    private void p() {
        this.l = false;
        r();
    }

    private void q() {
        this.h = 1;
        this.i = 0;
    }

    private void r() {
        this.h = 0;
        this.i = 0;
        this.j = 256;
    }

    private void s() {
        this.h = 3;
        this.i = 0;
    }

    private void t() {
        this.h = 2;
        this.i = v.length;
        this.r = 0;
        this.c.M(0);
    }

    private void u(vt vtVar, long j2, int i2, int i3) {
        this.h = 4;
        this.i = i2;
        this.t = vtVar;
        this.u = j2;
        this.r = i3;
    }

    private boolean v(i50 i50, byte[] bArr, int i2) {
        if (i50.a() < i2) {
            return false;
        }
        i50.h(bArr, 0, i2);
        return true;
    }

    public void b(i50 i50) {
        while (i50.a() > 0) {
            int i2 = this.h;
            if (i2 == 0) {
                i(i50);
            } else if (i2 == 1) {
                a(i50);
            } else if (i2 != 2) {
                if (i2 == 3) {
                    if (h(i50, this.b.a, this.k ? 7 : 5)) {
                        m();
                    }
                } else if (i2 == 4) {
                    o(i50);
                } else {
                    throw new IllegalStateException();
                }
            } else if (h(i50, this.c.a, 10)) {
                n();
            }
        }
    }

    public void c() {
        p();
    }

    public void d() {
    }

    public void e(jt jtVar, hx.d dVar) {
        dVar.a();
        this.e = dVar.b();
        this.f = jtVar.a(dVar.c(), 1);
        if (this.a) {
            dVar.a();
            vt a2 = jtVar.a(dVar.c(), 4);
            this.g = a2;
            a2.d(f0.v(dVar.b(), "application/id3", (String) null, -1, (ns) null));
            return;
        }
        this.g = new gt();
    }

    public void f(long j2, int i2) {
        this.s = j2;
    }

    public long j() {
        return this.q;
    }
}
