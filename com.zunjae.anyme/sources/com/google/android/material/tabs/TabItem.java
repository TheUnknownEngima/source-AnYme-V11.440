package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.g0;
import com.google.android.material.R$styleable;

public class TabItem extends View {
    public final CharSequence e;
    public final Drawable f;
    public final int g;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g0 t = g0.t(context, attributeSet, R$styleable.TabItem);
        this.e = t.p(R$styleable.TabItem_android_text);
        this.f = t.g(R$styleable.TabItem_android_icon);
        this.g = t.n(R$styleable.TabItem_android_layout, 0);
        t.v();
    }
}
