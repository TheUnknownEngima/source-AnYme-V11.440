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

/* renamed from: yq1  reason: default package */
public final class yq1 extends Fragment {
    public static final c e0 = new c((r62) null);
    private final d22 a0 = g22.b(new b(this, (oh2) null, new a(this), (o52) null));
    /* access modifiers changed from: private */
    public a9<zq1> b0 = b9.a();
    private int c0;
    private HashMap d0;

    /* renamed from: yq1$a */
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

    /* renamed from: yq1$b */
    public static final class b extends w62 implements o52<nu1> {
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

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, nu1] */
        /* renamed from: a */
        public final nu1 invoke() {
            return kg2.a(this.f, f72.b(nu1.class), this.g, this.h, this.i);
        }
    }

    /* renamed from: yq1$c */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(r62 r62) {
            this();
        }

        public final yq1 a(int i) {
            yq1 yq1 = new yq1();
            Bundle bundle = new Bundle();
            bundle.putInt("animeId", i);
            u22 u22 = u22.a;
            yq1.u1(bundle);
            return yq1;
        }
    }

    /* renamed from: yq1$d */
    static final class d extends w62 implements z52<com.afollestad.recyclical.c, u22> {
        final /* synthetic */ yq1 f;
        final /* synthetic */ int g;

        /* renamed from: yq1$d$a */
        static final class a extends w62 implements z52<com.afollestad.recyclical.a<? extends zq1, ar1>, u22> {
            final /* synthetic */ d f;

            /* renamed from: yq1$d$a$a  reason: collision with other inner class name */
            static final /* synthetic */ class C0266a extends u62 implements z52<View, ar1> {
                public static final C0266a n = new C0266a();

                C0266a() {
                    super(1, ar1.class, "<init>", "<init>(Landroid/view/View;)V", 0);
                }

                /* renamed from: k */
                public final ar1 r(View view) {
                    v62.e(view, "p1");
                    return new ar1(view);
                }
            }

            /* renamed from: yq1$d$a$b */
            static final class b extends w62 implements e62<ar1, Integer, zq1, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(a aVar) {
                    super(3);
                    this.f = aVar;
                }

                public final void a(ar1 ar1, int i, zq1 zq1) {
                    v62.e(ar1, "$receiver");
                    v62.e(zq1, "friendProgress");
                    ar1.N().setText(zq1.a());
                    ar1.O().setText(zq1.toString());
                    View p1 = this.f.f.f.p1();
                    v62.d(p1, "requireView()");
                    com.zunjae.anyme.a.b(p1.getContext()).t(zq1.b()).K0(ar1.M());
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((ar1) obj, ((Number) obj2).intValue(), (zq1) obj3);
                    return u22.a;
                }
            }

            /* renamed from: yq1$d$a$c */
            static final class c extends w62 implements d62<r9<? extends zq1>, Integer, u22> {
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

                public final void a(r9<zq1> r9Var, int i) {
                    v62.e(r9Var, "$receiver");
                    GenericItemList.d dVar = GenericItemList.M;
                    Context o1 = this.f.f.f.o1();
                    v62.d(o1, "requireContext()");
                    Intent c = dVar.c(o1, r9Var.getItem().a());
                    FragmentActivity n = this.f.f.f.n();
                    if (n != null) {
                        n.startActivity(c);
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar) {
                super(1);
                this.f = dVar;
            }

            public final void a(com.afollestad.recyclical.a<zq1, ar1> aVar) {
                v62.e(aVar, "$receiver");
                aVar.c(C0266a.n, new b(this));
                aVar.d(new c(this));
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((com.afollestad.recyclical.a) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(yq1 yq1, int i) {
            super(1);
            this.f = yq1;
            this.g = i;
        }

        public final void a(com.afollestad.recyclical.c cVar) {
            v62.e(cVar, "$receiver");
            cVar.g(this.f.b0);
            cVar.h(new GridLayoutManager(this.f.u(), this.g));
            a aVar = new a(this);
            String name = zq1.class.getName();
            v62.b(name, "IT::class.java.name");
            n9 n9Var = new n9(cVar, name);
            aVar.r(n9Var);
            cVar.e(C0278R$layout.friend_progress, n9Var);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((com.afollestad.recyclical.c) obj);
            return u22.a;
        }
    }

    /* renamed from: yq1$e */
    static final class e<T> implements u<com.zunjae.vresult.a<? extends List<? extends zq1>>> {
        final /* synthetic */ yq1 a;

        /* renamed from: yq1$e$a */
        static final class a extends w62 implements o52<u22> {
            final /* synthetic */ e f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(e eVar) {
                super(0);
                this.f = eVar;
            }

            public final void a() {
                this.f.a.O1().W(this.f.a.N1());
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return u22.a;
            }
        }

        e(yq1 yq1) {
            this.a = yq1;
        }

        /* renamed from: b */
        public final void a(com.zunjae.vresult.a<? extends List<zq1>> aVar) {
            RecyclerView recyclerView;
            if (aVar instanceof a.e) {
                a9.a.a(this.a.b0, (List) ((a.e) aVar).b(), (d62) null, (d62) null, 6, (Object) null);
                RecyclerView recyclerView2 = (RecyclerView) this.a.K1(C0275R$id.recyclerView);
                if (recyclerView2 != null) {
                    rw1.g(recyclerView2);
                }
            } else if (aVar instanceof a.d) {
                RecyclerView recyclerView3 = (RecyclerView) this.a.K1(C0275R$id.recyclerView);
                if (recyclerView3 != null) {
                    rw1.e(recyclerView3, "You either have no friends (sorry m8) or they haven't seen this Anime");
                }
            } else if (aVar instanceof a.c) {
                RecyclerView recyclerView4 = (RecyclerView) this.a.K1(C0275R$id.recyclerView);
                if (recyclerView4 != null) {
                    rw1.h(recyclerView4);
                }
            } else if ((aVar instanceof a.b) && (recyclerView = (RecyclerView) this.a.K1(C0275R$id.recyclerView)) != null) {
                rw1.c(recyclerView, "Could not connect to MyAnimeList", "Retry", new a(this));
            }
        }
    }

    public yq1() {
        super(C0278R$layout.fragment_friend_progress);
    }

    /* access modifiers changed from: private */
    public final nu1 O1() {
        return (nu1) this.a0.getValue();
    }

    private final void P1() {
        bw1 bw1 = bw1.a;
        Context o1 = o1();
        v62.d(o1, "requireContext()");
        int b2 = bw1.b(bw1, o1, 2, 2, 2, 0, 16, (Object) null);
        RecyclerView recyclerView = (RecyclerView) K1(C0275R$id.recyclerView);
        v62.d(recyclerView, "recyclerView");
        com.afollestad.recyclical.b.a(recyclerView, new d(this, b2));
    }

    public void I0() {
        super.I0();
        if (!com.zunjae.vresult.b.a(O1().B())) {
            O1().W(this.c0);
        }
    }

    public void J1() {
        HashMap hashMap = this.d0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View K1(int i) {
        if (this.d0 == null) {
            this.d0 = new HashMap();
        }
        View view = (View) this.d0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View Q = Q();
        if (Q == null) {
            return null;
        }
        View findViewById = Q.findViewById(i);
        this.d0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int N1() {
        return this.c0;
    }

    public void h0(Bundle bundle) {
        super.h0(bundle);
        P1();
        this.c0 = n1().getInt("animeId");
        O1().B().g(R(), new e(this));
    }

    public /* synthetic */ void u0() {
        super.u0();
        J1();
    }
}
