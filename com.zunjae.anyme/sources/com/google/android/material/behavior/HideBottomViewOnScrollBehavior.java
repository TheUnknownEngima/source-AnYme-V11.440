package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private int a = 0;
    private int b = 2;
    private int c = 0;
    /* access modifiers changed from: private */
    public ViewPropertyAnimator d;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            ViewPropertyAnimator unused = HideBottomViewOnScrollBehavior.this.d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void F(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.d = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new a());
    }

    public boolean A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public void G(V v, int i) {
        this.c = i;
        if (this.b == 1) {
            v.setTranslationY((float) (this.a + i));
        }
    }

    public void H(V v) {
        if (this.b != 1) {
            ViewPropertyAnimator viewPropertyAnimator = this.d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.b = 1;
            F(v, this.a + this.c, 175, f91.c);
        }
    }

    public void I(V v) {
        if (this.b != 2) {
            ViewPropertyAnimator viewPropertyAnimator = this.d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.b = 2;
            F(v, 0, 225, f91.d);
        }
    }

    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.l(coordinatorLayout, v, i);
    }

    public void t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            H(v);
        } else if (i2 < 0) {
            I(v);
        }
    }
}
