package com.zunjae.anyme.features.discover.fast_search;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.n;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.f;
import com.ferfalk.simplesearchview.SimpleSearchView;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0276R$integer;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.C0279R$menu;
import com.zunjae.anyme.abstracts.AbstractActivity;
import java.util.HashMap;
import java.util.List;

public final class FastAnimeSearchActivity extends AbstractActivity {
    public static final c J = new c((r62) null);
    private final d22 D = g22.b(new b(this, (oh2) null, (o52) null));
    private final d22 E = g22.b(new a(this, (oh2) null, (o52) null));
    /* access modifiers changed from: private */
    public b F;
    private String G;
    /* access modifiers changed from: private */
    public boolean H = true;
    private HashMap I;

    public static final class a extends w62 implements o52<or1> {
        final /* synthetic */ ComponentCallbacks f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacks componentCallbacks, oh2 oh2, o52 o52) {
            super(0);
            this.f = componentCallbacks;
            this.g = oh2;
            this.h = o52;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, or1] */
        public final or1 invoke() {
            ComponentCallbacks componentCallbacks = this.f;
            return hg2.a(componentCallbacks).c().e(f72.b(or1.class), this.g, this.h);
        }
    }

    public static final class b extends w62 implements o52<nu1> {
        final /* synthetic */ n f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(n nVar, oh2 oh2, o52 o52) {
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

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(r62 r62) {
            this();
        }

        public static /* synthetic */ Intent b(c cVar, Context context, String str, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                z = true;
            }
            return cVar.a(context, str, z);
        }

        public final Intent a(Context context, String str, boolean z) {
            v62.e(context, "context");
            Intent intent = new Intent(context, FastAnimeSearchActivity.class);
            intent.putExtra("prefilledQuery", str);
            intent.putExtra("focusOnSearchBar", z);
            return intent;
        }
    }

    public static final class d implements SimpleSearchView.f {
        final /* synthetic */ FastAnimeSearchActivity a;

        d(FastAnimeSearchActivity fastAnimeSearchActivity) {
            this.a = fastAnimeSearchActivity;
        }

        public boolean a(String str) {
            v62.e(str, "newText");
            return false;
        }

        public boolean b(String str) {
            v62.e(str, "query");
            if (str.length() == 0) {
                Toast makeText = Toast.makeText(this.a, "Please enter something...", 0);
                makeText.show();
                v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
                return false;
            } else if (str.length() <= 2) {
                Toast makeText2 = Toast.makeText(this.a, "Please enter at least 3 characters.", 0);
                makeText2.show();
                v62.b(makeText2, "Toast\n        .makeText(…         show()\n        }");
                return false;
            } else {
                this.a.z0(str);
                Toolbar toolbar = (Toolbar) this.a.l0(C0275R$id.toolbar);
                v62.d(toolbar, "toolbar");
                toolbar.setSubtitle((CharSequence) str);
                return false;
            }
        }

        public boolean c() {
            return false;
        }
    }

    static final class e implements Runnable {
        final /* synthetic */ FastAnimeSearchActivity e;

        e(FastAnimeSearchActivity fastAnimeSearchActivity) {
            this.e = fastAnimeSearchActivity;
        }

        public final void run() {
            ((SimpleSearchView) this.e.l0(C0275R$id.searchView)).z(false);
        }
    }

    static final class f extends w62 implements z52<ve2<FastAnimeSearchActivity>, u22> {
        final /* synthetic */ FastAnimeSearchActivity f;
        final /* synthetic */ String g;

        static final class a extends w62 implements z52<FastAnimeSearchActivity, u22> {
            final /* synthetic */ f f;
            final /* synthetic */ c g;

            /* renamed from: com.zunjae.anyme.features.discover.fast_search.FastAnimeSearchActivity$f$a$a  reason: collision with other inner class name */
            static final class C0186a extends w62 implements o52<u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0186a(a aVar) {
                    super(0);
                    this.f = aVar;
                }

                public final void a() {
                    f fVar = this.f.f;
                    fVar.f.z0(fVar.g);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    a();
                    return u22.a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(f fVar, c cVar) {
                super(1);
                this.f = fVar;
                this.g = cVar;
            }

            public final void a(FastAnimeSearchActivity fastAnimeSearchActivity) {
                v62.e(fastAnimeSearchActivity, "it");
                FrameLayout frameLayout = (FrameLayout) this.f.f.l0(C0275R$id.fragmentContainerFrameLayout);
                v62.d(frameLayout, "fragmentContainerFrameLayout");
                rw1.a(frameLayout);
                c cVar = this.g;
                if ((cVar != null ? cVar.b() : null) == null) {
                    RecyclerView recyclerView = (RecyclerView) this.f.f.l0(C0275R$id.recyclerView);
                    v62.d(recyclerView, "recyclerView");
                    rw1.d(recyclerView, "Could not connect with MyAnimeList.", (String) null, new C0186a(this), 2, (Object) null);
                } else if (this.g.b().isEmpty()) {
                    fw1.f.f((RecyclerView) this.f.f.l0(C0275R$id.recyclerView));
                } else {
                    this.f.f.D0(this.g.b(), this.g.c(), this.g.a());
                    RecyclerView recyclerView2 = (RecyclerView) this.f.f.l0(C0275R$id.recyclerView);
                    v62.d(recyclerView2, "recyclerView");
                    rw1.g(recyclerView2);
                }
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((FastAnimeSearchActivity) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(FastAnimeSearchActivity fastAnimeSearchActivity, String str) {
            super(1);
            this.f = fastAnimeSearchActivity;
            this.g = str;
        }

        public final void a(ve2<FastAnimeSearchActivity> ve2) {
            v62.e(ve2, "$receiver");
            c cVar = null;
            try {
                List<Integer> f0 = this.f.S().f0(this.f.T());
                List f2 = or1.f(this.f.w0(), this.g, 0, 2, (Object) null);
                List<Integer> b = this.f.S().x().b();
                v62.c(f2);
                v62.c(f0);
                cVar = new c(f2, f0, b);
            } catch (Exception e) {
                uj2.d(e);
            }
            we2.d(ve2, new a(this, cVar));
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((ve2) obj);
            return u22.a;
        }
    }

    static final class g implements View.OnClickListener {
        final /* synthetic */ FastAnimeSearchActivity e;

        g(FastAnimeSearchActivity fastAnimeSearchActivity) {
            this.e = fastAnimeSearchActivity;
        }

        public final void onClick(View view) {
            this.e.E0();
        }
    }

    static final class h implements CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ FastAnimeSearchActivity a;

        h(FastAnimeSearchActivity fastAnimeSearchActivity) {
            this.a = fastAnimeSearchActivity;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FastAnimeSearchActivity fastAnimeSearchActivity = this.a;
            CheckBox checkBox = (CheckBox) fastAnimeSearchActivity.l0(C0275R$id.hideAlreadyAddedCheckBox);
            v62.d(checkBox, "hideAlreadyAddedCheckBox");
            fastAnimeSearchActivity.H = checkBox.isChecked();
            b m0 = this.a.F;
            if (m0 != null) {
                m0.Q(this.a.H);
            }
        }
    }

    static final class i implements CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ FastAnimeSearchActivity a;

        i(FastAnimeSearchActivity fastAnimeSearchActivity) {
            this.a = fastAnimeSearchActivity;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.a.A0(!z);
        }
    }

    static final class j implements f.n {
        final /* synthetic */ FastAnimeSearchActivity a;

        j(FastAnimeSearchActivity fastAnimeSearchActivity) {
            this.a = fastAnimeSearchActivity;
        }

        public final void a(com.afollestad.materialdialogs.f fVar, com.afollestad.materialdialogs.b bVar) {
            v62.e(fVar, "<anonymous parameter 0>");
            v62.e(bVar, "<anonymous parameter 1>");
            TextView textView = (TextView) this.a.l0(C0275R$id.removedShowsTextView);
            v62.d(textView, "removedShowsTextView");
            rw1.a(textView);
        }
    }

    static final class k implements f.n {
        final /* synthetic */ FastAnimeSearchActivity a;

        k(FastAnimeSearchActivity fastAnimeSearchActivity) {
            this.a = fastAnimeSearchActivity;
        }

        public final void a(com.afollestad.materialdialogs.f fVar, com.afollestad.materialdialogs.b bVar) {
            v62.e(fVar, "<anonymous parameter 0>");
            v62.e(bVar, "<anonymous parameter 1>");
            this.a.g0("https://anyme.app/invite");
        }
    }

    /* access modifiers changed from: private */
    public final void A0(boolean z) {
        l02.p("shouldShowNsfwItemsNotice", z);
    }

    private final void B0() {
        b0(C0275R$id.fragmentContainerFrameLayout, et1.b0.a());
        y0();
    }

    private final void C0() {
        ((TextView) l0(C0275R$id.removedShowsTextView)).setOnClickListener(new g(this));
        ((CheckBox) l0(C0275R$id.hideAlreadyAddedCheckBox)).setOnCheckedChangeListener(new h(this));
    }

    /* access modifiers changed from: private */
    public final void D0(List<a> list, List<Integer> list2, List<Integer> list3) {
        boolean z = this.H;
        androidx.fragment.app.k q = q();
        v62.d(q, "supportFragmentManager");
        this.F = new b(this, list, list3, z, list2, q);
        int integer = T().getResources().getInteger(C0276R$integer.span_fast_anime_search_results);
        b bVar = this.F;
        v62.c(bVar);
        com.zunjae.zrecyclerview.c cVar = new com.zunjae.zrecyclerview.c(T(), (RecyclerView) l0(C0275R$id.recyclerView), bVar);
        cVar.d(com.zunjae.zrecyclerview.a.GRID);
        cVar.c(integer, integer + 1);
        cVar.a();
        b bVar2 = this.F;
        v62.c(bVar2);
        int M = bVar2.M();
        if (M < 2 || !x0()) {
            TextView textView = (TextView) l0(C0275R$id.removedShowsTextView);
            v62.d(textView, "removedShowsTextView");
            rw1.a(textView);
            return;
        }
        TextView textView2 = (TextView) l0(C0275R$id.removedShowsTextView);
        v62.d(textView2, "removedShowsTextView");
        rw1.i(textView2);
        TextView textView3 = (TextView) l0(C0275R$id.removedShowsTextView);
        v62.d(textView3, "removedShowsTextView");
        textView3.setText(com.zunjae.extensions.c.a("<u>Number of hidden NSFW shows: " + M + "</u>"));
    }

    /* access modifiers changed from: private */
    public final void E0() {
        f.e eVar = new f.e(this);
        eVar.E("Notice");
        eVar.i("Certain 18+ (Rx rated) shows are filtered. You can see them by downloading the 'AnYme Patch' in the Discord server. Join the server and checkout our help channels!");
        eVar.g("Never show this again", !x0(), new i(this));
        eVar.B("Join");
        eVar.w("Hide");
        eVar.y(new j(this));
        eVar.A(new k(this));
        eVar.D();
    }

    /* access modifiers changed from: private */
    public final nu1 S() {
        return (nu1) this.D.getValue();
    }

    /* access modifiers changed from: private */
    public final or1 w0() {
        return (or1) this.E.getValue();
    }

    private final boolean x0() {
        return l02.e("shouldShowNsfwItemsNotice", true);
    }

    private final void y0() {
        ((SimpleSearchView) l0(C0275R$id.searchView)).setOnQueryTextListener(new d(this));
        Intent intent = getIntent();
        if (intent != null && intent.getBooleanExtra("focusOnSearchBar", true)) {
            ((SimpleSearchView) l0(C0275R$id.searchView)).post(new e(this));
        }
        if (this.G != null) {
            ((SimpleSearchView) l0(C0275R$id.searchView)).x(this.G, true);
        } else {
            getWindow().setSoftInputMode(4);
        }
    }

    /* access modifiers changed from: private */
    public final void z0(String str) {
        RecyclerView recyclerView = (RecyclerView) l0(C0275R$id.recyclerView);
        v62.d(recyclerView, "recyclerView");
        rw1.h(recyclerView);
        we2.c(this, (z52) null, new f(this, str), 1, (Object) null);
    }

    public View l0(int i2) {
        if (this.I == null) {
            this.I = new HashMap();
        }
        View view = (View) this.I.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.I.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public void onBackPressed() {
        SimpleSearchView simpleSearchView = (SimpleSearchView) l0(C0275R$id.searchView);
        if (simpleSearchView == null || !simpleSearchView.n()) {
            super.onBackPressed();
            return;
        }
        ((SimpleSearchView) l0(C0275R$id.searchView)).setOnQueryTextListener((SimpleSearchView.f) null);
        ((SimpleSearchView) l0(C0275R$id.searchView)).g(false);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0278R$layout.activity_better_anime_search);
        Toolbar toolbar = (Toolbar) l0(C0275R$id.toolbar);
        v62.d(toolbar, "toolbar");
        AbstractActivity.k0(this, toolbar, "Anime Search", (String) null, true, 4, (Object) null);
        Y(this);
        Intent intent = getIntent();
        String stringExtra = intent != null ? intent.getStringExtra("prefilledQuery") : null;
        this.G = stringExtra;
        if (stringExtra != null) {
            Toolbar toolbar2 = (Toolbar) l0(C0275R$id.toolbar);
            v62.d(toolbar2, "toolbar");
            toolbar2.setSubtitle((CharSequence) stringExtra);
            ((SimpleSearchView) l0(C0275R$id.searchView)).x(this.G, true);
        }
        fw1.f.k((RecyclerView) l0(C0275R$id.recyclerView), "Use the search button to look for Anime on MyAnimeList");
        B0();
        C0();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        v62.e(menu, "menu");
        getMenuInflater().inflate(C0279R$menu.basic_search, menu);
        ((SimpleSearchView) l0(C0275R$id.searchView)).setMenuItem(menu.findItem(C0275R$id.action_search));
        return true;
    }
}
