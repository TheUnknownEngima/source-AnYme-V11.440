package com.github.mikephil.charting.jobs;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import com.github.mikephil.charting.utils.ObjectPool;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

@SuppressLint({"NewApi"})
public class AnimatedMoveViewJob extends AnimatedViewPortJob {
    private static ObjectPool<AnimatedMoveViewJob> pool;

    static {
        ObjectPool<AnimatedMoveViewJob> create = ObjectPool.create(4, new AnimatedMoveViewJob((ViewPortHandler) null, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (Transformer) null, (View) null, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 0));
        pool = create;
        create.setReplenishPercentage(0.5f);
    }

    public AnimatedMoveViewJob(ViewPortHandler viewPortHandler, float f, float f2, Transformer transformer, View view, float f3, float f4, long j) {
        super(viewPortHandler, f, f2, transformer, view, f3, f4, j);
    }

    public static AnimatedMoveViewJob getInstance(ViewPortHandler viewPortHandler, float f, float f2, Transformer transformer, View view, float f3, float f4, long j) {
        AnimatedMoveViewJob animatedMoveViewJob = pool.get();
        animatedMoveViewJob.mViewPortHandler = viewPortHandler;
        animatedMoveViewJob.xValue = f;
        animatedMoveViewJob.yValue = f2;
        animatedMoveViewJob.mTrans = transformer;
        animatedMoveViewJob.view = view;
        animatedMoveViewJob.xOrigin = f3;
        animatedMoveViewJob.yOrigin = f4;
        animatedMoveViewJob.animator.setDuration(j);
        return animatedMoveViewJob;
    }

    public static void recycleInstance(AnimatedMoveViewJob animatedMoveViewJob) {
        pool.recycle(animatedMoveViewJob);
    }

    /* access modifiers changed from: protected */
    public ObjectPool.Poolable instantiate() {
        return new AnimatedMoveViewJob((ViewPortHandler) null, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (Transformer) null, (View) null, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 0);
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float[] fArr = this.pts;
        float f = this.xOrigin;
        float f2 = this.phase;
        fArr[0] = f + ((this.xValue - f) * f2);
        float f3 = this.yOrigin;
        fArr[1] = f3 + ((this.yValue - f3) * f2);
        this.mTrans.pointValuesToPixel(fArr);
        this.mViewPortHandler.centerViewPort(this.pts, this.view);
    }

    public void recycleSelf() {
        recycleInstance(this);
    }
}
