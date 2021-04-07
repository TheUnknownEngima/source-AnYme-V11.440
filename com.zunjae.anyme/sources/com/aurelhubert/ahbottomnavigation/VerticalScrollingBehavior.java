package com.aurelhubert.ahbottomnavigation;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.github.mikephil.charting.utils.Utils;

public abstract class VerticalScrollingBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private int d = 0;

    public VerticalScrollingBehavior() {
    }

    public VerticalScrollingBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void B(CoordinatorLayout coordinatorLayout, V v, View view) {
        super.B(coordinatorLayout, v, view);
    }

    public abstract void E(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3);

    /* access modifiers changed from: protected */
    public abstract boolean F(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, int i);

    public abstract void G(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3);

    public x4 f(CoordinatorLayout coordinatorLayout, V v, x4 x4Var) {
        super.f(coordinatorLayout, v, x4Var);
        return x4Var;
    }

    public boolean n(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
        super.n(coordinatorLayout, v, view, f, f2, z);
        int i = f2 > Utils.FLOAT_EPSILON ? 1 : -1;
        this.d = i;
        return F(coordinatorLayout, v, view, f, f2, i);
    }

    public boolean o(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return super.o(coordinatorLayout, v, view, f, f2);
    }

    public void p(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        int i3;
        super.p(coordinatorLayout, v, view, i, i2, iArr);
        if (i2 <= 0 || this.b >= 0) {
            if (i2 < 0 && this.b > 0) {
                this.b = 0;
                i3 = -1;
            }
            this.b += i2;
            E(coordinatorLayout, v, view, i, i2, iArr, this.d);
        }
        this.b = 0;
        i3 = 1;
        this.d = i3;
        this.b += i2;
        E(coordinatorLayout, v, view, i, i2, iArr, this.d);
    }

    public void r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        int i5;
        super.r(coordinatorLayout, v, view, i, i2, i3, i4);
        if (i4 <= 0 || this.a >= 0) {
            if (i4 < 0 && this.a > 0) {
                this.a = 0;
                i5 = -1;
            }
            int i6 = this.a + i4;
            this.a = i6;
            G(coordinatorLayout, v, this.c, i2, i6);
        }
        this.a = 0;
        i5 = 1;
        this.c = i5;
        int i62 = this.a + i4;
        this.a = i62;
        G(coordinatorLayout, v, this.c, i2, i62);
    }

    public void u(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        super.u(coordinatorLayout, v, view, view2, i);
    }

    public Parcelable y(CoordinatorLayout coordinatorLayout, V v) {
        return super.y(coordinatorLayout, v);
    }

    public boolean z(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        return (i & 2) != 0;
    }
}
