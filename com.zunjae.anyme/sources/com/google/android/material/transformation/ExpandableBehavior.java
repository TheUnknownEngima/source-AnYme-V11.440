package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {
    /* access modifiers changed from: private */
    public int a = 0;

    class a implements ViewTreeObserver.OnPreDrawListener {
        final /* synthetic */ View e;
        final /* synthetic */ int f;
        final /* synthetic */ x91 g;

        a(View view, int i, x91 x91) {
            this.e = view;
            this.f = i;
            this.g = x91;
        }

        public boolean onPreDraw() {
            this.e.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.a == this.f) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                x91 x91 = this.g;
                expandableBehavior.H((View) x91, this.e, x91.g(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private boolean F(boolean z) {
        if (!z) {
            return this.a == 1;
        }
        int i = this.a;
        return i == 0 || i == 2;
    }

    /* access modifiers changed from: protected */
    public x91 G(CoordinatorLayout coordinatorLayout, View view) {
        List<View> v = coordinatorLayout.v(view);
        int size = v.size();
        for (int i = 0; i < size; i++) {
            View view2 = v.get(i);
            if (e(coordinatorLayout, view, view2)) {
                return (x91) view2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract boolean H(View view, View view2, boolean z, boolean z2);

    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        x91 x91 = (x91) view2;
        if (!F(x91.g())) {
            return false;
        }
        this.a = x91.g() ? 1 : 2;
        return H((View) x91, view, x91.g(), true);
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        x91 G;
        if (o4.O(view) || (G = G(coordinatorLayout, view)) == null || !F(G.g())) {
            return false;
        }
        int i2 = G.g() ? 1 : 2;
        this.a = i2;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i2, G));
        return false;
    }
}
