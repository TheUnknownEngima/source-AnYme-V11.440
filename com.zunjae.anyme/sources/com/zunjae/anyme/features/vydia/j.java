package com.zunjae.anyme.features.vydia;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.e0;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.vresult.a;
import defpackage.a9;
import java.util.HashMap;
import java.util.List;

public final class j extends Fragment {
    public static final c d0 = new c((r62) null);
    /* access modifiers changed from: private */
    public a9<com.zunjae.anyme.features.anime.character.d> a0 = b9.a();
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

    public static final class b extends w62 implements o52<ou1> {
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

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, ou1] */
        /* renamed from: a */
        public final ou1 invoke() {
            return kg2.a(this.f, f72.b(ou1.class), this.g, this.h, this.i);
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(r62 r62) {
            this();
        }

        public final j a(int i) {
            j jVar = new j();
            Bundle bundle = new Bundle();
            bundle.putInt("malId", i);
            u22 u22 = u22.a;
            jVar.u1(bundle);
            return jVar;
        }
    }

    static final class d extends w62 implements z52<com.afollestad.recyclical.c, u22> {
        final /* synthetic */ j f;
        final /* synthetic */ GridLayoutManager g;

        static final class a extends w62 implements z52<com.afollestad.recyclical.a<? extends com.zunjae.anyme.features.anime.character.d, f>, u22> {
            final /* synthetic */ d f;

            /* renamed from: com.zunjae.anyme.features.vydia.j$d$a$a  reason: collision with other inner class name */
            static final /* synthetic */ class C0212a extends u62 implements z52<View, f> {
                public static final C0212a n = new C0212a();

                C0212a() {
                    super(1, f.class, "<init>", "<init>(Landroid/view/View;)V", 0);
                }

                /* renamed from: k */
                public final f r(View view) {
                    v62.e(view, "p1");
                    return new f(view);
                }
            }

            static final class b extends w62 implements e62<f, Integer, com.zunjae.anyme.features.anime.character.d, u22> {
                final /* synthetic */ a f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(a aVar) {
                    super(3);
                    this.f = aVar;
                }

                public final void a(f fVar, int i, com.zunjae.anyme.features.anime.character.d dVar) {
                    v62.e(fVar, "$receiver");
                    v62.e(dVar, "character");
                    com.bumptech.glide.c.w(this.f.f.f).t(dVar.e()).K0(fVar.N());
                    fVar.M().setText(dVar.g());
                }

                public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3) {
                    a((f) obj, ((Number) obj2).intValue(), (com.zunjae.anyme.features.anime.character.d) obj3);
                    return u22.a;
                }
            }

            static final class c extends w62 implements z52<com.zunjae.anyme.features.anime.character.d, Number> {
                public static final c f = new c();

                c() {
                    super(1);
                }

                /* renamed from: a */
                public final Number r(com.zunjae.anyme.features.anime.character.d dVar) {
                    v62.e(dVar, "it");
                    return Integer.valueOf(dVar.c());
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar) {
                super(1);
                this.f = dVar;
            }

            public final void a(com.afollestad.recyclical.a<com.zunjae.anyme.features.anime.character.d, f> aVar) {
                v62.e(aVar, "$receiver");
                aVar.c(C0212a.n, new b(this));
                aVar.b(c.f);
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((com.afollestad.recyclical.a) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(j jVar, GridLayoutManager gridLayoutManager) {
            super(1);
            this.f = jVar;
            this.g = gridLayoutManager;
        }

        public final void a(com.afollestad.recyclical.c cVar) {
            v62.e(cVar, "$receiver");
            cVar.g(this.f.a0);
            cVar.h(this.g);
            a aVar = new a(this);
            String name = com.zunjae.anyme.features.anime.character.d.class.getName();
            v62.b(name, "IT::class.java.name");
            n9 n9Var = new n9(cVar, name);
            aVar.r(n9Var);
            cVar.e(C0278R$layout.cardview_anime_character_horizontal, n9Var);
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((com.afollestad.recyclical.c) obj);
            return u22.a;
        }
    }

    static final class e<T> implements u<com.zunjae.vresult.a<? extends List<? extends com.zunjae.anyme.features.anime.character.d>>> {
        final /* synthetic */ j a;

        e(j jVar) {
            this.a = jVar;
        }

        /* renamed from: b */
        public final void a(com.zunjae.vresult.a<? extends List<com.zunjae.anyme.features.anime.character.d>> aVar) {
            if (aVar instanceof a.e) {
                a9.a.a(this.a.a0, (List) ((a.e) aVar).b(), (d62) null, (d62) null, 6, (Object) null);
            }
        }
    }

    public j() {
        super(C0278R$layout.fragment_anime_characters);
    }

    private final ou1 M1() {
        return (ou1) this.b0.getValue();
    }

    private final void N1() {
        int i = n1().getInt("malId", -1);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(u(), 1, 0, false);
        RecyclerView recyclerView = (RecyclerView) K1(C0275R$id.recyclerView);
        v62.d(recyclerView, "recyclerView");
        com.afollestad.recyclical.b.a(recyclerView, new d(this, gridLayoutManager));
        M1().g().g(R(), new e(this));
        M1().j(i);
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
    }

    public /* synthetic */ void u0() {
        super.u0();
        J1();
    }
}
