package defpackage;

import androidx.fragment.app.q;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

/* renamed from: sw1  reason: default package */
public final class sw1 {
    private final ViewPager a;

    public sw1(ViewPager viewPager) {
        v62.e(viewPager, "viewPager");
        this.a = viewPager;
    }

    public final void a(q qVar) {
        v62.e(qVar, "adapter");
        this.a.setAdapter(qVar);
    }

    public final void b(ViewPager.j jVar) {
        v62.e(jVar, "transformer");
        this.a.R(true, jVar);
    }

    public final void c(TabLayout tabLayout) {
        v62.e(tabLayout, "tabLayout");
        tabLayout.setupWithViewPager(this.a);
        this.a.c(new TabLayout.h(tabLayout));
    }
}
