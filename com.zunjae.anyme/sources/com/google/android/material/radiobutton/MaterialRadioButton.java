package com.google.android.material.radiobutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.c;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.m;

public class MaterialRadioButton extends AppCompatRadioButton {
    private static final int j = R$style.Widget_MaterialComponents_CompoundButton_RadioButton;
    private static final int[][] k = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    private ColorStateList h;
    private boolean i;

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.radioButtonStyle);
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet, int i2) {
        super(bb1.c(context, attributeSet, i2, j), attributeSet, i2);
        Context context2 = getContext();
        TypedArray h2 = m.h(context2, attributeSet, R$styleable.MaterialRadioButton, i2, j, new int[0]);
        if (h2.hasValue(R$styleable.MaterialRadioButton_buttonTint)) {
            c.c(this, ca1.a(context2, h2, R$styleable.MaterialRadioButton_buttonTint));
        }
        this.i = h2.getBoolean(R$styleable.MaterialRadioButton_useMaterialThemeColors, false);
        h2.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.h == null) {
            int d = t91.d(this, R$attr.colorControlActivated);
            int d2 = t91.d(this, R$attr.colorOnSurface);
            int d3 = t91.d(this, R$attr.colorSurface);
            int[] iArr = new int[k.length];
            iArr[0] = t91.g(d3, d, 1.0f);
            iArr[1] = t91.g(d3, d2, 0.54f);
            iArr[2] = t91.g(d3, d2, 0.38f);
            iArr[3] = t91.g(d3, d2, 0.38f);
            this.h = new ColorStateList(k, iArr);
        }
        return this.h;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.i && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.i = z;
        c.c(this, z ? getMaterialThemeColorsTintList() : null);
    }
}
