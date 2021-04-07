package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.github.mikephil.charting.utils.Utils;

public final class b implements f {
    private RectF a = new RectF();
    private int b = 1;

    private void e(Canvas canvas, Paint paint, float f, float f2, float f3, boolean z, RectF rectF) {
        Canvas canvas2 = canvas;
        float f4 = z ? -1.0f : 1.0f;
        canvas.save();
        canvas.rotate(f3);
        float f5 = f / 2.0f;
        float f6 = f4 * f2;
        Paint paint2 = paint;
        canvas.drawRect((this.a.right - f5) + f2, Math.min(Utils.FLOAT_EPSILON, ((float) this.b) * f6), (this.a.right + f5) - f2, Math.max(Utils.FLOAT_EPSILON, f6 * ((float) this.b)), paint2);
        canvas.translate((this.a.right - f5) + f2, Utils.FLOAT_EPSILON);
        RectF rectF2 = rectF;
        canvas.drawArc(rectF2, 180.0f, (-f4) * 90.0f * ((float) this.b), true, paint2);
        canvas.translate(f - (f2 * 2.0f), Utils.FLOAT_EPSILON);
        canvas.drawArc(rectF2, Utils.FLOAT_EPSILON, f4 * 90.0f * ((float) this.b), true, paint2);
        canvas.restore();
    }

    private static int f(l lVar) {
        return (lVar.i * 2) + lVar.b + (lVar.h * 2);
    }

    public int a(l lVar) {
        return f(lVar);
    }

    public int b(l lVar) {
        return f(lVar);
    }

    public void c(Canvas canvas, Paint paint, int i, float f, float f2, float f3, float f4) {
        Paint paint2 = paint;
        float f5 = f4;
        if (f != f2) {
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeCap(Paint.Cap.BUTT);
            paint2.setAntiAlias(true);
            paint.setColor(i);
            paint2.setStrokeWidth(f3);
            int i2 = this.b;
            float f6 = f * 360.0f * ((float) i2);
            float f7 = (f2 >= f ? f2 - f : (f2 + 1.0f) - f) * 360.0f * ((float) i2);
            canvas.drawArc(this.a, f6, f7, false, paint);
            if (f5 > Utils.FLOAT_EPSILON && Math.abs(f7) < 360.0f) {
                paint2.setStyle(Paint.Style.FILL);
                float f8 = -f5;
                RectF rectF = new RectF(f8, f8, f5, f5);
                Canvas canvas2 = canvas;
                Paint paint3 = paint;
                float f9 = f3;
                float f10 = f4;
                RectF rectF2 = rectF;
                e(canvas2, paint3, f9, f10, f6, true, rectF2);
                e(canvas2, paint3, f9, f10, f6 + f7, false, rectF2);
            }
        }
    }

    public void d(Canvas canvas, l lVar, float f) {
        int i = lVar.i + (lVar.b / 2) + lVar.h;
        float f2 = (float) i;
        canvas.translate(f2, f2);
        canvas.rotate(-90.0f);
        int i2 = -i;
        canvas.clipRect(i2, i2, i, i);
        float f3 = (float) lVar.i;
        int i3 = lVar.g;
        int i4 = 1;
        if (i3 == 1) {
            f3 += ((1.0f - f) * ((float) lVar.b)) / 2.0f;
        } else if (i3 == 2) {
            f3 -= ((1.0f - f) * ((float) lVar.b)) / 2.0f;
        }
        float f4 = -f3;
        this.a = new RectF(f4, f4, f3, f3);
        if (lVar.f) {
            i4 = -1;
        }
        this.b = i4;
    }
}
