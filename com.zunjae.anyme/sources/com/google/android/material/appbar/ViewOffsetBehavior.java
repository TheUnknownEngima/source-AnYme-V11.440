package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private a a;
    private int b = 0;
    private int c = 0;

    public ViewOffsetBehavior() {
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int E() {
        a aVar = this.a;
        if (aVar != null) {
            return aVar.c();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void F(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.M(v, i);
    }

    public boolean G(int i) {
        a aVar = this.a;
        if (aVar != null) {
            return aVar.f(i);
        }
        this.b = i;
        return false;
    }

    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i) {
        F(coordinatorLayout, v, i);
        if (this.a == null) {
            this.a = new a(v);
        }
        this.a.d();
        this.a.a();
        int i2 = this.b;
        if (i2 != 0) {
            this.a.f(i2);
            this.b = 0;
        }
        int i3 = this.c;
        if (i3 == 0) {
            return true;
        }
        this.a.e(i3);
        this.c = 0;
        return true;
    }
}
