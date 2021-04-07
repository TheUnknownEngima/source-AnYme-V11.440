package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Group extends ConstraintHelper {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void l(AttributeSet attributeSet) {
        super.l(attributeSet);
        this.i = false;
    }

    public void o(ConstraintLayout constraintLayout) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.m0.C0(0);
        layoutParams.m0.g0(0);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        g();
    }

    public void setElevation(float f) {
        super.setElevation(f);
        g();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        g();
    }
}
