package defpackage;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import com.zunjae.anyme.features.anime.character.d;
import com.zunjae.anyme.features.kanon.e;
import com.zunjae.anyme.features.waifus.k;
import com.zunjae.vresult.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: ou1  reason: default package */
public final class ou1 extends a0 {
    private final t<com.zunjae.vresult.a<List<d>>> c = new t<>();
    private final rv1 d;
    private final e e;
    private final or1 f;

    /* renamed from: ou1$a */
    static final class a extends w62 implements o52<List<? extends d>> {
        final /* synthetic */ ou1 f;
        final /* synthetic */ int g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ou1 ou1, int i) {
            super(0);
            this.f = ou1;
            this.g = i;
        }

        /* renamed from: a */
        public final List<d> invoke() {
            return this.f.l(this.g);
        }
    }

    public ou1(rv1 rv1, e eVar, or1 or1) {
        v62.e(rv1, "characterRepository");
        v62.e(eVar, "kanonService");
        v62.e(or1, "animeService");
        this.d = rv1;
        this.e = eVar;
        this.f = or1;
    }

    private final void k(List<d> list, long j) {
        if (list != null) {
            for (d dVar : list) {
                dVar.f = mw1.h(5);
                dVar.j(j);
            }
        }
        this.d.c(list, j);
    }

    /* access modifiers changed from: private */
    public final List<d> l(int i) {
        List<d> list;
        boolean z;
        long j = (long) i;
        try {
            list = h(j);
            if (!(!list.isEmpty())) {
                list = this.f.h(j);
                k(list, j);
            }
        } catch (Exception e2) {
            uj2.d(e2);
            list = null;
        }
        if (list == null) {
            return null;
        }
        if (xx1.a.b()) {
            return list;
        }
        try {
            e eVar = this.e;
            ArrayList arrayList = new ArrayList(g32.l(list, 10));
            for (d c2 : list) {
                arrayList.add(Integer.valueOf(c2.c()));
            }
            List a2 = eVar.G(arrayList).h().a();
            for (d dVar : list) {
                boolean z2 = false;
                if (a2 != null) {
                    if (!(a2 instanceof Collection) || !a2.isEmpty()) {
                        Iterator it = a2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((k) it.next()).a == dVar.c()) {
                                    z = true;
                                    continue;
                                } else {
                                    z = false;
                                    continue;
                                }
                                if (z) {
                                    z2 = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
                dVar.i(z2);
            }
            return list;
        } catch (Exception e3) {
            uj2.d(e3);
        } catch (Throwable unused) {
        }
        return list;
    }

    public final t<com.zunjae.vresult.a<List<d>>> g() {
        return this.c;
    }

    public final List<d> h(long j) {
        return this.d.a(j);
    }

    public final LiveData<List<d>> i(long j) {
        return this.d.b(j);
    }

    public final void j(int i) {
        b.b(this, this.c, new a(this, i));
    }
}
