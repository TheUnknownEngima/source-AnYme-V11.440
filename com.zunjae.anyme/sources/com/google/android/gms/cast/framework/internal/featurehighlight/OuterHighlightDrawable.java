package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;

class OuterHighlightDrawable extends Drawable {
    private final Paint a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;

    public void draw(Canvas canvas) {
        canvas.drawCircle(this.d + this.f, this.e + this.g, this.b * this.c, this.a);
    }

    public int getAlpha() {
        return this.a.getAlpha();
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        this.a.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Keep
    public void setScale(float f2) {
        this.c = f2;
        invalidateSelf();
    }

    @Keep
    public void setTranslationX(float f2) {
        this.f = f2;
        invalidateSelf();
    }

    @Keep
    public void setTranslationY(float f2) {
        this.g = f2;
        invalidateSelf();
    }
}
