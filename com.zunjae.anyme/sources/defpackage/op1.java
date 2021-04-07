package defpackage;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import defpackage.wo1;

/* renamed from: op1  reason: default package */
public class op1 extends hp1<ValueAnimator> {
    private int d = -1;
    private int e = -1;
    private dp1 f = new dp1();

    /* renamed from: op1$a */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            op1.this.j(valueAnimator);
        }
    }

    public op1(wo1.a aVar) {
        super(aVar);
    }

    private PropertyValuesHolder h(String str, int i, int i2) {
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i, i2});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    private boolean i(int i, int i2) {
        return (this.d == i && this.e == i2) ? false : true;
    }

    /* access modifiers changed from: private */
    public void j(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE_REVERSE")).intValue();
        this.f.c(intValue);
        this.f.d(intValue2);
        wo1.a aVar = this.b;
        if (aVar != null) {
            aVar.a(this.f);
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

    public op1 k(float f2) {
        T t = this.c;
        if (t != null) {
            long j = (long) (f2 * ((float) this.a));
            if (((ValueAnimator) t).getValues() != null && ((ValueAnimator) this.c).getValues().length > 0) {
                ((ValueAnimator) this.c).setCurrentPlayTime(j);
            }
        }
        return this;
    }

    public op1 l(int i, int i2) {
        if (this.c != null && i(i, i2)) {
            this.d = i;
            this.e = i2;
            ((ValueAnimator) this.c).setValues(new PropertyValuesHolder[]{h("ANIMATION_COORDINATE", i, i2), h("ANIMATION_COORDINATE_REVERSE", i2, i)});
        }
        return this;
    }
}
