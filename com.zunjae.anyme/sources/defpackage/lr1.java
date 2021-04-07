package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.e0;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0274R$drawable;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.vresult.a;
import defpackage.a9;
import java.util.HashMap;
import java.util.List;

/* renamed from: lr1  reason: default package */
public final class lr1 extends Fragment {
    public static final e e0 = new e((r62) null);
    /* access modifiers changed from: private */
    public a9<pt1> a0 = b9.a();
    private final d22 b0 = g22.b(new b(this, (oh2) null, new a(this), (o52) null));
    private final d22 c0 = g22.b(new d(this, (oh2) null, new c(this), (o52) null));
    private HashMap d0;

    /* renamed from: lr1$a */
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

    /* renamed from: lr1$b */
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

    /* renamed from: lr1$c */
    public static final class c extends w62 implements o52<e0> {
        final /* synthetic */ Fragment f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
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

    /* renamed from: lr1$d */
    public static final class d extends w62 implements o52<gr1> {
        final /* synthetic */ Fragment f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;
        final /* synthetic */ o52 i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment, oh2 oh2, o52 o52, o52 o522) {
            super(0);
            this.f = fragment;
            this.g = oh2;
            this.h = o52;
            this.i = o522;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, gr1] */
        /* renamed from: a */
        public final gr1 invoke() {
            return kg2.a(this.f, f72.b(gr1.class), this.g, this.h, this.i);
        }
    }

    /* renamed from: lr1$e */
    public static final class e {
        private e() {
        }

        public /* synthetic */ e(r62 r62) {
            this();
        }

        public final lr1 a() {
            return new lr1();
        }
    }

    /* renamed from: lr1$f */
    static final class f extends w62 implements z52<com.afollestad.recyclical.c, u22> {
        final /* synthetic */ lr1 f;
        final /* synthetic */ int g;

        /* renamed from: lr1$f$a */
        static final class a extends w62 implements z52<com.afollestad.recyclical.a<? extends pt1, nr1>, u22> {
            final /* synthetic */ f f;

            /* renamed from: lr1$f$a$a  reason: collision with other inner class name */
            static final /* synthetic */ class C0249a extends u62 implements z52<View, nr1> {
                public static final C0249a n = new C0249a();

                C0249a() {
                    super(1, nr1.class, "<init>", "<init>(Landroid/view/View;)V", 0);
                }

                /* renamed from: k */
                public final nr1 r(View view) {
                    v62.e(view, "p1");
                    return new nr1(view);
                }
            }

            /* renamed from: lr1$f$a$b */
            static final class b extends w62 implements e62<nr1, Integer, pt1, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(a aVar) {
                    super(3);
                    this.f = aVar;
                }

                public final void a(nr1 nr1, int i, pt1 pt1) {
                    v62.e(nr1, "$receiver");
                    v62.e(pt1, "video");
                    nr1.M().setText(pt1.b());
                    nr1.O().setText(pt1.c());
                    com.zunjae.anyme.a.b(this.f.f.f.o1()).t(pt1.a()).h0(C0274R$drawable.transparent_to_black).K0(nr1.N());
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((nr1) obj, ((Number) obj2).intValue(), (pt1) obj3);
                    return u22.a;
                }
            }

            /* renamed from: lr1$f$a$c */
            static final class c extends w62 implements d62<r9<? extends pt1>, Integer, u22> {
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

                public final void a(r9<pt1> r9Var, int i) {
                    v62.e(r9Var, "$receiver");
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(r9Var.getItem().c()));
                    intent.setFlags(268435456);
                    Context u = this.f.f.f.u();
                    if (u != null) {
                        u.startActivity(intent);
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(f fVar) {
                super(1);
                this.f = fVar;
            }

            public final void a(com.afollestad.recyclical.a<pt1, nr1> aVar) {
                v62.e(aVar, "$receiver");
                aVar.c(C0249a.n, new b(this));
                aVar.d(new c(this));
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((com.afollestad.recyclical.a) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(lr1 lr1, int i) {
            super(1);
            this.f = lr1;
            this.g = i;
        }

        public final void a(com.afollestad.recyclical.c cVar) {
            v62.e(cVar, "$receiver");
            cVar.g(this.f.a0);
            cVar.h(new GridLayoutManager(this.f.u(), this.g));
            a aVar = new a(this);
            String name = pt1.class.getName();
            v62.b(name, "IT::class.java.name");
            n9 n9Var = new n9(cVar, name);
            aVar.r(n9Var);
            cVar.e(C0278R$layout.cardview_anime_video, n9Var);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((com.afollestad.recyclical.c) obj);
            return u22.a;
        }
    }

    /* renamed from: lr1$g */
    static final class g<T> implements u<com.zunjae.vresult.a<? extends List<? extends pt1>>> {
        final /* synthetic */ lr1 a;

        /* renamed from: lr1$g$a */
        static final class a extends w62 implements o52<u22> {
            final /* synthetic */ g f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(g gVar) {
                super(0);
                this.f = gVar;
            }

            public final void a() {
                this.f.a.O1().V(this.f.a.P1().g().i());
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return u22.a;
            }
        }

        g(lr1 lr1) {
            this.a = lr1;
        }

        /* renamed from: b */
        public final void a(com.zunjae.vresult.a<? extends List<pt1>> aVar) {
            if (aVar instanceof a.e) {
                a9.a.a(this.a.a0, (List) ((a.e) aVar).b(), (d62) null, (d62) null, 6, (Object) null);
                RecyclerView recyclerView = (RecyclerView) this.a.K1(C0275R$id.recyclerView);
                v62.d(recyclerView, "recyclerView");
                rw1.g(recyclerView);
            } else if (aVar instanceof a.c) {
                RecyclerView recyclerView2 = (RecyclerView) this.a.K1(C0275R$id.recyclerView);
                v62.d(recyclerView2, "recyclerView");
                rw1.h(recyclerView2);
            } else if (aVar instanceof a.d) {
                fw1.f.i(e32.b((RecyclerView) this.a.K1(C0275R$id.recyclerView)), "No videos found for this Anime :/");
            } else if (aVar instanceof a.b) {
                RecyclerView recyclerView3 = (RecyclerView) this.a.K1(C0275R$id.recyclerView);
                v62.d(recyclerView3, "recyclerView");
                rw1.c(recyclerView3, "Could not connect to MyAnimeList", "Retry", new a(this));
            }
        }
    }

    public lr1() {
        super(C0278R$layout.fragment_anime_videos);
    }

    /* access modifiers changed from: private */
    public final nu1 O1() {
        return (nu1) this.b0.getValue();
    }

    /* access modifiers changed from: private */
    public final gr1 P1() {
        return (gr1) this.c0.getValue();
    }

    private final void Q1() {
        bw1 bw1 = bw1.a;
        Context o1 = o1();
        v62.d(o1, "requireContext()");
        int a2 = bw1.a(o1, 1, 2, 2, 1);
        RecyclerView recyclerView = (RecyclerView) K1(C0275R$id.recyclerView);
        v62.d(recyclerView, "recyclerView");
        com.afollestad.recyclical.b.a(recyclerView, new f(this, a2));
    }

    public void I0() {
        super.I0();
        if (!com.zunjae.vresult.b.a(O1().y())) {
            O1().V(P1().g().i());
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

    public void h0(Bundle bundle) {
        super.h0(bundle);
        Q1();
        O1().y().g(R(), new g(this));
    }

    public /* synthetic */ void u0() {
        super.u0();
        J1();
    }
}
