package com.zunjae.anyme.features.discover.seasonal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.n;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.f;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0276R$integer;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.C0279R$menu;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.vresult.a;
import defpackage.ny1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class SeasonalAnimeActivity extends AbstractActivity {
    private ArrayAdapter<nx1> D;
    private AnimeSeasonalAdapter E;
    private final d22 F = g22.b(new a(this, (oh2) null, (o52) null));
    /* access modifiers changed from: private */
    public boolean G = true;
    /* access modifiers changed from: private */
    public final ArrayList<nx1> H = nx1.c.a();
    private HashMap I;

    public static final class a extends w62 implements o52<nu1> {
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

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, nu1] */
        /* renamed from: a */
        public final nu1 invoke() {
            return lg2.b(this.f, f72.b(nu1.class), this.g, this.h);
        }
    }

    public static final class b implements AdapterView.OnItemSelectedListener {
        final /* synthetic */ SeasonalAnimeActivity e;

        b(SeasonalAnimeActivity seasonalAnimeActivity) {
            this.e = seasonalAnimeActivity;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            v62.e(adapterView, "adapter");
            v62.e(view, "v");
            if (i == 0) {
                this.e.S().e0(this.e.G, (nx1) null);
            }
            if (i > 0) {
                this.e.S().e0(this.e.G, (nx1) this.e.H.get(i));
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
            v62.e(adapterView, "adapterView");
        }
    }

    static final class c<T> implements u<com.zunjae.vresult.a<? extends f>> {
        final /* synthetic */ SeasonalAnimeActivity a;

        static final class a extends w62 implements o52<u22> {
            final /* synthetic */ c f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c cVar) {
                super(0);
                this.f = cVar;
            }

            public final void a() {
                this.f.a.S().Z(this.f.a.G);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return u22.a;
            }
        }

        c(SeasonalAnimeActivity seasonalAnimeActivity) {
            this.a = seasonalAnimeActivity;
        }

        /* renamed from: b */
        public final void a(com.zunjae.vresult.a<f> aVar) {
            if (aVar instanceof a.c) {
                RecyclerView recyclerView = (RecyclerView) this.a.l0(C0275R$id.seasonalRecyclerView);
                v62.d(recyclerView, "seasonalRecyclerView");
                rw1.h(recyclerView);
            } else if (aVar instanceof a.e) {
                f fVar = (f) ((a.e) aVar).b();
                SeasonalAnimeActivity.m0(this.a).P(fVar.c(), fVar.b(), this.a.r0());
                RecyclerView recyclerView2 = (RecyclerView) this.a.l0(C0275R$id.seasonalRecyclerView);
                v62.d(recyclerView2, "seasonalRecyclerView");
                rw1.g(recyclerView2);
            } else if (aVar instanceof a.d) {
                fw1.f.h((RecyclerView) this.a.l0(C0275R$id.seasonalRecyclerView), "No results found... Try again later");
            } else if (aVar instanceof a.b) {
                RecyclerView recyclerView3 = (RecyclerView) this.a.l0(C0275R$id.seasonalRecyclerView);
                v62.d(recyclerView3, "seasonalRecyclerView");
                rw1.d(recyclerView3, "Could not connect to MyAnimeList", (String) null, new a(this), 2, (Object) null);
            }
        }
    }

    static final class d implements CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ SeasonalAnimeActivity a;

        d(SeasonalAnimeActivity seasonalAnimeActivity) {
            this.a = seasonalAnimeActivity;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            SeasonalAnimeActivity.m0(this.a).Q(this.a.r0());
        }
    }

    static final class e implements f.j {
        final /* synthetic */ SeasonalAnimeActivity a;

        e(SeasonalAnimeActivity seasonalAnimeActivity) {
            this.a = seasonalAnimeActivity;
        }

        public final boolean a(f fVar, Integer[] numArr, CharSequence[] charSequenceArr) {
            Toolbar toolbar;
            String str;
            this.a.S().p0(numArr);
            SeasonalAnimeActivity.m0(this.a).H(this.a.r0());
            v62.d(numArr, "which");
            if (numArr.length == 0) {
                toolbar = (Toolbar) this.a.l0(C0275R$id.toolbar);
                v62.d(toolbar, "toolbar");
                str = " ";
            } else if (numArr.length == 1) {
                toolbar = (Toolbar) this.a.l0(C0275R$id.toolbar);
                v62.d(toolbar, "toolbar");
                str = "1 filter active";
            } else {
                toolbar = (Toolbar) this.a.l0(C0275R$id.toolbar);
                v62.d(toolbar, "toolbar");
                str = numArr.length + " filters active";
            }
            toolbar.setSubtitle((CharSequence) str);
            return true;
        }
    }

    /* access modifiers changed from: private */
    public final nu1 S() {
        return (nu1) this.F.getValue();
    }

    public static final /* synthetic */ AnimeSeasonalAdapter m0(SeasonalAnimeActivity seasonalAnimeActivity) {
        AnimeSeasonalAdapter animeSeasonalAdapter = seasonalAnimeActivity.E;
        if (animeSeasonalAdapter != null) {
            return animeSeasonalAdapter;
        }
        v62.p("adapter");
        throw null;
    }

    /* access modifiers changed from: private */
    public final List<ny1> r0() {
        ArrayList arrayList = null;
        ArrayList b2 = ny1.a.b(ny1.c, qv1.a.z(T()), false, 2, (Object) null);
        Integer[] N = S().N();
        if (N != null) {
            arrayList = new ArrayList(N.length);
            for (Integer intValue : N) {
                arrayList.add((ny1) b2.get(intValue.intValue()));
            }
        }
        return arrayList;
    }

    private final void s0() {
        int integer = T().getResources().getInteger(C0276R$integer.span_optimized_layout);
        this.E = new AnimeSeasonalAdapter(this, (ArrayList<ny1>) null);
        Context T = T();
        RecyclerView recyclerView = (RecyclerView) l0(C0275R$id.seasonalRecyclerView);
        AnimeSeasonalAdapter animeSeasonalAdapter = this.E;
        if (animeSeasonalAdapter != null) {
            com.zunjae.zrecyclerview.c cVar = new com.zunjae.zrecyclerview.c(T, recyclerView, animeSeasonalAdapter);
            cVar.d(com.zunjae.zrecyclerview.a.GRID);
            cVar.c(integer, integer + 1);
            cVar.a();
            ArrayAdapter<nx1> arrayAdapter = new ArrayAdapter<>(this, 17367048, this.H);
            this.D = arrayAdapter;
            if (arrayAdapter != null) {
                arrayAdapter.setDropDownViewResource(17367049);
                Spinner spinner = (Spinner) l0(C0275R$id.spinner);
                v62.d(spinner, "spinner");
                ArrayAdapter<nx1> arrayAdapter2 = this.D;
                if (arrayAdapter2 != null) {
                    spinner.setAdapter(arrayAdapter2);
                    ((Spinner) l0(C0275R$id.spinner)).setSelection(Integer.MIN_VALUE, true);
                    Spinner spinner2 = (Spinner) l0(C0275R$id.spinner);
                    v62.d(spinner2, "spinner");
                    spinner2.setOnItemSelectedListener(new b(this));
                    S().M().g(this, new c(this));
                    return;
                }
                v62.p("seasonalEntriesAdapter");
                throw null;
            }
            v62.p("seasonalEntriesAdapter");
            throw null;
        }
        v62.p("adapter");
        throw null;
    }

    private final void t0() {
        ((CheckBox) l0(C0275R$id.hideAlreadyAddedCheckBox)).setOnCheckedChangeListener(new d(this));
    }

    @SuppressLint({"DefaultLocale"})
    private final void u0() {
        ArrayList b2 = ny1.a.b(ny1.c, qv1.a.z(T()), false, 2, (Object) null);
        f.e eVar = new f.e(this);
        eVar.E("Pick Genres");
        eVar.q(b2);
        eVar.t(S().N(), new e(this));
        eVar.B("OK");
        eVar.D();
    }

    public View l0(int i) {
        if (this.I == null) {
            this.I = new HashMap();
        }
        View view = (View) this.I.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.I.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0278R$layout.activity_seasonal_anime);
        this.G = qv1.a.x(this);
        this.H.add(0, new nx1(-1, "Current Season"));
        s0();
        t0();
        Toolbar toolbar = (Toolbar) l0(C0275R$id.toolbar);
        v62.d(toolbar, "toolbar");
        j0(toolbar, "Seasonal", "", true);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        v62.e(menu, "menu");
        MenuInflater menuInflater = getMenuInflater();
        v62.d(menuInflater, "menuInflater");
        menuInflater.inflate(C0279R$menu.menu_seasonal, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        v62.e(menuItem, "item");
        if (menuItem.getItemId() == 2131296317) {
            u0();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (!com.zunjae.vresult.b.a(S().M())) {
            S().e0(this.G, (nx1) null);
        }
    }
}
