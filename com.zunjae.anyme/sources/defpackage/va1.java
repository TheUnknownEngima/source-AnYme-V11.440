package defpackage;

import com.github.mikephil.charting.utils.Utils;

/* renamed from: va1  reason: default package */
public class va1 extends na1 {
    float a = -1.0f;

    public void a(ya1 ya1, float f, float f2, float f3) {
        ya1.o(Utils.FLOAT_EPSILON, f3 * f2, 180.0f, 180.0f - f);
        float f4 = f3 * 2.0f * f2;
        ya1.a(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, f4, f4, 180.0f, f);
    }
}
