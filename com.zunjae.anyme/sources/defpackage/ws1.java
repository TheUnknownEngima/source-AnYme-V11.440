package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.k;
import androidx.viewpager.widget.ViewPager;
import com.afollestad.materialdialogs.f;
import com.google.android.material.tabs.TabLayout;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.C0279R$menu;
import com.zunjae.anyme.features.discover.advanced_search_v3.AdvancedSearchV3Activity;
import com.zunjae.anyme.features.discover.fast_search.FastAnimeSearchActivity;
import com.zunjae.anyme.features.discover.seasonal.SeasonalAnimeActivity;
import com.zunjae.anyme.features.recommendations.UserRecsActivity;
import java.util.HashMap;
import java.util.List;

/* renamed from: ws1  reason: default package */
public final class ws1 extends rs1 {
    private HashMap c0;

    /* renamed from: ws1$a */
    static final class a extends w62 implements z52<sw1, u22> {
        final /* synthetic */ ws1 f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ws1 ws1) {
            super(1);
            this.f = ws1;
        }

        public final void a(sw1 sw1) {
            v62.e(sw1, "$receiver");
            k t = this.f.t();
            v62.d(t, "childFragmentManager");
            sw1.a(new us1(t));
            TabLayout tabLayout = (TabLayout) this.f.Q1(C0275R$id.tabLayout);
            v62.d(tabLayout, "tabLayout");
            sw1.c(tabLayout);
            sw1.b(hw1.a.a());
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((sw1) obj);
            return u22.a;
        }
    }

    /* renamed from: ws1$b */
    static final class b implements f.i {
        final /* synthetic */ ws1 a;

        b(ws1 ws1) {
            this.a = ws1;
        }

        public final void a(f fVar, View view, int i, CharSequence charSequence) {
            Intent intent;
            ws1 ws1;
            if (i == 0) {
                ws1 = this.a;
                intent = new Intent(this.a.o1(), FastAnimeSearchActivity.class);
            } else if (i == 1) {
                ws1 = this.a;
                intent = new Intent(this.a.o1(), AdvancedSearchV3Activity.class);
            } else if (i == 2) {
                ws1 = this.a;
                intent = new Intent(this.a.o1(), SeasonalAnimeActivity.class);
            } else if (i == 3) {
                ws1 = this.a;
                intent = new Intent(this.a.o1(), UserRecsActivity.class);
            } else {
                return;
            }
            ws1.E1(intent);
        }
    }

    private final void R1() {
        List h = f32.h("By Title", "Using Search Filters", "By Season", "See Recommendations");
        f.e eVar = new f.e(o1());
        eVar.E("How do you want to explore Anime?");
        eVar.q(h);
        eVar.s(new b(this));
        eVar.D();
    }

    public void J1() {
        HashMap hashMap = this.c0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void L1(Intent intent) {
    }

    public int M1() {
        return C0279R$menu.menu_activity_discover;
    }

    public int N1() {
        return C0278R$layout.fragment_root_discover;
    }

    public void O1() {
        if (K1() != null) {
            E1(new Intent(K1(), AdvancedSearchV3Activity.class));
        }
    }

    public void P1(MenuItem menuItem) {
        v62.e(menuItem, "item");
        if (menuItem.getItemId() == 2131297058) {
            R1();
            return;
        }
        throw new k22("An operation is not implemented: " + "Not implemented");
    }

    public View Q1(int i) {
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
        ViewPager viewPager = (ViewPager) Q1(C0275R$id.viewPager);
        v62.d(viewPager, "viewPager");
        mw1.p(viewPager, new a(this));
        Bundle s = s();
        viewPager.setCurrentItem(s != null ? s.getInt("viewPagerPosition") : 0);
    }

    public /* synthetic */ void u0() {
        super.u0();
        J1();
    }
}
