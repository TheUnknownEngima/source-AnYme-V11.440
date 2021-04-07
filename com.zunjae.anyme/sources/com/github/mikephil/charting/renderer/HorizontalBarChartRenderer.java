package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.buffer.HorizontalBarBuffer;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.dataprovider.ChartInterface;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

public class HorizontalBarChartRenderer extends BarChartRenderer {
    private RectF mBarShadowRectBuffer = new RectF();

    public HorizontalBarChartRenderer(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(barDataProvider, chartAnimator, viewPortHandler);
        this.mValuePaint.setTextAlign(Paint.Align.LEFT);
    }

    /* access modifiers changed from: protected */
    public void drawDataSet(Canvas canvas, IBarDataSet iBarDataSet, int i) {
        IBarDataSet iBarDataSet2 = iBarDataSet;
        int i2 = i;
        Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
        this.mBarBorderPaint.setColor(iBarDataSet.getBarBorderColor());
        this.mBarBorderPaint.setStrokeWidth(Utils.convertDpToPixel(iBarDataSet.getBarBorderWidth()));
        int i3 = 0;
        boolean z = true;
        boolean z2 = iBarDataSet.getBarBorderWidth() > Utils.FLOAT_EPSILON;
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        if (this.mChart.isDrawBarShadowEnabled()) {
            this.mShadowPaint.setColor(iBarDataSet.getBarShadowColor());
            float barWidth = this.mChart.getBarData().getBarWidth() / 2.0f;
            int min = Math.min((int) Math.ceil((double) (((float) iBarDataSet.getEntryCount()) * phaseX)), iBarDataSet.getEntryCount());
            for (int i4 = 0; i4 < min; i4++) {
                float x = ((BarEntry) iBarDataSet2.getEntryForIndex(i4)).getX();
                RectF rectF = this.mBarShadowRectBuffer;
                rectF.top = x - barWidth;
                rectF.bottom = x + barWidth;
                transformer.rectValueToPixel(rectF);
                if (!this.mViewPortHandler.isInBoundsTop(this.mBarShadowRectBuffer.bottom)) {
                    Canvas canvas2 = canvas;
                } else if (!this.mViewPortHandler.isInBoundsBottom(this.mBarShadowRectBuffer.top)) {
                    break;
                } else {
                    this.mBarShadowRectBuffer.left = this.mViewPortHandler.contentLeft();
                    this.mBarShadowRectBuffer.right = this.mViewPortHandler.contentRight();
                    canvas.drawRect(this.mBarShadowRectBuffer, this.mShadowPaint);
                }
            }
        }
        Canvas canvas3 = canvas;
        BarBuffer barBuffer = this.mBarBuffers[i2];
        barBuffer.setPhases(phaseX, phaseY);
        barBuffer.setDataSet(i2);
        barBuffer.setInverted(this.mChart.isInverted(iBarDataSet.getAxisDependency()));
        barBuffer.setBarWidth(this.mChart.getBarData().getBarWidth());
        barBuffer.feed(iBarDataSet2);
        transformer.pointValuesToPixel(barBuffer.buffer);
        if (iBarDataSet.getColors().size() != 1) {
            z = false;
        }
        if (z) {
            this.mRenderPaint.setColor(iBarDataSet.getColor());
        }
        while (i3 < barBuffer.size()) {
            int i5 = i3 + 3;
            if (this.mViewPortHandler.isInBoundsTop(barBuffer.buffer[i5])) {
                int i6 = i3 + 1;
                if (this.mViewPortHandler.isInBoundsBottom(barBuffer.buffer[i6])) {
                    if (!z) {
                        this.mRenderPaint.setColor(iBarDataSet2.getColor(i3 / 4));
                    }
                    float[] fArr = barBuffer.buffer;
                    int i7 = i3 + 2;
                    canvas.drawRect(fArr[i3], fArr[i6], fArr[i7], fArr[i5], this.mRenderPaint);
                    if (z2) {
                        float[] fArr2 = barBuffer.buffer;
                        canvas.drawRect(fArr2[i3], fArr2[i6], fArr2[i7], fArr2[i5], this.mBarBorderPaint);
                    }
                }
                i3 += 4;
                Canvas canvas4 = canvas;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawValue(Canvas canvas, String str, float f, float f2, int i) {
        this.mValuePaint.setColor(i);
        canvas.drawText(str, f, f2, this.mValuePaint);
    }

    public void drawValues(Canvas canvas) {
        List list;
        MPPointF mPPointF;
        int i;
        float[] fArr;
        float[] fArr2;
        int i2;
        float f;
        float f2;
        float f3;
        BarEntry barEntry;
        boolean z;
        List list2;
        int i3;
        float f4;
        BarBuffer barBuffer;
        IValueFormatter iValueFormatter;
        MPPointF mPPointF2;
        float f5;
        if (isDrawingValuesAllowed(this.mChart)) {
            List dataSets = this.mChart.getBarData().getDataSets();
            float convertDpToPixel = Utils.convertDpToPixel(5.0f);
            boolean isDrawValueAboveBarEnabled = this.mChart.isDrawValueAboveBarEnabled();
            int i4 = 0;
            while (i4 < this.mChart.getBarData().getDataSetCount()) {
                IBarDataSet iBarDataSet = (IBarDataSet) dataSets.get(i4);
                if (!shouldDrawValues(iBarDataSet)) {
                    list = dataSets;
                } else {
                    boolean isInverted = this.mChart.isInverted(iBarDataSet.getAxisDependency());
                    applyValueTextStyle(iBarDataSet);
                    float f6 = 2.0f;
                    float calcTextHeight = ((float) Utils.calcTextHeight(this.mValuePaint, "10")) / 2.0f;
                    IValueFormatter valueFormatter = iBarDataSet.getValueFormatter();
                    BarBuffer barBuffer2 = this.mBarBuffers[i4];
                    float phaseY = this.mAnimator.getPhaseY();
                    MPPointF instance = MPPointF.getInstance(iBarDataSet.getIconsOffset());
                    instance.x = Utils.convertDpToPixel(instance.x);
                    instance.y = Utils.convertDpToPixel(instance.y);
                    if (!iBarDataSet.isStacked()) {
                        int i5 = 0;
                        while (((float) i5) < ((float) barBuffer2.buffer.length) * this.mAnimator.getPhaseX()) {
                            float[] fArr3 = barBuffer2.buffer;
                            int i6 = i5 + 1;
                            float f7 = (fArr3[i6] + fArr3[i5 + 3]) / f6;
                            if (!this.mViewPortHandler.isInBoundsTop(fArr3[i6])) {
                                break;
                            }
                            if (this.mViewPortHandler.isInBoundsX(barBuffer2.buffer[i5]) && this.mViewPortHandler.isInBoundsBottom(barBuffer2.buffer[i6])) {
                                BarEntry barEntry2 = (BarEntry) iBarDataSet.getEntryForIndex(i5 / 4);
                                float y = barEntry2.getY();
                                String formattedValue = valueFormatter.getFormattedValue(y, barEntry2, i4, this.mViewPortHandler);
                                MPPointF mPPointF3 = instance;
                                float calcTextWidth = (float) Utils.calcTextWidth(this.mValuePaint, formattedValue);
                                String str = formattedValue;
                                float f8 = isDrawValueAboveBarEnabled ? convertDpToPixel : -(calcTextWidth + convertDpToPixel);
                                IValueFormatter iValueFormatter2 = valueFormatter;
                                float f9 = isDrawValueAboveBarEnabled ? -(calcTextWidth + convertDpToPixel) : convertDpToPixel;
                                if (isInverted) {
                                    f8 = (-f8) - calcTextWidth;
                                    f9 = (-f9) - calcTextWidth;
                                }
                                float f10 = f8;
                                float f11 = f9;
                                if (iBarDataSet.isDrawValuesEnabled()) {
                                    f5 = y;
                                    i3 = i5;
                                    list2 = dataSets;
                                    mPPointF2 = mPPointF3;
                                    f4 = calcTextHeight;
                                    barBuffer = barBuffer2;
                                    z = isInverted;
                                    iValueFormatter = iValueFormatter2;
                                    drawValue(canvas, str, (y >= Utils.FLOAT_EPSILON ? f10 : f11) + barBuffer2.buffer[i5 + 2], f7 + calcTextHeight, iBarDataSet.getValueTextColor(i5 / 2));
                                } else {
                                    f5 = y;
                                    i3 = i5;
                                    list2 = dataSets;
                                    z = isInverted;
                                    mPPointF2 = mPPointF3;
                                    iValueFormatter = iValueFormatter2;
                                    f4 = calcTextHeight;
                                    barBuffer = barBuffer2;
                                }
                                if (barEntry2.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                    Drawable icon = barEntry2.getIcon();
                                    float f12 = barBuffer.buffer[i3 + 2];
                                    if (f5 < Utils.FLOAT_EPSILON) {
                                        f10 = f11;
                                    }
                                    Utils.drawImage(canvas, icon, (int) (f12 + f10 + mPPointF2.x), (int) (f7 + mPPointF2.y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                                }
                            } else {
                                i3 = i5;
                                list2 = dataSets;
                                z = isInverted;
                                f4 = calcTextHeight;
                                mPPointF2 = instance;
                                barBuffer = barBuffer2;
                                iValueFormatter = valueFormatter;
                            }
                            i5 = i3 + 4;
                            instance = mPPointF2;
                            valueFormatter = iValueFormatter;
                            barBuffer2 = barBuffer;
                            calcTextHeight = f4;
                            dataSets = list2;
                            isInverted = z;
                            f6 = 2.0f;
                        }
                        list = dataSets;
                        mPPointF = instance;
                    } else {
                        list = dataSets;
                        boolean z2 = isInverted;
                        float f13 = calcTextHeight;
                        mPPointF = instance;
                        BarBuffer barBuffer3 = barBuffer2;
                        IValueFormatter iValueFormatter3 = valueFormatter;
                        Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
                        int i7 = 0;
                        int i8 = 0;
                        while (((float) i7) < ((float) iBarDataSet.getEntryCount()) * this.mAnimator.getPhaseX()) {
                            BarEntry barEntry3 = (BarEntry) iBarDataSet.getEntryForIndex(i7);
                            int valueTextColor = iBarDataSet.getValueTextColor(i7);
                            float[] yVals = barEntry3.getYVals();
                            if (yVals != null) {
                                BarEntry barEntry4 = barEntry3;
                                i = i7;
                                fArr = yVals;
                                int length = fArr.length * 2;
                                float[] fArr4 = new float[length];
                                float f14 = -barEntry4.getNegativeSum();
                                int i9 = 0;
                                int i10 = 0;
                                float f15 = Utils.FLOAT_EPSILON;
                                while (i9 < length) {
                                    float f16 = fArr[i10];
                                    int i11 = (f16 > Utils.FLOAT_EPSILON ? 1 : (f16 == Utils.FLOAT_EPSILON ? 0 : -1));
                                    if (i11 == 0 && (f15 == Utils.FLOAT_EPSILON || f14 == Utils.FLOAT_EPSILON)) {
                                        float f17 = f14;
                                        f14 = f16;
                                        f3 = f17;
                                    } else if (i11 >= 0) {
                                        f15 += f16;
                                        f3 = f14;
                                        f14 = f15;
                                    } else {
                                        f3 = f14 - f16;
                                    }
                                    fArr4[i9] = f14 * phaseY;
                                    i9 += 2;
                                    i10++;
                                    f14 = f3;
                                }
                                transformer.pointValuesToPixel(fArr4);
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= length) {
                                        break;
                                    }
                                    float f18 = fArr[i12 / 2];
                                    String formattedValue2 = iValueFormatter3.getFormattedValue(f18, barEntry4, i4, this.mViewPortHandler);
                                    float calcTextWidth2 = (float) Utils.calcTextWidth(this.mValuePaint, formattedValue2);
                                    String str2 = formattedValue2;
                                    float f19 = isDrawValueAboveBarEnabled ? convertDpToPixel : -(calcTextWidth2 + convertDpToPixel);
                                    int i13 = length;
                                    float f20 = isDrawValueAboveBarEnabled ? -(calcTextWidth2 + convertDpToPixel) : convertDpToPixel;
                                    if (z2) {
                                        f19 = (-f19) - calcTextWidth2;
                                        f20 = (-f20) - calcTextWidth2;
                                    }
                                    boolean z3 = (f18 == Utils.FLOAT_EPSILON && f14 == Utils.FLOAT_EPSILON && f15 > Utils.FLOAT_EPSILON) || f18 < Utils.FLOAT_EPSILON;
                                    float f21 = fArr4[i12];
                                    if (z3) {
                                        f19 = f20;
                                    }
                                    float f22 = f21 + f19;
                                    float[] fArr5 = barBuffer3.buffer;
                                    float f23 = (fArr5[i8 + 1] + fArr5[i8 + 3]) / 2.0f;
                                    if (!this.mViewPortHandler.isInBoundsTop(f23)) {
                                        break;
                                    }
                                    if (this.mViewPortHandler.isInBoundsX(f22) && this.mViewPortHandler.isInBoundsBottom(f23)) {
                                        if (iBarDataSet.isDrawValuesEnabled()) {
                                            float f24 = f23 + f13;
                                            f = f23;
                                            String str3 = str2;
                                            i2 = i12;
                                            fArr2 = fArr4;
                                            float f25 = f24;
                                            f2 = f22;
                                            drawValue(canvas, str3, f22, f25, valueTextColor);
                                        } else {
                                            f = f23;
                                            i2 = i12;
                                            fArr2 = fArr4;
                                            f2 = f22;
                                        }
                                        if (barEntry4.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                            Drawable icon2 = barEntry4.getIcon();
                                            Utils.drawImage(canvas, icon2, (int) (f2 + mPPointF.x), (int) (f + mPPointF.y), icon2.getIntrinsicWidth(), icon2.getIntrinsicHeight());
                                        }
                                    } else {
                                        i2 = i12;
                                        fArr2 = fArr4;
                                    }
                                    i12 = i2 + 2;
                                    length = i13;
                                    fArr4 = fArr2;
                                }
                            } else {
                                int i14 = i8 + 1;
                                if (!this.mViewPortHandler.isInBoundsTop(barBuffer3.buffer[i14])) {
                                    break;
                                } else if (this.mViewPortHandler.isInBoundsX(barBuffer3.buffer[i8]) && this.mViewPortHandler.isInBoundsBottom(barBuffer3.buffer[i14])) {
                                    String formattedValue3 = iValueFormatter3.getFormattedValue(barEntry3.getY(), barEntry3, i4, this.mViewPortHandler);
                                    float calcTextWidth3 = (float) Utils.calcTextWidth(this.mValuePaint, formattedValue3);
                                    float f26 = isDrawValueAboveBarEnabled ? convertDpToPixel : -(calcTextWidth3 + convertDpToPixel);
                                    float f27 = isDrawValueAboveBarEnabled ? -(calcTextWidth3 + convertDpToPixel) : convertDpToPixel;
                                    if (z2) {
                                        f26 = (-f26) - calcTextWidth3;
                                        f27 = (-f27) - calcTextWidth3;
                                    }
                                    float f28 = f26;
                                    float f29 = f27;
                                    if (iBarDataSet.isDrawValuesEnabled()) {
                                        i = i7;
                                        fArr = yVals;
                                        barEntry = barEntry3;
                                        drawValue(canvas, formattedValue3, barBuffer3.buffer[i8 + 2] + (barEntry3.getY() >= Utils.FLOAT_EPSILON ? f28 : f29), barBuffer3.buffer[i14] + f13, valueTextColor);
                                    } else {
                                        barEntry = barEntry3;
                                        i = i7;
                                        fArr = yVals;
                                    }
                                    if (barEntry.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                        Drawable icon3 = barEntry.getIcon();
                                        float f30 = barBuffer3.buffer[i8 + 2];
                                        if (barEntry.getY() < Utils.FLOAT_EPSILON) {
                                            f28 = f29;
                                        }
                                        Utils.drawImage(canvas, icon3, (int) (f30 + f28 + mPPointF.x), (int) (barBuffer3.buffer[i14] + mPPointF.y), icon3.getIntrinsicWidth(), icon3.getIntrinsicHeight());
                                    }
                                }
                            }
                            i8 = fArr == null ? i8 + 4 : i8 + (fArr.length * 4);
                            i7 = i + 1;
                        }
                    }
                    MPPointF.recycleInstance(mPPointF);
                }
                i4++;
                dataSets = list;
            }
        }
    }

    public void initBuffers() {
        BarData barData = this.mChart.getBarData();
        this.mBarBuffers = new HorizontalBarBuffer[barData.getDataSetCount()];
        for (int i = 0; i < this.mBarBuffers.length; i++) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(i);
            this.mBarBuffers[i] = new HorizontalBarBuffer(iBarDataSet.getEntryCount() * 4 * (iBarDataSet.isStacked() ? iBarDataSet.getStackSize() : 1), barData.getDataSetCount(), iBarDataSet.isStacked());
        }
    }

    /* access modifiers changed from: protected */
    public boolean isDrawingValuesAllowed(ChartInterface chartInterface) {
        return ((float) chartInterface.getData().getEntryCount()) < ((float) chartInterface.getMaxVisibleCount()) * this.mViewPortHandler.getScaleY();
    }

    /* access modifiers changed from: protected */
    public void prepareBarHighlight(float f, float f2, float f3, float f4, Transformer transformer) {
        this.mBarRect.set(f2, f - f4, f3, f + f4);
        transformer.rectToPixelPhaseHorizontal(this.mBarRect, this.mAnimator.getPhaseY());
    }

    /* access modifiers changed from: protected */
    public void setHighlightDrawPos(Highlight highlight, RectF rectF) {
        highlight.setDraw(rectF.centerY(), rectF.right);
    }
}
