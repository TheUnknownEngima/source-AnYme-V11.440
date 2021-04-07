package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import defpackage.qp1;
import defpackage.wo1;

/* renamed from: pp1  reason: default package */
public class pp1 extends qp1 {
    private ep1 k = new ep1();

    /* renamed from: pp1$a */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            pp1.this.r(valueAnimator);
        }
    }

    public pp1(wo1.a aVar) {
        super(aVar);
    }

    private ValueAnimator p(int i, int i2, long j) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new a());
        return ofInt;
    }

    /* access modifiers changed from: private */
    public void r(ValueAnimator valueAnimator) {
        this.k.f(((Integer) valueAnimator.getAnimatedValue()).intValue());
        wo1.a aVar = this.b;
        if (aVar != null) {
            aVar.a(this.k);
        }
    }

    public /* bridge */ /* synthetic */ hp1 b(long j) {
        q(j);
        return this;
    }

    public /* bridge */ /* synthetic */ hp1 d(float f) {
        s(f);
        return this;
    }

    public /* bridge */ /* synthetic */ qp1 j(long j) {
        q(j);
        return this;
    }

    public /* bridge */ /* synthetic */ qp1 m(float f) {
        s(f);
        return this;
    }

    public qp1 n(int i, int i2, int i3, boolean z) {
        int i4 = i;
        int i5 = i3;
        boolean z2 = z;
        if (k(i, i2, i3, z)) {
            this.c = a();
            this.d = i4;
            this.e = i2;
            this.f = i5;
            this.g = z2;
            int i6 = i5 * 2;
            int i7 = i4 - i5;
            this.h = i7;
            this.i = i4 + i5;
            this.k.d(i7);
            this.k.c(this.i);
            this.k.f(i6);
            qp1.b h = h(z2);
            long j = this.a;
            long j2 = (long) (((double) j) * 0.8d);
            long j3 = (long) (((double) j) * 0.2d);
            long j4 = (long) (((double) j) * 0.5d);
            long j5 = (long) (((double) j) * 0.5d);
            long j6 = j2;
            ValueAnimator i8 = i(h.a, h.b, j6, false, this.k);
            ValueAnimator i9 = i(h.c, h.d, j6, true, this.k);
            i9.setStartDelay(j3);
            long j7 = j5;
            ValueAnimator p = p(i6, i5, j7);
            ValueAnimator p2 = p(i5, i6, j7);
            p2.setStartDelay(j4);
            ((AnimatorSet) this.c).playTogether(new Animator[]{i8, i9, p, p2});
        }
        return this;
    }

    public pp1 q(long j) {
        super.b(j);
        return this;
    }

    public pp1 s(float f) {
        T t = this.c;
        if (t != null) {
            long j = (long) (f * ((float) this.a));
            int size = ((AnimatorSet) t).getChildAnimations().size();
            for (int i = 0; i < size; i++) {
                ValueAnimator valueAnimator = (ValueAnimator) ((AnimatorSet) this.c).getChildAnimations().get(i);
                long startDelay = j - valueAnimator.getStartDelay();
                long duration = valueAnimator.getDuration();
                if (startDelay > duration) {
                    startDelay = duration;
                } else if (startDelay < 0) {
                    startDelay = 0;
                }
                if ((i != size - 1 || startDelay > 0) && valueAnimator.getValues() != null && valueAnimator.getValues().length > 0) {
                    valueAnimator.setCurrentPlayTime(startDelay);
                }
            }
        }
        return this;
    }
}
