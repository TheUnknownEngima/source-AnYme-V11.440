package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.ScatterData;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.ScatterDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IScatterDataSet;
import com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer;
import com.github.mikephil.charting.renderer.scatter.IShapeRenderer;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

public class ScatterChartRenderer extends LineScatterCandleRadarRenderer {
    protected ScatterDataProvider mChart;
    float[] mPixelBuffer = new float[2];

    public ScatterChartRenderer(ScatterDataProvider scatterDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mChart = scatterDataProvider;
    }

    public void drawData(Canvas canvas) {
        for (IScatterDataSet iScatterDataSet : this.mChart.getScatterData().getDataSets()) {
            if (iScatterDataSet.isVisible()) {
                drawDataSet(canvas, iScatterDataSet);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawDataSet(Canvas canvas, IScatterDataSet iScatterDataSet) {
        int i;
        IScatterDataSet iScatterDataSet2 = iScatterDataSet;
        if (iScatterDataSet.getEntryCount() >= 1) {
            ViewPortHandler viewPortHandler = this.mViewPortHandler;
            Transformer transformer = this.mChart.getTransformer(iScatterDataSet.getAxisDependency());
            float phaseY = this.mAnimator.getPhaseY();
            IShapeRenderer shapeRenderer = iScatterDataSet.getShapeRenderer();
            if (shapeRenderer != null) {
                int min = (int) Math.min(Math.ceil((double) (((float) iScatterDataSet.getEntryCount()) * this.mAnimator.getPhaseX())), (double) ((float) iScatterDataSet.getEntryCount()));
                int i2 = 0;
                while (i2 < min) {
                    Entry entryForIndex = iScatterDataSet2.getEntryForIndex(i2);
                    this.mPixelBuffer[0] = entryForIndex.getX();
                    this.mPixelBuffer[1] = entryForIndex.getY() * phaseY;
                    transformer.pointValuesToPixel(this.mPixelBuffer);
                    if (viewPortHandler.isInBoundsRight(this.mPixelBuffer[0])) {
                        if (!viewPortHandler.isInBoundsLeft(this.mPixelBuffer[0]) || !viewPortHandler.isInBoundsY(this.mPixelBuffer[1])) {
                            i = i2;
                        } else {
                            this.mRenderPaint.setColor(iScatterDataSet2.getColor(i2 / 2));
                            ViewPortHandler viewPortHandler2 = this.mViewPortHandler;
                            float[] fArr = this.mPixelBuffer;
                            i = i2;
                            shapeRenderer.renderShape(canvas, iScatterDataSet, viewPortHandler2, fArr[0], fArr[1], this.mRenderPaint);
                        }
                        i2 = i + 1;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void drawExtras(Canvas canvas) {
    }

    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        ScatterData scatterData = this.mChart.getScatterData();
        for (Highlight highlight : highlightArr) {
            IScatterDataSet iScatterDataSet = (IScatterDataSet) scatterData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iScatterDataSet != null && iScatterDataSet.isHighlightEnabled()) {
                Entry entryForXValue = iScatterDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                if (isInBoundsX(entryForXValue, iScatterDataSet)) {
                    MPPointD pixelForValues = this.mChart.getTransformer(iScatterDataSet.getAxisDependency()).getPixelForValues(entryForXValue.getX(), entryForXValue.getY() * this.mAnimator.getPhaseY());
                    highlight.setDraw((float) pixelForValues.x, (float) pixelForValues.y);
                    drawHighlightLines(canvas, (float) pixelForValues.x, (float) pixelForValues.y, iScatterDataSet);
                }
            }
        }
    }

    public void drawValues(Canvas canvas) {
        int i;
        MPPointF mPPointF;
        if (isDrawingValuesAllowed(this.mChart)) {
            List dataSets = this.mChart.getScatterData().getDataSets();
            for (int i2 = 0; i2 < this.mChart.getScatterData().getDataSetCount(); i2++) {
                IScatterDataSet iScatterDataSet = (IScatterDataSet) dataSets.get(i2);
                if (shouldDrawValues(iScatterDataSet) && iScatterDataSet.getEntryCount() >= 1) {
                    applyValueTextStyle(iScatterDataSet);
                    this.mXBounds.set(this.mChart, iScatterDataSet);
                    Transformer transformer = this.mChart.getTransformer(iScatterDataSet.getAxisDependency());
                    float phaseX = this.mAnimator.getPhaseX();
                    float phaseY = this.mAnimator.getPhaseY();
                    BarLineScatterCandleBubbleRenderer.XBounds xBounds = this.mXBounds;
                    float[] generateTransformedValuesScatter = transformer.generateTransformedValuesScatter(iScatterDataSet, phaseX, phaseY, xBounds.min, xBounds.max);
                    float convertDpToPixel = Utils.convertDpToPixel(iScatterDataSet.getScatterShapeSize());
                    MPPointF instance = MPPointF.getInstance(iScatterDataSet.getIconsOffset());
                    instance.x = Utils.convertDpToPixel(instance.x);
                    instance.y = Utils.convertDpToPixel(instance.y);
                    int i3 = 0;
                    while (i3 < generateTransformedValuesScatter.length && this.mViewPortHandler.isInBoundsRight(generateTransformedValuesScatter[i3])) {
                        if (this.mViewPortHandler.isInBoundsLeft(generateTransformedValuesScatter[i3])) {
                            int i4 = i3 + 1;
                            if (this.mViewPortHandler.isInBoundsY(generateTransformedValuesScatter[i4])) {
                                int i5 = i3 / 2;
                                Entry entryForIndex = iScatterDataSet.getEntryForIndex(this.mXBounds.min + i5);
                                if (iScatterDataSet.isDrawValuesEnabled()) {
                                    i = i3;
                                    mPPointF = instance;
                                    drawValue(canvas, iScatterDataSet.getValueFormatter(), entryForIndex.getY(), entryForIndex, i2, generateTransformedValuesScatter[i3], generateTransformedValuesScatter[i4] - convertDpToPixel, iScatterDataSet.getValueTextColor(i5 + this.mXBounds.min));
                                } else {
                                    i = i3;
                                    mPPointF = instance;
                                }
                                if (entryForIndex.getIcon() != null && iScatterDataSet.isDrawIconsEnabled()) {
                                    Drawable icon = entryForIndex.getIcon();
                                    Utils.drawImage(canvas, icon, (int) (generateTransformedValuesScatter[i] + mPPointF.x), (int) (generateTransformedValuesScatter[i4] + mPPointF.y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                                }
                                i3 = i + 2;
                                instance = mPPointF;
                            }
                        }
                        i = i3;
                        mPPointF = instance;
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
