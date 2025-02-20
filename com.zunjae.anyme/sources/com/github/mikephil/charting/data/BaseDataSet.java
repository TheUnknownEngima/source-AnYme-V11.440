package com.github.mikephil.charting.data;

import android.content.Context;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Typeface;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.model.GradientColor;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseDataSet<T extends Entry> implements IDataSet<T> {
    protected YAxis.AxisDependency mAxisDependency;
    protected List<Integer> mColors;
    protected boolean mDrawIcons;
    protected boolean mDrawValues;
    private Legend.LegendForm mForm;
    private DashPathEffect mFormLineDashEffect;
    private float mFormLineWidth;
    private float mFormSize;
    protected GradientColor mGradientColor;
    protected List<GradientColor> mGradientColors;
    protected boolean mHighlightEnabled;
    protected MPPointF mIconsOffset;
    private String mLabel;
    protected List<Integer> mValueColors;
    protected transient IValueFormatter mValueFormatter;
    protected float mValueTextSize;
    protected Typeface mValueTypeface;
    protected boolean mVisible;

    public BaseDataSet() {
        this.mColors = null;
        this.mGradientColor = null;
        this.mGradientColors = null;
        this.mValueColors = null;
        this.mLabel = "DataSet";
        this.mAxisDependency = YAxis.AxisDependency.LEFT;
        this.mHighlightEnabled = true;
        this.mForm = Legend.LegendForm.DEFAULT;
        this.mFormSize = Float.NaN;
        this.mFormLineWidth = Float.NaN;
        this.mFormLineDashEffect = null;
        this.mDrawValues = true;
        this.mDrawIcons = true;
        this.mIconsOffset = new MPPointF();
        this.mValueTextSize = 17.0f;
        this.mVisible = true;
        this.mColors = new ArrayList();
        this.mValueColors = new ArrayList();
        this.mColors.add(Integer.valueOf(Color.rgb(140, 234, 255)));
        this.mValueColors.add(-16777216);
    }

    public BaseDataSet(String str) {
        this();
        this.mLabel = str;
    }

    public void addColor(int i) {
        if (this.mColors == null) {
            this.mColors = new ArrayList();
        }
        this.mColors.add(Integer.valueOf(i));
    }

    public boolean contains(T t) {
        for (int i = 0; i < getEntryCount(); i++) {
            if (getEntryForIndex(i).equals(t)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void copy(BaseDataSet baseDataSet) {
        baseDataSet.mAxisDependency = this.mAxisDependency;
        baseDataSet.mColors = this.mColors;
        baseDataSet.mDrawIcons = this.mDrawIcons;
        baseDataSet.mDrawValues = this.mDrawValues;
        baseDataSet.mForm = this.mForm;
        baseDataSet.mFormLineDashEffect = this.mFormLineDashEffect;
        baseDataSet.mFormLineWidth = this.mFormLineWidth;
        baseDataSet.mFormSize = this.mFormSize;
        baseDataSet.mGradientColor = this.mGradientColor;
        baseDataSet.mGradientColors = this.mGradientColors;
        baseDataSet.mHighlightEnabled = this.mHighlightEnabled;
        baseDataSet.mIconsOffset = this.mIconsOffset;
        baseDataSet.mValueColors = this.mValueColors;
        baseDataSet.mValueFormatter = this.mValueFormatter;
        baseDataSet.mValueColors = this.mValueColors;
        baseDataSet.mValueTextSize = this.mValueTextSize;
        baseDataSet.mVisible = this.mVisible;
    }

    public YAxis.AxisDependency getAxisDependency() {
        return this.mAxisDependency;
    }

    public int getColor() {
        return this.mColors.get(0).intValue();
    }

    public int getColor(int i) {
        List<Integer> list = this.mColors;
        return list.get(i % list.size()).intValue();
    }

    public List<Integer> getColors() {
        return this.mColors;
    }

    public Legend.LegendForm getForm() {
        return this.mForm;
    }

    public DashPathEffect getFormLineDashEffect() {
        return this.mFormLineDashEffect;
    }

    public float getFormLineWidth() {
        return this.mFormLineWidth;
    }

    public float getFormSize() {
        return this.mFormSize;
    }

    public GradientColor getGradientColor() {
        return this.mGradientColor;
    }

    public GradientColor getGradientColor(int i) {
        List<GradientColor> list = this.mGradientColors;
        return list.get(i % list.size());
    }

    public List<GradientColor> getGradientColors() {
        return this.mGradientColors;
    }

    public MPPointF getIconsOffset() {
        return this.mIconsOffset;
    }

    public int getIndexInEntries(int i) {
        for (int i2 = 0; i2 < getEntryCount(); i2++) {
            if (((float) i) == getEntryForIndex(i2).getX()) {
                return i2;
            }
        }
        return -1;
    }

    public String getLabel() {
        return this.mLabel;
    }

    public List<Integer> getValueColors() {
        return this.mValueColors;
    }

    public IValueFormatter getValueFormatter() {
        return needsFormatter() ? Utils.getDefaultValueFormatter() : this.mValueFormatter;
    }

    public int getValueTextColor() {
        return this.mValueColors.get(0).intValue();
    }

    public int getValueTextColor(int i) {
        List<Integer> list = this.mValueColors;
        return list.get(i % list.size()).intValue();
    }

    public float getValueTextSize() {
        return this.mValueTextSize;
    }

    public Typeface getValueTypeface() {
        return this.mValueTypeface;
    }

    public boolean isDrawIconsEnabled() {
        return this.mDrawIcons;
    }

    public boolean isDrawValuesEnabled() {
        return this.mDrawValues;
    }

    public boolean isHighlightEnabled() {
        return this.mHighlightEnabled;
    }

    public boolean isVisible() {
        return this.mVisible;
    }

    public boolean needsFormatter() {
        return this.mValueFormatter == null;
    }

    public void notifyDataSetChanged() {
        calcMinMax();
    }

    public boolean removeEntry(int i) {
        return removeEntry(getEntryForIndex(i));
    }

    public boolean removeEntryByXValue(float f) {
        return removeEntry(getEntryForXValue(f, Float.NaN));
    }

    public boolean removeFirst() {
        if (getEntryCount() > 0) {
            return removeEntry(getEntryForIndex(0));
        }
        return false;
    }

    public boolean removeLast() {
        if (getEntryCount() > 0) {
            return removeEntry(getEntryForIndex(getEntryCount() - 1));
        }
        return false;
    }

    public void resetColors() {
        if (this.mColors == null) {
            this.mColors = new ArrayList();
        }
        this.mColors.clear();
    }

    public void setAxisDependency(YAxis.AxisDependency axisDependency) {
        this.mAxisDependency = axisDependency;
    }

    public void setColor(int i) {
        resetColors();
        this.mColors.add(Integer.valueOf(i));
    }

    public void setColor(int i, int i2) {
        setColor(Color.argb(i2, Color.red(i), Color.green(i), Color.blue(i)));
    }

    public void setColors(List<Integer> list) {
        this.mColors = list;
    }

    public void setColors(int... iArr) {
        this.mColors = ColorTemplate.createColors(iArr);
    }

    public void setColors(int[] iArr, int i) {
        resetColors();
        for (int i2 : iArr) {
            addColor(Color.argb(i, Color.red(i2), Color.green(i2), Color.blue(i2)));
        }
    }

    public void setColors(int[] iArr, Context context) {
        if (this.mColors == null) {
            this.mColors = new ArrayList();
        }
        this.mColors.clear();
        for (int color : iArr) {
            this.mColors.add(Integer.valueOf(context.getResources().getColor(color)));
        }
    }

    public void setDrawIcons(boolean z) {
        this.mDrawIcons = z;
    }

    public void setDrawValues(boolean z) {
        this.mDrawValues = z;
    }

    public void setForm(Legend.LegendForm legendForm) {
        this.mForm = legendForm;
    }

    public void setFormLineDashEffect(DashPathEffect dashPathEffect) {
        this.mFormLineDashEffect = dashPathEffect;
    }

    public void setFormLineWidth(float f) {
        this.mFormLineWidth = f;
    }

    public void setFormSize(float f) {
        this.mFormSize = f;
    }

    public void setGradientColor(int i, int i2) {
        this.mGradientColor = new GradientColor(i, i2);
    }

    public void setGradientColors(List<GradientColor> list) {
        this.mGradientColors = list;
    }

    public void setHighlightEnabled(boolean z) {
        this.mHighlightEnabled = z;
    }

    public void setIconsOffset(MPPointF mPPointF) {
        MPPointF mPPointF2 = this.mIconsOffset;
        mPPointF2.x = mPPointF.x;
        mPPointF2.y = mPPointF.y;
    }

    public void setLabel(String str) {
        this.mLabel = str;
    }

    public void setValueFormatter(IValueFormatter iValueFormatter) {
        if (iValueFormatter != null) {
            this.mValueFormatter = iValueFormatter;
        }
    }

    public void setValueTextColor(int i) {
        this.mValueColors.clear();
        this.mValueColors.add(Integer.valueOf(i));
    }

    public void setValueTextColors(List<Integer> list) {
        this.mValueColors = list;
    }

    public void setValueTextSize(float f) {
        this.mValueTextSize = Utils.convertDpToPixel(f);
    }

    public void setValueTypeface(Typeface typeface) {
        this.mValueTypeface = typeface;
    }

    public void setVisible(boolean z) {
        this.mVisible = z;
    }
}
