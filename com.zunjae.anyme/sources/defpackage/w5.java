package defpackage;

import android.view.animation.Interpolator;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: w5  reason: default package */
abstract class w5 implements Interpolator {
    private final float[] a;
    private final float b;

    protected w5(float[] fArr) {
        this.a = fArr;
        this.b = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= Utils.FLOAT_EPSILON) {
            return Utils.FLOAT_EPSILON;
        }
        float[] fArr = this.a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.b;
        float f3 = (f - (((float) min) * f2)) / f2;
        float[] fArr2 = this.a;
        return fArr2[min] + (f3 * (fArr2[min + 1] - fArr2[min]));
    }
}
