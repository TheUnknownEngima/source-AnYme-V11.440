package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.highlight.BarHighlighter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.renderer.BarChartRenderer;
import com.github.mikephil.charting.utils.Utils;

public class BarChart extends BarLineChartBase<BarData> implements BarDataProvider {
    private boolean mDrawBarShadow = false;
    private boolean mDrawValueAboveBar = true;
    private boolean mFitBars = false;
    protected boolean mHighlightFullBarEnabled = false;

    public BarChart(Context context) {
        super(context);
    }

    public BarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void calcMinMax() {
        float f;
        float f2;
        XAxis xAxis;
        if (this.mFitBars) {
            xAxis = this.mXAxis;
            f2 = ((BarData) this.mData).getXMin() - (((BarData) this.mData).getBarWidth() / 2.0f);
            f = ((BarData) this.mData).getXMax() + (((BarData) this.mData).getBarWidth() / 2.0f);
        } else {
            xAxis = this.mXAxis;
            f2 = ((BarData) this.mData).getXMin();
            f = ((BarData) this.mData).getXMax();
        }
        xAxis.calculate(f2, f);
        this.mAxisLeft.calculate(((BarData) this.mData).getYMin(YAxis.AxisDependency.LEFT), ((BarData) this.mData).getYMax(YAxis.AxisDependency.LEFT));
        this.mAxisRight.calculate(((BarData) this.mData).getYMin(YAxis.AxisDependency.RIGHT), ((BarData) this.mData).getYMax(YAxis.AxisDependency.RIGHT));
    }

    public RectF getBarBounds(BarEntry barEntry) {
        RectF rectF = new RectF();
        getBarBounds(barEntry, rectF);
        return rectF;
    }

    public void getBarBounds(BarEntry barEntry, RectF rectF) {
        IBarDataSet iBarDataSet = (IBarDataSet) ((BarData) this.mData).getDataSetForEntry(barEntry);
        if (iBarDataSet == null) {
            rectF.set(Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
            return;
        }
        float y = barEntry.getY();
        float x = barEntry.getX();
        float barWidth = ((BarData) this.mData).getBarWidth() / 2.0f;
        float f = x - barWidth;
        float f2 = x + barWidth;
        float f3 = y >= Utils.FLOAT_EPSILON ? y : Utils.FLOAT_EPSILON;
        if (y > Utils.FLOAT_EPSILON) {
            y = Utils.FLOAT_EPSILON;
        }
        rectF.set(f, f3, f2, y);
        getTransformer(iBarDataSet.getAxisDependency()).rectValueToPixel(rectF);
    }

    public BarData getBarData() {
        return (BarData) this.mData;
    }

    public Highlight getHighlightByTouchPoint(float f, float f2) {
        if (this.mData == null) {
            return null;
        }
        Highlight highlight = getHighlighter().getHighlight(f, f2);
        return (highlight == null || !isHighlightFullBarEnabled()) ? highlight : new Highlight(highlight.getX(), highlight.getY(), highlight.getXPx(), highlight.getYPx(), highlight.getDataSetIndex(), -1, highlight.getAxis());
    }

    public void groupBars(float f, float f2, float f3) {
        if (getBarData() != null) {
            getBarData().groupBars(f, f2, f3);
            notifyDataSetChanged();
            return;
        }
        throw new RuntimeException("You need to set data for the chart before grouping bars.");
    }

    public void highlightValue(float f, int i, int i2) {
        highlightValue(new Highlight(f, i, i2), false);
    }

    /* access modifiers changed from: protected */
    public void init() {
        super.init();
        this.mRenderer = new BarChartRenderer(this, this.mAnimator, this.mViewPortHandler);
        setHighlighter(new BarHighlighter(this));
        getXAxis().setSpaceMin(0.5f);
        getXAxis().setSpaceMax(0.5f);
    }

    public boolean isDrawBarShadowEnabled() {
        return this.mDrawBarShadow;
    }

    public boolean isDrawValueAboveBarEnabled() {
        return this.mDrawValueAboveBar;
    }

    public boolean isHighlightFullBarEnabled() {
        return this.mHighlightFullBarEnabled;
    }

    public void setDrawBarShadow(boolean z) {
        this.mDrawBarShadow = z;
    }

    public void setDrawValueAboveBar(boolean z) {
        this.mDrawValueAboveBar = z;
    }

    public void setFitBars(boolean z) {
        this.mFitBars = z;
    }

    public void setHighlightFullBarEnabled(boolean z) {
        this.mHighlightFullBarEnabled = z;
    }
}
