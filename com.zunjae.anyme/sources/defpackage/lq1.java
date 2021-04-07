package defpackage;

import android.util.Pair;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: lq1  reason: default package */
public class lq1 {
    public static int a(vp1 vp1, int i) {
        if (vp1 == null) {
            return 0;
        }
        return vp1.f() == wp1.HORIZONTAL ? g(vp1, i) : h(vp1, i);
    }

    private static int b(vp1 vp1, float f, float f2) {
        int c = vp1.c();
        int l = vp1.l();
        int r = vp1.r();
        int g = vp1.g();
        int d = vp1.f() == wp1.HORIZONTAL ? vp1.d() : vp1.u();
        int i = 0;
        int i2 = 0;
        while (i < c) {
            int i3 = (l * 2) + (r / 2) + (i > 0 ? g : g / 2) + i2;
            boolean z = true;
            boolean z2 = f >= ((float) i2) && f <= ((float) i3);
            if (f2 < Utils.FLOAT_EPSILON || f2 > ((float) d)) {
                z = false;
            }
            if (z2 && z) {
                return i;
            }
            i++;
            i2 = i3;
        }
        return -1;
    }

    private static int c(vp1 vp1, int i) {
        int c = vp1.c();
        int l = vp1.l();
        int r = vp1.r();
        int g = vp1.g();
        int i2 = 0;
        for (int i3 = 0; i3 < c; i3++) {
            int i4 = r / 2;
            int i5 = i2 + l + i4;
            if (i == i3) {
                return i5;
            }
            i2 = i5 + l + g + i4;
        }
        return vp1.b() == gp1.DROP ? i2 + (l * 2) : i2;
    }

    public static int d(vp1 vp1, float f, float f2) {
        if (vp1 == null) {
            return -1;
        }
        if (vp1.f() != wp1.HORIZONTAL) {
            float f3 = f2;
            f2 = f;
            f = f3;
        }
        return b(vp1, f, f2);
    }

    public static Pair<Integer, Float> e(vp1 vp1, int i, float f, boolean z) {
        int c = vp1.c();
        int p = vp1.p();
        if (z) {
            i = (c - 1) - i;
        }
        boolean z2 = false;
        if (i < 0) {
            i = 0;
        } else {
            int i2 = c - 1;
            if (i > i2) {
                i = i2;
            }
        }
        boolean z3 = i > p;
        boolean z4 = !z ? i + 1 < p : i + -1 < p;
        if (z3 || z4) {
            vp1.Q(i);
            p = i;
        }
        float f2 = Utils.FLOAT_EPSILON;
        if (p == i && f != Utils.FLOAT_EPSILON) {
            z2 = true;
        }
        if (z2) {
            i = z ? i - 1 : i + 1;
        } else {
            f = 1.0f - f;
        }
        if (f > 1.0f) {
            f2 = 1.0f;
        } else if (f >= Utils.FLOAT_EPSILON) {
            f2 = f;
        }
        return new Pair<>(Integer.valueOf(i), Float.valueOf(f2));
    }

    private static int f(vp1 vp1) {
        int l = vp1.l();
        return vp1.b() == gp1.DROP ? l * 3 : l;
    }

    public static int g(vp1 vp1, int i) {
        if (vp1 == null) {
            return 0;
        }
        return (vp1.f() == wp1.HORIZONTAL ? c(vp1, i) : f(vp1)) + vp1.i();
    }

    public static int h(vp1 vp1, int i) {
        if (vp1 == null) {
            return 0;
        }
        return (vp1.f() == wp1.HORIZONTAL ? f(vp1) : c(vp1, i)) + vp1.k();
    }
}
