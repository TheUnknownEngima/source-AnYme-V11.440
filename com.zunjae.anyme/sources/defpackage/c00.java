package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.b1;
import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.upstream.i;
import com.google.android.exoplayer2.upstream.q;
import com.google.android.exoplayer2.upstream.t;
import com.google.android.exoplayer2.upstream.y;
import defpackage.f00;

@Deprecated
/* renamed from: c00  reason: default package */
public final class c00 extends xz<Void> {
    private final i00 m;

    @Deprecated
    /* renamed from: c00$b */
    public static final class b {
        private final i.a a;
        private lt b;
        private String c;
        private Object d;
        private t e = new q();
        private int f = 1048576;

        public b(i.a aVar) {
            this.a = aVar;
        }

        public c00 a(Uri uri) {
            if (this.b == null) {
                this.b = new ft();
            }
            return new c00(uri, this.a, this.b, this.e, this.c, this.f, this.d);
        }
    }

    private c00(Uri uri, i.a aVar, lt ltVar, t tVar, String str, int i, Object obj) {
        this.m = new i00(uri, aVar, ltVar, qs.d(), tVar, str, i, obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void B(Void voidR, f00 f00, b1 b1Var) {
        v(b1Var);
    }

    public e00 a(f00.a aVar, e eVar, long j) {
        return this.m.a(aVar, eVar, j);
    }

    public void i(e00 e00) {
        this.m.i(e00);
    }

    /* access modifiers changed from: protected */
    public void u(y yVar) {
        super.u(yVar);
        C(null, this.m);
    }
}
