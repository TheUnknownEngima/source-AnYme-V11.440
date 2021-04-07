package defpackage;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import defpackage.wo1;

/* renamed from: lp1  reason: default package */
public class lp1 extends ip1 {
    int g;
    float h;
    private bp1 i = new bp1();

    /* renamed from: lp1$a */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            lp1.this.j(valueAnimator);
        }
    }

    public lp1(wo1.a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: private */
    public void j(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
        int intValue3 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_SCALE")).intValue();
        int intValue4 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_SCALE_REVERSE")).intValue();
        this.i.c(intValue);
        this.i.d(intValue2);
        this.i.g(intValue3);
        this.i.h(intValue4);
        wo1.a aVar = this.b;
        if (aVar != null) {
            aVar.a(this.i);
        }
    }

    private boolean o(int i2, int i3, int i4, float f) {
        return (this.e == i2 && this.f == i3 && this.g == i4 && this.h == f) ? false : true;
    }

    /* renamed from: g */
    public ValueAnimator a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new a());
        return valueAnimator;
    }

    /* access modifiers changed from: protected */
    public PropertyValuesHolder n(boolean z) {
        int i2;
        String str;
        int i3;
        if (z) {
            i2 = this.g;
            i3 = (int) (((float) i2) * this.h);
            str = "ANIMATION_SCALE_REVERSE";
        } else {
            i3 = this.g;
            i2 = (int) (((float) i3) * this.h);
            str = "ANIMATION_SCALE";
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i2, i3});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    public lp1 p(int i2, int i3, int i4, float f) {
        if (this.c != null && o(i2, i3, i4, f)) {
            this.e = i2;
            this.f = i3;
            this.g = i4;
            this.h = f;
            ((ValueAnimator) this.c).setValues(new PropertyValuesHolder[]{h(false), h(true), n(false), n(true)});
        }
        return this;
    }
}
