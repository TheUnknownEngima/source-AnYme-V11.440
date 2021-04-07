package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

public class YAxisRendererHorizontalBarChart extends YAxisRenderer {
    protected Path mDrawZeroLinePathBuffer = new Path();
    protected float[] mRenderLimitLinesBuffer = new float[4];
    protected Path mRenderLimitLinesPathBuffer = new Path();

    public YAxisRendererHorizontalBarChart(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
        super(viewPortHandler, yAxis, transformer);
        this.mLimitLinePaint.setTextAlign(Paint.Align.LEFT);
    }

    public void computeAxis(float f, float f2, boolean z) {
        float f3;
        double d;
        if (this.mViewPortHandler.contentHeight() > 10.0f && !this.mViewPortHandler.isFullyZoomedOutX()) {
            MPPointD valuesByTouchPoint = this.mTrans.getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop());
            MPPointD valuesByTouchPoint2 = this.mTrans.getValuesByTouchPoint(this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentTop());
            if (!z) {
                f3 = (float) valuesByTouchPoint.x;
                d = valuesByTouchPoint2.x;
            } else {
                f3 = (float) valuesByTouchPoint2.x;
                d = valuesByTouchPoint.x;
            }
            MPPointD.recycleInstance(valuesByTouchPoint);
            MPPointD.recycleInstance(valuesByTouchPoint2);
            f = f3;
            f2 = (float) d;
        }
        computeAxisValues(f, f2);
    }

    /* access modifiers changed from: protected */
    public void drawYLabels(Canvas canvas, float f, float[] fArr, float f2) {
        this.mAxisLabelPaint.setTypeface(this.mYAxis.getTypeface());
        this.mAxisLabelPaint.setTextSize(this.mYAxis.getTextSize());
        this.mAxisLabelPaint.setColor(this.mYAxis.getTextColor());
        int i = this.mYAxis.isDrawTopYLabelEntryEnabled() ? this.mYAxis.mEntryCount : this.mYAxis.mEntryCount - 1;
        for (int i2 = !this.mYAxis.isDrawBottomYLabelEntryEnabled(); i2 < i; i2++) {
            canvas.drawText(this.mYAxis.getFormattedLabel(i2), fArr[i2 * 2], f - f2, this.mAxisLabelPaint);
        }
    }

    /* access modifiers changed from: protected */
    public void drawZeroLine(Canvas canvas) {
        int save = canvas.save();
        this.mZeroLineClippingRect.set(this.mViewPortHandler.getContentRect());
        this.mZeroLineClippingRect.inset(-this.mYAxis.getZeroLineWidth(), Utils.FLOAT_EPSILON);
        canvas.clipRect(this.mLimitLineClippingRect);
        MPPointD pixelForValues = this.mTrans.getPixelForValues(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
        this.mZeroLinePaint.setColor(this.mYAxis.getZeroLineColor());
        this.mZeroLinePaint.setStrokeWidth(this.mYAxis.getZeroLineWidth());
        Path path = this.mDrawZeroLinePathBuffer;
        path.reset();
        path.moveTo(((float) pixelForValues.x) - 1.0f, this.mViewPortHandler.contentTop());
        path.lineTo(((float) pixelForValues.x) - 1.0f, this.mViewPortHandler.contentBottom());
        canvas.drawPath(path, this.mZeroLinePaint);
        canvas.restoreToCount(save);
    }

    public RectF getGridClippingRect() {
        this.mGridClippingRect.set(this.mViewPortHandler.getContentRect());
        this.mGridClippingRect.inset(-this.mAxis.getGridLineWidth(), Utils.FLOAT_EPSILON);
        return this.mGridClippingRect;
    }

    /* access modifiers changed from: protected */
    public float[] getTransformedPositions() {
        int length = this.mGetTransformedPositionsBuffer.length;
        int i = this.mYAxis.mEntryCount;
        if (length != i * 2) {
            this.mGetTransformedPositionsBuffer = new float[(i * 2)];
        }
        float[] fArr = this.mGetTransformedPositionsBuffer;
        for (int i2 = 0; i2 < fArr.length; i2 += 2) {
            fArr[i2] = this.mYAxis.mEntries[i2 / 2];
        }
        this.mTrans.pointValuesToPixel(fArr);
        return fArr;
    }

    /* access modifiers changed from: protected */
    public Path linePath(Path path, int i, float[] fArr) {
        path.moveTo(fArr[i], this.mViewPortHandler.contentTop());
        path.lineTo(fArr[i], this.mViewPortHandler.contentBottom());
        return path;
    }

    public void renderAxisLabels(Canvas canvas) {
        float f;
        if (this.mYAxis.isEnabled() && this.mYAxis.isDrawLabelsEnabled()) {
            float[] transformedPositions = getTransformedPositions();
            this.mAxisLabelPaint.setTypeface(this.mYAxis.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.mYAxis.getTextSize());
            this.mAxisLabelPaint.setColor(this.mYAxis.getTextColor());
            this.mAxisLabelPaint.setTextAlign(Paint.Align.CENTER);
            float convertDpToPixel = Utils.convertDpToPixel(2.5f);
            float calcTextHeight = (float) Utils.calcTextHeight(this.mAxisLabelPaint, "Q");
            YAxis.AxisDependency axisDependency = this.mYAxis.getAxisDependency();
            YAxis.YAxisLabelPosition labelPosition = this.mYAxis.getLabelPosition();
            if (axisDependency == YAxis.AxisDependency.LEFT) {
                YAxis.YAxisLabelPosition yAxisLabelPosition = YAxis.YAxisLabelPosition.OUTSIDE_CHART;
                f = this.mViewPortHandler.contentTop() - convertDpToPixel;
            } else {
                YAxis.YAxisLabelPosition yAxisLabelPosition2 = YAxis.YAxisLabelPosition.OUTSIDE_CHART;
                f = this.mViewPortHandler.contentBottom() + calcTextHeight + convertDpToPixel;
            }
            drawYLabels(canvas, f, transformedPositions, this.mYAxis.getYOffset());
        }
    }

    public void renderAxisLine(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        if (this.mYAxis.isEnabled() && this.mYAxis.isDrawAxisLineEnabled()) {
            this.mAxisLinePaint.setColor(this.mYAxis.getAxisLineColor());
            this.mAxisLinePaint.setStrokeWidth(this.mYAxis.getAxisLineWidth());
            if (this.mYAxis.getAxisDependency() == YAxis.AxisDependency.LEFT) {
                f4 = this.mViewPortHandler.contentLeft();
                f3 = this.mViewPortHandler.contentTop();
                f2 = this.mViewPortHandler.contentRight();
                f = this.mViewPortHandler.contentTop();
            } else {
                f4 = this.mViewPortHandler.contentLeft();
                f3 = this.mViewPortHandler.contentBottom();
                f2 = this.mViewPortHandler.contentRight();
                f = this.mViewPortHandler.contentBottom();
            }
            canvas.drawLine(f4, f3, f2, f, this.mAxisLinePaint);
        }
    }

    public void renderLimitLines(Canvas canvas) {
        float f;
        float calcTextHeight;
        float f2;
        Canvas canvas2 = canvas;
        List<LimitLine> limitLines = this.mYAxis.getLimitLines();
        if (limitLines != null && limitLines.size() > 0) {
            float[] fArr = this.mRenderLimitLinesBuffer;
            float f3 = Utils.FLOAT_EPSILON;
            fArr[0] = 0.0f;
            char c = 1;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            Path path = this.mRenderLimitLinesPathBuffer;
            path.reset();
            int i = 0;
            while (i < limitLines.size()) {
                LimitLine limitLine = limitLines.get(i);
                if (limitLine.isEnabled()) {
                    int save = canvas.save();
                    this.mLimitLineClippingRect.set(this.mViewPortHandler.getContentRect());
                    this.mLimitLineClippingRect.inset(-limitLine.getLineWidth(), f3);
                    canvas2.clipRect(this.mLimitLineClippingRect);
                    fArr[0] = limitLine.getLimit();
                    fArr[2] = limitLine.getLimit();
                    this.mTrans.pointValuesToPixel(fArr);
                    fArr[c] = this.mViewPortHandler.contentTop();
                    fArr[3] = this.mViewPortHandler.contentBottom();
                    path.moveTo(fArr[0], fArr[c]);
                    path.lineTo(fArr[2], fArr[3]);
                    this.mLimitLinePaint.setStyle(Paint.Style.STROKE);
                    this.mLimitLinePaint.setColor(limitLine.getLineColor());
                    this.mLimitLinePaint.setPathEffect(limitLine.getDashPathEffect());
                    this.mLimitLinePaint.setStrokeWidth(limitLine.getLineWidth());
                    canvas2.drawPath(path, this.mLimitLinePaint);
                    path.reset();
                    String label = limitLine.getLabel();
                    if (label != null && !label.equals("")) {
                        this.mLimitLinePaint.setStyle(limitLine.getTextStyle());
                        this.mLimitLinePaint.setPathEffect((PathEffect) null);
                        this.mLimitLinePaint.setColor(limitLine.getTextColor());
                        this.mLimitLinePaint.setTypeface(limitLine.getTypeface());
                        this.mLimitLinePaint.setStrokeWidth(0.5f);
                        this.mLimitLinePaint.setTextSize(limitLine.getTextSize());
                        float lineWidth = limitLine.getLineWidth() + limitLine.getXOffset();
                        float convertDpToPixel = Utils.convertDpToPixel(2.0f) + limitLine.getYOffset();
                        LimitLine.LimitLabelPosition labelPosition = limitLine.getLabelPosition();
                        if (labelPosition == LimitLine.LimitLabelPosition.RIGHT_TOP) {
                            calcTextHeight = (float) Utils.calcTextHeight(this.mLimitLinePaint, label);
                            this.mLimitLinePaint.setTextAlign(Paint.Align.LEFT);
                            f2 = fArr[0] + lineWidth;
                        } else {
                            if (labelPosition == LimitLine.LimitLabelPosition.RIGHT_BOTTOM) {
                                this.mLimitLinePaint.setTextAlign(Paint.Align.LEFT);
                                f = fArr[0] + lineWidth;
                            } else if (labelPosition == LimitLine.LimitLabelPosition.LEFT_TOP) {
                                this.mLimitLinePaint.setTextAlign(Paint.Align.RIGHT);
                                calcTextHeight = (float) Utils.calcTextHeight(this.mLimitLinePaint, label);
                                f2 = fArr[0] - lineWidth;
                            } else {
                                this.mLimitLinePaint.setTextAlign(Paint.Align.RIGHT);
                                f = fArr[0] - lineWidth;
                            }
                            canvas2.drawText(label, f, this.mViewPortHandler.contentBottom() - convertDpToPixel, this.mLimitLinePaint);
                        }
                        canvas2.drawText(label, f2, this.mViewPortHandler.contentTop() + convertDpToPixel + calcTextHeight, this.mLimitLinePaint);
                    }
                    canvas2.restoreToCount(save);
                }
                i++;
                f3 = Utils.FLOAT_EPSILON;
                c = 1;
            }
        }
    }
}
