package defpackage;

import com.github.mikephil.charting.utils.Utils;

/* renamed from: z91  reason: default package */
public final class z91 {
    public static float a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot((double) (f3 - f), (double) (f4 - f2));
    }

    public static float b(float f, float f2, float f3, float f4, float f5, float f6) {
        return g(a(f, f2, f3, f4), a(f, f2, f5, f4), a(f, f2, f5, f6), a(f, f2, f3, f6));
    }

    public static float c(float f, int i) {
        float f2 = (float) i;
        int i2 = (int) (f / f2);
        if (Math.signum(f) * f2 < Utils.FLOAT_EPSILON && ((float) (i2 * i)) != f) {
            i2--;
        }
        return f - ((float) (i2 * i));
    }

    public static int d(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    public static boolean e(float f, float f2, float f3) {
        return f + f3 >= f2;
    }

    public static float f(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    private static float g(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }
}
