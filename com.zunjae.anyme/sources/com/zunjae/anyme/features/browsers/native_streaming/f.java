package com.zunjae.anyme.features.browsers.native_streaming;

import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import com.zunjae.anyme.features.browsers.native_streaming.g;
import com.zunjae.vresult.b;
import java.util.List;

public final class f extends a0 {
    public iz1 c;
    private t<com.zunjae.vresult.a<List<qz1>>> d = new t<>();
    private String e;

    static final class a extends w62 implements o52<List<? extends qz1>> {
        final /* synthetic */ f f;
        final /* synthetic */ g g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar, g gVar) {
            super(0);
            this.f = fVar;
            this.g = gVar;
        }

        /* renamed from: a */
        public final List<qz1> invoke() {
            g gVar = this.g;
            if (gVar instanceof g.b) {
                this.f.k(((g.b) gVar).a());
                return this.f.f().d(((g.b) this.g).a());
            } else if (gVar instanceof g.a) {
                return this.f.f().o();
            } else {
                throw new j22();
            }
        }
    }

    public final iz1 f() {
        iz1 iz1 = this.c;
        if (iz1 != null) {
            return iz1;
        }
        v62.p("api");
        throw null;
    }

    public final String g() {
        return this.e;
    }

    public final t<com.zunjae.vresult.a<List<qz1>>> h() {
        return this.d;
    }

    public final void i(g gVar) {
        v62.e(gVar, "action");
        b.b(this, this.d, new a(this, gVar));
    }

    public final void j(iz1 iz1) {
        v62.e(iz1, "<set-?>");
        this.c = iz1;
    }

    public final void k(String str) {
        this.e = str;
    }
}
