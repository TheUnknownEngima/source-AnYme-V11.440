package com.zunjae.anyme.features.niche;

import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import java.util.Comparator;
import java.util.List;

public final class b extends a0 {
    private t<com.zunjae.vresult.a<List<st1>>> c = new t<>();
    private t<com.zunjae.vresult.a<List<bt1>>> d = new t<>();
    private t<com.zunjae.vresult.a<qt1>> e = new t<>();
    private t<com.zunjae.vresult.a<List<xt1>>> f = new t<>();
    private t<com.zunjae.vresult.a<List<rt1>>> g = new t<>();
    private t<com.zunjae.vresult.a<List<bs1>>> h = new t<>();
    private t<com.zunjae.vresult.a<List<jt1>>> i = new t<>();
    /* access modifiers changed from: private */
    public final ut1 j;

    static final class a extends w62 implements o52<List<? extends bt1>> {
        final /* synthetic */ b f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.f = bVar;
        }

        /* renamed from: a */
        public final List<bt1> invoke() {
            return this.f.j.e().h().a();
        }
    }

    /* renamed from: com.zunjae.anyme.features.niche.b$b  reason: collision with other inner class name */
    static final class C0198b extends w62 implements o52<List<? extends rt1>> {
        final /* synthetic */ b f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0198b(b bVar) {
            super(0);
            this.f = bVar;
        }

        /* renamed from: a */
        public final List<rt1> invoke() {
            return this.f.j.j().h().a();
        }
    }

    static final class c extends w62 implements o52<List<? extends st1>> {
        final /* synthetic */ b f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.f = bVar;
        }

        /* renamed from: a */
        public final List<st1> invoke() {
            return this.f.j.n().h().a();
        }
    }

    static final class d extends w62 implements o52<List<? extends bs1>> {
        final /* synthetic */ b f;

        public static final class a<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return d42.a(Long.valueOf(((bs1) t2).b), Long.valueOf(((bs1) t).b));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(0);
            this.f = bVar;
        }

        /* renamed from: a */
        public final List<bs1> invoke() {
            List a2 = this.f.j.i().h().a();
            if (a2 != null) {
                return n32.U(a2, new a());
            }
            return null;
        }
    }

    static final class e extends w62 implements o52<qt1> {
        final /* synthetic */ b f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(0);
            this.f = bVar;
        }

        /* renamed from: a */
        public final qt1 invoke() {
            return this.f.j.m().h().a();
        }
    }

    static final class f extends w62 implements o52<List<? extends jt1>> {
        final /* synthetic */ b f;
        final /* synthetic */ h g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar, h hVar) {
            super(0);
            this.f = bVar;
            this.g = hVar;
        }

        /* renamed from: a */
        public final List<jt1> invoke() {
            ai2<List<jt1>> ai2;
            int i = a.a[this.g.ordinal()];
            if (i == 1) {
                ai2 = this.f.j.g();
            } else if (i == 2) {
                ai2 = this.f.j.o();
            } else if (i == 3) {
                ai2 = this.f.j.l();
            } else if (i == 4) {
                ai2 = this.f.j.p();
            } else {
                throw new j22();
            }
            return ai2.h().a();
        }
    }

    static final class g extends w62 implements o52<List<? extends xt1>> {
        final /* synthetic */ b f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(0);
            this.f = bVar;
        }

        /* renamed from: a */
        public final List<xt1> invoke() {
            return this.f.j.c().h().a();
        }
    }

    public b(ut1 ut1) {
        v62.e(ut1, "gistService");
        this.j = ut1;
    }

    public final t<com.zunjae.vresult.a<List<bt1>>> g() {
        return this.d;
    }

    public final t<com.zunjae.vresult.a<List<rt1>>> h() {
        return this.g;
    }

    public final t<com.zunjae.vresult.a<List<st1>>> i() {
        return this.c;
    }

    public final t<com.zunjae.vresult.a<List<bs1>>> j() {
        return this.h;
    }

    public final t<com.zunjae.vresult.a<qt1>> k() {
        return this.e;
    }

    public final t<com.zunjae.vresult.a<List<jt1>>> l() {
        return this.i;
    }

    public final t<com.zunjae.vresult.a<List<xt1>>> m() {
        return this.f;
    }

    public final void n() {
        com.zunjae.vresult.b.b(this, this.d, new a(this));
    }

    public final void o() {
        com.zunjae.vresult.b.b(this, this.g, new C0198b(this));
    }

    public final void p() {
        com.zunjae.vresult.b.b(this, this.c, new c(this));
    }

    public final void q() {
        com.zunjae.vresult.b.b(this, this.h, new d(this));
    }

    public final void r() {
        com.zunjae.vresult.b.c(this, this.e, new e(this));
    }

    public final void s(h hVar) {
        v62.e(hVar, "topShowsType");
        com.zunjae.vresult.b.b(this, this.i, new f(this, hVar));
    }

    public final void t() {
        com.zunjae.vresult.b.b(this, this.f, new g(this));
    }
}
