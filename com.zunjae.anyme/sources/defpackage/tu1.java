package defpackage;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.e0;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.f;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.features.kanon.n;
import com.zunjae.anyme.features.vydia.p;
import com.zunjae.vresult.a;
import defpackage.a9;
import defpackage.n9;
import java.util.HashMap;
import java.util.List;

/* renamed from: tu1  reason: default package */
public final class tu1 extends Fragment {
    public static final d g0 = new d((r62) null);
    /* access modifiers changed from: private */
    public a9<n> a0 = b9.a();
    private final d22 b0 = g22.b(new c(this, (oh2) null, new b(this), (o52) null));
    private final d22 c0 = g22.b(new a(this, (oh2) null, (o52) null));
    /* access modifiers changed from: private */
    public int d0;
    /* access modifiers changed from: private */
    public int e0;
    private HashMap f0;

    /* renamed from: tu1$a */
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

    /* renamed from: tu1$b */
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

    /* renamed from: tu1$c */
    public static final class c extends w62 implements o52<gr1> {
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

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, gr1] */
        /* renamed from: a */
        public final gr1 invoke() {
            return kg2.a(this.f, f72.b(gr1.class), this.g, this.h, this.i);
        }
    }

    /* renamed from: tu1$d */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(r62 r62) {
            this();
        }

        public final tu1 a(int i, int i2) {
            tu1 tu1 = new tu1();
            Bundle bundle = new Bundle();
            bundle.putInt("animeId", i);
            bundle.putInt("episodeNumber", i2);
            u22 u22 = u22.a;
            tu1.u1(bundle);
            return tu1;
        }
    }

    /* renamed from: tu1$e */
    static final class e implements View.OnClickListener {
        final /* synthetic */ tu1 e;

        e(tu1 tu1) {
            this.e = tu1;
        }

        public final void onClick(View view) {
            FragmentActivity n = this.e.n();
            if (!(n instanceof AbstractActivity)) {
                n = null;
            }
            AbstractActivity abstractActivity = (AbstractActivity) n;
            if (abstractActivity != null) {
                abstractActivity.g0("https://kanonapp.com/account/register");
            }
        }
    }

    /* renamed from: tu1$f */
    static final class f extends w62 implements z52<com.afollestad.recyclical.c, u22> {
        final /* synthetic */ tu1 f;

        /* renamed from: tu1$f$a */
        static final class a extends w62 implements z52<com.afollestad.recyclical.a<? extends n, vu1>, u22> {
            final /* synthetic */ f f;

            /* renamed from: tu1$f$a$a  reason: collision with other inner class name */
            static final /* synthetic */ class C0261a extends u62 implements z52<View, vu1> {
                public static final C0261a n = new C0261a();

                C0261a() {
                    super(1, vu1.class, "<init>", "<init>(Landroid/view/View;)V", 0);
                }

                /* renamed from: k */
                public final vu1 r(View view) {
                    v62.e(view, "p1");
                    return new vu1(view);
                }
            }

            /* renamed from: tu1$f$a$b */
            static final class b extends w62 implements e62<vu1, Integer, n, u22> {
                public static final b f = new b();

                b() {
                    super(3);
                }

                public final void a(vu1 vu1, int i, n nVar) {
                    v62.e(vu1, "$receiver");
                    v62.e(nVar, "snapshot");
                    vu1.O().setText(nVar.c());
                    vu1.N().setText(nVar.b());
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((vu1) obj, ((Number) obj2).intValue(), (n) obj3);
                    return u22.a;
                }
            }

            /* renamed from: tu1$f$a$c */
            static final class c extends w62 implements d62<r9<? extends n>, Integer, u22> {
                public static final c f = new c();

                c() {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object G(Object obj, Object obj2) {
                    a((r9) obj, ((Number) obj2).intValue());
                    return u22.a;
                }

                public final void a(r9<n> r9Var, int i) {
                    v62.e(r9Var, "$receiver");
                    cw1.k.a().p(new p(r9Var.getItem().a()));
                }
            }

            /* renamed from: tu1$f$a$d */
            static final class d extends w62 implements e62<r9<? extends n>, Integer, ImageButton, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                d(a aVar) {
                    super(3);
                    this.f = aVar;
                }

                public final void a(r9<n> r9Var, int i, ImageButton imageButton) {
                    v62.e(r9Var, "$receiver");
                    v62.e(imageButton, "<anonymous parameter 1>");
                    this.f.f.f.V1((n) this.f.f.f.a0.get(i), i);
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((r9) obj, ((Number) obj2).intValue(), (ImageButton) obj3);
                    return u22.a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(f fVar) {
                super(1);
                this.f = fVar;
            }

            public final void a(com.afollestad.recyclical.a<n, vu1> aVar) {
                v62.e(aVar, "$receiver");
                aVar.c(C0261a.n, b.f);
                aVar.d(c.f);
                l9.d(aVar).f().add(new n9.a(vu1.class, uu1.l, new d(this)));
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((com.afollestad.recyclical.a) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(tu1 tu1) {
            super(1);
            this.f = tu1;
        }

        public final void a(com.afollestad.recyclical.c cVar) {
            v62.e(cVar, "$receiver");
            cVar.g(this.f.a0);
            cVar.h(new LinearLayoutManager(this.f.n()));
            a aVar = new a(this);
            String name = n.class.getName();
            v62.b(name, "IT::class.java.name");
            n9 n9Var = new n9(cVar, name);
            aVar.r(n9Var);
            cVar.e(C0278R$layout.cardview_vydia_snapshot, n9Var);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((com.afollestad.recyclical.c) obj);
            return u22.a;
        }
    }

    /* renamed from: tu1$g */
    static final class g<T> implements u<com.zunjae.vresult.a<? extends List<? extends n>>> {
        final /* synthetic */ tu1 a;

        /* renamed from: tu1$g$a */
        static final class a extends w62 implements o52<u22> {
            final /* synthetic */ g f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(g gVar) {
                super(0);
                this.f = gVar;
            }

            public final void a() {
                this.f.a.T1();
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return u22.a;
            }
        }

        g(tu1 tu1) {
            this.a = tu1;
        }

        /* renamed from: b */
        public final void a(com.zunjae.vresult.a<? extends List<n>> aVar) {
            if (aVar instanceof a.e) {
                a9.a.a(this.a.a0, (List) ((a.e) aVar).b(), (d62) null, (d62) null, 6, (Object) null);
                RecyclerView recyclerView = (RecyclerView) this.a.K1(C0275R$id.recyclerView);
                v62.d(recyclerView, "recyclerView");
                rw1.g(recyclerView);
            } else if (aVar instanceof a.d) {
                RecyclerView recyclerView2 = (RecyclerView) this.a.K1(C0275R$id.recyclerView);
                v62.d(recyclerView2, "recyclerView");
                rw1.e(recyclerView2, "You have no Snapshots saved for this episode. Create them through Vydia. You can find the 'New Snapshot' button in the bottom bar while a video is playing.");
            } else if (aVar instanceof a.b) {
                RecyclerView recyclerView3 = (RecyclerView) this.a.K1(C0275R$id.recyclerView);
                v62.d(recyclerView3, "recyclerView");
                rw1.d(recyclerView3, "Unable to connect to Kanon...", (String) null, new a(this), 2, (Object) null);
            }
        }
    }

    /* renamed from: tu1$h */
    static final class h extends w62 implements o52<u22> {
        final /* synthetic */ tu1 f;
        final /* synthetic */ n g;
        final /* synthetic */ int h;

        /* renamed from: tu1$h$a */
        public static final class a implements ci2<Void> {
            final /* synthetic */ h a;

            a(h hVar) {
                this.a = hVar;
            }

            public void a(ai2<Void> ai2, Throwable th) {
                v62.e(ai2, "call");
                v62.e(th, "t");
                FragmentActivity n = this.a.f.n();
                if (n != null) {
                    Toast makeText = Toast.makeText(n, "Could not connect to Kanon. Try again later", 0);
                    makeText.show();
                    v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
                }
            }

            public void b(ai2<Void> ai2, qi2<Void> qi2) {
                v62.e(ai2, "call");
                v62.e(qi2, "response");
                this.a.f.a0.c(this.a.h);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(tu1 tu1, n nVar, int i) {
            super(0);
            this.f = tu1;
            this.g = nVar;
            this.h = i;
        }

        public final void a() {
            this.f.R1().J(this.f.d0, this.f.e0, this.g.a()).Q(new a(this));
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return u22.a;
        }
    }

    /* renamed from: tu1$i */
    static final class i implements f.n {
        final /* synthetic */ h a;

        i(h hVar) {
            this.a = hVar;
        }

        public final void a(com.afollestad.materialdialogs.f fVar, com.afollestad.materialdialogs.b bVar) {
            v62.e(fVar, "<anonymous parameter 0>");
            v62.e(bVar, "<anonymous parameter 1>");
            this.a.a();
        }
    }

    public tu1() {
        super(C0278R$layout.fragment_additional_info);
    }

    /* access modifiers changed from: private */
    public final com.zunjae.anyme.features.kanon.e R1() {
        return (com.zunjae.anyme.features.kanon.e) this.c0.getValue();
    }

    private final gr1 S1() {
        return (gr1) this.b0.getValue();
    }

    /* access modifiers changed from: private */
    public final void T1() {
        if (xx1.a.a()) {
            S1().m(this.d0, this.e0);
            return;
        }
        fw1.f.m((RecyclerView) K1(C0275R$id.recyclerView), "In order to create Snapshots you need an account on Kanon", new e(this));
    }

    private final void U1() {
        RecyclerView recyclerView = (RecyclerView) K1(C0275R$id.recyclerView);
        v62.d(recyclerView, "recyclerView");
        com.afollestad.recyclical.b.a(recyclerView, new f(this));
        S1().j().g(R(), new g(this));
    }

    /* access modifiers changed from: private */
    public final void V1(n nVar, int i2) {
        h hVar = new h(this, nVar, i2);
        f.e eVar = new f.e(o1());
        eVar.E("Are you sure you want to delete this snapshot?");
        eVar.B("Yes");
        eVar.w("No");
        eVar.A(new i(hVar));
        eVar.D();
    }

    public void I0() {
        super.I0();
        T1();
    }

    public void J1() {
        HashMap hashMap = this.f0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View K1(int i2) {
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
        U1();
        this.d0 = n1().getInt("animeId");
        this.e0 = n1().getInt("episodeNumber");
    }

    public /* synthetic */ void u0() {
        super.u0();
        J1();
    }
}
