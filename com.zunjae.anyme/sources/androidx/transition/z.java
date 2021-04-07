package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.transition.Transition;

class z {

    private static class a extends AnimatorListenerAdapter implements Transition.f {
        private final View e;
        private final View f;
        private final int g;
        private final int h;
        private int[] i;
        private float j;
        private float k;
        private final float l;
        private final float m;

        a(View view, View view2, int i2, int i3, float f2, float f3) {
            this.f = view;
            this.e = view2;
            this.g = i2 - Math.round(view.getTranslationX());
            this.h = i3 - Math.round(this.f.getTranslationY());
            this.l = f2;
            this.m = f3;
            int[] iArr = (int[]) this.e.getTag(R$id.transition_position);
            this.i = iArr;
            if (iArr != null) {
                this.e.setTag(R$id.transition_position, (Object) null);
            }
        }

        public void a(Transition transition) {
        }

        public void b(Transition transition) {
        }

        public void c(Transition transition) {
            this.f.setTranslationX(this.l);
            this.f.setTranslationY(this.m);
            transition.h0(this);
        }

        public void d(Transition transition) {
        }

        public void e(Transition transition) {
        }

        public void onAnimationCancel(Animator animator) {
            if (this.i == null) {
                this.i = new int[2];
            }
            this.i[0] = Math.round(((float) this.g) + this.f.getTranslationX());
            this.i[1] = Math.round(((float) this.h) + this.f.getTranslationY());
            this.e.setTag(R$id.transition_position, this.i);
        }

        public void onAnimationPause(Animator animator) {
            this.j = this.f.getTranslationX();
            this.k = this.f.getTranslationY();
            this.f.setTranslationX(this.l);
            this.f.setTranslationY(this.m);
        }

        public void onAnimationResume(Animator animator) {
            this.f.setTranslationX(this.j);
            this.f.setTranslationY(this.k);
        }
    }

    static Animator a(View view, x xVar, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, Transition transition) {
        float f5;
        float f6;
        View view2 = view;
        x xVar2 = xVar;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) xVar2.b.getTag(R$id.transition_position);
        if (iArr != null) {
            f5 = ((float) (iArr[0] - i)) + translationX;
            f6 = ((float) (iArr[1] - i2)) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int round = i + Math.round(f5 - translationX);
        int round2 = i2 + Math.round(f6 - translationY);
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f5, f3}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f6, f4})});
        a aVar = new a(view, xVar2.b, round, round2, translationX, translationY);
        transition.b(aVar);
        ofPropertyValuesHolder.addListener(aVar);
        a.a(ofPropertyValuesHolder, aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
