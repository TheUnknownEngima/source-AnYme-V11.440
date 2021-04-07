package defpackage;

import android.content.Context;
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

/* renamed from: ft1  reason: default package */
public final class ft1 extends Fragment {
    /* access modifiers changed from: private */
    public a9<ct1> a0 = b9.a();
    private final d22 b0 = g22.b(new b(this, (oh2) null, new a(this), (o52) null));
    private HashMap c0;

    /* renamed from: ft1$a */
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

    /* renamed from: ft1$b */
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

    /* renamed from: ft1$c */
    static final class c extends w62 implements z52<com.afollestad.recyclical.c, u22> {
        final /* synthetic */ ft1 f;
        final /* synthetic */ int g;

        /* renamed from: ft1$c$a */
        static final class a extends w62 implements z52<com.afollestad.recyclical.a<? extends ct1, gt1>, u22> {
            final /* synthetic */ c f;

            /* renamed from: ft1$c$a$a  reason: collision with other inner class name */
            static final /* synthetic */ class C0233a extends u62 implements z52<View, gt1> {
                public static final C0233a n = new C0233a();

                C0233a() {
                    super(1, gt1.class, "<init>", "<init>(Landroid/view/View;)V", 0);
                }

                /* renamed from: k */
                public final gt1 r(View view) {
                    v62.e(view, "p1");
                    return new gt1(view);
                }
            }

            /* renamed from: ft1$c$a$b */
            static final class b extends w62 implements e62<gt1, Integer, ct1, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(a aVar) {
                    super(3);
                    this.f = aVar;
                }

                public final void a(gt1 gt1, int i, ct1 ct1) {
                    v62.e(gt1, "$receiver");
                    v62.e(ct1, "genre");
                    com.zunjae.anyme.a.d(this.f.f.f.m1()).t(ct1.c()).K0(gt1.M());
                    gt1.N().setText(f92.q(ct1.b(), "_", " ", false, 4, (Object) null));
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((gt1) obj, ((Number) obj2).intValue(), (ct1) obj3);
                    return u22.a;
                }
            }

            /* renamed from: ft1$c$a$c  reason: collision with other inner class name */
            static final class C0234c extends w62 implements d62<r9<? extends ct1>, Integer, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0234c(a aVar) {
                    super(2);
                    this.f = aVar;
                }

                public /* bridge */ /* synthetic */ Object G(Object obj, Object obj2) {
                    a((r9) obj, ((Number) obj2).intValue());
                    return u22.a;
                }

                public final void a(r9<ct1> r9Var, int i) {
                    v62.e(r9Var, "$receiver");
                    GenericItemList.d dVar = GenericItemList.M;
                    Context o1 = this.f.f.f.o1();
                    v62.d(o1, "requireContext()");
                    this.f.f.f.E1(GenericItemList.d.b(dVar, o1, com.zunjae.anyme.features.kanon.generic_anime_list.c.Genre, r9Var.getItem().a(), r9Var.getItem().b(), (String) null, 16, (Object) null));
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c cVar) {
                super(1);
                this.f = cVar;
            }

            public final void a(com.afollestad.recyclical.a<ct1, gt1> aVar) {
                v62.e(aVar, "$receiver");
                aVar.c(C0233a.n, new b(this));
                aVar.d(new C0234c(this));
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((com.afollestad.recyclical.a) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ft1 ft1, int i) {
            super(1);
            this.f = ft1;
            this.g = i;
        }

        public final void a(com.afollestad.recyclical.c cVar) {
            v62.e(cVar, "$receiver");
            cVar.g(this.f.a0);
            cVar.h(new GridLayoutManager(this.f.u(), this.g));
            a aVar = new a(this);
            String name = ct1.class.getName();
            v62.b(name, "IT::class.java.name");
            n9 n9Var = new n9(cVar, name);
            aVar.r(n9Var);
            cVar.e(C0278R$layout.cardview_anime_genre, n9Var);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((com.afollestad.recyclical.c) obj);
            return u22.a;
        }
    }

    /* renamed from: ft1$d */
    static final class d<T> implements u<com.zunjae.vresult.a<? extends List<? extends ct1>>> {
        final /* synthetic */ ft1 a;

        /* renamed from: ft1$d$a */
        static final class a extends w62 implements o52<u22> {
            final /* synthetic */ d f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar) {
                super(0);
                this.f = dVar;
            }

            public final void a() {
                this.f.a.N1().I();
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return u22.a;
            }
        }

        /* renamed from: ft1$d$b */
        static final class b extends w62 implements o52<u22> {
            final /* synthetic */ d f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(d dVar) {
                super(0);
                this.f = dVar;
            }

            public final void a() {
                this.f.a.N1().I();
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return u22.a;
            }
        }

        d(ft1 ft1) {
            this.a = ft1;
        }

        /* renamed from: b */
        public final void a(com.zunjae.vresult.a<? extends List<ct1>> aVar) {
            RecyclerView recyclerView;
            o52 bVar;
            String str;
            if (aVar instanceof a.c) {
                RecyclerView recyclerView2 = (RecyclerView) this.a.K1(C0275R$id.recyclerViewGenres);
                v62.d(recyclerView2, "recyclerViewGenres");
                rw1.h(recyclerView2);
            } else if (aVar instanceof a.e) {
                a9.a.a(this.a.a0, (List) ((a.e) aVar).b(), (d62) null, (d62) null, 6, (Object) null);
                RecyclerView recyclerView3 = (RecyclerView) this.a.K1(C0275R$id.recyclerViewGenres);
                v62.d(recyclerView3, "recyclerViewGenres");
                rw1.g(recyclerView3);
            } else {
                if (aVar instanceof a.d) {
                    recyclerView = (RecyclerView) this.a.K1(C0275R$id.recyclerViewGenres);
                    if (recyclerView != null) {
                        bVar = new a(this);
                        str = "No genres found...";
                    } else {
                        return;
                    }
                } else if ((aVar instanceof a.b) && (recyclerView = (RecyclerView) this.a.K1(C0275R$id.recyclerViewGenres)) != null) {
                    bVar = new b(this);
                    str = "Could not connect to Kanon";
                } else {
                    return;
                }
                rw1.d(recyclerView, str, (String) null, bVar, 2, (Object) null);
            }
        }
    }

    public ft1() {
        super(C0278R$layout.fragment_genre_list);
    }

    /* access modifiers changed from: private */
    public final qu1 N1() {
        return (qu1) this.b0.getValue();
    }

    private final void O1() {
        bw1 bw1 = bw1.a;
        Context o1 = o1();
        v62.d(o1, "requireContext()");
        int a2 = bw1.a(o1, 3, 4, 5, 2);
        RecyclerView recyclerView = (RecyclerView) K1(C0275R$id.recyclerViewGenres);
        v62.d(recyclerView, "recyclerViewGenres");
        com.afollestad.recyclical.b.a(recyclerView, new c(this, a2));
        N1().s().g(R(), new d(this));
    }

    public void I0() {
        super.I0();
        if (!com.zunjae.vresult.b.a(N1().s())) {
            N1().I();
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
