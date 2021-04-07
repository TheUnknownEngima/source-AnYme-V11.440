package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import defpackage.wo1;

/* renamed from: ip1  reason: default package */
public class ip1 extends hp1<ValueAnimator> {
    private yo1 d = new yo1();
    int e;
    int f;

    /* renamed from: ip1$a */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ip1.this.j(valueAnimator);
        }
    }

    public ip1(wo1.a aVar) {
        super(aVar);
    }

    private boolean i(int i, int i2) {
        return (this.e == i && this.f == i2) ? false : true;
    }

    /* access modifiers changed from: private */
    public void j(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
        this.d.c(intValue);
        this.d.d(intValue2);
        wo1.a aVar = this.b;
        if (aVar != null) {
            aVar.a(this.d);
        }
    }

    public /* bridge */ /* synthetic */ hp1 d(float f2) {
        k(f2);
        return this;
    }

    /* renamed from: g */
    public ValueAnimator a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new a());
        return valueAnimator;
    }

    /* access modifiers changed from: package-private */
    public PropertyValuesHolder h(boolean z) {
        int i;
        String str;
        int i2;
        if (z) {
            i = this.f;
            i2 = this.e;
            str = "ANIMATION_COLOR_REVERSE";
        } else {
            i = this.e;
            i2 = this.f;
            str = "ANIMATION_COLOR";
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i, i2});
        ofInt.setEvaluator(new ArgbEvaluator());
        return ofInt;
    }

    public ip1 k(float f2) {
        T t = this.c;
        if (t != null) {
            long j = (long) (f2 * ((float) this.a));
            if (((ValueAnimator) t).getValues() != null && ((ValueAnimator) this.c).getValues().length > 0) {
                ((ValueAnimator) this.c).setCurrentPlayTime(j);
            }
        }
        return this;
    }

    public ip1 l(int i, int i2) {
        if (this.c != null && i(i, i2)) {
            this.e = i;
            this.f = i2;
            ((ValueAnimator) this.c).setValues(new PropertyValuesHolder[]{h(false), h(true)});
        }
        return this;
    }
}
