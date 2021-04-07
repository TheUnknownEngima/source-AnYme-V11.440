package com.aurelhubert.ahbottomnavigation;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

public class AHBottomNavigationBehavior<V extends View> extends VerticalScrollingBehavior<V> {
    private static final Interpolator p = new v5();
    private int e;
    private boolean f = false;
    private t4 g;
    private ObjectAnimator h;
    private TabLayout i;
    /* access modifiers changed from: private */
    public Snackbar.SnackbarLayout j;
    private int k = -1;
    /* access modifiers changed from: private */
    public float l = Utils.FLOAT_EPSILON;
    /* access modifiers changed from: private */
    public float m = Utils.FLOAT_EPSILON;
    private boolean n = true;
    /* access modifiers changed from: private */
    public AHBottomNavigation.f o;

    class a implements w4 {
        a() {
        }

        public void a(View view) {
            if (AHBottomNavigationBehavior.this.o != null) {
                AHBottomNavigationBehavior.this.o.a((int) ((((float) view.getMeasuredHeight()) - view.getTranslationY()) + AHBottomNavigationBehavior.this.m));
            }
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ View e;

        b(View view) {
            this.e = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (AHBottomNavigationBehavior.this.j != null && (AHBottomNavigationBehavior.this.j.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                float unused = AHBottomNavigationBehavior.this.l = ((float) this.e.getMeasuredHeight()) - this.e.getTranslationY();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) AHBottomNavigationBehavior.this.j.getLayoutParams();
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, (int) AHBottomNavigationBehavior.this.l);
                AHBottomNavigationBehavior.this.j.requestLayout();
            }
            if (AHBottomNavigationBehavior.this.o != null) {
                AHBottomNavigationBehavior.this.o.a((int) ((((float) this.e.getMeasuredHeight()) - this.e.getTranslationY()) + AHBottomNavigationBehavior.this.m));
            }
        }
    }

    public AHBottomNavigationBehavior() {
    }

    public AHBottomNavigationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AHBottomNavigationBehavior_Params);
        this.e = obtainStyledAttributes.getResourceId(R$styleable.AHBottomNavigationBehavior_Params_tabLayoutId, -1);
        obtainStyledAttributes.recycle();
    }

    public AHBottomNavigationBehavior(boolean z, int i2) {
        this.n = z;
    }

    private void M(V v, int i2, boolean z, boolean z2) {
        if (!this.n && !z) {
            return;
        }
        if (Build.VERSION.SDK_INT < 19) {
            O(v, i2, z2);
            this.h.start();
            return;
        }
        N(v, z2);
        t4 t4Var = this.g;
        t4Var.l((float) i2);
        t4Var.k();
    }

    private void N(V v, boolean z) {
        t4 t4Var = this.g;
        long j2 = 300;
        if (t4Var == null) {
            t4 c = o4.c(v);
            this.g = c;
            if (!z) {
                j2 = 0;
            }
            c.e(j2);
            this.g.j(new a());
            this.g.f(p);
            return;
        }
        if (!z) {
            j2 = 0;
        }
        t4Var.e(j2);
        this.g.b();
    }

    private void O(V v, int i2, boolean z) {
        ObjectAnimator objectAnimator = this.h;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v, View.TRANSLATION_Y, new float[]{(float) i2});
        this.h = ofFloat;
        ofFloat.setDuration(z ? 300 : 0);
        this.h.setInterpolator(p);
        this.h.addUpdateListener(new b(v));
    }

    private TabLayout P(View view) {
        int i2 = this.e;
        if (i2 == 0) {
            return null;
        }
        return (TabLayout) view.findViewById(i2);
    }

    private void Q(V v, int i2) {
        if (this.n) {
            if (i2 == -1 && this.f) {
                this.f = false;
                M(v, 0, false, true);
            } else if (i2 == 1 && !this.f) {
                this.f = true;
                M(v, v.getHeight(), false, true);
            }
        }
    }

    public void E(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int[] iArr, int i4) {
    }

    /* access modifiers changed from: protected */
    public boolean F(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3, int i2) {
        return false;
    }

    public void G(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4) {
    }

    public void R(V v, int i2, boolean z) {
        if (!this.f) {
            this.f = true;
            M(v, i2, true, z);
        }
    }

    public void S(boolean z, int i2) {
        this.n = z;
    }

    public void T(AHBottomNavigation.f fVar) {
        this.o = fVar;
    }

    public void U(View view, View view2) {
        if (view2 != null && (view2 instanceof Snackbar.SnackbarLayout)) {
            this.j = (Snackbar.SnackbarLayout) view2;
            if (this.k == -1) {
                this.k = view2.getHeight();
            }
            int measuredHeight = (int) (((float) view.getMeasuredHeight()) - view.getTranslationY());
            if (Build.VERSION.SDK_INT < 21) {
                view.bringToFront();
            }
            if (view2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, measuredHeight);
                view2.requestLayout();
            }
        }
    }

    public boolean e(CoordinatorLayout coordinatorLayout, V v, View view) {
        if (view == null || !(view instanceof Snackbar.SnackbarLayout)) {
            return super.e(coordinatorLayout, v, view);
        }
        U(v, view);
        return true;
    }

    public boolean h(CoordinatorLayout coordinatorLayout, V v, View view) {
        return super.h(coordinatorLayout, v, view);
    }

    public void i(CoordinatorLayout coordinatorLayout, V v, View view) {
        super.i(coordinatorLayout, v, view);
    }

    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i2) {
        boolean l2 = super.l(coordinatorLayout, v, i2);
        if (this.i == null && this.e != -1) {
            this.i = P(v);
        }
        return l2;
    }

    public void r(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5) {
        int i6;
        super.r(coordinatorLayout, v, view, i2, i3, i4, i5);
        if (i3 < 0) {
            i6 = -1;
        } else if (i3 > 0) {
            i6 = 1;
        } else {
            return;
        }
        Q(v, i6);
    }

    public boolean z(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2) {
        return i2 == 2 || super.z(coordinatorLayout, v, view, view2, i2);
    }
}
