package com.github.mikephil.charting.buffer;

import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.Utils;

public class BarBuffer extends AbstractBuffer<IBarDataSet> {
    protected float mBarWidth = 1.0f;
    protected boolean mContainsStacks = false;
    protected int mDataSetCount = 1;
    protected int mDataSetIndex = 0;
    protected boolean mInverted = false;

    public BarBuffer(int i, int i2, boolean z) {
        super(i);
        this.mDataSetCount = i2;
        this.mContainsStacks = z;
    }

    /* access modifiers changed from: protected */
    public void addBar(float f, float f2, float f3, float f4) {
        float[] fArr = this.buffer;
        int i = this.index;
        int i2 = i + 1;
        this.index = i2;
        fArr[i] = f;
        int i3 = i2 + 1;
        this.index = i3;
        fArr[i2] = f2;
        int i4 = i3 + 1;
        this.index = i4;
        fArr[i3] = f3;
        this.index = i4 + 1;
        fArr[i4] = f4;
    }

    public void feed(IBarDataSet iBarDataSet) {
        float f;
        float f2;
        float f3;
        float f4;
        float entryCount = ((float) iBarDataSet.getEntryCount()) * this.phaseX;
        float f5 = this.mBarWidth / 2.0f;
        for (int i = 0; ((float) i) < entryCount; i++) {
            BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForIndex(i);
            if (barEntry != null) {
                float x = barEntry.getX();
                float y = barEntry.getY();
                float[] yVals = barEntry.getYVals();
                if (!this.mContainsStacks || yVals == null) {
                    float f6 = x - f5;
                    float f7 = x + f5;
                    if (this.mInverted) {
                        f = y >= Utils.FLOAT_EPSILON ? y : Utils.FLOAT_EPSILON;
                        if (y > Utils.FLOAT_EPSILON) {
                            y = Utils.FLOAT_EPSILON;
                        }
                    } else {
                        float f8 = y >= Utils.FLOAT_EPSILON ? y : Utils.FLOAT_EPSILON;
                        if (y > Utils.FLOAT_EPSILON) {
                            y = Utils.FLOAT_EPSILON;
                        }
                        float f9 = y;
                        y = f8;
                        f = f9;
                    }
                    if (y > Utils.FLOAT_EPSILON) {
                        y *= this.phaseY;
                    } else {
                        f *= this.phaseY;
                    }
                    addBar(f6, y, f7, f);
                } else {
                    float f10 = -barEntry.getNegativeSum();
                    int i2 = 0;
                    float f11 = Utils.FLOAT_EPSILON;
                    while (i2 < yVals.length) {
                        float f12 = yVals[i2];
                        int i3 = (f12 > Utils.FLOAT_EPSILON ? 1 : (f12 == Utils.FLOAT_EPSILON ? 0 : -1));
                        if (i3 == 0 && (f11 == Utils.FLOAT_EPSILON || f10 == Utils.FLOAT_EPSILON)) {
                            f2 = f12;
                            f3 = f10;
                            f10 = f2;
                        } else if (i3 >= 0) {
                            f2 = f12 + f11;
                            f3 = f10;
                            f10 = f11;
                            f11 = f2;
                        } else {
                            f2 = Math.abs(f12) + f10;
                            f3 = Math.abs(f12) + f10;
                        }
                        float f13 = x - f5;
                        float f14 = x + f5;
                        if (this.mInverted) {
                            f4 = f10 >= f2 ? f10 : f2;
                            if (f10 > f2) {
                                f10 = f2;
                            }
                        } else {
                            float f15 = f10 >= f2 ? f10 : f2;
                            if (f10 > f2) {
                                f10 = f2;
                            }
                            float f16 = f10;
                            f10 = f15;
                            f4 = f16;
                        }
                        float f17 = this.phaseY;
                        addBar(f13, f10 * f17, f14, f4 * f17);
                        i2++;
                        f10 = f3;
                    }
                }
            }
        }
        reset();
    }

    public void setBarWidth(float f) {
        this.mBarWidth = f;
    }

    public void setDataSet(int i) {
        this.mDataSetIndex = i;
    }

    public void setInverted(boolean z) {
        this.mInverted = z;
    }
}
