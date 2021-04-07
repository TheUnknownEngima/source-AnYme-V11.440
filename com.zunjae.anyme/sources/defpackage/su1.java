package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.k;
import androidx.lifecycle.e0;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import java.util.HashMap;

/* renamed from: su1  reason: default package */
public final class su1 extends Fragment {
    private final d22 a0 = g22.b(new b(this, (oh2) null, new a(this), (o52) null));
    private HashMap b0;

    /* renamed from: su1$a */
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

    /* renamed from: su1$b */
    public static final class b extends w62 implements o52<com.zunjae.anyme.features.vydia.c> {
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

        /* JADX WARNING: type inference failed for: r0v1, types: [com.zunjae.anyme.features.vydia.c, androidx.lifecycle.a0] */
        /* renamed from: a */
        public final com.zunjae.anyme.features.vydia.c invoke() {
            return kg2.a(this.f, f72.b(com.zunjae.anyme.features.vydia.c.class), this.g, this.h, this.i);
        }
    }

    /* renamed from: su1$c */
    static final class c extends w62 implements z52<sw1, u22> {
        final /* synthetic */ su1 f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(su1 su1) {
            super(1);
            this.f = su1;
        }

        public final void a(sw1 sw1) {
            v62.e(sw1, "$receiver");
            TabLayout tabLayout = (TabLayout) this.f.K1(C0275R$id.tabLayout);
            v62.d(tabLayout, "tabLayout");
            sw1.c(tabLayout);
            sw1.b(hw1.a.a());
            k t = this.f.t();
            v62.d(t, "childFragmentManager");
            sw1.a(new ru1(t, this.f.M1().h(), this.f.M1().g()));
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((sw1) obj);
            return u22.a;
        }
    }

    public su1() {
        super(C0278R$layout.fragment_player_container);
    }

    /* access modifiers changed from: private */
    public final com.zunjae.anyme.features.vydia.c M1() {
        return (com.zunjae.anyme.features.vydia.c) this.a0.getValue();
    }

    private final void N1() {
        ViewPager viewPager = (ViewPager) K1(C0275R$id.viewPager);
        v62.d(viewPager, "viewPager");
        mw1.p(viewPager, new c(this));
    }

    public void J1() {
        HashMap hashMap = this.b0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View K1(int i) {
        if (this.b0 == null) {
            this.b0 = new HashMap();
        }
        View view = (View) this.b0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View Q = Q();
        if (Q == null) {
            return null;
        }
        View findViewById = Q.findViewById(i);
        this.b0.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void h0(Bundle bundle) {
        super.h0(bundle);
        N1();
    }

    public /* synthetic */ void u0() {
        super.u0();
        J1();
    }
}
