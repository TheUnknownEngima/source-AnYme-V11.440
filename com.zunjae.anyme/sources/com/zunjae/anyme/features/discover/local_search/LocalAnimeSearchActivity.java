package com.zunjae.anyme.features.discover.local_search;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.afollestad.materialdialogs.f;
import com.ferfalk.simplesearchview.SimpleSearchView;
import com.google.android.material.chip.Chip;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.C0279R$menu;
import com.zunjae.anyme.abstracts.AbstractActivity;
import defpackage.ny1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class LocalAnimeSearchActivity extends AbstractActivity {
    public static final c I = new c((r62) null);
    private ps1 D;
    private final d22 E = g22.b(new a(this, (oh2) null, (o52) null));
    private final d22 F = g22.b(new b(this, (oh2) null, (o52) null));
    /* access modifiers changed from: private */
    public final ArrayList<ny1> G = ny1.a.b(ny1.c, false, false, 2, (Object) null);
    private HashMap H;

    public static final class a extends w62 implements o52<nu1> {
        final /* synthetic */ androidx.lifecycle.n f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(androidx.lifecycle.n nVar, oh2 oh2, o52 o52) {
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

    public static final class b extends w62 implements o52<qu1> {
        final /* synthetic */ androidx.lifecycle.n f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(androidx.lifecycle.n nVar, oh2 oh2, o52 o52) {
            super(0);
            this.f = nVar;
            this.g = oh2;
            this.h = o52;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, qu1] */
        /* renamed from: a */
        public final qu1 invoke() {
            return lg2.b(this.f, f72.b(qu1.class), this.g, this.h);
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(r62 r62) {
            this();
        }

        public static /* synthetic */ Intent b(c cVar, Context context, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            return cVar.a(context, z);
        }

        public final Intent a(Context context, boolean z) {
            v62.e(context, "context");
            Intent intent = new Intent(context, LocalAnimeSearchActivity.class);
            intent.putExtra("focusOnSearchBar", z);
            return intent;
        }
    }

    public static final class d implements os1 {
        final /* synthetic */ LocalAnimeSearchActivity a;

        d(LocalAnimeSearchActivity localAnimeSearchActivity) {
            this.a = localAnimeSearchActivity;
        }

        public void a() {
            ((SimpleSearchView) this.a.l0(C0275R$id.searchView)).x(this.a.S().A(), false);
            this.a.y0();
        }
    }

    static final class e implements Runnable {
        final /* synthetic */ LocalAnimeSearchActivity e;

        e(LocalAnimeSearchActivity localAnimeSearchActivity) {
            this.e = localAnimeSearchActivity;
        }

        public final void run() {
            ((SimpleSearchView) this.e.l0(C0275R$id.searchView)).z(false);
        }
    }

    public static final class f implements SimpleSearchView.f {
        final /* synthetic */ LocalAnimeSearchActivity a;

        f(LocalAnimeSearchActivity localAnimeSearchActivity) {
            this.a = localAnimeSearchActivity;
        }

        public boolean a(String str) {
            v62.e(str, "newText");
            SimpleSearchView simpleSearchView = (SimpleSearchView) this.a.l0(C0275R$id.searchView);
            v62.d(simpleSearchView, "searchView");
            if (!simpleSearchView.n()) {
                return false;
            }
            this.a.S().m0(str);
            this.a.y0();
            return false;
        }

        public boolean b(String str) {
            v62.e(str, "query");
            if (str.length() < 3) {
                return false;
            }
            LocalAnimeSearchActivity.p0(this.a).V1();
            return false;
        }

        public boolean c() {
            this.a.S().m0("");
            this.a.y0();
            return false;
        }
    }

    public static final class g implements SimpleSearchView.h {
        final /* synthetic */ LocalAnimeSearchActivity a;

        g(LocalAnimeSearchActivity localAnimeSearchActivity) {
            this.a = localAnimeSearchActivity;
        }

        public void a() {
        }

        public void b() {
            bw1.a.d(this.a.Q());
        }

        public void c() {
            ((SimpleSearchView) this.a.l0(C0275R$id.searchView)).x(this.a.S().A(), false);
        }

        public void d() {
            this.a.I0();
        }
    }

    static final class h extends w62 implements z52<ve2<LocalAnimeSearchActivity>, u22> {
        final /* synthetic */ LocalAnimeSearchActivity f;
        final /* synthetic */ com.afollestad.materialdialogs.f g;

        static final class a extends w62 implements z52<LocalAnimeSearchActivity, u22> {
            final /* synthetic */ h f;
            final /* synthetic */ List g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(h hVar, List list) {
                super(1);
                this.f = hVar;
                this.g = list;
            }

            public final void a(LocalAnimeSearchActivity localAnimeSearchActivity) {
                v62.e(localAnimeSearchActivity, "it");
                com.afollestad.materialdialogs.f fVar = this.f.g;
                if (fVar != null) {
                    fVar.dismiss();
                }
                this.f.f.z0().P(this.g);
                if (this.f.f.z0().l() != null) {
                    ps1 p0 = LocalAnimeSearchActivity.p0(this.f.f);
                    List<com.zunjae.anyme.features.kanon.a> l = this.f.f.z0().l();
                    v62.c(l);
                    p0.U1(l);
                    this.f.f.H0();
                    return;
                }
                mw1.q(this.f.f, "Could not connected with Kanon", "Welp :/");
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((LocalAnimeSearchActivity) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(LocalAnimeSearchActivity localAnimeSearchActivity, com.afollestad.materialdialogs.f fVar) {
            super(1);
            this.f = localAnimeSearchActivity;
            this.g = fVar;
        }

        public final void a(ve2<LocalAnimeSearchActivity> ve2) {
            List list;
            v62.e(ve2, "$receiver");
            List<Integer> s = this.f.S().s();
            if (s != null) {
                try {
                    list = this.f.U().t(s).h().a();
                } catch (Exception e) {
                    uj2.d(e);
                    list = null;
                }
                we2.a(ve2, new a(this, list));
            }
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((ve2) obj);
            return u22.a;
        }
    }

    static final class i implements f.k {
        final /* synthetic */ LocalAnimeSearchActivity a;
        final /* synthetic */ ArrayList b;

        i(LocalAnimeSearchActivity localAnimeSearchActivity, ArrayList arrayList) {
            this.a = localAnimeSearchActivity;
            this.b = arrayList;
        }

        public final boolean a(com.afollestad.materialdialogs.f fVar, View view, int i, CharSequence charSequence) {
            this.a.S().n0(i);
            Object obj = this.b.get(i);
            v62.d(obj, "ratings[which]");
            this.a.S().r0(((oy1) obj).b());
            this.a.y0();
            return true;
        }
    }

    static final class j implements f.j {
        final /* synthetic */ LocalAnimeSearchActivity a;

        j(LocalAnimeSearchActivity localAnimeSearchActivity) {
            this.a = localAnimeSearchActivity;
        }

        public final boolean a(com.afollestad.materialdialogs.f fVar, Integer[] numArr, CharSequence[] charSequenceArr) {
            nu1 q0 = this.a.S();
            v62.d(numArr, "which");
            q0.o0(numArr);
            this.a.y0();
            return true;
        }
    }

    static final class k implements View.OnClickListener {
        final /* synthetic */ LocalAnimeSearchActivity e;

        k(LocalAnimeSearchActivity localAnimeSearchActivity) {
            this.e = localAnimeSearchActivity;
        }

        public final void onClick(View view) {
            this.e.D0();
        }
    }

    static final class l implements View.OnClickListener {
        final /* synthetic */ LocalAnimeSearchActivity e;

        l(LocalAnimeSearchActivity localAnimeSearchActivity) {
            this.e = localAnimeSearchActivity;
        }

        public final void onClick(View view) {
            this.e.F0();
        }
    }

    static final class m implements View.OnClickListener {
        final /* synthetic */ LocalAnimeSearchActivity e;

        m(LocalAnimeSearchActivity localAnimeSearchActivity) {
            this.e = localAnimeSearchActivity;
        }

        public final void onClick(View view) {
            this.e.E0();
        }
    }

    static final class n implements f.j {
        final /* synthetic */ LocalAnimeSearchActivity a;

        n(LocalAnimeSearchActivity localAnimeSearchActivity) {
            this.a = localAnimeSearchActivity;
        }

        public final boolean a(com.afollestad.materialdialogs.f fVar, Integer[] numArr, CharSequence[] charSequenceArr) {
            this.a.S().q0(numArr);
            nu1 q0 = this.a.S();
            ArrayList o0 = this.a.G;
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object next : o0) {
                int i2 = i + 1;
                Integer num = null;
                if (i >= 0) {
                    ny1 ny1 = (ny1) next;
                    v62.d(numArr, "which");
                    if (b32.g(numArr, Integer.valueOf(i))) {
                        num = Integer.valueOf(ny1.a());
                    }
                    if (num != null) {
                        arrayList.add(num);
                    }
                    i = i2;
                } else {
                    d32.k();
                    throw null;
                }
            }
            q0.l0(arrayList);
            this.a.y0();
            return true;
        }
    }

    static final class o implements f.n {
        final /* synthetic */ LocalAnimeSearchActivity a;

        o(LocalAnimeSearchActivity localAnimeSearchActivity) {
            this.a = localAnimeSearchActivity;
        }

        public final void a(com.afollestad.materialdialogs.f fVar, com.afollestad.materialdialogs.b bVar) {
            v62.e(fVar, "<anonymous parameter 0>");
            v62.e(bVar, "<anonymous parameter 1>");
            this.a.S().q0((Integer[]) null);
            this.a.y0();
        }
    }

    private final Integer[] A0() {
        Integer[] R = S().R();
        return R != null ? R : new Integer[0];
    }

    private final void B0() {
        ps1 a2 = ps1.m0.a(0);
        this.D = a2;
        if (a2 != null) {
            b0(C0275R$id.fragmentContainerFrameLayout, a2);
            ps1 ps1 = this.D;
            if (ps1 != null) {
                ps1.W1(new d(this));
                Intent intent = getIntent();
                if (intent != null && intent.getBooleanExtra("focusOnSearchBar", true)) {
                    ((SimpleSearchView) l0(C0275R$id.searchView)).post(new e(this));
                    return;
                }
                return;
            }
            v62.p("animeListController");
            throw null;
        }
        v62.p("animeListController");
        throw null;
    }

    private final void C0() {
        ((SimpleSearchView) l0(C0275R$id.searchView)).setOnQueryTextListener(new f(this));
        ((SimpleSearchView) l0(C0275R$id.searchView)).setOnSearchViewListener(new g(this));
    }

    /* access modifiers changed from: private */
    public final void D0() {
        if (z0().l() != null) {
            H0();
        } else {
            we2.c(this, (z52) null, new h(this, mw1.a(this, "Please wait", "Linking genres...").D()), 1, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public final void E0() {
        ArrayList<oy1> a2 = oy1.c.a();
        f.e eVar = new f.e(this);
        eVar.E("Pick A Minimum Score");
        eVar.q(a2);
        eVar.u(S().C(), new i(this, a2));
        eVar.B("Filter");
        eVar.D();
    }

    /* access modifiers changed from: private */
    public final void F0() {
        List h2 = f32.h("TV", "Movies", "Specials");
        f.e eVar = new f.e(this);
        eVar.E("Include these series types");
        eVar.q(h2);
        eVar.t(S().D(), new j(this));
        eVar.B("Filter");
        eVar.D();
    }

    private final void G0() {
        ((Chip) l0(C0275R$id.filterGenres)).setOnClickListener(new k(this));
        ((Chip) l0(C0275R$id.filterSeriesType)).setOnClickListener(new l(this));
        ((Chip) l0(C0275R$id.filterMinimumScore)).setOnClickListener(new m(this));
    }

    /* access modifiers changed from: private */
    public final void H0() {
        Integer[] A0 = A0();
        f.e eVar = new f.e(this);
        eVar.E("Include these genres");
        eVar.q(this.G);
        eVar.t(A0, new n(this));
        eVar.B("Filter");
        eVar.w("Reset");
        eVar.y(new o(this));
        eVar.D();
    }

    /* access modifiers changed from: private */
    public final void I0() {
        String A = S().A();
        if (A != null) {
            Toolbar toolbar = (Toolbar) l0(C0275R$id.fastAnimeSearchToolbar);
            v62.d(toolbar, "fastAnimeSearchToolbar");
            toolbar.setSubtitle((CharSequence) "Searching for " + A);
            return;
        }
        Toolbar toolbar2 = (Toolbar) l0(C0275R$id.fastAnimeSearchToolbar);
        v62.d(toolbar2, "fastAnimeSearchToolbar");
        toolbar2.setSubtitle((CharSequence) null);
    }

    /* access modifiers changed from: private */
    public final nu1 S() {
        return (nu1) this.E.getValue();
    }

    public static final /* synthetic */ ps1 p0(LocalAnimeSearchActivity localAnimeSearchActivity) {
        ps1 ps1 = localAnimeSearchActivity.D;
        if (ps1 != null) {
            return ps1;
        }
        v62.p("animeListController");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void y0() {
        String A = S().A();
        if (A == null) {
            A = "";
        }
        String str = A;
        boolean g2 = b32.g(S().D(), 0);
        boolean g3 = b32.g(S().D(), 1);
        boolean g4 = b32.g(S().D(), 2);
        ps1 ps1 = this.D;
        if (ps1 != null) {
            ps1.Q1(str, g2, g3, g4, S().q(), S().S());
            I0();
            return;
        }
        v62.p("animeListController");
        throw null;
    }

    /* access modifiers changed from: private */
    public final qu1 z0() {
        return (qu1) this.F.getValue();
    }

    public View l0(int i2) {
        if (this.H == null) {
            this.H = new HashMap();
        }
        View view = (View) this.H.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.H.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public void onBackPressed() {
        SimpleSearchView simpleSearchView = (SimpleSearchView) l0(C0275R$id.searchView);
        if (simpleSearchView == null || !simpleSearchView.n()) {
            super.onBackPressed();
        } else {
            ((SimpleSearchView) l0(C0275R$id.searchView)).g(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0278R$layout.search_local_anime_activity);
        Toolbar toolbar = (Toolbar) l0(C0275R$id.fastAnimeSearchToolbar);
        v62.d(toolbar, "fastAnimeSearchToolbar");
        AbstractActivity.k0(this, toolbar, (String) null, (String) null, true, 6, (Object) null);
        B0();
        C0();
        G0();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        v62.e(menu, "menu");
        getMenuInflater().inflate(C0279R$menu.basic_search, menu);
        ((SimpleSearchView) l0(C0275R$id.searchView)).setMenuItem(menu.findItem(C0275R$id.action_search));
        return true;
    }
}
