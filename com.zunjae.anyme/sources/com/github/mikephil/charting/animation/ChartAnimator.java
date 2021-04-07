package com.github.mikephil.charting.animation;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Build;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.utils.Utils;

public class ChartAnimator {
    private ValueAnimator.AnimatorUpdateListener mListener;
    protected float mPhaseX = 1.0f;
    protected float mPhaseY = 1.0f;

    public ChartAnimator() {
    }

    public ChartAnimator(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.mListener = animatorUpdateListener;
    }

    private ObjectAnimator xAnimator(int i, Easing.EasingFunction easingFunction) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "phaseX", new float[]{Utils.FLOAT_EPSILON, 1.0f});
        ofFloat.setInterpolator(easingFunction);
        ofFloat.setDuration((long) i);
        return ofFloat;
    }

    private ObjectAnimator yAnimator(int i, Easing.EasingFunction easingFunction) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "phaseY", new float[]{Utils.FLOAT_EPSILON, 1.0f});
        ofFloat.setInterpolator(easingFunction);
        ofFloat.setDuration((long) i);
        return ofFloat;
    }

    public void animateX(int i) {
        animateX(i, Easing.Linear);
    }

    public void animateX(int i, Easing.EasingFunction easingFunction) {
        ObjectAnimator xAnimator = xAnimator(i, easingFunction);
        xAnimator.addUpdateListener(this.mListener);
        xAnimator.start();
    }

    @Deprecated
    public void animateX(int i, Easing.EasingOption easingOption) {
        if (Build.VERSION.SDK_INT >= 11) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "phaseX", new float[]{Utils.FLOAT_EPSILON, 1.0f});
            ofFloat.setInterpolator(Easing.getEasingFunctionFromOption(easingOption));
            ofFloat.setDuration((long) i);
            ofFloat.addUpdateListener(this.mListener);
            ofFloat.start();
        }
    }

    public void animateXY(int i, int i2) {
        Easing.EasingFunction easingFunction = Easing.Linear;
        animateXY(i, i2, easingFunction, easingFunction);
    }

    public void animateXY(int i, int i2, Easing.EasingFunction easingFunction) {
        ObjectAnimator xAnimator = xAnimator(i, easingFunction);
        ObjectAnimator yAnimator = yAnimator(i2, easingFunction);
        if (i > i2) {
            xAnimator.addUpdateListener(this.mListener);
        } else {
            yAnimator.addUpdateListener(this.mListener);
        }
        xAnimator.start();
        yAnimator.start();
    }

    public void animateXY(int i, int i2, Easing.EasingFunction easingFunction, Easing.EasingFunction easingFunction2) {
        ObjectAnimator xAnimator = xAnimator(i, easingFunction);
        ObjectAnimator yAnimator = yAnimator(i2, easingFunction2);
        if (i > i2) {
            xAnimator.addUpdateListener(this.mListener);
        } else {
            yAnimator.addUpdateListener(this.mListener);
        }
        xAnimator.start();
        yAnimator.start();
    }

    @Deprecated
    public void animateXY(int i, int i2, Easing.EasingOption easingOption, Easing.EasingOption easingOption2) {
        if (Build.VERSION.SDK_INT >= 11) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "phaseY", new float[]{Utils.FLOAT_EPSILON, 1.0f});
            ofFloat.setInterpolator(Easing.getEasingFunctionFromOption(easingOption2));
            ofFloat.setDuration((long) i2);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "phaseX", new float[]{Utils.FLOAT_EPSILON, 1.0f});
            ofFloat2.setInterpolator(Easing.getEasingFunctionFromOption(easingOption));
            ofFloat2.setDuration((long) i);
            if (i > i2) {
                ofFloat2.addUpdateListener(this.mListener);
            } else {
                ofFloat.addUpdateListener(this.mListener);
            }
            ofFloat2.start();
            ofFloat.start();
        }
    }

    public void animateY(int i) {
        animateY(i, Easing.Linear);
    }

    public void animateY(int i, Easing.EasingFunction easingFunction) {
        ObjectAnimator yAnimator = yAnimator(i, easingFunction);
        yAnimator.addUpdateListener(this.mListener);
        yAnimator.start();
    }

    @Deprecated
    public void animateY(int i, Easing.EasingOption easingOption) {
        if (Build.VERSION.SDK_INT >= 11) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "phaseY", new float[]{Utils.FLOAT_EPSILON, 1.0f});
            ofFloat.setInterpolator(Easing.getEasingFunctionFromOption(easingOption));
            ofFloat.setDuration((long) i);
            ofFloat.addUpdateListener(this.mListener);
            ofFloat.start();
        }
    }

    public float getPhaseX() {
        return this.mPhaseX;
    }

    public float getPhaseY() {
        return this.mPhaseY;
    }

    public void setPhaseX(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < Utils.FLOAT_EPSILON) {
            f = Utils.FLOAT_EPSILON;
        }
        this.mPhaseX = f;
    }

    public void setPhaseY(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < Utils.FLOAT_EPSILON) {
            f = Utils.FLOAT_EPSILON;
        }
        this.mPhaseY = f;
    }
}
