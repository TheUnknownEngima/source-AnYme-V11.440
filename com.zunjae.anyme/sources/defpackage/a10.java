package defpackage;

import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.upstream.i;
import com.google.android.exoplayer2.upstream.l;
import defpackage.w00;

/* renamed from: a10  reason: default package */
public class a10 extends s00 {
    private static final st t = new st();
    private final int n;
    private final long o;
    private final w00 p;
    private long q;
    private volatile boolean r;
    private boolean s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a10(i iVar, l lVar, f0 f0Var, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, w00 w00) {
        super(iVar, lVar, f0Var, i, obj, j, j2, j3, j4, j5);
        this.n = i2;
        this.o = j6;
        this.p = w00;
    }

    public final void a() {
        et etVar;
        if (this.q == 0) {
            u00 j = j();
            j.c(this.o);
            w00 w00 = this.p;
            l(j);
            long j2 = this.j;
            long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - this.o;
            long j4 = this.k;
            w00.d(j, j3, j4 == -9223372036854775807L ? -9223372036854775807L : j4 - this.o);
        }
        try {
            l e = this.a.e(this.q);
            etVar = new et(this.h, e.e, this.h.c(e));
            ht htVar = this.p.e;
            boolean z = false;
            int i = 0;
            while (i == 0 && !this.r) {
                i = htVar.f(etVar, t);
            }
            if (i != 1) {
                z = true;
            }
            q40.f(z);
            this.q = etVar.m() - this.a.e;
            v50.k(this.h);
            this.s = true;
        } catch (Throwable th) {
            v50.k(this.h);
            throw th;
        }
    }

    public final void c() {
        this.r = true;
    }

    public long g() {
        return this.i + ((long) this.n);
    }

    public boolean h() {
        return this.s;
    }

    /* access modifiers changed from: protected */
    public w00.b l(u00 u00) {
        return u00;
    }
}
