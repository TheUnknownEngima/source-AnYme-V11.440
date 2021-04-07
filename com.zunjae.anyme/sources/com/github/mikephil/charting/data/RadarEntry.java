package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import com.github.mikephil.charting.utils.Utils;

@SuppressLint({"ParcelCreator"})
public class RadarEntry extends Entry {
    public RadarEntry(float f) {
        super(Utils.FLOAT_EPSILON, f);
    }

    public RadarEntry(float f, Object obj) {
        super((float) Utils.FLOAT_EPSILON, f, obj);
    }

    public RadarEntry copy() {
        return new RadarEntry(getY(), getData());
    }

    public float getValue() {
        return getY();
    }

    @Deprecated
    public float getX() {
        return super.getX();
    }

    @Deprecated
    public void setX(float f) {
        super.setX(f);
    }
}
