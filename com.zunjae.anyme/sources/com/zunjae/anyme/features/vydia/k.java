package com.zunjae.anyme.features.vydia;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.e0;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.features.niche.f;
import defpackage.a9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class k extends Fragment {
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

    public static final class b extends w62 implements o52<c> {
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

        /* JADX WARNING: type inference failed for: r0v1, types: [com.zunjae.anyme.features.vydia.c, androidx.lifecycle.a0] */
        /* renamed from: a */
        public final c invoke() {
            return kg2.a(this.f, f72.b(c.class), this.g, this.h, this.i);
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(r62 r62) {
            this();
        }

        public final k a() {
            return new k();
        }
    }

    static final class d<T> implements u<List<? extends l22<? extends String, ? extends String>>> {
        final /* synthetic */ k a;

        d(k kVar) {
            this.a = kVar;
        }

        /* renamed from: b */
        public final void a(List<l22<String, String>> list) {
            v62.d(list, "infos");
            ArrayList arrayList = new ArrayList(g32.l(list, 10));
            for (l22 l22 : list) {
                arrayList.add(new u((String) l22.c(), (String) l22.d()));
            }
            a9.a.a(this.a.a0, arrayList, (d62) null, (d62) null, 6, (Object) null);
        }
    }

    static final class e extends w62 implements z52<com.afollestad.recyclical.c, u22> {
        final /* synthetic */ k f;

        static final class a extends w62 implements z52<com.afollestad.recyclical.a<? extends u, f>, u22> {
            final /* synthetic */ e f;

            /* renamed from: com.zunjae.anyme.features.vydia.k$e$a$a  reason: collision with other inner class name */
            static final /* synthetic */ class C0213a extends u62 implements z52<View, f> {
                public static final C0213a n = new C0213a();

                C0213a() {
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
                    fVar.N().setTextSize(13.0f);
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
                aVar.c(C0213a.n, b.f);
                aVar.d(new c(this));
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((com.afollestad.recyclical.a) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(k kVar) {
            super(1);
            this.f = kVar;
        }

        public final void a(com.afollestad.recyclical.c cVar) {
            v62.e(cVar, "$receiver");
            cVar.g(this.f.a0);
            cVar.h(new LinearLayoutManager(this.f.n()));
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

    public k() {
        super(C0278R$layout.fragment_additional_info);
    }

    private final c M1() {
        return (c) this.b0.getValue();
    }

    private final void N1() {
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
        N1();
        M1().i().g(R(), new d(this));
    }

    public /* synthetic */ void u0() {
        super.u0();
        J1();
    }
}
