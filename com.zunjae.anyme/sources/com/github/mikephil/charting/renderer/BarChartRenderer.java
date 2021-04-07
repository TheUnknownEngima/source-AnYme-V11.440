package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.highlight.Range;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.model.GradientColor;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

public class BarChartRenderer extends BarLineScatterCandleBubbleRenderer {
    protected Paint mBarBorderPaint;
    protected BarBuffer[] mBarBuffers;
    protected RectF mBarRect = new RectF();
    private RectF mBarShadowRectBuffer = new RectF();
    protected BarDataProvider mChart;
    protected Paint mShadowPaint;

    public BarChartRenderer(BarDataProvider barDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mChart = barDataProvider;
        Paint paint = new Paint(1);
        this.mHighlightPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mHighlightPaint.setColor(Color.rgb(0, 0, 0));
        this.mHighlightPaint.setAlpha(120);
        Paint paint2 = new Paint(1);
        this.mShadowPaint = paint2;
        paint2.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint(1);
        this.mBarBorderPaint = paint3;
        paint3.setStyle(Paint.Style.STROKE);
    }

    public void drawData(Canvas canvas) {
        BarData barData = this.mChart.getBarData();
        for (int i = 0; i < barData.getDataSetCount(); i++) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(i);
            if (iBarDataSet.isVisible()) {
                drawDataSet(canvas, iBarDataSet, i);
            }
        }
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
                rectF.left = x - barWidth;
                rectF.right = x + barWidth;
                transformer.rectValueToPixel(rectF);
                if (!this.mViewPortHandler.isInBoundsLeft(this.mBarShadowRectBuffer.right)) {
                    Canvas canvas2 = canvas;
                } else if (!this.mViewPortHandler.isInBoundsRight(this.mBarShadowRectBuffer.left)) {
                    break;
                } else {
                    this.mBarShadowRectBuffer.top = this.mViewPortHandler.contentTop();
                    this.mBarShadowRectBuffer.bottom = this.mViewPortHandler.contentBottom();
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
            int i5 = i3 + 2;
            if (this.mViewPortHandler.isInBoundsLeft(barBuffer.buffer[i5])) {
                if (this.mViewPortHandler.isInBoundsRight(barBuffer.buffer[i3])) {
                    if (!z) {
                        this.mRenderPaint.setColor(iBarDataSet2.getColor(i3 / 4));
                    }
                    if (iBarDataSet.getGradientColor() != null) {
                        GradientColor gradientColor = iBarDataSet.getGradientColor();
                        Paint paint = this.mRenderPaint;
                        float[] fArr = barBuffer.buffer;
                        paint.setShader(new LinearGradient(fArr[i3], fArr[i3 + 3], fArr[i3], fArr[i3 + 1], gradientColor.getStartColor(), gradientColor.getEndColor(), Shader.TileMode.MIRROR));
                    }
                    if (iBarDataSet.getGradientColors() != null) {
                        Paint paint2 = this.mRenderPaint;
                        float[] fArr2 = barBuffer.buffer;
                        float f = fArr2[i3];
                        float f2 = fArr2[i3 + 3];
                        float f3 = fArr2[i3];
                        float f4 = fArr2[i3 + 1];
                        int i6 = i3 / 4;
                        paint2.setShader(new LinearGradient(f, f2, f3, f4, iBarDataSet2.getGradientColor(i6).getStartColor(), iBarDataSet2.getGradientColor(i6).getEndColor(), Shader.TileMode.MIRROR));
                    }
                    float[] fArr3 = barBuffer.buffer;
                    int i7 = i3 + 1;
                    int i8 = i3 + 3;
                    canvas.drawRect(fArr3[i3], fArr3[i7], fArr3[i5], fArr3[i8], this.mRenderPaint);
                    if (z2) {
                        float[] fArr4 = barBuffer.buffer;
                        canvas.drawRect(fArr4[i3], fArr4[i7], fArr4[i5], fArr4[i8], this.mBarBorderPaint);
                    }
                } else {
                    return;
                }
            }
            i3 += 4;
            Canvas canvas4 = canvas;
        }
    }

    public void drawExtras(Canvas canvas) {
    }

    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        float f;
        float f2;
        BarData barData = this.mChart.getBarData();
        for (Highlight highlight : highlightArr) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iBarDataSet != null && iBarDataSet.isHighlightEnabled()) {
                BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                if (isInBoundsX(barEntry, iBarDataSet)) {
                    Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
                    this.mHighlightPaint.setColor(iBarDataSet.getHighLightColor());
                    this.mHighlightPaint.setAlpha(iBarDataSet.getHighLightAlpha());
                    if (!(highlight.getStackIndex() >= 0 && barEntry.isStacked())) {
                        f2 = barEntry.getY();
                        f = Utils.FLOAT_EPSILON;
                    } else if (this.mChart.isHighlightFullBarEnabled()) {
                        float positiveSum = barEntry.getPositiveSum();
                        f = -barEntry.getNegativeSum();
                        f2 = positiveSum;
                    } else {
                        Range range = barEntry.getRanges()[highlight.getStackIndex()];
                        f2 = range.from;
                        f = range.to;
                    }
                    prepareBarHighlight(barEntry.getX(), f2, f, barData.getBarWidth() / 2.0f, transformer);
                    setHighlightDrawPos(highlight, this.mBarRect);
                    canvas.drawRect(this.mBarRect, this.mHighlightPaint);
                }
            }
        }
    }

    public void drawValues(Canvas canvas) {
        boolean z;
        float f;
        float f2;
        boolean z2;
        List list;
        MPPointF mPPointF;
        int i;
        float f3;
        boolean z3;
        Transformer transformer;
        float[] fArr;
        float f4;
        int i2;
        float[] fArr2;
        int i3;
        float f5;
        float f6;
        float f7;
        int i4;
        List list2;
        MPPointF mPPointF2;
        BarBuffer barBuffer;
        float f8;
        if (isDrawingValuesAllowed(this.mChart)) {
            List dataSets = this.mChart.getBarData().getDataSets();
            float convertDpToPixel = Utils.convertDpToPixel(4.5f);
            boolean isDrawValueAboveBarEnabled = this.mChart.isDrawValueAboveBarEnabled();
            int i5 = 0;
            while (i5 < this.mChart.getBarData().getDataSetCount()) {
                IBarDataSet iBarDataSet = (IBarDataSet) dataSets.get(i5);
                if (!shouldDrawValues(iBarDataSet)) {
                    list = dataSets;
                    f2 = f;
                    z2 = z;
                } else {
                    applyValueTextStyle(iBarDataSet);
                    boolean isInverted = this.mChart.isInverted(iBarDataSet.getAxisDependency());
                    float calcTextHeight = (float) Utils.calcTextHeight(this.mValuePaint, "8");
                    float f9 = z ? -f : calcTextHeight + f;
                    float f10 = z ? calcTextHeight + f : -f;
                    if (isInverted) {
                        f9 = (-f9) - calcTextHeight;
                        f10 = (-f10) - calcTextHeight;
                    }
                    float f11 = f9;
                    float f12 = f10;
                    BarBuffer barBuffer2 = this.mBarBuffers[i5];
                    float phaseY = this.mAnimator.getPhaseY();
                    MPPointF instance = MPPointF.getInstance(iBarDataSet.getIconsOffset());
                    instance.x = Utils.convertDpToPixel(instance.x);
                    instance.y = Utils.convertDpToPixel(instance.y);
                    if (!iBarDataSet.isStacked()) {
                        int i6 = 0;
                        while (((float) i6) < ((float) barBuffer2.buffer.length) * this.mAnimator.getPhaseX()) {
                            float[] fArr3 = barBuffer2.buffer;
                            float f13 = (fArr3[i6] + fArr3[i6 + 2]) / 2.0f;
                            if (!this.mViewPortHandler.isInBoundsRight(f13)) {
                                break;
                            }
                            int i7 = i6 + 1;
                            if (!this.mViewPortHandler.isInBoundsY(barBuffer2.buffer[i7]) || !this.mViewPortHandler.isInBoundsLeft(f13)) {
                                i4 = i6;
                                mPPointF2 = instance;
                                list2 = dataSets;
                                barBuffer = barBuffer2;
                            } else {
                                int i8 = i6 / 4;
                                BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForIndex(i8);
                                float y = barEntry.getY();
                                if (iBarDataSet.isDrawValuesEnabled()) {
                                    f8 = f13;
                                    i4 = i6;
                                    mPPointF2 = instance;
                                    list2 = dataSets;
                                    barBuffer = barBuffer2;
                                    drawValue(canvas, iBarDataSet.getValueFormatter(), y, barEntry, i5, f8, y >= Utils.FLOAT_EPSILON ? barBuffer2.buffer[i7] + f11 : barBuffer2.buffer[i6 + 3] + f12, iBarDataSet.getValueTextColor(i8));
                                } else {
                                    f8 = f13;
                                    i4 = i6;
                                    mPPointF2 = instance;
                                    list2 = dataSets;
                                    barBuffer = barBuffer2;
                                }
                                if (barEntry.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                    Drawable icon = barEntry.getIcon();
                                    Utils.drawImage(canvas, icon, (int) (f8 + mPPointF2.x), (int) ((y >= Utils.FLOAT_EPSILON ? barBuffer.buffer[i7] + f11 : barBuffer.buffer[i4 + 3] + f12) + mPPointF2.y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                                }
                            }
                            i6 = i4 + 4;
                            barBuffer2 = barBuffer;
                            instance = mPPointF2;
                            dataSets = list2;
                        }
                        mPPointF = instance;
                        list = dataSets;
                    } else {
                        mPPointF = instance;
                        list = dataSets;
                        BarBuffer barBuffer3 = barBuffer2;
                        Transformer transformer2 = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
                        int i9 = 0;
                        int i10 = 0;
                        while (((float) i9) < ((float) iBarDataSet.getEntryCount()) * this.mAnimator.getPhaseX()) {
                            BarEntry barEntry2 = (BarEntry) iBarDataSet.getEntryForIndex(i9);
                            float[] yVals = barEntry2.getYVals();
                            float[] fArr4 = barBuffer3.buffer;
                            float f14 = (fArr4[i10] + fArr4[i10 + 2]) / 2.0f;
                            int valueTextColor = iBarDataSet.getValueTextColor(i9);
                            if (yVals != null) {
                                i = i9;
                                f3 = f;
                                z3 = z;
                                fArr = yVals;
                                transformer = transformer2;
                                float f15 = f14;
                                int length = fArr.length * 2;
                                float[] fArr5 = new float[length];
                                float f16 = -barEntry2.getNegativeSum();
                                int i11 = 0;
                                int i12 = 0;
                                float f17 = Utils.FLOAT_EPSILON;
                                while (i11 < length) {
                                    float f18 = fArr[i12];
                                    int i13 = (f18 > Utils.FLOAT_EPSILON ? 1 : (f18 == Utils.FLOAT_EPSILON ? 0 : -1));
                                    if (i13 == 0 && (f17 == Utils.FLOAT_EPSILON || f16 == Utils.FLOAT_EPSILON)) {
                                        float f19 = f16;
                                        f16 = f18;
                                        f6 = f19;
                                    } else if (i13 >= 0) {
                                        f17 += f18;
                                        f6 = f16;
                                        f16 = f17;
                                    } else {
                                        f6 = f16 - f18;
                                    }
                                    fArr5[i11 + 1] = f16 * phaseY;
                                    i11 += 2;
                                    i12++;
                                    f16 = f6;
                                }
                                transformer.pointValuesToPixel(fArr5);
                                int i14 = 0;
                                while (i14 < length) {
                                    int i15 = i14 / 2;
                                    float f20 = fArr[i15];
                                    float f21 = fArr5[i14 + 1] + (((f20 > Utils.FLOAT_EPSILON ? 1 : (f20 == Utils.FLOAT_EPSILON ? 0 : -1)) == 0 && (f16 > Utils.FLOAT_EPSILON ? 1 : (f16 == Utils.FLOAT_EPSILON ? 0 : -1)) == 0 && (f17 > Utils.FLOAT_EPSILON ? 1 : (f17 == Utils.FLOAT_EPSILON ? 0 : -1)) > 0) || (f20 > Utils.FLOAT_EPSILON ? 1 : (f20 == Utils.FLOAT_EPSILON ? 0 : -1)) < 0 ? f12 : f11);
                                    if (!this.mViewPortHandler.isInBoundsRight(f15)) {
                                        break;
                                    }
                                    if (!this.mViewPortHandler.isInBoundsY(f21) || !this.mViewPortHandler.isInBoundsLeft(f15)) {
                                        i3 = i14;
                                        fArr2 = fArr5;
                                        i2 = length;
                                        f4 = f15;
                                    } else {
                                        if (iBarDataSet.isDrawValuesEnabled()) {
                                            f5 = f21;
                                            i3 = i14;
                                            fArr2 = fArr5;
                                            i2 = length;
                                            f4 = f15;
                                            drawValue(canvas, iBarDataSet.getValueFormatter(), fArr[i15], barEntry2, i5, f15, f5, valueTextColor);
                                        } else {
                                            f5 = f21;
                                            i3 = i14;
                                            fArr2 = fArr5;
                                            i2 = length;
                                            f4 = f15;
                                        }
                                        if (barEntry2.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                            Drawable icon2 = barEntry2.getIcon();
                                            Utils.drawImage(canvas, icon2, (int) (f4 + mPPointF.x), (int) (f5 + mPPointF.y), icon2.getIntrinsicWidth(), icon2.getIntrinsicHeight());
                                        }
                                    }
                                    i14 = i3 + 2;
                                    fArr5 = fArr2;
                                    length = i2;
                                    f15 = f4;
                                }
                            } else if (!this.mViewPortHandler.isInBoundsRight(f14)) {
                                break;
                            } else {
                                int i16 = i10 + 1;
                                if (!this.mViewPortHandler.isInBoundsY(barBuffer3.buffer[i16]) || !this.mViewPortHandler.isInBoundsLeft(f14)) {
                                    transformer2 = transformer2;
                                    z = z;
                                    f = f;
                                    i9 = i9;
                                } else {
                                    if (iBarDataSet.isDrawValuesEnabled()) {
                                        f7 = f14;
                                        f3 = f;
                                        fArr = yVals;
                                        i = i9;
                                        z3 = z;
                                        transformer = transformer2;
                                        drawValue(canvas, iBarDataSet.getValueFormatter(), barEntry2.getY(), barEntry2, i5, f7, barBuffer3.buffer[i16] + (barEntry2.getY() >= Utils.FLOAT_EPSILON ? f11 : f12), valueTextColor);
                                    } else {
                                        f7 = f14;
                                        i = i9;
                                        f3 = f;
                                        z3 = z;
                                        fArr = yVals;
                                        transformer = transformer2;
                                    }
                                    if (barEntry2.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                        Drawable icon3 = barEntry2.getIcon();
                                        Utils.drawImage(canvas, icon3, (int) (f7 + mPPointF.x), (int) (barBuffer3.buffer[i16] + (barEntry2.getY() >= Utils.FLOAT_EPSILON ? f11 : f12) + mPPointF.y), icon3.getIntrinsicWidth(), icon3.getIntrinsicHeight());
                                    }
                                }
                            }
                            i10 = fArr == null ? i10 + 4 : i10 + (fArr.length * 4);
                            i9 = i + 1;
                            transformer2 = transformer;
                            z = z3;
                            f = f3;
                        }
                    }
                    f2 = f;
                    z2 = z;
                    MPPointF.recycleInstance(mPPointF);
                }
                i5++;
                dataSets = list;
                isDrawValueAboveBarEnabled = z2;
                convertDpToPixel = f2;
            }
        }
    }

    public void initBuffers() {
        BarData barData = this.mChart.getBarData();
        this.mBarBuffers = new BarBuffer[barData.getDataSetCount()];
        for (int i = 0; i < this.mBarBuffers.length; i++) {
            IBarDataSet iBarDataSet = (IBarDataSet) barData.getDataSetByIndex(i);
            this.mBarBuffers[i] = new BarBuffer(iBarDataSet.getEntryCount() * 4 * (iBarDataSet.isStacked() ? iBarDataSet.getStackSize() : 1), barData.getDataSetCount(), iBarDataSet.isStacked());
        }
    }

    /* access modifiers changed from: protected */
    public void prepareBarHighlight(float f, float f2, float f3, float f4, Transformer transformer) {
        this.mBarRect.set(f - f4, f2, f + f4, f3);
        transformer.rectToPixelPhase(this.mBarRect, this.mAnimator.getPhaseY());
    }

    /* access modifiers changed from: protected */
    public void setHighlightDrawPos(Highlight highlight, RectF rectF) {
        highlight.setDraw(rectF.centerX(), rectF.top);
    }
}
