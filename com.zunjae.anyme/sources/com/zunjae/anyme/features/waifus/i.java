package com.zunjae.anyme.features.waifus;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.abstracts.AbstractActivity;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public final class i extends Fragment {
    public static final c e0 = new c((r62) null);
    /* access modifiers changed from: private */
    public boolean a0;
    private final d22 b0 = g22.b(new b(this, (oh2) null, new a(this), (o52) null));
    private AllWaifusAdapter c0;
    private HashMap d0;

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

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(r62 r62) {
            this();
        }

        public final i a() {
            return new i();
        }
    }

    static final class d implements SwipeRefreshLayout.j {
        final /* synthetic */ i a;

        d(i iVar) {
            this.a = iVar;
        }

        public final void a() {
            this.a.P1().U();
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.a.K1(C0275R$id.swipeRefreshLayout);
            v62.d(swipeRefreshLayout, "swipeRefreshLayout");
            swipeRefreshLayout.setRefreshing(false);
        }
    }

    static final class e<T> implements u<List<? extends j>> {
        final /* synthetic */ i a;

        public static final class a<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return d42.a(Long.valueOf(((j) t2).e()), Long.valueOf(((j) t).e()));
            }
        }

        e(i iVar) {
            this.a = iVar;
        }

        /* renamed from: b */
        public final void a(List<j> list) {
            if (list != null) {
                cw1 a2 = cw1.k.a();
                a2.i(new jv1(8, "" + list.size()));
                j.o(list, xu1.i.v());
                i.N1(this.a).R(new ArrayList(n32.U(list, new a())));
            }
        }
    }

    public static final class f implements AdapterView.OnItemSelectedListener {
        final /* synthetic */ i e;
        final /* synthetic */ String f;
        final /* synthetic */ ArrayList g;
        final /* synthetic */ String h;
        final /* synthetic */ String i;
        final /* synthetic */ String j;

        f(i iVar, String str, ArrayList arrayList, String str2, String str3, String str4) {
            this.e = iVar;
            this.f = str;
            this.g = arrayList;
            this.h = str2;
            this.i = str3;
            this.j = str4;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x005d  */
        /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onItemSelected(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
            /*
                r0 = this;
                com.zunjae.anyme.features.waifus.i r1 = r0.e
                boolean r1 = r1.a0
                r2 = 1
                if (r1 != 0) goto L_0x000f
                com.zunjae.anyme.features.waifus.i r1 = r0.e
                r1.a0 = r2
                return
            L_0x000f:
                java.util.ArrayList r1 = r0.g
                java.lang.Object r1 = r1.get(r3)
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r4 = r0.f
                boolean r1 = defpackage.v62.a(r1, r4)
                if (r1 == 0) goto L_0x0020
                return
            L_0x0020:
                java.util.ArrayList r1 = r0.g
                java.lang.Object r1 = r1.get(r3)
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r3 = r0.h
                boolean r3 = defpackage.v62.a(r1, r3)
                r4 = 0
                if (r3 == 0) goto L_0x0037
            L_0x0031:
                xu1 r1 = defpackage.xu1.i
                r1.o(r4)
                goto L_0x0051
            L_0x0037:
                java.lang.String r3 = r0.i
                boolean r3 = defpackage.v62.a(r1, r3)
                if (r3 == 0) goto L_0x0045
                xu1 r1 = defpackage.xu1.i
            L_0x0041:
                r1.o(r2)
                goto L_0x0051
            L_0x0045:
                java.lang.String r2 = r0.j
                boolean r1 = defpackage.v62.a(r1, r2)
                if (r1 == 0) goto L_0x0031
                xu1 r1 = defpackage.xu1.i
                r2 = 2
                goto L_0x0041
            L_0x0051:
                com.zunjae.anyme.features.waifus.i r1 = r0.e
                com.zunjae.anyme.features.waifus.AllWaifusAdapter r1 = com.zunjae.anyme.features.waifus.i.N1(r1)
                boolean r1 = r1.J()
                if (r1 == 0) goto L_0x0066
                com.zunjae.anyme.features.waifus.i r1 = r0.e
                com.zunjae.anyme.features.waifus.AllWaifusAdapter r1 = com.zunjae.anyme.features.waifus.i.N1(r1)
                r1.Q()
            L_0x0066:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.features.waifus.i.f.onItemSelected(android.widget.AdapterView, android.view.View, int, long):void");
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
            v62.e(adapterView, "parent");
        }
    }

    public i() {
        super(C0278R$layout.fragment_anime_waifus);
    }

    public static final /* synthetic */ AllWaifusAdapter N1(i iVar) {
        AllWaifusAdapter allWaifusAdapter = iVar.c0;
        if (allWaifusAdapter != null) {
            return allWaifusAdapter;
        }
        v62.p("waifusAdapter");
        throw null;
    }

    /* access modifiers changed from: private */
    public final qu1 P1() {
        return (qu1) this.b0.getValue();
    }

    private final void Q1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Pick a sort order");
        arrayList.add("Date Added");
        arrayList.add("Name");
        arrayList.add("Show");
        ArrayAdapter arrayAdapter = new ArrayAdapter(m1(), 17367049, arrayList);
        Spinner spinner = (Spinner) K1(C0275R$id.sortOrderSpinner);
        v62.d(spinner, "sortOrderSpinner");
        spinner.setAdapter(arrayAdapter);
        Spinner spinner2 = (Spinner) K1(C0275R$id.sortOrderSpinner);
        v62.d(spinner2, "sortOrderSpinner");
        spinner2.setPrompt("Pick your sort order");
        Spinner spinner3 = (Spinner) K1(C0275R$id.sortOrderSpinner);
        v62.d(spinner3, "sortOrderSpinner");
        spinner3.setOnItemSelectedListener(new f(this, "Pick a sort order", arrayList, "Date Added", "Name", "Show"));
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
        this.c0 = new AllWaifusAdapter((AbstractActivity) n(), new ArrayList(), 2, P1());
        ((SwipeRefreshLayout) K1(C0275R$id.swipeRefreshLayout)).setOnRefreshListener(new d(this));
        bw1 bw1 = bw1.a;
        Context o1 = o1();
        v62.d(o1, "requireContext()");
        int b2 = bw1.b(bw1, o1, 3, 4, 5, 0, 16, (Object) null);
        ((RecyclerView) K1(C0275R$id.recyclerView)).setHasFixedSize(true);
        Context o12 = o1();
        RecyclerView recyclerView = (RecyclerView) K1(C0275R$id.recyclerView);
        AllWaifusAdapter allWaifusAdapter = this.c0;
        if (allWaifusAdapter != null) {
            com.zunjae.zrecyclerview.c cVar = new com.zunjae.zrecyclerview.c(o12, recyclerView, allWaifusAdapter);
            cVar.c(b2, b2 + 2);
            cVar.d(com.zunjae.zrecyclerview.a.GRID);
            cVar.a();
            P1().U();
            LiveData<List<j>> h = P1().h();
            if (h != null) {
                h.g(R(), new e(this));
                return;
            }
            return;
        }
        v62.p("waifusAdapter");
        throw null;
    }

    public /* synthetic */ void u0() {
        super.u0();
        J1();
    }
}
