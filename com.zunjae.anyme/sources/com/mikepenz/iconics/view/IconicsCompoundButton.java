package com.mikepenz.iconics.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import defpackage.sm1;

public class IconicsCompoundButton extends CompoundButton {
    private final wm1 e;

    public IconicsCompoundButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IconicsCompoundButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new wm1();
        if (!isInEditMode()) {
            b(context, attributeSet, i);
        }
    }

    public void a(Context context, AttributeSet attributeSet, int i) {
        ym1.p(context, attributeSet, this.e);
        this.e.a = ym1.n(context, attributeSet);
    }

    public void b(Context context, AttributeSet attributeSet, int i) {
        this.e.a(context);
        a(context, attributeSet, i);
        setButtonDrawable(this.e.b(context));
    }

    public CharSequence getAccessibilityClassName() {
        return IconicsCompoundButton.class.getName();
    }

    public tm1 getCheckedIcon() {
        tm1 tm1 = this.e.b;
        if (tm1 != null) {
            return tm1;
        }
        return null;
    }

    public tm1 getUncheckedIcon() {
        tm1 tm1 = this.e.c;
        if (tm1 != null) {
            return tm1;
        }
        return null;
    }

    public void setCheckedIcon(tm1 tm1) {
        wm1 wm1 = this.e;
        wm1.b = tm1;
        setButtonDrawable(wm1.b(getContext()));
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (!isInEditMode()) {
            sm1.a aVar = new sm1.a();
            aVar.a(getContext());
            charSequence = aVar.c(charSequence).a();
        }
        super.setText(charSequence, bufferType);
    }

    public void setUncheckedIcon(tm1 tm1) {
        wm1 wm1 = this.e;
        wm1.c = tm1;
        setButtonDrawable(wm1.b(getContext()));
    }
}
