package com.zunjae.anyme.features.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.k;
import androidx.lifecycle.n;
import androidx.lifecycle.u;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.button.MaterialButton;
import com.zunjae.anyme.C0275R$id;
import com.zunjae.anyme.C0278R$layout;
import com.zunjae.anyme.HomeActivity;
import com.zunjae.anyme.abstracts.AbstractActivity;
import com.zunjae.vresult.a;
import java.util.HashMap;
import java.util.List;

public final class WelcomeActivity extends AbstractActivity {
    private b D;
    private final d22 E = g22.b(new a(this, (oh2) null, (o52) null));
    private HashMap F;

    public static final class a extends w62 implements o52<com.zunjae.anyme.features.niche.b> {
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

        /* JADX WARNING: type inference failed for: r0v1, types: [com.zunjae.anyme.features.niche.b, androidx.lifecycle.a0] */
        /* renamed from: a */
        public final com.zunjae.anyme.features.niche.b invoke() {
            return lg2.b(this.f, f72.b(com.zunjae.anyme.features.niche.b.class), this.g, this.h);
        }
    }

    static final class b<T> implements u<com.zunjae.vresult.a<? extends List<? extends xt1>>> {
        final /* synthetic */ WelcomeActivity a;

        b(WelcomeActivity welcomeActivity) {
            this.a = welcomeActivity;
        }

        /* renamed from: b */
        public final void a(com.zunjae.vresult.a<? extends List<xt1>> aVar) {
            if (!(aVar instanceof a.c)) {
                if (aVar instanceof a.e) {
                    WelcomeActivity.m0(this.a).w((List) ((a.e) aVar).b());
                } else if (!(aVar instanceof a.d)) {
                    boolean z = aVar instanceof a.b;
                }
            }
        }
    }

    static final class c extends w62 implements z52<sw1, u22> {
        final /* synthetic */ WelcomeActivity f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(WelcomeActivity welcomeActivity) {
            super(1);
            this.f = welcomeActivity;
        }

        public final void a(sw1 sw1) {
            v62.e(sw1, "$receiver");
            sw1.b(hw1.a.a());
            sw1.a(WelcomeActivity.m0(this.f));
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            a((sw1) obj);
            return u22.a;
        }
    }

    static final class d implements View.OnClickListener {
        final /* synthetic */ WelcomeActivity e;

        d(WelcomeActivity welcomeActivity) {
            this.e = welcomeActivity;
        }

        public final void onClick(View view) {
            this.e.h0("https://myanimelist.net/register.php");
            Toast makeText = Toast.makeText(this.e, "MAKE SURE YOU PICK A PASSWORD YOU DO NOT USE ANYWHERE ELSE!", 1);
            makeText.show();
            v62.b(makeText, "Toast\n        .makeText(…         show()\n        }");
        }
    }

    static final class e implements View.OnClickListener {
        final /* synthetic */ WelcomeActivity e;

        e(WelcomeActivity welcomeActivity) {
            this.e = welcomeActivity;
        }

        public final void onClick(View view) {
            this.e.startActivity(new Intent(this.e, HomeActivity.class));
        }
    }

    static final class f implements View.OnClickListener {
        final /* synthetic */ WelcomeActivity e;

        f(WelcomeActivity welcomeActivity) {
            this.e = welcomeActivity;
        }

        public final void onClick(View view) {
            this.e.startActivity(new Intent(this.e, LoginActivity.class));
        }
    }

    public static final /* synthetic */ b m0(WelcomeActivity welcomeActivity) {
        b bVar = welcomeActivity.D;
        if (bVar != null) {
            return bVar;
        }
        v62.p("adapter");
        throw null;
    }

    private final com.zunjae.anyme.features.niche.b n0() {
        return (com.zunjae.anyme.features.niche.b) this.E.getValue();
    }

    private final void o0() {
        n0().m().g(this, new b(this));
    }

    private final void p0() {
        ((MaterialButton) l0(C0275R$id.registerButton)).setOnClickListener(new d(this));
        ((TextView) l0(C0275R$id.noAccount)).setOnClickListener(new e(this));
        ((MaterialButton) l0(C0275R$id.loginButton)).setOnClickListener(new f(this));
    }

    public View l0(int i) {
        if (this.F == null) {
            this.F = new HashMap();
        }
        View view = (View) this.F.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.F.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0278R$layout.activity_login_r2);
        k q = q();
        v62.d(q, "supportFragmentManager");
        this.D = new b(q);
        ViewPager viewPager = (ViewPager) l0(C0275R$id.viewPager);
        v62.d(viewPager, "viewPager");
        mw1.p(viewPager, new c(this));
        p0();
        o0();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        n0().t();
    }
}
