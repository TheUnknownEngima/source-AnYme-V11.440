package com.mikepenz.iconics.view;

import android.content.Context;
import android.util.AttributeSet;

public class IconicsCheckBox extends IconicsCompoundButton {
    public IconicsCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842860);
    }

    public IconicsCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CharSequence getAccessibilityClassName() {
        return IconicsCheckBox.class.getName();
    }
}
