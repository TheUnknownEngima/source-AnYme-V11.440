package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$drawable;
import androidx.appcompat.R$id;
import androidx.appcompat.R$string;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.Toolbar;
import com.github.mikephil.charting.utils.Utils;

public class h0 implements p {
    Toolbar a;
    private int b;
    private View c;
    private View d;
    private Drawable e;
    private Drawable f;
    private Drawable g;
    private boolean h;
    CharSequence i;
    private CharSequence j;
    private CharSequence k;
    Window.Callback l;
    boolean m;
    private c n;
    private int o;
    private int p;
    private Drawable q;

    class a implements View.OnClickListener {
        final androidx.appcompat.view.menu.a e = new androidx.appcompat.view.menu.a(h0.this.a.getContext(), 0, 16908332, 0, 0, h0.this.i);

        a() {
        }

        public void onClick(View view) {
            h0 h0Var = h0.this;
            Window.Callback callback = h0Var.l;
            if (callback != null && h0Var.m) {
                callback.onMenuItemSelected(0, this.e);
            }
        }
    }

    class b extends v4 {
        private boolean a = false;
        final /* synthetic */ int b;

        b(int i) {
            this.b = i;
        }

        public void a(View view) {
            this.a = true;
        }

        public void b(View view) {
            if (!this.a) {
                h0.this.a.setVisibility(this.b);
            }
        }

        public void c(View view) {
            h0.this.a.setVisibility(0);
        }
    }

    public h0(Toolbar toolbar, boolean z) {
        this(toolbar, z, R$string.abc_action_bar_up_description, R$drawable.abc_ic_ab_back_material);
    }

    public h0(Toolbar toolbar, boolean z, int i2, int i3) {
        Drawable drawable;
        this.o = 0;
        this.p = 0;
        this.a = toolbar;
        this.i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        this.h = this.i != null;
        this.g = toolbar.getNavigationIcon();
        g0 u = g0.u(toolbar.getContext(), (AttributeSet) null, R$styleable.ActionBar, R$attr.actionBarStyle, 0);
        this.q = u.g(R$styleable.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence p2 = u.p(R$styleable.ActionBar_title);
            if (!TextUtils.isEmpty(p2)) {
                setTitle(p2);
            }
            CharSequence p3 = u.p(R$styleable.ActionBar_subtitle);
            if (!TextUtils.isEmpty(p3)) {
                m(p3);
            }
            Drawable g2 = u.g(R$styleable.ActionBar_logo);
            if (g2 != null) {
                E(g2);
            }
            Drawable g3 = u.g(R$styleable.ActionBar_icon);
            if (g3 != null) {
                setIcon(g3);
            }
            if (this.g == null && (drawable = this.q) != null) {
                z(drawable);
            }
            l(u.k(R$styleable.ActionBar_displayOptions, 0));
            int n2 = u.n(R$styleable.ActionBar_customNavigationLayout, 0);
            if (n2 != 0) {
                C(LayoutInflater.from(this.a.getContext()).inflate(n2, this.a, false));
                l(this.b | 16);
            }
            int m2 = u.m(R$styleable.ActionBar_height, 0);
            if (m2 > 0) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = m2;
                this.a.setLayoutParams(layoutParams);
            }
            int e2 = u.e(R$styleable.ActionBar_contentInsetStart, -1);
            int e3 = u.e(R$styleable.ActionBar_contentInsetEnd, -1);
            if (e2 >= 0 || e3 >= 0) {
                this.a.H(Math.max(e2, 0), Math.max(e3, 0));
            }
            int n3 = u.n(R$styleable.ActionBar_titleTextStyle, 0);
            if (n3 != 0) {
                Toolbar toolbar2 = this.a;
                toolbar2.L(toolbar2.getContext(), n3);
            }
            int n4 = u.n(R$styleable.ActionBar_subtitleTextStyle, 0);
            if (n4 != 0) {
                Toolbar toolbar3 = this.a;
                toolbar3.K(toolbar3.getContext(), n4);
            }
            int n5 = u.n(R$styleable.ActionBar_popupTheme, 0);
            if (n5 != 0) {
                this.a.setPopupTheme(n5);
            }
        } else {
            this.b = B();
        }
        u.v();
        D(i2);
        this.k = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener(new a());
    }

    private int B() {
        if (this.a.getNavigationIcon() == null) {
            return 11;
        }
        this.q = this.a.getNavigationIcon();
        return 15;
    }

    private void G(CharSequence charSequence) {
        this.i = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setTitle(charSequence);
        }
    }

    private void H() {
        if ((this.b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.k)) {
            this.a.setNavigationContentDescription(this.p);
        } else {
            this.a.setNavigationContentDescription(this.k);
        }
    }

    private void I() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.b & 4) != 0) {
            toolbar = this.a;
            drawable = this.g;
            if (drawable == null) {
                drawable = this.q;
            }
        } else {
            toolbar = this.a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void J() {
        Drawable drawable;
        int i2 = this.b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) == 0 || (drawable = this.f) == null) {
            drawable = this.e;
        }
        this.a.setLogo(drawable);
    }

    public void A(boolean z) {
        this.a.setCollapsible(z);
    }

    public void C(View view) {
        View view2 = this.d;
        if (!(view2 == null || (this.b & 16) == 0)) {
            this.a.removeView(view2);
        }
        this.d = view;
        if (view != null && (this.b & 16) != 0) {
            this.a.addView(view);
        }
    }

    public void D(int i2) {
        if (i2 != this.p) {
            this.p = i2;
            if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
                w(this.p);
            }
        }
    }

    public void E(Drawable drawable) {
        this.f = drawable;
        J();
    }

    public void F(CharSequence charSequence) {
        this.k = charSequence;
        H();
    }

    public void a(Menu menu, m.a aVar) {
        if (this.n == null) {
            c cVar = new c(this.a.getContext());
            this.n = cVar;
            cVar.t(R$id.action_menu_presenter);
        }
        this.n.k(aVar);
        this.a.I((g) menu, this.n);
    }

    public boolean b() {
        return this.a.A();
    }

    public void c() {
        this.m = true;
    }

    public void collapseActionView() {
        this.a.e();
    }

    public boolean d() {
        return this.a.d();
    }

    public Context e() {
        return this.a.getContext();
    }

    public boolean f() {
        return this.a.z();
    }

    public boolean g() {
        return this.a.w();
    }

    public CharSequence getTitle() {
        return this.a.getTitle();
    }

    public boolean h() {
        return this.a.O();
    }

    public void i() {
        this.a.f();
    }

    public void j(z zVar) {
        Toolbar toolbar;
        View view = this.c;
        if (view != null && view.getParent() == (toolbar = this.a)) {
            toolbar.removeView(this.c);
        }
        this.c = zVar;
        if (zVar != null && this.o == 2) {
            this.a.addView(zVar, 0);
            Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.c.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.a = 8388691;
            zVar.setAllowCollapse(true);
        }
    }

    public boolean k() {
        return this.a.v();
    }

    public void l(int i2) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i3 = this.b ^ i2;
        this.b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    H();
                }
                I();
            }
            if ((i3 & 3) != 0) {
                J();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.a.setTitle(this.i);
                    toolbar = this.a;
                    charSequence = this.j;
                } else {
                    charSequence = null;
                    this.a.setTitle((CharSequence) null);
                    toolbar = this.a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i3 & 16) != 0 && (view = this.d) != null) {
                if ((i2 & 16) != 0) {
                    this.a.addView(view);
                } else {
                    this.a.removeView(view);
                }
            }
        }
    }

    public void m(CharSequence charSequence) {
        this.j = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setSubtitle(charSequence);
        }
    }

    public Menu n() {
        return this.a.getMenu();
    }

    public void o(int i2) {
        E(i2 != 0 ? f.d(e(), i2) : null);
    }

    public int p() {
        return this.o;
    }

    public t4 q(int i2, long j2) {
        t4 c2 = o4.c(this.a);
        c2.a(i2 == 0 ? 1.0f : Utils.FLOAT_EPSILON);
        c2.e(j2);
        c2.g(new b(i2));
        return c2;
    }

    public void r(int i2) {
        z(i2 != 0 ? f.d(e(), i2) : null);
    }

    public void s(m.a aVar, g.a aVar2) {
        this.a.J(aVar, aVar2);
    }

    public void setIcon(int i2) {
        setIcon(i2 != 0 ? f.d(e(), i2) : null);
    }

    public void setIcon(Drawable drawable) {
        this.e = drawable;
        J();
    }

    public void setTitle(CharSequence charSequence) {
        this.h = true;
        G(charSequence);
    }

    public void setVisibility(int i2) {
        this.a.setVisibility(i2);
    }

    public void setWindowCallback(Window.Callback callback) {
        this.l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.h) {
            G(charSequence);
        }
    }

    public ViewGroup t() {
        return this.a;
    }

    public void u(boolean z) {
    }

    public int v() {
        return this.b;
    }

    public void w(int i2) {
        F(i2 == 0 ? null : e().getString(i2));
    }

    public void x() {
    }

    public void y() {
    }

    public void z(Drawable drawable) {
        this.g = drawable;
        I();
    }
}
