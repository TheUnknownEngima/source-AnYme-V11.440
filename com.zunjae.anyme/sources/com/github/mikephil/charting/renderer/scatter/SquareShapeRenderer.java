package com.github.mikephil.charting.renderer.scatter;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.charting.interfaces.datasets.IScatterDataSet;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

public class SquareShapeRenderer implements IShapeRenderer {
    public void renderShape(Canvas canvas, IScatterDataSet iScatterDataSet, ViewPortHandler viewPortHandler, float f, float f2, Paint paint) {
        float f3;
        float f4;
        float f5;
        float f6;
        Canvas canvas2;
        Paint paint2 = paint;
        float scatterShapeSize = iScatterDataSet.getScatterShapeSize();
        float f7 = scatterShapeSize / 2.0f;
        float convertDpToPixel = Utils.convertDpToPixel(iScatterDataSet.getScatterShapeHoleRadius());
        float f8 = (scatterShapeSize - (convertDpToPixel * 2.0f)) / 2.0f;
        float f9 = f8 / 2.0f;
        int scatterShapeHoleColor = iScatterDataSet.getScatterShapeHoleColor();
        if (((double) scatterShapeSize) > Utils.DOUBLE_EPSILON) {
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(f8);
            float f10 = f - convertDpToPixel;
            float f11 = f2 - convertDpToPixel;
            float f12 = f + convertDpToPixel;
            float f13 = f2 + convertDpToPixel;
            canvas.drawRect(f10 - f9, f11 - f9, f12 + f9, f13 + f9, paint);
            if (scatterShapeHoleColor != 1122867) {
                paint2.setStyle(Paint.Style.FILL);
                paint2.setColor(scatterShapeHoleColor);
                canvas2 = canvas;
                f6 = f10;
                f5 = f11;
                f4 = f12;
                f3 = f13;
            } else {
                return;
            }
        } else {
            paint2.setStyle(Paint.Style.FILL);
            f6 = f - f7;
            float f14 = f + f7;
            float f15 = f2 + f7;
            canvas2 = canvas;
            f5 = f2 - f7;
            f4 = f14;
            f3 = f15;
        }
        canvas2.drawRect(f6, f5, f4, f3, paint);
    }
}
