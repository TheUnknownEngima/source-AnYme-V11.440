package defpackage;

import android.graphics.Color;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: j2  reason: default package */
public final class j2 {
    private static final ThreadLocal<double[]> a = new ThreadLocal<>();

    public static void a(int i, int i2, int i3, float[] fArr) {
        float f;
        float f2;
        float f3 = ((float) i) / 255.0f;
        float f4 = ((float) i2) / 255.0f;
        float f5 = ((float) i3) / 255.0f;
        float max = Math.max(f3, Math.max(f4, f5));
        float min = Math.min(f3, Math.min(f4, f5));
        float f6 = max - min;
        float f7 = (max + min) / 2.0f;
        if (max == min) {
            f = Utils.FLOAT_EPSILON;
            f2 = Utils.FLOAT_EPSILON;
        } else {
            f = max == f3 ? ((f4 - f5) / f6) % 6.0f : max == f4 ? ((f5 - f3) / f6) + 2.0f : 4.0f + ((f3 - f4) / f6);
            f2 = f6 / (1.0f - Math.abs((2.0f * f7) - 1.0f));
        }
        float f8 = (f * 60.0f) % 360.0f;
        if (f8 < Utils.FLOAT_EPSILON) {
            f8 += 360.0f;
        }
        fArr[0] = k(f8, Utils.FLOAT_EPSILON, 360.0f);
        fArr[1] = k(f2, Utils.FLOAT_EPSILON, 1.0f);
        fArr[2] = k(f7, Utils.FLOAT_EPSILON, 1.0f);
    }

    public static void b(int i, int i2, int i3, double[] dArr) {
        double[] dArr2 = dArr;
        if (dArr2.length == 3) {
            double d = ((double) i) / 255.0d;
            double pow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
            double d2 = ((double) i2) / 255.0d;
            double pow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            double d3 = ((double) i3) / 255.0d;
            double pow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            dArr2[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3)) * 100.0d;
            dArr2[1] = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3)) * 100.0d;
            dArr2[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d)) * 100.0d;
            return;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    public static double c(int i, int i2) {
        if (Color.alpha(i2) == 255) {
            if (Color.alpha(i) < 255) {
                i = i(i, i2);
            }
            double d = d(i) + 0.05d;
            double d2 = d(i2) + 0.05d;
            return Math.max(d, d2) / Math.min(d, d2);
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
    }

    public static double d(int i) {
        double[] l = l();
        g(i, l);
        return l[1] / 100.0d;
    }

    public static int e(int i, int i2, float f) {
        int i3 = 255;
        if (Color.alpha(i2) == 255) {
            double d = (double) f;
            if (c(m(i, 255), i2) < d) {
                return -1;
            }
            int i4 = 0;
            for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
                int i6 = (i4 + i3) / 2;
                if (c(m(i, i6), i2) < d) {
                    i4 = i6;
                } else {
                    i3 = i6;
                }
            }
            return i3;
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
    }

    public static void f(int i, float[] fArr) {
        a(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    public static void g(int i, double[] dArr) {
        b(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    private static int h(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }

    public static int i(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int h = h(alpha2, alpha);
        return Color.argb(h, j(Color.red(i), alpha2, Color.red(i2), alpha, h), j(Color.green(i), alpha2, Color.green(i2), alpha, h), j(Color.blue(i), alpha2, Color.blue(i2), alpha, h));
    }

    private static int j(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    private static float k(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    private static double[] l() {
        double[] dArr = a.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        a.set(dArr2);
        return dArr2;
    }

    public static int m(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
