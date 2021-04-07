package defpackage;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import defpackage.wo1;

/* renamed from: kp1  reason: default package */
public class kp1 extends ip1 {
    private ap1 g = new ap1();
    private int h;
    private int i;

    /* renamed from: kp1$a */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            kp1.this.j(valueAnimator);
        }
    }

    public kp1(wo1.a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: private */
    public void j(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
        int intValue3 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_RADIUS")).intValue();
        int intValue4 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_RADIUS_REVERSE")).intValue();
        int intValue5 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_STROKE")).intValue();
        int intValue6 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_STROKE_REVERSE")).intValue();
        this.g.c(intValue);
        this.g.d(intValue2);
        this.g.i(intValue3);
        this.g.j(intValue4);
        this.g.k(intValue5);
        this.g.l(intValue6);
        wo1.a aVar = this.b;
        if (aVar != null) {
            aVar.a(this.g);
        }
    }

    private PropertyValuesHolder n(boolean z) {
        int i2;
        String str;
        int i3;
        if (z) {
            i2 = this.h;
            i3 = i2 / 2;
            str = "ANIMATION_RADIUS_REVERSE";
        } else {
            i3 = this.h;
            i2 = i3 / 2;
            str = "ANIMATION_RADIUS";
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i3, i2});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    private PropertyValuesHolder o(boolean z) {
        int i2;
        String str;
        int i3;
        if (z) {
            i2 = this.h;
            str = "ANIMATION_STROKE_REVERSE";
            i3 = 0;
        } else {
            str = "ANIMATION_STROKE";
            i3 = this.h;
            i2 = 0;
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i2, i3});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    private boolean p(int i2, int i3, int i4, int i5) {
        return (this.e == i2 && this.f == i3 && this.h == i4 && this.i == i5) ? false : true;
    }

    /* renamed from: g */
    public ValueAnimator a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new a());
        return valueAnimator;
    }

    public kp1 q(int i2, int i3, int i4, int i5) {
        if (this.c != null && p(i2, i3, i4, i5)) {
            this.e = i2;
            this.f = i3;
            this.h = i4;
            this.i = i5;
            ((ValueAnimator) this.c).setValues(new PropertyValuesHolder[]{h(false), h(true), n(false), n(true), o(false), o(true)});
        }
        return this;
    }
}
