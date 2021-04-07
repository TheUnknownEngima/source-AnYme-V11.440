package defpackage;

import com.github.mikephil.charting.utils.Utils;

/* renamed from: oa1  reason: default package */
public class oa1 extends na1 {
    float a = -1.0f;

    public void a(ya1 ya1, float f, float f2, float f3) {
        ya1.o(Utils.FLOAT_EPSILON, f3 * f2, 180.0f, 180.0f - f);
        double d = (double) f3;
        double d2 = (double) f2;
        ya1.m((float) (Math.sin(Math.toRadians((double) f)) * d * d2), (float) (Math.sin(Math.toRadians((double) (90.0f - f))) * d * d2));
    }
}
