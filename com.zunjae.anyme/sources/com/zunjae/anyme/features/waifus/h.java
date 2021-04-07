package com.zunjae.anyme.features.waifus;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.e0;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.vresult.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public final class h extends Fragment {
    private final d22 a0 = g22.b(new b(this, (oh2) null, new a(this), (o52) null));
    private AllWaifusAdapter b0;
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

    public static final class b extends w62 implements o52<qu1> {
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

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, qu1] */
        /* renamed from: a */
        public final qu1 invoke() {
            return kg2.a(this.f, f72.b(qu1.class), this.g, this.h, this.i);
        }
    }

    static final class c<T> implements u<com.zunjae.vresult.a<? extends List<? extends j>>> {
        final /* synthetic */ h a;

        static final class a extends w62 implements o52<u22> {
            final /* synthetic */ c f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c cVar) {
                super(0);
                this.f = cVar;
            }

            public final void a() {
                this.f.a.N1().N();
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return u22.a;
            }
        }

        static final class b extends w62 implements o52<u22> {
            final /* synthetic */ c f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(c cVar) {
                super(0);
                this.f = cVar;
            }

            public final void a() {
                this.f.a.N1().N();
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return u22.a;
            }
        }

        c(h hVar) {
            this.a = hVar;
        }

        /* renamed from: b */
        public final void a(com.zunjae.vresult.a<? extends List<j>> aVar) {
            RecyclerView recyclerView;
            String str;
            o52 o52;
            if (aVar instanceof a.c) {
                RecyclerView recyclerView2 = (RecyclerView) this.a.K1(C0275R$id.recyclerViewTopWaifus);
                v62.d(recyclerView2, "recyclerViewTopWaifus");
                rw1.h(recyclerView2);
            } else if (aVar instanceof a.e) {
                h.M1(this.a).R(new ArrayList((Collection) ((a.e) aVar).b()));
                RecyclerView recyclerView3 = (RecyclerView) this.a.K1(C0275R$id.recyclerViewTopWaifus);
                v62.d(recyclerView3, "recyclerViewTopWaifus");
                rw1.g(recyclerView3);
            } else {
                if (aVar instanceof a.d) {
                    recyclerView = (RecyclerView) this.a.K1(C0275R$id.recyclerViewTopWaifus);
                    if (recyclerView != null) {
                        o52 = new a(this);
                        str = "No waifus found :/";
                    } else {
                        return;
                    }
                } else if ((aVar instanceof a.b) && (recyclerView = (RecyclerView) this.a.K1(C0275R$id.recyclerViewTopWaifus)) != null) {
                    o52 = new b(this);
                    str = "Could not connect to Kanon";
                } else {
                    return;
                }
                rw1.c(recyclerView, str, "retry", o52);
            }
        }
    }

    public h() {
        super(C0278R$layout.fragment_top_waifus);
    }

    public static final /* synthetic */ AllWaifusAdapter M1(h hVar) {
        AllWaifusAdapter allWaifusAdapter = hVar.b0;
        if (allWaifusAdapter != null) {
            return allWaifusAdapter;
        }
        v62.p("waifusAdapter");
        throw null;
    }

    /* access modifiers changed from: private */
    public final qu1 N1() {
        return (qu1) this.a0.getValue();
    }

    private final void O1() {
        this.b0 = new AllWaifusAdapter((AbstractActivity) n(), new ArrayList(), 3, N1());
        ((RecyclerView) K1(C0275R$id.recyclerViewTopWaifus)).setHasFixedSize(true);
        bw1 bw1 = bw1.a;
        Context o1 = o1();
        v62.d(o1, "requireContext()");
        int b2 = bw1.b(bw1, o1, 3, 4, 5, 0, 16, (Object) null);
        Context o12 = o1();
        RecyclerView recyclerView = (RecyclerView) K1(C0275R$id.recyclerViewTopWaifus);
        AllWaifusAdapter allWaifusAdapter = this.b0;
        if (allWaifusAdapter != null) {
            com.zunjae.zrecyclerview.c cVar = new com.zunjae.zrecyclerview.c(o12, recyclerView, allWaifusAdapter);
            cVar.d(com.zunjae.zrecyclerview.a.GRID);
            cVar.c(b2, b2 + 2);
            cVar.a();
            N1().B().g(R(), new c(this));
            return;
        }
        v62.p("waifusAdapter");
        throw null;
    }

    public void I0() {
        super.I0();
        if (!com.zunjae.vresult.b.a(N1().B())) {
            N1().N();
        }
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
        O1();
    }

    public /* synthetic */ void u0() {
        super.u0();
        J1();
    }
}
