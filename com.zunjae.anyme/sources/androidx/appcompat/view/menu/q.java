package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R$dimen;
import androidx.appcompat.R$layout;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.v;

final class q extends k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, m, View.OnKeyListener {
    private static final int z = R$layout.abc_popup_menu_item_layout;
    private final Context f;
    private final g g;
    private final f h;
    private final boolean i;
    private final int j;
    private final int k;
    private final int l;
    final v m;
    final ViewTreeObserver.OnGlobalLayoutListener n = new a();
    private final View.OnAttachStateChangeListener o = new b();
    private PopupWindow.OnDismissListener p;
    private View q;
    View r;
    private m.a s;
    ViewTreeObserver t;
    private boolean u;
    private boolean v;
    private int w;
    private int x = 0;
    private boolean y;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        public void onGlobalLayout() {
            if (q.this.a() && !q.this.m.B()) {
                View view = q.this.r;
                if (view == null || !view.isShown()) {
                    q.this.dismiss();
                } else {
                    q.this.m.b();
                }
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = q.this.t;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.t = view.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.t.removeGlobalOnLayoutListener(qVar.n);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public q(Context context, g gVar, View view, int i2, int i3, boolean z2) {
        this.f = context;
        this.g = gVar;
        this.i = z2;
        this.h = new f(gVar, LayoutInflater.from(context), this.i, z);
        this.k = i2;
        this.l = i3;
        Resources resources = context.getResources();
        this.j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R$dimen.abc_config_prefDialogWidth));
        this.q = view;
        this.m = new v(this.f, (AttributeSet) null, this.k, this.l);
        gVar.c(this, context);
    }

    private boolean C() {
        View view;
        if (a()) {
            return true;
        }
        if (this.u || (view = this.q) == null) {
            return false;
        }
        this.r = view;
        this.m.K(this);
        this.m.L(this);
        this.m.J(true);
        View view2 = this.r;
        boolean z2 = this.t == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.t = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.n);
        }
        view2.addOnAttachStateChangeListener(this.o);
        this.m.D(view2);
        this.m.G(this.x);
        if (!this.v) {
            this.w = k.r(this.h, (ViewGroup) null, this.f, this.j);
            this.v = true;
        }
        this.m.F(this.w);
        this.m.I(2);
        this.m.H(q());
        this.m.b();
        ListView n2 = this.m.n();
        n2.setOnKeyListener(this);
        if (this.y && this.g.z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f).inflate(R$layout.abc_popup_menu_header_item_layout, n2, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.g.z());
            }
            frameLayout.setEnabled(false);
            n2.addHeaderView(frameLayout, (Object) null, false);
        }
        this.m.p(this.h);
        this.m.b();
        return true;
    }

    public boolean a() {
        return !this.u && this.m.a();
    }

    public void b() {
        if (!C()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public void c(g gVar, boolean z2) {
        if (gVar == this.g) {
            dismiss();
            m.a aVar = this.s;
            if (aVar != null) {
                aVar.c(gVar, z2);
            }
        }
    }

    public void d(g gVar) {
    }

    public void dismiss() {
        if (a()) {
            this.m.dismiss();
        }
    }

    public void g(boolean z2) {
        this.v = false;
        f fVar = this.h;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    public boolean h() {
        return false;
    }

    public void k(m.a aVar) {
        this.s = aVar;
    }

    public void m(Parcelable parcelable) {
    }

    public ListView n() {
        return this.m.n();
    }

    public boolean o(r rVar) {
        if (rVar.hasVisibleItems()) {
            l lVar = new l(this.f, rVar, this.r, this.i, this.k, this.l);
            lVar.j(this.s);
            lVar.g(k.A(rVar));
            lVar.i(this.p);
            this.p = null;
            this.g.e(false);
            int d = this.m.d();
            int o2 = this.m.o();
            if ((Gravity.getAbsoluteGravity(this.x, o4.y(this.q)) & 7) == 5) {
                d += this.q.getWidth();
            }
            if (lVar.n(d, o2)) {
                m.a aVar = this.s;
                if (aVar == null) {
                    return true;
                }
                aVar.d(rVar);
                return true;
            }
        }
        return false;
    }

    public void onDismiss() {
        this.u = true;
        this.g.close();
        ViewTreeObserver viewTreeObserver = this.t;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.t = this.r.getViewTreeObserver();
            }
            this.t.removeGlobalOnLayoutListener(this.n);
            this.t = null;
        }
        this.r.removeOnAttachStateChangeListener(this.o);
        PopupWindow.OnDismissListener onDismissListener = this.p;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public Parcelable p() {
        return null;
    }

    public void s(View view) {
        this.q = view;
    }

    public void u(boolean z2) {
        this.h.d(z2);
    }

    public void v(int i2) {
        this.x = i2;
    }

    public void w(int i2) {
        this.m.f(i2);
    }

    public void x(PopupWindow.OnDismissListener onDismissListener) {
        this.p = onDismissListener;
    }

    public void y(boolean z2) {
        this.y = z2;
    }

    public void z(int i2) {
        this.m.k(i2);
    }
}
