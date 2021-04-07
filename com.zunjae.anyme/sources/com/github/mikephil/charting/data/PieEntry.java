package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.utils.Utils;

@SuppressLint({"ParcelCreator"})
public class PieEntry extends Entry {
    private String label;

    public PieEntry(float f) {
        super(Utils.FLOAT_EPSILON, f);
    }

    public PieEntry(float f, Drawable drawable) {
        super((float) Utils.FLOAT_EPSILON, f, drawable);
    }

    public PieEntry(float f, Drawable drawable, Object obj) {
        super(Utils.FLOAT_EPSILON, f, drawable, obj);
    }

    public PieEntry(float f, Object obj) {
        super((float) Utils.FLOAT_EPSILON, f, obj);
    }

    public PieEntry(float f, String str) {
        super(Utils.FLOAT_EPSILON, f);
        this.label = str;
    }

    public PieEntry(float f, String str, Drawable drawable) {
        super((float) Utils.FLOAT_EPSILON, f, drawable);
        this.label = str;
    }

    public PieEntry(float f, String str, Drawable drawable, Object obj) {
        super(Utils.FLOAT_EPSILON, f, drawable, obj);
        this.label = str;
    }

    public PieEntry(float f, String str, Object obj) {
        super((float) Utils.FLOAT_EPSILON, f, obj);
        this.label = str;
    }

    public PieEntry copy() {
        return new PieEntry(getY(), this.label, getData());
    }

    public String getLabel() {
        return this.label;
    }

    public float getValue() {
        return getY();
    }

    @Deprecated
    public float getX() {
        return super.getX();
    }

    public void setLabel(String str) {
        this.label = str;
    }

    @Deprecated
    public void setX(float f) {
        super.setX(f);
    }
}
