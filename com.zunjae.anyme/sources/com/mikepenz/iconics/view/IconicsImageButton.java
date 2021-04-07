package com.mikepenz.iconics.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class IconicsImageButton extends IconicsImageView {
    public IconicsImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842824);
    }

    public IconicsImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setFocusable(true);
    }

    public CharSequence getAccessibilityClassName() {
        return ImageButton.class.getName();
    }

    /* access modifiers changed from: protected */
    public boolean onSetAlpha(int i) {
        return false;
    }
}
