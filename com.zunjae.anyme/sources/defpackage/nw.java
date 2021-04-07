package defpackage;

import com.google.android.exoplayer2.f0;
import defpackage.hx;
import defpackage.vt;
import java.util.Collections;
import java.util.List;

/* renamed from: nw  reason: default package */
public final class nw implements ow {
    private final List<hx.a> a;
    private final vt[] b;
    private boolean c;
    private int d;
    private int e;
    private long f;

    public nw(List<hx.a> list) {
        this.a = list;
        this.b = new vt[list.size()];
    }

    private boolean a(i50 i50, int i) {
        if (i50.a() == 0) {
            return false;
        }
        if (i50.z() != i) {
            this.c = false;
        }
        this.d--;
        return this.c;
    }

    public void b(i50 i50) {
        if (!this.c) {
            return;
        }
        if (this.d != 2 || a(i50, 32)) {
            if (this.d != 1 || a(i50, 0)) {
                int c2 = i50.c();
                int a2 = i50.a();
                for (vt b2 : this.b) {
                    i50.M(c2);
                    b2.b(i50, a2);
                }
                this.e += a2;
            }
        }
    }

    public void c() {
        this.c = false;
    }

    public void d() {
        if (this.c) {
            for (vt c2 : this.b) {
                c2.c(this.f, 1, this.e, 0, (vt.a) null);
            }
            this.c = false;
        }
    }

    public void e(jt jtVar, hx.d dVar) {
        for (int i = 0; i < this.b.length; i++) {
            hx.a aVar = this.a.get(i);
            dVar.a();
            vt a2 = jtVar.a(dVar.c(), 3);
            a2.d(f0.s(dVar.b(), "application/dvbsubs", (String) null, -1, 0, Collections.singletonList(aVar.b), aVar.a, (ns) null));
            this.b[i] = a2;
        }
    }

    public void f(long j, int i) {
        if ((i & 4) != 0) {
            this.c = true;
            this.f = j;
            this.e = 0;
            this.d = 2;
        }
    }
}
