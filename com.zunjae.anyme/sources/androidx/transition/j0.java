package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;

class j0 extends o0 {
    private static boolean f = true;

    j0() {
    }

    public void a(View view) {
    }

    @SuppressLint({"NewApi"})
    public float c(View view) {
        if (f) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
        return view.getAlpha();
    }

    public void d(View view) {
    }

    @SuppressLint({"NewApi"})
    public void g(View view, float f2) {
        if (f) {
            try {
                view.setTransitionAlpha(f2);
                return;
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
        view.setAlpha(f2);
    }
}
