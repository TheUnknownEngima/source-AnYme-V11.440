package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.e0;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.mikepenz.iconics.view.IconicsTextView;
import com.zunjae.anyme.C0274R$drawable;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.features.anime.info_screen.AnimeInfoActivity;
import com.zunjae.vresult.a;
import defpackage.a9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@SuppressLint({"SetTextI18n"})
/* renamed from: xs1  reason: default package */
public final class xs1 extends Fragment {
    private final d22 a0 = g22.b(new b(this, (oh2) null, new a(this), (o52) null));
    private final d22 b0 = g22.b(new d(this, (oh2) null, new c(this), (o52) null));
    private final d22 c0 = g22.b(new f(this, (oh2) null, new e(this), (o52) null));
    /* access modifiers changed from: private */
    public final a9<sy1> d0 = b9.a();
    /* access modifiers changed from: private */
    public final a9<com.zunjae.anyme.features.kanon.j> e0 = b9.a();
    /* access modifiers changed from: private */
    public final a9<bt1> f0 = b9.a();
    /* access modifiers changed from: private */
    public final a9<vs1> g0 = b9.a();
    /* access modifiers changed from: private */
    public final a9<vs1> h0 = b9.a();
    /* access modifiers changed from: private */
    public final a9<vs1> i0 = b9.a();
    /* access modifiers changed from: private */
    public final a9<vs1> j0 = b9.a();
    private HashMap k0;

    /* renamed from: xs1$a */
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

    /* renamed from: xs1$b */
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

    /* renamed from: xs1$c */
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

    /* renamed from: xs1$d */
    public static final class d extends w62 implements o52<qu1> {
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

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, qu1] */
        /* renamed from: a */
        public final qu1 invoke() {
            return kg2.a(this.f, f72.b(qu1.class), this.g, this.h, this.i);
        }
    }

    /* renamed from: xs1$e */
    public static final class e extends w62 implements o52<e0> {
        final /* synthetic */ Fragment f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
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

    /* renamed from: xs1$f */
    public static final class f extends w62 implements o52<com.zunjae.anyme.features.niche.b> {
        final /* synthetic */ Fragment f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;
        final /* synthetic */ o52 i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment, oh2 oh2, o52 o52, o52 o522) {
            super(0);
            this.f = fragment;
            this.g = oh2;
            this.h = o52;
            this.i = o522;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.zunjae.anyme.features.niche.b, androidx.lifecycle.a0] */
        /* renamed from: a */
        public final com.zunjae.anyme.features.niche.b invoke() {
            return kg2.a(this.f, f72.b(com.zunjae.anyme.features.niche.b.class), this.g, this.h, this.i);
        }
    }

    /* renamed from: xs1$g */
    public static final class g extends RecyclerView.c0 {
        private final TextView A;
        private final TextView B;
        private final TextView C;
        private final ImageView x;
        private final ImageView y;
        private final TextView z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(View view) {
            super(view);
            v62.e(view, "itemView");
            View findViewById = view.findViewById(C0275R$id.seriesWallpaper);
            v62.d(findViewById, "itemView.findViewById(R.id.seriesWallpaper)");
            this.x = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C0275R$id.seriesCoverImage);
            v62.d(findViewById2, "itemView.findViewById(R.id.seriesCoverImage)");
            this.y = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(C0275R$id.seriesTitle);
            v62.d(findViewById3, "itemView.findViewById(R.id.seriesTitle)");
            this.z = (TextView) findViewById3;
            View findViewById4 = view.findViewById(C0275R$id.bottomInformation);
            v62.d(findViewById4, "itemView.findViewById(R.id.bottomInformation)");
            this.A = (TextView) findViewById4;
            View findViewById5 = view.findViewById(C0275R$id.recommendedBy);
            v62.d(findViewById5, "itemView.findViewById(R.id.recommendedBy)");
            this.B = (TextView) findViewById5;
            View findViewById6 = view.findViewById(C0275R$id.userStatus);
            v62.d(findViewById6, "itemView.findViewById(R.id.userStatus)");
            this.C = (TextView) findViewById6;
        }

        public final TextView M() {
            return this.A;
        }

        public final TextView N() {
            return this.B;
        }

        public final ImageView O() {
            return this.y;
        }

        public final TextView P() {
            return this.z;
        }

        public final ImageView Q() {
            return this.x;
        }

        public final TextView R() {
            return this.C;
        }
    }

    /* renamed from: xs1$h */
    static final class h extends w62 implements z52<com.afollestad.recyclical.c, u22> {
        final /* synthetic */ a9 f;
        final /* synthetic */ xs1 g;

        /* renamed from: xs1$h$a */
        static final class a extends w62 implements z52<com.afollestad.recyclical.a<? extends vs1, ot1>, u22> {
            final /* synthetic */ h f;

            /* renamed from: xs1$h$a$a  reason: collision with other inner class name */
            static final class C0262a extends w62 implements e62<ot1, Integer, vs1, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0262a(a aVar) {
                    super(3);
                    this.f = aVar;
                }

                public final void a(ot1 ot1, int i, vs1 vs1) {
                    v62.e(ot1, "$receiver");
                    v62.e(vs1, "anime");
                    com.zunjae.anyme.a.b(this.f.f.g.o1()).t(vs1.c()).K0(ot1.M());
                    ot1.P().setText(vs1.e());
                    String a = vs1.a();
                    if (a != null) {
                        ot1.O().setText(a);
                        rw1.i(ot1.O());
                    } else {
                        rw1.a(ot1.O());
                    }
                    String d = vs1.d();
                    if (d != null) {
                        ot1.N().setText(d);
                        rw1.i(ot1.N());
                        return;
                    }
                    rw1.a(ot1.N());
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((ot1) obj, ((Number) obj2).intValue(), (vs1) obj3);
                    return u22.a;
                }
            }

            /* renamed from: xs1$h$a$b */
            static final class b extends w62 implements d62<r9<? extends vs1>, Integer, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(a aVar) {
                    super(2);
                    this.f = aVar;
                }

                public /* bridge */ /* synthetic */ Object G(Object obj, Object obj2) {
                    a((r9) obj, ((Number) obj2).intValue());
                    return u22.a;
                }

                public final void a(r9<vs1> r9Var, int i) {
                    v62.e(r9Var, "$receiver");
                    xy1 xy1 = new xy1((long) r9Var.getItem().b(), r9Var.getItem().e(), r9Var.getItem().c());
                    Context u = this.f.f.g.u();
                    if (u != null) {
                        AnimeInfoActivity.e eVar = AnimeInfoActivity.M;
                        Context o1 = this.f.f.g.o1();
                        v62.d(o1, "requireContext()");
                        u.startActivity(eVar.b(o1, xy1));
                    }
                }
            }

            /* renamed from: xs1$h$a$c */
            static final class c extends w62 implements d62<r9<? extends vs1>, Integer, u22> {
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

                public final void a(r9<vs1> r9Var, int i) {
                    v62.e(r9Var, "$receiver");
                    FragmentActivity n = this.f.f.g.n();
                    if (!(n instanceof AbstractActivity)) {
                        n = null;
                    }
                    AbstractActivity abstractActivity = (AbstractActivity) n;
                    if (abstractActivity != null) {
                        abstractActivity.M(r9Var.getItem().b(), r9Var.getItem().e(), r9Var.getItem().c());
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(h hVar) {
                super(1);
                this.f = hVar;
            }

            public final void a(com.afollestad.recyclical.a<vs1, ot1> aVar) {
                v62.e(aVar, "$receiver");
                aVar.c(ys1.n, new C0262a(this));
                aVar.d(new b(this));
                aVar.a(new c(this));
                aVar.b(zs1.f);
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((com.afollestad.recyclical.a) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a9 a9Var, xs1 xs1) {
            super(1);
            this.f = a9Var;
            this.g = xs1;
        }

        public final void a(com.afollestad.recyclical.c cVar) {
            v62.e(cVar, "$receiver");
            cVar.g(this.f);
            cVar.h(this.g.X1(1));
            a aVar = new a(this);
            String name = vs1.class.getName();
            v62.b(name, "IT::class.java.name");
            n9 n9Var = new n9(cVar, name);
            aVar.r(n9Var);
            cVar.e(C0278R$layout.cardview_top_anime, n9Var);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((com.afollestad.recyclical.c) obj);
            return u22.a;
        }
    }

    /* renamed from: xs1$i */
    static final class i extends w62 implements z52<com.afollestad.recyclical.c, u22> {
        final /* synthetic */ xs1 f;

        /* renamed from: xs1$i$a */
        static final class a extends w62 implements z52<com.afollestad.recyclical.a<? extends com.zunjae.anyme.features.kanon.j, g>, u22> {
            final /* synthetic */ i f;

            /* renamed from: xs1$i$a$a  reason: collision with other inner class name */
            static final /* synthetic */ class C0263a extends u62 implements z52<View, g> {
                public static final C0263a n = new C0263a();

                C0263a() {
                    super(1, g.class, "<init>", "<init>(Landroid/view/View;)V", 0);
                }

                /* renamed from: k */
                public final g r(View view) {
                    v62.e(view, "p1");
                    return new g(view);
                }
            }

            /* renamed from: xs1$i$a$b */
            static final class b extends w62 implements e62<g, Integer, com.zunjae.anyme.features.kanon.j, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(a aVar) {
                    super(3);
                    this.f = aVar;
                }

                public final void a(g gVar, int i, com.zunjae.anyme.features.kanon.j jVar) {
                    String str;
                    TextView textView;
                    v62.e(gVar, "$receiver");
                    v62.e(jVar, "show");
                    gVar.P().setText(String.valueOf(jVar.h()));
                    gVar.M().setText(jVar.a() + "EP (" + jVar.i() + ", " + jVar.g() + ')');
                    ry1 f2 = jVar.f();
                    if (f2 != null) {
                        rw1.i(gVar.R());
                        if (f2.d() == 2) {
                            textView = gVar.R();
                            str = sy1.r.c(f2.d()) + " (" + f2.c() + ')';
                        } else {
                            textView = gVar.R();
                            str = sy1.r.c(f2.d()) + " (" + f2.c() + ")\nEpisode " + f2.b() + '/' + f2.e();
                        }
                        textView.setText(str);
                    } else {
                        rw1.a(gVar.R());
                    }
                    com.zunjae.anyme.a.b(this.f.f.f.o1()).t("https://media.kitsu.io/anime/cover_images/" + jVar.c() + "/large.jpg?" + jVar.e()).y0(new cl().g0(600, 300)).a1(com.zunjae.anyme.a.b(this.f.f.f.o1()).t(jVar.b())).K0(gVar.Q());
                    com.zunjae.anyme.a.b(this.f.f.f.o1()).t(jVar.b()).o(C0274R$drawable.gradient_dark_reverse).K0(gVar.O());
                    gVar.N().setText("Recommended by " + jVar.j());
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((g) obj, ((Number) obj2).intValue(), (com.zunjae.anyme.features.kanon.j) obj3);
                    return u22.a;
                }
            }

            /* renamed from: xs1$i$a$c */
            static final class c extends w62 implements d62<r9<? extends com.zunjae.anyme.features.kanon.j>, Integer, u22> {
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

                public final void a(r9<com.zunjae.anyme.features.kanon.j> r9Var, int i) {
                    v62.e(r9Var, "$receiver");
                    FragmentActivity n = this.f.f.f.n();
                    if (n != null) {
                        AnimeInfoActivity.e eVar = AnimeInfoActivity.M;
                        FragmentActivity m1 = this.f.f.f.m1();
                        v62.d(m1, "requireActivity()");
                        n.startActivity(eVar.b(m1, r9Var.getItem().l()));
                    }
                }
            }

            /* renamed from: xs1$i$a$d */
            static final class d extends w62 implements d62<r9<? extends com.zunjae.anyme.features.kanon.j>, Integer, u22> {
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

                public final void a(r9<com.zunjae.anyme.features.kanon.j> r9Var, int i) {
                    v62.e(r9Var, "$receiver");
                    FragmentActivity n = this.f.f.f.n();
                    if (!(n instanceof AbstractActivity)) {
                        n = null;
                    }
                    AbstractActivity abstractActivity = (AbstractActivity) n;
                    if (abstractActivity != null) {
                        abstractActivity.N(r9Var.getItem().l());
                    }
                }
            }

            /* renamed from: xs1$i$a$e */
            static final class e extends w62 implements z52<com.zunjae.anyme.features.kanon.j, Number> {
                public static final e f = new e();

                e() {
                    super(1);
                }

                /* renamed from: a */
                public final Number r(com.zunjae.anyme.features.kanon.j jVar) {
                    v62.e(jVar, "it");
                    return Integer.valueOf(jVar.d());
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(i iVar) {
                super(1);
                this.f = iVar;
            }

            public final void a(com.afollestad.recyclical.a<com.zunjae.anyme.features.kanon.j, g> aVar) {
                v62.e(aVar, "$receiver");
                aVar.c(C0263a.n, new b(this));
                aVar.d(new c(this));
                aVar.a(new d(this));
                aVar.b(e.f);
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((com.afollestad.recyclical.a) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(xs1 xs1) {
            super(1);
            this.f = xs1;
        }

        public final void a(com.afollestad.recyclical.c cVar) {
            v62.e(cVar, "$receiver");
            cVar.g(this.f.e0);
            cVar.h(this.f.X1(1));
            a aVar = new a(this);
            String name = com.zunjae.anyme.features.kanon.j.class.getName();
            v62.b(name, "IT::class.java.name");
            n9 n9Var = new n9(cVar, name);
            aVar.r(n9Var);
            cVar.e(C0278R$layout.cardview_staff_recommendation, n9Var);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((com.afollestad.recyclical.c) obj);
            return u22.a;
        }
    }

    /* renamed from: xs1$j */
    static final class j extends w62 implements z52<com.afollestad.recyclical.c, u22> {
        final /* synthetic */ xs1 f;

        /* renamed from: xs1$j$a */
        static final class a extends w62 implements z52<com.afollestad.recyclical.a<? extends sy1, nt1>, u22> {
            final /* synthetic */ j f;

            /* renamed from: xs1$j$a$a  reason: collision with other inner class name */
            static final /* synthetic */ class C0264a extends u62 implements z52<View, nt1> {
                public static final C0264a n = new C0264a();

                C0264a() {
                    super(1, nt1.class, "<init>", "<init>(Landroid/view/View;)V", 0);
                }

                /* renamed from: k */
                public final nt1 r(View view) {
                    v62.e(view, "p1");
                    return new nt1(view);
                }
            }

            /* renamed from: xs1$j$a$b */
            static final class b extends w62 implements e62<nt1, Integer, sy1, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(a aVar) {
                    super(3);
                    this.f = aVar;
                }

                public final void a(nt1 nt1, int i, sy1 sy1) {
                    String str;
                    StringBuilder sb;
                    IconicsTextView iconicsTextView;
                    v62.e(nt1, "$receiver");
                    v62.e(sy1, "anime");
                    ky1 d = sy1.d();
                    if (d != null) {
                        int g = d.g() - sy1.p();
                        if (g > 1) {
                            iconicsTextView = nt1.N();
                            sb = new StringBuilder();
                            sb.append(g);
                            str = " episodes";
                        } else {
                            iconicsTextView = nt1.N();
                            sb = new StringBuilder();
                            sb.append(g);
                            str = " episode";
                        }
                        sb.append(str);
                        iconicsTextView.setText(sb.toString());
                    } else {
                        rw1.f(nt1.N());
                    }
                    com.zunjae.anyme.a.b(this.f.f.f.o1()).t(sy1.w()).K0(nt1.M());
                    nt1.O().setText(sy1.y());
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((nt1) obj, ((Number) obj2).intValue(), (sy1) obj3);
                    return u22.a;
                }
            }

            /* renamed from: xs1$j$a$c */
            static final class c extends w62 implements d62<r9<? extends sy1>, Integer, u22> {
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

                public final void a(r9<sy1> r9Var, int i) {
                    v62.e(r9Var, "$receiver");
                    xy1 xy1 = new xy1(r9Var.getItem().c(), r9Var.getItem().y(), r9Var.getItem().w());
                    Context u = this.f.f.f.u();
                    if (u != null) {
                        AnimeInfoActivity.e eVar = AnimeInfoActivity.M;
                        Context o1 = this.f.f.f.o1();
                        v62.d(o1, "requireContext()");
                        u.startActivity(eVar.b(o1, xy1));
                    }
                }
            }

            /* renamed from: xs1$j$a$d */
            static final class d extends w62 implements d62<r9<? extends sy1>, Integer, u22> {
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

                public final void a(r9<sy1> r9Var, int i) {
                    v62.e(r9Var, "$receiver");
                    FragmentActivity n = this.f.f.f.n();
                    if (!(n instanceof AbstractActivity)) {
                        n = null;
                    }
                    AbstractActivity abstractActivity = (AbstractActivity) n;
                    if (abstractActivity != null) {
                        abstractActivity.M((int) r9Var.getItem().c(), r9Var.getItem().y(), r9Var.getItem().w());
                    }
                }
            }

            /* renamed from: xs1$j$a$e */
            static final class e extends w62 implements z52<sy1, Number> {
                public static final e f = new e();

                e() {
                    super(1);
                }

                /* renamed from: a */
                public final Number r(sy1 sy1) {
                    v62.e(sy1, "it");
                    return Long.valueOf(sy1.c());
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(j jVar) {
                super(1);
                this.f = jVar;
            }

            public final void a(com.afollestad.recyclical.a<sy1, nt1> aVar) {
                v62.e(aVar, "$receiver");
                aVar.c(C0264a.n, new b(this));
                aVar.d(new c(this));
                aVar.a(new d(this));
                aVar.b(e.f);
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((com.afollestad.recyclical.a) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(xs1 xs1) {
            super(1);
            this.f = xs1;
        }

        public final void a(com.afollestad.recyclical.c cVar) {
            v62.e(cVar, "$receiver");
            cVar.h(this.f.X1(1));
            cVar.g(this.f.d0);
            a aVar = new a(this);
            String name = sy1.class.getName();
            v62.b(name, "IT::class.java.name");
            n9 n9Var = new n9(cVar, name);
            aVar.r(n9Var);
            cVar.e(C0278R$layout.cardview_anime_showcase, n9Var);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((com.afollestad.recyclical.c) obj);
            return u22.a;
        }
    }

    /* renamed from: xs1$k */
    static final class k extends w62 implements z52<com.afollestad.recyclical.c, u22> {
        final /* synthetic */ xs1 f;

        /* renamed from: xs1$k$a */
        static final class a extends w62 implements z52<com.afollestad.recyclical.a<? extends bt1, at1>, u22> {
            final /* synthetic */ k f;

            /* renamed from: xs1$k$a$a  reason: collision with other inner class name */
            static final /* synthetic */ class C0265a extends u62 implements z52<View, at1> {
                public static final C0265a n = new C0265a();

                C0265a() {
                    super(1, at1.class, "<init>", "<init>(Landroid/view/View;)V", 0);
                }

                /* renamed from: k */
                public final at1 r(View view) {
                    v62.e(view, "p1");
                    return new at1(view);
                }
            }

            /* renamed from: xs1$k$a$b */
            static final class b extends w62 implements e62<at1, Integer, bt1, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(a aVar) {
                    super(3);
                    this.f = aVar;
                }

                public final void a(at1 at1, int i, bt1 bt1) {
                    v62.e(at1, "$receiver");
                    v62.e(bt1, "anime");
                    com.zunjae.anyme.a.b(this.f.f.f.o1()).t(bt1.b()).K0(at1.M());
                    at1.O().setText(bt1.d());
                    double c = (double) bt1.c();
                    if (c > ((double) 0)) {
                        IconicsTextView N = at1.N();
                        h72 h72 = h72.a;
                        String format = String.format("{faw-star} %.2f", Arrays.copyOf(new Object[]{Double.valueOf(c)}, 1));
                        v62.d(format, "java.lang.String.format(format, *args)");
                        N.setText(format);
                        rw1.i(at1.N());
                        return;
                    }
                    rw1.a(at1.N());
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((at1) obj, ((Number) obj2).intValue(), (bt1) obj3);
                    return u22.a;
                }
            }

            /* renamed from: xs1$k$a$c */
            static final class c extends w62 implements d62<r9<? extends bt1>, Integer, u22> {
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

                public final void a(r9<bt1> r9Var, int i) {
                    v62.e(r9Var, "$receiver");
                    xy1 xy1 = new xy1((long) r9Var.getItem().a(), r9Var.getItem().d(), r9Var.getItem().b());
                    Context u = this.f.f.f.u();
                    if (u != null) {
                        AnimeInfoActivity.e eVar = AnimeInfoActivity.M;
                        Context o1 = this.f.f.f.o1();
                        v62.d(o1, "requireContext()");
                        u.startActivity(eVar.b(o1, xy1));
                    }
                }
            }

            /* renamed from: xs1$k$a$d */
            static final class d extends w62 implements d62<r9<? extends bt1>, Integer, u22> {
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

                public final void a(r9<bt1> r9Var, int i) {
                    v62.e(r9Var, "$receiver");
                    FragmentActivity n = this.f.f.f.n();
                    if (!(n instanceof AbstractActivity)) {
                        n = null;
                    }
                    AbstractActivity abstractActivity = (AbstractActivity) n;
                    if (abstractActivity != null) {
                        abstractActivity.M(r9Var.getItem().a(), r9Var.getItem().d(), r9Var.getItem().b());
                    }
                }
            }

            /* renamed from: xs1$k$a$e */
            static final class e extends w62 implements z52<bt1, Number> {
                public static final e f = new e();

                e() {
                    super(1);
                }

                /* renamed from: a */
                public final Number r(bt1 bt1) {
                    v62.e(bt1, "it");
                    return Integer.valueOf(bt1.a());
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(k kVar) {
                super(1);
                this.f = kVar;
            }

            public final void a(com.afollestad.recyclical.a<bt1, at1> aVar) {
                v62.e(aVar, "$receiver");
                aVar.c(C0265a.n, new b(this));
                aVar.d(new c(this));
                aVar.a(new d(this));
                aVar.b(e.f);
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((com.afollestad.recyclical.a) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(xs1 xs1) {
            super(1);
            this.f = xs1;
        }

        public final void a(com.afollestad.recyclical.c cVar) {
            v62.e(cVar, "$receiver");
            cVar.g(this.f.f0);
            cVar.h(this.f.X1(1));
            a aVar = new a(this);
            String name = bt1.class.getName();
            v62.b(name, "IT::class.java.name");
            n9 n9Var = new n9(cVar, name);
            aVar.r(n9Var);
            cVar.e(C0278R$layout.cardview_anime_showcase, n9Var);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((com.afollestad.recyclical.c) obj);
            return u22.a;
        }
    }

    /* renamed from: xs1$l */
    static final class l implements View.OnClickListener {
        final /* synthetic */ com.zunjae.anyme.features.niche.h e;
        final /* synthetic */ xs1 f;

        l(com.zunjae.anyme.features.niche.h hVar, xs1 xs1) {
            this.e = hVar;
            this.f = xs1;
        }

        public final void onClick(View view) {
            this.f.W1().s(this.e);
        }
    }

    /* renamed from: xs1$m */
    static final class m implements View.OnClickListener {
        final /* synthetic */ ny1 e;
        final /* synthetic */ xs1 f;

        m(ny1 ny1, xs1 xs1) {
            this.e = ny1;
            this.f = xs1;
        }

        public final void onClick(View view) {
            this.f.Y1().L(this.e.a());
        }
    }

    /* renamed from: xs1$n */
    static final class n<T> implements u<com.zunjae.vresult.a<? extends List<? extends bs1>>> {
        final /* synthetic */ xs1 a;

        n(xs1 xs1) {
            this.a = xs1;
        }

        /* renamed from: b */
        public final void a(com.zunjae.vresult.a<? extends List<bs1>> aVar) {
            if (aVar instanceof a.e) {
                Iterable<bs1> iterable = (Iterable) ((a.e) aVar).b();
                ArrayList arrayList = new ArrayList(g32.l(iterable, 10));
                for (bs1 bs1 : iterable) {
                    String d = bs1.d();
                    Integer num = bs1.a;
                    v62.d(num, "entry.malid");
                    int intValue = num.intValue();
                    String str = bs1.e;
                    v62.d(str, "entry.title");
                    String str2 = bs1.c;
                    v62.d(str2, "entry.seriesCover");
                    arrayList.add(new vs1(intValue, str, str2, "EP " + bs1.f, d));
                }
                RecyclerView recyclerView = (RecyclerView) this.a.K1(C0275R$id.recyclerViewRecentlyReleased);
                if (recyclerView != null) {
                    recyclerView.r1(0);
                }
                a9.a.a(this.a.i0, arrayList, (d62) null, (d62) null, 6, (Object) null);
            }
        }
    }

    /* renamed from: xs1$o */
    static final class o<T> implements u<com.zunjae.vresult.a<? extends List<? extends vs1>>> {
        final /* synthetic */ xs1 a;

        o(xs1 xs1) {
            this.a = xs1;
        }

        /* renamed from: b */
        public final void a(com.zunjae.vresult.a<? extends List<vs1>> aVar) {
            if (aVar instanceof a.e) {
                a9.a.a(this.a.j0, (List) ((a.e) aVar).b(), (d62) null, (d62) null, 6, (Object) null);
                RecyclerView recyclerView = (RecyclerView) this.a.K1(C0275R$id.recyclerViewDiscoverSomething);
                if (recyclerView != null) {
                    recyclerView.r1(0);
                }
            }
        }
    }

    /* renamed from: xs1$p */
    static final class p<T> implements u<List<? extends sy1>> {
        final /* synthetic */ xs1 a;

        p(xs1 xs1) {
            this.a = xs1;
        }

        /* renamed from: b */
        public final void a(List<sy1> list) {
            ArrayList arrayList;
            if (list != null) {
                arrayList = new ArrayList();
                for (T next : list) {
                    sy1 sy1 = (sy1) next;
                    ky1 d = sy1.d();
                    boolean z = false;
                    if ((d != null ? d.g() : 0) - sy1.p() > 0) {
                        z = true;
                    }
                    if (z) {
                        arrayList.add(next);
                    }
                }
            } else {
                arrayList = null;
            }
            a9.a.a(this.a.d0, arrayList != null ? arrayList : f32.f(), (d62) null, (d62) null, 6, (Object) null);
            if (arrayList == null || arrayList.size() != 0) {
                CardView cardView = (CardView) this.a.K1(C0275R$id.cardviewContainerStayUpToDate);
                v62.d(cardView, "cardviewContainerStayUpToDate");
                rw1.i(cardView);
                return;
            }
            CardView cardView2 = (CardView) this.a.K1(C0275R$id.cardviewContainerStayUpToDate);
            v62.d(cardView2, "cardviewContainerStayUpToDate");
            rw1.a(cardView2);
        }
    }

    /* renamed from: xs1$q */
    static final class q<T> implements u<com.zunjae.vresult.a<? extends List<? extends jt1>>> {
        final /* synthetic */ xs1 a;

        q(xs1 xs1) {
            this.a = xs1;
        }

        /* renamed from: b */
        public final void a(com.zunjae.vresult.a<? extends List<jt1>> aVar) {
            if (aVar instanceof a.e) {
                Iterable<jt1> iterable = (Iterable) ((a.e) aVar).b();
                ArrayList arrayList = new ArrayList(g32.l(iterable, 10));
                for (jt1 f : iterable) {
                    arrayList.add(f.f());
                }
                a9.a.a(this.a.g0, arrayList, (d62) null, (d62) null, 6, (Object) null);
            }
        }
    }

    /* renamed from: xs1$r */
    static final class r<T> implements u<com.zunjae.vresult.a<? extends List<? extends jt1>>> {
        final /* synthetic */ xs1 a;

        r(xs1 xs1) {
            this.a = xs1;
        }

        /* renamed from: b */
        public final void a(com.zunjae.vresult.a<? extends List<jt1>> aVar) {
            String str;
            if (aVar instanceof a.e) {
                Iterable<jt1> iterable = (Iterable) ((a.e) aVar).b();
                ArrayList arrayList = new ArrayList(g32.l(iterable, 10));
                for (jt1 jt1 : iterable) {
                    if (jt1.c() > ((double) 0)) {
                        str = "{faw-star} " + jt1.c();
                    } else {
                        str = null;
                    }
                    arrayList.add(new vs1(jt1.a(), jt1.d(), jt1.b(), str, jt1.e()));
                }
                RecyclerView recyclerView = (RecyclerView) this.a.K1(C0275R$id.recyclerViewTopAnime);
                if (recyclerView != null) {
                    recyclerView.r1(0);
                }
                a9.a.a(this.a.h0, arrayList, (d62) null, (d62) null, 6, (Object) null);
            }
        }
    }

    /* renamed from: xs1$s */
    static final class s<T> implements u<com.zunjae.vresult.a<? extends List<? extends com.zunjae.anyme.features.kanon.j>>> {
        final /* synthetic */ xs1 a;

        s(xs1 xs1) {
            this.a = xs1;
        }

        /* renamed from: b */
        public final void a(com.zunjae.vresult.a<? extends List<com.zunjae.anyme.features.kanon.j>> aVar) {
            if (aVar instanceof a.e) {
                a9.a.a(this.a.e0, (List) ((a.e) aVar).b(), (d62) null, (d62) null, 6, (Object) null);
            }
        }
    }

    /* renamed from: xs1$t */
    static final class t<T> implements u<com.zunjae.vresult.a<? extends List<? extends bt1>>> {
        final /* synthetic */ xs1 a;

        t(xs1 xs1) {
            this.a = xs1;
        }

        /* renamed from: b */
        public final void a(com.zunjae.vresult.a<? extends List<bt1>> aVar) {
            if (aVar instanceof a.e) {
                a9.a.a(this.a.f0, (List) ((a.e) aVar).b(), (d62) null, (d62) null, 6, (Object) null);
            }
        }
    }

    public xs1() {
        super(C0278R$layout.fragment_anime_discover);
    }

    private final nu1 V1() {
        return (nu1) this.a0.getValue();
    }

    /* access modifiers changed from: private */
    public final com.zunjae.anyme.features.niche.b W1() {
        return (com.zunjae.anyme.features.niche.b) this.c0.getValue();
    }

    /* access modifiers changed from: private */
    public final GridLayoutManager X1(int i2) {
        return new GridLayoutManager(u(), i2, 0, false);
    }

    /* access modifiers changed from: private */
    public final qu1 Y1() {
        return (qu1) this.b0.getValue();
    }

    private final void Z1() {
        RecyclerView recyclerView = (RecyclerView) K1(C0275R$id.recyclerViewStaffRecommendation);
        v62.d(recyclerView, "recyclerViewStaffRecommendation");
        com.afollestad.recyclical.b.a(recyclerView, new i(this));
        RecyclerView recyclerView2 = (RecyclerView) K1(C0275R$id.recyclerViewStayUpToDate);
        v62.d(recyclerView2, "recyclerViewStayUpToDate");
        com.afollestad.recyclical.b.a(recyclerView2, new j(this));
        RecyclerView recyclerView3 = (RecyclerView) K1(C0275R$id.recyclerViewBeingWatched);
        v62.d(recyclerView3, "recyclerViewBeingWatched");
        com.afollestad.recyclical.b.a(recyclerView3, new k(this));
        for (l22 l22 : f32.h(new l22((RecyclerView) K1(C0275R$id.recyclerViewTopAnime), this.h0), new l22((RecyclerView) K1(C0275R$id.recyclerViewRecentlyReleased), this.i0), new l22((RecyclerView) K1(C0275R$id.recyclerViewDiscoverSomething), this.j0), new l22((RecyclerView) K1(C0275R$id.recyclerViewCurrentSeason), this.g0))) {
            RecyclerView recyclerView4 = (RecyclerView) l22.c();
            v62.d(recyclerView4, "recyclerView");
            com.afollestad.recyclical.b.a(recyclerView4, new h((a9) l22.d(), this));
        }
    }

    private final void a2() {
        com.zunjae.anyme.features.niche.h[] values = com.zunjae.anyme.features.niche.h.values();
        int length = values.length;
        int i2 = 0;
        while (i2 < length) {
            com.zunjae.anyme.features.niche.h hVar = values[i2];
            View inflate = B().inflate(C0278R$layout.view_selectable_chip, (ChipGroup) K1(C0275R$id.chipGroupTopAnime), false);
            if (inflate != null) {
                Chip chip = (Chip) inflate;
                chip.setOnClickListener(new l(hVar, this));
                chip.setText(hVar.toString());
                ((ChipGroup) K1(C0275R$id.chipGroupTopAnime)).addView(chip);
                i2++;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.chip.Chip");
            }
        }
        for (ny1 ny1 : ny1.c.a(false, true)) {
            View inflate2 = B().inflate(C0278R$layout.view_selectable_chip, (ChipGroup) K1(C0275R$id.chipGroupDiscoverSomething), false);
            if (inflate2 != null) {
                Chip chip2 = (Chip) inflate2;
                chip2.setOnClickListener(new m(ny1, this));
                chip2.setText(ny1.b());
                ((ChipGroup) K1(C0275R$id.chipGroupDiscoverSomething)).addView(chip2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.chip.Chip");
            }
        }
    }

    private final void b2() {
        W1().j().g(R(), new n(this));
        Y1().z().g(R(), new o(this));
        V1().x().K().g(R(), new p(this));
        Y1().q().g(R(), new q(this));
        W1().l().g(R(), new r(this));
        Y1().A().g(R(), new s(this));
        W1().g().g(R(), new t(this));
    }

    public void I0() {
        super.I0();
        if (!com.zunjae.vresult.b.a(W1().l())) {
            W1().s(com.zunjae.anyme.features.niche.h.TV);
        }
        if (!com.zunjae.vresult.b.a(W1().g())) {
            W1().n();
        }
        if (!com.zunjae.vresult.b.a(W1().j())) {
            W1().q();
        }
        if (!com.zunjae.vresult.b.a(Y1().q())) {
            Y1().H();
        }
        if (!com.zunjae.vresult.b.a(Y1().A())) {
            Y1().M();
        }
        if (!com.zunjae.vresult.b.a(Y1().z())) {
            Y1().L(1);
        }
    }

    public void J1() {
        HashMap hashMap = this.k0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View K1(int i2) {
        if (this.k0 == null) {
            this.k0 = new HashMap();
        }
        View view = (View) this.k0.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View Q = Q();
        if (Q == null) {
            return null;
        }
        View findViewById = Q.findViewById(i2);
        this.k0.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public void h0(Bundle bundle) {
        super.h0(bundle);
        Z1();
        a2();
        b2();
    }

    public /* synthetic */ void u0() {
        super.u0();
        J1();
    }
}
