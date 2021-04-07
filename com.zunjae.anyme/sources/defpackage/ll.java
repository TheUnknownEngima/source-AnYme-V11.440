package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import defpackage.ul;

/* renamed from: ll  reason: default package */
public abstract class ll<Z> extends ql<ImageView, Z> implements ul.a {
    private Animatable l;

    public ll(ImageView imageView) {
        super(imageView);
    }

    private void p(Z z) {
        if (z instanceof Animatable) {
            Animatable animatable = (Animatable) z;
            this.l = animatable;
            animatable.start();
            return;
        }
        this.l = null;
    }

    private void r(Z z) {
        q(z);
        p(z);
    }

    public void a(Drawable drawable) {
        ((ImageView) this.f).setImageDrawable(drawable);
    }

    public Drawable b() {
        return ((ImageView) this.f).getDrawable();
    }

    public void e(Z z, ul<? super Z> ulVar) {
        if (ulVar == null || !ulVar.a(z, this)) {
            r(z);
        } else {
            p(z);
        }
    }

    public void g(Drawable drawable) {
        super.g(drawable);
        r((Object) null);
        a(drawable);
    }

    public void h(Drawable drawable) {
        super.h(drawable);
        r((Object) null);
        a(drawable);
    }

    public void i(Drawable drawable) {
        super.i(drawable);
        Animatable animatable = this.l;
        if (animatable != null) {
            animatable.stop();
        }
        r((Object) null);
        a(drawable);
    }

    public void n() {
        Animatable animatable = this.l;
        if (animatable != null) {
            animatable.start();
        }
    }

    /* access modifiers changed from: protected */
    public abstract void q(Z z);

    public void y() {
        Animatable animatable = this.l;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
