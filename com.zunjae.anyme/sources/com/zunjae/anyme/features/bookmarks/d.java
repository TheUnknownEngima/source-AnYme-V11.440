package com.zunjae.anyme.features.bookmarks;

import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.e0;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.f;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.C0279R$menu;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.features.bookmarks.BookmarkEntriesActivity;
import com.zunjae.vresult.a;
import defpackage.a9;
import java.util.HashMap;
import java.util.List;
import ru.dimorinny.floatingtextbutton.FloatingTextButton;

public final class d extends rs1 {
    private final d22 c0 = g22.b(new c(this, (oh2) null, new b(this), (o52) null));
    private final d22 d0 = g22.b(new a(this, (oh2) null, (o52) null));
    /* access modifiers changed from: private */
    public a9<b> e0 = b9.a();
    private HashMap f0;

    public static final class a extends w62 implements o52<com.zunjae.anyme.features.kanon.e> {
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

        /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, com.zunjae.anyme.features.kanon.e] */
        public final com.zunjae.anyme.features.kanon.e invoke() {
            ComponentCallbacks componentCallbacks = this.f;
            return hg2.a(componentCallbacks).c().e(f72.b(com.zunjae.anyme.features.kanon.e.class), this.g, this.h);
        }
    }

    public static final class b extends w62 implements o52<e0> {
        final /* synthetic */ Fragment f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
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

    public static final class c extends w62 implements o52<qu1> {
        final /* synthetic */ Fragment f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;
        final /* synthetic */ o52 i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment, oh2 oh2, o52 o52, o52 o522) {
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

    /* renamed from: com.zunjae.anyme.features.bookmarks.d$d  reason: collision with other inner class name */
    public static final class C0169d implements ci2<b> {
        final /* synthetic */ d a;
        final /* synthetic */ String b;

        C0169d(d dVar, String str) {
            this.a = dVar;
            this.b = str;
        }

        public void a(ai2<b> ai2, Throwable th) {
            v62.e(ai2, "call");
            v62.e(th, "t");
            FragmentActivity n = this.a.n();
            if (n != null) {
                Toast makeText = Toast.makeText(n, "Could not create this bookmark...", 0);
                makeText.show();
                v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
            }
        }

        public void b(ai2<b> ai2, qi2<b> qi2) {
            Toast toast;
            v62.e(ai2, "call");
            v62.e(qi2, "response");
            b a2 = qi2.a();
            if (a2 != null) {
                a2.d(this.b);
                a2.e(0);
                qu1 T1 = this.a.Y1();
                v62.d(a2, "createdBookmark");
                T1.g(a2);
                FragmentActivity n = this.a.n();
                if (n != null) {
                    toast = Toast.makeText(n, "Bookmark named " + this.b + " created", 0);
                    toast.show();
                    v62.b(toast, "Toast\n        .makeText(…         show()\n        }");
                } else {
                    toast = null;
                }
                if (toast != null) {
                    return;
                }
            }
            FragmentActivity n2 = this.a.n();
            if (n2 != null) {
                Toast makeText = Toast.makeText(n2, "Could not create this bookmark... error code = " + qi2.b(), 0);
                makeText.show();
                v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
            }
        }
    }

    static final class e extends w62 implements z52<com.afollestad.recyclical.c, u22> {
        final /* synthetic */ d f;
        final /* synthetic */ int g;

        static final class a extends w62 implements z52<com.afollestad.recyclical.a<? extends b, g>, u22> {
            final /* synthetic */ e f;

            /* renamed from: com.zunjae.anyme.features.bookmarks.d$e$a$a  reason: collision with other inner class name */
            static final /* synthetic */ class C0170a extends u62 implements z52<View, g> {
                public static final C0170a n = new C0170a();

                C0170a() {
                    super(1, g.class, "<init>", "<init>(Landroid/view/View;)V", 0);
                }

                /* renamed from: k */
                public final g r(View view) {
                    v62.e(view, "p1");
                    return new g(view);
                }
            }

            static final class b extends w62 implements e62<g, Integer, b, u22> {
                public static final b f = new b();

                b() {
                    super(3);
                }

                public final void a(g gVar, int i, b bVar) {
                    v62.e(gVar, "$receiver");
                    v62.e(bVar, "bookmark");
                    gVar.N().setText(bVar.a());
                    TextView M = gVar.M();
                    M.setText(bVar.b() + " shows");
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((g) obj, ((Number) obj2).intValue(), (b) obj3);
                    return u22.a;
                }
            }

            static final class c extends w62 implements d62<r9<? extends b>, Integer, u22> {
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

                public final void a(r9<b> r9Var, int i) {
                    v62.e(r9Var, "$receiver");
                    AbstractActivity U1 = this.f.f.f.K1();
                    if (U1 != null) {
                        BookmarkEntriesActivity.c cVar = BookmarkEntriesActivity.J;
                        AbstractActivity U12 = this.f.f.f.K1();
                        v62.c(U12);
                        U1.startActivityForResult(cVar.b(U12, r9Var.getItem().c(), r9Var.getItem().a()), 2);
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(e eVar) {
                super(1);
                this.f = eVar;
            }

            public final void a(com.afollestad.recyclical.a<b, g> aVar) {
                v62.e(aVar, "$receiver");
                aVar.c(C0170a.n, b.f);
                aVar.d(new c(this));
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((com.afollestad.recyclical.a) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(d dVar, int i) {
            super(1);
            this.f = dVar;
            this.g = i;
        }

        public final void a(com.afollestad.recyclical.c cVar) {
            v62.e(cVar, "$receiver");
            cVar.g(this.f.e0);
            cVar.h(new GridLayoutManager(this.f.u(), this.g));
            a aVar = new a(this);
            String name = b.class.getName();
            v62.b(name, "IT::class.java.name");
            n9 n9Var = new n9(cVar, name);
            aVar.r(n9Var);
            cVar.e(C0278R$layout.cardview_bookmarks, n9Var);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((com.afollestad.recyclical.c) obj);
            return u22.a;
        }
    }

    static final class f<T> implements u<com.zunjae.vresult.a<? extends List<? extends b>>> {
        final /* synthetic */ d a;

        static final class a extends w62 implements o52<u22> {
            final /* synthetic */ f f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(f fVar) {
                super(0);
                this.f = fVar;
            }

            public final void a() {
                this.f.a.Y1().F();
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return u22.a;
            }
        }

        f(d dVar) {
            this.a = dVar;
        }

        /* renamed from: b */
        public final void a(com.zunjae.vresult.a<? extends List<b>> aVar) {
            RecyclerView recyclerView;
            if (aVar instanceof a.c) {
                if (this.a.e0.isEmpty()) {
                    RecyclerView recyclerView2 = (RecyclerView) this.a.Q1(C0275R$id.recyclerView);
                    v62.d(recyclerView2, "recyclerView");
                    rw1.h(recyclerView2);
                }
            } else if (aVar instanceof a.e) {
                a9.a.a(this.a.e0, (List) ((a.e) aVar).b(), (d62) null, (d62) null, 6, (Object) null);
                RecyclerView recyclerView3 = (RecyclerView) this.a.Q1(C0275R$id.recyclerView);
                v62.d(recyclerView3, "recyclerView");
                rw1.g(recyclerView3);
            } else if (aVar instanceof a.d) {
                fw1.f.k((RecyclerView) this.a.Q1(C0275R$id.recyclerView), "You have no bookmarks saved. Click the create button to create a new bookmark");
            } else if ((aVar instanceof a.b) && (recyclerView = (RecyclerView) this.a.Q1(C0275R$id.recyclerView)) != null) {
                rw1.d(recyclerView, "Could not retrieve any bookmarks from Kanon", (String) null, new a(this), 2, (Object) null);
            }
        }
    }

    static final class g implements View.OnClickListener {
        final /* synthetic */ d e;

        g(d dVar) {
            this.e = dVar;
        }

        public final void onClick(View view) {
            this.e.b2();
        }
    }

    static final class h implements View.OnClickListener {
        final /* synthetic */ d e;

        h(d dVar) {
            this.e = dVar;
        }

        public final void onClick(View view) {
            AbstractActivity U1 = this.e.K1();
            if (U1 != null) {
                U1.g0("https://kanonapp.com/account/register");
            }
        }
    }

    static final class i implements f.h {
        final /* synthetic */ d a;

        i(d dVar) {
            this.a = dVar;
        }

        public final void a(com.afollestad.materialdialogs.f fVar, CharSequence charSequence) {
            v62.e(fVar, "<anonymous parameter 0>");
            v62.d(charSequence, "input");
            if (charSequence.length() > 0) {
                this.a.W1(charSequence.toString());
                return;
            }
            AbstractActivity U1 = this.a.K1();
            if (U1 != null) {
                Toast makeText = Toast.makeText(U1, "Please enter something", 0);
                makeText.show();
                v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
            }
        }
    }

    static final class j implements f.n {
        final /* synthetic */ AbstractActivity a;

        j(AbstractActivity abstractActivity) {
            this.a = abstractActivity;
        }

        public final void a(com.afollestad.materialdialogs.f fVar, com.afollestad.materialdialogs.b bVar) {
            v62.e(fVar, "<anonymous parameter 0>");
            v62.e(bVar, "<anonymous parameter 1>");
            this.a.g0("https://kanonapp.com/account/register");
        }
    }

    /* access modifiers changed from: private */
    public final void W1(String str) {
        X1().A(str).Q(new C0169d(this, str));
    }

    private final com.zunjae.anyme.features.kanon.e X1() {
        return (com.zunjae.anyme.features.kanon.e) this.d0.getValue();
    }

    /* access modifiers changed from: private */
    public final qu1 Y1() {
        return (qu1) this.c0.getValue();
    }

    @SuppressLint({"SetTextI18n"})
    private final void Z1() {
        bw1 bw1 = bw1.a;
        Context o1 = o1();
        v62.d(o1, "requireContext()");
        int a2 = bw1.a(o1, 1, 2, 2, 1);
        RecyclerView recyclerView = (RecyclerView) Q1(C0275R$id.recyclerView);
        v62.d(recyclerView, "recyclerView");
        com.afollestad.recyclical.b.a(recyclerView, new e(this, a2));
        Y1().n().g(R(), new f(this));
    }

    private final void a2() {
        ((FloatingTextButton) Q1(C0275R$id.createBookmarkButton)).setOnClickListener(new g(this));
    }

    /* access modifiers changed from: private */
    public final void b2() {
        if (xx1.a.b()) {
            c2();
            return;
        }
        f.e eVar = new f.e(m1());
        eVar.E("Choose a bookmark title");
        eVar.p(32769);
        eVar.n(1, 64);
        eVar.B("create");
        eVar.l("title", (CharSequence) null, new i(this));
        try {
            eVar.D();
        } catch (Exception e2) {
            uj2.d(e2);
        }
    }

    private final void c2() {
        FragmentActivity m1 = m1();
        if (m1 != null) {
            AbstractActivity abstractActivity = (AbstractActivity) m1;
            f.e eVar = new f.e(abstractActivity);
            eVar.E("Please login");
            eVar.i("In order to create bookmarks you need to be logged in into your Kanon account. Registration only takes a few seconds.");
            eVar.B("login");
            eVar.e(false);
            eVar.A(new j(abstractActivity));
            eVar.D();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.zunjae.anyme.abstracts.AbstractActivity");
    }

    public void I0() {
        super.I0();
        Y1().F();
    }

    public void J1() {
        HashMap hashMap = this.f0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void L1(Intent intent) {
    }

    public int M1() {
        return C0279R$menu.menu_bookmark_controller;
    }

    public int N1() {
        return C0278R$layout.fragment_bookmarks_home;
    }

    public void O1() {
        b2();
    }

    public void P1(MenuItem menuItem) {
    }

    public View Q1(int i2) {
        if (this.f0 == null) {
            this.f0 = new HashMap();
        }
        View view = (View) this.f0.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View Q = Q();
        if (Q == null) {
            return null;
        }
        View findViewById = Q.findViewById(i2);
        this.f0.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public void h0(Bundle bundle) {
        super.h0(bundle);
        if (xx1.a.b()) {
            FloatingTextButton floatingTextButton = (FloatingTextButton) Q1(C0275R$id.createBookmarkButton);
            v62.d(floatingTextButton, "createBookmarkButton");
            rw1.a(floatingTextButton);
            fw1.f.m((RecyclerView) Q1(C0275R$id.recyclerView), "With bookmarks you can put shows in folders to further organize your anime list.\n\nIn order to do this you need an account on Kanon. Registering should take less than 10 seconds.", new h(this));
            return;
        }
        FloatingTextButton floatingTextButton2 = (FloatingTextButton) Q1(C0275R$id.createBookmarkButton);
        v62.d(floatingTextButton2, "createBookmarkButton");
        rw1.i(floatingTextButton2);
        Z1();
        a2();
    }

    public /* synthetic */ void u0() {
        super.u0();
        J1();
    }
}
