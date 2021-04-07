package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.n;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0276R$integer;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.features.discover.advanced_search_v3.AdvancedSearchV3Activity;
import com.zunjae.anyme.features.discover.fast_search.FastAnimeSearchActivity;
import com.zunjae.anyme.features.settings.UserSettingsActivity;
import java.util.HashMap;
import java.util.List;

/* renamed from: ps1  reason: default package */
public final class ps1 extends qs1 {
    public static final b m0 = new b((r62) null);
    private os1 c0;
    private com.zunjae.anyme.features.anime.shows_list.d d0;
    private final d22 e0 = g22.b(new a(this, (oh2) null, (o52) null));
    /* access modifiers changed from: private */
    public int f0;
    private String g0 = "";
    /* access modifiers changed from: private */
    public int h0;
    private View.OnClickListener i0;
    private View.OnClickListener j0;
    private View.OnClickListener k0;
    private HashMap l0;

    /* renamed from: ps1$a */
    public static final class a extends w62 implements o52<nu1> {
        final /* synthetic */ n f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(n nVar, oh2 oh2, o52 o52) {
            super(0);
            this.f = nVar;
            this.g = oh2;
            this.h = o52;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, nu1] */
        /* renamed from: a */
        public final nu1 invoke() {
            return lg2.b(this.f, f72.b(nu1.class), this.g, this.h);
        }
    }

    /* renamed from: ps1$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(r62 r62) {
            this();
        }

        public final ps1 a(int i) {
            ps1 ps1 = new ps1();
            Bundle bundle = new Bundle();
            bundle.putInt("contentType", i);
            u22 u22 = u22.a;
            ps1.u1(bundle);
            return ps1;
        }
    }

    /* renamed from: ps1$c */
    public static final class c extends RecyclerView.s {
        final /* synthetic */ ps1 a;

        c(ps1 ps1) {
            this.a = ps1;
        }

        public void a(RecyclerView recyclerView, int i) {
            v62.e(recyclerView, "recyclerView");
            super.a(recyclerView, i);
            if (i == 0) {
                ps1 ps1 = this.a;
                RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    ps1.f0 = ((GridLayoutManager) layoutManager).e2();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            }
        }
    }

    /* renamed from: ps1$d */
    static final class d implements SwipeRefreshLayout.j {
        final /* synthetic */ ps1 a;

        d(ps1 ps1) {
            this.a = ps1;
        }

        public final void a() {
            cw1.k.a().i(new dv1());
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.a.L1(C0275R$id.swipeRefreshLayout);
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(false);
            }
        }
    }

    /* renamed from: ps1$e */
    static final class e<T> implements u<List<? extends sy1>> {
        final /* synthetic */ ps1 a;

        e(ps1 ps1) {
            this.a = ps1;
        }

        /* renamed from: b */
        public final void a(List<sy1> list) {
            this.a.P1(list);
        }
    }

    /* renamed from: ps1$f */
    static final class f<T> implements u<List<? extends sy1>> {
        final /* synthetic */ ps1 a;

        /* renamed from: ps1$f$a */
        static final class a extends w62 implements z52<ve2<ps1>, u22> {
            final /* synthetic */ f f;
            final /* synthetic */ List g;

            /* renamed from: ps1$f$a$a  reason: collision with other inner class name */
            static final class C0258a extends w62 implements z52<ps1, u22> {
                final /* synthetic */ a f;
                final /* synthetic */ List g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0258a(a aVar, List list) {
                    super(1);
                    this.f = aVar;
                    this.g = list;
                }

                public final void a(ps1 ps1) {
                    v62.e(ps1, "it");
                    this.f.f.a.P1(this.g);
                }

                public /* bridge */ /* synthetic */ Object r(Object obj) {
                    a((ps1) obj);
                    return u22.a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(f fVar, List list) {
                super(1);
                this.f = fVar;
                this.g = list;
            }

            public final void a(ve2<ps1> ve2) {
                v62.e(ve2, "$receiver");
                dz1 dz1 = dz1.a;
                List list = this.g;
                v62.d(list, "animes");
                we2.d(ve2, new C0258a(this, dz1.g(list, this.f.a.h0)));
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((ve2) obj);
                return u22.a;
            }
        }

        f(ps1 ps1) {
            this.a = ps1;
        }

        /* renamed from: b */
        public final void a(List<sy1> list) {
            we2.c(this.a, (z52) null, new a(this, list), 1, (Object) null);
        }
    }

    /* renamed from: ps1$g */
    static final class g implements View.OnClickListener {
        final /* synthetic */ ps1 e;

        g(ps1 ps1) {
            this.e = ps1;
        }

        public final void onClick(View view) {
            FragmentActivity n = this.e.n();
            if (n != null) {
                n.startActivity(new Intent(this.e.n(), AdvancedSearchV3Activity.class));
            }
        }
    }

    /* renamed from: ps1$h */
    static final class h implements View.OnClickListener {
        final /* synthetic */ ps1 e;

        h(ps1 ps1) {
            this.e = ps1;
        }

        public final void onClick(View view) {
            FragmentActivity n = this.e.n();
            if (n != null) {
                n.startActivity(new Intent(this.e.n(), FastAnimeSearchActivity.class));
            }
        }
    }

    /* renamed from: ps1$i */
    static final class i implements View.OnClickListener {
        final /* synthetic */ ps1 e;

        i(ps1 ps1) {
            this.e = ps1;
        }

        public final void onClick(View view) {
            FragmentActivity n = this.e.n();
            if (n != null) {
                n.startActivity(new Intent(this.e.n(), UserSettingsActivity.class));
            }
        }
    }

    /* renamed from: ps1$j */
    static final class j implements View.OnClickListener {
        final /* synthetic */ ps1 e;

        j(ps1 ps1) {
            this.e = ps1;
        }

        public final void onClick(View view) {
            this.e.V1();
        }
    }

    /* access modifiers changed from: private */
    public final void P1(List<sy1> list) {
        if (list == null || list.isEmpty()) {
            fw1 fw1 = fw1.f;
            RecyclerView recyclerView = (RecyclerView) L1(C0275R$id.recyclerView);
            View.OnClickListener onClickListener = this.i0;
            if (onClickListener != null) {
                View.OnClickListener onClickListener2 = this.j0;
                if (onClickListener2 != null) {
                    View.OnClickListener onClickListener3 = this.k0;
                    if (onClickListener3 != null) {
                        fw1.l(recyclerView, onClickListener, onClickListener2, onClickListener3);
                    } else {
                        v62.p("resetProfileClickListener");
                        throw null;
                    }
                } else {
                    v62.p("searchButtonListener");
                    throw null;
                }
            } else {
                v62.p("discoverButtonListener");
                throw null;
            }
        } else {
            com.zunjae.anyme.features.anime.shows_list.d dVar = this.d0;
            if (dVar != null) {
                dVar.Y(list);
            }
            if (this.f0 < list.size()) {
                RecyclerView recyclerView2 = (RecyclerView) L1(C0275R$id.recyclerView);
                if (recyclerView2 != null) {
                    recyclerView2.j1(this.f0);
                }
            } else {
                RecyclerView recyclerView3 = (RecyclerView) L1(C0275R$id.recyclerView);
                if (recyclerView3 != null) {
                    recyclerView3.j1(list.size());
                }
            }
            os1 os1 = this.c0;
            if (os1 != null) {
                os1.a();
            }
            fw1.f.o((RecyclerView) L1(C0275R$id.recyclerView));
        }
    }

    private final nu1 R1() {
        return (nu1) this.e0.getValue();
    }

    private final void S1() {
        int i2;
        int i3;
        boolean z = !xu1.i.u();
        if (!z) {
            i3 = xu1.i.a();
            i2 = i3 + 2;
        } else if (z) {
            AbstractActivity K1 = K1();
            v62.c(K1);
            i3 = K1.getResources().getInteger(C0276R$integer.span_optimized_layout);
            i2 = i3 + 1;
        } else {
            throw new IllegalArgumentException("No switch case found for adapterType with id " + (z ? 1 : 0));
        }
        AbstractActivity K12 = K1();
        v62.c(K12);
        com.zunjae.anyme.features.anime.shows_list.d dVar = this.d0;
        v62.c(dVar);
        com.zunjae.zrecyclerview.c cVar = new com.zunjae.zrecyclerview.c(K12, (RecyclerView) L1(C0275R$id.recyclerView), dVar);
        cVar.d(com.zunjae.zrecyclerview.a.GRID);
        cVar.c(i3, i2);
        cVar.a();
    }

    private final void T1() {
        RecyclerView recyclerView = (RecyclerView) L1(C0275R$id.recyclerView);
        if (recyclerView != null) {
            recyclerView.l(new c(this));
        }
    }

    private final void X1(int i2) {
        LiveData<List<sy1>> Q;
        if (i2 == 7 && (Q = R1().Q(7)) != null) {
            Q.g(R(), new e(this));
        }
    }

    private final void Y1(int i2) {
        LiveData<List<sy1>> P = R1().P(i2);
        if (P != null) {
            P.g(R(), new f(this));
        }
    }

    private final void Z1() {
        this.i0 = new g(this);
        this.j0 = new h(this);
        this.k0 = new i(this);
        TextView textView = (TextView) L1(C0275R$id.searchForNotFoundFilteredAnime);
        if (textView != null) {
            textView.setOnClickListener(new j(this));
        }
    }

    private final void a2() {
        int i2;
        int i3 = this.h0;
        if (i3 != 0) {
            int i4 = 1;
            if (i3 != 1) {
                i4 = 2;
                if (i3 != 2) {
                    int i5 = 3;
                    if (i3 != 3) {
                        i5 = 4;
                        if (i3 != 4) {
                            if (i3 != 5) {
                                X1(i3);
                                return;
                            }
                        }
                    }
                    Y1(i5);
                    return;
                }
                i2 = 6;
            }
            Y1(i4);
            return;
        }
        i2 = 0;
        Y1(i2);
    }

    public void J1() {
        HashMap hashMap = this.l0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void K0() {
        super.K0();
        cw1.k.a().j(this);
    }

    public void L0() {
        super.L0();
        cw1.k.a().l(this);
    }

    public View L1(int i2) {
        if (this.l0 == null) {
            this.l0 = new HashMap();
        }
        View view = (View) this.l0.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View Q = Q();
        if (Q == null) {
            return null;
        }
        View findViewById = Q.findViewById(i2);
        this.l0.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @SuppressLint({"SetTextI18n"})
    public final void Q1(String str, boolean z, boolean z2, boolean z3, List<Integer> list, int i2) {
        v62.e(str, "filterTextUserInput");
        this.g0 = str;
        com.zunjae.anyme.features.anime.shows_list.d dVar = this.d0;
        if (dVar != null) {
            dVar.M(str, z, z2, z3, list, i2);
        }
        if (str.length() > 0) {
            TextView textView = (TextView) L1(C0275R$id.searchForNotFoundFilteredAnime);
            if (textView != null) {
                rw1.i(textView);
            }
            TextView textView2 = (TextView) L1(C0275R$id.searchForNotFoundFilteredAnime);
            if (textView2 != null) {
                textView2.setText(com.zunjae.extensions.c.a("<u>Click here to search for '" + str + "' on MyAnimeList</u>"));
                return;
            }
            return;
        }
        TextView textView3 = (TextView) L1(C0275R$id.searchForNotFoundFilteredAnime);
        if (textView3 != null) {
            rw1.a(textView3);
        }
    }

    public final void U1(List<com.zunjae.anyme.features.kanon.a> list) {
        v62.e(list, "animesLinkedWithGenres");
        com.zunjae.anyme.features.anime.shows_list.d dVar = this.d0;
        if (dVar != null) {
            dVar.N(list);
        }
    }

    public final void V1() {
        if (this.g0.length() <= 2) {
            FragmentActivity n = n();
            if (n != null) {
                Toast makeText = Toast.makeText(n, "Please enter at least 3 characters", 0);
                makeText.show();
                v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
                return;
            }
            return;
        }
        AbstractActivity K1 = K1();
        if (K1 != null) {
            FastAnimeSearchActivity.c cVar = FastAnimeSearchActivity.J;
            AbstractActivity K12 = K1();
            v62.c(K12);
            K1.startActivity(FastAnimeSearchActivity.c.b(cVar, K12, this.g0, false, 4, (Object) null));
        }
    }

    public final void W1(os1 os1) {
        v62.e(os1, "adapterListener");
        this.c0 = os1;
    }

    public void h0(Bundle bundle) {
        com.zunjae.anyme.features.anime.shows_list.d dVar;
        super.h0(bundle);
        this.h0 = n1().getInt("contentType");
        if (fz1.a.h()) {
            fw1 fw1 = fw1.f;
            Context o1 = o1();
            v62.d(o1, "requireContext()");
            fw1.n(o1, (RecyclerView) L1(C0275R$id.recyclerView));
            return;
        }
        if (xu1.i.u()) {
            AbstractActivity K1 = K1();
            v62.c(K1);
            dVar = new com.zunjae.anyme.features.anime.shows_list.d(K1, 0);
        } else {
            AbstractActivity K12 = K1();
            v62.c(K12);
            dVar = new com.zunjae.anyme.features.anime.shows_list.d(K12, 1);
        }
        this.d0 = dVar;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) L1(C0275R$id.swipeRefreshLayout);
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(new d(this));
        }
        T1();
        S1();
        a2();
        Z1();
    }

    @vq1
    public final void onScrollToTop(gv1 gv1) {
        v62.e(gv1, "bus");
        RecyclerView recyclerView = (RecyclerView) L1(C0275R$id.recyclerView);
        if (recyclerView != null) {
            recyclerView.r1(0);
        }
    }

    @vq1
    public final void onSoftRefreshList(hv1 hv1) {
        v62.e(hv1, "bus");
        a2();
    }

    public View r0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        v62.e(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0278R$layout.anime_list_controller, viewGroup, false);
        v62.d(inflate, "inflater.inflate(R.layou…roller, container, false)");
        return inflate;
    }

    public /* synthetic */ void u0() {
        super.u0();
        J1();
    }
}
