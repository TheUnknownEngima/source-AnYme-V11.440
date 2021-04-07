package com.zunjae.anyme.features.vydia;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.e0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.features.anime.info_screen.a;
import com.zunjae.anyme.features.niche.f;
import defpackage.a9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class i extends Fragment {
    public static final c d0 = new c((r62) null);
    /* access modifiers changed from: private */
    public a9<u> a0 = b9.a();
    private final d22 b0 = g22.b(new b(this, (oh2) null, new a(this), (o52) null));
    private HashMap c0;

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

    public static final class b extends w62 implements o52<gr1> {
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

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, gr1] */
        /* renamed from: a */
        public final gr1 invoke() {
            return kg2.a(this.f, f72.b(gr1.class), this.g, this.h, this.i);
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(r62 r62) {
            this();
        }

        public final i a(int i) {
            i iVar = new i();
            Bundle bundle = new Bundle();
            bundle.putInt("malId", i);
            u22 u22 = u22.a;
            iVar.u1(bundle);
            return iVar;
        }
    }

    static final class d extends w62 implements z52<ve2<i>, u22> {
        final /* synthetic */ i f;
        final /* synthetic */ int g;

        static final class a extends w62 implements z52<i, u22> {
            final /* synthetic */ d f;
            final /* synthetic */ com.zunjae.anyme.features.anime.info_screen.a g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar, com.zunjae.anyme.features.anime.info_screen.a aVar) {
                super(1);
                this.f = dVar;
                this.g = aVar;
            }

            public final void a(i iVar) {
                v62.e(iVar, "it");
                com.zunjae.anyme.features.anime.info_screen.a aVar = this.g;
                if (aVar instanceof a.c) {
                    List<com.zunjae.anyme.features.anime.info_screen.b> a = ((a.c) aVar).a();
                    ArrayList arrayList = new ArrayList(g32.l(a, 10));
                    for (com.zunjae.anyme.features.anime.info_screen.b bVar : a) {
                        arrayList.add(new u(bVar.d(), bVar.a().toString()));
                    }
                    a9.a.a(this.f.f.a0, arrayList, (d62) null, (d62) null, 6, (Object) null);
                }
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((i) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(i iVar, int i) {
            super(1);
            this.f = iVar;
            this.g = i;
        }

        public final void a(ve2<i> ve2) {
            v62.e(ve2, "$receiver");
            ow1.a(ve2, new a(this, this.f.N1().f(this.g)));
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((ve2) obj);
            return u22.a;
        }
    }

    static final class e extends w62 implements z52<com.afollestad.recyclical.c, u22> {
        final /* synthetic */ i f;

        static final class a extends w62 implements z52<com.afollestad.recyclical.a<? extends u, f>, u22> {
            final /* synthetic */ e f;

            /* renamed from: com.zunjae.anyme.features.vydia.i$e$a$a  reason: collision with other inner class name */
            static final /* synthetic */ class C0211a extends u62 implements z52<View, f> {
                public static final C0211a n = new C0211a();

                C0211a() {
                    super(1, f.class, "<init>", "<init>(Landroid/view/View;)V", 0);
                }

                /* renamed from: k */
                public final f r(View view) {
                    v62.e(view, "p1");
                    return new f(view);
                }
            }

            static final class b extends w62 implements e62<f, Integer, u, u22> {
                public static final b f = new b();

                b() {
                    super(3);
                }

                public final void a(f fVar, int i, u uVar) {
                    v62.e(fVar, "$receiver");
                    v62.e(uVar, "ts");
                    fVar.N().setText(uVar.b());
                    fVar.M().setText(uVar.a());
                    if (uVar.a() == null) {
                        rw1.a(fVar.M());
                    } else {
                        rw1.i(fVar.M());
                    }
                    fVar.N().setTextSize(12.0f);
                    fVar.M().setTextSize(12.0f);
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((f) obj, ((Number) obj2).intValue(), (u) obj3);
                    return u22.a;
                }
            }

            static final class c extends w62 implements d62<r9<? extends u>, Integer, u22> {
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

                public final void a(r9<u> r9Var, int i) {
                    v62.e(r9Var, "$receiver");
                    String a = r9Var.getItem().a();
                    if (a != null) {
                        yv1 yv1 = yv1.a;
                        Context o1 = this.f.f.f.o1();
                        v62.d(o1, "requireContext()");
                        yv1.b(o1, a);
                        FragmentActivity n = this.f.f.f.n();
                        if (n != null) {
                            Toast makeText = Toast.makeText(n, "Copied value to your clipboard", 0);
                            makeText.show();
                            v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
                        }
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(e eVar) {
                super(1);
                this.f = eVar;
            }

            public final void a(com.afollestad.recyclical.a<u, f> aVar) {
                v62.e(aVar, "$receiver");
                aVar.c(C0211a.n, b.f);
                aVar.d(new c(this));
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((com.afollestad.recyclical.a) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(i iVar) {
            super(1);
            this.f = iVar;
        }

        public final void a(com.afollestad.recyclical.c cVar) {
            v62.e(cVar, "$receiver");
            cVar.g(this.f.a0);
            cVar.h(new GridLayoutManager(this.f.u(), 2));
            a aVar = new a(this);
            String name = u.class.getName();
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

    public i() {
        super(C0278R$layout.fragment_additional_info);
    }

    /* access modifiers changed from: private */
    public final gr1 N1() {
        return (gr1) this.b0.getValue();
    }

    private final void O1() {
        we2.c(this, (z52) null, new d(this, n1().getInt("malId")), 1, (Object) null);
    }

    private final void P1() {
        RecyclerView recyclerView = (RecyclerView) K1(C0275R$id.recyclerView);
        v62.d(recyclerView, "recyclerView");
        com.afollestad.recyclical.b.a(recyclerView, new e(this));
    }

    public void J1() {
        HashMap hashMap = this.c0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View K1(int i) {
        if (this.c0 == null) {
            this.c0 = new HashMap();
        }
        View view = (View) this.c0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View Q = Q();
        if (Q == null) {
            return null;
        }
        View findViewById = Q.findViewById(i);
        this.c0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void h0(Bundle bundle) {
        super.h0(bundle);
        P1();
        O1();
    }

    public /* synthetic */ void u0() {
        super.u0();
        J1();
    }
}
