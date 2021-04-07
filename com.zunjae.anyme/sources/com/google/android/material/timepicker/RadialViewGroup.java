package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$styleable;

public class RadialViewGroup extends ConstraintLayout {
    private final Runnable x;
    private int y;
    private ra1 z;

    class a implements Runnable {
        a() {
        }

        public void run() {
            RadialViewGroup.this.F();
        }
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R$layout.material_radial_view_group, this);
        o4.l0(this, D());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RadialViewGroup, i, 0);
        this.y = obtainStyledAttributes.getDimensionPixelSize(R$styleable.RadialViewGroup_materialCircleRadius, 0);
        this.x = new a();
        obtainStyledAttributes.recycle();
    }

    private Drawable D() {
        ra1 ra1 = new ra1();
        this.z = ra1;
        ra1.W(new ua1(0.5f));
        this.z.Y(ColorStateList.valueOf(-1));
        return this.z;
    }

    private static boolean E(View view) {
        return "skip".equals(view.getTag());
    }

    /* access modifiers changed from: private */
    public void F() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if (E(getChildAt(i2))) {
                i++;
            }
        }
        c cVar = new c();
        cVar.j(this);
        float f = Utils.FLOAT_EPSILON;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getId() != R$id.circle_center && !E(childAt)) {
                cVar.l(childAt.getId(), R$id.circle_center, this.y, f);
                f += 360.0f / ((float) (childCount - i));
            }
        }
        cVar.d(this);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(o4.i());
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.x);
            handler.post(this.x);
        }
    }

    public int getRadius() {
        return this.y;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        F();
    }

    public void setBackgroundColor(int i) {
        this.z.Y(ColorStateList.valueOf(i));
    }

    public void setRadius(int i) {
        this.y = i;
        F();
    }
}
