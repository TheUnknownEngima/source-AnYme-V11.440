package com.github.mikephil.charting.renderer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.lang.ref.WeakReference;
import java.util.List;

public class PieChartRenderer extends DataRenderer {
    protected Canvas mBitmapCanvas;
    private RectF mCenterTextLastBounds = new RectF();
    private CharSequence mCenterTextLastValue;
    private StaticLayout mCenterTextLayout;
    private TextPaint mCenterTextPaint;
    protected PieChart mChart;
    protected WeakReference<Bitmap> mDrawBitmap;
    protected Path mDrawCenterTextPathBuffer = new Path();
    protected RectF mDrawHighlightedRectF = new RectF();
    private Paint mEntryLabelsPaint;
    private Path mHoleCirclePath = new Path();
    protected Paint mHolePaint;
    private RectF mInnerRectBuffer = new RectF();
    private Path mPathBuffer = new Path();
    private RectF[] mRectBuffer = {new RectF(), new RectF(), new RectF()};
    protected Paint mTransparentCirclePaint;
    protected Paint mValueLinePaint;

    public PieChartRenderer(PieChart pieChart, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mChart = pieChart;
        Paint paint = new Paint(1);
        this.mHolePaint = paint;
        paint.setColor(-1);
        this.mHolePaint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.mTransparentCirclePaint = paint2;
        paint2.setColor(-1);
        this.mTransparentCirclePaint.setStyle(Paint.Style.FILL);
        this.mTransparentCirclePaint.setAlpha(105);
        TextPaint textPaint = new TextPaint(1);
        this.mCenterTextPaint = textPaint;
        textPaint.setColor(-16777216);
        this.mCenterTextPaint.setTextSize(Utils.convertDpToPixel(12.0f));
        this.mValuePaint.setTextSize(Utils.convertDpToPixel(13.0f));
        this.mValuePaint.setColor(-1);
        this.mValuePaint.setTextAlign(Paint.Align.CENTER);
        Paint paint3 = new Paint(1);
        this.mEntryLabelsPaint = paint3;
        paint3.setColor(-1);
        this.mEntryLabelsPaint.setTextAlign(Paint.Align.CENTER);
        this.mEntryLabelsPaint.setTextSize(Utils.convertDpToPixel(13.0f));
        Paint paint4 = new Paint(1);
        this.mValueLinePaint = paint4;
        paint4.setStyle(Paint.Style.STROKE);
    }

    /* access modifiers changed from: protected */
    public float calculateMinimumRadiusForSpacedSlice(MPPointF mPPointF, float f, float f2, float f3, float f4, float f5, float f6) {
        MPPointF mPPointF2 = mPPointF;
        double d = (double) ((f5 + f6) * 0.017453292f);
        float cos = mPPointF2.x + (((float) Math.cos(d)) * f);
        float sin = mPPointF2.y + (((float) Math.sin(d)) * f);
        double d2 = (double) ((f5 + (f6 / 2.0f)) * 0.017453292f);
        return (float) (((double) (f - ((float) ((Math.sqrt(Math.pow((double) (cos - f3), 2.0d) + Math.pow((double) (sin - f4), 2.0d)) / 2.0d) * Math.tan(((180.0d - ((double) f2)) / 2.0d) * 0.017453292519943295d))))) - Math.sqrt(Math.pow((double) ((mPPointF2.x + (((float) Math.cos(d2)) * f)) - ((cos + f3) / 2.0f)), 2.0d) + Math.pow((double) ((mPPointF2.y + (((float) Math.sin(d2)) * f)) - ((sin + f4) / 2.0f)), 2.0d)));
    }

    /* access modifiers changed from: protected */
    public void drawCenterText(Canvas canvas) {
        MPPointF mPPointF;
        Canvas canvas2 = canvas;
        CharSequence centerText = this.mChart.getCenterText();
        if (this.mChart.isDrawCenterTextEnabled() && centerText != null) {
            MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
            MPPointF centerTextOffset = this.mChart.getCenterTextOffset();
            float f = centerCircleBox.x + centerTextOffset.x;
            float f2 = centerCircleBox.y + centerTextOffset.y;
            float radius = (!this.mChart.isDrawHoleEnabled() || this.mChart.isDrawSlicesUnderHoleEnabled()) ? this.mChart.getRadius() : this.mChart.getRadius() * (this.mChart.getHoleRadius() / 100.0f);
            RectF[] rectFArr = this.mRectBuffer;
            RectF rectF = rectFArr[0];
            rectF.left = f - radius;
            rectF.top = f2 - radius;
            rectF.right = f + radius;
            rectF.bottom = f2 + radius;
            RectF rectF2 = rectFArr[1];
            rectF2.set(rectF);
            float centerTextRadiusPercent = this.mChart.getCenterTextRadiusPercent() / 100.0f;
            if (((double) centerTextRadiusPercent) > Utils.DOUBLE_EPSILON) {
                rectF2.inset((rectF2.width() - (rectF2.width() * centerTextRadiusPercent)) / 2.0f, (rectF2.height() - (rectF2.height() * centerTextRadiusPercent)) / 2.0f);
            }
            if (!centerText.equals(this.mCenterTextLastValue) || !rectF2.equals(this.mCenterTextLastBounds)) {
                this.mCenterTextLastBounds.set(rectF2);
                this.mCenterTextLastValue = centerText;
                mPPointF = centerTextOffset;
                StaticLayout staticLayout = r3;
                StaticLayout staticLayout2 = new StaticLayout(centerText, 0, centerText.length(), this.mCenterTextPaint, (int) Math.max(Math.ceil((double) this.mCenterTextLastBounds.width()), 1.0d), Layout.Alignment.ALIGN_CENTER, 1.0f, Utils.FLOAT_EPSILON, false);
                this.mCenterTextLayout = staticLayout;
            } else {
                mPPointF = centerTextOffset;
            }
            float height = (float) this.mCenterTextLayout.getHeight();
            canvas.save();
            if (Build.VERSION.SDK_INT >= 18) {
                Path path = this.mDrawCenterTextPathBuffer;
                path.reset();
                path.addOval(rectF, Path.Direction.CW);
                canvas2.clipPath(path);
            }
            canvas2.translate(rectF2.left, rectF2.top + ((rectF2.height() - height) / 2.0f));
            this.mCenterTextLayout.draw(canvas2);
            canvas.restore();
            MPPointF.recycleInstance(centerCircleBox);
            MPPointF.recycleInstance(mPPointF);
        }
    }

    public void drawData(Canvas canvas) {
        int chartWidth = (int) this.mViewPortHandler.getChartWidth();
        int chartHeight = (int) this.mViewPortHandler.getChartHeight();
        WeakReference<Bitmap> weakReference = this.mDrawBitmap;
        Bitmap bitmap = weakReference == null ? null : (Bitmap) weakReference.get();
        if (!(bitmap != null && bitmap.getWidth() == chartWidth && bitmap.getHeight() == chartHeight)) {
            if (chartWidth > 0 && chartHeight > 0) {
                bitmap = Bitmap.createBitmap(chartWidth, chartHeight, Bitmap.Config.ARGB_4444);
                this.mDrawBitmap = new WeakReference<>(bitmap);
                this.mBitmapCanvas = new Canvas(bitmap);
            } else {
                return;
            }
        }
        bitmap.eraseColor(0);
        for (IPieDataSet iPieDataSet : ((PieData) this.mChart.getData()).getDataSets()) {
            if (iPieDataSet.isVisible() && iPieDataSet.getEntryCount() > 0) {
                drawDataSet(canvas, iPieDataSet);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawDataSet(Canvas canvas, IPieDataSet iPieDataSet) {
        float f;
        float f2;
        float f3;
        float[] fArr;
        int i;
        int i2;
        RectF rectF;
        float f4;
        int i3;
        MPPointF mPPointF;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        RectF rectF2;
        int i4;
        int i5;
        float f10;
        MPPointF mPPointF2;
        int i6;
        PieChartRenderer pieChartRenderer = this;
        IPieDataSet iPieDataSet2 = iPieDataSet;
        float rotationAngle = pieChartRenderer.mChart.getRotationAngle();
        float phaseX = pieChartRenderer.mAnimator.getPhaseX();
        float phaseY = pieChartRenderer.mAnimator.getPhaseY();
        RectF circleBox = pieChartRenderer.mChart.getCircleBox();
        int entryCount = iPieDataSet.getEntryCount();
        float[] drawAngles = pieChartRenderer.mChart.getDrawAngles();
        MPPointF centerCircleBox = pieChartRenderer.mChart.getCenterCircleBox();
        float radius = pieChartRenderer.mChart.getRadius();
        boolean z = pieChartRenderer.mChart.isDrawHoleEnabled() && !pieChartRenderer.mChart.isDrawSlicesUnderHoleEnabled();
        float holeRadius = z ? (pieChartRenderer.mChart.getHoleRadius() / 100.0f) * radius : Utils.FLOAT_EPSILON;
        int i7 = 0;
        for (int i8 = 0; i8 < entryCount; i8++) {
            if (Math.abs(((PieEntry) iPieDataSet2.getEntryForIndex(i8)).getY()) > Utils.FLOAT_EPSILON) {
                i7++;
            }
        }
        float sliceSpace = i7 <= 1 ? Utils.FLOAT_EPSILON : pieChartRenderer.getSliceSpace(iPieDataSet2);
        int i9 = 0;
        float f11 = Utils.FLOAT_EPSILON;
        while (i9 < entryCount) {
            float f12 = drawAngles[i9];
            if (Math.abs(iPieDataSet2.getEntryForIndex(i9).getY()) <= Utils.FLOAT_EPSILON || pieChartRenderer.mChart.needsHighlight(i9)) {
                i2 = i9;
                f2 = radius;
                f = rotationAngle;
                f3 = phaseX;
                rectF = circleBox;
                i = entryCount;
                fArr = drawAngles;
                i3 = i7;
                f4 = holeRadius;
                mPPointF = centerCircleBox;
            } else {
                boolean z2 = sliceSpace > Utils.FLOAT_EPSILON && f12 <= 180.0f;
                pieChartRenderer.mRenderPaint.setColor(iPieDataSet2.getColor(i9));
                float f13 = i7 == 1 ? Utils.FLOAT_EPSILON : sliceSpace / (radius * 0.017453292f);
                float f14 = rotationAngle + ((f11 + (f13 / 2.0f)) * phaseY);
                float f15 = (f12 - f13) * phaseY;
                if (f15 < Utils.FLOAT_EPSILON) {
                    f15 = Utils.FLOAT_EPSILON;
                }
                pieChartRenderer.mPathBuffer.reset();
                int i10 = i9;
                int i11 = i7;
                double d = (double) (f14 * 0.017453292f);
                i = entryCount;
                fArr = drawAngles;
                float cos = centerCircleBox.x + (((float) Math.cos(d)) * radius);
                float sin = centerCircleBox.y + (((float) Math.sin(d)) * radius);
                int i12 = (f15 > 360.0f ? 1 : (f15 == 360.0f ? 0 : -1));
                if (i12 < 0 || f15 % 360.0f > Utils.FLOAT_EPSILON) {
                    f3 = phaseX;
                    pieChartRenderer.mPathBuffer.moveTo(cos, sin);
                    pieChartRenderer.mPathBuffer.arcTo(circleBox, f14, f15);
                } else {
                    f3 = phaseX;
                    pieChartRenderer.mPathBuffer.addCircle(centerCircleBox.x, centerCircleBox.y, radius, Path.Direction.CW);
                }
                RectF rectF3 = pieChartRenderer.mInnerRectBuffer;
                float f16 = centerCircleBox.x;
                float f17 = centerCircleBox.y;
                float f18 = f15;
                rectF3.set(f16 - holeRadius, f17 - holeRadius, f16 + holeRadius, f17 + holeRadius);
                if (!z) {
                    f7 = holeRadius;
                    f8 = rotationAngle;
                    f5 = f18;
                    f9 = radius;
                    mPPointF = centerCircleBox;
                    int i13 = i10;
                    rectF2 = circleBox;
                    i4 = i11;
                    i5 = i13;
                    f6 = 360.0f;
                } else if (holeRadius > Utils.FLOAT_EPSILON || z2) {
                    if (z2) {
                        f10 = f18;
                        int i14 = i10;
                        float f19 = radius;
                        rectF = circleBox;
                        i3 = i11;
                        i2 = i14;
                        f4 = holeRadius;
                        i6 = 1;
                        f2 = radius;
                        float f20 = f14;
                        mPPointF2 = centerCircleBox;
                        float calculateMinimumRadiusForSpacedSlice = calculateMinimumRadiusForSpacedSlice(centerCircleBox, f19, f12 * phaseY, cos, sin, f20, f10);
                        if (calculateMinimumRadiusForSpacedSlice < Utils.FLOAT_EPSILON) {
                            calculateMinimumRadiusForSpacedSlice = -calculateMinimumRadiusForSpacedSlice;
                        }
                        holeRadius = Math.max(f4, calculateMinimumRadiusForSpacedSlice);
                    } else {
                        f4 = holeRadius;
                        mPPointF2 = centerCircleBox;
                        f10 = f18;
                        i6 = 1;
                        f2 = radius;
                        int i15 = i10;
                        rectF = circleBox;
                        i3 = i11;
                        i2 = i15;
                    }
                    float f21 = (i3 == i6 || holeRadius == Utils.FLOAT_EPSILON) ? Utils.FLOAT_EPSILON : sliceSpace / (holeRadius * 0.017453292f);
                    float f22 = ((f11 + (f21 / 2.0f)) * phaseY) + rotationAngle;
                    float f23 = (f12 - f21) * phaseY;
                    if (f23 < Utils.FLOAT_EPSILON) {
                        f23 = Utils.FLOAT_EPSILON;
                    }
                    float f24 = f22 + f23;
                    if (i12 < 0 || f10 % 360.0f > Utils.FLOAT_EPSILON) {
                        pieChartRenderer = this;
                        double d2 = (double) (f24 * 0.017453292f);
                        f = rotationAngle;
                        pieChartRenderer.mPathBuffer.lineTo(mPPointF2.x + (((float) Math.cos(d2)) * holeRadius), mPPointF2.y + (holeRadius * ((float) Math.sin(d2))));
                        pieChartRenderer.mPathBuffer.arcTo(pieChartRenderer.mInnerRectBuffer, f24, -f23);
                    } else {
                        pieChartRenderer = this;
                        pieChartRenderer.mPathBuffer.addCircle(mPPointF2.x, mPPointF2.y, holeRadius, Path.Direction.CCW);
                        f = rotationAngle;
                    }
                    mPPointF = mPPointF2;
                    pieChartRenderer.mPathBuffer.close();
                    pieChartRenderer.mBitmapCanvas.drawPath(pieChartRenderer.mPathBuffer, pieChartRenderer.mRenderPaint);
                } else {
                    f7 = holeRadius;
                    f8 = rotationAngle;
                    f5 = f18;
                    f6 = 360.0f;
                    f9 = radius;
                    mPPointF = centerCircleBox;
                    int i16 = i10;
                    rectF2 = circleBox;
                    i4 = i11;
                    i5 = i16;
                }
                if (f5 % f6 > Utils.FLOAT_EPSILON) {
                    if (z2) {
                        float calculateMinimumRadiusForSpacedSlice2 = calculateMinimumRadiusForSpacedSlice(mPPointF, f2, f12 * phaseY, cos, sin, f14, f5);
                        double d3 = (double) ((f14 + (f5 / 2.0f)) * 0.017453292f);
                        pieChartRenderer.mPathBuffer.lineTo(mPPointF.x + (((float) Math.cos(d3)) * calculateMinimumRadiusForSpacedSlice2), mPPointF.y + (calculateMinimumRadiusForSpacedSlice2 * ((float) Math.sin(d3))));
                    } else {
                        pieChartRenderer.mPathBuffer.lineTo(mPPointF.x, mPPointF.y);
                    }
                }
                pieChartRenderer.mPathBuffer.close();
                pieChartRenderer.mBitmapCanvas.drawPath(pieChartRenderer.mPathBuffer, pieChartRenderer.mRenderPaint);
            }
            f11 += f12 * f3;
            i9 = i2 + 1;
            iPieDataSet2 = iPieDataSet;
            centerCircleBox = mPPointF;
            i7 = i3;
            holeRadius = f4;
            circleBox = rectF;
            entryCount = i;
            drawAngles = fArr;
            phaseX = f3;
            radius = f2;
            rotationAngle = f;
        }
        MPPointF.recycleInstance(centerCircleBox);
    }

    /* access modifiers changed from: protected */
    public void drawEntryLabel(Canvas canvas, String str, float f, float f2) {
        canvas.drawText(str, f, f2, this.mEntryLabelsPaint);
    }

    public void drawExtras(Canvas canvas) {
        drawHole(canvas);
        canvas.drawBitmap((Bitmap) this.mDrawBitmap.get(), Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (Paint) null);
        drawCenterText(canvas);
    }

    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        RectF rectF;
        float[] fArr;
        float[] fArr2;
        float f;
        int i;
        float f2;
        IPieDataSet dataSetByIndex;
        float f3;
        int i2;
        float f4;
        float f5;
        float f6;
        int i3;
        int i4;
        float f7;
        float f8;
        Highlight[] highlightArr2 = highlightArr;
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        float rotationAngle = this.mChart.getRotationAngle();
        float[] drawAngles = this.mChart.getDrawAngles();
        float[] absoluteAngles = this.mChart.getAbsoluteAngles();
        MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
        float radius = this.mChart.getRadius();
        boolean z = this.mChart.isDrawHoleEnabled() && !this.mChart.isDrawSlicesUnderHoleEnabled();
        float holeRadius = z ? (this.mChart.getHoleRadius() / 100.0f) * radius : Utils.FLOAT_EPSILON;
        RectF rectF2 = this.mDrawHighlightedRectF;
        rectF2.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
        int i5 = 0;
        while (i5 < highlightArr2.length) {
            int x = (int) highlightArr2[i5].getX();
            if (x < drawAngles.length && (dataSetByIndex = ((PieData) this.mChart.getData()).getDataSetByIndex(highlightArr2[i5].getDataSetIndex())) != null && dataSetByIndex.isHighlightEnabled()) {
                int entryCount = dataSetByIndex.getEntryCount();
                int i6 = 0;
                for (int i7 = 0; i7 < entryCount; i7++) {
                    if (Math.abs(((PieEntry) dataSetByIndex.getEntryForIndex(i7)).getY()) > Utils.FLOAT_EPSILON) {
                        i6++;
                    }
                }
                if (x == 0) {
                    i2 = 1;
                    f3 = Utils.FLOAT_EPSILON;
                } else {
                    f3 = absoluteAngles[x - 1] * phaseX;
                    i2 = 1;
                }
                float sliceSpace = i6 <= i2 ? Utils.FLOAT_EPSILON : dataSetByIndex.getSliceSpace();
                float f9 = drawAngles[x];
                float selectionShift = dataSetByIndex.getSelectionShift();
                float f10 = radius + selectionShift;
                int i8 = i5;
                rectF2.set(this.mChart.getCircleBox());
                float f11 = -selectionShift;
                rectF2.inset(f11, f11);
                boolean z2 = sliceSpace > Utils.FLOAT_EPSILON && f9 <= 180.0f;
                this.mRenderPaint.setColor(dataSetByIndex.getColor(x));
                float f12 = i6 == 1 ? Utils.FLOAT_EPSILON : sliceSpace / (radius * 0.017453292f);
                float f13 = i6 == 1 ? Utils.FLOAT_EPSILON : sliceSpace / (f10 * 0.017453292f);
                float f14 = rotationAngle + ((f3 + (f12 / 2.0f)) * phaseY);
                float f15 = (f9 - f12) * phaseY;
                float f16 = f15 < Utils.FLOAT_EPSILON ? Utils.FLOAT_EPSILON : f15;
                float f17 = ((f3 + (f13 / 2.0f)) * phaseY) + rotationAngle;
                float f18 = (f9 - f13) * phaseY;
                if (f18 < Utils.FLOAT_EPSILON) {
                    f18 = Utils.FLOAT_EPSILON;
                }
                this.mPathBuffer.reset();
                int i9 = (f16 > 360.0f ? 1 : (f16 == 360.0f ? 0 : -1));
                if (i9 < 0 || f16 % 360.0f > Utils.FLOAT_EPSILON) {
                    f4 = holeRadius;
                    f = phaseX;
                    double d = (double) (f17 * 0.017453292f);
                    fArr2 = drawAngles;
                    fArr = absoluteAngles;
                    this.mPathBuffer.moveTo(centerCircleBox.x + (((float) Math.cos(d)) * f10), centerCircleBox.y + (f10 * ((float) Math.sin(d))));
                    this.mPathBuffer.arcTo(rectF2, f17, f18);
                } else {
                    this.mPathBuffer.addCircle(centerCircleBox.x, centerCircleBox.y, f10, Path.Direction.CW);
                    f4 = holeRadius;
                    f = phaseX;
                    fArr2 = drawAngles;
                    fArr = absoluteAngles;
                }
                if (z2) {
                    double d2 = (double) (f14 * 0.017453292f);
                    float cos = (((float) Math.cos(d2)) * radius) + centerCircleBox.x;
                    float sin = centerCircleBox.y + (((float) Math.sin(d2)) * radius);
                    i = i8;
                    f6 = f4;
                    f5 = Utils.FLOAT_EPSILON;
                    i4 = i6;
                    rectF = rectF2;
                    i3 = 1;
                    f7 = calculateMinimumRadiusForSpacedSlice(centerCircleBox, radius, f9 * phaseY, cos, sin, f14, f16);
                } else {
                    f6 = f4;
                    rectF = rectF2;
                    i4 = i6;
                    i = i8;
                    i3 = 1;
                    f5 = Utils.FLOAT_EPSILON;
                    f7 = Utils.FLOAT_EPSILON;
                }
                RectF rectF3 = this.mInnerRectBuffer;
                float f19 = centerCircleBox.x;
                float f20 = centerCircleBox.y;
                rectF3.set(f19 - f6, f20 - f6, f19 + f6, f20 + f6);
                if (!z || (f6 <= f5 && !z2)) {
                    f2 = f6;
                    if (f16 % 360.0f > Utils.FLOAT_EPSILON) {
                        if (z2) {
                            double d3 = (double) ((f14 + (f16 / 2.0f)) * 0.017453292f);
                            this.mPathBuffer.lineTo(centerCircleBox.x + (((float) Math.cos(d3)) * f7), centerCircleBox.y + (f7 * ((float) Math.sin(d3))));
                        } else {
                            this.mPathBuffer.lineTo(centerCircleBox.x, centerCircleBox.y);
                        }
                    }
                } else {
                    if (z2) {
                        if (f7 < f5) {
                            f7 = -f7;
                        }
                        f8 = Math.max(f6, f7);
                    } else {
                        f8 = f6;
                    }
                    float f21 = (i4 == i3 || f8 == f5) ? Utils.FLOAT_EPSILON : sliceSpace / (f8 * 0.017453292f);
                    float f22 = rotationAngle + ((f3 + (f21 / 2.0f)) * phaseY);
                    float f23 = (f9 - f21) * phaseY;
                    if (f23 < f5) {
                        f23 = Utils.FLOAT_EPSILON;
                    }
                    float f24 = f22 + f23;
                    if (i9 < 0 || f16 % 360.0f > Utils.FLOAT_EPSILON) {
                        double d4 = (double) (f24 * 0.017453292f);
                        f2 = f6;
                        this.mPathBuffer.lineTo(centerCircleBox.x + (((float) Math.cos(d4)) * f8), centerCircleBox.y + (f8 * ((float) Math.sin(d4))));
                        this.mPathBuffer.arcTo(this.mInnerRectBuffer, f24, -f23);
                    } else {
                        this.mPathBuffer.addCircle(centerCircleBox.x, centerCircleBox.y, f8, Path.Direction.CCW);
                        f2 = f6;
                    }
                }
                this.mPathBuffer.close();
                this.mBitmapCanvas.drawPath(this.mPathBuffer, this.mRenderPaint);
            } else {
                i = i5;
                rectF = rectF2;
                f2 = holeRadius;
                f = phaseX;
                fArr2 = drawAngles;
                fArr = absoluteAngles;
            }
            i5 = i + 1;
            rectF2 = rectF;
            highlightArr2 = highlightArr;
            holeRadius = f2;
            phaseX = f;
            drawAngles = fArr2;
            absoluteAngles = fArr;
        }
        MPPointF.recycleInstance(centerCircleBox);
    }

    /* access modifiers changed from: protected */
    public void drawHole(Canvas canvas) {
        if (this.mChart.isDrawHoleEnabled() && this.mBitmapCanvas != null) {
            float radius = this.mChart.getRadius();
            float holeRadius = (this.mChart.getHoleRadius() / 100.0f) * radius;
            MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
            if (Color.alpha(this.mHolePaint.getColor()) > 0) {
                this.mBitmapCanvas.drawCircle(centerCircleBox.x, centerCircleBox.y, holeRadius, this.mHolePaint);
            }
            if (Color.alpha(this.mTransparentCirclePaint.getColor()) > 0 && this.mChart.getTransparentCircleRadius() > this.mChart.getHoleRadius()) {
                int alpha = this.mTransparentCirclePaint.getAlpha();
                float transparentCircleRadius = radius * (this.mChart.getTransparentCircleRadius() / 100.0f);
                this.mTransparentCirclePaint.setAlpha((int) (((float) alpha) * this.mAnimator.getPhaseX() * this.mAnimator.getPhaseY()));
                this.mHoleCirclePath.reset();
                this.mHoleCirclePath.addCircle(centerCircleBox.x, centerCircleBox.y, transparentCircleRadius, Path.Direction.CW);
                this.mHoleCirclePath.addCircle(centerCircleBox.x, centerCircleBox.y, holeRadius, Path.Direction.CCW);
                this.mBitmapCanvas.drawPath(this.mHoleCirclePath, this.mTransparentCirclePaint);
                this.mTransparentCirclePaint.setAlpha(alpha);
            }
            MPPointF.recycleInstance(centerCircleBox);
        }
    }

    /* access modifiers changed from: protected */
    public void drawRoundedSlices(Canvas canvas) {
        float f;
        float f2;
        float[] fArr;
        if (this.mChart.isDrawRoundedSlicesEnabled()) {
            IPieDataSet dataSet = ((PieData) this.mChart.getData()).getDataSet();
            if (dataSet.isVisible()) {
                float phaseX = this.mAnimator.getPhaseX();
                float phaseY = this.mAnimator.getPhaseY();
                MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
                float radius = this.mChart.getRadius();
                float holeRadius = (radius - ((this.mChart.getHoleRadius() * radius) / 100.0f)) / 2.0f;
                float[] drawAngles = this.mChart.getDrawAngles();
                float rotationAngle = this.mChart.getRotationAngle();
                int i = 0;
                while (i < dataSet.getEntryCount()) {
                    float f3 = drawAngles[i];
                    if (Math.abs(dataSet.getEntryForIndex(i).getY()) > Utils.FLOAT_EPSILON) {
                        double d = (double) (radius - holeRadius);
                        double d2 = (double) ((rotationAngle + f3) * phaseY);
                        f = phaseY;
                        fArr = drawAngles;
                        f2 = rotationAngle;
                        float cos = (float) (((double) centerCircleBox.x) + (Math.cos(Math.toRadians(d2)) * d));
                        float sin = (float) ((d * Math.sin(Math.toRadians(d2))) + ((double) centerCircleBox.y));
                        this.mRenderPaint.setColor(dataSet.getColor(i));
                        this.mBitmapCanvas.drawCircle(cos, sin, holeRadius, this.mRenderPaint);
                    } else {
                        f = phaseY;
                        fArr = drawAngles;
                        f2 = rotationAngle;
                    }
                    rotationAngle = f2 + (f3 * phaseX);
                    i++;
                    phaseY = f;
                    drawAngles = fArr;
                }
                MPPointF.recycleInstance(centerCircleBox);
            }
        }
    }

    public void drawValues(Canvas canvas) {
        float f;
        List list;
        float[] fArr;
        float[] fArr2;
        float f2;
        int i;
        float f3;
        PieDataSet.ValuePosition valuePosition;
        List list2;
        float f4;
        IPieDataSet iPieDataSet;
        int i2;
        float f5;
        MPPointF mPPointF;
        float f6;
        float f7;
        String str;
        float f8;
        float f9;
        float f10;
        float f11;
        IPieDataSet iPieDataSet2;
        float f12;
        float f13;
        String str2;
        Canvas canvas2 = canvas;
        MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
        float radius = this.mChart.getRadius();
        float rotationAngle = this.mChart.getRotationAngle();
        float[] drawAngles = this.mChart.getDrawAngles();
        float[] absoluteAngles = this.mChart.getAbsoluteAngles();
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        float holeRadius = this.mChart.getHoleRadius() / 100.0f;
        float f14 = (radius / 10.0f) * 3.6f;
        if (this.mChart.isDrawHoleEnabled()) {
            f14 = (radius - (radius * holeRadius)) / 2.0f;
        }
        float f15 = radius - f14;
        PieData pieData = (PieData) this.mChart.getData();
        List dataSets = pieData.getDataSets();
        float yValueSum = pieData.getYValueSum();
        boolean isDrawEntryLabelsEnabled = this.mChart.isDrawEntryLabelsEnabled();
        canvas.save();
        float convertDpToPixel = Utils.convertDpToPixel(5.0f);
        int i3 = 0;
        int i4 = 0;
        while (i4 < dataSets.size()) {
            IPieDataSet iPieDataSet3 = (IPieDataSet) dataSets.get(i4);
            boolean isDrawValuesEnabled = iPieDataSet3.isDrawValuesEnabled();
            if (isDrawValuesEnabled || isDrawEntryLabelsEnabled) {
                PieDataSet.ValuePosition xValuePosition = iPieDataSet3.getXValuePosition();
                PieDataSet.ValuePosition yValuePosition = iPieDataSet3.getYValuePosition();
                applyValueTextStyle(iPieDataSet3);
                float calcTextHeight = ((float) Utils.calcTextHeight(this.mValuePaint, "Q")) + Utils.convertDpToPixel(4.0f);
                IValueFormatter valueFormatter = iPieDataSet3.getValueFormatter();
                int entryCount = iPieDataSet3.getEntryCount();
                this.mValueLinePaint.setColor(iPieDataSet3.getValueLineColor());
                this.mValueLinePaint.setStrokeWidth(Utils.convertDpToPixel(iPieDataSet3.getValueLineWidth()));
                float sliceSpace = getSliceSpace(iPieDataSet3);
                MPPointF instance = MPPointF.getInstance(iPieDataSet3.getIconsOffset());
                instance.x = Utils.convertDpToPixel(instance.x);
                instance.y = Utils.convertDpToPixel(instance.y);
                int i5 = i3;
                int i6 = 0;
                while (i6 < entryCount) {
                    PieEntry pieEntry = (PieEntry) iPieDataSet3.getEntryForIndex(i6);
                    float f16 = (((i5 == 0 ? Utils.FLOAT_EPSILON : absoluteAngles[i5 - 1] * phaseX) + ((drawAngles[i5] - ((sliceSpace / (f15 * 0.017453292f)) / 2.0f)) / 2.0f)) * phaseY) + rotationAngle;
                    MPPointF mPPointF2 = instance;
                    float y = this.mChart.isUsePercentValuesEnabled() ? (pieEntry.getY() / yValueSum) * 100.0f : pieEntry.getY();
                    int i7 = entryCount;
                    double d = (double) (f16 * 0.017453292f);
                    int i8 = i4;
                    List list3 = dataSets;
                    float cos = (float) Math.cos(d);
                    float f17 = rotationAngle;
                    float[] fArr3 = drawAngles;
                    float sin = (float) Math.sin(d);
                    boolean z = isDrawEntryLabelsEnabled && xValuePosition == PieDataSet.ValuePosition.OUTSIDE_SLICE;
                    boolean z2 = isDrawValuesEnabled && yValuePosition == PieDataSet.ValuePosition.OUTSIDE_SLICE;
                    float[] fArr4 = absoluteAngles;
                    boolean z3 = isDrawEntryLabelsEnabled && xValuePosition == PieDataSet.ValuePosition.INSIDE_SLICE;
                    PieDataSet.ValuePosition valuePosition2 = xValuePosition;
                    boolean z4 = isDrawValuesEnabled && yValuePosition == PieDataSet.ValuePosition.INSIDE_SLICE;
                    if (z || z2) {
                        float valueLinePart1Length = iPieDataSet3.getValueLinePart1Length();
                        float valueLinePart2Length = iPieDataSet3.getValueLinePart2Length();
                        float valueLinePart1OffsetPercentage = iPieDataSet3.getValueLinePart1OffsetPercentage() / 100.0f;
                        PieDataSet.ValuePosition valuePosition3 = yValuePosition;
                        if (this.mChart.isDrawHoleEnabled()) {
                            float f18 = radius * holeRadius;
                            f8 = ((radius - f18) * valueLinePart1OffsetPercentage) + f18;
                        } else {
                            f8 = radius * valueLinePart1OffsetPercentage;
                        }
                        float f19 = valueLinePart2Length * f15;
                        if (iPieDataSet3.isValueLineVariableLength()) {
                            f19 *= (float) Math.abs(Math.sin(d));
                        }
                        float f20 = centerCircleBox.x;
                        float f21 = (f8 * cos) + f20;
                        float f22 = centerCircleBox.y;
                        float f23 = (f8 * sin) + f22;
                        float f24 = (valueLinePart1Length + 1.0f) * f15;
                        float f25 = (f24 * cos) + f20;
                        float f26 = (f24 * sin) + f22;
                        double d2 = ((double) f16) % 360.0d;
                        if (d2 < 90.0d || d2 > 270.0d) {
                            f9 = f25 + f19;
                            this.mValuePaint.setTextAlign(Paint.Align.LEFT);
                            if (z) {
                                this.mEntryLabelsPaint.setTextAlign(Paint.Align.LEFT);
                            }
                            f10 = f9 + convertDpToPixel;
                        } else {
                            float f27 = f25 - f19;
                            this.mValuePaint.setTextAlign(Paint.Align.RIGHT);
                            if (z) {
                                this.mEntryLabelsPaint.setTextAlign(Paint.Align.RIGHT);
                            }
                            f9 = f27;
                            f10 = f27 - convertDpToPixel;
                        }
                        if (iPieDataSet3.getValueLineColor() != 1122867) {
                            if (iPieDataSet3.isUsingSliceColorAsValueLineColor()) {
                                this.mValueLinePaint.setColor(iPieDataSet3.getColor(i6));
                            }
                            Canvas canvas3 = canvas;
                            f3 = radius;
                            MPPointF mPPointF3 = mPPointF2;
                            i2 = i6;
                            valuePosition = valuePosition3;
                            float f28 = f26;
                            f11 = f10;
                            canvas3.drawLine(f21, f23, f25, f28, this.mValueLinePaint);
                            canvas3.drawLine(f25, f26, f9, f28, this.mValueLinePaint);
                        } else {
                            f11 = f10;
                            f3 = radius;
                            valuePosition = valuePosition3;
                            i2 = i6;
                        }
                        if (!z || !z2) {
                            iPieDataSet2 = iPieDataSet3;
                            list2 = list3;
                            f12 = f11;
                            f4 = cos;
                            if (z) {
                                if (i2 < pieData.getEntryCount() && pieEntry.getLabel() != null) {
                                    str2 = pieEntry.getLabel();
                                    f13 = f26 + (calcTextHeight / 2.0f);
                                }
                            } else if (z2) {
                                iPieDataSet = iPieDataSet2;
                                drawValue(canvas, valueFormatter, y, pieEntry, 0, f12, f26 + (calcTextHeight / 2.0f), iPieDataSet.getValueTextColor(i2));
                            }
                            iPieDataSet = iPieDataSet2;
                        } else {
                            iPieDataSet2 = iPieDataSet3;
                            list2 = list3;
                            f4 = cos;
                            drawValue(canvas, valueFormatter, y, pieEntry, 0, f11, f26, iPieDataSet3.getValueTextColor(i2));
                            if (i2 < pieData.getEntryCount() && pieEntry.getLabel() != null) {
                                str2 = pieEntry.getLabel();
                                f13 = f26 + calcTextHeight;
                                f12 = f11;
                            }
                            iPieDataSet = iPieDataSet2;
                        }
                        drawEntryLabel(canvas2, str2, f12, f13);
                        iPieDataSet = iPieDataSet2;
                    } else {
                        valuePosition = yValuePosition;
                        iPieDataSet = iPieDataSet3;
                        f3 = radius;
                        list2 = list3;
                        i2 = i6;
                        f4 = cos;
                    }
                    if (z3 || z4) {
                        float f29 = (f15 * f4) + centerCircleBox.x;
                        float f30 = (f15 * sin) + centerCircleBox.y;
                        this.mValuePaint.setTextAlign(Paint.Align.CENTER);
                        if (!z3 || !z4) {
                            f5 = sin;
                            f6 = f29;
                            if (z3) {
                                if (i2 < pieData.getEntryCount() && pieEntry.getLabel() != null) {
                                    str = pieEntry.getLabel();
                                    f7 = f30 + (calcTextHeight / 2.0f);
                                }
                            } else if (z4) {
                                drawValue(canvas, valueFormatter, y, pieEntry, 0, f6, f30 + (calcTextHeight / 2.0f), iPieDataSet.getValueTextColor(i2));
                            }
                        } else {
                            f5 = sin;
                            f6 = f29;
                            drawValue(canvas, valueFormatter, y, pieEntry, 0, f29, f30, iPieDataSet.getValueTextColor(i2));
                            if (i2 < pieData.getEntryCount() && pieEntry.getLabel() != null) {
                                str = pieEntry.getLabel();
                                f7 = f30 + calcTextHeight;
                            }
                        }
                        drawEntryLabel(canvas2, str, f6, f7);
                    } else {
                        f5 = sin;
                    }
                    if (pieEntry.getIcon() == null || !iPieDataSet.isDrawIconsEnabled()) {
                        mPPointF = mPPointF2;
                    } else {
                        Drawable icon = pieEntry.getIcon();
                        mPPointF = mPPointF2;
                        float f31 = mPPointF.y;
                        Utils.drawImage(canvas, icon, (int) (((f15 + f31) * f4) + centerCircleBox.x), (int) (((f15 + f31) * f5) + centerCircleBox.y + mPPointF.x), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                    }
                    i5++;
                    i6 = i2 + 1;
                    instance = mPPointF;
                    iPieDataSet3 = iPieDataSet;
                    entryCount = i7;
                    i4 = i8;
                    rotationAngle = f17;
                    drawAngles = fArr3;
                    absoluteAngles = fArr4;
                    xValuePosition = valuePosition2;
                    dataSets = list2;
                    yValuePosition = valuePosition;
                    radius = f3;
                }
                i = i4;
                list = dataSets;
                f = radius;
                f2 = rotationAngle;
                fArr2 = drawAngles;
                fArr = absoluteAngles;
                MPPointF.recycleInstance(instance);
                i3 = i5;
            } else {
                i = i4;
                list = dataSets;
                f = radius;
                f2 = rotationAngle;
                fArr2 = drawAngles;
                fArr = absoluteAngles;
            }
            i4 = i + 1;
            rotationAngle = f2;
            drawAngles = fArr2;
            absoluteAngles = fArr;
            dataSets = list;
            radius = f;
        }
        MPPointF.recycleInstance(centerCircleBox);
        canvas.restore();
    }

    public TextPaint getPaintCenterText() {
        return this.mCenterTextPaint;
    }

    public Paint getPaintEntryLabels() {
        return this.mEntryLabelsPaint;
    }

    public Paint getPaintHole() {
        return this.mHolePaint;
    }

    public Paint getPaintTransparentCircle() {
        return this.mTransparentCirclePaint;
    }

    /* access modifiers changed from: protected */
    public float getSliceSpace(IPieDataSet iPieDataSet) {
        return !iPieDataSet.isAutomaticallyDisableSliceSpacingEnabled() ? iPieDataSet.getSliceSpace() : iPieDataSet.getSliceSpace() / this.mViewPortHandler.getSmallestContentExtension() > (iPieDataSet.getYMin() / ((PieData) this.mChart.getData()).getYValueSum()) * 2.0f ? Utils.FLOAT_EPSILON : iPieDataSet.getSliceSpace();
    }

    public void initBuffers() {
    }

    public void releaseBitmap() {
        Canvas canvas = this.mBitmapCanvas;
        if (canvas != null) {
            canvas.setBitmap((Bitmap) null);
            this.mBitmapCanvas = null;
        }
        WeakReference<Bitmap> weakReference = this.mDrawBitmap;
        if (weakReference != null) {
            Bitmap bitmap = (Bitmap) weakReference.get();
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.mDrawBitmap.clear();
            this.mDrawBitmap = null;
        }
    }
}
