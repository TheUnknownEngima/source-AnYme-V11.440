package me.zhanghai.android.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

abstract class BaseSingleCircularProgressDrawable extends BaseProgressDrawable {
    private static final RectF RECT_BOUND = new RectF(-21.0f, -21.0f, 21.0f, 21.0f);
    private static final RectF RECT_PADDED_BOUND = new RectF(-24.0f, -24.0f, 24.0f, 24.0f);
    private static final RectF RECT_PROGRESS = new RectF(-19.0f, -19.0f, 19.0f, 19.0f);

    BaseSingleCircularProgressDrawable() {
    }

    /* access modifiers changed from: protected */
    public void drawRing(Canvas canvas, Paint paint, float f, float f2) {
        canvas.drawArc(RECT_PROGRESS, f - 0.049804688f, f2, false, paint);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas, int i, int i2, Paint paint) {
        RectF rectF;
        float f;
        float f2 = (float) i;
        if (this.mUseIntrinsicPadding) {
            canvas.scale(f2 / RECT_PADDED_BOUND.width(), ((float) i2) / RECT_PADDED_BOUND.height());
            f = RECT_PADDED_BOUND.width() / 2.0f;
            rectF = RECT_PADDED_BOUND;
        } else {
            canvas.scale(f2 / RECT_BOUND.width(), ((float) i2) / RECT_BOUND.height());
            f = RECT_BOUND.width() / 2.0f;
            rectF = RECT_BOUND;
        }
        canvas.translate(f, rectF.height() / 2.0f);
        onDrawRing(canvas, paint);
    }

    /* access modifiers changed from: protected */
    public abstract void onDrawRing(Canvas canvas, Paint paint);

    /* access modifiers changed from: protected */
    public void onPreparePaint(Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);
    }
}
