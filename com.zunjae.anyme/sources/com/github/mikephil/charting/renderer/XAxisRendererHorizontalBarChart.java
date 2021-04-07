package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.utils.FSize;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

public class XAxisRendererHorizontalBarChart extends XAxisRenderer {
    protected BarChart mChart;
    protected Path mRenderLimitLinesPathBuffer = new Path();

    public XAxisRendererHorizontalBarChart(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer, BarChart barChart) {
        super(viewPortHandler, xAxis, transformer);
        this.mChart = barChart;
    }

    public void computeAxis(float f, float f2, boolean z) {
        float f3;
        double d;
        if (this.mViewPortHandler.contentWidth() > 10.0f && !this.mViewPortHandler.isFullyZoomedOutY()) {
            MPPointD valuesByTouchPoint = this.mTrans.getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom());
            MPPointD valuesByTouchPoint2 = this.mTrans.getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop());
            if (z) {
                f3 = (float) valuesByTouchPoint2.y;
                d = valuesByTouchPoint.y;
            } else {
                f3 = (float) valuesByTouchPoint.y;
                d = valuesByTouchPoint2.y;
            }
            MPPointD.recycleInstance(valuesByTouchPoint);
            MPPointD.recycleInstance(valuesByTouchPoint2);
            f = f3;
            f2 = (float) d;
        }
        computeAxisValues(f, f2);
    }

    /* access modifiers changed from: protected */
    public void computeSize() {
        this.mAxisLabelPaint.setTypeface(this.mXAxis.getTypeface());
        this.mAxisLabelPaint.setTextSize(this.mXAxis.getTextSize());
        FSize calcTextSize = Utils.calcTextSize(this.mAxisLabelPaint, this.mXAxis.getLongestLabel());
        float f = calcTextSize.height;
        FSize sizeOfRotatedRectangleByDegrees = Utils.getSizeOfRotatedRectangleByDegrees(calcTextSize.width, f, this.mXAxis.getLabelRotationAngle());
        this.mXAxis.mLabelWidth = Math.round((float) ((int) (calcTextSize.width + (this.mXAxis.getXOffset() * 3.5f))));
        this.mXAxis.mLabelHeight = Math.round(f);
        XAxis xAxis = this.mXAxis;
        xAxis.mLabelRotatedWidth = (int) (sizeOfRotatedRectangleByDegrees.width + (xAxis.getXOffset() * 3.5f));
        this.mXAxis.mLabelRotatedHeight = Math.round(sizeOfRotatedRectangleByDegrees.height);
        FSize.recycleInstance(sizeOfRotatedRectangleByDegrees);
    }

    /* access modifiers changed from: protected */
    public void drawGridLine(Canvas canvas, float f, float f2, Path path) {
        path.moveTo(this.mViewPortHandler.contentRight(), f2);
        path.lineTo(this.mViewPortHandler.contentLeft(), f2);
        canvas.drawPath(path, this.mGridPaint);
        path.reset();
    }

    /* access modifiers changed from: protected */
    public void drawLabels(Canvas canvas, float f, MPPointF mPPointF) {
        float labelRotationAngle = this.mXAxis.getLabelRotationAngle();
        boolean isCenterAxisLabelsEnabled = this.mXAxis.isCenterAxisLabelsEnabled();
        int i = this.mXAxis.mEntryCount * 2;
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2 += 2) {
            int i3 = i2 + 1;
            XAxis xAxis = this.mXAxis;
            if (isCenterAxisLabelsEnabled) {
                fArr[i3] = xAxis.mCenteredEntries[i2 / 2];
            } else {
                fArr[i3] = xAxis.mEntries[i2 / 2];
            }
        }
        this.mTrans.pointValuesToPixel(fArr);
        for (int i4 = 0; i4 < i; i4 += 2) {
            float f2 = fArr[i4 + 1];
            if (this.mViewPortHandler.isInBoundsY(f2)) {
                IAxisValueFormatter valueFormatter = this.mXAxis.getValueFormatter();
                XAxis xAxis2 = this.mXAxis;
                drawLabel(canvas, valueFormatter.getFormattedValue(xAxis2.mEntries[i4 / 2], xAxis2), f, f2, mPPointF, labelRotationAngle);
            }
        }
    }

    public RectF getGridClippingRect() {
        this.mGridClippingRect.set(this.mViewPortHandler.getContentRect());
        this.mGridClippingRect.inset(Utils.FLOAT_EPSILON, -this.mAxis.getGridLineWidth());
        return this.mGridClippingRect;
    }

    public void renderAxisLabels(Canvas canvas) {
        float contentLeft;
        float contentLeft2;
        float f;
        if (this.mXAxis.isEnabled() && this.mXAxis.isDrawLabelsEnabled()) {
            float xOffset = this.mXAxis.getXOffset();
            this.mAxisLabelPaint.setTypeface(this.mXAxis.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.mXAxis.getTextSize());
            this.mAxisLabelPaint.setColor(this.mXAxis.getTextColor());
            MPPointF instance = MPPointF.getInstance(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
            if (this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP) {
                instance.x = Utils.FLOAT_EPSILON;
                instance.y = 0.5f;
                contentLeft = this.mViewPortHandler.contentRight();
            } else {
                if (this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP_INSIDE) {
                    instance.x = 1.0f;
                    instance.y = 0.5f;
                    contentLeft2 = this.mViewPortHandler.contentRight();
                } else {
                    if (this.mXAxis.getPosition() != XAxis.XAxisPosition.BOTTOM) {
                        if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM_INSIDE) {
                            instance.x = 1.0f;
                            instance.y = 0.5f;
                            contentLeft = this.mViewPortHandler.contentLeft();
                        } else {
                            instance.x = Utils.FLOAT_EPSILON;
                            instance.y = 0.5f;
                            drawLabels(canvas, this.mViewPortHandler.contentRight() + xOffset, instance);
                        }
                    }
                    instance.x = 1.0f;
                    instance.y = 0.5f;
                    contentLeft2 = this.mViewPortHandler.contentLeft();
                }
                f = contentLeft2 - xOffset;
                drawLabels(canvas, f, instance);
                MPPointF.recycleInstance(instance);
            }
            f = contentLeft + xOffset;
            drawLabels(canvas, f, instance);
            MPPointF.recycleInstance(instance);
        }
    }

    public void renderAxisLine(Canvas canvas) {
        if (this.mXAxis.isDrawAxisLineEnabled() && this.mXAxis.isEnabled()) {
            this.mAxisLinePaint.setColor(this.mXAxis.getAxisLineColor());
            this.mAxisLinePaint.setStrokeWidth(this.mXAxis.getAxisLineWidth());
            if (this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP || this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP_INSIDE || this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTH_SIDED) {
                canvas.drawLine(this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentTop(), this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentBottom(), this.mAxisLinePaint);
            }
            if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM || this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM_INSIDE || this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTH_SIDED) {
                canvas.drawLine(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop(), this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom(), this.mAxisLinePaint);
            }
        }
    }

    public void renderLimitLines(Canvas canvas) {
        float offsetLeft;
        float f;
        float contentLeft;
        float f2;
        List<LimitLine> limitLines = this.mXAxis.getLimitLines();
        if (limitLines != null && limitLines.size() > 0) {
            float[] fArr = this.mRenderLimitLinesBuffer;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            Path path = this.mRenderLimitLinesPathBuffer;
            path.reset();
            for (int i = 0; i < limitLines.size(); i++) {
                LimitLine limitLine = limitLines.get(i);
                if (limitLine.isEnabled()) {
                    int save = canvas.save();
                    this.mLimitLineClippingRect.set(this.mViewPortHandler.getContentRect());
                    this.mLimitLineClippingRect.inset(Utils.FLOAT_EPSILON, -limitLine.getLineWidth());
                    canvas.clipRect(this.mLimitLineClippingRect);
                    this.mLimitLinePaint.setStyle(Paint.Style.STROKE);
                    this.mLimitLinePaint.setColor(limitLine.getLineColor());
                    this.mLimitLinePaint.setStrokeWidth(limitLine.getLineWidth());
                    this.mLimitLinePaint.setPathEffect(limitLine.getDashPathEffect());
                    fArr[1] = limitLine.getLimit();
                    this.mTrans.pointValuesToPixel(fArr);
                    path.moveTo(this.mViewPortHandler.contentLeft(), fArr[1]);
                    path.lineTo(this.mViewPortHandler.contentRight(), fArr[1]);
                    canvas.drawPath(path, this.mLimitLinePaint);
                    path.reset();
                    String label = limitLine.getLabel();
                    if (label != null && !label.equals("")) {
                        this.mLimitLinePaint.setStyle(limitLine.getTextStyle());
                        this.mLimitLinePaint.setPathEffect((PathEffect) null);
                        this.mLimitLinePaint.setColor(limitLine.getTextColor());
                        this.mLimitLinePaint.setStrokeWidth(0.5f);
                        this.mLimitLinePaint.setTextSize(limitLine.getTextSize());
                        float calcTextHeight = (float) Utils.calcTextHeight(this.mLimitLinePaint, label);
                        float convertDpToPixel = Utils.convertDpToPixel(4.0f) + limitLine.getXOffset();
                        float lineWidth = limitLine.getLineWidth() + calcTextHeight + limitLine.getYOffset();
                        LimitLine.LimitLabelPosition labelPosition = limitLine.getLabelPosition();
                        if (labelPosition == LimitLine.LimitLabelPosition.RIGHT_TOP) {
                            this.mLimitLinePaint.setTextAlign(Paint.Align.RIGHT);
                            contentLeft = this.mViewPortHandler.contentRight() - convertDpToPixel;
                            f2 = fArr[1];
                        } else {
                            if (labelPosition == LimitLine.LimitLabelPosition.RIGHT_BOTTOM) {
                                this.mLimitLinePaint.setTextAlign(Paint.Align.RIGHT);
                                offsetLeft = this.mViewPortHandler.contentRight() - convertDpToPixel;
                                f = fArr[1];
                            } else if (labelPosition == LimitLine.LimitLabelPosition.LEFT_TOP) {
                                this.mLimitLinePaint.setTextAlign(Paint.Align.LEFT);
                                contentLeft = this.mViewPortHandler.contentLeft() + convertDpToPixel;
                                f2 = fArr[1];
                            } else {
                                this.mLimitLinePaint.setTextAlign(Paint.Align.LEFT);
                                offsetLeft = this.mViewPortHandler.offsetLeft() + convertDpToPixel;
                                f = fArr[1];
                            }
                            canvas.drawText(label, offsetLeft, f + lineWidth, this.mLimitLinePaint);
                        }
                        canvas.drawText(label, contentLeft, (f2 - lineWidth) + calcTextHeight, this.mLimitLinePaint);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
    }
}
