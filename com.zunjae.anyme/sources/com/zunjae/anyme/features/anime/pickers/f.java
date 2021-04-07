package com.zunjae.anyme.features.anime.pickers;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.recyclical.c;
import com.zunjae.anyme.C0272R$color;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import defpackage.a9;
import java.util.HashMap;

public final class f extends com.zunjae.anyme.abstracts.b {
    /* access modifiers changed from: private */
    public a9<e> p0 = b9.a();
    /* access modifiers changed from: private */
    public int q0;
    private HashMap r0;

    public static final class a extends RecyclerView.c0 {
        private final TextView x;
        private final LinearLayout y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            v62.e(view, "itemView");
            View findViewById = view.findViewById(C0275R$id.status);
            v62.d(findViewById, "itemView.findViewById(R.id.status)");
            this.x = (TextView) findViewById;
            View findViewById2 = view.findViewById(C0275R$id.viewGroup);
            v62.d(findViewById2, "itemView.findViewById(R.id.viewGroup)");
            this.y = (LinearLayout) findViewById2;
        }

        public final LinearLayout M() {
            return this.y;
        }

        public final TextView N() {
            return this.x;
        }
    }

    static final class b extends w62 implements z52<c, u22> {
        final /* synthetic */ f f;
        final /* synthetic */ int g;
        final /* synthetic */ int h;

        static final class a extends w62 implements z52<com.afollestad.recyclical.a<? extends e, a>, u22> {
            final /* synthetic */ b f;

            /* renamed from: com.zunjae.anyme.features.anime.pickers.f$b$a$a  reason: collision with other inner class name */
            static final /* synthetic */ class C0163a extends u62 implements z52<View, a> {
                public static final C0163a n = new C0163a();

                C0163a() {
                    super(1, a.class, "<init>", "<init>(Landroid/view/View;)V", 0);
                }

                /* renamed from: k */
                public final a r(View view) {
                    v62.e(view, "p1");
                    return new a(view);
                }
            }

            /* renamed from: com.zunjae.anyme.features.anime.pickers.f$b$a$b  reason: collision with other inner class name */
            static final class C0164b extends w62 implements e62<a, Integer, e, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0164b(a aVar) {
                    super(3);
                    this.f = aVar;
                }

                public final void a(a aVar, int i, e eVar) {
                    LinearLayout linearLayout;
                    int i2;
                    v62.e(aVar, "$receiver");
                    v62.e(eVar, "status");
                    if (eVar.a() == this.f.f.f.q0) {
                        linearLayout = aVar.M();
                        i2 = this.f.f.g;
                    } else {
                        linearLayout = aVar.M();
                        i2 = this.f.f.h;
                    }
                    linearLayout.setBackgroundColor(i2);
                    aVar.N().setText(eVar.b());
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((a) obj, ((Number) obj2).intValue(), (e) obj3);
                    return u22.a;
                }
            }

            static final class c extends w62 implements d62<r9<? extends e>, Integer, u22> {
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

                public final void a(r9<e> r9Var, int i) {
                    v62.e(r9Var, "$receiver");
                    cw1.k.a().i(new iv1(r9Var.getItem().a()));
                    this.f.f.f.L1();
                }
            }

            static final class d extends w62 implements z52<e, Number> {
                public static final d f = new d();

                d() {
                    super(1);
                }

                /* renamed from: a */
                public final Number r(e eVar) {
                    v62.e(eVar, "it");
                    return Integer.valueOf(eVar.a());
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar) {
                super(1);
                this.f = bVar;
            }

            public final void a(com.afollestad.recyclical.a<e, a> aVar) {
                v62.e(aVar, "$receiver");
                aVar.c(C0163a.n, new C0164b(this));
                aVar.d(new c(this));
                aVar.b(d.f);
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((com.afollestad.recyclical.a) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar, int i, int i2) {
            super(1);
            this.f = fVar;
            this.g = i;
            this.h = i2;
        }

        public final void a(c cVar) {
            v62.e(cVar, "$receiver");
            cVar.g(this.f.p0);
            cVar.h(new LinearLayoutManager(this.f.u()));
            a aVar = new a(this);
            String name = e.class.getName();
            v62.b(name, "IT::class.java.name");
            n9 n9Var = new n9(cVar, name);
            aVar.r(n9Var);
            cVar.e(C0278R$layout.cardview_status_list, n9Var);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((c) obj);
            return u22.a;
        }
    }

    private final void c2() {
        a9.a.a(this.p0, f32.h(new e("Watching", 1), new e("Planned", 6), new e("On Hold", 3), new e("Completed", 2), new e("Dropped", 4)), (d62) null, (d62) null, 6, (Object) null);
        int d = androidx.core.content.a.d(o1(), C0272R$color.card_background);
        int d2 = androidx.core.content.a.d(o1(), 2131100232);
        RecyclerView recyclerView = (RecyclerView) Z1(C0275R$id.recyclerView);
        v62.d(recyclerView, "recyclerView");
        com.afollestad.recyclical.b.a(recyclerView, new b(this, d2, d));
    }

    public void K0() {
        super.K0();
        Y1();
    }

    public void X1() {
        HashMap hashMap = this.r0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View Z1(int i) {
        if (this.r0 == null) {
            this.r0 = new HashMap();
        }
        View view = (View) this.r0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View Q = Q();
        if (Q == null) {
            return null;
        }
        View findViewById = Q.findViewById(i);
        this.r0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void h0(Bundle bundle) {
        super.h0(bundle);
        int i = n1().getInt("currentStatus", -10);
        this.q0 = i;
        if (i != -10) {
            c2();
            return;
        }
        throw new NullPointerException("Incorrectly set the arguments");
    }

    public View r0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        v62.e(layoutInflater, "inflater");
        return layoutInflater.inflate(C0278R$layout.dialog_statuspicker, viewGroup, false);
    }

    public /* synthetic */ void u0() {
        super.u0();
        X1();
    }
}
