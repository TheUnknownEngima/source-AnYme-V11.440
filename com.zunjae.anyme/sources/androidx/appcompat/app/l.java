package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.R$styleable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.p;
import androidx.appcompat.widget.z;
import com.github.mikephil.charting.utils.Utils;
import defpackage.n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class l extends ActionBar implements ActionBarOverlayLayout.d {
    private static final Interpolator B = new AccelerateInterpolator();
    private static final Interpolator C = new DecelerateInterpolator();
    final w4 A = new c();
    Context a;
    private Context b;
    ActionBarOverlayLayout c;
    ActionBarContainer d;
    p e;
    ActionBarContextView f;
    View g;
    z h;
    private boolean i;
    d j;
    n k;
    n.a l;
    private boolean m;
    private ArrayList<ActionBar.a> n = new ArrayList<>();
    private boolean o;
    private int p = 0;
    boolean q = true;
    boolean r;
    boolean s;
    private boolean t;
    private boolean u = true;
    t v;
    private boolean w;
    boolean x;
    final u4 y = new a();
    final u4 z = new b();

    class a extends v4 {
        a() {
        }

        public void b(View view) {
            View view2;
            l lVar = l.this;
            if (lVar.q && (view2 = lVar.g) != null) {
                view2.setTranslationY(Utils.FLOAT_EPSILON);
                l.this.d.setTranslationY(Utils.FLOAT_EPSILON);
            }
            l.this.d.setVisibility(8);
            l.this.d.setTransitioning(false);
            l lVar2 = l.this;
            lVar2.v = null;
            lVar2.D();
            ActionBarOverlayLayout actionBarOverlayLayout = l.this.c;
            if (actionBarOverlayLayout != null) {
                o4.g0(actionBarOverlayLayout);
            }
        }
    }

    class b extends v4 {
        b() {
        }

        public void b(View view) {
            l lVar = l.this;
            lVar.v = null;
            lVar.d.requestLayout();
        }
    }

    class c implements w4 {
        c() {
        }

        public void a(View view) {
            ((View) l.this.d.getParent()).invalidate();
        }
    }

    public class d extends n implements g.a {
        private final Context g;
        private final g h;
        private n.a i;
        private WeakReference<View> j;

        public d(Context context, n.a aVar) {
            this.g = context;
            this.i = aVar;
            g gVar = new g(context);
            gVar.W(1);
            this.h = gVar;
            gVar.V(this);
        }

        public boolean a(g gVar, MenuItem menuItem) {
            n.a aVar = this.i;
            if (aVar != null) {
                return aVar.d(this, menuItem);
            }
            return false;
        }

        public void b(g gVar) {
            if (this.i != null) {
                k();
                l.this.f.l();
            }
        }

        public void c() {
            l lVar = l.this;
            if (lVar.j == this) {
                if (!l.C(lVar.r, lVar.s, false)) {
                    l lVar2 = l.this;
                    lVar2.k = this;
                    lVar2.l = this.i;
                } else {
                    this.i.a(this);
                }
                this.i = null;
                l.this.B(false);
                l.this.f.g();
                l.this.e.t().sendAccessibilityEvent(32);
                l lVar3 = l.this;
                lVar3.c.setHideOnContentScrollEnabled(lVar3.x);
                l.this.j = null;
            }
        }

        public View d() {
            WeakReference<View> weakReference = this.j;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        public Menu e() {
            return this.h;
        }

        public MenuInflater f() {
            return new s(this.g);
        }

        public CharSequence g() {
            return l.this.f.getSubtitle();
        }

        public CharSequence i() {
            return l.this.f.getTitle();
        }

        public void k() {
            if (l.this.j == this) {
                this.h.h0();
                try {
                    this.i.c(this, this.h);
                } finally {
                    this.h.g0();
                }
            }
        }

        public boolean l() {
            return l.this.f.j();
        }

        public void m(View view) {
            l.this.f.setCustomView(view);
            this.j = new WeakReference<>(view);
        }

        public void n(int i2) {
            o(l.this.a.getResources().getString(i2));
        }

        public void o(CharSequence charSequence) {
            l.this.f.setSubtitle(charSequence);
        }

        public void q(int i2) {
            r(l.this.a.getResources().getString(i2));
        }

        public void r(CharSequence charSequence) {
            l.this.f.setTitle(charSequence);
        }

        public void s(boolean z) {
            super.s(z);
            l.this.f.setTitleOptional(z);
        }

        public boolean t() {
            this.h.h0();
            try {
                return this.i.b(this, this.h);
            } finally {
                this.h.g0();
            }
        }
    }

    public l(Activity activity, boolean z2) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        J(decorView);
        if (!z2) {
            this.g = decorView.findViewById(16908290);
        }
    }

    public l(Dialog dialog) {
        new ArrayList();
        J(dialog.getWindow().getDecorView());
    }

    static boolean C(boolean z2, boolean z3, boolean z4) {
        if (z4) {
            return true;
        }
        return !z2 && !z3;
    }

    private p G(View view) {
        if (view instanceof p) {
            return (p) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    private void I() {
        if (this.t) {
            this.t = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            R(false);
        }
    }

    private void J(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R$id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.e = G(view.findViewById(R$id.action_bar));
        this.f = (ActionBarContextView) view.findViewById(R$id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R$id.action_bar_container);
        this.d = actionBarContainer;
        p pVar = this.e;
        if (pVar == null || this.f == null || actionBarContainer == null) {
            throw new IllegalStateException(l.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.a = pVar.e();
        boolean z2 = (this.e.v() & 4) != 0;
        if (z2) {
            this.i = true;
        }
        m b2 = m.b(this.a);
        O(b2.a() || z2);
        M(b2.g());
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes((AttributeSet) null, R$styleable.ActionBar, R$attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(R$styleable.ActionBar_hideOnContentScroll, false)) {
            N(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            L((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void M(boolean z2) {
        this.o = z2;
        if (!z2) {
            this.e.j((z) null);
            this.d.setTabContainer(this.h);
        } else {
            this.d.setTabContainer((z) null);
            this.e.j(this.h);
        }
        boolean z3 = true;
        boolean z4 = H() == 2;
        z zVar = this.h;
        if (zVar != null) {
            if (z4) {
                zVar.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    o4.g0(actionBarOverlayLayout);
                }
            } else {
                zVar.setVisibility(8);
            }
        }
        this.e.A(!this.o && z4);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
        if (this.o || !z4) {
            z3 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z3);
    }

    private boolean P() {
        return o4.O(this.d);
    }

    private void Q() {
        if (!this.t) {
            this.t = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            R(false);
        }
    }

    private void R(boolean z2) {
        if (C(this.r, this.s, this.t)) {
            if (!this.u) {
                this.u = true;
                F(z2);
            }
        } else if (this.u) {
            this.u = false;
            E(z2);
        }
    }

    public n A(n.a aVar) {
        d dVar = this.j;
        if (dVar != null) {
            dVar.c();
        }
        this.c.setHideOnContentScrollEnabled(false);
        this.f.k();
        d dVar2 = new d(this.f.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.j = dVar2;
        dVar2.k();
        this.f.h(dVar2);
        B(true);
        this.f.sendAccessibilityEvent(32);
        return dVar2;
    }

    public void B(boolean z2) {
        t4 t4Var;
        t4 t4Var2;
        if (z2) {
            Q();
        } else {
            I();
        }
        if (P()) {
            if (z2) {
                t4Var = this.e.q(4, 100);
                t4Var2 = this.f.f(0, 200);
            } else {
                t4Var2 = this.e.q(0, 200);
                t4Var = this.f.f(8, 100);
            }
            t tVar = new t();
            tVar.d(t4Var, t4Var2);
            tVar.h();
        } else if (z2) {
            this.e.setVisibility(4);
            this.f.setVisibility(0);
        } else {
            this.e.setVisibility(0);
            this.f.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    public void D() {
        n.a aVar = this.l;
        if (aVar != null) {
            aVar.a(this.k);
            this.k = null;
            this.l = null;
        }
    }

    public void E(boolean z2) {
        View view;
        t tVar = this.v;
        if (tVar != null) {
            tVar.a();
        }
        if (this.p != 0 || (!this.w && !z2)) {
            this.y.b((View) null);
            return;
        }
        this.d.setAlpha(1.0f);
        this.d.setTransitioning(true);
        t tVar2 = new t();
        float f2 = (float) (-this.d.getHeight());
        if (z2) {
            int[] iArr = {0, 0};
            this.d.getLocationInWindow(iArr);
            f2 -= (float) iArr[1];
        }
        t4 c2 = o4.c(this.d);
        c2.l(f2);
        c2.j(this.A);
        tVar2.c(c2);
        if (this.q && (view = this.g) != null) {
            t4 c3 = o4.c(view);
            c3.l(f2);
            tVar2.c(c3);
        }
        tVar2.f(B);
        tVar2.e(250);
        tVar2.g(this.y);
        this.v = tVar2;
        tVar2.h();
    }

    public void F(boolean z2) {
        View view;
        View view2;
        t tVar = this.v;
        if (tVar != null) {
            tVar.a();
        }
        this.d.setVisibility(0);
        if (this.p != 0 || (!this.w && !z2)) {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(Utils.FLOAT_EPSILON);
            if (this.q && (view = this.g) != null) {
                view.setTranslationY(Utils.FLOAT_EPSILON);
            }
            this.z.b((View) null);
        } else {
            this.d.setTranslationY(Utils.FLOAT_EPSILON);
            float f2 = (float) (-this.d.getHeight());
            if (z2) {
                int[] iArr = {0, 0};
                this.d.getLocationInWindow(iArr);
                f2 -= (float) iArr[1];
            }
            this.d.setTranslationY(f2);
            t tVar2 = new t();
            t4 c2 = o4.c(this.d);
            c2.l(Utils.FLOAT_EPSILON);
            c2.j(this.A);
            tVar2.c(c2);
            if (this.q && (view2 = this.g) != null) {
                view2.setTranslationY(f2);
                t4 c3 = o4.c(this.g);
                c3.l(Utils.FLOAT_EPSILON);
                tVar2.c(c3);
            }
            tVar2.f(C);
            tVar2.e(250);
            tVar2.g(this.z);
            this.v = tVar2;
            tVar2.h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            o4.g0(actionBarOverlayLayout);
        }
    }

    public int H() {
        return this.e.p();
    }

    public void K(int i2, int i3) {
        int v2 = this.e.v();
        if ((i3 & 4) != 0) {
            this.i = true;
        }
        this.e.l((i2 & i3) | ((~i3) & v2));
    }

    public void L(float f2) {
        o4.p0(this.d, f2);
    }

    public void N(boolean z2) {
        if (!z2 || this.c.w()) {
            this.x = z2;
            this.c.setHideOnContentScrollEnabled(z2);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    public void O(boolean z2) {
        this.e.u(z2);
    }

    public void a() {
        if (this.s) {
            this.s = false;
            R(true);
        }
    }

    public void b() {
    }

    public void c(boolean z2) {
        this.q = z2;
    }

    public void d() {
        if (!this.s) {
            this.s = true;
            R(true);
        }
    }

    public void e() {
        t tVar = this.v;
        if (tVar != null) {
            tVar.a();
            this.v = null;
        }
    }

    public void f(int i2) {
        this.p = i2;
    }

    public boolean h() {
        p pVar = this.e;
        if (pVar == null || !pVar.k()) {
            return false;
        }
        this.e.collapseActionView();
        return true;
    }

    public void i(boolean z2) {
        if (z2 != this.m) {
            this.m = z2;
            int size = this.n.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.n.get(i2).a(z2);
            }
        }
    }

    public int j() {
        return this.e.v();
    }

    public Context k() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(R$attr.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.b = new ContextThemeWrapper(this.a, i2);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    public void m(Configuration configuration) {
        M(m.b(this.a).g());
    }

    public boolean o(int i2, KeyEvent keyEvent) {
        Menu e2;
        d dVar = this.j;
        if (dVar == null || (e2 = dVar.e()) == null) {
            return false;
        }
        boolean z2 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z2 = false;
        }
        e2.setQwertyMode(z2);
        return e2.performShortcut(i2, keyEvent, 0);
    }

    public void r(boolean z2) {
        if (!this.i) {
            s(z2);
        }
    }

    public void s(boolean z2) {
        K(z2 ? 4 : 0, 4);
    }

    public void t(int i2) {
        this.e.w(i2);
    }

    public void u(int i2) {
        this.e.r(i2);
    }

    public void v(Drawable drawable) {
        this.e.z(drawable);
    }

    public void w(boolean z2) {
        t tVar;
        this.w = z2;
        if (!z2 && (tVar = this.v) != null) {
            tVar.a();
        }
    }

    public void x(CharSequence charSequence) {
        this.e.m(charSequence);
    }

    public void y(CharSequence charSequence) {
        this.e.setTitle(charSequence);
    }

    public void z(CharSequence charSequence) {
        this.e.setWindowTitle(charSequence);
    }
}
