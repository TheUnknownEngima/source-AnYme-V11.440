package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.highlight.Range;
import com.github.mikephil.charting.utils.Utils;

@SuppressLint({"ParcelCreator"})
public class BarEntry extends Entry {
    private float mNegativeSum;
    private float mPositiveSum;
    private Range[] mRanges;
    private float[] mYVals;

    public BarEntry(float f, float f2) {
        super(f, f2);
    }

    public BarEntry(float f, float f2, Drawable drawable) {
        super(f, f2, drawable);
    }

    public BarEntry(float f, float f2, Drawable drawable, Object obj) {
        super(f, f2, drawable, obj);
    }

    public BarEntry(float f, float f2, Object obj) {
        super(f, f2, obj);
    }

    public BarEntry(float f, float[] fArr) {
        super(f, calcSum(fArr));
        this.mYVals = fArr;
        calcPosNegSum();
        calcRanges();
    }

    public BarEntry(float f, float[] fArr, Drawable drawable) {
        super(f, calcSum(fArr), drawable);
        this.mYVals = fArr;
        calcPosNegSum();
        calcRanges();
    }

    public BarEntry(float f, float[] fArr, Drawable drawable, Object obj) {
        super(f, calcSum(fArr), drawable, obj);
        this.mYVals = fArr;
        calcPosNegSum();
        calcRanges();
    }

    public BarEntry(float f, float[] fArr, Object obj) {
        super(f, calcSum(fArr), obj);
        this.mYVals = fArr;
        calcPosNegSum();
        calcRanges();
    }

    private void calcPosNegSum() {
        float[] fArr = this.mYVals;
        if (fArr == null) {
            this.mNegativeSum = Utils.FLOAT_EPSILON;
            this.mPositiveSum = Utils.FLOAT_EPSILON;
            return;
        }
        float f = Utils.FLOAT_EPSILON;
        float f2 = Utils.FLOAT_EPSILON;
        for (float f3 : fArr) {
            if (f3 <= Utils.FLOAT_EPSILON) {
                f += Math.abs(f3);
            } else {
                f2 += f3;
            }
        }
        this.mNegativeSum = f;
        this.mPositiveSum = f2;
    }

    private static float calcSum(float[] fArr) {
        float f = Utils.FLOAT_EPSILON;
        if (fArr == null) {
            return Utils.FLOAT_EPSILON;
        }
        for (float f2 : fArr) {
            f += f2;
        }
        return f;
    }

    /* access modifiers changed from: protected */
    public void calcRanges() {
        float[] yVals = getYVals();
        if (yVals != null && yVals.length != 0) {
            this.mRanges = new Range[yVals.length];
            float f = -getNegativeSum();
            int i = 0;
            float f2 = Utils.FLOAT_EPSILON;
            while (true) {
                Range[] rangeArr = this.mRanges;
                if (i < rangeArr.length) {
                    float f3 = yVals[i];
                    if (f3 < Utils.FLOAT_EPSILON) {
                        float f4 = f - f3;
                        rangeArr[i] = new Range(f, f4);
                        f = f4;
                    } else {
                        float f5 = f3 + f2;
                        rangeArr[i] = new Range(f2, f5);
                        f2 = f5;
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public BarEntry copy() {
        BarEntry barEntry = new BarEntry(getX(), getY(), getData());
        barEntry.setVals(this.mYVals);
        return barEntry;
    }

    @Deprecated
    public float getBelowSum(int i) {
        return getSumBelow(i);
    }

    public float getNegativeSum() {
        return this.mNegativeSum;
    }

    public float getPositiveSum() {
        return this.mPositiveSum;
    }

    public Range[] getRanges() {
        return this.mRanges;
    }

    public float getSumBelow(int i) {
        float[] fArr = this.mYVals;
        float f = Utils.FLOAT_EPSILON;
        if (fArr == null) {
            return Utils.FLOAT_EPSILON;
        }
        int length = fArr.length - 1;
        while (length > i && length >= 0) {
            f += this.mYVals[length];
            length--;
        }
        return f;
    }

    public float getY() {
        return super.getY();
    }

    public float[] getYVals() {
        return this.mYVals;
    }

    public boolean isStacked() {
        return this.mYVals != null;
    }

    public void setVals(float[] fArr) {
        setY(calcSum(fArr));
        this.mYVals = fArr;
        calcPosNegSum();
        calcRanges();
    }
}
