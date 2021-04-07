package com.mikepenz.iconics.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

public class IconicsImageView extends AppCompatImageView {
    public IconicsImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IconicsImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!isInEditMode()) {
            d(context, attributeSet, i);
        }
    }

    public void c(Context context, AttributeSet attributeSet, int i) {
        setIcon(ym1.h(context, attributeSet));
    }

    public void d(Context context, AttributeSet attributeSet, int i) {
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        c(context, attributeSet, i);
    }

    public tm1 getIcon() {
        if (getDrawable() instanceof tm1) {
            return (tm1) getDrawable();
        }
        return null;
    }

    public void setIcon(tm1 tm1) {
        setImageDrawable(tm1);
    }
}
