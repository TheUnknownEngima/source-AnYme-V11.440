package ru.dimorinny.floatingtextbutton.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.snackbar.Snackbar;
import ru.dimorinny.floatingtextbutton.FloatingTextButton;

public class SnackbarBehavior extends CoordinatorLayout.Behavior<FloatingTextButton> {
    private static final Interpolator b = new u5();
    private static final Long c = 250L;
    private t4 a = null;

    public SnackbarBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: E */
    public boolean e(CoordinatorLayout coordinatorLayout, FloatingTextButton floatingTextButton, View view) {
        return view instanceof Snackbar.SnackbarLayout;
    }

    /* renamed from: F */
    public boolean h(CoordinatorLayout coordinatorLayout, FloatingTextButton floatingTextButton, View view) {
        if (floatingTextButton.getTranslationY() > Utils.FLOAT_EPSILON) {
            return true;
        }
        t4 t4Var = this.a;
        if (t4Var != null) {
            t4Var.b();
            this.a = null;
        }
        floatingTextButton.setTranslationY(Math.min(Utils.FLOAT_EPSILON, view.getTranslationY() - ((float) view.getHeight())));
        return true;
    }

    /* renamed from: G */
    public void i(CoordinatorLayout coordinatorLayout, FloatingTextButton floatingTextButton, View view) {
        if (view instanceof Snackbar.SnackbarLayout) {
            t4 c2 = o4.c(floatingTextButton);
            c2.l(Utils.FLOAT_EPSILON);
            c2.f(b);
            c2.e(c.longValue());
            this.a = c2;
            c2.k();
        }
        super.i(coordinatorLayout, floatingTextButton, view);
    }
}
