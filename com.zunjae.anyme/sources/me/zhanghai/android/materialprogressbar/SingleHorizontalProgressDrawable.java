package me.zhanghai.android.materialprogressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.charting.utils.Utils;

class SingleHorizontalProgressDrawable extends BaseSingleHorizontalProgressDrawable implements ShowBackgroundDrawable {
    private static final int LEVEL_MAX = 10000;
    private boolean mShowBackground;

    public SingleHorizontalProgressDrawable(Context context) {
        super(context);
    }

    public boolean getShowBackground() {
        return this.mShowBackground;
    }

    /* access modifiers changed from: protected */
    public void onDrawRect(Canvas canvas, Paint paint) {
        int level = getLevel();
        if (level != 0) {
            int save = canvas.save();
            canvas.scale(((float) level) / 10000.0f, 1.0f, BaseSingleHorizontalProgressDrawable.RECT_BOUND.left, Utils.FLOAT_EPSILON);
            super.onDrawRect(canvas, paint);
            if (this.mShowBackground) {
                super.onDrawRect(canvas, paint);
            }
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        invalidateSelf();
        return true;
    }

    public void setShowBackground(boolean z) {
        if (this.mShowBackground != z) {
            this.mShowBackground = z;
            invalidateSelf();
        }
    }
}
