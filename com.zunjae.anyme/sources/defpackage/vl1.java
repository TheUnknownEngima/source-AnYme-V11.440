package defpackage;

import com.mikepenz.fastadapter.b;
import com.mikepenz.fastadapter.c;
import com.mikepenz.fastadapter.d;
import com.mikepenz.fastadapter.e;
import com.mikepenz.fastadapter.g;
import com.mikepenz.fastadapter.i;
import com.mikepenz.fastadapter.k;
import com.mikepenz.fastadapter.l;
import com.mikepenz.fastadapter.m;
import com.mikepenz.fastadapter.n;
import com.mikepenz.fastadapter.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: vl1  reason: default package */
public class vl1<Model, Item extends l> extends com.mikepenz.fastadapter.a<Item> implements m<Model, Item> {
    private final n<Item> c;
    private k<Model, Item> d;
    private i<Item> e;
    private boolean f;
    private ul1<Model, Item> g;

    /* renamed from: vl1$a */
    class a implements km1<Item> {
        final /* synthetic */ long a;

        a(long j) {
            this.a = j;
        }

        public boolean a(c<Item> cVar, int i, Item item, int i2) {
            g gVar;
            if (this.a != item.c()) {
                return false;
            }
            if ((item instanceof p) && (gVar = (g) ((p) item).getParent()) != null) {
                gVar.i().remove(item);
            }
            if (i2 == -1) {
                return false;
            }
            vl1.this.y(i2);
            return false;
        }
    }

    public vl1(k<Model, Item> kVar) {
        this(new om1(), kVar);
    }

    public vl1(n<Item> nVar, k<Model, Item> kVar) {
        this.f = true;
        this.g = new ul1<>(this);
        this.d = kVar;
        this.c = nVar;
    }

    public vl1<Model, Item> A(int i, int i2) {
        this.c.j(i, i2, l().d0(i));
        return this;
    }

    public vl1<Model, Item> B(int i, Model model) {
        l v = v(model);
        if (v == null) {
            return this;
        }
        C(i, v);
        return this;
    }

    public vl1<Model, Item> C(int i, Item item) {
        if (this.f) {
            t().a(item);
        }
        this.c.i(i, item, l().d0(i));
        this.a.v0(item);
        return this;
    }

    public vl1<Model, Item> D(List<Item> list, boolean z, @Nullable e eVar) {
        if (this.f) {
            t().b(list);
        }
        if (z && u().a() != null) {
            u().performFiltering((CharSequence) null);
        }
        for (d h : l().U()) {
            h.h(list, z);
        }
        m(list);
        this.c.c(list, l().e0(getOrder()), eVar);
        return this;
    }

    public vl1<Model, Item> E(List<Model> list) {
        F(list, false);
        return this;
    }

    public vl1<Model, Item> F(List<Model> list, boolean z) {
        List<Item> w = w(list);
        if (this.f) {
            t().b(w);
        }
        CharSequence charSequence = null;
        if (u().a() != null) {
            CharSequence a2 = u().a();
            u().performFiltering((CharSequence) null);
            charSequence = a2;
        }
        m(w);
        boolean z2 = charSequence != null && z;
        if (z2) {
            u().publishResults(charSequence, u().performFiltering(charSequence));
        }
        this.c.e(w, !z2);
        return this;
    }

    public vl1<Model, Item> G(i<Item> iVar) {
        this.e = iVar;
        return this;
    }

    public int a(long j) {
        return this.c.a(j);
    }

    public int b(int i) {
        return i + l().e0(getOrder());
    }

    public /* bridge */ /* synthetic */ m c(int i, List list) {
        q(i, list);
        return this;
    }

    public /* bridge */ /* synthetic */ m clear() {
        s();
        return this;
    }

    public /* bridge */ /* synthetic */ m d(List list) {
        E(list);
        return this;
    }

    @SafeVarargs
    public /* bridge */ /* synthetic */ m e(Object[] objArr) {
        p(objArr);
        return this;
    }

    public /* bridge */ /* synthetic */ m g(int i, int i2) {
        A(i, i2);
        return this;
    }

    public int h() {
        return this.c.size();
    }

    public List<Item> i() {
        return this.c.h();
    }

    public Item j(int i) {
        return (l) this.c.get(i);
    }

    public /* bridge */ /* synthetic */ c k(b bVar) {
        n(bVar);
        return this;
    }

    public com.mikepenz.fastadapter.a<Item> n(b<Item> bVar) {
        n<Item> nVar = this.c;
        if (nVar instanceof nm1) {
            ((nm1) nVar).l(bVar);
        }
        super.n(bVar);
        return this;
    }

    public vl1<Model, Item> o(List<Model> list) {
        r(w(list));
        return this;
    }

    @SafeVarargs
    public final vl1<Model, Item> p(Model... modelArr) {
        o(Arrays.asList(modelArr));
        return this;
    }

    public vl1<Model, Item> q(int i, List<Item> list) {
        if (this.f) {
            t().b(list);
        }
        if (list.size() > 0) {
            this.c.f(i, list, l().e0(getOrder()));
            m(list);
        }
        return this;
    }

    public vl1<Model, Item> r(List<Item> list) {
        if (this.f) {
            t().b(list);
        }
        b l = l();
        if (l != null) {
            this.c.g(list, l.e0(getOrder()));
        } else {
            this.c.g(list, 0);
        }
        m(list);
        return this;
    }

    public vl1<Model, Item> s() {
        this.c.d(l().e0(getOrder()));
        return this;
    }

    public /* bridge */ /* synthetic */ m set(int i, Object obj) {
        B(i, obj);
        return this;
    }

    public i<Item> t() {
        i<Item> iVar = this.e;
        return iVar == null ? i.a : iVar;
    }

    public ul1<Model, Item> u() {
        return this.g;
    }

    @Nullable
    public Item v(Model model) {
        return (l) this.d.a(model);
    }

    public List<Item> w(List<Model> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Model v : list) {
            l v2 = v(v);
            if (v2 != null) {
                arrayList.add(v2);
            }
        }
        return arrayList;
    }

    public rm1<Boolean, Item, Integer> x(km1<Item> km1, boolean z) {
        int e0 = l().e0(getOrder());
        for (int i = 0; i < h(); i++) {
            int i2 = i + e0;
            b.e f0 = l().f0(i2);
            Item item = f0.b;
            if (km1.a(f0.a, i2, item, i2) && z) {
                return new rm1<>(Boolean.TRUE, item, Integer.valueOf(i2));
            }
            if (item instanceof g) {
                rm1<Boolean, Item, Integer> u0 = b.u0(f0.a, i2, (g) item, km1, z);
                if (((Boolean) u0.a).booleanValue() && z) {
                    return u0;
                }
            }
        }
        return new rm1<>(Boolean.FALSE, null, null);
    }

    public vl1<Model, Item> y(int i) {
        this.c.b(i, l().d0(i));
        return this;
    }

    public vl1<Model, Item> z(long j) {
        x(new a(j), false);
        return this;
    }
}
