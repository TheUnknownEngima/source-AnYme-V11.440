package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.cast.framework.R$string;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.framework.media.i;
import com.google.android.gms.common.util.m;

/* renamed from: sa0  reason: default package */
public final class sa0 extends g60 {
    private final ImageView b;
    private final View c;
    private final boolean d;
    private final Drawable e;
    private final String f;
    private final Drawable g;
    private final String h;
    private final Drawable i;
    private final String j;
    private boolean k = false;

    public sa0(ImageView imageView, Context context, Drawable drawable, Drawable drawable2, Drawable drawable3, View view, boolean z) {
        this.b = imageView;
        this.e = drawable;
        this.g = drawable2;
        this.i = drawable3 != null ? drawable3 : drawable2;
        this.f = context.getString(R$string.cast_play);
        this.h = context.getString(R$string.cast_pause);
        this.j = context.getString(R$string.cast_stop);
        this.c = view;
        this.d = z;
        this.b.setEnabled(false);
    }

    private final void g(Drawable drawable, String str) {
        boolean z = !drawable.equals(this.b.getDrawable());
        this.b.setImageDrawable(drawable);
        this.b.setContentDescription(str);
        this.b.setVisibility(0);
        this.b.setEnabled(true);
        View view = this.c;
        if (view != null) {
            view.setVisibility(8);
        }
        if (z && this.k) {
            this.b.sendAccessibilityEvent(8);
        }
    }

    private final void h() {
        i b2 = b();
        if (b2 == null || !b2.o()) {
            this.b.setEnabled(false);
        } else if (b2.s()) {
            g(this.e, this.f);
        } else if (b2.t()) {
            if (b2.q()) {
                g(this.i, this.j);
            } else {
                g(this.g, this.h);
            }
        } else if (b2.p()) {
            i(false);
        } else if (b2.r()) {
            i(true);
        }
    }

    @TargetApi(21)
    private final void i(boolean z) {
        if (m.h()) {
            this.k = this.b.isAccessibilityFocused();
        }
        View view = this.c;
        int i2 = 0;
        if (view != null) {
            view.setVisibility(0);
            if (this.k) {
                this.c.sendAccessibilityEvent(8);
            }
        }
        ImageView imageView = this.b;
        if (this.d) {
            i2 = 4;
        }
        imageView.setVisibility(i2);
        this.b.setEnabled(!z);
    }

    public final void c() {
        h();
    }

    public final void d() {
        i(true);
    }

    public final void e(c cVar) {
        super.e(cVar);
        h();
    }

    public final void f() {
        this.b.setEnabled(false);
        super.f();
    }
}
