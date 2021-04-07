package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$styleable;
import java.util.ArrayList;
import java.util.List;

public class ClockHandView extends View {
    private ValueAnimator e;
    private boolean f;
    private float g;
    private float h;
    private boolean i;
    private int j;
    private final List<d> k;
    private final int l;
    private final float m;
    private final Paint n;
    private final RectF o;
    private final int p;
    private float q;
    private boolean r;
    private c s;
    private double t;
    private int u;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.h(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    class b extends AnimatorListenerAdapter {
        b(ClockHandView clockHandView) {
        }

        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface c {
        void a(float f, boolean z);
    }

    public interface d {
        void a(float f, boolean z);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.k = new ArrayList();
        this.n = new Paint();
        this.o = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ClockHandView, i2, 0);
        this.u = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ClockHandView_materialCircleRadius, 0);
        this.l = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ClockHandView_selectorSize, 0);
        Resources resources = getResources();
        this.p = resources.getDimensionPixelSize(R$dimen.material_clock_hand_stroke_width);
        this.m = (float) resources.getDimensionPixelSize(R$dimen.material_clock_hand_center_dot_radius);
        int d2 = t91.d(this, R$attr.colorPrimary);
        this.n.setAntiAlias(true);
        this.n.setColor(d2);
        setHandRotation(Utils.FLOAT_EPSILON);
        this.j = ViewConfiguration.get(context).getScaledTouchSlop();
        o4.s0(this, 2);
        obtainStyledAttributes.recycle();
    }

    private void c(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f2 = (float) width;
        float f3 = (float) height;
        this.n.setStrokeWidth(Utils.FLOAT_EPSILON);
        canvas.drawCircle((((float) this.u) * ((float) Math.cos(this.t))) + f2, (((float) this.u) * ((float) Math.sin(this.t))) + f3, (float) this.l, this.n);
        double sin = Math.sin(this.t);
        double cos = Math.cos(this.t);
        double d2 = (double) ((float) (this.u - this.l));
        float f4 = (float) (width + ((int) (cos * d2)));
        float f5 = (float) (height + ((int) (d2 * sin)));
        this.n.setStrokeWidth((float) this.p);
        canvas.drawLine(f2, f3, f4, f5, this.n);
        canvas.drawCircle(f2, f3, this.m, this.n);
    }

    private int d(float f2, float f3) {
        int degrees = ((int) Math.toDegrees(Math.atan2((double) (f3 - ((float) (getHeight() / 2))), (double) (f2 - ((float) (getWidth() / 2)))))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    private Pair<Float, Float> e(float f2) {
        float handRotation = getHandRotation();
        if (Math.abs(handRotation - f2) > 180.0f) {
            if (handRotation > 180.0f && f2 < 180.0f) {
                f2 += 360.0f;
            }
            if (handRotation < 180.0f && f2 > 180.0f) {
                handRotation += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(handRotation), Float.valueOf(f2));
    }

    private boolean f(float f2, float f3, boolean z, boolean z2, boolean z3) {
        float d2 = (float) d(f2, f3);
        boolean z4 = false;
        boolean z5 = getHandRotation() != d2;
        if (z2 && z5) {
            return true;
        }
        if (!z5 && !z) {
            return false;
        }
        if (z3 && this.f) {
            z4 = true;
        }
        g(d2, z4);
        return true;
    }

    /* access modifiers changed from: private */
    public void h(float f2, boolean z) {
        float f3 = f2 % 360.0f;
        this.q = f3;
        this.t = Math.toRadians((double) (f3 - 90.0f));
        float width = ((float) (getWidth() / 2)) + (((float) this.u) * ((float) Math.cos(this.t)));
        float height = ((float) (getHeight() / 2)) + (((float) this.u) * ((float) Math.sin(this.t)));
        RectF rectF = this.o;
        int i2 = this.l;
        rectF.set(width - ((float) i2), height - ((float) i2), width + ((float) i2), height + ((float) i2));
        for (d a2 : this.k) {
            a2.a(f3, z);
        }
        invalidate();
    }

    public void b(d dVar) {
        this.k.add(dVar);
    }

    public void g(float f2, boolean z) {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            h(f2, false);
            return;
        }
        Pair<Float, Float> e2 = e(f2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{((Float) e2.first).floatValue(), ((Float) e2.second).floatValue()});
        this.e = ofFloat;
        ofFloat.setDuration(200);
        this.e.addUpdateListener(new a());
        this.e.addListener(new b(this));
        this.e.start();
    }

    public RectF getCurrentSelectorBox() {
        return this.o;
    }

    public float getHandRotation() {
        return this.q;
    }

    public int getSelectorRadius() {
        return this.l;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c(canvas);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        setHandRotation(getHandRotation());
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        c cVar;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                int i2 = (int) (x - this.g);
                int i3 = (int) (y - this.h);
                this.i = (i2 * i2) + (i3 * i3) > this.j;
                boolean z4 = this.r;
                z3 = actionMasked == 1;
                z2 = z4;
            } else {
                z3 = false;
                z2 = false;
            }
            z = false;
        } else {
            this.g = x;
            this.h = y;
            this.i = true;
            this.r = false;
            z3 = false;
            z2 = false;
            z = true;
        }
        boolean f2 = f(x, y, z2, z, z3) | this.r;
        this.r = f2;
        if (f2 && z3 && (cVar = this.s) != null) {
            cVar.a((float) d(x, y), this.i);
        }
        return true;
    }

    public void setAnimateOnTouchUp(boolean z) {
        this.f = z;
    }

    public void setCircleRadius(int i2) {
        this.u = i2;
        invalidate();
    }

    public void setHandRotation(float f2) {
        g(f2, false);
    }

    public void setOnActionUpListener(c cVar) {
        this.s = cVar;
    }
}
