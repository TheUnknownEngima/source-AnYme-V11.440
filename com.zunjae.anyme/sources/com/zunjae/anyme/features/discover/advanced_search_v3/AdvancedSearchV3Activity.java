package com.zunjae.anyme.features.discover.advanced_search_v3;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.n;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.C0279R$menu;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.vresult.a;
import defpackage.a9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@SuppressLint({"SetTextI18n"})
public final class AdvancedSearchV3Activity extends AbstractActivity {
    private BottomSheetBehavior<ViewGroup> D;
    private final d22 E = g22.b(new a(this, (oh2) null, (o52) null));
    /* access modifiers changed from: private */
    public a9<vy1> F = b9.a();
    private final List<ChipGroup> G = new ArrayList();
    private HashMap H;

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

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, com.zunjae.anyme.features.discover.advanced_search_v3.b] */
        /* renamed from: a */
        public final b invoke() {
            return lg2.b(this.f, f72.b(b.class), this.g, this.h);
        }
    }

    static final class b implements View.OnClickListener {
        final /* synthetic */ AdvancedSearchV3Activity e;

        b(AdvancedSearchV3Activity advancedSearchV3Activity) {
            this.e = advancedSearchV3Activity;
        }

        public final void onClick(View view) {
            mw1.r(AdvancedSearchV3Activity.n0(this.e));
        }
    }

    public static final class c extends BottomSheetBehavior.f {
        final /* synthetic */ AdvancedSearchV3Activity a;

        c(AdvancedSearchV3Activity advancedSearchV3Activity) {
            this.a = advancedSearchV3Activity;
        }

        public void a(View view, float f) {
            v62.e(view, "bottomSheet");
            View l0 = this.a.l0(C0275R$id.dim);
            v62.d(l0, "dim");
            rw1.i(l0);
            View l02 = this.a.l0(C0275R$id.dim);
            v62.d(l02, "dim");
            l02.setAlpha(f);
            ImageView imageView = (ImageView) this.a.l0(C0275R$id.scrollUpHintArrow);
            v62.d(imageView, "scrollUpHintArrow");
            imageView.setRotation(f * ((float) 180));
        }

        public void b(View view, int i) {
            v62.e(view, "bottomSheet");
            if (3 == i) {
                TextView textView = (TextView) this.a.l0(C0275R$id.swipeUpHint);
                v62.d(textView, "swipeUpHint");
                textView.setText("Swipe down to see the results");
            }
            if (4 == i) {
                TextView textView2 = (TextView) this.a.l0(C0275R$id.swipeUpHint);
                v62.d(textView2, "swipeUpHint");
                textView2.setText("Swipe up to apply some filters");
                this.a.s0();
                View l0 = this.a.l0(C0275R$id.dim);
                v62.d(l0, "dim");
                rw1.a(l0);
            }
        }
    }

    static final class d implements CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ AdvancedSearchV3Activity a;

        d(d dVar, AdvancedSearchV3Activity advancedSearchV3Activity) {
            this.a = advancedSearchV3Activity;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.a.q0();
        }
    }

    static final class e implements CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ AdvancedSearchV3Activity a;

        e(int i, AdvancedSearchV3Activity advancedSearchV3Activity) {
            this.a = advancedSearchV3Activity;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.a.q0();
        }
    }

    static final class f implements CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ AdvancedSearchV3Activity a;

        f(int i, AdvancedSearchV3Activity advancedSearchV3Activity) {
            this.a = advancedSearchV3Activity;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.a.q0();
        }
    }

    static final class g implements CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ AdvancedSearchV3Activity a;

        g(int i, AdvancedSearchV3Activity advancedSearchV3Activity) {
            this.a = advancedSearchV3Activity;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.a.q0();
        }
    }

    static final class h implements CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ AdvancedSearchV3Activity a;

        h(ny1 ny1, AdvancedSearchV3Activity advancedSearchV3Activity) {
            this.a = advancedSearchV3Activity;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.a.q0();
        }
    }

    static final class i implements CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ AdvancedSearchV3Activity a;

        i(c cVar, AdvancedSearchV3Activity advancedSearchV3Activity) {
            this.a = advancedSearchV3Activity;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.a.q0();
        }
    }

    static final class j<T> implements u<com.zunjae.vresult.a<? extends List<? extends vy1>>> {
        final /* synthetic */ AdvancedSearchV3Activity a;

        j(AdvancedSearchV3Activity advancedSearchV3Activity) {
            this.a = advancedSearchV3Activity;
        }

        /* renamed from: b */
        public final void a(com.zunjae.vresult.a<? extends List<vy1>> aVar) {
            if (aVar instanceof a.c) {
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.a.l0(C0275R$id.swipeRefreshLayout);
                v62.d(swipeRefreshLayout, "swipeRefreshLayout");
                swipeRefreshLayout.setRefreshing(true);
            } else if (aVar instanceof a.e) {
                a9.a.a(this.a.F, (List) ((a.e) aVar).b(), (d62) null, (d62) null, 6, (Object) null);
                SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) this.a.l0(C0275R$id.swipeRefreshLayout);
                v62.d(swipeRefreshLayout2, "swipeRefreshLayout");
                swipeRefreshLayout2.setRefreshing(false);
                ((RecyclerView) this.a.l0(C0275R$id.recyclerViewShows)).r1(0);
            } else {
                if (aVar instanceof a.d) {
                    this.a.F.clear();
                } else if (!(aVar instanceof a.b)) {
                    return;
                }
                SwipeRefreshLayout swipeRefreshLayout3 = (SwipeRefreshLayout) this.a.l0(C0275R$id.swipeRefreshLayout);
                v62.d(swipeRefreshLayout3, "swipeRefreshLayout");
                swipeRefreshLayout3.setRefreshing(false);
            }
        }
    }

    static final class k implements View.OnClickListener {
        final /* synthetic */ AdvancedSearchV3Activity e;

        k(AdvancedSearchV3Activity advancedSearchV3Activity) {
            this.e = advancedSearchV3Activity;
        }

        public final void onClick(View view) {
            mw1.j(AdvancedSearchV3Activity.n0(this.e));
        }
    }

    public static final /* synthetic */ BottomSheetBehavior n0(AdvancedSearchV3Activity advancedSearchV3Activity) {
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior = advancedSearchV3Activity.D;
        if (bottomSheetBehavior != null) {
            return bottomSheetBehavior;
        }
        v62.p("bottomSheetBehaviour");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void q0() {
        int i2 = 0;
        for (ChipGroup m : this.G) {
            i2 += mw1.m(m);
        }
        if (i2 != 0) {
            TextView textView = (TextView) l0(C0275R$id.filtersTitle);
            v62.d(textView, "filtersTitle");
            textView.setText("Filter (" + i2 + ')');
            return;
        }
        TextView textView2 = (TextView) l0(C0275R$id.filtersTitle);
        v62.d(textView2, "filtersTitle");
        textView2.setText("Filter");
    }

    private final b r0() {
        return (b) this.E.getValue();
    }

    /* access modifiers changed from: private */
    public final void s0() {
        ChipGroup chipGroup = (ChipGroup) l0(C0275R$id.chipGroupMinimumScore);
        v62.d(chipGroup, "chipGroupMinimumScore");
        List<Chip> o = mw1.o(chipGroup);
        ArrayList arrayList = new ArrayList(g32.l(o, 10));
        for (Chip tag : o) {
            Object tag2 = tag.getTag();
            if (tag2 != null) {
                arrayList.add(Integer.valueOf(((Integer) tag2).intValue()));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
        }
        Integer num = (Integer) n32.B(arrayList);
        int intValue = num != null ? num.intValue() : 0;
        ChipGroup chipGroup2 = (ChipGroup) l0(C0275R$id.chipGroupGenres);
        v62.d(chipGroup2, "chipGroupGenres");
        List<Chip> o2 = mw1.o(chipGroup2);
        ArrayList arrayList2 = new ArrayList(g32.l(o2, 10));
        for (Chip tag3 : o2) {
            Object tag4 = tag3.getTag();
            if (tag4 != null) {
                arrayList2.add(Integer.valueOf(((ny1) tag4).a()));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.zunjae.myanimelist.constants.AnimeGenre");
            }
        }
        ChipGroup chipGroup3 = (ChipGroup) l0(C0275R$id.chipGroupShowType);
        v62.d(chipGroup3, "chipGroupShowType");
        List<Chip> o3 = mw1.o(chipGroup3);
        ArrayList<d> arrayList3 = new ArrayList<>(g32.l(o3, 10));
        for (Chip tag5 : o3) {
            Object tag6 = tag5.getTag();
            if (tag6 != null) {
                arrayList3.add((d) tag6);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.zunjae.anyme.features.discover.advanced_search_v3.ShowTypes");
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (d id : arrayList3) {
            boolean unused = k32.q(arrayList4, id.getId());
        }
        ChipGroup chipGroup4 = (ChipGroup) l0(C0275R$id.chipGroupStartYear);
        v62.d(chipGroup4, "chipGroupStartYear");
        Chip n = mw1.n(chipGroup4);
        Object obj = null;
        Object tag7 = n != null ? n.getTag() : null;
        if (!(tag7 instanceof Integer)) {
            tag7 = null;
        }
        Integer num2 = (Integer) tag7;
        int intValue2 = num2 != null ? num2.intValue() : 0;
        ChipGroup chipGroup5 = (ChipGroup) l0(C0275R$id.chipGroupEpisodes);
        v62.d(chipGroup5, "chipGroupEpisodes");
        Chip n2 = mw1.n(chipGroup5);
        Object tag8 = n2 != null ? n2.getTag() : null;
        if (tag8 instanceof Integer) {
            obj = tag8;
        }
        Integer num3 = (Integer) obj;
        int intValue3 = num3 != null ? num3.intValue() : 0;
        ChipGroup chipGroup6 = (ChipGroup) l0(C0275R$id.chipGroupOtherFilters);
        v62.d(chipGroup6, "chipGroupOtherFilters");
        List<Chip> o4 = mw1.o(chipGroup6);
        ArrayList arrayList5 = new ArrayList(g32.l(o4, 10));
        for (Chip tag9 : o4) {
            Object tag10 = tag9.getTag();
            if (tag10 != null) {
                arrayList5.add((c) tag10);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.zunjae.anyme.features.discover.advanced_search_v3.OtherFilters");
            }
        }
        r0().i(new a(arrayList4, arrayList2, intValue, intValue2, (List) null, arrayList5.contains(c.DubbedOnly), intValue3, 16, (r62) null));
    }

    private final void t0() {
        LinearLayout linearLayout = (LinearLayout) l0(C0275R$id.filterContainer);
        v62.d(linearLayout, "filterContainer");
        BottomSheetBehavior<ViewGroup> g2 = mw1.g(linearLayout);
        v62.c(g2);
        this.D = g2;
        if (g2 != null) {
            g2.f0(false);
            ((LinearLayout) l0(C0275R$id.swipeUpHintContainer)).setOnClickListener(new b(this));
            BottomSheetBehavior<ViewGroup> bottomSheetBehavior = this.D;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.K(new c(this));
            } else {
                v62.p("bottomSheetBehaviour");
                throw null;
            }
        } else {
            v62.p("bottomSheetBehaviour");
            throw null;
        }
    }

    private final void u0() {
        d[] values = d.values();
        int length = values.length;
        int i2 = 0;
        while (i2 < length) {
            d dVar = values[i2];
            View inflate = getLayoutInflater().inflate(C0278R$layout.view_selectable_chip, (ChipGroup) l0(C0275R$id.chipGroupShowType), false);
            if (inflate != null) {
                Chip chip = (Chip) inflate;
                chip.setText(dVar.getTitle());
                chip.setTag(dVar);
                chip.setOnCheckedChangeListener(new d(dVar, this));
                ((ChipGroup) l0(C0275R$id.chipGroupShowType)).addView(chip);
                i2++;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.chip.Chip");
            }
        }
        for (T intValue : n32.Q(a.k.b())) {
            int intValue2 = intValue.intValue();
            View inflate2 = getLayoutInflater().inflate(C0278R$layout.view_selectable_chip, (ChipGroup) l0(C0275R$id.chipGroupStartYear), false);
            if (inflate2 != null) {
                Chip chip2 = (Chip) inflate2;
                chip2.setTag(Integer.valueOf(intValue2));
                chip2.setText(String.valueOf(intValue2));
                chip2.setOnCheckedChangeListener(new e(intValue2, this));
                ((ChipGroup) l0(C0275R$id.chipGroupStartYear)).addView(chip2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.chip.Chip");
            }
        }
        for (T intValue3 : n32.Q(a.k.d())) {
            int intValue4 = intValue3.intValue();
            View inflate3 = getLayoutInflater().inflate(C0278R$layout.view_selectable_chip, (ChipGroup) l0(C0275R$id.chipGroupEpisodes), false);
            if (inflate3 != null) {
                Chip chip3 = (Chip) inflate3;
                chip3.setTag(Integer.valueOf(intValue4));
                chip3.setText(String.valueOf(intValue4));
                chip3.setOnCheckedChangeListener(new f(intValue4, this));
                ((ChipGroup) l0(C0275R$id.chipGroupEpisodes)).addView(chip3);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.chip.Chip");
            }
        }
        for (T intValue5 : n32.Q(a.k.c())) {
            int intValue6 = intValue5.intValue();
            View inflate4 = getLayoutInflater().inflate(C0278R$layout.view_selectable_chip, (ChipGroup) l0(C0275R$id.chipGroupMinimumScore), false);
            if (inflate4 != null) {
                Chip chip4 = (Chip) inflate4;
                chip4.setTag(Integer.valueOf(intValue6));
                chip4.setText(String.valueOf(intValue6));
                chip4.setOnCheckedChangeListener(new g(intValue6, this));
                ((ChipGroup) l0(C0275R$id.chipGroupMinimumScore)).addView(chip4);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.chip.Chip");
            }
        }
        for (ny1 ny1 : ny1.c.a(false, true)) {
            View inflate5 = getLayoutInflater().inflate(C0278R$layout.view_selectable_chip, (ChipGroup) l0(C0275R$id.chipGroupGenres), false);
            if (inflate5 != null) {
                Chip chip5 = (Chip) inflate5;
                chip5.setTag(ny1);
                chip5.setText(ny1.b());
                chip5.setOnCheckedChangeListener(new h(ny1, this));
                ((ChipGroup) l0(C0275R$id.chipGroupGenres)).addView(chip5);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.chip.Chip");
            }
        }
        c[] values2 = c.values();
        int length2 = values2.length;
        int i3 = 0;
        while (i3 < length2) {
            c cVar = values2[i3];
            View inflate6 = getLayoutInflater().inflate(C0278R$layout.view_selectable_chip, (ChipGroup) l0(C0275R$id.chipGroupOtherFilters), false);
            if (inflate6 != null) {
                Chip chip6 = (Chip) inflate6;
                chip6.setTag(cVar);
                chip6.setText(cVar.getTextToDisplay());
                chip6.setOnCheckedChangeListener(new i(cVar, this));
                ((ChipGroup) l0(C0275R$id.chipGroupOtherFilters)).addView(chip6);
                i3++;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.chip.Chip");
            }
        }
    }

    private final void v0() {
        int a2 = bw1.a.a(T(), 3, 4, 5, 2);
        RecyclerView recyclerView = (RecyclerView) l0(C0275R$id.recyclerViewShows);
        v62.d(recyclerView, "recyclerViewShows");
        c0(recyclerView, this.F, com.zunjae.anyme.features.kanon.generic_anime_list.c.AdvancedSearchV3, a2);
        r0().h().g(this, new j(this));
        ((ImageView) l0(C0275R$id.scrollUpHintArrow)).setOnClickListener(new k(this));
        r0().i(a.k.a());
    }

    public View l0(int i2) {
        if (this.H == null) {
            this.H = new HashMap();
        }
        View view = (View) this.H.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.H.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public void onBackPressed() {
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior = this.D;
        if (bottomSheetBehavior == null) {
            v62.p("bottomSheetBehaviour");
            throw null;
        } else if (mw1.l(bottomSheetBehavior)) {
            BottomSheetBehavior<ViewGroup> bottomSheetBehavior2 = this.D;
            if (bottomSheetBehavior2 != null) {
                mw1.e(bottomSheetBehavior2);
            } else {
                v62.p("bottomSheetBehaviour");
                throw null;
            }
        } else {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0278R$layout.activity_advanced_anime_search_v3);
        Toolbar toolbar = (Toolbar) l0(C0275R$id.toolbar);
        v62.d(toolbar, "toolbar");
        AbstractActivity.k0(this, toolbar, (String) null, (String) null, true, 6, (Object) null);
        List<ChipGroup> list = this.G;
        ChipGroup chipGroup = (ChipGroup) l0(C0275R$id.chipGroupGenres);
        v62.d(chipGroup, "chipGroupGenres");
        list.add(chipGroup);
        ChipGroup chipGroup2 = (ChipGroup) l0(C0275R$id.chipGroupMinimumScore);
        v62.d(chipGroup2, "chipGroupMinimumScore");
        list.add(chipGroup2);
        ChipGroup chipGroup3 = (ChipGroup) l0(C0275R$id.chipGroupShowType);
        v62.d(chipGroup3, "chipGroupShowType");
        list.add(chipGroup3);
        ChipGroup chipGroup4 = (ChipGroup) l0(C0275R$id.chipGroupStartYear);
        v62.d(chipGroup4, "chipGroupStartYear");
        list.add(chipGroup4);
        ChipGroup chipGroup5 = (ChipGroup) l0(C0275R$id.chipGroupOtherFilters);
        v62.d(chipGroup5, "chipGroupOtherFilters");
        list.add(chipGroup5);
        ChipGroup chipGroup6 = (ChipGroup) l0(C0275R$id.chipGroupEpisodes);
        v62.d(chipGroup6, "chipGroupEpisodes");
        list.add(chipGroup6);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) l0(C0275R$id.swipeRefreshLayout);
        v62.d(swipeRefreshLayout, "swipeRefreshLayout");
        swipeRefreshLayout.setEnabled(false);
        t0();
        v0();
        u0();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        v62.e(menu, "menu");
        getMenuInflater().inflate(C0279R$menu.menu_activity_aasv3, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        v62.e(menuItem, "item");
        if (menuItem.getItemId() != 2131296636) {
            return super.onOptionsItemSelected(menuItem);
        }
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior = this.D;
        if (bottomSheetBehavior != null) {
            mw1.r(bottomSheetBehavior);
            return true;
        }
        v62.p("bottomSheetBehaviour");
        throw null;
    }
}
