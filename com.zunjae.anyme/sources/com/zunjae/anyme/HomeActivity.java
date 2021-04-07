package com.zunjae.anyme;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.n;
import androidx.lifecycle.u;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.anyme.features.anime.info_screen.AnimeInfoActivity;
import com.zunjae.anyme.features.login.AuthUserActivity;
import com.zunjae.anyme.features.login.LoginBrowser;
import java.util.ArrayList;
import java.util.HashMap;

@SuppressLint({"DefaultLocale"})
public final class HomeActivity extends AbstractActivity {
    public static final c L = new c((r62) null);
    private final d22 D = g22.b(new a(this, (oh2) null, (o52) null));
    private final d22 E = g22.b(new b(this, (oh2) null, (o52) null));
    private lw1 F;
    private ts1 G;
    private Integer H;
    /* access modifiers changed from: private */
    public boolean I;
    private final int J = 2000;
    private HashMap K;

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

    public static final class b extends w62 implements o52<qu1> {
        final /* synthetic */ n f;
        final /* synthetic */ oh2 g;
        final /* synthetic */ o52 h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(n nVar, oh2 oh2, o52 o52) {
            super(0);
            this.f = nVar;
            this.g = oh2;
            this.h = o52;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, qu1] */
        /* renamed from: a */
        public final qu1 invoke() {
            return lg2.b(this.f, f72.b(qu1.class), this.g, this.h);
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(r62 r62) {
            this();
        }

        public final Intent a(Context context, String str) {
            v62.e(context, "context");
            Intent intent = new Intent(context, HomeActivity.class);
            intent.putExtra("Destination", str);
            return intent;
        }
    }

    static final class d implements Runnable {
        final /* synthetic */ HomeActivity e;

        d(HomeActivity homeActivity) {
            this.e = homeActivity;
        }

        public final void run() {
            this.e.I = false;
        }
    }

    static final class e extends w62 implements o52<u22> {
        final /* synthetic */ HomeActivity f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(HomeActivity homeActivity) {
            super(0);
            this.f = homeActivity;
        }

        public final void a() {
            String a = yv1.a.a(this.f);
            if (a != null && f92.s(a, "anymetoken:", false, 2, (Object) null) && !xx1.a.a()) {
                yv1.a.b(this.f, "");
                this.f.finish();
                HomeActivity homeActivity = this.f;
                homeActivity.startActivity(AuthUserActivity.D.a(homeActivity, a));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return u22.a;
        }
    }

    static final class f implements kw1 {
        final /* synthetic */ HomeActivity a;

        f(HomeActivity homeActivity) {
            this.a = homeActivity;
        }

        public final void a() {
            xy1 O = this.a.S().x().O();
            if (O != null) {
                HomeActivity homeActivity = this.a;
                homeActivity.startActivity(AnimeInfoActivity.M.b(homeActivity.T(), O));
                return;
            }
            Toast makeText = Toast.makeText(this.a, "Can not pick a random show", 0);
            makeText.show();
            v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
        }
    }

    static final class g<T> implements u<Integer> {
        final /* synthetic */ HomeActivity a;

        g(HomeActivity homeActivity) {
            this.a = homeActivity;
        }

        /* renamed from: b */
        public final void a(Integer num) {
            lw1 p0 = HomeActivity.p0(this.a);
            v62.d(num, "it");
            p0.j(num.intValue());
        }
    }

    static final class h<T> implements u<Integer> {
        public static final h a = new h();

        h() {
        }

        /* renamed from: b */
        public final void a(Integer num) {
            int intValue = num.intValue();
        }
    }

    static final class i<T> implements u<Integer> {
        final /* synthetic */ HomeActivity a;

        i(HomeActivity homeActivity) {
            this.a = homeActivity;
        }

        /* renamed from: b */
        public final void a(Integer num) {
            if (num != null) {
                HomeActivity.p0(this.a).i(num.intValue());
            }
        }
    }

    static final class j implements AHBottomNavigation.g {
        final /* synthetic */ HomeActivity a;

        j(HomeActivity homeActivity) {
            this.a = homeActivity;
        }

        public final boolean a(int i, boolean z) {
            if (z) {
                rs1 m0 = this.a.s0();
                if (m0 != null) {
                    m0.O1();
                }
            } else {
                ts1 a2 = ts1.Companion.a(i);
                if (a2 != null) {
                    this.a.w0(a2, true);
                }
            }
            return true;
        }
    }

    static final class k implements View.OnClickListener {
        final /* synthetic */ HomeActivity e;

        k(HomeActivity homeActivity) {
            this.e = homeActivity;
        }

        public final void onClick(View view) {
            this.e.g0("https://anyme.app/invite");
        }
    }

    private final void A0() {
        AHBottomNavigation aHBottomNavigation = (AHBottomNavigation) l0(C0275R$id.navigation2);
        ts1[] values = ts1.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (ts1 ts1 : values) {
            arrayList.add(new com.aurelhubert.ahbottomnavigation.a(ts1.getTitle(), ts1.getIcon()));
        }
        aHBottomNavigation.f(arrayList);
        AHBottomNavigation aHBottomNavigation2 = (AHBottomNavigation) l0(C0275R$id.navigation2);
        aHBottomNavigation2.setDefaultBackgroundColor(androidx.core.content.a.d(Q(), C0272R$color.custom_background));
        aHBottomNavigation2.setAccentColor(androidx.core.content.a.d(Q(), C0272R$color.theme_NightBlue_accent));
        aHBottomNavigation2.setTitleState(AHBottomNavigation.h.ALWAYS_SHOW);
        if (xx1.a.b()) {
            ((AHBottomNavigation) l0(C0275R$id.navigation2)).setNotificationBackgroundColor(androidx.core.content.a.d(this, C0272R$color.theme_NightBlue_accent));
            ((AHBottomNavigation) l0(C0275R$id.navigation2)).o("1", 1);
            ((AHBottomNavigation) l0(C0275R$id.navigation2)).o("1", 4);
        }
        ((AHBottomNavigation) l0(C0275R$id.navigation2)).setOnTabSelectedListener(new j(this));
    }

    @SuppressLint({"SetTextI18n"})
    private final void B0() {
        ((TextView) l0(C0275R$id.notice)).setOnClickListener(new k(this));
        if (qv1.a.j()) {
            TextView textView = (TextView) l0(C0275R$id.notice);
            v62.d(textView, "notice");
            textView.setText("You are using an older version of AnYme (" + "11.440" + "). Check the Discord server for an update!");
            TextView textView2 = (TextView) l0(C0275R$id.notice);
            v62.d(textView2, "notice");
            rw1.i(textView2);
        } else if (v62.a("beta", "beta")) {
            TextView textView3 = (TextView) l0(C0275R$id.notice);
            v62.d(textView3, "notice");
            textView3.setText("You are using AnYme BETA " + "11.440" + ", some features may not work. " + "Report bugs and post feedback on Reddit or the Discord server");
            TextView textView4 = (TextView) l0(C0275R$id.notice);
            v62.d(textView4, "notice");
            rw1.i(textView4);
        } else {
            TextView textView5 = (TextView) l0(C0275R$id.notice);
            v62.d(textView5, "notice");
            rw1.a(textView5);
        }
    }

    private final void C0() {
        if (getIntent().getBooleanExtra("apology", false)) {
            getIntent().removeExtra("apology");
            String string = getString(C0283R$string.apology_message_intent);
            v62.d(string, "getString(R.string.apology_message_intent)");
            mw1.q(this, string, "Welp");
        }
    }

    /* access modifiers changed from: private */
    public final nu1 S() {
        return (nu1) this.D.getValue();
    }

    public static final /* synthetic */ lw1 p0(HomeActivity homeActivity) {
        lw1 lw1 = homeActivity.F;
        if (lw1 != null) {
            return lw1;
        }
        v62.p("drawer");
        throw null;
    }

    /* access modifiers changed from: private */
    public final rs1 s0() {
        return (rs1) q().Y(C0275R$id.homeContainer);
    }

    private final qu1 t0() {
        return (qu1) this.E.getValue();
    }

    private final boolean u0() {
        String stringExtra = getIntent().getStringExtra("Destination");
        if (stringExtra != null) {
            v62.d(stringExtra, "intent.getStringExtra(\"D…)\n        ?: return false");
            getIntent().removeExtra("Destination");
            ts1 b2 = ts1.Companion.b(stringExtra);
            if (b2 != null) {
                w0(b2, false);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final void w0(ts1 ts1, boolean z) {
        rs1 rs1;
        if (ts1 != this.G) {
            int i2 = e.a[ts1.ordinal()];
            if (i2 == 1) {
                rs1 = ss1.h0.a(z);
            } else if (i2 == 2) {
                rs1 = new com.zunjae.anyme.features.bookmarks.d();
            } else if (i2 == 3) {
                rs1 = new ws1();
            } else if (i2 == 4) {
                rs1 = new as1();
            } else if (i2 == 5) {
                rs1 = new lu1();
            } else {
                throw new j22();
            }
            Toolbar toolbar = (Toolbar) l0(C0275R$id.toolbar);
            v62.d(toolbar, "toolbar");
            toolbar.setTitle((CharSequence) ts1.getTitle());
            s j2 = q().j();
            v62.d(j2, "supportFragmentManager.beginTransaction()");
            if (bw1.a.e()) {
                j2.s(C0267R$anim.xfade_in, C0267R$anim.xfade_out);
            }
            j2.q(C0275R$id.homeContainer, rs1);
            j2.j();
            this.G = ts1;
            AHBottomNavigation aHBottomNavigation = (AHBottomNavigation) l0(C0275R$id.navigation2);
            v62.d(aHBottomNavigation, "navigation2");
            aHBottomNavigation.setCurrentItem(ts1.getPosition());
            this.H = Integer.valueOf(rs1.M1());
            invalidateOptionsMenu();
        }
    }

    private final void x0() {
        ts1 ts1;
        rs1 s0 = s0();
        if (!(s0 instanceof ss1)) {
            if (s0 instanceof com.zunjae.anyme.features.bookmarks.d) {
                ts1 = ts1.Bookmarks;
            } else if (s0 instanceof ws1) {
                ts1 = ts1.Discover;
            } else if (s0 instanceof as1) {
                ts1 = ts1.Calendar;
            } else if (s0 instanceof lu1) {
                ts1 = ts1.Kanon;
            }
            Toolbar toolbar = (Toolbar) l0(C0275R$id.toolbar);
            v62.d(toolbar, "toolbar");
            toolbar.setTitle((CharSequence) ts1.getTitle());
            u22 u22 = u22.a;
            this.G = ts1;
        }
        ts1 = ts1.Home;
        Toolbar toolbar2 = (Toolbar) l0(C0275R$id.toolbar);
        v62.d(toolbar2, "toolbar");
        toolbar2.setTitle((CharSequence) ts1.getTitle());
        u22 u222 = u22.a;
        this.G = ts1;
    }

    private final void y0() {
        f fVar = new f(this);
        Toolbar toolbar = (Toolbar) l0(C0275R$id.toolbar);
        v62.d(toolbar, "toolbar");
        this.F = new lw1(this, toolbar, fVar);
    }

    private final void z0() {
        LiveData<Integer> H2 = S().H();
        if (H2 != null) {
            H2.g(this, new g(this));
        }
        S().v0().g(this, h.a);
        LiveData<Integer> g0 = S().g0();
        if (g0 != null) {
            g0.g(this, new i(this));
        }
    }

    public View l0(int i2) {
        if (this.K == null) {
            this.K = new HashMap();
        }
        View view = (View) this.K.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.K.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i2, int i3, Intent intent) {
        rs1 s0;
        super.onActivityResult(i2, i3, intent);
        if (i2 == lv1.f.a() && i3 == lv1.f.d()) {
            recreate();
        }
        if (i2 == 2 && i3 == -1 && (s0 = s0()) != null) {
            s0.L1(intent);
        }
    }

    public void onBackPressed() {
        if (this.I) {
            androidx.core.app.a.l(this);
            super.onBackPressed();
            return;
        }
        lw1 lw1 = this.F;
        if (lw1 == null) {
            v62.p("drawer");
            throw null;
        } else if (lw1.e().m()) {
            lw1 lw12 = this.F;
            if (lw12 != null) {
                lw12.e().a();
            } else {
                v62.p("drawer");
                throw null;
            }
        } else {
            lw1 lw13 = this.F;
            if (lw13 != null) {
                lw13.e().o();
                this.I = true;
                Toast makeText = Toast.makeText(this, "Press BACK again to exit", 0);
                makeText.show();
                v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
                new Handler().postDelayed(new d(this), (long) this.J);
                return;
            }
            v62.p("drawer");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0278R$layout.activity_new_home);
        Toolbar toolbar = (Toolbar) l0(C0275R$id.toolbar);
        v62.d(toolbar, "toolbar");
        AbstractActivity.k0(this, toolbar, "Home", (String) null, false, 12, (Object) null);
        t0().i();
        this.H = bundle != null ? com.zunjae.extensions.c.b(bundle, "currentMenu") : null;
        B0();
        A0();
        y0();
        z0();
        C0();
        if (!u0()) {
            if (bundle == null) {
                w0(fz1.a.g() ? ts1.Home : ts1.Discover, false);
            } else {
                x0();
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        Integer num = this.H;
        if (num == null) {
            return true;
        }
        getMenuInflater().inflate(num.intValue(), menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        v62.e(menuItem, "item");
        rs1 s0 = s0();
        if (s0 != null) {
            s0.P1(menuItem);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        qy1 s;
        super.onResume();
        if (fz1.a.b() && (s = fz1.a.s()) != null) {
            Toast makeText = Toast.makeText(this, "Please login again to refresh your login for the AnYme App!", 0);
            makeText.show();
            v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
            startActivity(LoginBrowser.V.a(T(), s.b(), s.a(), true));
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        v62.e(bundle, "outState");
        super.onSaveInstanceState(bundle);
        Integer num = this.H;
        if (num != null) {
            bundle.putInt("currentMenu", num.intValue());
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        cw1.k.a().j(this);
        P(new e(this));
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        cw1.k.a().l(this);
    }

    @vq1
    public final void onUserRefresh(dv1 dv1) {
        Fragment Y = q().Y(C0275R$id.homeContainer);
        if (Y instanceof ss1) {
            ((ss1) Y).a2();
        }
    }

    public final void v0(ts1 ts1) {
        v62.e(ts1, "tab");
        w0(ts1, true);
    }
}
