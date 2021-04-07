package com.zunjae.anyme.features.browsers.native_streaming;

import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import java.util.List;

public final class d extends a0 {
    public iz1 c;
    private lz1 d;
    private Integer e;
    private t<com.zunjae.vresult.a<List<lz1>>> f = new t<>();
    private t<com.zunjae.vresult.a<c>> g = new t<>();
    private h h;

    static final class a extends w62 implements o52<c> {
        final /* synthetic */ d f;
        final /* synthetic */ nz1 g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, nz1 nz1) {
            super(0);
            this.f = dVar;
            this.g = nz1;
        }

        /* renamed from: a */
        public final c invoke() {
            Integer g2 = e92.g(this.g.c());
            int intValue = g2 != null ? g2.intValue() : -1;
            iz1 i = this.f.i();
            String d = this.g.d();
            if (d == null) {
                d = "";
            }
            List<oz1> i2 = i.i(d, intValue);
            v62.c(i2);
            return new c(i2, this.g);
        }
    }

    static final class b extends w62 implements o52<List<? extends lz1>> {
        final /* synthetic */ d f;
        final /* synthetic */ String g;
        final /* synthetic */ int h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, String str, int i) {
            super(0);
            this.f = dVar;
            this.g = str;
            this.h = i;
        }

        /* renamed from: a */
        public final List<lz1> invoke() {
            return this.f.i().g(this.g, this.h);
        }
    }

    public final lz1 f() {
        return this.d;
    }

    public final Integer g() {
        return this.e;
    }

    public final t<com.zunjae.vresult.a<List<lz1>>> h() {
        return this.f;
    }

    public final iz1 i() {
        iz1 iz1 = this.c;
        if (iz1 != null) {
            return iz1;
        }
        v62.p("site");
        throw null;
    }

    public final t<com.zunjae.vresult.a<c>> j() {
        return this.g;
    }

    public final void k(nz1 nz1) {
        v62.e(nz1, "episode");
        com.zunjae.vresult.b.c(this, this.g, new a(this, nz1));
    }

    public final void l() {
        h hVar = this.h;
        if (hVar != null) {
            m(hVar.a(), hVar.b());
        }
    }

    public final void m(String str, int i) {
        v62.e(str, "identifier");
        this.h = new h(str, i);
        com.zunjae.vresult.b.b(this, this.f, new b(this, str, i));
    }

    public final void n(lz1 lz1) {
        this.d = lz1;
    }

    public final void o(Integer num) {
        this.e = num;
    }

    public final void p(iz1 iz1) {
        v62.e(iz1, "<set-?>");
        this.c = iz1;
    }
}
