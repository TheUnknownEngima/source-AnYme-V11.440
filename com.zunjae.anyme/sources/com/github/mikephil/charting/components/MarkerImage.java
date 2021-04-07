package com.github.mikephil.charting.components;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.FSize;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import java.lang.ref.WeakReference;

public class MarkerImage implements IMarker {
    private Context mContext;
    private Drawable mDrawable;
    private Rect mDrawableBoundsCache = new Rect();
    private MPPointF mOffset = new MPPointF();
    private MPPointF mOffset2 = new MPPointF();
    private FSize mSize = new FSize();
    private WeakReference<Chart> mWeakChart;

    public MarkerImage(Context context, int i) {
        this.mContext = context;
        int i2 = Build.VERSION.SDK_INT;
        Resources resources = context.getResources();
        this.mDrawable = i2 >= 21 ? resources.getDrawable(i, (Resources.Theme) null) : resources.getDrawable(i);
    }

    public void draw(Canvas canvas, float f, float f2) {
        if (this.mDrawable != null) {
            MPPointF offsetForDrawingAtPoint = getOffsetForDrawingAtPoint(f, f2);
            FSize fSize = this.mSize;
            float f3 = fSize.width;
            float f4 = fSize.height;
            if (f3 == Utils.FLOAT_EPSILON) {
                f3 = (float) this.mDrawable.getIntrinsicWidth();
            }
            if (f4 == Utils.FLOAT_EPSILON) {
                f4 = (float) this.mDrawable.getIntrinsicHeight();
            }
            this.mDrawable.copyBounds(this.mDrawableBoundsCache);
            Drawable drawable = this.mDrawable;
            Rect rect = this.mDrawableBoundsCache;
            int i = rect.left;
            int i2 = rect.top;
            drawable.setBounds(i, i2, ((int) f3) + i, ((int) f4) + i2);
            int save = canvas.save();
            canvas.translate(f + offsetForDrawingAtPoint.x, f2 + offsetForDrawingAtPoint.y);
            this.mDrawable.draw(canvas);
            canvas.restoreToCount(save);
            this.mDrawable.setBounds(this.mDrawableBoundsCache);
        }
    }

    public Chart getChartView() {
        WeakReference<Chart> weakReference = this.mWeakChart;
        if (weakReference == null) {
            return null;
        }
        return (Chart) weakReference.get();
    }

    public MPPointF getOffset() {
        return this.mOffset;
    }

    public MPPointF getOffsetForDrawingAtPoint(float f, float f2) {
        Drawable drawable;
        Drawable drawable2;
        MPPointF offset = getOffset();
        MPPointF mPPointF = this.mOffset2;
        mPPointF.x = offset.x;
        mPPointF.y = offset.y;
        Chart chartView = getChartView();
        FSize fSize = this.mSize;
        float f3 = fSize.width;
        float f4 = fSize.height;
        if (f3 == Utils.FLOAT_EPSILON && (drawable2 = this.mDrawable) != null) {
            f3 = (float) drawable2.getIntrinsicWidth();
        }
        if (f4 == Utils.FLOAT_EPSILON && (drawable = this.mDrawable) != null) {
            f4 = (float) drawable.getIntrinsicHeight();
        }
        MPPointF mPPointF2 = this.mOffset2;
        float f5 = mPPointF2.x;
        if (f + f5 < Utils.FLOAT_EPSILON) {
            mPPointF2.x = -f;
        } else if (chartView != null && f + f3 + f5 > ((float) chartView.getWidth())) {
            this.mOffset2.x = (((float) chartView.getWidth()) - f) - f3;
        }
        MPPointF mPPointF3 = this.mOffset2;
        float f6 = mPPointF3.y;
        if (f2 + f6 < Utils.FLOAT_EPSILON) {
            mPPointF3.y = -f2;
        } else if (chartView != null && f2 + f4 + f6 > ((float) chartView.getHeight())) {
            this.mOffset2.y = (((float) chartView.getHeight()) - f2) - f4;
        }
        return this.mOffset2;
    }

    public FSize getSize() {
        return this.mSize;
    }

    public void refreshContent(Entry entry, Highlight highlight) {
    }

    public void setChartView(Chart chart) {
        this.mWeakChart = new WeakReference<>(chart);
    }

    public void setOffset(float f, float f2) {
        MPPointF mPPointF = this.mOffset;
        mPPointF.x = f;
        mPPointF.y = f2;
    }

    public void setOffset(MPPointF mPPointF) {
        this.mOffset = mPPointF;
        if (mPPointF == null) {
            this.mOffset = new MPPointF();
        }
    }

    public void setSize(FSize fSize) {
        this.mSize = fSize;
        if (fSize == null) {
            this.mSize = new FSize();
        }
    }
}
