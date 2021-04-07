package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.mikephil.charting.utils.Utils;

public class Constraints extends ViewGroup {
    c e;

    public static class LayoutParams extends ConstraintLayout.LayoutParams {
        public float A0;
        public float o0;
        public boolean p0;
        public float q0;
        public float r0;
        public float s0;
        public float t0;
        public float u0;
        public float v0;
        public float w0;
        public float x0;
        public float y0;
        public float z0;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.o0 = 1.0f;
            this.p0 = false;
            this.q0 = Utils.FLOAT_EPSILON;
            this.r0 = Utils.FLOAT_EPSILON;
            this.s0 = Utils.FLOAT_EPSILON;
            this.t0 = Utils.FLOAT_EPSILON;
            this.u0 = 1.0f;
            this.v0 = 1.0f;
            this.w0 = Utils.FLOAT_EPSILON;
            this.x0 = Utils.FLOAT_EPSILON;
            this.y0 = Utils.FLOAT_EPSILON;
            this.z0 = Utils.FLOAT_EPSILON;
            this.A0 = Utils.FLOAT_EPSILON;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.o0 = 1.0f;
            this.p0 = false;
            this.q0 = Utils.FLOAT_EPSILON;
            this.r0 = Utils.FLOAT_EPSILON;
            this.s0 = Utils.FLOAT_EPSILON;
            this.t0 = Utils.FLOAT_EPSILON;
            this.u0 = 1.0f;
            this.v0 = 1.0f;
            this.w0 = Utils.FLOAT_EPSILON;
            this.x0 = Utils.FLOAT_EPSILON;
            this.y0 = Utils.FLOAT_EPSILON;
            this.z0 = Utils.FLOAT_EPSILON;
            this.A0 = Utils.FLOAT_EPSILON;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R$styleable.ConstraintSet_android_alpha) {
                    this.o0 = obtainStyledAttributes.getFloat(index, this.o0);
                } else if (index == R$styleable.ConstraintSet_android_elevation) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.q0 = obtainStyledAttributes.getFloat(index, this.q0);
                        this.p0 = true;
                    }
                } else if (index == R$styleable.ConstraintSet_android_rotationX) {
                    this.s0 = obtainStyledAttributes.getFloat(index, this.s0);
                } else if (index == R$styleable.ConstraintSet_android_rotationY) {
                    this.t0 = obtainStyledAttributes.getFloat(index, this.t0);
                } else if (index == R$styleable.ConstraintSet_android_rotation) {
                    this.r0 = obtainStyledAttributes.getFloat(index, this.r0);
                } else if (index == R$styleable.ConstraintSet_android_scaleX) {
                    this.u0 = obtainStyledAttributes.getFloat(index, this.u0);
                } else if (index == R$styleable.ConstraintSet_android_scaleY) {
                    this.v0 = obtainStyledAttributes.getFloat(index, this.v0);
                } else if (index == R$styleable.ConstraintSet_android_transformPivotX) {
                    this.w0 = obtainStyledAttributes.getFloat(index, this.w0);
                } else if (index == R$styleable.ConstraintSet_android_transformPivotY) {
                    this.x0 = obtainStyledAttributes.getFloat(index, this.x0);
                } else if (index == R$styleable.ConstraintSet_android_translationX) {
                    this.y0 = obtainStyledAttributes.getFloat(index, this.y0);
                } else if (index == R$styleable.ConstraintSet_android_translationY) {
                    this.z0 = obtainStyledAttributes.getFloat(index, this.z0);
                } else if (index == R$styleable.ConstraintSet_android_translationZ && Build.VERSION.SDK_INT >= 21) {
                    this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                }
            }
        }
    }

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(attributeSet);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(attributeSet);
        super.setVisibility(8);
    }

    private void c(AttributeSet attributeSet) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: b */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }

    public c getConstraintSet() {
        if (this.e == null) {
            this.e = new c();
        }
        this.e.k(this);
        return this.e;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
