package com.github.mikephil.charting.data;

import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.utils.Utils;

public abstract class BaseEntry {
    private Object mData;
    private Drawable mIcon;
    private float y;

    public BaseEntry() {
        this.y = Utils.FLOAT_EPSILON;
        this.mData = null;
        this.mIcon = null;
    }

    public BaseEntry(float f) {
        this.y = Utils.FLOAT_EPSILON;
        this.mData = null;
        this.mIcon = null;
        this.y = f;
    }

    public BaseEntry(float f, Drawable drawable) {
        this(f);
        this.mIcon = drawable;
    }

    public BaseEntry(float f, Drawable drawable, Object obj) {
        this(f);
        this.mIcon = drawable;
        this.mData = obj;
    }

    public BaseEntry(float f, Object obj) {
        this(f);
        this.mData = obj;
    }

    public Object getData() {
        return this.mData;
    }

    public Drawable getIcon() {
        return this.mIcon;
    }

    public float getY() {
        return this.y;
    }

    public void setData(Object obj) {
        this.mData = obj;
    }

    public void setIcon(Drawable drawable) {
        this.mIcon = drawable;
    }

    public void setY(float f) {
        this.y = f;
    }
}
