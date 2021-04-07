package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R$styleable;
import com.github.mikephil.charting.utils.Utils;

public class Layer extends ConstraintHelper {
    private float A = Utils.FLOAT_EPSILON;
    private float B = Utils.FLOAT_EPSILON;
    private boolean C;
    private boolean D;
    private float m = Float.NaN;
    private float n = Float.NaN;
    private float o = Float.NaN;
    ConstraintLayout p;
    private float q = 1.0f;
    private float r = 1.0f;
    protected float s = Float.NaN;
    protected float t = Float.NaN;
    protected float u = Float.NaN;
    protected float v = Float.NaN;
    protected float w = Float.NaN;
    protected float x = Float.NaN;
    boolean y = true;
    View[] z = null;

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Layer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private void v() {
        int i;
        if (this.p != null && (i = this.f) != 0) {
            View[] viewArr = this.z;
            if (viewArr == null || viewArr.length != i) {
                this.z = new View[this.f];
            }
            for (int i2 = 0; i2 < this.f; i2++) {
                this.z[i2] = this.p.q(this.e[i2]);
            }
        }
    }

    private void w() {
        if (this.p != null) {
            if (this.z == null) {
                v();
            }
            u();
            double radians = Math.toRadians((double) this.o);
            float sin = (float) Math.sin(radians);
            float cos = (float) Math.cos(radians);
            float f = this.q;
            float f2 = f * cos;
            float f3 = this.r;
            float f4 = (-f3) * sin;
            float f5 = f * sin;
            float f6 = f3 * cos;
            for (int i = 0; i < this.f; i++) {
                View view = this.z[i];
                float left = ((float) ((view.getLeft() + view.getRight()) / 2)) - this.s;
                float top = ((float) ((view.getTop() + view.getBottom()) / 2)) - this.t;
                view.setTranslationX((((f2 * left) + (f4 * top)) - left) + this.A);
                view.setTranslationY((((left * f5) + (f6 * top)) - top) + this.B);
                view.setScaleY(this.r);
                view.setScaleX(this.q);
                view.setRotation(this.o);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void l(AttributeSet attributeSet) {
        super.l(attributeSet);
        this.i = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R$styleable.ConstraintLayout_Layout_android_visibility) {
                    this.C = true;
                } else if (index == R$styleable.ConstraintLayout_Layout_android_elevation) {
                    this.D = true;
                }
            }
        }
    }

    public void o(ConstraintLayout constraintLayout) {
        v();
        this.s = Float.NaN;
        this.t = Float.NaN;
        e1 b = ((ConstraintLayout.LayoutParams) getLayoutParams()).b();
        b.C0(0);
        b.g0(0);
        u();
        layout(((int) this.w) - getPaddingLeft(), ((int) this.x) - getPaddingTop(), ((int) this.u) + getPaddingRight(), ((int) this.v) + getPaddingBottom());
        if (!Float.isNaN(this.o)) {
            w();
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.p = (ConstraintLayout) getParent();
        if (this.C || this.D) {
            int visibility = getVisibility();
            float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : Utils.FLOAT_EPSILON;
            for (int i = 0; i < this.f; i++) {
                View q2 = this.p.q(this.e[i]);
                if (q2 != null) {
                    if (this.C) {
                        q2.setVisibility(visibility);
                    }
                    if (this.D && elevation > Utils.FLOAT_EPSILON && Build.VERSION.SDK_INT >= 21) {
                        q2.setTranslationZ(q2.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public void q(ConstraintLayout constraintLayout) {
        this.p = constraintLayout;
        getVisibility();
        float rotation = getRotation();
        if (rotation != Utils.FLOAT_EPSILON || !Float.isNaN(this.o)) {
            this.o = rotation;
        }
        String str = this.j;
        if (str != null) {
            setIds(str);
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        g();
    }

    public void setPivotX(float f) {
        this.m = f;
        w();
    }

    public void setPivotY(float f) {
        this.n = f;
        w();
    }

    public void setRotation(float f) {
        this.o = f;
        w();
    }

    public void setScaleX(float f) {
        this.q = f;
        w();
    }

    public void setScaleY(float f) {
        this.r = f;
        w();
    }

    public void setTranslationX(float f) {
        this.A = f;
        w();
    }

    public void setTranslationY(float f) {
        this.B = f;
        w();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        g();
    }

    /* access modifiers changed from: protected */
    public void u() {
        if (this.p != null) {
            if (!this.y && !Float.isNaN(this.s) && !Float.isNaN(this.t)) {
                return;
            }
            if (Float.isNaN(this.m) || Float.isNaN(this.n)) {
                View[] k = k(this.p);
                int left = k[0].getLeft();
                int top = k[0].getTop();
                int right = k[0].getRight();
                int bottom = k[0].getBottom();
                for (int i = 0; i < this.f; i++) {
                    View view = k[i];
                    left = Math.min(left, view.getLeft());
                    top = Math.min(top, view.getTop());
                    right = Math.max(right, view.getRight());
                    bottom = Math.max(bottom, view.getBottom());
                }
                this.u = (float) right;
                this.v = (float) bottom;
                this.w = (float) left;
                this.x = (float) top;
                this.s = Float.isNaN(this.m) ? (float) ((left + right) / 2) : this.m;
                this.t = Float.isNaN(this.n) ? (float) ((top + bottom) / 2) : this.n;
                return;
            }
            this.t = this.n;
            this.s = this.m;
        }
    }
}
