package defpackage;

import android.content.Context;
import android.graphics.Color;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.R$attr;

/* renamed from: w91  reason: default package */
public class w91 {
    private final boolean a;
    private final int b;
    private final int c;
    private final float d;

    public w91(Context context) {
        this.a = ba1.b(context, R$attr.elevationOverlayEnabled, false);
        this.b = t91.b(context, R$attr.elevationOverlayColor, 0);
        this.c = t91.b(context, R$attr.colorSurface, 0);
        this.d = context.getResources().getDisplayMetrics().density;
    }

    private boolean e(int i) {
        return j2.m(i, 255) == this.c;
    }

    public float a(float f) {
        float f2 = this.d;
        return (f2 <= Utils.FLOAT_EPSILON || f <= Utils.FLOAT_EPSILON) ? Utils.FLOAT_EPSILON : Math.min(((((float) Math.log1p((double) (f / f2))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i, float f) {
        float a2 = a(f);
        return j2.m(t91.g(j2.m(i, 255), this.b, a2), Color.alpha(i));
    }

    public int c(int i, float f) {
        return (!this.a || !e(i)) ? i : b(i, f);
    }

    public boolean d() {
        return this.a;
    }
}
