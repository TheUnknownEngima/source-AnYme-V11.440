package com.mikepenz.fastadapter;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.fastadapter.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class b<Item extends l> extends RecyclerView.g<RecyclerView.c0> {
    private final ArrayList<c<Item>> c = new ArrayList<>();
    private q<Item> d;
    private final SparseArray<c<Item>> e = new SparseArray<>();
    private int f = 0;
    private List<yl1<Item>> g;
    /* access modifiers changed from: private */
    public final Map<Class, d<Item>> h = new b0();
    private jm1<Item> i = new jm1<>();
    private boolean j = false;
    private boolean k = true;
    private boolean l = false;
    /* access modifiers changed from: private */
    public dm1<Item> m;
    /* access modifiers changed from: private */
    public dm1<Item> n;
    /* access modifiers changed from: private */
    public gm1<Item> o;
    /* access modifiers changed from: private */
    public gm1<Item> p;
    /* access modifiers changed from: private */
    public hm1<Item> q;
    private em1 r = new fm1();
    private bm1 s = new cm1();
    private wl1<Item> t = new a(this);
    private am1<Item> u = new C0150b(this);
    private im1<Item> v = new c(this);

    class a extends wl1<Item> {
        a(b bVar) {
        }

        public void c(View view, int i, b<Item> bVar, Item item) {
            c<Item> R = bVar.R(i);
            if (R != null && item != null && item.isEnabled()) {
                boolean z = false;
                boolean z2 = item instanceof f;
                if (z2) {
                    f fVar = (f) item;
                    if (fVar.a() != null) {
                        z = fVar.a().a(view, R, item, i);
                    }
                }
                if (!z && bVar.m != null) {
                    z = bVar.m.a(view, R, item, i);
                }
                for (d dVar : bVar.h.values()) {
                    if (z) {
                        break;
                    }
                    z = dVar.f(view, i, bVar, item);
                }
                if (!z && z2) {
                    f fVar2 = (f) item;
                    if (fVar2.b() != null) {
                        z = fVar2.b().a(view, R, item, i);
                    }
                }
                if (!z && bVar.n != null) {
                    bVar.n.a(view, R, item, i);
                }
            }
        }
    }

    /* renamed from: com.mikepenz.fastadapter.b$b  reason: collision with other inner class name */
    class C0150b extends am1<Item> {
        C0150b(b bVar) {
        }

        public boolean c(View view, int i, b<Item> bVar, Item item) {
            c<Item> R = bVar.R(i);
            boolean z = false;
            if (R == null || item == null || !item.isEnabled()) {
                return false;
            }
            if (bVar.o != null) {
                z = bVar.o.a(view, R, item, i);
            }
            for (d dVar : bVar.h.values()) {
                if (z) {
                    break;
                }
                z = dVar.b(view, i, bVar, item);
            }
            return (z || bVar.p == null) ? z : bVar.p.a(view, R, item, i);
        }
    }

    class c extends im1<Item> {
        c(b bVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
            r5 = r13.R(r12);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean c(android.view.View r10, android.view.MotionEvent r11, int r12, com.mikepenz.fastadapter.b<Item> r13, Item r14) {
            /*
                r9 = this;
                java.util.Map r0 = r13.h
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
            L_0x000d:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0026
                java.lang.Object r2 = r0.next()
                r3 = r2
                com.mikepenz.fastadapter.d r3 = (com.mikepenz.fastadapter.d) r3
                if (r1 != 0) goto L_0x0026
                r4 = r10
                r5 = r11
                r6 = r12
                r7 = r13
                r8 = r14
                boolean r1 = r3.d(r4, r5, r6, r7, r8)
                goto L_0x000d
            L_0x0026:
                hm1 r0 = r13.q
                if (r0 == 0) goto L_0x003f
                com.mikepenz.fastadapter.c r5 = r13.R(r12)
                if (r5 == 0) goto L_0x003f
                hm1 r2 = r13.q
                r3 = r10
                r4 = r11
                r6 = r14
                r7 = r12
                boolean r10 = r2.a(r3, r4, r5, r6, r7)
                return r10
            L_0x003f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mikepenz.fastadapter.b.c.c(android.view.View, android.view.MotionEvent, int, com.mikepenz.fastadapter.b, com.mikepenz.fastadapter.l):boolean");
        }
    }

    class d implements km1 {
        final /* synthetic */ long a;

        d(b bVar, long j) {
            this.a = j;
        }

        public boolean a(c cVar, int i, l lVar, int i2) {
            return lVar.c() == this.a;
        }
    }

    public static class e<Item extends l> {
        public c<Item> a = null;
        public Item b = null;
    }

    public static abstract class f<Item extends l> extends RecyclerView.c0 {
        public void M(Item item) {
        }

        public abstract void N(Item item, List<Object> list);

        public void O(Item item) {
        }

        public boolean P(Item item) {
            return false;
        }

        public abstract void Q(Item item);
    }

    public b() {
        F(true);
    }

    private static int Q(SparseArray<?> sparseArray, int i2) {
        int indexOfKey = sparseArray.indexOfKey(i2);
        return indexOfKey < 0 ? (~indexOfKey) - 1 : indexOfKey;
    }

    public static <Item extends l> Item V(@Nullable RecyclerView.c0 c0Var, int i2) {
        if (c0Var == null) {
            return null;
        }
        Object tag = c0Var.e.getTag(R$id.fastadapter_item_adapter);
        if (tag instanceof b) {
            return ((b) tag).Y(i2);
        }
        return null;
    }

    public static <Item extends l> Item W(@Nullable RecyclerView.c0 c0Var) {
        if (c0Var == null) {
            return null;
        }
        Item tag = c0Var.e.getTag(R$id.fastadapter_item);
        if (tag instanceof l) {
            return (l) tag;
        }
        return null;
    }

    public static <Item extends l> rm1<Boolean, Item, Integer> u0(c<Item> cVar, int i2, g gVar, km1<Item> km1, boolean z) {
        if (!gVar.g() && gVar.i() != null) {
            for (int i3 = 0; i3 < gVar.i().size(); i3++) {
                l lVar = (l) gVar.i().get(i3);
                if (km1.a(cVar, i2, lVar, -1) && z) {
                    return new rm1<>(Boolean.TRUE, lVar, null);
                }
                if (lVar instanceof g) {
                    rm1<Boolean, Item, Integer> u0 = u0(cVar, i2, (g) lVar, km1, z);
                    if (((Boolean) u0.a).booleanValue()) {
                        return u0;
                    }
                }
            }
        }
        return new rm1<>(Boolean.FALSE, null, null);
    }

    public static <Item extends l, A extends c> b<Item> z0(@Nullable Collection<A> collection, @Nullable Collection<d<Item>> collection2) {
        b<Item> bVar = new b<>();
        if (collection == null) {
            bVar.c.add(tl1.H());
        } else {
            bVar.c.addAll(collection);
        }
        for (int i2 = 0; i2 < bVar.c.size(); i2++) {
            bVar.c.get(i2).k(bVar).f(i2);
        }
        bVar.O();
        if (collection2 != null) {
            for (d<Item> N : collection2) {
                bVar.N(N);
            }
        }
        return bVar;
    }

    public boolean A(RecyclerView.c0 c0Var) {
        if (this.l) {
            "onFailedToRecycleView: " + c0Var.l();
        }
        return this.s.d(c0Var, c0Var.j()) || super.A(c0Var);
    }

    public b<Item> A0(boolean z) {
        this.i.A(z);
        return this;
    }

    public void B(RecyclerView.c0 c0Var) {
        if (this.l) {
            "onViewAttachedToWindow: " + c0Var.l();
        }
        super.B(c0Var);
        this.s.b(c0Var, c0Var.j());
    }

    public b<Item> B0(@Nullable Collection<? extends yl1<Item>> collection) {
        if (collection == null) {
            return this;
        }
        if (this.g == null) {
            this.g = new LinkedList();
        }
        this.g.addAll(collection);
        return this;
    }

    public void C(RecyclerView.c0 c0Var) {
        if (this.l) {
            "onViewDetachedFromWindow: " + c0Var.l();
        }
        super.C(c0Var);
        this.s.a(c0Var, c0Var.j());
    }

    public b<Item> C0(boolean z) {
        this.i.B(z);
        return this;
    }

    public void D(RecyclerView.c0 c0Var) {
        if (this.l) {
            "onViewRecycled: " + c0Var.l();
        }
        super.D(c0Var);
        this.s.e(c0Var, c0Var.j());
    }

    public b<Item> D0(dm1<Item> dm1) {
        this.n = dm1;
        return this;
    }

    public b<Item> E0(gm1<Item> gm1) {
        this.p = gm1;
        return this;
    }

    public b<Item> F0(Bundle bundle) {
        G0(bundle, "");
        return this;
    }

    public b<Item> G0(@Nullable Bundle bundle, String str) {
        for (d<Item> i2 : this.h.values()) {
            i2.i(bundle, str);
        }
        return this;
    }

    public b<Item> H0(boolean z) {
        this.i.C(z);
        return this;
    }

    public b<Item> I0(boolean z) {
        if (z) {
            N(this.i);
        } else {
            this.h.remove(this.i.getClass());
        }
        this.i.D(z);
        return this;
    }

    public <E extends d<Item>> b<Item> N(E e2) {
        if (!this.h.containsKey(e2.getClass())) {
            this.h.put(e2.getClass(), e2);
            e2.g(this);
            return this;
        }
        throw new IllegalStateException("The given extension was already registered with this FastAdapter instance");
    }

    /* access modifiers changed from: protected */
    public void O() {
        this.e.clear();
        Iterator<c<Item>> it = this.c.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            c next = it.next();
            if (next.h() > 0) {
                this.e.append(i2, next);
                i2 += next.h();
            }
        }
        if (i2 == 0 && this.c.size() > 0) {
            this.e.append(0, this.c.get(0));
        }
        this.f = i2;
    }

    @Deprecated
    public void P() {
        this.i.m();
    }

    @Nullable
    public c<Item> R(int i2) {
        if (i2 < 0 || i2 >= this.f) {
            return null;
        }
        boolean z = this.l;
        SparseArray<c<Item>> sparseArray = this.e;
        return sparseArray.valueAt(Q(sparseArray, i2));
    }

    public List<yl1<Item>> S() {
        return this.g;
    }

    @Nullable
    public <T extends d<Item>> T T(Class<? super T> cls) {
        return (d) this.h.get(cls);
    }

    public Collection<d<Item>> U() {
        return this.h.values();
    }

    public int X(RecyclerView.c0 c0Var) {
        return c0Var.j();
    }

    public Item Y(int i2) {
        if (i2 < 0 || i2 >= this.f) {
            return null;
        }
        int Q = Q(this.e, i2);
        return this.e.valueAt(Q).j(i2 - this.e.keyAt(Q));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r5 = t0(new com.mikepenz.fastadapter.b.d(r4, r5), true);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.q3<Item, java.lang.Integer> Z(long r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = -1
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x0008
            return r0
        L_0x0008:
            com.mikepenz.fastadapter.b$d r1 = new com.mikepenz.fastadapter.b$d
            r1.<init>(r4, r5)
            r5 = 1
            rm1 r5 = r4.t0(r1, r5)
            U r6 = r5.b
            if (r6 != 0) goto L_0x0017
            return r0
        L_0x0017:
            q3 r0 = new q3
            V r5 = r5.c
            r0.<init>(r6, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mikepenz.fastadapter.b.Z(long):q3");
    }

    public dm1<Item> a0() {
        return this.n;
    }

    public int b0(long j2) {
        Iterator<c<Item>> it = this.c.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            c next = it.next();
            if (next.getOrder() >= 0) {
                int a2 = next.a(j2);
                if (a2 != -1) {
                    return i2 + a2;
                }
                i2 = next.h();
            }
        }
        return -1;
    }

    public int c0(Item item) {
        if (item.c() == -1) {
            return -1;
        }
        return b0(item.c());
    }

    public int d0(int i2) {
        if (this.f == 0) {
            return 0;
        }
        SparseArray<c<Item>> sparseArray = this.e;
        return sparseArray.keyAt(Q(sparseArray, i2));
    }

    public int e0(int i2) {
        if (this.f == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < Math.min(i2, this.c.size()); i4++) {
            i3 += this.c.get(i4).h();
        }
        return i3;
    }

    public e<Item> f0(int i2) {
        if (i2 < 0 || i2 >= g()) {
            return new e<>();
        }
        e<Item> eVar = new e<>();
        int Q = Q(this.e, i2);
        if (Q != -1) {
            eVar.b = this.e.valueAt(Q).j(i2 - this.e.keyAt(Q));
            eVar.a = this.e.valueAt(Q);
        }
        return eVar;
    }

    public int g() {
        return this.f;
    }

    @Deprecated
    public Set<Item> g0() {
        return this.i.s();
    }

    public long h(int i2) {
        return Y(i2).c();
    }

    @Deprecated
    public Set<Integer> h0() {
        return this.i.t();
    }

    public int i(int i2) {
        return Y(i2).d();
    }

    public Item i0(int i2) {
        return j0().get(i2);
    }

    public q<Item> j0() {
        if (this.d == null) {
            this.d = new pm1();
        }
        return this.d;
    }

    public void k0() {
        for (d<Item> k2 : this.h.values()) {
            k2.k();
        }
        O();
        l();
    }

    public void l0(int i2) {
        m0(i2, (Object) null);
    }

    public void m0(int i2, @Nullable Object obj) {
        o0(i2, 1, obj);
    }

    public void n0(int i2, int i3) {
        o0(i2, i3, (Object) null);
    }

    public void o0(int i2, int i3, @Nullable Object obj) {
        for (d<Item> l2 : this.h.values()) {
            l2.l(i2, i3, obj);
        }
        if (obj == null) {
            q(i2, i3);
        } else {
            r(i2, i3, obj);
        }
    }

    public void p0(int i2, int i3) {
        for (d<Item> a2 : this.h.values()) {
            a2.a(i2, i3);
        }
        O();
        s(i2, i3);
    }

    public void q0(int i2, int i3) {
        for (d<Item> c2 : this.h.values()) {
            c2.c(i2, i3);
        }
        O();
        t(i2, i3);
    }

    public void r0(int i2) {
        q0(i2, 1);
    }

    public rm1<Boolean, Item, Integer> s0(km1<Item> km1, int i2, boolean z) {
        while (i2 < g()) {
            e f0 = f0(i2);
            Item item = f0.b;
            if (km1.a(f0.a, i2, item, i2) && z) {
                return new rm1<>(Boolean.TRUE, item, Integer.valueOf(i2));
            }
            if (item instanceof g) {
                rm1<Boolean, Item, Integer> u0 = u0(f0.a, i2, (g) item, km1, z);
                if (((Boolean) u0.a).booleanValue() && z) {
                    return u0;
                }
            }
            i2++;
        }
        return new rm1<>(Boolean.FALSE, null, null);
    }

    public rm1<Boolean, Item, Integer> t0(km1<Item> km1, boolean z) {
        return s0(km1, 0, z);
    }

    public void v(RecyclerView recyclerView) {
        boolean z = this.l;
        super.v(recyclerView);
    }

    public void v0(Item item) {
        if (j0().a(item) && (item instanceof h)) {
            B0(((h) item).a());
        }
    }

    public void w(RecyclerView.c0 c0Var, int i2) {
        if (this.j) {
            if (this.l) {
                "onBindViewHolderLegacy: " + i2 + "/" + c0Var.l() + " isLegacy: true";
            }
            c0Var.e.setTag(R$id.fastadapter_item_adapter, this);
            this.s.c(c0Var, i2, Collections.EMPTY_LIST);
        }
    }

    public Bundle w0(@Nullable Bundle bundle) {
        x0(bundle, "");
        return bundle;
    }

    public void x(RecyclerView.c0 c0Var, int i2, List<Object> list) {
        if (!this.j) {
            if (this.l) {
                "onBindViewHolder: " + i2 + "/" + c0Var.l() + " isLegacy: false";
            }
            c0Var.e.setTag(R$id.fastadapter_item_adapter, this);
            this.s.c(c0Var, i2, list);
        }
        super.x(c0Var, i2, list);
    }

    public Bundle x0(@Nullable Bundle bundle, String str) {
        for (d<Item> e2 : this.h.values()) {
            e2.e(bundle, str);
        }
        return bundle;
    }

    public RecyclerView.c0 y(ViewGroup viewGroup, int i2) {
        if (this.l) {
            "onCreateViewHolder: " + i2;
        }
        RecyclerView.c0 b = this.r.b(this, viewGroup, i2);
        b.e.setTag(R$id.fastadapter_item_adapter, this);
        if (this.k) {
            qm1.a(this.t, b, b.e);
            qm1.a(this.u, b, b.e);
            qm1.a(this.v, b, b.e);
        }
        this.r.a(this, b);
        return b;
    }

    @Deprecated
    public void y0(int i2) {
        this.i.x(i2, false, false);
    }

    public void z(RecyclerView recyclerView) {
        boolean z = this.l;
        super.z(recyclerView);
    }
}
