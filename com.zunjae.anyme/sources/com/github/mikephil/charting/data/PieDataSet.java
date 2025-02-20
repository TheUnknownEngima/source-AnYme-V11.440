package com.github.mikephil.charting.data;

import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;

public class PieDataSet extends DataSet<PieEntry> implements IPieDataSet {
    private boolean mAutomaticallyDisableSliceSpacing;
    private float mShift = 18.0f;
    private float mSliceSpace = Utils.FLOAT_EPSILON;
    private boolean mUsingSliceColorAsValueLineColor;
    private int mValueLineColor;
    private float mValueLinePart1Length;
    private float mValueLinePart1OffsetPercentage;
    private float mValueLinePart2Length;
    private boolean mValueLineVariableLength;
    private float mValueLineWidth;
    private ValuePosition mXValuePosition;
    private ValuePosition mYValuePosition;

    public enum ValuePosition {
        INSIDE_SLICE,
        OUTSIDE_SLICE
    }

    public PieDataSet(List<PieEntry> list, String str) {
        super(list, str);
        ValuePosition valuePosition = ValuePosition.INSIDE_SLICE;
        this.mXValuePosition = valuePosition;
        this.mYValuePosition = valuePosition;
        this.mUsingSliceColorAsValueLineColor = false;
        this.mValueLineColor = -16777216;
        this.mValueLineWidth = 1.0f;
        this.mValueLinePart1OffsetPercentage = 75.0f;
        this.mValueLinePart1Length = 0.3f;
        this.mValueLinePart2Length = 0.4f;
        this.mValueLineVariableLength = true;
    }

    /* access modifiers changed from: protected */
    public void calcMinMax(PieEntry pieEntry) {
        if (pieEntry != null) {
            calcMinMaxY(pieEntry);
        }
    }

    public DataSet<PieEntry> copy() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.mValues.size(); i++) {
            arrayList.add(((PieEntry) this.mValues.get(i)).copy());
        }
        PieDataSet pieDataSet = new PieDataSet(arrayList, getLabel());
        copy(pieDataSet);
        return pieDataSet;
    }

    /* access modifiers changed from: protected */
    public void copy(PieDataSet pieDataSet) {
        super.copy(pieDataSet);
    }

    public float getSelectionShift() {
        return this.mShift;
    }

    public float getSliceSpace() {
        return this.mSliceSpace;
    }

    public int getValueLineColor() {
        return this.mValueLineColor;
    }

    public float getValueLinePart1Length() {
        return this.mValueLinePart1Length;
    }

    public float getValueLinePart1OffsetPercentage() {
        return this.mValueLinePart1OffsetPercentage;
    }

    public float getValueLinePart2Length() {
        return this.mValueLinePart2Length;
    }

    public float getValueLineWidth() {
        return this.mValueLineWidth;
    }

    public ValuePosition getXValuePosition() {
        return this.mXValuePosition;
    }

    public ValuePosition getYValuePosition() {
        return this.mYValuePosition;
    }

    public boolean isAutomaticallyDisableSliceSpacingEnabled() {
        return this.mAutomaticallyDisableSliceSpacing;
    }

    public boolean isUsingSliceColorAsValueLineColor() {
        return this.mUsingSliceColorAsValueLineColor;
    }

    public boolean isValueLineVariableLength() {
        return this.mValueLineVariableLength;
    }

    public void setAutomaticallyDisableSliceSpacing(boolean z) {
        this.mAutomaticallyDisableSliceSpacing = z;
    }

    public void setSelectionShift(float f) {
        this.mShift = Utils.convertDpToPixel(f);
    }

    public void setSliceSpace(float f) {
        if (f > 20.0f) {
            f = 20.0f;
        }
        if (f < Utils.FLOAT_EPSILON) {
            f = Utils.FLOAT_EPSILON;
        }
        this.mSliceSpace = Utils.convertDpToPixel(f);
    }

    public void setUsingSliceColorAsValueLineColor(boolean z) {
        this.mUsingSliceColorAsValueLineColor = z;
    }

    public void setValueLineColor(int i) {
        this.mValueLineColor = i;
    }

    public void setValueLinePart1Length(float f) {
        this.mValueLinePart1Length = f;
    }

    public void setValueLinePart1OffsetPercentage(float f) {
        this.mValueLinePart1OffsetPercentage = f;
    }

    public void setValueLinePart2Length(float f) {
        this.mValueLinePart2Length = f;
    }

    public void setValueLineVariableLength(boolean z) {
        this.mValueLineVariableLength = z;
    }

    public void setValueLineWidth(float f) {
        this.mValueLineWidth = f;
    }

    public void setXValuePosition(ValuePosition valuePosition) {
        this.mXValuePosition = valuePosition;
    }

    public void setYValuePosition(ValuePosition valuePosition) {
        this.mYValuePosition = valuePosition;
    }
}
