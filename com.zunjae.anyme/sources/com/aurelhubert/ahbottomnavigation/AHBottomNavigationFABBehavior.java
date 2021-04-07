package com.aurelhubert.ahbottomnavigation;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class AHBottomNavigationFABBehavior extends CoordinatorLayout.Behavior<FloatingActionButton> {
    private long a;

    private void G(FloatingActionButton floatingActionButton, View view) {
        if (floatingActionButton != null && view != null && (view instanceof Snackbar.SnackbarLayout)) {
            this.a = System.currentTimeMillis();
        } else if (floatingActionButton == null || view == null || !(view instanceof AHBottomNavigation) || System.currentTimeMillis() - this.a < 30) {
            return;
        }
        floatingActionButton.setY(view.getY() - ((float) ((ViewGroup.MarginLayoutParams) floatingActionButton.getLayoutParams()).bottomMargin));
    }

    /* renamed from: E */
    public boolean e(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
        if (view != null && (view instanceof Snackbar.SnackbarLayout)) {
            return true;
        }
        if (view == null || !(view instanceof AHBottomNavigation)) {
            return super.e(coordinatorLayout, floatingActionButton, view);
        }
        return true;
    }

    /* renamed from: F */
    public boolean h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
        G(floatingActionButton, view);
        return super.h(coordinatorLayout, floatingActionButton, view);
    }
}
