package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.github.mikephil.charting.utils.Utils;

final class i implements f {
    private float a = 300.0f;

    i() {
    }

    private static void e(Canvas canvas, Paint paint, float f, float f2, float f3, float f4, RectF rectF) {
        canvas.save();
        canvas.translate(f, f2);
        canvas.drawArc(rectF, f3, f4, true, paint);
        canvas.restore();
    }

    public int a(l lVar) {
        return lVar.b;
    }

    public int b(l lVar) {
        return -1;
    }

    public void c(Canvas canvas, Paint paint, int i, float f, float f2, float f3, float f4) {
        Paint paint2 = paint;
        float f5 = f3;
        float f6 = f4;
        if (f != f2) {
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint.setColor(i);
            float f7 = this.a;
            float f8 = f6 * 2.0f;
            float f9 = (-f5) / 2.0f;
            PointF pointF = new PointF(((-f7) / 2.0f) + f6 + ((f7 - f8) * f), f9 + f6);
            float f10 = this.a;
            float f11 = f5 / 2.0f;
            PointF pointF2 = new PointF(((-f10) / 2.0f) + f6 + ((f10 - f8) * f2), f11 - f6);
            if (f6 > Utils.FLOAT_EPSILON) {
                float f12 = -f6;
                RectF rectF = new RectF(f12, f12, f6, f6);
                Canvas canvas2 = canvas;
                Paint paint3 = paint;
                RectF rectF2 = rectF;
                e(canvas2, paint3, pointF.x, pointF.y, 180.0f, 90.0f, rectF);
                e(canvas2, paint3, pointF.x, pointF2.y, 180.0f, -90.0f, rectF);
                e(canvas2, paint3, pointF2.x, pointF.y, Utils.FLOAT_EPSILON, -90.0f, rectF);
                e(canvas2, paint3, pointF2.x, pointF2.y, Utils.FLOAT_EPSILON, 90.0f, rectF);
                if (f5 > f8) {
                    float f13 = pointF.x;
                    Canvas canvas3 = canvas;
                    Paint paint4 = paint;
                    canvas3.drawRect(f13 - f6, pointF.y, f13, pointF2.y, paint4);
                    float f14 = pointF2.x;
                    canvas3.drawRect(f14, pointF.y, f14 + f6, pointF2.y, paint4);
                }
            }
            canvas.drawRect(pointF.x, f9, pointF2.x, f11, paint);
        }
    }

    public void d(Canvas canvas, l lVar, float f) {
        Rect clipBounds = canvas.getClipBounds();
        this.a = (float) clipBounds.width();
        float f2 = (float) lVar.b;
        canvas.translate(((float) clipBounds.width()) / 2.0f, (((float) clipBounds.height()) / 2.0f) + Math.max(Utils.FLOAT_EPSILON, ((float) (clipBounds.height() - lVar.b)) / 2.0f));
        if (lVar.f) {
            canvas.scale(-1.0f, 1.0f);
        }
        if (lVar.g == 2) {
            canvas.scale(1.0f, -1.0f);
        }
        int i = lVar.g;
        if (i == 1 || i == 2) {
            canvas.translate(Utils.FLOAT_EPSILON, (((float) lVar.b) * (f - 1.0f)) / 2.0f);
        }
        float f3 = this.a;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
    }
}
