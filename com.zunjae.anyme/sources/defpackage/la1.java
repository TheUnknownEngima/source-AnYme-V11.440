package defpackage;

import android.graphics.RectF;
import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;

/* renamed from: la1  reason: default package */
public final class la1 implements ma1 {
    private final ma1 a;
    private final float b;

    public la1(float f, ma1 ma1) {
        while (ma1 instanceof la1) {
            ma1 = ((la1) ma1).a;
            f += ((la1) ma1).b;
        }
        this.a = ma1;
        this.b = f;
    }

    public float a(RectF rectF) {
        return Math.max(Utils.FLOAT_EPSILON, this.a.a(rectF) + this.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la1)) {
            return false;
        }
        la1 la1 = (la1) obj;
        return this.a.equals(la1.a) && this.b == la1.b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
