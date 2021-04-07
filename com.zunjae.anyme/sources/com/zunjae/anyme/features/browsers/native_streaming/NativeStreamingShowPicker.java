package com.zunjae.anyme.features.browsers.native_streaming;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.n;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.f;
import com.google.android.material.snackbar.Snackbar;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.C0279R$menu;
import com.zunjae.anyme.C0283R$string;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.features.browsers.native_streaming.NativeStreamingEpisodePickerActivity;
import com.zunjae.anyme.features.browsers.native_streaming.g;
import com.zunjae.vresult.a;
import defpackage.a9;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

public final class NativeStreamingShowPicker extends AbstractActivity {
    public static final b P = new b((r62) null);
    private final d22 D = g22.b(new a(this, (oh2) null, (o52) null));
    private jz1 E;
    /* access modifiers changed from: private */
    public int F;
    /* access modifiers changed from: private */
    public a9<qz1> G = b9.a();
    /* access modifiers changed from: private */
    public int H;
    /* access modifiers changed from: private */
    public boolean I;
    /* access modifiers changed from: private */
    public boolean J;
    private String K;
    /* access modifiers changed from: private */
    public int L = -1;
    /* access modifiers changed from: private */
    public int M = -1;
    private Snackbar N;
    private HashMap O;

    public static final class a extends w62 implements o52<f> {
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

        /* JADX WARNING: type inference failed for: r0v1, types: [com.zunjae.anyme.features.browsers.native_streaming.f, androidx.lifecycle.a0] */
        /* renamed from: a */
        public final f invoke() {
            return lg2.b(this.f, f72.b(f.class), this.g, this.h);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(r62 r62) {
            this();
        }

        public final Intent a(Context context, jz1 jz1, String str, boolean z, boolean z2, int i, int i2, int i3) {
            String str2;
            v62.e(context, "context");
            v62.e(jz1, "nativeStreamingSite");
            if (str == null) {
                str2 = null;
            } else if (str != null) {
                str2 = str.toLowerCase();
                v62.d(str2, "(this as java.lang.String).toLowerCase()");
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            Intent intent = new Intent(context, NativeStreamingShowPicker.class);
            intent.putExtra("nativeStreamingSiteIdentifier", jz1.getId());
            intent.putExtra("searchQuery", str2);
            intent.putExtra("castOnStartup", z);
            intent.putExtra("downloadOnStartup", z2);
            intent.putExtra("alreadyWatchedEpisodes", i);
            intent.putExtra("numberOfEpisodes", i2);
            intent.putExtra("malId", i3);
            return intent;
        }
    }

    static final class c implements f.h {
        final /* synthetic */ NativeStreamingShowPicker a;

        c(NativeStreamingShowPicker nativeStreamingShowPicker) {
            this.a = nativeStreamingShowPicker;
        }

        public final void a(com.afollestad.materialdialogs.f fVar, CharSequence charSequence) {
            v62.e(fVar, "<anonymous parameter 0>");
            v62.d(charSequence, "input");
            if (charSequence.length() == 0) {
                AbstractActivity m0 = this.a.Q();
                String string = this.a.getString(C0283R$string.warningPleaseEnterSomething);
                v62.d(string, "getString(R.string.warningPleaseEnterSomething)");
                Toast makeText = Toast.makeText(m0, string, 0);
                makeText.show();
                v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
                return;
            }
            this.a.z0().i(new g.b(charSequence.toString()));
        }
    }

    static final class d extends w62 implements z52<qz1, u22> {
        final /* synthetic */ NativeStreamingShowPicker f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(NativeStreamingShowPicker nativeStreamingShowPicker) {
            super(1);
            this.f = nativeStreamingShowPicker;
        }

        public final void a(qz1 qz1) {
            v62.e(qz1, "show");
            Intent a = NativeStreamingEpisodePickerActivity.V.a(this.f.T(), this.f.F, qz1.c(), qz1.d(), this.f.H, this.f.M, this.f.I, this.f.J, this.f.L);
            NativeStreamingShowPicker.v0(this.f).saveUniqueShowId(this.f.L, qz1.c());
            a.setFlags(33554432);
            this.f.startActivity(a);
            this.f.finish();
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((qz1) obj);
            return u22.a;
        }
    }

    static final class e extends w62 implements z52<com.afollestad.recyclical.c, u22> {
        final /* synthetic */ NativeStreamingShowPicker f;
        final /* synthetic */ int g;
        final /* synthetic */ d h;

        static final class a extends w62 implements z52<com.afollestad.recyclical.a<? extends qz1, i>, u22> {
            final /* synthetic */ e f;

            /* renamed from: com.zunjae.anyme.features.browsers.native_streaming.NativeStreamingShowPicker$e$a$a  reason: collision with other inner class name */
            static final /* synthetic */ class C0175a extends u62 implements z52<View, i> {
                public static final C0175a n = new C0175a();

                C0175a() {
                    super(1, i.class, "<init>", "<init>(Landroid/view/View;)V", 0);
                }

                /* renamed from: k */
                public final i r(View view) {
                    v62.e(view, "p1");
                    return new i(view);
                }
            }

            static final class b extends w62 implements e62<i, Integer, qz1, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(a aVar) {
                    super(3);
                    this.f = aVar;
                }

                public final void a(i iVar, int i, qz1 qz1) {
                    v62.e(iVar, "$receiver");
                    v62.e(qz1, "show");
                    com.zunjae.anyme.a.b(this.f.f.f.T()).t(qz1.b()).K0(iVar.N());
                    iVar.P().setText(qz1.d());
                    iVar.M().setText(qz1.a());
                    rw1.b(iVar.O());
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((i) obj, ((Number) obj2).intValue(), (qz1) obj3);
                    return u22.a;
                }
            }

            static final class c extends w62 implements d62<r9<? extends qz1>, Integer, u22> {
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

                public final void a(r9<qz1> r9Var, int i) {
                    v62.e(r9Var, "$receiver");
                    this.f.f.h.a(r9Var.getItem());
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(e eVar) {
                super(1);
                this.f = eVar;
            }

            public final void a(com.afollestad.recyclical.a<qz1, i> aVar) {
                v62.e(aVar, "$receiver");
                aVar.c(C0175a.n, new b(this));
                aVar.d(new c(this));
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((com.afollestad.recyclical.a) obj);
                return u22.a;
            }
        }

        static final class b extends w62 implements z52<com.afollestad.recyclical.a<? extends qz1, b>, u22> {
            final /* synthetic */ e f;

            static final /* synthetic */ class a extends u62 implements z52<View, b> {
                public static final a n = new a();

                a() {
                    super(1, b.class, "<init>", "<init>(Landroid/view/View;)V", 0);
                }

                /* renamed from: k */
                public final b r(View view) {
                    v62.e(view, "p1");
                    return new b(view);
                }
            }

            /* renamed from: com.zunjae.anyme.features.browsers.native_streaming.NativeStreamingShowPicker$e$b$b  reason: collision with other inner class name */
            static final class C0176b extends w62 implements e62<b, Integer, qz1, u22> {
                public static final C0176b f = new C0176b();

                C0176b() {
                    super(3);
                }

                public final void a(b bVar, int i, qz1 qz1) {
                    v62.e(bVar, "$receiver");
                    v62.e(qz1, "show");
                    bVar.N().setText(qz1.d());
                    bVar.M().setText(qz1.a());
                    if (qz1.a() != null) {
                        String a = qz1.a();
                        v62.c(a);
                        if (!(a.length() == 0)) {
                            rw1.i(bVar.M());
                            return;
                        }
                    }
                    rw1.a(bVar.M());
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((b) obj, ((Number) obj2).intValue(), (qz1) obj3);
                    return u22.a;
                }
            }

            static final class c extends w62 implements d62<r9<? extends qz1>, Integer, u22> {
                final /* synthetic */ b f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                c(b bVar) {
                    super(2);
                    this.f = bVar;
                }

                public /* bridge */ /* synthetic */ Object G(Object obj, Object obj2) {
                    a((r9) obj, ((Number) obj2).intValue());
                    return u22.a;
                }

                public final void a(r9<qz1> r9Var, int i) {
                    v62.e(r9Var, "$receiver");
                    this.f.f.h.a(r9Var.getItem());
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(e eVar) {
                super(1);
                this.f = eVar;
            }

            public final void a(com.afollestad.recyclical.a<qz1, b> aVar) {
                v62.e(aVar, "$receiver");
                aVar.c(a.n, C0176b.f);
                aVar.d(new c(this));
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((com.afollestad.recyclical.a) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(NativeStreamingShowPicker nativeStreamingShowPicker, int i, d dVar) {
            super(1);
            this.f = nativeStreamingShowPicker;
            this.g = i;
            this.h = dVar;
        }

        public final void a(com.afollestad.recyclical.c cVar) {
            n9 n9Var;
            z52 z52;
            int i;
            Class<qz1> cls = qz1.class;
            v62.e(cVar, "$receiver");
            cVar.g(this.f.G);
            int i2 = e.a[this.f.z0().f().e().ordinal()];
            if (i2 == 1) {
                cVar.h(new GridLayoutManager(this.f.T(), this.g));
                i = C0278R$layout.cardview_anime_streaming_site_shows;
                z52 = new a(this);
                String name = cls.getName();
                v62.b(name, "IT::class.java.name");
                n9Var = new n9(cVar, name);
            } else if (i2 == 2) {
                cVar.h(new LinearLayoutManager(this.f.T()));
                i = C0278R$layout.listview_anime_streaming_site_shows;
                z52 = new b(this);
                String name2 = cls.getName();
                v62.b(name2, "IT::class.java.name");
                n9Var = new n9(cVar, name2);
            } else {
                return;
            }
            z52.r(n9Var);
            cVar.e(i, n9Var);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((com.afollestad.recyclical.c) obj);
            return u22.a;
        }
    }

    static final class f extends w62 implements z52<com.zunjae.vresult.a<? extends List<? extends qz1>>, u22> {
        final /* synthetic */ NativeStreamingShowPicker f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(NativeStreamingShowPicker nativeStreamingShowPicker) {
            super(1);
            this.f = nativeStreamingShowPicker;
        }

        public final void a(com.zunjae.vresult.a<? extends List<qz1>> aVar) {
            NativeStreamingShowPicker nativeStreamingShowPicker;
            qw1 qw1;
            String str;
            v62.e(aVar, "result");
            Snackbar y0 = this.f.y0();
            if (y0 != null) {
                y0.t();
            }
            if (aVar instanceof a.c) {
                if (NativeStreamingShowPicker.v0(this.f).isSlow()) {
                    nativeStreamingShowPicker = this.f;
                    str = "Please wait, " + NativeStreamingShowPicker.v0(this.f).getTitle() + " is known for being slow depending on the time of the day. AnYme can't do anything about this";
                    qw1 = qw1.Warning;
                } else {
                    nativeStreamingShowPicker = this.f;
                    str = "Please wait, this may take up to " + this.f.z0().f().f() + " seconds";
                    qw1 = qw1.Normal;
                }
                nativeStreamingShowPicker.D0(str, qw1);
            } else if (aVar instanceof a.e) {
                a9.a.a(this.f.G, (List) ((a.e) aVar).b(), (d62) null, (d62) null, 6, (Object) null);
            } else if (aVar instanceof a.d) {
                String g = this.f.z0().g();
                if (g == null) {
                    g = "?";
                }
                mw1.q(this.f, "Could not load any entries for " + g + ". Click on the search icon on the top right and search again for this Anime but keep the search query small", "Error");
            } else if (aVar instanceof a.b) {
                mw1.q(this.f, "It seems like " + NativeStreamingShowPicker.v0(this.f).getTitle() + " is offline, try again later. (Please wait 48 hours before reporting this issue)", "Welp");
            }
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((com.zunjae.vresult.a) obj);
            return u22.a;
        }
    }

    static final class g<T> implements u<com.zunjae.vresult.a<? extends List<? extends qz1>>> {
        final /* synthetic */ f a;

        g(f fVar) {
            this.a = fVar;
        }

        /* renamed from: b */
        public final void a(com.zunjae.vresult.a<? extends List<qz1>> aVar) {
            f fVar = this.a;
            v62.d(aVar, "result");
            fVar.a(aVar);
        }
    }

    private final void A0() {
        f.e eVar = new f.e(this);
        eVar.E(getString(C0283R$string.searchForShow));
        eVar.B(getString(C0283R$string.searchDescription));
        eVar.p(1);
        eVar.l(this.K, (CharSequence) null, new c(this));
        try {
            eVar.D();
        } catch (Exception e2) {
            uj2.d(e2);
        }
    }

    private final void B0() {
        int a2 = bw1.a.a(this, 3, 4, 5, 2);
        d dVar = new d(this);
        RecyclerView recyclerView = (RecyclerView) l0(C0275R$id.recyclerView);
        v62.d(recyclerView, "recyclerView");
        com.afollestad.recyclical.b.a(recyclerView, new e(this, a2, dVar));
    }

    private final void C0() {
        z0().h().g(this, new g(new f(this)));
    }

    /* access modifiers changed from: private */
    public final void D0(String str, qw1 qw1) {
        Snackbar snackbar = this.N;
        if (snackbar != null) {
            snackbar.t();
        }
        pw1 pw1 = pw1.a;
        View findViewById = findViewById(16908290);
        v62.d(findViewById, "findViewById(android.R.id.content)");
        Snackbar b2 = pw1.b((ViewGroup) findViewById, str, qw1);
        this.N = b2;
        v62.c(b2);
        b2.R();
    }

    public static final /* synthetic */ jz1 v0(NativeStreamingShowPicker nativeStreamingShowPicker) {
        jz1 jz1 = nativeStreamingShowPicker.E;
        if (jz1 != null) {
            return jz1;
        }
        v62.p("site");
        throw null;
    }

    /* access modifiers changed from: private */
    public final f z0() {
        return (f) this.D.getValue();
    }

    public View l0(int i) {
        if (this.O == null) {
            this.O = new HashMap();
        }
        View view = (View) this.O.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.O.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.K = getIntent().getStringExtra("searchQuery");
        this.L = getIntent().getIntExtra("malId", -1);
        this.F = getIntent().getIntExtra("nativeStreamingSiteIdentifier", 0);
        for (jz1 jz1 : jz1.values()) {
            if (jz1.getId() == this.F) {
                this.E = jz1;
                this.I = getIntent().getBooleanExtra("castOnStartup", false);
                this.J = getIntent().getBooleanExtra("downloadOnStartup", false);
                this.H = getIntent().getIntExtra("alreadyWatchedEpisodes", 0);
                z0().j(jz1.Companion.c(this.F));
                this.M = getIntent().getIntExtra("numberOfEpisodes", 0);
                jz1 jz12 = this.E;
                if (jz12 != null) {
                    String uniqueShowDestination = jz12.getUniqueShowDestination(this.L);
                    if (uniqueShowDestination != null) {
                        NativeStreamingEpisodePickerActivity.b bVar = NativeStreamingEpisodePickerActivity.V;
                        Context T = T();
                        int i = this.F;
                        String str = this.K;
                        if (str == null) {
                            jz1 jz13 = this.E;
                            if (jz13 != null) {
                                str = jz13.getTitle();
                            } else {
                                v62.p("site");
                                throw null;
                            }
                        }
                        Intent a2 = bVar.a(T, i, uniqueShowDestination, str, this.H, this.M, this.I, this.J, this.L);
                        a2.setFlags(33554432);
                        startActivity(a2);
                        finish();
                        return;
                    }
                    setContentView((int) C0278R$layout.activity_native_streaming);
                    Toolbar toolbar = (Toolbar) l0(C0275R$id.toolbar);
                    v62.d(toolbar, "toolbar");
                    jz1 jz14 = this.E;
                    if (jz14 != null) {
                        j0(toolbar, jz14.getTitle(), this.K, true);
                        B0();
                        C0();
                        return;
                    }
                    v62.p("site");
                    throw null;
                }
                v62.p("site");
                throw null;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        v62.e(menu, "menu");
        getMenuInflater().inflate(C0279R$menu.menu_istreamingsite, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        v62.e(menuItem, "item");
        if (menuItem.getItemId() != 2131296327) {
            return super.onOptionsItemSelected(menuItem);
        }
        A0();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        g gVar;
        f fVar;
        super.onResume();
        if (!com.zunjae.vresult.b.a(z0().h())) {
            if (this.K != null) {
                fVar = z0();
                String str = this.K;
                v62.c(str);
                gVar = new g.b(str);
            } else {
                fVar = z0();
                gVar = g.a.a;
            }
            fVar.i(gVar);
        }
    }

    public final Snackbar y0() {
        return this.N;
    }
}
