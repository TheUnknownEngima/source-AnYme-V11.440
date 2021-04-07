package com.leinardi.android.speeddial;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.utils.Utils;

public class b {

    class a implements Runnable {
        final /* synthetic */ View e;

        a(View view) {
            this.e = view;
        }

        public void run() {
            this.e.setVisibility(8);
        }
    }

    /* renamed from: com.leinardi.android.speeddial.b$b  reason: collision with other inner class name */
    class C0149b implements Animation.AnimationListener {
        final /* synthetic */ View a;

        C0149b(View view) {
            this.a = view;
        }

        public void onAnimationEnd(Animation animation) {
            this.a.setVisibility(8);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    class c implements Runnable {
        final /* synthetic */ boolean e;
        final /* synthetic */ View f;

        c(boolean z, View view) {
            this.e = z;
            this.f = view;
        }

        public void run() {
            if (this.e) {
                ViewGroup viewGroup = (ViewGroup) this.f.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(this.f);
                    return;
                }
                return;
            }
            this.f.setVisibility(8);
        }
    }

    class d extends LayerDrawable {
        final /* synthetic */ float e;
        final /* synthetic */ Drawable f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Drawable[] drawableArr, float f2, Drawable drawable) {
            super(drawableArr);
            this.e = f2;
            this.f = drawable;
        }

        public void draw(Canvas canvas) {
            canvas.save();
            canvas.rotate(this.e, (float) (this.f.getBounds().width() / 2), (float) (this.f.getBounds().height() / 2));
            super.draw(canvas);
            canvas.restore();
        }
    }

    class e implements Runnable {
        final /* synthetic */ View e;

        e(View view) {
            this.e = view;
        }

        public void run() {
            this.e.setPressed(false);
            this.e.performClick();
        }
    }

    public static int a(Context context, float f) {
        return Math.round(TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics()));
    }

    public static void b(View view, long j) {
        o4.c(view).b();
        view.setVisibility(0);
        Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), R$anim.sd_scale_fade_and_translate_in);
        loadAnimation.setStartOffset(j);
        view.startAnimation(loadAnimation);
    }

    public static void c(View view) {
        o4.c(view).b();
        view.setAlpha(Utils.FLOAT_EPSILON);
        view.setVisibility(0);
        t4 c2 = o4.c(view);
        c2.a(1.0f);
        c2.n();
        c2.e((long) view.getContext().getResources().getInteger(R$integer.sd_open_animation_duration));
        c2.f(new u5());
        c2.k();
    }

    public static void d(View view) {
        o4.c(view).b();
        view.setAlpha(1.0f);
        view.setVisibility(0);
        t4 c2 = o4.c(view);
        c2.a(Utils.FLOAT_EPSILON);
        c2.n();
        c2.e((long) view.getContext().getResources().getInteger(R$integer.sd_close_animation_duration));
        c2.f(new u5());
        c2.m(new a(view));
        c2.k();
    }

    public static int e(Context context) {
        int identifier = Build.VERSION.SDK_INT >= 21 ? 16843829 : context.getResources().getIdentifier("colorAccent", "attr", context.getPackageName());
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(identifier, typedValue, true);
        return typedValue.data;
    }

    public static int f(Context context) {
        int identifier = Build.VERSION.SDK_INT >= 21 ? 16843827 : context.getResources().getIdentifier("colorPrimary", "attr", context.getPackageName());
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(identifier, typedValue, true);
        return typedValue.data;
    }

    public static Drawable g(Drawable drawable, float f) {
        if (f == Utils.FLOAT_EPSILON) {
            return drawable;
        }
        return new d(new Drawable[]{drawable}, f, drawable);
    }

    public static void h(View view) {
        view.setPressed(true);
        view.postDelayed(new e(view), (long) ViewConfiguration.getTapTimeout());
    }

    public static void i(View view, boolean z) {
        t4 c2 = o4.c(view);
        c2.d(Utils.FLOAT_EPSILON);
        c2.n();
        c2.e(z ? (long) view.getContext().getResources().getInteger(R$integer.sd_rotate_animation_duration) : 0);
        c2.f(new u5());
        c2.k();
    }

    public static void j(View view, float f, boolean z) {
        t4 c2 = o4.c(view);
        c2.d(f);
        c2.n();
        c2.e(z ? (long) view.getContext().getResources().getInteger(R$integer.sd_rotate_animation_duration) : 0);
        c2.f(new u5());
        c2.k();
    }

    public static void k(View view, long j) {
        o4.c(view).b();
        view.setVisibility(0);
        Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), R$anim.sd_scale_fade_and_translate_out);
        loadAnimation.setStartOffset(j);
        loadAnimation.setAnimationListener(new C0149b(view));
        view.startAnimation(loadAnimation);
    }

    public static void l(View view, boolean z) {
        o4.c(view).b();
        t4 c2 = o4.c(view);
        c2.a(Utils.FLOAT_EPSILON);
        c2.n();
        c2.e((long) view.getContext().getResources().getInteger(R$integer.sd_close_animation_duration));
        c2.f(new u5());
        c2.m(new c(z, view));
        c2.k();
    }
}
