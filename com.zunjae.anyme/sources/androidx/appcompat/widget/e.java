package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R$styleable;

class e {
    private final View a;
    private final g b;
    private int c = -1;
    private e0 d;
    private e0 e;
    private e0 f;

    e(View view) {
        this.a = view;
        this.b = g.b();
    }

    private boolean a(Drawable drawable) {
        if (this.f == null) {
            this.f = new e0();
        }
        e0 e0Var = this.f;
        e0Var.a();
        ColorStateList p = o4.p(this.a);
        if (p != null) {
            e0Var.d = true;
            e0Var.a = p;
        }
        PorterDuff.Mode q = o4.q(this.a);
        if (q != null) {
            e0Var.c = true;
            e0Var.b = q;
        }
        if (!e0Var.d && !e0Var.c) {
            return false;
        }
        g.i(drawable, e0Var, this.a.getDrawableState());
        return true;
    }

    private boolean k() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.d != null : i == 21;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        Drawable background = this.a.getBackground();
        if (background == null) {
            return;
        }
        if (!k() || !a(background)) {
            e0 e0Var = this.e;
            if (e0Var != null) {
                g.i(background, e0Var, this.a.getDrawableState());
                return;
            }
            e0 e0Var2 = this.d;
            if (e0Var2 != null) {
                g.i(background, e0Var2, this.a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList c() {
        e0 e0Var = this.e;
        if (e0Var != null) {
            return e0Var.a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        e0 e0Var = this.e;
        if (e0Var != null) {
            return e0Var.b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void e(AttributeSet attributeSet, int i) {
        g0 u = g0.u(this.a.getContext(), attributeSet, R$styleable.ViewBackgroundHelper, i, 0);
        try {
            if (u.r(R$styleable.ViewBackgroundHelper_android_background)) {
                this.c = u.n(R$styleable.ViewBackgroundHelper_android_background, -1);
                ColorStateList f2 = this.b.f(this.a.getContext(), this.c);
                if (f2 != null) {
                    h(f2);
                }
            }
            if (u.r(R$styleable.ViewBackgroundHelper_backgroundTint)) {
                o4.m0(this.a, u.c(R$styleable.ViewBackgroundHelper_backgroundTint));
            }
            if (u.r(R$styleable.ViewBackgroundHelper_backgroundTintMode)) {
                o4.n0(this.a, q.e(u.k(R$styleable.ViewBackgroundHelper_backgroundTintMode, -1), (PorterDuff.Mode) null));
            }
        } finally {
            u.v();
        }
    }

    /* access modifiers changed from: package-private */
    public void f(Drawable drawable) {
        this.c = -1;
        h((ColorStateList) null);
        b();
    }

    /* access modifiers changed from: package-private */
    public void g(int i) {
        this.c = i;
        g gVar = this.b;
        h(gVar != null ? gVar.f(this.a.getContext(), i) : null);
        b();
    }

    /* access modifiers changed from: package-private */
    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new e0();
            }
            e0 e0Var = this.d;
            e0Var.a = colorStateList;
            e0Var.d = true;
        } else {
            this.d = null;
        }
        b();
    }

    /* access modifiers changed from: package-private */
    public void i(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new e0();
        }
        e0 e0Var = this.e;
        e0Var.a = colorStateList;
        e0Var.d = true;
        b();
    }

    /* access modifiers changed from: package-private */
    public void j(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new e0();
        }
        e0 e0Var = this.e;
        e0Var.b = mode;
        e0Var.c = true;
        b();
    }
}
