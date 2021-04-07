package defpackage;

import android.content.ComponentCallbacks;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.e0;
import androidx.lifecycle.u;
import androidx.viewpager.widget.ViewPager;
import androidx.work.j;
import androidx.work.n;
import androidx.work.o;
import com.afollestad.materialdialogs.f;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.C0279R$menu;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.features.discover.local_search.LocalAnimeSearchActivity;
import com.zunjae.anyme.features.workers.KitsuWorker;
import com.zunjae.anyme.features.workers.UserProfileWorker;
import com.zunjae.anyme.features.workers.UserStatsWorker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: ss1  reason: default package */
public final class ss1 extends rs1 {
    public static final e h0 = new e((r62) null);
    private final d22 c0 = g22.b(new a(this, (oh2) null, (o52) null));
    private final d22 d0 = g22.b(new b(this, (oh2) null, (o52) null));
    private final d22 e0 = g22.b(new d(this, (oh2) null, new c(this), (o52) null));
    private com.zunjae.anyme.features.anime.shows_list.c f0;
    private HashMap g0;

    /* renamed from: ss1$a */
    public static final class a extends w62 implements o52<ut1> {
        final /* synthetic */ ComponentCallbacks f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacks componentCallbacks, oh2 oh2, o52 o52) {
            super(0);
            this.f = componentCallbacks;
            this.g = oh2;
            this.h = o52;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [ut1, java.lang.Object] */
        public final ut1 invoke() {
            ComponentCallbacks componentCallbacks = this.f;
            return hg2.a(componentCallbacks).c().e(f72.b(ut1.class), this.g, this.h);
        }
    }

    /* renamed from: ss1$b */
    public static final class b extends w62 implements o52<hy1> {
        final /* synthetic */ ComponentCallbacks f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ComponentCallbacks componentCallbacks, oh2 oh2, o52 o52) {
            super(0);
            this.f = componentCallbacks;
            this.g = oh2;
            this.h = o52;
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [hy1, java.lang.Object] */
        public final hy1 invoke() {
            ComponentCallbacks componentCallbacks = this.f;
            return hg2.a(componentCallbacks).c().e(f72.b(hy1.class), this.g, this.h);
        }
    }

    /* renamed from: ss1$c */
    public static final class c extends w62 implements o52<e0> {
        final /* synthetic */ Fragment f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
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

    /* renamed from: ss1$d */
    public static final class d extends w62 implements o52<nu1> {
        final /* synthetic */ Fragment f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;
        final /* synthetic */ o52 i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment, oh2 oh2, o52 o52, o52 o522) {
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

    /* renamed from: ss1$e */
    public static final class e {
        private e() {
        }

        public /* synthetic */ e(r62 r62) {
            this();
        }

        public final ss1 a(boolean z) {
            ss1 ss1 = new ss1();
            Bundle bundle = new Bundle();
            bundle.putBoolean("avoidRefresh", z);
            u22 u22 = u22.a;
            ss1.u1(bundle);
            return ss1;
        }
    }

    /* renamed from: ss1$f */
    static final class f extends w62 implements z52<sw1, u22> {
        final /* synthetic */ ss1 f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(ss1 ss1) {
            super(1);
            this.f = ss1;
        }

        public final void a(sw1 sw1) {
            v62.e(sw1, "$receiver");
            TabLayout tabLayout = (TabLayout) this.f.Q1(C0275R$id.tabLayout);
            v62.d(tabLayout, "tabLayout");
            sw1.c(tabLayout);
            sw1.b(hw1.a.a());
            sw1.a(ss1.S1(this.f));
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((sw1) obj);
            return u22.a;
        }
    }

    /* renamed from: ss1$g */
    static final class g extends w62 implements z52<ve2<ss1>, u22> {
        final /* synthetic */ ss1 f;
        final /* synthetic */ String g;
        final /* synthetic */ Snackbar h;

        /* renamed from: ss1$g$a */
        static final class a extends w62 implements z52<ss1, u22> {
            final /* synthetic */ g f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(g gVar) {
                super(1);
                this.f = gVar;
            }

            public final void a(ss1 ss1) {
                v62.e(ss1, "it");
                this.f.h.t();
            }

            public /* bridge */ /* synthetic */ Object r(Object obj) {
                a((ss1) obj);
                return u22.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(ss1 ss1, String str, Snackbar snackbar) {
            super(1);
            this.f = ss1;
            this.g = str;
            this.h = snackbar;
        }

        public final void a(ve2<ss1> ve2) {
            ArrayList<sy1> arrayList;
            v62.e(ve2, "$receiver");
            List list = null;
            try {
                arrayList = this.f.X1().c(this.g);
            } catch (Exception e) {
                uj2.d(e);
                arrayList = null;
            }
            try {
                list = this.f.Z1().k().h().a();
            } catch (Exception e2) {
                uj2.d(e2);
            }
            this.f.Y1().i0(arrayList, list);
            if (arrayList != null) {
                this.f.e2();
            }
            ow1.a(ve2, new a(this));
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((ve2) obj);
            return u22.a;
        }
    }

    /* renamed from: ss1$h */
    static final class h<T> implements u<List<? extends vv1>> {
        final /* synthetic */ ss1 a;
        final /* synthetic */ com.zunjae.anyme.features.anime.shows_list.b[] b;

        h(ss1 ss1, com.zunjae.anyme.features.anime.shows_list.b[] bVarArr) {
            this.a = ss1;
            this.b = bVarArr;
        }

        /* renamed from: b */
        public final void a(List<vv1> list) {
            T t;
            TabLayout.g w;
            boolean z;
            if (list != null) {
                for (com.zunjae.anyme.features.anime.shows_list.b bVar : this.b) {
                    if (bVar.getTabContentType() != 201) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it.next();
                            if (((vv1) t).b() == bVar.getTabContentType()) {
                                z = true;
                                continue;
                            } else {
                                z = false;
                                continue;
                            }
                            if (z) {
                                break;
                            }
                        }
                        vv1 vv1 = (vv1) t;
                        int a2 = vv1 != null ? vv1.a() : 0;
                        TabLayout tabLayout = (TabLayout) this.a.Q1(C0275R$id.tabLayout);
                        if (!(tabLayout == null || (w = tabLayout.w(bVar.getTabPosition())) == null)) {
                            w.s(bVar.getTitle() + " (" + a2 + ')');
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ss1$i */
    static final class i implements f.k {
        final /* synthetic */ ss1 a;

        i(ss1 ss1) {
            this.a = ss1;
        }

        public final boolean a(com.afollestad.materialdialogs.f fVar, View view, int i, CharSequence charSequence) {
            if (i == 0) {
                dz1.a.d(false);
            } else if (i == 1) {
                dz1.a.d(true);
            }
            this.a.d2();
            return true;
        }
    }

    /* renamed from: ss1$j */
    static final class j implements CompoundButton.OnCheckedChangeListener {
        public static final j a = new j();

        j() {
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            dz1.a.d(z);
        }
    }

    /* renamed from: ss1$k */
    static final class k implements f.k {
        final /* synthetic */ gz1[] a;
        final /* synthetic */ int b;

        k(gz1[] gz1Arr, int i) {
            this.a = gz1Arr;
            this.b = i;
        }

        public final boolean a(com.afollestad.materialdialogs.f fVar, View view, int i, CharSequence charSequence) {
            dz1.a.c(this.a[i].getCode(), Integer.valueOf(this.b));
            cw1.k.a().i(new hv1());
            return false;
        }
    }

    public static final /* synthetic */ com.zunjae.anyme.features.anime.shows_list.c S1(ss1 ss1) {
        com.zunjae.anyme.features.anime.shows_list.c cVar = ss1.f0;
        if (cVar != null) {
            return cVar;
        }
        v62.p("animeListStatusAdapter");
        throw null;
    }

    /* access modifiers changed from: private */
    public final hy1 X1() {
        return (hy1) this.d0.getValue();
    }

    /* access modifiers changed from: private */
    public final nu1 Y1() {
        return (nu1) this.e0.getValue();
    }

    /* access modifiers changed from: private */
    public final ut1 Z1() {
        return (ut1) this.c0.getValue();
    }

    private final void b2() {
        Y1().O().g(R(), new h(this, com.zunjae.anyme.features.anime.shows_list.b.values()));
    }

    private final void c2() {
        List h2 = f32.h("Globally", "Specific Screen");
        boolean f2 = dz1.a.f();
        f.e eVar = new f.e(o1());
        eVar.E("Pick an option");
        eVar.i("Do you want to remember the sort order globally or for the specific screen?");
        eVar.q(h2);
        eVar.u(f2 ? 1 : 0, new i(this));
        eVar.D();
    }

    /* access modifiers changed from: private */
    public final void d2() {
        ViewPager viewPager = (ViewPager) Q1(C0275R$id.viewPager);
        Integer a2 = com.zunjae.anyme.features.anime.shows_list.b.Companion.a(viewPager != null ? viewPager.getCurrentItem() : 0);
        int intValue = a2 != null ? a2.intValue() : 0;
        gz1[] values = gz1.values();
        boolean f2 = dz1.a.f();
        int a3 = dz1.a.a(intValue);
        f.e eVar = new f.e(o1());
        eVar.E("Select a sort order");
        ArrayList arrayList = new ArrayList(values.length);
        for (gz1 gz1 : values) {
            arrayList.add(gz1.toString());
        }
        eVar.q(arrayList);
        eVar.g("Remember for specific screen?", f2, j.a);
        eVar.u(a3, new k(values, intValue));
        eVar.B("Save");
        eVar.D();
    }

    /* access modifiers changed from: private */
    public final void e2() {
        o b2 = new j.a(KitsuWorker.class).b();
        v62.d(b2, "OneTimeWorkRequestBuilde…SECONDS)\n        .build()");
        o b3 = new j.a(UserProfileWorker.class).b();
        v62.d(b3, "OneTimeWorkRequestBuilde…orker>()\n        .build()");
        j.a aVar = new j.a(UserStatsWorker.class);
        aVar.h(6, TimeUnit.SECONDS);
        o b4 = aVar.b();
        v62.d(b4, "OneTimeWorkRequestBuilde…SECONDS)\n        .build()");
        n.c().b("BakaThotBunProfile", androidx.work.f.REPLACE, f32.h((androidx.work.j) b2, (androidx.work.j) b3, (androidx.work.j) b4)).a();
    }

    public void J0(Bundle bundle) {
        v62.e(bundle, "outState");
        super.J0(bundle);
        ViewPager viewPager = (ViewPager) Q1(C0275R$id.viewPager);
        bundle.putInt("viewpagerPosition", viewPager != null ? viewPager.getCurrentItem() : 0);
    }

    public void J1() {
        HashMap hashMap = this.g0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void L1(Intent intent) {
    }

    public int M1() {
        return C0279R$menu.menu_new_home;
    }

    public void N0(Bundle bundle) {
        super.N0(bundle);
        if (bundle != null) {
            bundle.getInt("viewpagerPosition");
        }
    }

    public int N1() {
        return C0278R$layout.controller_profile;
    }

    public void O1() {
        AbstractActivity K1 = K1();
        if (K1 != null) {
            LocalAnimeSearchActivity.c cVar = LocalAnimeSearchActivity.I;
            AbstractActivity K12 = K1();
            v62.c(K12);
            K1.startActivity(LocalAnimeSearchActivity.c.b(cVar, K12, false, 2, (Object) null));
        }
    }

    public void P1(MenuItem menuItem) {
        Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
        if (valueOf != null && valueOf.intValue() == 2131297058) {
            AbstractActivity K1 = K1();
            if (K1 != null) {
                LocalAnimeSearchActivity.c cVar = LocalAnimeSearchActivity.I;
                AbstractActivity K12 = K1();
                v62.c(K12);
                K1.startActivity(LocalAnimeSearchActivity.c.b(cVar, K12, false, 2, (Object) null));
            }
        } else if (valueOf != null && valueOf.intValue() == 2131297212) {
            if (K1() != null) {
                a2();
            }
        } else if (valueOf != null && valueOf.intValue() == 2131297213) {
            c2();
        }
    }

    public View Q1(int i2) {
        if (this.g0 == null) {
            this.g0 = new HashMap();
        }
        View view = (View) this.g0.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View Q = Q();
        if (Q == null) {
            return null;
        }
        View findViewById = Q.findViewById(i2);
        this.g0.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final void a2() {
        String t = fz1.a.t();
        if (t != null) {
            pw1 pw1 = pw1.a;
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) Q1(C0275R$id.coordinator);
            v62.d(coordinatorLayout, "coordinator");
            Snackbar c2 = pw1.c(pw1, coordinatorLayout, "Refreshing your profile, please wait", (qw1) null, 4, (Object) null);
            c2.R();
            we2.c(this, (z52) null, new g(this, t, c2), 1, (Object) null);
        }
    }

    public void h0(Bundle bundle) {
        super.h0(bundle);
        v62.d(FirebaseAnalytics.getInstance(o1()), "FirebaseAnalytics.getInstance(requireContext())");
        androidx.fragment.app.k t = t();
        v62.d(t, "childFragmentManager");
        this.f0 = new com.zunjae.anyme.features.anime.shows_list.c(t);
        ViewPager viewPager = (ViewPager) Q1(C0275R$id.viewPager);
        v62.d(viewPager, "viewPager");
        mw1.p(viewPager, new f(this));
        ViewPager viewPager2 = (ViewPager) Q1(C0275R$id.viewPager);
        v62.d(viewPager2, "viewPager");
        viewPager2.setOffscreenPageLimit(2);
        b2();
        if (!n1().getBoolean("avoidRefresh", true)) {
            a2();
            Bundle s = s();
            if (s != null) {
                s.remove("avoidRefresh");
            }
        }
    }

    public /* synthetic */ void u0() {
        super.u0();
        J1();
    }
}
