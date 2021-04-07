package com.zunjae.anyme.features.browsers.native_streaming;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import androidx.lifecycle.n;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.f;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;
import com.zunjae.anyme.C0272R$color;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.C0279R$menu;
import com.zunjae.anyme.C0280R$mipmap;
import com.zunjae.anyme.C0283R$string;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.abstracts.AbstractStreamingActivity;
import com.zunjae.vresult.a;
import defpackage.a9;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class NativeStreamingEpisodePickerActivity extends AbstractStreamingActivity {
    public static final b V = new b((r62) null);
    private final d22 J = g22.b(new a(this, (oh2) null, (o52) null));
    private List<String> K = f32.f();
    private jz1 L;
    private String M;
    /* access modifiers changed from: private */
    public int N;
    private int O;
    /* access modifiers changed from: private */
    public a9<nz1> P = b9.a();
    private String Q;
    /* access modifiers changed from: private */
    public int R;
    private final int S = 1200;
    /* access modifiers changed from: private */
    public Snackbar T;
    private HashMap U;

    public static final class a extends w62 implements o52<d> {
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

        /* JADX WARNING: type inference failed for: r0v1, types: [com.zunjae.anyme.features.browsers.native_streaming.d, androidx.lifecycle.a0] */
        /* renamed from: a */
        public final d invoke() {
            return lg2.b(this.f, f72.b(d.class), this.g, this.h);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(r62 r62) {
            this();
        }

        public final Intent a(Context context, int i, String str, String str2, int i2, int i3, boolean z, boolean z2, int i4) {
            v62.e(context, "context");
            v62.e(str, "slug");
            v62.e(str2, "seriesTitle");
            Intent intent = new Intent(context, NativeStreamingEpisodePickerActivity.class);
            intent.putExtra("nativeStreamingSiteIdentifier", i);
            intent.putExtra("slug", str);
            intent.putExtra("title", str2);
            intent.putExtra("alreadyWatchedEpisodes", i2);
            intent.putExtra("numberOfEpisodes", i3);
            intent.putExtra("castOnStartup", z);
            intent.putExtra("downloadOnStartup", z2);
            intent.putExtra("malId", i4);
            return intent;
        }
    }

    static final class c implements f.k {
        final /* synthetic */ NativeStreamingEpisodePickerActivity a;
        final /* synthetic */ List b;
        final /* synthetic */ nz1 c;

        c(NativeStreamingEpisodePickerActivity nativeStreamingEpisodePickerActivity, List list, nz1 nz1) {
            this.a = nativeStreamingEpisodePickerActivity;
            this.b = list;
            this.c = nz1;
        }

        public final boolean a(com.afollestad.materialdialogs.f fVar, View view, int i, CharSequence charSequence) {
            this.a.U0((pz1) this.b.get(i), this.c.a());
            return true;
        }
    }

    static final class d implements View.OnClickListener {
        final /* synthetic */ String e;
        final /* synthetic */ NativeStreamingEpisodePickerActivity f;

        d(String str, NativeStreamingEpisodePickerActivity nativeStreamingEpisodePickerActivity) {
            this.e = str;
            this.f = nativeStreamingEpisodePickerActivity;
        }

        public final void onClick(View view) {
            this.f.h0(this.e);
        }
    }

    static final class e extends w62 implements z52<oz1, u22> {
        final /* synthetic */ NativeStreamingEpisodePickerActivity f;
        final /* synthetic */ int g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(NativeStreamingEpisodePickerActivity nativeStreamingEpisodePickerActivity, int i) {
            super(1);
            this.f = nativeStreamingEpisodePickerActivity;
            this.g = i;
        }

        public final void a(oz1 oz1) {
            v62.e(oz1, "host");
            this.f.T0(oz1.a(), this.g);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((oz1) obj);
            return u22.a;
        }
    }

    static final class f implements f.k {
        final /* synthetic */ List a;
        final /* synthetic */ e b;

        f(List list, e eVar) {
            this.a = list;
            this.b = eVar;
        }

        public final boolean a(com.afollestad.materialdialogs.f fVar, View view, int i, CharSequence charSequence) {
            this.b.a((oz1) this.a.get(i));
            fVar.dismiss();
            return true;
        }
    }

    static final class g extends w62 implements z52<ve2<NativeStreamingEpisodePickerActivity>, u22> {
        final /* synthetic */ NativeStreamingEpisodePickerActivity f;
        final /* synthetic */ pz1 g;
        final /* synthetic */ int h;

        static final class a extends w62 implements z52<NativeStreamingEpisodePickerActivity, u22> {
            final /* synthetic */ g f;
            final /* synthetic */ List g;

            /* renamed from: com.zunjae.anyme.features.browsers.native_streaming.NativeStreamingEpisodePickerActivity$g$a$a  reason: collision with other inner class name */
            static final class C0173a extends w62 implements o52<u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0173a(a aVar) {
                    super(0);
                    this.f = aVar;
                }

                public final void a() {
                    g gVar = this.f.f;
                    gVar.f.U0(gVar.g, gVar.h);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    a();
                    return u22.a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(g gVar, List list) {
                super(1);
                this.f = gVar;
                this.g = list;
            }

            public final void a(NativeStreamingEpisodePickerActivity nativeStreamingEpisodePickerActivity) {
                v62.e(nativeStreamingEpisodePickerActivity, "it");
                Snackbar E0 = this.f.f.T;
                if (E0 != null) {
                    E0.t();
                }
                List list = this.g;
                if (list == null || list.isEmpty()) {
                    mw1.b(this.f.f, "Welp", "Could not load qualities for the selected provider", "retry", new C0173a(this)).show();
                } else if (this.g.size() == 1) {
                    this.f.f.T0(((oz1) n32.z(this.g)).a(), this.f.h);
                } else {
                    g gVar = this.f;
                    gVar.f.S0(this.g, gVar.h);
                }
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((NativeStreamingEpisodePickerActivity) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(NativeStreamingEpisodePickerActivity nativeStreamingEpisodePickerActivity, pz1 pz1, int i) {
            super(1);
            this.f = nativeStreamingEpisodePickerActivity;
            this.g = pz1;
            this.h = i;
        }

        public final void a(ve2<NativeStreamingEpisodePickerActivity> ve2) {
            List<oz1> list;
            v62.e(ve2, "$receiver");
            try {
                list = this.f.Q0().i().c(this.g);
            } catch (Exception e) {
                uj2.d(e);
                list = null;
            }
            we2.a(ve2, new a(this, list));
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((ve2) obj);
            return u22.a;
        }
    }

    static final class h<T> implements u<com.zunjae.vresult.a<? extends List<? extends lz1>>> {
        final /* synthetic */ NativeStreamingEpisodePickerActivity a;

        static final class a implements f.n {
            public static final a a = new a();

            a() {
            }

            public final void a(com.afollestad.materialdialogs.f fVar, com.afollestad.materialdialogs.b bVar) {
                v62.e(fVar, "<anonymous parameter 0>");
                v62.e(bVar, "<anonymous parameter 1>");
            }
        }

        static final class b extends w62 implements o52<u22> {
            final /* synthetic */ h f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(h hVar) {
                super(0);
                this.f = hVar;
            }

            public final void a() {
                this.f.a.Q0().l();
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return u22.a;
            }
        }

        h(NativeStreamingEpisodePickerActivity nativeStreamingEpisodePickerActivity) {
            this.a = nativeStreamingEpisodePickerActivity;
        }

        /* renamed from: b */
        public final void a(com.zunjae.vresult.a<? extends List<lz1>> aVar) {
            Snackbar E0 = this.a.T;
            if (E0 != null) {
                E0.t();
            }
            if (aVar instanceof a.e) {
                this.a.Y0((List) ((a.e) aVar).b());
                ((RecyclerView) this.a.v0(C0275R$id.recyclerView)).r1(this.a.R);
            } else if (aVar instanceof a.c) {
                NativeStreamingEpisodePickerActivity nativeStreamingEpisodePickerActivity = this.a;
                nativeStreamingEpisodePickerActivity.c1("Please wait, this may take up to " + this.a.Q0().i().f() + " seconds");
            } else if (aVar instanceof a.d) {
                NativeStreamingEpisodePickerActivity nativeStreamingEpisodePickerActivity2 = this.a;
                f.e c = mw1.c(nativeStreamingEpisodePickerActivity2, "Seems like " + NativeStreamingEpisodePickerActivity.C0(this.a).getTitle() + " doesn't have episodes for this show. Please use another source", "Welp");
                c.A(a.a);
                c.D();
            } else if (aVar instanceof a.b) {
                RecyclerView recyclerView = (RecyclerView) this.a.v0(C0275R$id.recyclerView);
                v62.d(recyclerView, "recyclerView");
                rw1.c(recyclerView, "It seems like " + NativeStreamingEpisodePickerActivity.C0(this.a).getTitle() + " is offline or your phone is unable to connect to it.", "Retry", new b(this));
            }
        }
    }

    public static final class i implements AdapterView.OnItemSelectedListener {
        final /* synthetic */ NativeStreamingEpisodePickerActivity e;
        final /* synthetic */ List f;

        i(NativeStreamingEpisodePickerActivity nativeStreamingEpisodePickerActivity, List list) {
            this.e = nativeStreamingEpisodePickerActivity;
            this.f = list;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            lz1 lz1 = (lz1) this.f.get(i);
            List<nz1> a = lz1.a();
            if (a != null) {
                a9.a.a(this.e.P, a, (d62) null, (d62) null, 6, (Object) null);
                this.e.Q0().n(lz1);
                NativeStreamingEpisodePickerActivity.C0(this.e).saveSeasonIdForSlug(this.e.N, lz1.b(), NativeStreamingEpisodePickerActivity.D0(this.e));
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    static final class j<T> implements u<com.zunjae.vresult.a<? extends c>> {
        final /* synthetic */ NativeStreamingEpisodePickerActivity a;

        j(NativeStreamingEpisodePickerActivity nativeStreamingEpisodePickerActivity) {
            this.a = nativeStreamingEpisodePickerActivity;
        }

        /* renamed from: b */
        public final void a(com.zunjae.vresult.a<c> aVar) {
            AbstractActivity x0;
            String str;
            Snackbar E0 = this.a.T;
            if (E0 != null) {
                E0.t();
            }
            if (aVar instanceof a.e) {
                c cVar = (c) ((a.e) aVar).b();
                this.a.S0(cVar.b(), cVar.a().a());
            } else {
                if (aVar instanceof a.d) {
                    x0 = this.a.Q();
                    str = "Seems like this episode has no videos (yet).";
                } else if (aVar instanceof a.b) {
                    x0 = this.a.Q();
                    str = "Could not load any hosts for this episode. Try again later";
                } else if (aVar instanceof a.c) {
                    NativeStreamingEpisodePickerActivity nativeStreamingEpisodePickerActivity = this.a;
                    pw1 pw1 = pw1.a;
                    View findViewById = nativeStreamingEpisodePickerActivity.findViewById(16908290);
                    v62.d(findViewById, "findViewById(android.R.id.content)");
                    nativeStreamingEpisodePickerActivity.T = pw1.c(pw1, (ViewGroup) findViewById, "Please wait, this may take up to 60 seconds", (qw1) null, 4, (Object) null);
                    Snackbar E02 = this.a.T;
                    if (E02 != null) {
                        E02.R();
                        return;
                    }
                    return;
                } else {
                    return;
                }
                mw1.q(x0, str, "Sorry!");
            }
            this.a.Q0().j().k(a.C0217a.a);
        }
    }

    static final class k extends w62 implements z52<com.afollestad.recyclical.c, u22> {
        final /* synthetic */ NativeStreamingEpisodePickerActivity f;
        final /* synthetic */ int g;
        final /* synthetic */ int h;
        final /* synthetic */ int i;

        static final class a extends w62 implements z52<com.afollestad.recyclical.a<? extends nz1, a>, u22> {
            final /* synthetic */ k f;

            /* renamed from: com.zunjae.anyme.features.browsers.native_streaming.NativeStreamingEpisodePickerActivity$k$a$a  reason: collision with other inner class name */
            static final /* synthetic */ class C0174a extends u62 implements z52<View, a> {
                public static final C0174a n = new C0174a();

                C0174a() {
                    super(1, a.class, "<init>", "<init>(Landroid/view/View;)V", 0);
                }

                /* renamed from: k */
                public final a r(View view) {
                    v62.e(view, "p1");
                    return new a(view);
                }
            }

            static final class b extends w62 implements e62<a, Integer, nz1, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(a aVar) {
                    super(3);
                    this.f = aVar;
                }

                public final void a(a aVar, int i, nz1 nz1) {
                    TextView M;
                    int i2;
                    v62.e(aVar, "$receiver");
                    v62.e(nz1, "episode");
                    aVar.M().setText(nz1.c());
                    if (!v62.a(nz1.c(), "?") && nz1.a() <= this.f.f.f.R) {
                        M = aVar.M();
                        i2 = this.f.f.i;
                    } else {
                        M = aVar.M();
                        i2 = this.f.f.h;
                    }
                    M.setBackgroundColor(i2);
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((a) obj, ((Number) obj2).intValue(), (nz1) obj3);
                    return u22.a;
                }
            }

            static final class c extends w62 implements d62<r9<? extends nz1>, Integer, u22> {
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

                public final void a(r9<nz1> r9Var, int i) {
                    v62.e(r9Var, "$receiver");
                    if (r9Var.getItem().a() > this.f.f.f.R) {
                        this.f.f.f.R = r9Var.getItem().a();
                        this.f.f.f.P.f();
                    }
                    NativeStreamingEpisodePickerActivity nativeStreamingEpisodePickerActivity = this.f.f.f;
                    nativeStreamingEpisodePickerActivity.W0(nativeStreamingEpisodePickerActivity.R);
                    if (this.f.f.f.Q0().i().h()) {
                        this.f.f.f.Q0().k(r9Var.getItem());
                    } else {
                        this.f.f.f.P0(r9Var.getItem());
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(k kVar) {
                super(1);
                this.f = kVar;
            }

            public final void a(com.afollestad.recyclical.a<nz1, a> aVar) {
                v62.e(aVar, "$receiver");
                aVar.c(C0174a.n, new b(this));
                aVar.d(new c(this));
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((com.afollestad.recyclical.a) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(NativeStreamingEpisodePickerActivity nativeStreamingEpisodePickerActivity, int i2, int i3, int i4) {
            super(1);
            this.f = nativeStreamingEpisodePickerActivity;
            this.g = i2;
            this.h = i3;
            this.i = i4;
        }

        public final void a(com.afollestad.recyclical.c cVar) {
            v62.e(cVar, "$receiver");
            cVar.g(this.f.P);
            cVar.h(new GridLayoutManager(this.f.T(), this.g));
            a aVar = new a(this);
            String name = nz1.class.getName();
            v62.b(name, "IT::class.java.name");
            n9 n9Var = new n9(cVar, name);
            aVar.r(n9Var);
            cVar.e(C0278R$layout.cardview_native_streaming_episode_picker, n9Var);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((com.afollestad.recyclical.c) obj);
            return u22.a;
        }
    }

    static final class l implements Runnable {
        final /* synthetic */ NativeStreamingEpisodePickerActivity e;

        l(NativeStreamingEpisodePickerActivity nativeStreamingEpisodePickerActivity) {
            this.e = nativeStreamingEpisodePickerActivity;
        }

        public final void run() {
            TabLayout.g w;
            TabLayout.g w2 = ((TabLayout) this.e.v0(C0275R$id.pageNumberTabLayout)).w(this.e.R0());
            if (w2 != null) {
                w2.l();
            }
            Integer g = this.e.Q0().g();
            if (g != null && (w = ((TabLayout) this.e.v0(C0275R$id.pageNumberTabLayout)).w(g.intValue())) != null) {
                w.l();
            }
        }
    }

    public static final class m implements TabLayout.d {
        final /* synthetic */ NativeStreamingEpisodePickerActivity a;

        m(NativeStreamingEpisodePickerActivity nativeStreamingEpisodePickerActivity) {
            this.a = nativeStreamingEpisodePickerActivity;
        }

        public void a(TabLayout.g gVar) {
        }

        public void b(TabLayout.g gVar) {
            this.a.Q0().o(gVar != null ? Integer.valueOf(gVar.f()) : null);
            d F0 = this.a.Q0();
            String D0 = NativeStreamingEpisodePickerActivity.D0(this.a);
            v62.c(gVar);
            Object h = gVar.h();
            if (h != null) {
                F0.m(D0, ((Integer) h).intValue());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }

        public void c(TabLayout.g gVar) {
        }
    }

    public static final /* synthetic */ jz1 C0(NativeStreamingEpisodePickerActivity nativeStreamingEpisodePickerActivity) {
        jz1 jz1 = nativeStreamingEpisodePickerActivity.L;
        if (jz1 != null) {
            return jz1;
        }
        v62.p("nativeStreamingSite");
        throw null;
    }

    public static final /* synthetic */ String D0(NativeStreamingEpisodePickerActivity nativeStreamingEpisodePickerActivity) {
        String str = nativeStreamingEpisodePickerActivity.M;
        if (str != null) {
            return str;
        }
        v62.p("slug");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void P0(nz1 nz1) {
        List<pz1> e2 = nz1.e();
        if (e2 == null || e2.isEmpty()) {
            mw1.q(this, "Seems like this show has no providers :/", "Welp");
            return;
        }
        f.e eVar = new f.e(this);
        eVar.E("Select a provider");
        eVar.k(C0280R$mipmap.newappicon);
        eVar.q(e2);
        eVar.v(90);
        eVar.i("EP " + nz1.c() + ' ' + nz1.f());
        eVar.u(-1, new c(this, e2, nz1));
        try {
            eVar.D();
        } catch (Exception e3) {
            uj2.d(e3);
        }
    }

    /* access modifiers changed from: private */
    public final d Q0() {
        return (d) this.J.getValue();
    }

    /* access modifiers changed from: private */
    public final int R0() {
        Integer a2 = Q0().i().a();
        if (a2 == null) {
            return 1;
        }
        int intValue = a2.intValue();
        int i2 = this.R;
        int i3 = i2 + 1;
        if (i3 > intValue && i2 > 0) {
            return (int) ((float) Math.floor((double) ((((float) i3) * 1.0f) / ((float) intValue))));
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public final void S0(List<oz1> list, int i2) {
        e eVar = new e(this, i2);
        if (list.isEmpty()) {
            mw1.c(this, "Seems like this episode doesn't have any streams available. Please try again in a few minutes", "warning").D();
        } else if (list.size() == 1) {
            eVar.a(list.get(0));
        } else {
            f.e eVar2 = new f.e(this);
            eVar2.E("Select a quality");
            eVar2.k(C0280R$mipmap.newappicon);
            eVar2.i("Pick a source that works for you!");
            eVar2.q(list);
            eVar2.v(90);
            eVar2.u(-1, new f(list, eVar));
            try {
                eVar2.D();
            } catch (Exception e2) {
                uj2.d(e2);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void T0(String str, int i2) {
        if (!n0() || xr1.a.m(str)) {
            xr1 xr1 = xr1.a;
            String str2 = this.Q;
            if (str2 != null) {
                String b2 = xr1.b(i2, str2);
                List<String> list = this.K;
                boolean z = false;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String str3 = (String) it.next();
                        if (str != null) {
                            String lowerCase = str.toLowerCase();
                            v62.d(lowerCase, "(this as java.lang.String).toLowerCase()");
                            if (str3 != null) {
                                String lowerCase2 = str3.toLowerCase();
                                v62.d(lowerCase2, "(this as java.lang.String).toLowerCase()");
                                if (g92.v(lowerCase, lowerCase2, false, 2, (Object) null)) {
                                    z = true;
                                    break;
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                }
                if (z || Q0().i().b() == hz1.BuiltinBrowser) {
                    com.zunjae.anyme.features.browsers.abstracts.b a2 = com.zunjae.anyme.features.browsers.abstracts.b.r0.a(new com.zunjae.anyme.features.browsers.abstracts.a(str, i2, b2));
                    s j2 = q().j();
                    v62.d(j2, "supportFragmentManager.beginTransaction()");
                    Fragment Z = q().Z("VideoResolverDialogTag");
                    if (Z != null) {
                        j2.p(Z);
                    }
                    j2.g((String) null);
                    a2.V1(j2, "VideoResolverDialogTag");
                    return;
                }
                d1(str, i2, b2);
                return;
            }
            v62.p("seriesTitle");
            throw null;
        }
        AbstractActivity Q2 = Q();
        String string = getString(C0283R$string.useProperVideoSource);
        v62.d(string, "getString(R.string.useProperVideoSource)");
        mw1.q(Q2, string, "Sorry!");
    }

    /* access modifiers changed from: private */
    public final void U0(pz1 pz1, int i2) {
        pw1 pw1 = pw1.a;
        View findViewById = findViewById(16908290);
        v62.d(findViewById, "findViewById(android.R.id.content)");
        Snackbar c2 = pw1.c(pw1, (ViewGroup) findViewById, "Please wait, this may take up to 60 seconds", (qw1) null, 4, (Object) null);
        this.T = c2;
        if (c2 != null) {
            c2.R();
        }
        we2.c(this, (z52) null, new g(this, pz1, i2), 1, (Object) null);
    }

    private final void V0() {
        List<nz1> a2;
        lz1 f2 = Q0().f();
        if (f2 != null && (a2 = f2.a()) != null) {
            Iterator<nz1> it = a2.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (it.next().a() == this.R) {
                    break;
                }
                i2++;
            }
            ((RecyclerView) v0(C0275R$id.recyclerView)).j1(Integer.valueOf(i2).intValue());
        }
    }

    /* access modifiers changed from: private */
    public final void W0(int i2) {
        Intent intent = new Intent();
        intent.putExtra("newEpisodeNumber", i2);
        setResult(lv1.f.c(), intent);
    }

    private final void X0() {
        Q0().h().g(this, new h(this));
    }

    /* access modifiers changed from: private */
    public final void Y0(List<lz1> list) {
        int i2;
        List<nz1> a2;
        if (list.size() <= 1) {
            Spinner spinner = (Spinner) v0(C0275R$id.seasonPicker);
            v62.d(spinner, "seasonPicker");
            rw1.a(spinner);
        } else {
            Spinner spinner2 = (Spinner) v0(C0275R$id.seasonPicker);
            v62.d(spinner2, "seasonPicker");
            rw1.i(spinner2);
        }
        jz1 jz1 = this.L;
        if (jz1 != null) {
            int i3 = this.N;
            String str = this.M;
            if (str != null) {
                String seasonIdForSlug = jz1.getSeasonIdForSlug(i3, str);
                int i4 = 0;
                if (seasonIdForSlug != null) {
                    Iterator<lz1> it = list.iterator();
                    i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                            break;
                        } else if (v62.a(it.next().b(), seasonIdForSlug)) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                } else {
                    i2 = 0;
                }
                if (i2 >= 0) {
                    i4 = i2;
                }
                Q0().n(list.get(i4));
                ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367049, list);
                Spinner spinner3 = (Spinner) v0(C0275R$id.seasonPicker);
                v62.d(spinner3, "seasonPicker");
                spinner3.setAdapter(arrayAdapter);
                Spinner spinner4 = (Spinner) v0(C0275R$id.seasonPicker);
                v62.d(spinner4, "seasonPicker");
                spinner4.setPrompt("Pick a season");
                ((Spinner) v0(C0275R$id.seasonPicker)).setSelection(i4);
                Spinner spinner5 = (Spinner) v0(C0275R$id.seasonPicker);
                v62.d(spinner5, "seasonPicker");
                spinner5.setOnItemSelectedListener(new i(this, list));
                RecyclerView recyclerView = (RecyclerView) v0(C0275R$id.recyclerView);
                v62.d(recyclerView, "recyclerView");
                rw1.g(recyclerView);
                lz1 f2 = Q0().f();
                if (f2 == null || (a2 = f2.a()) == null) {
                    this.P.clear();
                    return;
                }
                a9.a.a(this.P, a2, (d62) null, (d62) null, 6, (Object) null);
                V0();
                return;
            }
            v62.p("slug");
            throw null;
        }
        v62.p("nativeStreamingSite");
        throw null;
    }

    private final void Z0() {
        Q0().j().g(this, new j(this));
    }

    private final void a1() {
        int a2 = this.O <= 12 ? bw1.a.a(this, 3, 4, 5, 2) : bw1.a.a(this, 4, 5, 6, 2);
        int d2 = androidx.core.content.a.d(T(), 2131099728);
        int d3 = androidx.core.content.a.d(T(), C0272R$color.card_background);
        RecyclerView recyclerView = (RecyclerView) v0(C0275R$id.recyclerView);
        v62.d(recyclerView, "recyclerView");
        com.afollestad.recyclical.b.a(recyclerView, new k(this, a2, d3, d2));
    }

    private final void b1() {
        if (this.O == 0) {
            this.O = this.S;
        }
        Integer a2 = Q0().i().a();
        if (a2 != null) {
            int intValue = a2.intValue();
            if (this.O < intValue) {
                TabLayout tabLayout = (TabLayout) v0(C0275R$id.pageNumberTabLayout);
                v62.d(tabLayout, "pageNumberTabLayout");
                rw1.a(tabLayout);
                return;
            }
            TabLayout tabLayout2 = (TabLayout) v0(C0275R$id.pageNumberTabLayout);
            v62.d(tabLayout2, "pageNumberTabLayout");
            rw1.i(tabLayout2);
            int ceil = (int) ((float) Math.ceil((double) ((((float) (intValue > 0 ? this.O : this.S)) * 1.0f) / ((float) intValue))));
            int i2 = 0;
            while (i2 < ceil) {
                TabLayout.g x = ((TabLayout) v0(C0275R$id.pageNumberTabLayout)).x();
                StringBuilder sb = new StringBuilder();
                sb.append("Page ");
                int i3 = i2 + 1;
                sb.append(i3);
                x.s(sb.toString());
                x.r(Integer.valueOf(i2));
                v62.d(x, "pageNumberTabLayout.newT…      tag = index\n      }");
                ((TabLayout) v0(C0275R$id.pageNumberTabLayout)).d(x);
                i2 = i3;
            }
            ((TabLayout) v0(C0275R$id.pageNumberTabLayout)).postDelayed(new l(this), 16);
            ((TabLayout) v0(C0275R$id.pageNumberTabLayout)).c(new m(this));
            return;
        }
        TabLayout tabLayout3 = (TabLayout) v0(C0275R$id.pageNumberTabLayout);
        v62.d(tabLayout3, "pageNumberTabLayout");
        rw1.a(tabLayout3);
    }

    /* access modifiers changed from: private */
    public final void c1(String str) {
        Snackbar snackbar = this.T;
        if (snackbar != null) {
            snackbar.t();
        }
        pw1 pw1 = pw1.a;
        View findViewById = findViewById(16908290);
        v62.d(findViewById, "findViewById(android.R.id.content)");
        Snackbar c2 = pw1.c(pw1, (ViewGroup) findViewById, str, (qw1) null, 4, (Object) null);
        this.T = c2;
        v62.c(c2);
        c2.R();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: com.zunjae.downloader.i$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: com.zunjae.downloader.i$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: com.zunjae.downloader.i$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.zunjae.downloader.i$d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void d1(java.lang.String r12, int r13, java.lang.String r14) {
        /*
            r11 = this;
            boolean r0 = r11.n0()
            r1 = 0
            java.lang.String r2 = "seriesTitle"
            if (r0 == 0) goto L_0x0023
            com.zunjae.downloader.i$d r14 = new com.zunjae.downloader.i$d
            int r4 = r11.N
            java.lang.String r5 = r11.Q
            if (r5 == 0) goto L_0x001f
            r8 = 0
            r9 = 16
            r10 = 0
            r3 = r14
            r6 = r13
            r7 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
        L_0x001b:
            r11.q0(r14)
            goto L_0x003e
        L_0x001f:
            defpackage.v62.p(r2)
            throw r1
        L_0x0023:
            boolean r0 = r11.l0()
            if (r0 == 0) goto L_0x0032
            com.zunjae.downloader.i$b r0 = new com.zunjae.downloader.i$b
            r0.<init>(r12, r14, r13)
            r11.q0(r0)
            goto L_0x003e
        L_0x0032:
            com.zunjae.downloader.i$a r14 = new com.zunjae.downloader.i$a
            int r0 = r11.N
            java.lang.String r3 = r11.Q
            if (r3 == 0) goto L_0x003f
            r14.<init>(r0, r3, r12, r13)
            goto L_0x001b
        L_0x003e:
            return
        L_0x003f:
            defpackage.v62.p(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.features.browsers.native_streaming.NativeStreamingEpisodePickerActivity.d1(java.lang.String, int, java.lang.String):void");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0278R$layout.activity_episodes);
        this.K = qv1.a.e();
        int intExtra = getIntent().getIntExtra("nativeStreamingSiteIdentifier", 0);
        Q0().p(jz1.Companion.c(intExtra));
        jz1 d2 = jz1.Companion.d(intExtra);
        v62.c(d2);
        this.L = d2;
        s0(getIntent().getBooleanExtra("downloadOnStartup", false));
        r0(getIntent().getBooleanExtra("castOnStartup", false));
        String stringExtra = getIntent().getStringExtra("title");
        v62.c(stringExtra);
        this.Q = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("slug");
        v62.c(stringExtra2);
        this.M = stringExtra2;
        int i2 = -1;
        this.N = getIntent().getIntExtra("malId", -1);
        this.O = getIntent().getIntExtra("numberOfEpisodes", 0);
        if (bundle != null) {
            i2 = bundle.getInt("lastWatchedEpisode");
        }
        this.R = i2;
        int intExtra2 = getIntent().getIntExtra("alreadyWatchedEpisodes", 0);
        if (intExtra2 > this.R) {
            this.R = intExtra2;
        }
        if (bundle != null) {
            s0(bundle.getBoolean("downloaderMode"));
        }
        if (bundle != null) {
            r0(bundle.getBoolean("castMode"));
        }
        X0();
        Z0();
        b1();
        W0(this.R);
        Toolbar toolbar = (Toolbar) v0(C0275R$id.toolbar);
        v62.d(toolbar, "toolbar");
        String str = this.Q;
        if (str != null) {
            AbstractActivity.k0(this, toolbar, str, (String) null, true, 4, (Object) null);
            String j2 = Q0().i().j();
            if (j2 != null) {
                TextView textView = (TextView) v0(C0275R$id.communityBuilt);
                v62.d(textView, "communityBuilt");
                textView.setText(Q0().i().k());
                TextView textView2 = (TextView) v0(C0275R$id.communityBuilt);
                v62.d(textView2, "communityBuilt");
                rw1.i(textView2);
                ((TextView) v0(C0275R$id.communityBuilt)).setOnClickListener(new d(j2, this));
            }
            Spinner spinner = (Spinner) v0(C0275R$id.seasonPicker);
            v62.d(spinner, "seasonPicker");
            rw1.a(spinner);
            a1();
            e0(1);
            return;
        }
        v62.p("seriesTitle");
        throw null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        v62.e(menu, "menu");
        getMenuInflater().inflate(C0279R$menu.menu_masteranime, menu);
        dw1.a.a(menu, this, n0(), l0());
        if (Q0().i().n()) {
            return true;
        }
        MenuItem findItem = menu.findItem(C0275R$id.browser_downloader);
        v62.d(findItem, "menu.findItem(R.id.browser_downloader)");
        findItem.setVisible(false);
        MenuItem findItem2 = menu.findItem(C0275R$id.browser_cast);
        v62.d(findItem2, "menu.findItem(R.id.browser_cast)");
        findItem2.setVisible(false);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        v62.e(menuItem, "item");
        switch (menuItem.getItemId()) {
            case C0275R$id.browser_cast:
                t0();
                break;
            case C0275R$id.browser_downloader:
                u0();
                break;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        v62.e(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putInt("lastWatchedEpisode", this.R);
        bundle.putBoolean("castMode", l0());
        bundle.putBoolean("downloaderMode", n0());
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        cw1.k.a().j(this);
        if (!com.zunjae.vresult.b.a(Q0().h())) {
            d Q0 = Q0();
            String str = this.M;
            if (str != null) {
                Q0.m(str, R0());
            } else {
                v62.p("slug");
                throw null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        cw1.k.a().l(this);
    }

    @vq1
    public final void onVideoFound(com.zunjae.anyme.features.browsers.abstracts.a aVar) {
        v62.e(aVar, "bus");
        d1(aVar.b(), aVar.a(), aVar.c());
    }

    public View v0(int i2) {
        if (this.U == null) {
            this.U = new HashMap();
        }
        View view = (View) this.U.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.U.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }
}
