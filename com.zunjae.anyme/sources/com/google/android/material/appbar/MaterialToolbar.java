package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;

public class MaterialToolbar extends Toolbar {
    private static final int T = R$style.Widget_MaterialComponents_Toolbar;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.toolbarStyle);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(bb1.c(context, attributeSet, i, T), attributeSet, i);
        P(getContext());
    }

    private void P(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            ra1 ra1 = new ra1();
            ra1.Y(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            ra1.N(context);
            ra1.X(o4.t(this));
            o4.l0(this, ra1);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        sa1.e(this);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        sa1.d(this, f);
    }
}
