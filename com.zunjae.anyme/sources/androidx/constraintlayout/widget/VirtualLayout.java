package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import com.github.mikephil.charting.utils.Utils;

public abstract class VirtualLayout extends ConstraintHelper {
    private boolean m;
    private boolean n;

    public VirtualLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void l(AttributeSet attributeSet) {
        super.l(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R$styleable.ConstraintLayout_Layout_android_visibility) {
                    this.m = true;
                } else if (index == R$styleable.ConstraintLayout_Layout_android_elevation) {
                    this.n = true;
                }
            }
        }
    }

    public void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.m || this.n) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : Utils.FLOAT_EPSILON;
            for (int i = 0; i < this.f; i++) {
                View q = constraintLayout.q(this.e[i]);
                if (q != null) {
                    if (this.m) {
                        q.setVisibility(visibility);
                    }
                    if (this.n && elevation > Utils.FLOAT_EPSILON && Build.VERSION.SDK_INT >= 21) {
                        q.setTranslationZ(q.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        g();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        g();
    }

    public void u(l1 l1Var, int i, int i2) {
    }
}
