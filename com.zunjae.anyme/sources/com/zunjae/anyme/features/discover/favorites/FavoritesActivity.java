package com.zunjae.anyme.features.discover.favorites;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.k;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.abstracts.AbstractActivity;
import java.util.HashMap;

public final class FavoritesActivity extends AbstractActivity {
    public static final a E = new a((r62) null);
    private HashMap D;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final Intent a(Context context, int i) {
            v62.e(context, "context");
            Intent intent = new Intent(context, FavoritesActivity.class);
            intent.putExtra("pageNumber", i);
            return intent;
        }
    }

    static final class b extends w62 implements z52<sw1, u22> {
        final /* synthetic */ FavoritesActivity f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(FavoritesActivity favoritesActivity) {
            super(1);
            this.f = favoritesActivity;
        }

        public final void a(sw1 sw1) {
            v62.e(sw1, "$receiver");
            TabLayout tabLayout = (TabLayout) this.f.l0(C0275R$id.tabLayout);
            v62.d(tabLayout, "tabLayout");
            sw1.c(tabLayout);
            sw1.b(hw1.a.a());
            k q = this.f.q();
            v62.d(q, "supportFragmentManager");
            sw1.a(new a(q));
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((sw1) obj);
            return u22.a;
        }
    }

    public View l0(int i) {
        if (this.D == null) {
            this.D = new HashMap();
        }
        View view = (View) this.D.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.D.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0278R$layout.activity_favorites);
        Toolbar toolbar = (Toolbar) l0(C0275R$id.toolbar);
        v62.d(toolbar, "toolbar");
        AbstractActivity.k0(this, toolbar, "Favorites", (String) null, true, 4, (Object) null);
        ViewPager viewPager = (ViewPager) l0(C0275R$id.viewPager);
        v62.d(viewPager, "viewPager");
        mw1.p(viewPager, new b(this));
        int intExtra = getIntent().getIntExtra("pageNumber", 0);
        ViewPager viewPager2 = (ViewPager) l0(C0275R$id.viewPager);
        v62.d(viewPager2, "viewPager");
        viewPager2.setCurrentItem(intExtra);
    }

    public void onStart() {
        super.onStart();
        cw1.k.a().j(this);
    }

    public void onStop() {
        super.onStop();
        cw1.k.a().l(this);
    }

    @vq1
    public final void onTabCountReceived(jv1 jv1) {
        String str;
        StringBuilder sb;
        TabLayout.g gVar;
        v62.e(jv1, "bus");
        int a2 = jv1.a();
        if (a2 == 7) {
            gVar = ((TabLayout) l0(C0275R$id.tabLayout)).w(0);
            if (gVar != null) {
                sb = new StringBuilder();
                str = "Shows (";
            } else {
                return;
            }
        } else if (a2 == 8 && (gVar = ((TabLayout) l0(C0275R$id.tabLayout)).w(1)) != null) {
            sb = new StringBuilder();
            str = "Waifus (";
        } else {
            return;
        }
        sb.append(str);
        sb.append(jv1.b());
        sb.append(')');
        gVar.s(sb.toString());
    }
}
