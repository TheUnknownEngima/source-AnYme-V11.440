package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
public class VisibilityAwareImageButton extends ImageButton {
    private int e;

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = getVisibility();
    }

    public final void a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.e = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.e;
    }

    public void setVisibility(int i) {
        a(i, true);
    }
}
