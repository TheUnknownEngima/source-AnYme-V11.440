package com.joanzapata.iconify.internal;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import com.github.mikephil.charting.utils.Utils;
import com.joanzapata.iconify.Icon;

public class CustomTypefaceSpan extends ReplacementSpan {
    private static final float BASELINE_RATIO = 0.14285715f;
    private static final Paint LOCAL_PAINT = new Paint();
    private static final int ROTATION_DURATION = 2000;
    private static final Rect TEXT_BOUNDS = new Rect();
    private final boolean baselineAligned;
    private final String icon;
    private final int iconColor;
    private final float iconSizePx;
    private final float iconSizeRatio;
    private final boolean rotate;
    private final long rotationStartTime = System.currentTimeMillis();
    private final Typeface type;

    public CustomTypefaceSpan(Icon icon2, Typeface typeface, float f, float f2, int i, boolean z, boolean z2) {
        this.rotate = z;
        this.baselineAligned = z2;
        this.icon = String.valueOf(icon2.character());
        this.type = typeface;
        this.iconSizePx = f;
        this.iconSizeRatio = f2;
        this.iconColor = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (r3 > com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void applyCustomTypeFace(android.graphics.Paint r2, android.graphics.Typeface r3) {
        /*
            r1 = this;
            r0 = 0
            r2.setFakeBoldText(r0)
            r0 = 0
            r2.setTextSkewX(r0)
            r2.setTypeface(r3)
            boolean r3 = r1.rotate
            if (r3 == 0) goto L_0x0012
            r2.clearShadowLayer()
        L_0x0012:
            float r3 = r1.iconSizeRatio
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0024
            float r3 = r2.getTextSize()
            float r0 = r1.iconSizeRatio
            float r3 = r3 * r0
        L_0x0020:
            r2.setTextSize(r3)
            goto L_0x002b
        L_0x0024:
            float r3 = r1.iconSizePx
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x002b
            goto L_0x0020
        L_0x002b:
            int r3 = r1.iconColor
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r3 >= r0) goto L_0x0035
            r2.setColor(r3)
        L_0x0035:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.joanzapata.iconify.internal.CustomTypefaceSpan.applyCustomTypeFace(android.graphics.Paint, android.graphics.Typeface):void");
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        applyCustomTypeFace(paint, this.type);
        paint.getTextBounds(this.icon, 0, 1, TEXT_BOUNDS);
        canvas.save();
        float f2 = this.baselineAligned ? Utils.FLOAT_EPSILON : BASELINE_RATIO;
        if (this.rotate) {
            canvas.rotate((((float) (System.currentTimeMillis() - this.rotationStartTime)) / 2000.0f) * 360.0f, (((float) TEXT_BOUNDS.width()) / 2.0f) + f, (((float) i4) - (((float) TEXT_BOUNDS.height()) / 2.0f)) + (((float) TEXT_BOUNDS.height()) * f2));
        }
        String str = this.icon;
        Rect rect = TEXT_BOUNDS;
        canvas.drawText(str, f - ((float) rect.left), ((float) (i4 - rect.bottom)) + (((float) rect.height()) * f2), paint);
        canvas.restore();
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        LOCAL_PAINT.set(paint);
        applyCustomTypeFace(LOCAL_PAINT, this.type);
        LOCAL_PAINT.getTextBounds(this.icon, 0, 1, TEXT_BOUNDS);
        if (fontMetricsInt != null) {
            fontMetricsInt.descent = (int) (((float) TEXT_BOUNDS.height()) * (this.baselineAligned ? Utils.FLOAT_EPSILON : BASELINE_RATIO));
            int height = TEXT_BOUNDS.height();
            int i3 = fontMetricsInt.descent;
            int i4 = -(height - i3);
            fontMetricsInt.ascent = i4;
            fontMetricsInt.top = i4;
            fontMetricsInt.bottom = i3;
        }
        return TEXT_BOUNDS.width();
    }

    public boolean isAnimated() {
        return this.rotate;
    }
}
