package com.github.mikephil.charting.buffer;

import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.Utils;

public class HorizontalBarBuffer extends BarBuffer {
    public HorizontalBarBuffer(int i, int i2, boolean z) {
        super(i, i2, z);
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
                    addBar(f, f7, y, f6);
                } else {
                    float f10 = -barEntry.getNegativeSum();
                    int i2 = 0;
                    float f11 = Utils.FLOAT_EPSILON;
                    while (i2 < yVals.length) {
                        float f12 = yVals[i2];
                        if (f12 >= Utils.FLOAT_EPSILON) {
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
                        addBar(f4 * f17, f14, f10 * f17, f13);
                        i2++;
                        f10 = f3;
                    }
                }
            }
        }
        reset();
    }
}
