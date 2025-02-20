package me.zhanghai.android.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;

class SingleCircularProgressDrawable extends BaseSingleCircularProgressDrawable implements ShowBackgroundDrawable {
    private static final int LEVEL_MAX = 10000;
    private static final float START_ANGLE_MAX_DYNAMIC = 360.0f;
    private static final float START_ANGLE_MAX_NORMAL = 0.0f;
    private static final float SWEEP_ANGLE_MAX = 360.0f;
    private boolean mShowBackground;
    private final float mStartAngleMax;

    SingleCircularProgressDrawable(int i) {
        float f;
        if (i == 0) {
            f = 0.0f;
        } else if (i == 1) {
            f = 360.0f;
        } else {
            throw new IllegalArgumentException("Invalid value for style");
        }
        this.mStartAngleMax = f;
    }

    public boolean getShowBackground() {
        return this.mShowBackground;
    }

    /* access modifiers changed from: protected */
    public void onDrawRing(Canvas canvas, Paint paint) {
        int level = getLevel();
        if (level != 0) {
            float f = ((float) level) / 10000.0f;
            float f2 = this.mStartAngleMax * f;
            float f3 = f * 360.0f;
            drawRing(canvas, paint, f2, f3);
            if (this.mShowBackground) {
                drawRing(canvas, paint, f2, f3);
            }
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
