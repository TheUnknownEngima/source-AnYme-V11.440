package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.utils.Utils;

@SuppressLint({"ParcelCreator"})
public class CandleEntry extends Entry {
    private float mClose = Utils.FLOAT_EPSILON;
    private float mOpen = Utils.FLOAT_EPSILON;
    private float mShadowHigh = Utils.FLOAT_EPSILON;
    private float mShadowLow = Utils.FLOAT_EPSILON;

    public CandleEntry(float f, float f2, float f3, float f4, float f5) {
        super(f, (f2 + f3) / 2.0f);
        this.mShadowHigh = f2;
        this.mShadowLow = f3;
        this.mOpen = f4;
        this.mClose = f5;
    }

    public CandleEntry(float f, float f2, float f3, float f4, float f5, Drawable drawable) {
        super(f, (f2 + f3) / 2.0f, drawable);
        this.mShadowHigh = f2;
        this.mShadowLow = f3;
        this.mOpen = f4;
        this.mClose = f5;
    }

    public CandleEntry(float f, float f2, float f3, float f4, float f5, Drawable drawable, Object obj) {
        super(f, (f2 + f3) / 2.0f, drawable, obj);
        this.mShadowHigh = f2;
        this.mShadowLow = f3;
        this.mOpen = f4;
        this.mClose = f5;
    }

    public CandleEntry(float f, float f2, float f3, float f4, float f5, Object obj) {
        super(f, (f2 + f3) / 2.0f, obj);
        this.mShadowHigh = f2;
        this.mShadowLow = f3;
        this.mOpen = f4;
        this.mClose = f5;
    }

    public CandleEntry copy() {
        return new CandleEntry(getX(), this.mShadowHigh, this.mShadowLow, this.mOpen, this.mClose, getData());
    }

    public float getBodyRange() {
        return Math.abs(this.mOpen - this.mClose);
    }

    public float getClose() {
        return this.mClose;
    }

    public float getHigh() {
        return this.mShadowHigh;
    }

    public float getLow() {
        return this.mShadowLow;
    }

    public float getOpen() {
        return this.mOpen;
    }

    public float getShadowRange() {
        return Math.abs(this.mShadowHigh - this.mShadowLow);
    }

    public float getY() {
        return super.getY();
    }

    public void setClose(float f) {
        this.mClose = f;
    }

    public void setHigh(float f) {
        this.mShadowHigh = f;
    }

    public void setLow(float f) {
        this.mShadowLow = f;
    }

    public void setOpen(float f) {
        this.mOpen = f;
    }
}
