package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

class m0 extends l0 {
    private static boolean k = true;

    m0() {
    }

    @SuppressLint({"NewApi"})
    public void h(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.h(view, i);
        } else if (k) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                k = false;
            }
        }
    }
}
