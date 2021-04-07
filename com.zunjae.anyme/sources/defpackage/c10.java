package defpackage;

import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.upstream.i;
import com.google.android.exoplayer2.upstream.l;
import defpackage.w00;

/* renamed from: c10  reason: default package */
public final class c10 extends v00 {
    private static final st m = new st();
    private final w00 i;
    private w00.b j;
    private long k;
    private volatile boolean l;

    public c10(i iVar, l lVar, f0 f0Var, int i2, Object obj, w00 w00) {
        super(iVar, lVar, 2, f0Var, i2, obj, -9223372036854775807L, -9223372036854775807L);
        this.i = w00;
    }

    public void a() {
        et etVar;
        if (this.k == 0) {
            this.i.d(this.j, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            l e = this.a.e(this.k);
            etVar = new et(this.h, e.e, this.h.c(e));
            ht htVar = this.i.e;
            boolean z = false;
            int i2 = 0;
            while (i2 == 0 && !this.l) {
                i2 = htVar.f(etVar, m);
            }
            if (i2 != 1) {
                z = true;
            }
            q40.f(z);
            this.k = etVar.m() - this.a.e;
            v50.k(this.h);
        } catch (Throwable th) {
            v50.k(this.h);
            throw th;
        }
    }

    public void c() {
        this.l = true;
    }

    public void g(w00.b bVar) {
        this.j = bVar;
    }
}
