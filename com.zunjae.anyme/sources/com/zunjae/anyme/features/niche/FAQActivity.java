package com.zunjae.anyme.features.niche;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.n;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.vresult.a;
import defpackage.a9;
import java.util.HashMap;
import java.util.List;

public final class FAQActivity extends AbstractActivity {
    private final d22 D = g22.b(new a(this, (oh2) null, (o52) null));
    /* access modifiers changed from: private */
    public a9<st1> E = b9.a();
    private HashMap F;

    public static final class a extends w62 implements o52<b> {
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

        /* JADX WARNING: type inference failed for: r0v1, types: [com.zunjae.anyme.features.niche.b, androidx.lifecycle.a0] */
        /* renamed from: a */
        public final b invoke() {
            return lg2.b(this.f, f72.b(b.class), this.g, this.h);
        }
    }

    static final class b<T> implements u<com.zunjae.vresult.a<? extends List<? extends st1>>> {
        final /* synthetic */ FAQActivity a;

        static final class a extends w62 implements o52<u22> {
            final /* synthetic */ b f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar) {
                super(0);
                this.f = bVar;
            }

            public final void a() {
                this.f.a.p0().p();
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return u22.a;
            }
        }

        /* renamed from: com.zunjae.anyme.features.niche.FAQActivity$b$b  reason: collision with other inner class name */
        static final class C0195b extends w62 implements o52<u22> {
            final /* synthetic */ b f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0195b(b bVar) {
                super(0);
                this.f = bVar;
            }

            public final void a() {
                this.f.a.p0().p();
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return u22.a;
            }
        }

        b(FAQActivity fAQActivity) {
            this.a = fAQActivity;
        }

        /* renamed from: b */
        public final void a(com.zunjae.vresult.a<? extends List<st1>> aVar) {
            RecyclerView recyclerView;
            String str;
            o52 o52;
            if (aVar instanceof a.e) {
                a9.a.a(this.a.E, (List) ((a.e) aVar).b(), (d62) null, (d62) null, 6, (Object) null);
                RecyclerView recyclerView2 = (RecyclerView) this.a.l0(C0275R$id.recyclerView);
                v62.d(recyclerView2, "recyclerView");
                rw1.g(recyclerView2);
            } else if (aVar instanceof a.c) {
                RecyclerView recyclerView3 = (RecyclerView) this.a.l0(C0275R$id.recyclerView);
                v62.d(recyclerView3, "recyclerView");
                rw1.h(recyclerView3);
            } else {
                if (aVar instanceof a.b) {
                    recyclerView = (RecyclerView) this.a.l0(C0275R$id.recyclerView);
                    v62.d(recyclerView, "recyclerView");
                    o52 = new a(this);
                    str = "Could not connect to Kanon";
                } else if (aVar instanceof a.d) {
                    recyclerView = (RecyclerView) this.a.l0(C0275R$id.recyclerView);
                    v62.d(recyclerView, "recyclerView");
                    o52 = new C0195b(this);
                    str = "No FAQ entries found...";
                } else {
                    return;
                }
                rw1.c(recyclerView, str, "Retry", o52);
            }
        }
    }

    static final class c extends w62 implements z52<com.afollestad.recyclical.c, u22> {
        final /* synthetic */ FAQActivity f;

        static final class a extends w62 implements z52<com.afollestad.recyclical.a<? extends st1, f>, u22> {
            public static final a f = new a();

            /* renamed from: com.zunjae.anyme.features.niche.FAQActivity$c$a$a  reason: collision with other inner class name */
            static final /* synthetic */ class C0196a extends u62 implements z52<View, f> {
                public static final C0196a n = new C0196a();

                C0196a() {
                    super(1, f.class, "<init>", "<init>(Landroid/view/View;)V", 0);
                }

                /* renamed from: k */
                public final f r(View view) {
                    v62.e(view, "p1");
                    return new f(view);
                }
            }

            static final class b extends w62 implements e62<f, Integer, st1, u22> {
                public static final b f = new b();

                b() {
                    super(3);
                }

                public final void a(f fVar, int i, st1 st1) {
                    v62.e(fVar, "$receiver");
                    v62.e(st1, "faq");
                    fVar.N().setText(st1.b());
                    fVar.M().setText(st1.a());
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((f) obj, ((Number) obj2).intValue(), (st1) obj3);
                    return u22.a;
                }
            }

            a() {
                super(1);
            }

            public final void a(com.afollestad.recyclical.a<st1, f> aVar) {
                v62.e(aVar, "$receiver");
                aVar.c(C0196a.n, b.f);
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((com.afollestad.recyclical.a) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(FAQActivity fAQActivity) {
            super(1);
            this.f = fAQActivity;
        }

        public final void a(com.afollestad.recyclical.c cVar) {
            v62.e(cVar, "$receiver");
            cVar.g(this.f.E);
            cVar.h(new LinearLayoutManager(this.f.T()));
            a aVar = a.f;
            String name = st1.class.getName();
            v62.b(name, "IT::class.java.name");
            n9 n9Var = new n9(cVar, name);
            aVar.r(n9Var);
            cVar.e(C0278R$layout.cardview_privacy_policy, n9Var);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((com.afollestad.recyclical.c) obj);
            return u22.a;
        }
    }

    /* access modifiers changed from: private */
    public final b p0() {
        return (b) this.D.getValue();
    }

    private final void q0() {
        RecyclerView recyclerView = (RecyclerView) l0(C0275R$id.recyclerView);
        v62.d(recyclerView, "recyclerView");
        com.afollestad.recyclical.b.a(recyclerView, new c(this));
    }

    public View l0(int i) {
        if (this.F == null) {
            this.F = new HashMap();
        }
        View view = (View) this.F.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.F.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0278R$layout.activity_faq);
        Toolbar toolbar = (Toolbar) l0(C0275R$id.toolbar);
        v62.d(toolbar, "toolbar");
        AbstractActivity.k0(this, toolbar, (String) null, (String) null, true, 6, (Object) null);
        q0();
        p0().i().g(this, new b(this));
        p0().p();
    }
}
