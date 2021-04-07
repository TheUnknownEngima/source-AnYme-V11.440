package com.github.mikephil.charting.listener;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;

public class PieRadarChartTouchListener extends ChartTouchListener<PieRadarChartBase<?>> {
    private ArrayList<AngularVelocitySample> _velocitySamples = new ArrayList<>();
    private float mDecelerationAngularVelocity = Utils.FLOAT_EPSILON;
    private long mDecelerationLastTime = 0;
    private float mStartAngle = Utils.FLOAT_EPSILON;
    private MPPointF mTouchStartPoint = MPPointF.getInstance(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);

    private class AngularVelocitySample {
        public float angle;
        public long time;

        public AngularVelocitySample(long j, float f) {
            this.time = j;
            this.angle = f;
        }
    }

    public PieRadarChartTouchListener(PieRadarChartBase<?> pieRadarChartBase) {
        super(pieRadarChartBase);
    }

    private float calculateVelocity() {
        if (this._velocitySamples.isEmpty()) {
            return Utils.FLOAT_EPSILON;
        }
        boolean z = false;
        AngularVelocitySample angularVelocitySample = this._velocitySamples.get(0);
        ArrayList<AngularVelocitySample> arrayList = this._velocitySamples;
        AngularVelocitySample angularVelocitySample2 = arrayList.get(arrayList.size() - 1);
        AngularVelocitySample angularVelocitySample3 = angularVelocitySample;
        for (int size = this._velocitySamples.size() - 1; size >= 0; size--) {
            angularVelocitySample3 = this._velocitySamples.get(size);
            if (angularVelocitySample3.angle != angularVelocitySample2.angle) {
                break;
            }
        }
        float f = ((float) (angularVelocitySample2.time - angularVelocitySample.time)) / 1000.0f;
        if (f == Utils.FLOAT_EPSILON) {
            f = 0.1f;
        }
        if (angularVelocitySample2.angle >= angularVelocitySample3.angle) {
            z = true;
        }
        if (((double) Math.abs(angularVelocitySample2.angle - angularVelocitySample3.angle)) > 270.0d) {
            z = !z;
        }
        float f2 = angularVelocitySample2.angle;
        float f3 = angularVelocitySample.angle;
        if (((double) (f2 - f3)) > 180.0d) {
            angularVelocitySample.angle = (float) (((double) f3) + 360.0d);
        } else if (((double) (f3 - f2)) > 180.0d) {
            angularVelocitySample2.angle = (float) (((double) f2) + 360.0d);
        }
        float abs = Math.abs((angularVelocitySample2.angle - angularVelocitySample.angle) / f);
        return !z ? -abs : abs;
    }

    private void resetVelocity() {
        this._velocitySamples.clear();
    }

    private void sampleVelocity(float f, float f2) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this._velocitySamples.add(new AngularVelocitySample(currentAnimationTimeMillis, ((PieRadarChartBase) this.mChart).getAngleForPoint(f, f2)));
        for (int size = this._velocitySamples.size(); size - 2 > 0 && currentAnimationTimeMillis - this._velocitySamples.get(0).time > 1000; size--) {
            this._velocitySamples.remove(0);
        }
    }

    public void computeScroll() {
        if (this.mDecelerationAngularVelocity != Utils.FLOAT_EPSILON) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.mDecelerationAngularVelocity *= ((PieRadarChartBase) this.mChart).getDragDecelerationFrictionCoef();
            T t = this.mChart;
            ((PieRadarChartBase) t).setRotationAngle(((PieRadarChartBase) t).getRotationAngle() + (this.mDecelerationAngularVelocity * (((float) (currentAnimationTimeMillis - this.mDecelerationLastTime)) / 1000.0f)));
            this.mDecelerationLastTime = currentAnimationTimeMillis;
            if (((double) Math.abs(this.mDecelerationAngularVelocity)) >= 0.001d) {
                Utils.postInvalidateOnAnimation(this.mChart);
            } else {
                stopDeceleration();
            }
        }
    }

    public void onLongPress(MotionEvent motionEvent) {
        this.mLastGesture = ChartTouchListener.ChartGesture.LONG_PRESS;
        OnChartGestureListener onChartGestureListener = ((PieRadarChartBase) this.mChart).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartLongPressed(motionEvent);
        }
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        this.mLastGesture = ChartTouchListener.ChartGesture.SINGLE_TAP;
        OnChartGestureListener onChartGestureListener = ((PieRadarChartBase) this.mChart).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartSingleTapped(motionEvent);
        }
        if (!((PieRadarChartBase) this.mChart).isHighlightPerTapEnabled()) {
            return false;
        }
        performHighlight(((PieRadarChartBase) this.mChart).getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY()), motionEvent);
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.mGestureDetector.onTouchEvent(motionEvent) && ((PieRadarChartBase) this.mChart).isRotationEnabled()) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    if (((PieRadarChartBase) this.mChart).isDragDecelerationEnabled()) {
                        stopDeceleration();
                        sampleVelocity(x, y);
                        float calculateVelocity = calculateVelocity();
                        this.mDecelerationAngularVelocity = calculateVelocity;
                        if (calculateVelocity != Utils.FLOAT_EPSILON) {
                            this.mDecelerationLastTime = AnimationUtils.currentAnimationTimeMillis();
                            Utils.postInvalidateOnAnimation(this.mChart);
                        }
                    }
                    ((PieRadarChartBase) this.mChart).enableScroll();
                    this.mTouchMode = 0;
                } else if (action == 2) {
                    if (((PieRadarChartBase) this.mChart).isDragDecelerationEnabled()) {
                        sampleVelocity(x, y);
                    }
                    if (this.mTouchMode == 0) {
                        MPPointF mPPointF = this.mTouchStartPoint;
                        if (ChartTouchListener.distance(x, mPPointF.x, y, mPPointF.y) > Utils.convertDpToPixel(8.0f)) {
                            this.mLastGesture = ChartTouchListener.ChartGesture.ROTATE;
                            this.mTouchMode = 6;
                            ((PieRadarChartBase) this.mChart).disableScroll();
                        }
                    }
                    if (this.mTouchMode == 6) {
                        updateGestureRotation(x, y);
                        ((PieRadarChartBase) this.mChart).invalidate();
                    }
                }
                endAction(motionEvent);
            } else {
                startAction(motionEvent);
                stopDeceleration();
                resetVelocity();
                if (((PieRadarChartBase) this.mChart).isDragDecelerationEnabled()) {
                    sampleVelocity(x, y);
                }
                setGestureStartAngle(x, y);
                MPPointF mPPointF2 = this.mTouchStartPoint;
                mPPointF2.x = x;
                mPPointF2.y = y;
            }
        }
        return true;
    }

    public void setGestureStartAngle(float f, float f2) {
        this.mStartAngle = ((PieRadarChartBase) this.mChart).getAngleForPoint(f, f2) - ((PieRadarChartBase) this.mChart).getRawRotationAngle();
    }

    public void stopDeceleration() {
        this.mDecelerationAngularVelocity = Utils.FLOAT_EPSILON;
    }

    public void updateGestureRotation(float f, float f2) {
        T t = this.mChart;
        ((PieRadarChartBase) t).setRotationAngle(((PieRadarChartBase) t).getAngleForPoint(f, f2) - this.mStartAngle);
    }
}
