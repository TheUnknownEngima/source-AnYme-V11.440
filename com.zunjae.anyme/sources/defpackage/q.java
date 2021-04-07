package defpackage;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContextView;
import defpackage.n;
import java.lang.ref.WeakReference;

/* renamed from: q  reason: default package */
public class q extends n implements g.a {
    private Context g;
    private ActionBarContextView h;
    private n.a i;
    private WeakReference<View> j;
    private boolean k;
    private g l;

    public q(Context context, ActionBarContextView actionBarContextView, n.a aVar, boolean z) {
        this.g = context;
        this.h = actionBarContextView;
        this.i = aVar;
        g gVar = new g(actionBarContextView.getContext());
        gVar.W(1);
        this.l = gVar;
        gVar.V(this);
    }

    public boolean a(g gVar, MenuItem menuItem) {
        return this.i.d(this, menuItem);
    }

    public void b(g gVar) {
        k();
        this.h.l();
    }

    public void c() {
        if (!this.k) {
            this.k = true;
            this.h.sendAccessibilityEvent(32);
            this.i.a(this);
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
        return this.l;
    }

    public MenuInflater f() {
        return new s(this.h.getContext());
    }

    public CharSequence g() {
        return this.h.getSubtitle();
    }

    public CharSequence i() {
        return this.h.getTitle();
    }

    public void k() {
        this.i.c(this, this.l);
    }

    public boolean l() {
        return this.h.j();
    }

    public void m(View view) {
        this.h.setCustomView(view);
        this.j = view != null ? new WeakReference<>(view) : null;
    }

    public void n(int i2) {
        o(this.g.getString(i2));
    }

    public void o(CharSequence charSequence) {
        this.h.setSubtitle(charSequence);
    }

    public void q(int i2) {
        r(this.g.getString(i2));
    }

    public void r(CharSequence charSequence) {
        this.h.setTitle(charSequence);
    }

    public void s(boolean z) {
        super.s(z);
        this.h.setTitleOptional(z);
    }
}
