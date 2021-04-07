package defpackage;

import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.cast.framework.R$attr;
import com.google.android.gms.cast.framework.R$id;
import com.google.android.gms.cast.framework.R$style;
import com.google.android.gms.cast.framework.R$styleable;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.framework.media.i;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;

/* renamed from: bb0  reason: default package */
public final class bb0 extends xa0 {
    private final RelativeLayout c;
    private final TextView d;
    private final CastSeekBar e;
    private final i60 f;

    public bb0(RelativeLayout relativeLayout, CastSeekBar castSeekBar, i60 i60) {
        this.c = relativeLayout;
        TextView textView = (TextView) relativeLayout.findViewById(R$id.tooltip);
        this.d = textView;
        this.e = castSeekBar;
        this.f = i60;
        TypedArray obtainStyledAttributes = textView.getContext().obtainStyledAttributes((AttributeSet) null, R$styleable.CastExpandedController, R$attr.castExpandedControllerStyle, R$style.CastExpandedController);
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.CastExpandedController_castSeekBarTooltipBackgroundColor, 0);
        obtainStyledAttributes.recycle();
        this.d.getBackground().setColorFilter(this.d.getContext().getResources().getColor(resourceId), PorterDuff.Mode.SRC_IN);
    }

    private final void j() {
        i b = b();
        if (b == null || !b.o() || g()) {
            this.c.setVisibility(8);
            return;
        }
        this.c.setVisibility(0);
        TextView textView = this.d;
        i60 i60 = this.f;
        textView.setText(i60.q(i60.s(this.e.getProgress())));
        int measuredWidth = (this.e.getMeasuredWidth() - this.e.getPaddingLeft()) - this.e.getPaddingRight();
        this.d.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth2 = this.d.getMeasuredWidth();
        int min = Math.min(Math.max(0, ((int) (((((double) this.e.getProgress()) * 1.0d) / ((double) this.e.getMaxProgress())) * ((double) measuredWidth))) - (measuredWidth2 / 2)), measuredWidth - measuredWidth2);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams.leftMargin = min;
        this.d.setLayoutParams(layoutParams);
    }

    public final void c() {
        j();
    }

    public final void e(c cVar) {
        super.e(cVar);
        j();
    }

    public final void f() {
        super.f();
        j();
    }

    public final void h(long j) {
        j();
    }

    public final void i(boolean z) {
        super.i(z);
        j();
    }
}
