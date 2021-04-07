package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {
    final Rect d = new Rect();
    final Rect e = new Rect();
    private int f = 0;
    private int g;

    public HeaderScrollingViewBehavior() {
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static int N(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public void F(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        View H = H(coordinatorLayout.v(view));
        if (H != null) {
            CoordinatorLayout.e eVar = (CoordinatorLayout.e) view.getLayoutParams();
            Rect rect = this.d;
            rect.set(coordinatorLayout.getPaddingLeft() + eVar.leftMargin, H.getBottom() + eVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - eVar.rightMargin, ((coordinatorLayout.getHeight() + H.getBottom()) - coordinatorLayout.getPaddingBottom()) - eVar.bottomMargin);
            x4 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && o4.v(coordinatorLayout) && !o4.v(view)) {
                rect.left += lastWindowInsets.d();
                rect.right -= lastWindowInsets.e();
            }
            Rect rect2 = this.e;
            y3.a(N(eVar.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int I = I(H);
            view.layout(rect2.left, rect2.top - I, rect2.right, rect2.bottom - I);
            i2 = rect2.top - H.getBottom();
        } else {
            super.F(coordinatorLayout, view, i);
            i2 = 0;
        }
        this.f = i2;
    }

    /* access modifiers changed from: package-private */
    public abstract View H(List<View> list);

    /* access modifiers changed from: package-private */
    public final int I(View view) {
        if (this.g == 0) {
            return 0;
        }
        float J = J(view);
        int i = this.g;
        return y2.b((int) (J * ((float) i)), 0, i);
    }

    /* access modifiers changed from: package-private */
    public float J(View view) {
        return 1.0f;
    }

    public final int K() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public int L(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    public final int M() {
        return this.f;
    }

    public final void O(int i) {
        this.g = i;
    }

    /* access modifiers changed from: protected */
    public boolean P() {
        return false;
    }

    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View H;
        x4 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (H = H(coordinatorLayout.v(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (o4.v(H) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.f() + lastWindowInsets.c();
        }
        int L = size + L(H);
        int measuredHeight = H.getMeasuredHeight();
        if (P()) {
            view.setTranslationY((float) (-measuredHeight));
        } else {
            L -= measuredHeight;
        }
        coordinatorLayout.N(view, i, i2, View.MeasureSpec.makeMeasureSpec(L, i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }
}
