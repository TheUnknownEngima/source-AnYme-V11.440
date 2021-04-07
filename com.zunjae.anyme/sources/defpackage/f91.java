package defpackage;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: f91  reason: default package */
public class f91 {
    public static final TimeInterpolator a = new LinearInterpolator();
    public static final TimeInterpolator b = new u5();
    public static final TimeInterpolator c = new t5();
    public static final TimeInterpolator d = new v5();
    public static final TimeInterpolator e = new DecelerateInterpolator();

    public static float a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int b(int i, int i2, float f) {
        return i + Math.round(f * ((float) (i2 - i)));
    }
}
