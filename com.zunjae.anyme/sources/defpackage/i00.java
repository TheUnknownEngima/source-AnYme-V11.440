package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.upstream.i;
import com.google.android.exoplayer2.upstream.t;
import com.google.android.exoplayer2.upstream.y;
import defpackage.f00;
import defpackage.h00;

/* renamed from: i00  reason: default package */
public final class i00 extends uz implements h00.c {
    private final Uri j;
    private final i.a k;
    private final lt l;
    private final rs<?> m;
    private final t n;
    private final String o;
    private final int p;
    private final Object q;
    private long r = -9223372036854775807L;
    private boolean s;
    private boolean t;
    private y u;

    i00(Uri uri, i.a aVar, lt ltVar, rs<?> rsVar, t tVar, String str, int i, Object obj) {
        this.j = uri;
        this.k = aVar;
        this.l = ltVar;
        this.m = rsVar;
        this.n = tVar;
        this.o = str;
        this.p = i;
        this.q = obj;
    }

    private void x(long j2, boolean z, boolean z2) {
        this.r = j2;
        this.s = z;
        this.t = z2;
        v(new n00(this.r, this.s, false, this.t, (Object) null, this.q));
    }

    public e00 a(f00.a aVar, e eVar, long j2) {
        i a = this.k.a();
        y yVar = this.u;
        if (yVar != null) {
            a.b(yVar);
        }
        return new h00(this.j, a, this.l.a(), this.m, this.n, o(aVar), this, eVar, this.o, this.p);
    }

    public void g(long j2, boolean z, boolean z2) {
        if (j2 == -9223372036854775807L) {
            j2 = this.r;
        }
        if (this.r != j2 || this.s != z || this.t != z2) {
            x(j2, z, z2);
        }
    }

    public void h() {
    }

    public void i(e00 e00) {
        ((h00) e00).Z();
    }

    /* access modifiers changed from: protected */
    public void u(y yVar) {
        this.u = yVar;
        this.m.t();
        x(this.r, this.s, this.t);
    }

    /* access modifiers changed from: protected */
    public void w() {
        this.m.a();
    }
}
