package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.recyclical.R$id;
import com.afollestad.recyclical.c;
import defpackage.n9;
import java.util.ArrayList;
import java.util.List;

/* renamed from: l9  reason: default package */
public final class l9 {

    /* renamed from: l9$a */
    static final class a extends w62 implements z52<View, u22> {
        final /* synthetic */ com.afollestad.recyclical.a f;
        final /* synthetic */ RecyclerView.c0 g;
        final /* synthetic */ e62 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(com.afollestad.recyclical.a aVar, RecyclerView.c0 c0Var, e62 e62) {
            super(1);
            this.f = aVar;
            this.g = c0Var;
            this.h = e62;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
            defpackage.k52.a(r1, r4);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.view.View r4) {
            /*
                r3 = this;
                java.lang.String r0 = "child"
                defpackage.v62.f(r4, r0)
                androidx.recyclerview.widget.RecyclerView$c0 r0 = r3.g
                android.view.View r0 = r0.e
                java.lang.String r1 = "viewHolder.itemView"
                defpackage.v62.b(r0, r1)
                androidx.recyclerview.widget.RecyclerView$c0 r0 = defpackage.l9.g(r0)
                int r0 = r0.j()
                com.afollestad.recyclical.a r1 = r3.f
                r9 r1 = defpackage.l9.c(r1, r0)
                e62 r2 = r3.h     // Catch:{ all -> 0x002c }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x002c }
                r2.l(r1, r0, r4)     // Catch:{ all -> 0x002c }
                u22 r4 = defpackage.u22.a     // Catch:{ all -> 0x002c }
                r4 = 0
                defpackage.k52.a(r1, r4)
                return
            L_0x002c:
                r4 = move-exception
                throw r4     // Catch:{ all -> 0x002e }
            L_0x002e:
                r0 = move-exception
                defpackage.k52.a(r1, r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.l9.a.a(android.view.View):void");
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((View) obj);
            return u22.a;
        }
    }

    public static final void a(com.afollestad.recyclical.a<?, ?> aVar, RecyclerView.c0 c0Var, Object obj, int i) {
        v62.f(aVar, "$this$bindViewHolder");
        v62.f(c0Var, "viewHolder");
        v62.f(obj, "item");
        n9<?, ?> d = d(aVar);
        View view = c0Var.e;
        view.setTag(R$id.rec_view_item_view_holder, c0Var);
        view.setTag(R$id.rec_view_item_selectable_data_source, d.h());
        e62<?, Integer, ?, u22> e = d.e();
        if (!i72.g(e, 3)) {
            e = null;
        }
        if (e != null) {
            u22 l = e.l(c0Var, Integer.valueOf(i), obj);
        }
        c0Var.e.setTag(R$id.rec_view_item_selectable_data_source, (Object) null);
    }

    public static final RecyclerView.c0 b(com.afollestad.recyclical.a<?, ?> aVar, View view) {
        v62.f(aVar, "$this$createViewHolder");
        v62.f(view, "itemView");
        n9<?, ?> d = d(aVar);
        c n = d.n();
        if (!(d.k() == null && n.b() == null)) {
            view.setOnClickListener(d.o());
            k9.b(view);
        }
        if (!(d.l() == null && n.c() == null)) {
            view.setOnLongClickListener(d.p());
            k9.b(view);
        }
        z52<View, ?> g = d.g();
        if (!i72.g(g, 1)) {
            g = null;
        }
        if (g != null) {
            RecyclerView.c0 c0Var = (RecyclerView.c0) g.r(view);
            f(aVar, c0Var);
            return c0Var;
        }
        throw new IllegalStateException(("View holder creator not provided for item definition " + d.j()).toString());
    }

    public static final <IT, VH extends RecyclerView.c0> r9<IT> c(com.afollestad.recyclical.a<? extends IT, VH> aVar, int i) {
        v62.f(aVar, "$this$getSelectionStateProvider");
        boolean z = aVar instanceof n9;
        if (z) {
            n9 n9Var = (n9) aVar;
            a9<?> h = n9Var.h();
            a9<?> a9Var = null;
            if (!(h instanceof d9)) {
                h = null;
            }
            d9 d9Var = (d9) h;
            if (d9Var != null) {
                return new q9(d9Var, i);
            }
            if (z) {
                a9<?> h2 = n9Var.h();
                if (h2 instanceof a9) {
                    a9Var = h2;
                }
                return new p9(a9Var, i);
            }
            throw new IllegalStateException((aVar + " is not a RealItemDefinition").toString());
        }
        throw new IllegalStateException((aVar + " is not a RealItemDefinition").toString());
    }

    public static final n9<?, ?> d(com.afollestad.recyclical.a<?, ?> aVar) {
        v62.f(aVar, "$this$realDefinition");
        n9<?, ?> n9Var = (n9) (!(aVar instanceof n9) ? null : aVar);
        if (n9Var != null) {
            return n9Var;
        }
        throw new IllegalStateException((aVar + " is not a RealItemDefinition").toString());
    }

    public static final void e(com.afollestad.recyclical.a<?, ?> aVar, RecyclerView.c0 c0Var) {
        v62.f(aVar, "$this$recycleViewHolder");
        v62.f(c0Var, "viewHolder");
        z52<Object, u22> m = d(aVar).m();
        if (m != null) {
            u22 r = m.r(c0Var);
        }
    }

    private static final void f(com.afollestad.recyclical.a<?, ?> aVar, RecyclerView.c0 c0Var) {
        n9<?, ?> d = d(aVar);
        if (!d.f().isEmpty()) {
            List<n9.a<?, ?, ?>> f = d.f();
            ArrayList<n9.a> arrayList = new ArrayList<>();
            for (T next : f) {
                if (v62.a(((n9.a) next).c(), c0Var.getClass())) {
                    arrayList.add(next);
                }
            }
            for (n9.a aVar2 : arrayList) {
                z52 b = aVar2.b();
                if (b != null) {
                    i72.c(b, 1);
                    z52 z52 = b;
                    e62 a2 = aVar2.a();
                    if (a2 != null) {
                        i72.c(a2, 3);
                        h9.a((View) z52.r(c0Var), new a(aVar, c0Var, a2));
                    } else {
                        throw new r22("null cannot be cast to non-null type com.afollestad.recyclical.viewholder.SelectionStateProvider<kotlin.Any>.(kotlin.Int, kotlin.Any) -> kotlin.Unit");
                    }
                } else {
                    throw new r22("null cannot be cast to non-null type (com.afollestad.recyclical.ViewHolder /* = androidx.recyclerview.widget.RecyclerView.ViewHolder */) -> android.view.View");
                }
            }
        }
    }

    public static final RecyclerView.c0 g(View view) {
        v62.f(view, "$this$viewHolder");
        Object tag = view.getTag(R$id.rec_view_item_view_holder);
        if (!(tag instanceof RecyclerView.c0)) {
            tag = null;
        }
        RecyclerView.c0 c0Var = (RecyclerView.c0) tag;
        if (c0Var != null) {
            return c0Var;
        }
        throw new IllegalStateException("Didn't find view holder in itemView tag.".toString());
    }
}
