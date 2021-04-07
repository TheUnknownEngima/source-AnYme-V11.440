package defpackage;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import defpackage.wo1;

/* renamed from: np1  reason: default package */
public class np1 extends hp1<ValueAnimator> {
    private cp1 d = new cp1();
    private int e = -1;
    private int f = -1;

    /* renamed from: np1$a */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            np1.this.j(valueAnimator);
        }
    }

    public np1(wo1.a aVar) {
        super(aVar);
    }

    private PropertyValuesHolder h() {
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt("ANIMATION_COORDINATE", new int[]{this.e, this.f});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    private boolean i(int i, int i2) {
        return (this.e == i && this.f == i2) ? false : true;
    }

    /* access modifiers changed from: private */
    public void j(ValueAnimator valueAnimator) {
        this.d.b(((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE")).intValue());
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

    public np1 k(float f2) {
        T t = this.c;
        if (t != null) {
            long j = (long) (f2 * ((float) this.a));
            if (((ValueAnimator) t).getValues() != null && ((ValueAnimator) this.c).getValues().length > 0) {
                ((ValueAnimator) this.c).setCurrentPlayTime(j);
            }
        }
        return this;
    }

    public np1 l(int i, int i2) {
        if (this.c != null && i(i, i2)) {
            this.e = i;
            this.f = i2;
            ((ValueAnimator) this.c).setValues(new PropertyValuesHolder[]{h()});
        }
        return this;
    }
}
