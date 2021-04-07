package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.CandleData;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.CandleDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ICandleDataSet;
import com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

public class CandleStickChartRenderer extends LineScatterCandleRadarRenderer {
    private float[] mBodyBuffers = new float[4];
    protected CandleDataProvider mChart;
    private float[] mCloseBuffers = new float[4];
    private float[] mOpenBuffers = new float[4];
    private float[] mRangeBuffers = new float[4];
    private float[] mShadowBuffers = new float[8];

    public CandleStickChartRenderer(CandleDataProvider candleDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mChart = candleDataProvider;
    }

    public void drawData(Canvas canvas) {
        for (ICandleDataSet iCandleDataSet : this.mChart.getCandleData().getDataSets()) {
            if (iCandleDataSet.isVisible()) {
                drawDataSet(canvas, iCandleDataSet);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x015c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void drawDataSet(android.graphics.Canvas r29, com.github.mikephil.charting.interfaces.datasets.ICandleDataSet r30) {
        /*
            r28 = this;
            r0 = r28
            r1 = r30
            com.github.mikephil.charting.interfaces.dataprovider.CandleDataProvider r2 = r0.mChart
            com.github.mikephil.charting.components.YAxis$AxisDependency r3 = r30.getAxisDependency()
            com.github.mikephil.charting.utils.Transformer r2 = r2.getTransformer(r3)
            com.github.mikephil.charting.animation.ChartAnimator r3 = r0.mAnimator
            float r3 = r3.getPhaseY()
            float r4 = r30.getBarSpace()
            boolean r5 = r30.getShowCandleBar()
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r6 = r0.mXBounds
            com.github.mikephil.charting.interfaces.dataprovider.CandleDataProvider r7 = r0.mChart
            r6.set(r7, r1)
            android.graphics.Paint r6 = r0.mRenderPaint
            float r7 = r30.getShadowWidth()
            r6.setStrokeWidth(r7)
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r6 = r0.mXBounds
            int r6 = r6.min
        L_0x0030:
            com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer$XBounds r7 = r0.mXBounds
            int r8 = r7.range
            int r7 = r7.min
            int r8 = r8 + r7
            if (r6 > r8) goto L_0x0260
            com.github.mikephil.charting.data.Entry r7 = r1.getEntryForIndex(r6)
            com.github.mikephil.charting.data.CandleEntry r7 = (com.github.mikephil.charting.data.CandleEntry) r7
            if (r7 != 0) goto L_0x0045
            r12 = r29
            goto L_0x025c
        L_0x0045:
            float r8 = r7.getX()
            float r9 = r7.getOpen()
            float r10 = r7.getClose()
            float r11 = r7.getHigh()
            float r7 = r7.getLow()
            r13 = 1122867(0x112233, float:1.573472E-39)
            r14 = 2
            r15 = 0
            r16 = 3
            r17 = 1
            if (r5 == 0) goto L_0x01b0
            float[] r12 = r0.mShadowBuffers
            r12[r15] = r8
            r12[r14] = r8
            r19 = 4
            r12[r19] = r8
            r19 = 6
            r12[r19] = r8
            r19 = 7
            r20 = 5
            int r21 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r21 <= 0) goto L_0x008b
            float r11 = r11 * r3
            r12[r17] = r11
            float r11 = r9 * r3
            r12[r16] = r11
            float r7 = r7 * r3
            r12[r20] = r7
            float r7 = r10 * r3
            r12[r19] = r7
            goto L_0x00ae
        L_0x008b:
            int r22 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            float r11 = r11 * r3
            if (r22 >= 0) goto L_0x00a0
            r12[r17] = r11
            float r11 = r10 * r3
            r12[r16] = r11
            float r7 = r7 * r3
            r12[r20] = r7
            float r7 = r9 * r3
            r12[r19] = r7
            goto L_0x00ae
        L_0x00a0:
            r12[r17] = r11
            float r11 = r9 * r3
            r12[r16] = r11
            float r7 = r7 * r3
            r12[r20] = r7
            r7 = r12[r16]
            r12[r19] = r7
        L_0x00ae:
            float[] r7 = r0.mShadowBuffers
            r2.pointValuesToPixel(r7)
            boolean r7 = r30.getShadowColorSameAsCandle()
            if (r7 == 0) goto L_0x00e9
            if (r21 <= 0) goto L_0x00c9
            android.graphics.Paint r7 = r0.mRenderPaint
            int r11 = r30.getDecreasingColor()
            if (r11 != r13) goto L_0x00c4
            goto L_0x00f1
        L_0x00c4:
            int r11 = r30.getDecreasingColor()
            goto L_0x00fa
        L_0x00c9:
            int r7 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x00db
            android.graphics.Paint r7 = r0.mRenderPaint
            int r11 = r30.getIncreasingColor()
            if (r11 != r13) goto L_0x00d6
            goto L_0x00f1
        L_0x00d6:
            int r11 = r30.getIncreasingColor()
            goto L_0x00fa
        L_0x00db:
            android.graphics.Paint r7 = r0.mRenderPaint
            int r11 = r30.getNeutralColor()
            if (r11 != r13) goto L_0x00e4
            goto L_0x00f1
        L_0x00e4:
            int r11 = r30.getNeutralColor()
            goto L_0x00fa
        L_0x00e9:
            android.graphics.Paint r7 = r0.mRenderPaint
            int r11 = r30.getShadowColor()
            if (r11 != r13) goto L_0x00f6
        L_0x00f1:
            int r11 = r1.getColor(r6)
            goto L_0x00fa
        L_0x00f6:
            int r11 = r30.getShadowColor()
        L_0x00fa:
            r7.setColor(r11)
            android.graphics.Paint r7 = r0.mRenderPaint
            android.graphics.Paint$Style r11 = android.graphics.Paint.Style.STROKE
            r7.setStyle(r11)
            float[] r7 = r0.mShadowBuffers
            android.graphics.Paint r11 = r0.mRenderPaint
            r12 = r29
            r12.drawLines(r7, r11)
            float[] r7 = r0.mBodyBuffers
            r11 = 1056964608(0x3f000000, float:0.5)
            float r18 = r8 - r11
            float r18 = r18 + r4
            r7[r15] = r18
            float r18 = r10 * r3
            r7[r17] = r18
            float r8 = r8 + r11
            float r8 = r8 - r4
            r7[r14] = r8
            float r8 = r9 * r3
            r7[r16] = r8
            r2.pointValuesToPixel(r7)
            if (r21 <= 0) goto L_0x015c
            int r7 = r30.getDecreasingColor()
            if (r7 != r13) goto L_0x0135
            android.graphics.Paint r7 = r0.mRenderPaint
            int r8 = r1.getColor(r6)
            goto L_0x013b
        L_0x0135:
            android.graphics.Paint r7 = r0.mRenderPaint
            int r8 = r30.getDecreasingColor()
        L_0x013b:
            r7.setColor(r8)
            android.graphics.Paint r7 = r0.mRenderPaint
            android.graphics.Paint$Style r8 = r30.getDecreasingPaintStyle()
            r7.setStyle(r8)
            float[] r7 = r0.mBodyBuffers
            r23 = r7[r15]
            r24 = r7[r16]
            r25 = r7[r14]
            r26 = r7[r17]
        L_0x0151:
            android.graphics.Paint r7 = r0.mRenderPaint
            r22 = r29
            r27 = r7
            r22.drawRect(r23, r24, r25, r26, r27)
            goto L_0x025c
        L_0x015c:
            int r7 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x018a
            int r7 = r30.getIncreasingColor()
            if (r7 != r13) goto L_0x016d
            android.graphics.Paint r7 = r0.mRenderPaint
            int r8 = r1.getColor(r6)
            goto L_0x0173
        L_0x016d:
            android.graphics.Paint r7 = r0.mRenderPaint
            int r8 = r30.getIncreasingColor()
        L_0x0173:
            r7.setColor(r8)
            android.graphics.Paint r7 = r0.mRenderPaint
            android.graphics.Paint$Style r8 = r30.getIncreasingPaintStyle()
            r7.setStyle(r8)
            float[] r7 = r0.mBodyBuffers
            r23 = r7[r15]
            r24 = r7[r17]
            r25 = r7[r14]
            r26 = r7[r16]
            goto L_0x0151
        L_0x018a:
            int r7 = r30.getNeutralColor()
            if (r7 != r13) goto L_0x0197
            android.graphics.Paint r7 = r0.mRenderPaint
            int r8 = r1.getColor(r6)
            goto L_0x019d
        L_0x0197:
            android.graphics.Paint r7 = r0.mRenderPaint
            int r8 = r30.getNeutralColor()
        L_0x019d:
            r7.setColor(r8)
            float[] r7 = r0.mBodyBuffers
            r23 = r7[r15]
            r24 = r7[r17]
            r25 = r7[r14]
            r26 = r7[r16]
            android.graphics.Paint r7 = r0.mRenderPaint
            r22 = r29
            goto L_0x0257
        L_0x01b0:
            r12 = r29
            float[] r13 = r0.mRangeBuffers
            r13[r15] = r8
            float r11 = r11 * r3
            r13[r17] = r11
            r13[r14] = r8
            float r7 = r7 * r3
            r13[r16] = r7
            float[] r7 = r0.mOpenBuffers
            r11 = 1056964608(0x3f000000, float:0.5)
            float r18 = r8 - r11
            float r18 = r18 + r4
            r7[r15] = r18
            float r18 = r9 * r3
            r7[r17] = r18
            r7[r14] = r8
            r7[r16] = r18
            float[] r7 = r0.mCloseBuffers
            float r11 = r11 + r8
            float r11 = r11 - r4
            r7[r15] = r11
            float r11 = r10 * r3
            r7[r17] = r11
            r7[r14] = r8
            r7[r16] = r11
            r2.pointValuesToPixel(r13)
            float[] r7 = r0.mOpenBuffers
            r2.pointValuesToPixel(r7)
            float[] r7 = r0.mCloseBuffers
            r2.pointValuesToPixel(r7)
            int r7 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x0204
            int r7 = r30.getDecreasingColor()
            r8 = 1122867(0x112233, float:1.573472E-39)
            if (r7 != r8) goto L_0x01ff
        L_0x01fa:
            int r7 = r1.getColor(r6)
            goto L_0x0222
        L_0x01ff:
            int r7 = r30.getDecreasingColor()
            goto L_0x0222
        L_0x0204:
            r8 = 1122867(0x112233, float:1.573472E-39)
            int r7 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x0217
            int r7 = r30.getIncreasingColor()
            if (r7 != r8) goto L_0x0212
            goto L_0x01fa
        L_0x0212:
            int r7 = r30.getIncreasingColor()
            goto L_0x0222
        L_0x0217:
            int r7 = r30.getNeutralColor()
            if (r7 != r8) goto L_0x021e
            goto L_0x01fa
        L_0x021e:
            int r7 = r30.getNeutralColor()
        L_0x0222:
            android.graphics.Paint r8 = r0.mRenderPaint
            r8.setColor(r7)
            float[] r7 = r0.mRangeBuffers
            r23 = r7[r15]
            r24 = r7[r17]
            r25 = r7[r14]
            r26 = r7[r16]
            android.graphics.Paint r7 = r0.mRenderPaint
            r22 = r29
            r27 = r7
            r22.drawLine(r23, r24, r25, r26, r27)
            float[] r7 = r0.mOpenBuffers
            r23 = r7[r15]
            r24 = r7[r17]
            r25 = r7[r14]
            r26 = r7[r16]
            android.graphics.Paint r7 = r0.mRenderPaint
            r27 = r7
            r22.drawLine(r23, r24, r25, r26, r27)
            float[] r7 = r0.mCloseBuffers
            r23 = r7[r15]
            r24 = r7[r17]
            r25 = r7[r14]
            r26 = r7[r16]
            android.graphics.Paint r7 = r0.mRenderPaint
        L_0x0257:
            r27 = r7
            r22.drawLine(r23, r24, r25, r26, r27)
        L_0x025c:
            int r6 = r6 + 1
            goto L_0x0030
        L_0x0260:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.renderer.CandleStickChartRenderer.drawDataSet(android.graphics.Canvas, com.github.mikephil.charting.interfaces.datasets.ICandleDataSet):void");
    }

    public void drawExtras(Canvas canvas) {
    }

    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        CandleData candleData = this.mChart.getCandleData();
        for (Highlight highlight : highlightArr) {
            ICandleDataSet iCandleDataSet = (ICandleDataSet) candleData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iCandleDataSet != null && iCandleDataSet.isHighlightEnabled()) {
                CandleEntry candleEntry = (CandleEntry) iCandleDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                if (isInBoundsX(candleEntry, iCandleDataSet)) {
                    MPPointD pixelForValues = this.mChart.getTransformer(iCandleDataSet.getAxisDependency()).getPixelForValues(candleEntry.getX(), ((candleEntry.getLow() * this.mAnimator.getPhaseY()) + (candleEntry.getHigh() * this.mAnimator.getPhaseY())) / 2.0f);
                    highlight.setDraw((float) pixelForValues.x, (float) pixelForValues.y);
                    drawHighlightLines(canvas, (float) pixelForValues.x, (float) pixelForValues.y, iCandleDataSet);
                }
            }
        }
    }

    public void drawValues(Canvas canvas) {
        int i;
        MPPointF mPPointF;
        float f;
        float f2;
        if (isDrawingValuesAllowed(this.mChart)) {
            List dataSets = this.mChart.getCandleData().getDataSets();
            for (int i2 = 0; i2 < dataSets.size(); i2++) {
                ICandleDataSet iCandleDataSet = (ICandleDataSet) dataSets.get(i2);
                if (shouldDrawValues(iCandleDataSet) && iCandleDataSet.getEntryCount() >= 1) {
                    applyValueTextStyle(iCandleDataSet);
                    Transformer transformer = this.mChart.getTransformer(iCandleDataSet.getAxisDependency());
                    this.mXBounds.set(this.mChart, iCandleDataSet);
                    float phaseX = this.mAnimator.getPhaseX();
                    float phaseY = this.mAnimator.getPhaseY();
                    BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
                    float[] generateTransformedValuesCandle = transformer.generateTransformedValuesCandle(iCandleDataSet, phaseX, phaseY, xBounds.min, xBounds.max);
                    float convertDpToPixel = Utils.convertDpToPixel(5.0f);
                    MPPointF instance = MPPointF.getInstance(iCandleDataSet.getIconsOffset());
                    instance.x = Utils.convertDpToPixel(instance.x);
                    instance.y = Utils.convertDpToPixel(instance.y);
                    int i3 = 0;
                    while (i3 < generateTransformedValuesCandle.length) {
                        float f3 = generateTransformedValuesCandle[i3];
                        float f4 = generateTransformedValuesCandle[i3 + 1];
                        if (!this.mViewPortHandler.isInBoundsRight(f3)) {
                            break;
                        }
                        if (!this.mViewPortHandler.isInBoundsLeft(f3) || !this.mViewPortHandler.isInBoundsY(f4)) {
                            i = i3;
                            mPPointF = instance;
                        } else {
                            int i4 = i3 / 2;
                            CandleEntry candleEntry = (CandleEntry) iCandleDataSet.getEntryForIndex(this.mXBounds.min + i4);
                            if (iCandleDataSet.isDrawValuesEnabled()) {
                                f2 = f4;
                                f = f3;
                                i = i3;
                                mPPointF = instance;
                                drawValue(canvas, iCandleDataSet.getValueFormatter(), candleEntry.getHigh(), candleEntry, i2, f3, f4 - convertDpToPixel, iCandleDataSet.getValueTextColor(i4));
                            } else {
                                f2 = f4;
                                f = f3;
                                i = i3;
                                mPPointF = instance;
                            }
                            if (candleEntry.getIcon() != null && iCandleDataSet.isDrawIconsEnabled()) {
                                Drawable icon = candleEntry.getIcon();
                                Utils.drawImage(canvas, icon, (int) (f + mPPointF.x), (int) (f2 + mPPointF.y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                            }
                        }
                        i3 = i + 2;
                        instance = mPPointF;
                    }
                    MPPointF.recycleInstance(instance);
                }
            }
        }
    }

    public void initBuffers() {
    }
}
