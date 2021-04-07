package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;
import com.github.mikephil.charting.utils.Utils;

class InnerZoneDrawable extends Drawable {
    private final Paint a;
    private final Paint b;
    private final int c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;

    public void draw(Canvas canvas) {
        float f2 = this.i;
        if (f2 > Utils.FLOAT_EPSILON) {
            float f3 = this.d * this.h;
            this.b.setAlpha((int) (((float) this.c) * f2));
            canvas.drawCircle(this.f, this.g, f3, this.b);
        }
        canvas.drawCircle(this.f, this.g, this.d * this.e, this.a);
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i2) {
        this.a.setAlpha(i2);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Keep
    public void setPulseAlpha(float f2) {
        this.i = f2;
        invalidateSelf();
    }

    @Keep
    public void setPulseScale(float f2) {
        this.h = f2;
        invalidateSelf();
    }

    @Keep
    public void setScale(float f2) {
        this.e = f2;
        invalidateSelf();
    }
}
