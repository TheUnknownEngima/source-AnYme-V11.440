package com.zunjae.anyme.features.discover.advanced_search_v3;

import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import com.zunjae.anyme.features.kanon.e;
import java.util.Iterator;
import java.util.List;

public final class b extends a0 {
    private t<com.zunjae.vresult.a<List<vy1>>> c = new t<>();
    /* access modifiers changed from: private */
    public final e d;
    /* access modifiers changed from: private */
    public final ov1 e;

    static final class a extends w62 implements o52<List<? extends vy1>> {
        final /* synthetic */ b f;
        final /* synthetic */ a g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, a aVar) {
            super(0);
            this.f = bVar;
            this.g = aVar;
        }

        /* renamed from: a */
        public final List<vy1> invoke() {
            String str;
            T t;
            boolean z;
            if (this.g.d().isEmpty()) {
                this.g.e(d.Companion.a());
            }
            List<vy1> a = this.f.d.F(0, this.g).h().a();
            List<ty1> X = this.f.e.X();
            if (a != null) {
                for (vy1 vy1 : a) {
                    Iterator<T> it = X.iterator();
                    while (true) {
                        str = null;
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        if (((ty1) t).a() == vy1.e()) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            break;
                        }
                    }
                    ty1 ty1 = (ty1) t;
                    if (ty1 != null) {
                        str = ty1.g();
                    }
                    vy1.j(str);
                }
            }
            return a;
        }
    }

    public b(e eVar, ov1 ov1) {
        v62.e(eVar, "kanonService");
        v62.e(ov1, "animeRepository");
        this.d = eVar;
        this.e = ov1;
    }

    public final t<com.zunjae.vresult.a<List<vy1>>> h() {
        return this.c;
    }

    public final void i(a aVar) {
        v62.e(aVar, "query");
        com.zunjae.vresult.b.b(this, this.c, new a(this, aVar));
    }
}
