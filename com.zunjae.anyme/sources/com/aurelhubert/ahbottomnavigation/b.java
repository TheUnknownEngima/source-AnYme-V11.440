package com.aurelhubert.ahbottomnavigation;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class b {

    static class a implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ View e;

        a(View view) {
            this.e = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (this.e.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.e.getLayoutParams();
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, (int) floatValue, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                this.e.requestLayout();
            }
        }
    }

    /* renamed from: com.aurelhubert.ahbottomnavigation.b$b  reason: collision with other inner class name */
    static class C0079b implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ View e;

        C0079b(View view) {
            this.e = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (this.e.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.e.getLayoutParams();
                marginLayoutParams.setMargins((int) floatValue, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                this.e.requestLayout();
            }
        }
    }

    static class c implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ TextView e;

        c(TextView textView) {
            this.e = textView;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.e.setTextSize(0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    static class d implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ View e;

        d(View view) {
            this.e = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.e.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    static class e implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ TextView e;

        e(TextView textView) {
            this.e = textView;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.e.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    static class f implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ View e;

        f(View view) {
            this.e = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.e.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    static class g implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ ImageView e;
        final /* synthetic */ Drawable f;
        final /* synthetic */ boolean g;

        g(ImageView imageView, Drawable drawable, boolean z) {
            this.e = imageView;
            this.f = drawable;
            this.g = z;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.e.setImageDrawable(b.a(this.f, ((Integer) valueAnimator.getAnimatedValue()).intValue(), this.g));
            this.e.requestLayout();
        }
    }

    static class h implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ View e;

        h(View view) {
            this.e = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
            layoutParams.width = Math.round(((Float) valueAnimator.getAnimatedValue()).floatValue());
            this.e.setLayoutParams(layoutParams);
        }
    }

    public static Drawable a(Drawable drawable, int i, boolean z) {
        if (z) {
            drawable.clearColorFilter();
            drawable.mutate().setColorFilter(i, PorterDuff.Mode.SRC_IN);
            drawable.invalidateSelf();
            return drawable;
        }
        Drawable mutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
        androidx.core.graphics.drawable.a.n(mutate, i);
        return mutate;
    }

    public static void b(View view, float f2, float f3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f2, f3});
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new d(view));
        ofFloat.start();
    }

    public static void c(Context context, Drawable drawable, ImageView imageView, int i, int i2, boolean z) {
        if (z) {
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
            ofObject.setDuration(150);
            ofObject.addUpdateListener(new g(imageView, drawable, z));
            ofObject.start();
        }
    }

    public static void d(View view, int i, int i2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) i, (float) i2});
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new C0079b(view));
        ofFloat.start();
    }

    public static void e(TextView textView, int i, int i2) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        ofObject.setDuration(150);
        ofObject.addUpdateListener(new e(textView));
        ofObject.start();
    }

    public static void f(TextView textView, float f2, float f3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f2, f3});
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new c(textView));
        ofFloat.start();
    }

    public static void g(View view, int i, int i2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) i, (float) i2});
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new a(view));
        ofFloat.start();
    }

    public static void h(View view, int i, int i2) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        ofObject.setDuration(150);
        ofObject.addUpdateListener(new f(view));
        ofObject.start();
    }

    public static void i(View view, float f2, float f3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f2, f3});
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new h(view));
        ofFloat.start();
    }
}
