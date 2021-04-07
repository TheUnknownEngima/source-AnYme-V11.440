package defpackage;

import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.cast.framework.R$attr;
import com.google.android.gms.cast.framework.R$id;
import com.google.android.gms.cast.framework.R$style;
import com.google.android.gms.cast.framework.R$styleable;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.framework.media.i;

/* renamed from: ab0  reason: default package */
public final class ab0 extends g60 implements i.e {
    private final TextView b;
    private final ImageView c;
    private final i60 d;

    public ab0(View view, i60 i60) {
        this.b = (TextView) view.findViewById(R$id.live_indicator_text);
        ImageView imageView = (ImageView) view.findViewById(R$id.live_indicator_dot);
        this.c = imageView;
        this.d = i60;
        TypedArray obtainStyledAttributes = imageView.getContext().obtainStyledAttributes((AttributeSet) null, R$styleable.CastExpandedController, R$attr.castExpandedControllerStyle, R$style.CastExpandedController);
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.CastExpandedController_castLiveIndicatorColor, 0);
        obtainStyledAttributes.recycle();
        this.c.getDrawable().setColorFilter(this.c.getContext().getResources().getColor(resourceId), PorterDuff.Mode.SRC_IN);
        g();
    }

    private final void g() {
        i b2 = b();
        int i = 8;
        if (b2 == null || !b2.o() || !b2.q()) {
            this.b.setVisibility(8);
            this.c.setVisibility(8);
            return;
        }
        boolean t = !b2.v() ? b2.t() : this.d.h();
        this.b.setVisibility(0);
        ImageView imageView = this.c;
        if (t) {
            i = 0;
        }
        imageView.setVisibility(i);
        bn0.c(vh0.CAF_EXPANDED_CONTROLLER_WITH_LIVE_CONTENT);
    }

    public final void a(long j, long j2) {
        g();
    }

    public final void c() {
        g();
    }

    public final void e(c cVar) {
        super.e(cVar);
        if (b() != null) {
            b().c(this, 1000);
        }
        g();
    }

    public final void f() {
        if (b() != null) {
            b().E(this);
        }
        super.f();
        g();
    }
}
