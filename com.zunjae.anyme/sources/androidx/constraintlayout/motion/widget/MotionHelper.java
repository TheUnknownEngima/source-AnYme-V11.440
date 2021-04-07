package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R$styleable;

public class MotionHelper extends ConstraintHelper implements MotionLayout.g {
    private boolean m = false;
    private boolean n = false;
    private float o;
    protected View[] p;

    public MotionHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l(attributeSet);
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l(attributeSet);
    }

    public void a(MotionLayout motionLayout, int i, int i2, float f) {
    }

    public void b(MotionLayout motionLayout, int i, int i2) {
    }

    public void c(MotionLayout motionLayout, int i, boolean z, float f) {
    }

    public void d(MotionLayout motionLayout, int i) {
    }

    public float getProgress() {
        return this.o;
    }

    /* access modifiers changed from: protected */
    public void l(AttributeSet attributeSet) {
        super.l(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.MotionHelper);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R$styleable.MotionHelper_onShow) {
                    this.m = obtainStyledAttributes.getBoolean(index, this.m);
                } else if (index == R$styleable.MotionHelper_onHide) {
                    this.n = obtainStyledAttributes.getBoolean(index, this.n);
                }
            }
        }
    }

    public void setProgress(float f) {
        this.o = f;
        int i = 0;
        if (this.f > 0) {
            this.p = k((ConstraintLayout) getParent());
            while (i < this.f) {
                w(this.p[i], f);
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            View childAt = viewGroup.getChildAt(i);
            if (!(childAt instanceof MotionHelper)) {
                w(childAt, f);
            }
            i++;
        }
    }

    public boolean u() {
        return this.n;
    }

    public boolean v() {
        return this.m;
    }

    public void w(View view, float f) {
    }
}
