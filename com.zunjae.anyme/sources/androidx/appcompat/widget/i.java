package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.R$styleable;
import androidx.core.widget.e;

public class i {
    private final ImageView a;
    private e0 b;
    private e0 c;
    private e0 d;

    public i(ImageView imageView) {
        this.a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.d == null) {
            this.d = new e0();
        }
        e0 e0Var = this.d;
        e0Var.a();
        ColorStateList a2 = e.a(this.a);
        if (a2 != null) {
            e0Var.d = true;
            e0Var.a = a2;
        }
        PorterDuff.Mode b2 = e.b(this.a);
        if (b2 != null) {
            e0Var.c = true;
            e0Var.b = b2;
        }
        if (!e0Var.d && !e0Var.c) {
            return false;
        }
        g.i(drawable, e0Var, this.a.getDrawableState());
        return true;
    }

    private boolean j() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.b != null : i == 21;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            q.b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!j() || !a(drawable)) {
            e0 e0Var = this.c;
            if (e0Var != null) {
                g.i(drawable, e0Var, this.a.getDrawableState());
                return;
            }
            e0 e0Var2 = this.b;
            if (e0Var2 != null) {
                g.i(drawable, e0Var2, this.a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public ColorStateList c() {
        e0 e0Var = this.c;
        if (e0Var != null) {
            return e0Var.a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        e0 e0Var = this.c;
        if (e0Var != null) {
            return e0Var.b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return Build.VERSION.SDK_INT < 21 || !(this.a.getBackground() instanceof RippleDrawable);
    }

    public void f(AttributeSet attributeSet, int i) {
        int n;
        g0 u = g0.u(this.a.getContext(), attributeSet, R$styleable.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.a.getDrawable();
            if (!(drawable != null || (n = u.n(R$styleable.AppCompatImageView_srcCompat, -1)) == -1 || (drawable = f.d(this.a.getContext(), n)) == null)) {
                this.a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                q.b(drawable);
            }
            if (u.r(R$styleable.AppCompatImageView_tint)) {
                e.c(this.a, u.c(R$styleable.AppCompatImageView_tint));
            }
            if (u.r(R$styleable.AppCompatImageView_tintMode)) {
                e.d(this.a, q.e(u.k(R$styleable.AppCompatImageView_tintMode, -1), (PorterDuff.Mode) null));
            }
        } finally {
            u.v();
        }
    }

    public void g(int i) {
        if (i != 0) {
            Drawable d2 = f.d(this.a.getContext(), i);
            if (d2 != null) {
                q.b(d2);
            }
            this.a.setImageDrawable(d2);
        } else {
            this.a.setImageDrawable((Drawable) null);
        }
        b();
    }

    /* access modifiers changed from: package-private */
    public void h(ColorStateList colorStateList) {
        if (this.c == null) {
            this.c = new e0();
        }
        e0 e0Var = this.c;
        e0Var.a = colorStateList;
        e0Var.d = true;
        b();
    }

    /* access modifiers changed from: package-private */
    public void i(PorterDuff.Mode mode) {
        if (this.c == null) {
            this.c = new e0();
        }
        e0 e0Var = this.c;
        e0Var.b = mode;
        e0Var.c = true;
        b();
    }
}
