package defpackage;

import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.upstream.i;
import com.google.android.exoplayer2.upstream.l;
import defpackage.vt;

/* renamed from: f10  reason: default package */
public final class f10 extends s00 {
    private final int n;
    private final f0 o;
    private long p;
    private boolean q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f10(i iVar, l lVar, f0 f0Var, int i, Object obj, long j, long j2, long j3, int i2, f0 f0Var2) {
        super(iVar, lVar, f0Var, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.n = i2;
        this.o = f0Var2;
    }

    /* JADX INFO: finally extract failed */
    public void a() {
        u00 j = j();
        j.c(0);
        vt a = j.a(0, this.n);
        a.d(this.o);
        try {
            long c = this.h.c(this.a.e(this.p));
            if (c != -1) {
                c += this.p;
            }
            et etVar = new et(this.h, this.p, c);
            for (int i = 0; i != -1; i = a.a(etVar, Integer.MAX_VALUE, true)) {
                this.p += (long) i;
            }
            a.c(this.f, 1, (int) this.p, 0, (vt.a) null);
            v50.k(this.h);
            this.q = true;
        } catch (Throwable th) {
            v50.k(this.h);
            throw th;
        }
    }

    public void c() {
    }

    public boolean h() {
        return this.q;
    }
}
