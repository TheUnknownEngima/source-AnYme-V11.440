package com.zunjae.anyme.features.notes;

import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
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
import com.zunjae.anyme.features.kanon.KanonExplanation;
import com.zunjae.vresult.a;
import defpackage.a9;
import defpackage.n9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@SuppressLint({"SetTextI18n"})
public final class b extends Fragment {
    public static final h h0 = new h((r62) null);
    private final d22 a0 = g22.b(new c(this, (oh2) null, new C0204b(this), (o52) null));
    private final d22 b0 = g22.b(new e(this, (oh2) null, new d(this), (o52) null));
    private final d22 c0 = g22.b(new g(this, (oh2) null, new f(this), (o52) null));
    private final d22 d0 = g22.b(new a(this, (oh2) null, (o52) null));
    /* access modifiers changed from: private */
    public a9<d> e0 = b9.a();
    /* access modifiers changed from: private */
    public sy1 f0;
    private HashMap g0;

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

    /* renamed from: com.zunjae.anyme.features.notes.b$b  reason: collision with other inner class name */
    public static final class C0204b extends w62 implements o52<e0> {
        final /* synthetic */ Fragment f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0204b(Fragment fragment) {
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

    public static final class c extends w62 implements o52<nu1> {
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

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, nu1] */
        /* renamed from: a */
        public final nu1 invoke() {
            return kg2.a(this.f, f72.b(nu1.class), this.g, this.h, this.i);
        }
    }

    public static final class d extends w62 implements o52<e0> {
        final /* synthetic */ Fragment f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
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

    public static final class e extends w62 implements o52<qu1> {
        final /* synthetic */ Fragment f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;
        final /* synthetic */ o52 i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment, oh2 oh2, o52 o52, o52 o522) {
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

    public static final class f extends w62 implements o52<e0> {
        final /* synthetic */ Fragment f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
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

    public static final class g extends w62 implements o52<gr1> {
        final /* synthetic */ Fragment f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;
        final /* synthetic */ o52 i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment, oh2 oh2, o52 o52, o52 o522) {
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

    public static final class h {

        static final class a implements f.h {
            public static final a a = new a();

            a() {
            }

            public final void a(com.afollestad.materialdialogs.f fVar, CharSequence charSequence) {
                v62.e(fVar, "<anonymous parameter 0>");
            }
        }

        private h() {
        }

        public /* synthetic */ h(r62 r62) {
            this();
        }

        public final f.e a(Context context, String str, String str2, String str3) {
            v62.e(context, "activity");
            v62.e(str, "dialogTitle");
            v62.e(str2, "hint");
            f.e eVar = new f.e(context);
            eVar.E(str);
            eVar.p(16385);
            eVar.n(1, 512);
            eVar.B("Save");
            eVar.w("Cancel");
            eVar.m(str2, str3, false, a.a);
            v62.d(eVar, "MaterialDialog.Builder(a…se) { _, _ ->\n          }");
            return eVar;
        }

        public final b b() {
            return new b();
        }
    }

    static final class i implements f.n {
        final /* synthetic */ b a;
        final /* synthetic */ int b;
        final /* synthetic */ d c;

        i(b bVar, int i, d dVar) {
            this.a = bVar;
            this.b = i;
            this.c = dVar;
        }

        public final void a(com.afollestad.materialdialogs.f fVar, com.afollestad.materialdialogs.b bVar) {
            v62.e(fVar, "<anonymous parameter 0>");
            v62.e(bVar, "<anonymous parameter 1>");
            this.a.Z1(this.b, this.c);
        }
    }

    static final class j extends w62 implements o52<u22> {
        final /* synthetic */ b f;
        final /* synthetic */ int g;
        final /* synthetic */ d h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(b bVar, int i, d dVar) {
            super(0);
            this.f = bVar;
            this.g = i;
            this.h = dVar;
        }

        public final void a() {
            FragmentActivity n = this.f.n();
            if (n != null) {
                Toast makeText = Toast.makeText(n, "Could not delete this note, please try again later", 1);
                makeText.show();
                v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
            }
            this.f.Y1(this.g, this.h);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return u22.a;
        }
    }

    static final class k extends w62 implements z52<ve2<b>, u22> {
        final /* synthetic */ b f;
        final /* synthetic */ d g;
        final /* synthetic */ int h;
        final /* synthetic */ j i;

        static final class a extends w62 implements z52<b, u22> {
            final /* synthetic */ k f;
            final /* synthetic */ boolean g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(k kVar, boolean z) {
                super(1);
                this.f = kVar;
                this.g = z;
            }

            public final void a(b bVar) {
                v62.e(bVar, "it");
                if (this.g) {
                    this.f.g.f("");
                    this.f.g.e(0);
                    this.f.f.e0.c(this.f.h);
                    a9 O1 = this.f.f.e0;
                    k kVar = this.f;
                    O1.g(kVar.h, kVar.g);
                    FragmentActivity n = this.f.f.n();
                    if (n != null) {
                        Toast makeText = Toast.makeText(n, "Note deleted", 0);
                        makeText.show();
                        v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
                        return;
                    }
                    return;
                }
                this.f.i.a();
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((b) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(b bVar, d dVar, int i2, j jVar) {
            super(1);
            this.f = bVar;
            this.g = dVar;
            this.h = i2;
            this.i = jVar;
        }

        public final void a(ve2<b> ve2) {
            boolean z;
            v62.e(ve2, "$receiver");
            try {
                com.zunjae.anyme.features.kanon.e Q1 = this.f.c2();
                sy1 N1 = this.f.f0;
                v62.c(N1);
                qi2<db2> h2 = Q1.Q(N1.i(), this.g.b()).h();
                v62.d(h2, "kanonService.deleteNote(….episodeNumber).execute()");
                z = h2.d();
            } catch (Exception e) {
                uj2.d(e);
                z = false;
            }
            ow1.a(ve2, new a(this, z));
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((ve2) obj);
            return u22.a;
        }
    }

    static final class l<T> implements u<sy1> {
        final /* synthetic */ b a;

        l(b bVar) {
            this.a = bVar;
        }

        /* renamed from: b */
        public final void a(sy1 sy1) {
            if (sy1 == null) {
                b bVar = this.a;
                bVar.f0 = sy1.r.a(bVar.b2().g().c(), "", "");
                fw1.f.k((RecyclerView) this.a.K1(C0275R$id.recyclerView), "Add this show to your profile to start adding notes!");
                return;
            }
            this.a.f0 = sy1;
            if (!com.zunjae.vresult.b.a(this.a.d2().x())) {
                this.a.h2();
            }
        }
    }

    static final class m extends w62 implements z52<ve2<b>, u22> {
        final /* synthetic */ b f;
        final /* synthetic */ d g;
        final /* synthetic */ int h;

        static final class a extends w62 implements z52<b, u22> {
            final /* synthetic */ m f;
            final /* synthetic */ boolean g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(m mVar, boolean z) {
                super(1);
                this.f = mVar;
                this.g = z;
            }

            public final void a(b bVar) {
                v62.e(bVar, "it");
                if (this.g) {
                    FragmentActivity n = this.f.f.n();
                    if (n != null) {
                        Toast makeText = Toast.makeText(n, "Note saved", 0);
                        makeText.show();
                        v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
                    }
                    this.f.f.e0.c(this.f.h);
                    a9 O1 = this.f.f.e0;
                    m mVar = this.f;
                    O1.g(mVar.h, mVar.g);
                    return;
                }
                FragmentActivity m1 = this.f.f.m1();
                v62.d(m1, "requireActivity()");
                Toast makeText2 = Toast.makeText(m1, "Could not save this note, please try again", 1);
                makeText2.show();
                v62.b(makeText2, "Toast\n        .makeText(…         show()\n        }");
                m mVar2 = this.f;
                mVar2.f.k2(mVar2.h, mVar2.g);
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((b) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(b bVar, d dVar, int i) {
            super(1);
            this.f = bVar;
            this.g = dVar;
            this.h = i;
        }

        public final void a(ve2<b> ve2) {
            boolean z;
            v62.e(ve2, "$receiver");
            try {
                qi2<db2> h2 = this.f.c2().j(this.g).h();
                v62.d(h2, "kanonService.saveNote(clickedNote).execute()");
                z = h2.d();
            } catch (Exception e) {
                uj2.d(e);
                z = false;
            }
            ow1.a(ve2, new a(this, z));
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((ve2) obj);
            return u22.a;
        }
    }

    static final class n extends w62 implements z52<com.afollestad.recyclical.c, u22> {
        final /* synthetic */ b f;
        final /* synthetic */ int g;

        static final class a extends w62 implements z52<com.afollestad.recyclical.a<? extends d, a>, u22> {
            final /* synthetic */ n f;

            /* renamed from: com.zunjae.anyme.features.notes.b$n$a$a  reason: collision with other inner class name */
            static final /* synthetic */ class C0205a extends u62 implements z52<View, a> {
                public static final C0205a n = new C0205a();

                C0205a() {
                    super(1, a.class, "<init>", "<init>(Landroid/view/View;)V", 0);
                }

                /* renamed from: k */
                public final a r(View view) {
                    v62.e(view, "p1");
                    return new a(view);
                }
            }

            /* renamed from: com.zunjae.anyme.features.notes.b$n$a$b  reason: collision with other inner class name */
            static final class C0206b extends w62 implements e62<a, Integer, d, u22> {
                public static final C0206b f = new C0206b();

                C0206b() {
                    super(3);
                }

                public final void a(a aVar, int i, d dVar) {
                    v62.e(aVar, "$receiver");
                    v62.e(dVar, "entry");
                    aVar.O().setText(dVar.c());
                    String str = "";
                    if (tw1.a.a(dVar.d())) {
                        aVar.M().setHint("Tap to add a note");
                        aVar.M().setText(str);
                    } else {
                        aVar.M().setHint(str);
                        aVar.M().setText(dVar.d());
                    }
                    if (dVar.a() > 0) {
                        String d = dVar.d();
                        v62.d(d, "entry.note");
                        if (d.length() > 0) {
                            rw1.i(aVar.N());
                            TextView N = aVar.N();
                            String str2 = dVar.e;
                            if (str2 != null) {
                                str = str2;
                            }
                            N.setText(str);
                            return;
                        }
                    }
                    rw1.a(aVar.N());
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((a) obj, ((Number) obj2).intValue(), (d) obj3);
                    return u22.a;
                }
            }

            static final class c extends w62 implements e62<r9<? extends d>, Integer, ImageButton, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                c(a aVar) {
                    super(3);
                    this.f = aVar;
                }

                public final void a(r9<d> r9Var, int i, ImageButton imageButton) {
                    v62.e(r9Var, "$receiver");
                    v62.e(imageButton, "<anonymous parameter 1>");
                    this.f.f.f.f2(i, r9Var.getItem());
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((r9) obj, ((Number) obj2).intValue(), (ImageButton) obj3);
                    return u22.a;
                }
            }

            static final class d extends w62 implements d62<r9<? extends d>, Integer, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                d(a aVar) {
                    super(2);
                    this.f = aVar;
                }

                public /* bridge */ /* synthetic */ Object G(Object obj, Object obj2) {
                    a((r9) obj, ((Number) obj2).intValue());
                    return u22.a;
                }

                public final void a(r9<d> r9Var, int i) {
                    v62.e(r9Var, "$receiver");
                    if (xx1.a.b()) {
                        FragmentActivity n = this.f.f.f.n();
                        if (n != null) {
                            n.startActivity(new Intent(this.f.f.f.n(), KanonExplanation.class));
                            return;
                        }
                        return;
                    }
                    this.f.f.f.k2(i, r9Var.getItem());
                }
            }

            static final class e extends w62 implements d62<r9<? extends d>, Integer, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                e(a aVar) {
                    super(2);
                    this.f = aVar;
                }

                public /* bridge */ /* synthetic */ Object G(Object obj, Object obj2) {
                    a((r9) obj, ((Number) obj2).intValue());
                    return u22.a;
                }

                public final void a(r9<d> r9Var, int i) {
                    v62.e(r9Var, "$receiver");
                    this.f.f.f.Y1(i, r9Var.getItem());
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(n nVar) {
                super(1);
                this.f = nVar;
            }

            public final void a(com.afollestad.recyclical.a<d, a> aVar) {
                v62.e(aVar, "$receiver");
                aVar.c(C0205a.n, C0206b.f);
                l9.d(aVar).f().add(new n9.a(a.class, c.l, new c(this)));
                aVar.d(new d(this));
                aVar.a(new e(this));
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((com.afollestad.recyclical.a) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(b bVar, int i) {
            super(1);
            this.f = bVar;
            this.g = i;
        }

        public final void a(com.afollestad.recyclical.c cVar) {
            v62.e(cVar, "$receiver");
            cVar.g(this.f.e0);
            cVar.h(new GridLayoutManager(this.f.u(), this.g));
            a aVar = new a(this);
            String name = d.class.getName();
            v62.b(name, "IT::class.java.name");
            n9 n9Var = new n9(cVar, name);
            aVar.r(n9Var);
            cVar.e(C0278R$layout.cardview_episode_add_note, n9Var);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((com.afollestad.recyclical.c) obj);
            return u22.a;
        }
    }

    static final class o<T> implements u<com.zunjae.vresult.a<? extends List<? extends d>>> {
        final /* synthetic */ b a;

        static final class a extends w62 implements o52<u22> {
            final /* synthetic */ o f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(o oVar) {
                super(0);
                this.f = oVar;
            }

            public final void a() {
                this.f.a.h2();
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return u22.a;
            }
        }

        /* renamed from: com.zunjae.anyme.features.notes.b$o$b  reason: collision with other inner class name */
        static final class C0207b extends w62 implements o52<u22> {
            final /* synthetic */ o f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0207b(o oVar) {
                super(0);
                this.f = oVar;
            }

            public final void a() {
                this.f.a.h2();
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return u22.a;
            }
        }

        o(b bVar) {
            this.a = bVar;
        }

        /* renamed from: b */
        public final void a(com.zunjae.vresult.a<? extends List<d>> aVar) {
            RecyclerView recyclerView;
            String str;
            o52 o52;
            if (aVar instanceof a.c) {
                RecyclerView recyclerView2 = (RecyclerView) this.a.K1(C0275R$id.recyclerView);
                v62.d(recyclerView2, "recyclerView");
                rw1.h(recyclerView2);
                return;
            }
            if (aVar instanceof a.d) {
                recyclerView = (RecyclerView) this.a.K1(C0275R$id.recyclerView);
                v62.d(recyclerView, "recyclerView");
                o52 = new a(this);
                str = "No notes found";
            } else if (aVar instanceof a.e) {
                this.a.i2((List) ((a.e) aVar).b());
                return;
            } else if (aVar instanceof a.b) {
                recyclerView = (RecyclerView) this.a.K1(C0275R$id.recyclerView);
                v62.d(recyclerView, "recyclerView");
                o52 = new C0207b(this);
                str = "Could not connect to Kanon";
            } else {
                return;
            }
            rw1.c(recyclerView, str, "retry", o52);
        }
    }

    static final class p implements f.n {
        final /* synthetic */ b a;
        final /* synthetic */ d b;
        final /* synthetic */ int c;

        p(b bVar, d dVar, int i) {
            this.a = bVar;
            this.b = dVar;
            this.c = i;
        }

        public final void a(com.afollestad.materialdialogs.f fVar, com.afollestad.materialdialogs.b bVar) {
            v62.e(fVar, "dialog");
            v62.e(bVar, "<anonymous parameter 1>");
            EditText i = fVar.i();
            this.b.f(String.valueOf(i != null ? i.getText() : null));
            this.a.g2(this.c, this.b);
        }
    }

    public b() {
        super(C0278R$layout.fragment_add_note_to_anime);
    }

    /* access modifiers changed from: private */
    public final void Y1(int i2, d dVar) {
        f.e eVar = new f.e(m1());
        eVar.E("Confirmation");
        eVar.i("Are you sure you want to delete this note?");
        eVar.w("Nope");
        eVar.B("Yes");
        eVar.A(new i(this, i2, dVar));
        eVar.D();
    }

    /* access modifiers changed from: private */
    public final void Z1(int i2, d dVar) {
        we2.c(this, (z52) null, new k(this, dVar, i2, new j(this, i2, dVar)), 1, (Object) null);
    }

    private final nu1 a2() {
        return (nu1) this.a0.getValue();
    }

    /* access modifiers changed from: private */
    public final gr1 b2() {
        return (gr1) this.c0.getValue();
    }

    /* access modifiers changed from: private */
    public final com.zunjae.anyme.features.kanon.e c2() {
        return (com.zunjae.anyme.features.kanon.e) this.d0.getValue();
    }

    /* access modifiers changed from: private */
    public final qu1 d2() {
        return (qu1) this.b0.getValue();
    }

    private final ArrayList<d> e2(int i2) {
        ArrayList<d> arrayList = new ArrayList<>();
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                sy1 sy1 = this.f0;
                arrayList.add(new d(sy1 != null ? sy1.i() : 0, i3, ""));
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public final void f2(int i2, d dVar) {
        Y1(i2, dVar);
    }

    /* access modifiers changed from: private */
    public final void g2(int i2, d dVar) {
        we2.c(this, (z52) null, new m(this, dVar, i2), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void h2() {
        sy1 sy1 = this.f0;
        int i2 = 0;
        if ((sy1 != null ? sy1.u() : 0) > 0) {
            sy1 sy12 = this.f0;
            if (sy12 != null) {
                i2 = sy12.u();
            }
        } else {
            sy1 sy13 = this.f0;
            if (sy13 != null) {
                i2 = sy13.p();
            }
        }
        if (xx1.a.b()) {
            i2(e2(i2));
        } else {
            d2().K(b2().g().i(), i2);
        }
    }

    /* access modifiers changed from: private */
    public final void i2(List<d> list) {
        a9.a.a(this.e0, list, (d62) null, (d62) null, 6, (Object) null);
        RecyclerView recyclerView = (RecyclerView) K1(C0275R$id.recyclerView);
        v62.d(recyclerView, "recyclerView");
        rw1.g(recyclerView);
        sy1 sy1 = this.f0;
        int p2 = sy1 != null ? sy1.p() : 0;
        RecyclerView recyclerView2 = (RecyclerView) K1(C0275R$id.recyclerView);
        v62.d(recyclerView2, "recyclerView");
        rw1.g(recyclerView2);
        if (p2 > 0) {
            int i2 = 1;
            if (p2 != 1) {
                i2 = 2;
            }
            RecyclerView recyclerView3 = (RecyclerView) K1(C0275R$id.recyclerView);
            if (recyclerView3 != null) {
                recyclerView3.j1(p2 - i2);
            }
        }
    }

    @SuppressLint({"SimpleDateFormat"})
    private final void j2() {
        bw1 bw1 = bw1.a;
        Context o1 = o1();
        v62.d(o1, "requireContext()");
        int a2 = bw1.a(o1, 1, 2, 2, 0);
        RecyclerView recyclerView = (RecyclerView) K1(C0275R$id.recyclerView);
        v62.d(recyclerView, "recyclerView");
        com.afollestad.recyclical.b.a(recyclerView, new n(this, a2));
        d2().x().g(R(), new o(this));
    }

    /* access modifiers changed from: private */
    public final void k2(int i2, d dVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Write some notes for ");
        sy1 sy1 = this.f0;
        v62.c(sy1);
        sb.append(sy1.y());
        String sb2 = sb.toString();
        h hVar = h0;
        FragmentActivity m1 = m1();
        v62.d(m1, "requireActivity()");
        String c2 = dVar.c();
        v62.d(c2, "clickedNote.episodeTitle");
        f.e a2 = hVar.a(m1, c2, sb2, dVar.d());
        a2.A(new p(this, dVar, i2));
        com.afollestad.materialdialogs.f c3 = a2.c();
        v62.d(c3, "dialog");
        EditText i3 = c3.i();
        if (i3 != null) {
            i3.setMaxLines(5);
        }
        c3.show();
    }

    public void J1() {
        HashMap hashMap = this.g0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View K1(int i2) {
        if (this.g0 == null) {
            this.g0 = new HashMap();
        }
        View view = (View) this.g0.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View Q = Q();
        if (Q == null) {
            return null;
        }
        View findViewById = Q.findViewById(i2);
        this.g0.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public void h0(Bundle bundle) {
        super.h0(bundle);
        j2();
        a2().t(b2().g().c()).g(R(), new l(this));
    }

    public /* synthetic */ void u0() {
        super.u0();
        J1();
    }
}
