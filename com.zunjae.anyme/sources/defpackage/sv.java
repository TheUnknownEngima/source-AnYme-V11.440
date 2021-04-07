package defpackage;

import com.google.android.exoplayer2.m0;

/* renamed from: sv  reason: default package */
public class sv implements ht {
    private jt a;
    private xv b;
    private boolean c;

    static {
        pv pvVar = pv.a;
    }

    static /* synthetic */ ht[] b() {
        return new ht[]{new sv()};
    }

    private static i50 c(i50 i50) {
        i50.M(0);
        return i50;
    }

    private boolean e(it itVar) {
        xv wvVar;
        uv uvVar = new uv();
        if (uvVar.a(itVar, true) && (uvVar.b & 2) == 2) {
            int min = Math.min(uvVar.f, 8);
            i50 i50 = new i50(min);
            itVar.l(i50.a, 0, min);
            c(i50);
            if (rv.o(i50)) {
                wvVar = new rv();
            } else {
                c(i50);
                if (yv.p(i50)) {
                    wvVar = new yv();
                } else {
                    c(i50);
                    if (wv.n(i50)) {
                        wvVar = new wv();
                    }
                }
            }
            this.b = wvVar;
            return true;
        }
        return false;
    }

    public void a() {
    }

    public boolean d(it itVar) {
        try {
            return e(itVar);
        } catch (m0 unused) {
            return false;
        }
    }

    public int f(it itVar, st stVar) {
        if (this.b == null) {
            if (e(itVar)) {
                itVar.i();
            } else {
                throw new m0("Failed to determine bitstream type");
            }
        }
        if (!this.c) {
            vt a2 = this.a.a(0, 1);
            this.a.p();
            this.b.c(this.a, a2);
            this.c = true;
        }
        return this.b.f(itVar, stVar);
    }

    public void g(jt jtVar) {
        this.a = jtVar;
    }

    public void h(long j, long j2) {
        xv xvVar = this.b;
        if (xvVar != null) {
            xvVar.k(j, j2);
        }
    }
}
