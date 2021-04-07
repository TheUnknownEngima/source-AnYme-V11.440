package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.R$attr;
import com.google.android.material.R$color;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$styleable;
import com.google.android.material.timepicker.ClockHandView;
import defpackage.a5;

public class ClockFaceView extends RadialViewGroup implements ClockHandView.d {
    /* access modifiers changed from: private */
    public final ClockHandView A;
    private final Rect B;
    private final RectF C;
    /* access modifiers changed from: private */
    public final SparseArray<TextView> D;
    private final int[] E;
    private final float[] F;
    /* access modifiers changed from: private */
    public final int G;
    private String[] H;
    private float I;

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.setRadius(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.A.getSelectorRadius()) - ClockFaceView.this.G);
            return true;
        }
    }

    class b extends w3 {
        b() {
        }

        public void g(View view, a5 a5Var) {
            super.g(view, a5Var);
            int intValue = ((Integer) view.getTag(R$id.material_value_index)).intValue();
            if (intValue > 0) {
                a5Var.F0((View) ClockFaceView.this.D.get(intValue - 1));
            }
            a5Var.g0(a5.c.f(0, 1, intValue, 1, false, view.isSelected()));
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.B = new Rect();
        this.C = new RectF();
        this.D = new SparseArray<>();
        this.F = new float[]{Utils.FLOAT_EPSILON, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ClockFaceView, i, 0);
        Resources resources = getResources();
        obtainStyledAttributes.getColor(R$styleable.ClockFaceView_valueTextColor, -16777216);
        LayoutInflater.from(context).inflate(R$layout.material_clockface_view, this, true);
        this.A = (ClockHandView) findViewById(R$id.material_clock_hand);
        this.G = resources.getDimensionPixelSize(R$dimen.material_clock_hand_padding);
        int d = t91.d(this, R$attr.colorOnSurface);
        int d2 = t91.d(this, R$attr.colorOnPrimary);
        this.E = new int[]{d2, d2, d};
        this.A.b(this);
        setBackgroundColor(f.c(context, R$color.material_timepicker_clockface).getDefaultColor());
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        new b();
    }

    private void J() {
        RectF currentSelectorBox = this.A.getCurrentSelectorBox();
        for (int i = 0; i < this.D.size(); i++) {
            TextView textView = this.D.get(i);
            textView.getDrawingRect(this.B);
            this.B.offset(textView.getPaddingLeft(), getPaddingTop());
            offsetDescendantRectToMyCoords(textView, this.B);
            this.C.set(this.B);
            textView.getPaint().setShader(K(currentSelectorBox, this.C));
            textView.invalidate();
        }
    }

    private RadialGradient K(RectF rectF, RectF rectF2) {
        if (!RectF.intersects(rectF, rectF2)) {
            return null;
        }
        return new RadialGradient(rectF.centerX() - this.C.left, rectF.centerY() - this.C.top, rectF.width() * 0.5f, this.E, this.F, Shader.TileMode.CLAMP);
    }

    public void a(float f, boolean z) {
        if (Math.abs(this.I - f) > 0.001f) {
            this.I = f;
            J();
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        a5.I0(accessibilityNodeInfo).f0(a5.b.b(1, this.H.length, false, 1));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        J();
    }

    public void setHandRotation(float f) {
        this.A.setHandRotation(f);
        J();
    }

    public void setRadius(int i) {
        if (i != getRadius()) {
            super.setRadius(i);
            this.A.setCircleRadius(getRadius());
        }
    }
}
