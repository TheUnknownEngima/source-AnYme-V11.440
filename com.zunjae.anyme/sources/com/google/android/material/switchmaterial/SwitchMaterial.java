package com.google.android.material.switchmaterial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.m;
import com.google.android.material.internal.r;

public class SwitchMaterial extends SwitchCompat {
    private static final int a0 = R$style.Widget_MaterialComponents_CompoundButton_Switch;
    private static final int[][] b0 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    private final w91 T;
    private ColorStateList U;
    private ColorStateList V;
    private boolean W;

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.switchStyle);
    }

    public SwitchMaterial(Context context, AttributeSet attributeSet, int i) {
        super(bb1.c(context, attributeSet, i, a0), attributeSet, i);
        Context context2 = getContext();
        this.T = new w91(context2);
        TypedArray h = m.h(context2, attributeSet, R$styleable.SwitchMaterial, i, a0, new int[0]);
        this.W = h.getBoolean(R$styleable.SwitchMaterial_useMaterialThemeColors, false);
        h.recycle();
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.U == null) {
            int d = t91.d(this, R$attr.colorSurface);
            int d2 = t91.d(this, R$attr.colorControlActivated);
            float dimension = getResources().getDimension(R$dimen.mtrl_switch_thumb_elevation);
            if (this.T.d()) {
                dimension += r.g(this);
            }
            int c = this.T.c(d, dimension);
            int[] iArr = new int[b0.length];
            iArr[0] = t91.g(d, d2, 1.0f);
            iArr[1] = c;
            iArr[2] = t91.g(d, d2, 0.38f);
            iArr[3] = c;
            this.U = new ColorStateList(b0, iArr);
        }
        return this.U;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.V == null) {
            int[] iArr = new int[b0.length];
            int d = t91.d(this, R$attr.colorSurface);
            int d2 = t91.d(this, R$attr.colorControlActivated);
            int d3 = t91.d(this, R$attr.colorOnSurface);
            iArr[0] = t91.g(d, d2, 0.54f);
            iArr[1] = t91.g(d, d3, 0.32f);
            iArr[2] = t91.g(d, d2, 0.12f);
            iArr[3] = t91.g(d, d3, 0.12f);
            this.V = new ColorStateList(b0, iArr);
        }
        return this.V;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.W && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.W && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        ColorStateList colorStateList;
        this.W = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            colorStateList = getMaterialThemeColorsTrackTintList();
        } else {
            colorStateList = null;
            setThumbTintList((ColorStateList) null);
        }
        setTrackTintList(colorStateList);
    }
}
