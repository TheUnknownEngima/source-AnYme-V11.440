package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.e0;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.features.kanon.generic_anime_list.GenericItemList;
import com.zunjae.vresult.a;
import defpackage.a9;
import java.util.HashMap;
import java.util.List;

/* renamed from: it1  reason: default package */
public final class it1 extends Fragment {
    /* access modifiers changed from: private */
    public a9<com.zunjae.anyme.features.kanon.b> a0 = b9.a();
    private final d22 b0 = g22.b(new b(this, (oh2) null, new a(this), (o52) null));
    private HashMap c0;

    /* renamed from: it1$a */
    public static final class a extends w62 implements o52<e0> {
        final /* synthetic */ Fragment f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f = fragment;
        }

        /* renamed from: a */
        public final e0 invoke() {
            FragmentActivity n = this.f.n();
            if (n != null) {
                return n;
            }
            throw new r22("null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
        }
    }

    /* renamed from: it1$b */
    public static final class b extends w62 implements o52<qu1> {
        final /* synthetic */ Fragment f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;
        final /* synthetic */ o52 i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment, oh2 oh2, o52 o52, o52 o522) {
            super(0);
            this.f = fragment;
            this.g = oh2;
            this.h = o52;
            this.i = o522;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, qu1] */
        /* renamed from: a */
        public final qu1 invoke() {
            return kg2.a(this.f, f72.b(qu1.class), this.g, this.h, this.i);
        }
    }

    /* renamed from: it1$c */
    static final class c<T> implements u<com.zunjae.vresult.a<? extends List<? extends com.zunjae.anyme.features.kanon.b>>> {
        final /* synthetic */ it1 a;

        /* renamed from: it1$c$a */
        static final class a extends w62 implements o52<u22> {
            final /* synthetic */ c f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c cVar) {
                super(0);
                this.f = cVar;
            }

            public final void a() {
                this.f.a.N1().J();
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return u22.a;
            }
        }

        /* renamed from: it1$c$b */
        static final class b extends w62 implements o52<u22> {
            final /* synthetic */ c f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(c cVar) {
                super(0);
                this.f = cVar;
            }

            public final void a() {
                this.f.a.N1().J();
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return u22.a;
            }
        }

        c(it1 it1) {
            this.a = it1;
        }

        /* renamed from: b */
        public final void a(com.zunjae.vresult.a<? extends List<com.zunjae.anyme.features.kanon.b>> aVar) {
            RecyclerView recyclerView;
            String str;
            o52 o52;
            if (aVar instanceof a.c) {
                RecyclerView recyclerView2 = (RecyclerView) this.a.K1(C0275R$id.recyclerViewCategories);
                v62.d(recyclerView2, "recyclerViewCategories");
                rw1.h(recyclerView2);
            } else if (aVar instanceof a.e) {
                a9.a.a(this.a.a0, (List) ((a.e) aVar).b(), (d62) null, (d62) null, 6, (Object) null);
                RecyclerView recyclerView3 = (RecyclerView) this.a.K1(C0275R$id.recyclerViewCategories);
                v62.d(recyclerView3, "recyclerViewCategories");
                rw1.g(recyclerView3);
            } else {
                if (aVar instanceof a.d) {
                    recyclerView = (RecyclerView) this.a.K1(C0275R$id.recyclerViewCategories);
                    if (recyclerView != null) {
                        o52 = new a(this);
                        str = "No categories found";
                    } else {
                        return;
                    }
                } else if ((aVar instanceof a.b) && (recyclerView = (RecyclerView) this.a.K1(C0275R$id.recyclerViewCategories)) != null) {
                    o52 = new b(this);
                    str = "Could not connect to Kanon";
                } else {
                    return;
                }
                rw1.c(recyclerView, str, "Retry", o52);
            }
        }
    }

    /* renamed from: it1$d */
    static final class d extends w62 implements z52<com.afollestad.recyclical.c, u22> {
        final /* synthetic */ it1 f;
        final /* synthetic */ int g;

        /* renamed from: it1$d$a */
        static final class a extends w62 implements z52<com.afollestad.recyclical.a<? extends com.zunjae.anyme.features.kanon.b, ht1>, u22> {
            final /* synthetic */ d f;

            /* renamed from: it1$d$a$a  reason: collision with other inner class name */
            static final /* synthetic */ class C0245a extends u62 implements z52<View, ht1> {
                public static final C0245a n = new C0245a();

                C0245a() {
                    super(1, ht1.class, "<init>", "<init>(Landroid/view/View;)V", 0);
                }

                /* renamed from: k */
                public final ht1 r(View view) {
                    v62.e(view, "p1");
                    return new ht1(view);
                }
            }

            /* renamed from: it1$d$a$b */
            static final class b extends w62 implements e62<ht1, Integer, com.zunjae.anyme.features.kanon.b, u22> {
                public static final b f = new b();

                b() {
                    super(3);
                }

                public final void a(ht1 ht1, int i, com.zunjae.anyme.features.kanon.b bVar) {
                    v62.e(ht1, "$receiver");
                    v62.e(bVar, "category");
                    ht1.N().setText(bVar.c());
                    ht1.M().setText(String.valueOf(bVar.a()));
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((ht1) obj, ((Number) obj2).intValue(), (com.zunjae.anyme.features.kanon.b) obj3);
                    return u22.a;
                }
            }

            /* renamed from: it1$d$a$c */
            static final class c extends w62 implements d62<r9<? extends com.zunjae.anyme.features.kanon.b>, Integer, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                c(a aVar) {
                    super(2);
                    this.f = aVar;
                }

                public /* bridge */ /* synthetic */ Object G(Object obj, Object obj2) {
                    a((r9) obj, ((Number) obj2).intValue());
                    return u22.a;
                }

                public final void a(r9<com.zunjae.anyme.features.kanon.b> r9Var, int i) {
                    v62.e(r9Var, "$receiver");
                    GenericItemList.d dVar = GenericItemList.M;
                    FragmentActivity m1 = this.f.f.f.m1();
                    v62.d(m1, "requireActivity()");
                    Intent b = GenericItemList.d.b(dVar, m1, com.zunjae.anyme.features.kanon.generic_anime_list.c.KitsuCategory, r9Var.getItem().b(), r9Var.getItem().c(), (String) null, 16, (Object) null);
                    FragmentActivity n = this.f.f.f.n();
                    if (n != null) {
                        n.startActivity(b);
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar) {
                super(1);
                this.f = dVar;
            }

            public final void a(com.afollestad.recyclical.a<com.zunjae.anyme.features.kanon.b, ht1> aVar) {
                v62.e(aVar, "$receiver");
                aVar.c(C0245a.n, b.f);
                aVar.d(new c(this));
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((com.afollestad.recyclical.a) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(it1 it1, int i) {
            super(1);
            this.f = it1;
            this.g = i;
        }

        public final void a(com.afollestad.recyclical.c cVar) {
            v62.e(cVar, "$receiver");
            cVar.g(this.f.a0);
            cVar.h(new GridLayoutManager(this.f.u(), this.g));
            a aVar = new a(this);
            String name = com.zunjae.anyme.features.kanon.b.class.getName();
            v62.b(name, "IT::class.java.name");
            n9 n9Var = new n9(cVar, name);
            aVar.r(n9Var);
            cVar.e(C0278R$layout.cardview_anime_kitsu_category, n9Var);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((com.afollestad.recyclical.c) obj);
            return u22.a;
        }
    }

    public it1() {
        super(C0278R$layout.fragment_anime_category);
    }

    /* access modifiers changed from: private */
    public final qu1 N1() {
        return (qu1) this.b0.getValue();
    }

    private final void O1() {
        N1().o().g(R(), new c(this));
        bw1 bw1 = bw1.a;
        Context o1 = o1();
        v62.d(o1, "requireContext()");
        int a2 = bw1.a(o1, 2, 3, 4, 1);
        RecyclerView recyclerView = (RecyclerView) K1(C0275R$id.recyclerViewCategories);
        if (recyclerView != null) {
            com.afollestad.recyclical.b.a(recyclerView, new d(this, a2));
        }
    }

    public void I0() {
        super.I0();
        if (!com.zunjae.vresult.b.a(N1().o())) {
            N1().J();
        }
    }

    public void J1() {
        HashMap hashMap = this.c0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View K1(int i) {
        if (this.c0 == null) {
            this.c0 = new HashMap();
        }
        View view = (View) this.c0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View Q = Q();
        if (Q == null) {
            return null;
        }
        View findViewById = Q.findViewById(i);
        this.c0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void h0(Bundle bundle) {
        super.h0(bundle);
        O1();
    }

    public /* synthetic */ void u0() {
        super.u0();
        J1();
    }
}
