package defpackage;

import com.google.android.exoplayer2.f0;
import defpackage.hx;
import defpackage.vt;
import java.util.List;

/* renamed from: uw  reason: default package */
public final class uw implements ow {
    private final i50 a;
    private final rt b;
    private final String c;
    private String d;
    private vt e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private long j;
    private int k;
    private long l;

    public uw() {
        this((String) null);
    }

    public uw(String str) {
        this.f = 0;
        i50 i50 = new i50(4);
        this.a = i50;
        i50.a[0] = -1;
        this.b = new rt();
        this.c = str;
    }

    private void a(i50 i50) {
        byte[] bArr = i50.a;
        int d2 = i50.d();
        for (int c2 = i50.c(); c2 < d2; c2++) {
            boolean z = (bArr[c2] & 255) == 255;
            boolean z2 = this.i && (bArr[c2] & 224) == 224;
            this.i = z;
            if (z2) {
                i50.M(c2 + 1);
                this.i = false;
                this.a.a[1] = bArr[c2];
                this.g = 2;
                this.f = 1;
                return;
            }
        }
        i50.M(d2);
    }

    private void g(i50 i50) {
        int min = Math.min(i50.a(), this.k - this.g);
        this.e.b(i50, min);
        int i2 = this.g + min;
        this.g = i2;
        int i3 = this.k;
        if (i2 >= i3) {
            this.e.c(this.l, 1, i3, 0, (vt.a) null);
            this.l += this.j;
            this.g = 0;
            this.f = 0;
        }
    }

    private void h(i50 i50) {
        int min = Math.min(i50.a(), 4 - this.g);
        i50.h(this.a.a, this.g, min);
        int i2 = this.g + min;
        this.g = i2;
        if (i2 >= 4) {
            this.a.M(0);
            if (!rt.e(this.a.k(), this.b)) {
                this.g = 0;
                this.f = 1;
                return;
            }
            rt rtVar = this.b;
            this.k = rtVar.c;
            if (!this.h) {
                int i3 = rtVar.d;
                this.j = (((long) rtVar.g) * 1000000) / ((long) i3);
                this.e.d(f0.p(this.d, rtVar.b, (String) null, -1, 4096, rtVar.e, i3, (List<byte[]>) null, (ns) null, 0, this.c));
                this.h = true;
            }
            this.a.M(0);
            this.e.b(this.a, 4);
            this.f = 2;
        }
    }

    public void b(i50 i50) {
        while (i50.a() > 0) {
            int i2 = this.f;
            if (i2 == 0) {
                a(i50);
            } else if (i2 == 1) {
                h(i50);
            } else if (i2 == 2) {
                g(i50);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public void c() {
        this.f = 0;
        this.g = 0;
        this.i = false;
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
