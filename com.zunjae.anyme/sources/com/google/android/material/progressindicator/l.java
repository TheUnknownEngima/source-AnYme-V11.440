package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$styleable;

public final class l {
    public int a;
    public int b;
    public int c;
    public int[] d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public boolean j;

    private static int a(Context context, TypedArray typedArray, int i2, int i3) {
        return typedArray.getDimensionPixelSize(i2, context.getResources().getDimensionPixelSize(i3));
    }

    private void c(Context context, TypedArray typedArray) {
        if (typedArray.hasValue(R$styleable.ProgressIndicator_indicatorColors)) {
            this.d = context.getResources().getIntArray(typedArray.getResourceId(R$styleable.ProgressIndicator_indicatorColors, -1));
            if (typedArray.hasValue(R$styleable.ProgressIndicator_indicatorColor)) {
                throw new IllegalArgumentException("Attributes indicatorColors and indicatorColor cannot be used at the same time.");
            } else if (this.d.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        } else {
            int[] iArr = new int[1];
            iArr[0] = typedArray.hasValue(R$styleable.ProgressIndicator_indicatorColor) ? typedArray.getColor(R$styleable.ProgressIndicator_indicatorColor, -1) : t91.b(context, R$attr.colorPrimary, -1);
            this.d = iArr;
        }
    }

    private void d(Context context, TypedArray typedArray) {
        int i2;
        if (typedArray.hasValue(R$styleable.ProgressIndicator_trackColor)) {
            i2 = typedArray.getColor(R$styleable.ProgressIndicator_trackColor, -1);
        } else {
            this.e = this.d[0];
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16842803});
            float f2 = obtainStyledAttributes.getFloat(0, 0.2f);
            obtainStyledAttributes.recycle();
            i2 = t91.a(this.e, (int) (f2 * 255.0f));
        }
        this.e = i2;
    }

    public void b(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ProgressIndicator, i2, i3);
        this.a = obtainStyledAttributes.getInt(R$styleable.ProgressIndicator_indicatorType, 0);
        this.b = a(context, obtainStyledAttributes, R$styleable.ProgressIndicator_indicatorWidth, R$dimen.mtrl_progress_indicator_width);
        this.h = a(context, obtainStyledAttributes, R$styleable.ProgressIndicator_circularInset, R$dimen.mtrl_progress_circular_inset);
        this.i = a(context, obtainStyledAttributes, R$styleable.ProgressIndicator_circularRadius, R$dimen.mtrl_progress_circular_radius);
        this.f = obtainStyledAttributes.getBoolean(R$styleable.ProgressIndicator_inverse, false);
        this.g = obtainStyledAttributes.getInt(R$styleable.ProgressIndicator_growMode, 0);
        c(context, obtainStyledAttributes);
        d(context, obtainStyledAttributes);
        boolean z = true;
        if (!obtainStyledAttributes.getBoolean(R$styleable.ProgressIndicator_linearSeamless, true) || this.a != 0 || this.d.length < 3) {
            z = false;
        }
        this.j = z;
        this.c = Math.min(obtainStyledAttributes.getDimensionPixelSize(R$styleable.ProgressIndicator_indicatorCornerRadius, 0), this.b / 2);
        obtainStyledAttributes.recycle();
        e();
    }

    public void e() {
        if (this.a == 1 && this.i < this.b / 2) {
            throw new IllegalArgumentException("The circularRadius cannot be less than half of the indicatorWidth.");
        } else if (this.j && this.c > 0) {
            throw new IllegalArgumentException("Rounded corners are not supported in linear seamless mode.");
        }
    }
}
