package defpackage;

import com.google.android.exoplayer2.f0;
import defpackage.ar;
import defpackage.hx;
import defpackage.vt;
import java.util.List;

/* renamed from: iw  reason: default package */
public final class iw implements ow {
    private final h50 a;
    private final i50 b;
    private final String c;
    private String d;
    private vt e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private long j;
    private f0 k;
    private int l;
    private long m;

    public iw() {
        this((String) null);
    }

    public iw(String str) {
        h50 h50 = new h50(new byte[16]);
        this.a = h50;
        this.b = new i50(h50.a);
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.i = false;
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
        ar.b d2 = ar.d(this.a);
        f0 f0Var = this.k;
        if (f0Var == null || d2.b != f0Var.z || d2.a != f0Var.A || !"audio/ac4".equals(f0Var.m)) {
            f0 p = f0.p(this.d, "audio/ac4", (String) null, -1, -1, d2.b, d2.a, (List<byte[]>) null, (ns) null, 0, this.c);
            this.k = p;
            this.e.d(p);
        }
        this.l = d2.c;
        this.j = (((long) d2.d) * 1000000) / ((long) this.k.A);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean h(defpackage.i50 r6) {
        /*
            r5 = this;
        L_0x0000:
            int r0 = r6.a()
            r1 = 0
            if (r0 <= 0) goto L_0x0031
            boolean r0 = r5.h
            r2 = 172(0xac, float:2.41E-43)
            r3 = 1
            if (r0 != 0) goto L_0x0018
            int r0 = r6.z()
            if (r0 != r2) goto L_0x0015
            r1 = 1
        L_0x0015:
            r5.h = r1
            goto L_0x0000
        L_0x0018:
            int r0 = r6.z()
            if (r0 != r2) goto L_0x0020
            r2 = 1
            goto L_0x0021
        L_0x0020:
            r2 = 0
        L_0x0021:
            r5.h = r2
            r2 = 64
            r4 = 65
            if (r0 == r2) goto L_0x002b
            if (r0 != r4) goto L_0x0000
        L_0x002b:
            if (r0 != r4) goto L_0x002e
            r1 = 1
        L_0x002e:
            r5.i = r1
            return r3
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iw.h(i50):boolean");
    }

    public void b(i50 i50) {
        while (i50.a() > 0) {
            int i2 = this.f;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        int min = Math.min(i50.a(), this.l - this.g);
                        this.e.b(i50, min);
                        int i3 = this.g + min;
                        this.g = i3;
                        int i4 = this.l;
                        if (i3 == i4) {
                            this.e.c(this.m, 1, i4, 0, (vt.a) null);
                            this.m += this.j;
                            this.f = 0;
                        }
                    }
                } else if (a(i50, this.b.a, 16)) {
                    g();
                    this.b.M(0);
                    this.e.b(this.b, 16);
                    this.f = 2;
                }
            } else if (h(i50)) {
                this.f = 1;
                byte[] bArr = this.b.a;
                bArr[0] = -84;
                bArr[1] = (byte) (this.i ? 65 : 64);
                this.g = 2;
            }
        }
    }

    public void c() {
        this.f = 0;
        this.g = 0;
        this.h = false;
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
        this.m = j2;
    }
}
