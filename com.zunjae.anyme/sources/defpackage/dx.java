package defpackage;

import com.google.android.exoplayer2.f0;
import defpackage.hx;
import defpackage.vt;

/* renamed from: dx  reason: default package */
public final class dx implements ax {
    private s50 a;
    private vt b;
    private boolean c;

    public void a(s50 s50, jt jtVar, hx.d dVar) {
        this.a = s50;
        dVar.a();
        vt a2 = jtVar.a(dVar.c(), 4);
        this.b = a2;
        a2.d(f0.v(dVar.b(), "application/x-scte35", (String) null, -1, (ns) null));
    }

    public void b(i50 i50) {
        if (!this.c) {
            if (this.a.e() != -9223372036854775807L) {
                this.b.d(f0.u((String) null, "application/x-scte35", this.a.e()));
                this.c = true;
            } else {
                return;
            }
        }
        int a2 = i50.a();
        this.b.b(i50, a2);
        this.b.c(this.a.d(), 1, a2, 0, (vt.a) null);
    }
}
