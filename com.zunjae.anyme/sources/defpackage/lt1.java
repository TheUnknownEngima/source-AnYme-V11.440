package defpackage;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.e0;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.f;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.vresult.a;
import defpackage.a9;
import java.util.HashMap;
import java.util.List;

/* renamed from: lt1  reason: default package */
public final class lt1 extends Fragment {
    public static final e e0 = new e((r62) null);
    /* access modifiers changed from: private */
    public a9<kt1> a0 = b9.a();
    private final d22 b0 = g22.b(new b(this, (oh2) null, new a(this), (o52) null));
    private final d22 c0 = g22.b(new d(this, (oh2) null, new c(this), (o52) null));
    private HashMap d0;

    /* renamed from: lt1$a */
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

    /* renamed from: lt1$b */
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

    /* renamed from: lt1$c */
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

    /* renamed from: lt1$d */
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

    /* renamed from: lt1$e */
    public static final class e {
        private e() {
        }

        public /* synthetic */ e(r62 r62) {
            this();
        }

        public final lt1 a() {
            return new lt1();
        }
    }

    /* renamed from: lt1$f */
    static final class f extends w62 implements z52<com.afollestad.recyclical.c, u22> {
        final /* synthetic */ lt1 f;
        final /* synthetic */ int g;

        /* renamed from: lt1$f$a */
        static final class a extends w62 implements z52<com.afollestad.recyclical.a<? extends kt1, mt1>, u22> {
            final /* synthetic */ f f;

            /* renamed from: lt1$f$a$a  reason: collision with other inner class name */
            static final /* synthetic */ class C0250a extends u62 implements z52<View, mt1> {
                public static final C0250a n = new C0250a();

                C0250a() {
                    super(1, mt1.class, "<init>", "<init>(Landroid/view/View;)V", 0);
                }

                /* renamed from: k */
                public final mt1 r(View view) {
                    v62.e(view, "p1");
                    return new mt1(view);
                }
            }

            /* renamed from: lt1$f$a$b */
            static final class b extends w62 implements e62<mt1, Integer, kt1, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(a aVar) {
                    super(3);
                    this.f = aVar;
                }

                public final void a(mt1 mt1, int i, kt1 kt1) {
                    TextView textView;
                    v62.e(mt1, "$receiver");
                    v62.e(kt1, "review");
                    mt1.O().setText(kt1.c());
                    String b = kt1.b();
                    if (b.length() > this.f.f.g) {
                        textView = mt1.M();
                        b = ie2.l(b, 0, this.f.f.g) + " [...]";
                    } else {
                        textView = mt1.M();
                    }
                    textView.setText(b);
                    mt1.N().setText(kt1.a());
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((mt1) obj, ((Number) obj2).intValue(), (kt1) obj3);
                    return u22.a;
                }
            }

            /* renamed from: lt1$f$a$c */
            static final class c extends w62 implements d62<r9<? extends kt1>, Integer, u22> {
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

                public final void a(r9<kt1> r9Var, int i) {
                    v62.e(r9Var, "$receiver");
                    f.e eVar = new f.e(this.f.f.f.o1());
                    eVar.E("Full Review");
                    eVar.i(r9Var.getItem().b());
                    eVar.B("ok");
                    eVar.D();
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(f fVar) {
                super(1);
                this.f = fVar;
            }

            public final void a(com.afollestad.recyclical.a<kt1, mt1> aVar) {
                v62.e(aVar, "$receiver");
                aVar.c(C0250a.n, new b(this));
                aVar.d(new c(this));
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((com.afollestad.recyclical.a) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(lt1 lt1, int i) {
            super(1);
            this.f = lt1;
            this.g = i;
        }

        public final void a(com.afollestad.recyclical.c cVar) {
            v62.e(cVar, "$receiver");
            cVar.g(this.f.a0);
            cVar.h(new LinearLayoutManager(this.f.u()));
            a aVar = new a(this);
            String name = kt1.class.getName();
            v62.b(name, "IT::class.java.name");
            n9 n9Var = new n9(cVar, name);
            aVar.r(n9Var);
            cVar.e(C0278R$layout.cardview_anime_review, n9Var);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((com.afollestad.recyclical.c) obj);
            return u22.a;
        }
    }

    /* renamed from: lt1$g */
    static final class g<T> implements u<com.zunjae.vresult.a<? extends List<? extends kt1>>> {
        final /* synthetic */ lt1 a;

        /* renamed from: lt1$g$a */
        static final class a extends w62 implements o52<u22> {
            final /* synthetic */ g f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(g gVar) {
                super(0);
                this.f = gVar;
            }

            public final void a() {
                this.f.a.O1().c0(this.f.a.P1().g().i());
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return u22.a;
            }
        }

        /* renamed from: lt1$g$b */
        static final class b extends w62 implements o52<u22> {
            final /* synthetic */ g f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(g gVar) {
                super(0);
                this.f = gVar;
            }

            public final void a() {
                this.f.a.O1().c0(this.f.a.P1().g().i());
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return u22.a;
            }
        }

        g(lt1 lt1) {
            this.a = lt1;
        }

        /* renamed from: b */
        public final void a(com.zunjae.vresult.a<? extends List<kt1>> aVar) {
            RecyclerView recyclerView;
            String str;
            String str2;
            o52 o52;
            if (aVar instanceof a.c) {
                RecyclerView recyclerView2 = (RecyclerView) this.a.K1(C0275R$id.recyclerView);
                if (recyclerView2 != null) {
                    rw1.h(recyclerView2);
                }
            } else if (aVar instanceof a.e) {
                a9.a.a(this.a.a0, (List) ((a.e) aVar).b(), (d62) null, (d62) null, 6, (Object) null);
                RecyclerView recyclerView3 = (RecyclerView) this.a.K1(C0275R$id.recyclerView);
                v62.d(recyclerView3, "recyclerView");
                rw1.g(recyclerView3);
            } else {
                if (aVar instanceof a.d) {
                    recyclerView = (RecyclerView) this.a.K1(C0275R$id.recyclerView);
                    v62.d(recyclerView, "recyclerView");
                    o52 = new a(this);
                    str2 = "No reviews found for this Anime :/";
                    str = "Refresh";
                } else if (aVar instanceof a.b) {
                    recyclerView = (RecyclerView) this.a.K1(C0275R$id.recyclerView);
                    v62.d(recyclerView, "recyclerView");
                    o52 = new b(this);
                    str2 = "Could not connect to MyAnimeList";
                    str = "Retry";
                } else {
                    return;
                }
                rw1.c(recyclerView, str2, str, o52);
            }
        }
    }

    public lt1() {
        super(C0278R$layout.review_fragment);
    }

    /* access modifiers changed from: private */
    public final nu1 O1() {
        return (nu1) this.b0.getValue();
    }

    /* access modifiers changed from: private */
    public final gr1 P1() {
        return (gr1) this.c0.getValue();
    }

    @SuppressLint({"SetTextI18n"})
    private final void Q1() {
        RecyclerView recyclerView = (RecyclerView) K1(C0275R$id.recyclerView);
        v62.d(recyclerView, "recyclerView");
        com.afollestad.recyclical.b.a(recyclerView, new f(this, 250));
    }

    public void I0() {
        super.I0();
        if (!com.zunjae.vresult.b.a(O1().K())) {
            O1().c0(P1().g().i());
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
        O1().K().g(R(), new g(this));
    }

    public /* synthetic */ void u0() {
        super.u0();
        J1();
    }
}
