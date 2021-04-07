package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.k;
import androidx.lifecycle.e0;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.C0279R$menu;
import com.zunjae.anyme.abstracts.AbstractActivity;
import java.util.Calendar;
import java.util.HashMap;

/* renamed from: as1  reason: default package */
public final class as1 extends rs1 {
    private es1 c0;
    private final d22 d0 = g22.b(new b(this, (oh2) null, new a(this), (o52) null));
    private HashMap e0;

    /* renamed from: as1$a */
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

    /* renamed from: as1$b */
    public static final class b extends w62 implements o52<nu1> {
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

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, nu1] */
        /* renamed from: a */
        public final nu1 invoke() {
            return kg2.a(this.f, f72.b(nu1.class), this.g, this.h, this.i);
        }
    }

    /* renamed from: as1$c */
    public static final class c implements ViewPager.i {
        final /* synthetic */ as1 e;

        c(as1 as1) {
            this.e = as1;
        }

        public void a(int i, float f, int i2) {
            AbstractActivity T1 = this.e.K1();
            if (T1 != null) {
                T1.invalidateOptionsMenu();
            }
        }

        public void d(int i) {
        }

        public void e(int i) {
            AbstractActivity T1 = this.e.K1();
            if (T1 != null) {
                T1.invalidateOptionsMenu();
            }
        }
    }

    /* renamed from: as1$d */
    static final class d extends w62 implements z52<sw1, u22> {
        final /* synthetic */ as1 f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(as1 as1) {
            super(1);
            this.f = as1;
        }

        public final void a(sw1 sw1) {
            v62.e(sw1, "$receiver");
            TabLayout tabLayout = (TabLayout) this.f.Q1(C0275R$id.tabLayout);
            v62.d(tabLayout, "tabLayout");
            sw1.c(tabLayout);
            sw1.b(hw1.a.a());
            sw1.a(as1.S1(this.f));
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((sw1) obj);
            return u22.a;
        }
    }

    /* renamed from: as1$e */
    static final class e extends w62 implements z52<ve2<as1>, u22> {
        final /* synthetic */ as1 f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(as1 as1) {
            super(1);
            this.f = as1;
        }

        public final void a(ve2<as1> ve2) {
            v62.e(ve2, "$receiver");
            this.f.U1().t0();
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((ve2) obj);
            return u22.a;
        }
    }

    public static final /* synthetic */ es1 S1(as1 as1) {
        es1 es1 = as1.c0;
        if (es1 != null) {
            return es1;
        }
        v62.p("liveChartPagerAdapter");
        throw null;
    }

    /* access modifiers changed from: private */
    public final nu1 U1() {
        return (nu1) this.d0.getValue();
    }

    private final void V1() {
        int i;
        zr1 zr1;
        es1 es1;
        if (((ViewPager) Q1(C0275R$id.viewPager)) != null) {
            ViewPager viewPager = (ViewPager) Q1(C0275R$id.viewPager);
            v62.d(viewPager, "viewPager");
            switch (Calendar.getInstance().get(7)) {
                case 1:
                    es1 = this.c0;
                    if (es1 != null) {
                        zr1 = zr1.Sunday;
                        break;
                    } else {
                        v62.p("liveChartPagerAdapter");
                        throw null;
                    }
                case 2:
                    es1 = this.c0;
                    if (es1 != null) {
                        zr1 = zr1.Monday;
                        break;
                    } else {
                        v62.p("liveChartPagerAdapter");
                        throw null;
                    }
                case 3:
                    es1 = this.c0;
                    if (es1 != null) {
                        zr1 = zr1.Tuesday;
                        break;
                    } else {
                        v62.p("liveChartPagerAdapter");
                        throw null;
                    }
                case 4:
                    es1 = this.c0;
                    if (es1 != null) {
                        zr1 = zr1.Wednesday;
                        break;
                    } else {
                        v62.p("liveChartPagerAdapter");
                        throw null;
                    }
                case 5:
                    es1 = this.c0;
                    if (es1 != null) {
                        zr1 = zr1.Thursday;
                        break;
                    } else {
                        v62.p("liveChartPagerAdapter");
                        throw null;
                    }
                case 6:
                    es1 = this.c0;
                    if (es1 != null) {
                        zr1 = zr1.Friday;
                        break;
                    } else {
                        v62.p("liveChartPagerAdapter");
                        throw null;
                    }
                case 7:
                    es1 = this.c0;
                    if (es1 != null) {
                        zr1 = zr1.Saturday;
                        break;
                    } else {
                        v62.p("liveChartPagerAdapter");
                        throw null;
                    }
                default:
                    i = 1;
                    break;
            }
            i = es1.w(zr1);
            viewPager.setCurrentItem(i);
        }
    }

    public void J1() {
        HashMap hashMap = this.e0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void L1(Intent intent) {
    }

    public int M1() {
        return C0279R$menu.menu_livechart;
    }

    public int N1() {
        return C0278R$layout.fragment_livechart;
    }

    public void O1() {
        V1();
    }

    public void P1(MenuItem menuItem) {
        v62.e(menuItem, "item");
        if (menuItem.getItemId() == 2131296305) {
            V1();
        }
    }

    public View Q1(int i) {
        if (this.e0 == null) {
            this.e0 = new HashMap();
        }
        View view = (View) this.e0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View Q = Q();
        if (Q == null) {
            return null;
        }
        View findViewById = Q.findViewById(i);
        this.e0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void h0(Bundle bundle) {
        super.h0(bundle);
        k t = t();
        v62.d(t, "childFragmentManager");
        this.c0 = new es1(t);
        ((ViewPager) Q1(C0275R$id.viewPager)).c(new c(this));
        ViewPager viewPager = (ViewPager) Q1(C0275R$id.viewPager);
        v62.d(viewPager, "viewPager");
        mw1.p(viewPager, new d(this));
        ViewPager viewPager2 = (ViewPager) Q1(C0275R$id.viewPager);
        v62.d(viewPager2, "viewPager");
        es1 es1 = this.c0;
        if (es1 != null) {
            viewPager2.setCurrentItem(es1.w(zr1.MyShow));
            we2.c(this, (z52) null, new e(this), 1, (Object) null);
            return;
        }
        v62.p("liveChartPagerAdapter");
        throw null;
    }

    public /* synthetic */ void u0() {
        super.u0();
        J1();
    }
}
