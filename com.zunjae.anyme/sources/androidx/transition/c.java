package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;
import com.github.mikephil.charting.utils.Utils;

public class c extends p0 {
    private float b = 3.0f;

    private static float h(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
    }

    public long c(ViewGroup viewGroup, Transition transition, x xVar, x xVar2) {
        int i;
        int i2;
        int i3;
        if (xVar == null && xVar2 == null) {
            return 0;
        }
        if (xVar2 == null || e(xVar) == 0) {
            i = -1;
        } else {
            xVar = xVar2;
            i = 1;
        }
        int f = f(xVar);
        int g = g(xVar);
        Rect x = transition.x();
        if (x != null) {
            i3 = x.centerX();
            i2 = x.centerY();
        } else {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            int round = Math.round(((float) (iArr[0] + (viewGroup.getWidth() / 2))) + viewGroup.getTranslationX());
            i2 = Math.round(((float) (iArr[1] + (viewGroup.getHeight() / 2))) + viewGroup.getTranslationY());
            i3 = round;
        }
        float h = h((float) f, (float) g, (float) i3, (float) i2) / h(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) viewGroup.getWidth(), (float) viewGroup.getHeight());
        long w = transition.w();
        if (w < 0) {
            w = 300;
        }
        return (long) Math.round((((float) (w * ((long) i))) / this.b) * h);
    }
}
