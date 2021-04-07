package defpackage;

import com.google.android.exoplayer2.f0;
import defpackage.hx;
import defpackage.vt;

/* renamed from: sw  reason: default package */
public final class sw implements ow {
    private final i50 a = new i50(10);
    private vt b;
    private boolean c;
    private long d;
    private int e;
    private int f;

    public void b(i50 i50) {
        if (this.c) {
            int a2 = i50.a();
            int i = this.f;
            if (i < 10) {
                int min = Math.min(a2, 10 - i);
                System.arraycopy(i50.a, i50.c(), this.a.a, this.f, min);
                if (this.f + min == 10) {
                    this.a.M(0);
                    if (73 == this.a.z() && 68 == this.a.z() && 51 == this.a.z()) {
                        this.a.N(3);
                        this.e = this.a.y() + 10;
                    } else {
                        b50.h("Id3Reader", "Discarding invalid ID3 tag");
                        this.c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a2, this.e - this.f);
            this.b.b(i50, min2);
            this.f += min2;
        }
    }

    public void c() {
        this.c = false;
    }

    public void d() {
        int i;
        if (this.c && (i = this.e) != 0 && this.f == i) {
            this.b.c(this.d, 1, i, 0, (vt.a) null);
            this.c = false;
        }
    }

    public void e(jt jtVar, hx.d dVar) {
        dVar.a();
        vt a2 = jtVar.a(dVar.c(), 4);
        this.b = a2;
        a2.d(f0.v(dVar.b(), "application/id3", (String) null, -1, (ns) null));
    }

    public void f(long j, int i) {
        if ((i & 4) != 0) {
            this.c = true;
            this.d = j;
            this.e = 0;
            this.f = 0;
        }
    }
}
