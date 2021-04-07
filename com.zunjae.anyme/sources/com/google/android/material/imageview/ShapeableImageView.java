package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;

public class ShapeableImageView extends AppCompatImageView implements za1 {
    private static final int q = R$style.Widget_MaterialComponents_ShapeableImageView;
    private final xa1 g;
    /* access modifiers changed from: private */
    public final RectF h;
    private final RectF i;
    private final Paint j;
    private final Paint k;
    private final Path l;
    private ColorStateList m;
    /* access modifiers changed from: private */
    public wa1 n;
    private float o;
    private Path p;

    @TargetApi(21)
    class a extends ViewOutlineProvider {
        private Rect a = new Rect();

        a() {
        }

        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.n != null && ShapeableImageView.this.n.u(ShapeableImageView.this.h)) {
                ShapeableImageView.this.h.round(this.a);
                outline.setRoundRect(this.a, ShapeableImageView.this.n.j().a(ShapeableImageView.this.h));
            }
        }
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet, int i2) {
        super(bb1.c(context, attributeSet, i2, q), attributeSet, i2);
        this.g = new xa1();
        this.l = new Path();
        Context context2 = getContext();
        Paint paint = new Paint();
        this.k = paint;
        paint.setAntiAlias(true);
        this.k.setColor(-1);
        this.k.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.h = new RectF();
        this.i = new RectF();
        this.p = new Path();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R$styleable.ShapeableImageView, i2, q);
        this.m = ca1.a(context2, obtainStyledAttributes, R$styleable.ShapeableImageView_strokeColor);
        this.o = (float) obtainStyledAttributes.getDimensionPixelSize(R$styleable.ShapeableImageView_strokeWidth, 0);
        Paint paint2 = new Paint();
        this.j = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.j.setAntiAlias(true);
        this.n = wa1.e(context2, attributeSet, i2, q).m();
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new a());
        }
    }

    private void e(Canvas canvas) {
        if (this.m != null) {
            this.j.setStrokeWidth(this.o);
            int colorForState = this.m.getColorForState(getDrawableState(), this.m.getDefaultColor());
            if (this.o > Utils.FLOAT_EPSILON && colorForState != 0) {
                this.j.setColor(colorForState);
                canvas.drawPath(this.l, this.j);
            }
        }
    }

    private void f(int i2, int i3) {
        this.h.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (i2 - getPaddingRight()), (float) (i3 - getPaddingBottom()));
        this.g.d(this.n, 1.0f, this.h, this.l);
        this.p.rewind();
        this.p.addPath(this.l);
        this.i.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) i2, (float) i3);
        this.p.addRect(this.i, Path.Direction.CCW);
    }

    public wa1 getShapeAppearanceModel() {
        return this.n;
    }

    public ColorStateList getStrokeColor() {
        return this.m;
    }

    public float getStrokeWidth() {
        return this.o;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, (Paint) null);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        setLayerType(0, (Paint) null);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.p, this.k);
        e(canvas);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        f(i2, i3);
    }

    public void setShapeAppearanceModel(wa1 wa1) {
        this.n = wa1;
        f(getWidth(), getHeight());
        invalidate();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.m = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i2) {
        setStrokeColor(f.c(getContext(), i2));
    }

    public void setStrokeWidth(float f) {
        if (this.o != f) {
            this.o = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i2) {
        setStrokeWidth((float) getResources().getDimensionPixelSize(i2));
    }
}
