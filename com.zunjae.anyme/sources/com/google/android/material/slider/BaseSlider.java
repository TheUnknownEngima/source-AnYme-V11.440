package com.google.android.material.slider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.R$attr;
import com.google.android.material.R$color;
import com.google.android.material.R$dimen;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.m;
import com.google.android.material.internal.q;
import com.google.android.material.internal.r;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.slider.a;
import com.google.android.material.slider.b;
import defpackage.a5;
import defpackage.wa1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends a<S>, T extends b<S>> extends View {
    static final int a0 = R$style.Widget_MaterialComponents_Slider;
    private float A;
    private MotionEvent B;
    private c C;
    private boolean D;
    private float E;
    private float F;
    private ArrayList<Float> G;
    private int H;
    private int I;
    private float J;
    private float[] K;
    private int L;
    private boolean M;
    private boolean N;
    private boolean O;
    private ColorStateList P;
    private ColorStateList Q;
    private ColorStateList R;
    private ColorStateList S;
    private ColorStateList T;
    private final ra1 U;
    private float V;
    private int W;
    private final Paint e;
    private final Paint f;
    private final Paint g;
    private final Paint h;
    private final Paint i;
    private final Paint j;
    /* access modifiers changed from: private */
    public final c k;
    private final AccessibilityManager l;
    private BaseSlider<S, L, T>.defpackage.b m;
    private final e n;
    private final List<cb1> o;
    private final List<L> p;
    private final List<T> q;
    private final int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    class a implements e {
        final /* synthetic */ AttributeSet a;
        final /* synthetic */ int b;

        a(AttributeSet attributeSet, int i) {
            this.a = attributeSet;
            this.b = i;
        }

        public cb1 a() {
            TypedArray h = m.h(BaseSlider.this.getContext(), this.a, R$styleable.Slider, this.b, BaseSlider.a0, new int[0]);
            cb1 a2 = BaseSlider.M(BaseSlider.this.getContext(), h);
            h.recycle();
            return a2;
        }
    }

    private class b implements Runnable {
        int e;

        private b() {
            this.e = -1;
        }

        /* synthetic */ b(BaseSlider baseSlider, a aVar) {
            this();
        }

        /* access modifiers changed from: package-private */
        public void a(int i) {
            this.e = i;
        }

        public void run() {
            BaseSlider.this.k.W(this.e, 4);
        }
    }

    private static class c extends k5 {
        private final BaseSlider<?, ?, ?> q;
        Rect r = new Rect();

        c(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.q = baseSlider;
        }

        private String Y(int i) {
            Context context;
            int i2;
            if (i == this.q.getValues().size() - 1) {
                context = this.q.getContext();
                i2 = R$string.material_slider_range_end;
            } else if (i != 0) {
                return "";
            } else {
                context = this.q.getContext();
                i2 = R$string.material_slider_range_start;
            }
            return context.getString(i2);
        }

        /* access modifiers changed from: protected */
        public int B(float f, float f2) {
            for (int i = 0; i < this.q.getValues().size(); i++) {
                this.q.X(i, this.r);
                if (this.r.contains((int) f, (int) f2)) {
                    return i;
                }
            }
            return -1;
        }

        /* access modifiers changed from: protected */
        public void C(List<Integer> list) {
            for (int i = 0; i < this.q.getValues().size(); i++) {
                list.add(Integer.valueOf(i));
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
            if (com.google.android.material.slider.BaseSlider.d(r4.q, r5, r7.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) != false) goto L_0x0030;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean L(int r5, int r6, android.os.Bundle r7) {
            /*
                r4 = this;
                com.google.android.material.slider.BaseSlider<?, ?, ?> r0 = r4.q
                boolean r0 = r0.isEnabled()
                r1 = 0
                if (r0 != 0) goto L_0x000a
                return r1
            L_0x000a:
                r0 = 4096(0x1000, float:5.74E-42)
                r2 = 1
                r3 = 8192(0x2000, float:1.14794E-41)
                if (r6 == r0) goto L_0x003f
                if (r6 == r3) goto L_0x003f
                r0 = 16908349(0x102003d, float:2.38774E-38)
                if (r6 == r0) goto L_0x0019
                return r1
            L_0x0019:
                if (r7 == 0) goto L_0x003e
                java.lang.String r6 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"
                boolean r0 = r7.containsKey(r6)
                if (r0 != 0) goto L_0x0024
                goto L_0x003e
            L_0x0024:
                float r6 = r7.getFloat(r6)
                com.google.android.material.slider.BaseSlider<?, ?, ?> r7 = r4.q
                boolean r6 = r7.V(r5, r6)
                if (r6 == 0) goto L_0x003e
            L_0x0030:
                com.google.android.material.slider.BaseSlider<?, ?, ?> r6 = r4.q
                r6.Y()
                com.google.android.material.slider.BaseSlider<?, ?, ?> r6 = r4.q
                r6.postInvalidate()
                r4.E(r5)
                return r2
            L_0x003e:
                return r1
            L_0x003f:
                com.google.android.material.slider.BaseSlider<?, ?, ?> r7 = r4.q
                r0 = 20
                float r7 = r7.j(r0)
                if (r6 != r3) goto L_0x004a
                float r7 = -r7
            L_0x004a:
                com.google.android.material.slider.BaseSlider<?, ?, ?> r6 = r4.q
                boolean r6 = r6.D()
                if (r6 == 0) goto L_0x0053
                float r7 = -r7
            L_0x0053:
                com.google.android.material.slider.BaseSlider<?, ?, ?> r6 = r4.q
                java.util.List r6 = r6.getValues()
                java.lang.Object r6 = r6.get(r5)
                java.lang.Float r6 = (java.lang.Float) r6
                float r6 = r6.floatValue()
                float r6 = r6 + r7
                com.google.android.material.slider.BaseSlider<?, ?, ?> r7 = r4.q
                float r7 = r7.getValueFrom()
                com.google.android.material.slider.BaseSlider<?, ?, ?> r0 = r4.q
                float r0 = r0.getValueTo()
                float r6 = defpackage.y2.a(r6, r7, r0)
                com.google.android.material.slider.BaseSlider<?, ?, ?> r7 = r4.q
                boolean r6 = r7.V(r5, r6)
                if (r6 == 0) goto L_0x007d
                goto L_0x0030
            L_0x007d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.c.L(int, int, android.os.Bundle):boolean");
        }

        /* access modifiers changed from: protected */
        public void P(int i, a5 a5Var) {
            a5Var.b(a5.a.o);
            List<Float> values = this.q.getValues();
            float floatValue = values.get(i).floatValue();
            float valueFrom = this.q.getValueFrom();
            float valueTo = this.q.getValueTo();
            if (this.q.isEnabled()) {
                if (floatValue > valueFrom) {
                    a5Var.a(8192);
                }
                if (floatValue < valueTo) {
                    a5Var.a(4096);
                }
            }
            a5Var.w0(a5.d.a(1, valueFrom, valueTo, floatValue));
            a5Var.d0(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (this.q.getContentDescription() != null) {
                sb.append(this.q.getContentDescription());
                sb.append(",");
            }
            if (values.size() > 1) {
                sb.append(Y(i));
                sb.append(this.q.x(floatValue));
            }
            a5Var.h0(sb.toString());
            this.q.X(i, this.r);
            a5Var.Y(this.r);
        }
    }

    static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();
        float e;
        float f;
        ArrayList<Float> g;
        float h;
        boolean i;

        static class a implements Parcelable.Creator<d> {
            a() {
            }

            /* renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel, (a) null);
            }

            /* renamed from: b */
            public d[] newArray(int i) {
                return new d[i];
            }
        }

        private d(Parcel parcel) {
            super(parcel);
            this.e = parcel.readFloat();
            this.f = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.g = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.h = parcel.readFloat();
            this.i = parcel.createBooleanArray()[0];
        }

        /* synthetic */ d(Parcel parcel, a aVar) {
            this(parcel);
        }

        d(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeFloat(this.e);
            parcel.writeFloat(this.f);
            parcel.writeList(this.g);
            parcel.writeFloat(this.h);
            parcel.writeBooleanArray(new boolean[]{this.i});
        }
    }

    private interface e {
        cb1 a();
    }

    static {
        Class<BaseSlider> cls = BaseSlider.class;
    }

    public BaseSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.sliderStyle);
    }

    public BaseSlider(Context context, AttributeSet attributeSet, int i2) {
        super(bb1.c(context, attributeSet, i2, a0), attributeSet, i2);
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.D = false;
        this.G = new ArrayList<>();
        this.H = -1;
        this.I = -1;
        this.J = Utils.FLOAT_EPSILON;
        this.N = false;
        this.U = new ra1();
        this.W = 0;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.e = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.e.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.f = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = new Paint(1);
        this.g = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.g.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.h = paint4;
        paint4.setStyle(Paint.Style.FILL);
        Paint paint5 = new Paint();
        this.i = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        this.i.setStrokeCap(Paint.Cap.ROUND);
        Paint paint6 = new Paint();
        this.j = paint6;
        paint6.setStyle(Paint.Style.STROKE);
        this.j.setStrokeCap(Paint.Cap.ROUND);
        E(context2.getResources());
        this.n = new a(attributeSet, i2);
        P(context2, attributeSet, i2);
        setFocusable(true);
        setClickable(true);
        this.U.g0(2);
        this.r = ViewConfiguration.get(context2).getScaledTouchSlop();
        c cVar = new c(this);
        this.k = cVar;
        o4.i0(this, cVar);
        this.l = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    private void B() {
        this.e.setStrokeWidth((float) this.u);
        this.f.setStrokeWidth((float) this.u);
        this.i.setStrokeWidth(((float) this.u) / 2.0f);
        this.j.setStrokeWidth(((float) this.u) / 2.0f);
    }

    private boolean C() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            if (((ViewGroup) parent).shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    private void E(Resources resources) {
        this.s = resources.getDimensionPixelSize(R$dimen.mtrl_slider_widget_height);
        this.v = resources.getDimensionPixelOffset(R$dimen.mtrl_slider_track_side_padding);
        this.w = resources.getDimensionPixelOffset(R$dimen.mtrl_slider_track_top);
        this.z = resources.getDimensionPixelSize(R$dimen.mtrl_slider_label_padding);
    }

    private void F(Canvas canvas, int i2, int i3) {
        if (S()) {
            int I2 = (int) (((float) this.v) + (I(this.G.get(this.I).floatValue()) * ((float) i2)));
            if (Build.VERSION.SDK_INT < 28) {
                int i4 = this.y;
                canvas.clipRect((float) (I2 - i4), (float) (i3 - i4), (float) (I2 + i4), (float) (i4 + i3), Region.Op.UNION);
            }
            canvas.drawCircle((float) I2, (float) i3, (float) this.y, this.h);
        }
    }

    private boolean G(int i2) {
        int i3 = this.I;
        int c2 = (int) y2.c(((long) i3) + ((long) i2), 0, (long) (this.G.size() - 1));
        this.I = c2;
        if (c2 == i3) {
            return false;
        }
        if (this.H != -1) {
            this.H = c2;
        }
        Y();
        postInvalidate();
        return true;
    }

    private boolean H(int i2) {
        if (D()) {
            i2 = i2 == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i2;
        }
        return G(i2);
    }

    private float I(float f2) {
        float f3 = this.E;
        float f4 = (f2 - f3) / (this.F - f3);
        return D() ? 1.0f - f4 : f4;
    }

    private Boolean J(int i2, KeyEvent keyEvent) {
        if (i2 == 61) {
            return keyEvent.hasNoModifiers() ? Boolean.valueOf(G(1)) : keyEvent.isShiftPressed() ? Boolean.valueOf(G(-1)) : Boolean.FALSE;
        }
        if (i2 != 66) {
            if (i2 != 81) {
                if (i2 == 69) {
                    G(-1);
                    return Boolean.TRUE;
                } else if (i2 != 70) {
                    switch (i2) {
                        case 21:
                            H(-1);
                            return Boolean.TRUE;
                        case 22:
                            H(1);
                            return Boolean.TRUE;
                        case 23:
                            break;
                        default:
                            return null;
                    }
                }
            }
            G(1);
            return Boolean.TRUE;
        }
        this.H = this.I;
        postInvalidate();
        return Boolean.TRUE;
    }

    private void K() {
        for (T a2 : this.q) {
            a2.a(this);
        }
    }

    private void L() {
        for (T b2 : this.q) {
            b2.b(this);
        }
    }

    /* access modifiers changed from: private */
    public static cb1 M(Context context, TypedArray typedArray) {
        return cb1.s0(context, (AttributeSet) null, 0, typedArray.getResourceId(R$styleable.Slider_labelStyle, R$style.Widget_MaterialComponents_Tooltip));
    }

    private static int O(float[] fArr, float f2) {
        return Math.round(f2 * ((float) ((fArr.length / 2) - 1)));
    }

    private void P(Context context, AttributeSet attributeSet, int i2) {
        TypedArray h2 = m.h(context, attributeSet, R$styleable.Slider, i2, a0, new int[0]);
        this.E = h2.getFloat(R$styleable.Slider_android_valueFrom, Utils.FLOAT_EPSILON);
        this.F = h2.getFloat(R$styleable.Slider_android_valueTo, 1.0f);
        setValues(Float.valueOf(this.E));
        this.J = h2.getFloat(R$styleable.Slider_android_stepSize, Utils.FLOAT_EPSILON);
        boolean hasValue = h2.hasValue(R$styleable.Slider_trackColor);
        int i3 = hasValue ? R$styleable.Slider_trackColor : R$styleable.Slider_trackColorInactive;
        int i4 = hasValue ? R$styleable.Slider_trackColor : R$styleable.Slider_trackColorActive;
        ColorStateList a2 = ca1.a(context, h2, i3);
        if (a2 == null) {
            a2 = f.c(context, R$color.material_slider_inactive_track_color);
        }
        setTrackInactiveTintList(a2);
        ColorStateList a3 = ca1.a(context, h2, i4);
        if (a3 == null) {
            a3 = f.c(context, R$color.material_slider_active_track_color);
        }
        setTrackActiveTintList(a3);
        this.U.Y(ca1.a(context, h2, R$styleable.Slider_thumbColor));
        ColorStateList a4 = ca1.a(context, h2, R$styleable.Slider_haloColor);
        if (a4 == null) {
            a4 = f.c(context, R$color.material_slider_halo_color);
        }
        setHaloTintList(a4);
        boolean hasValue2 = h2.hasValue(R$styleable.Slider_tickColor);
        int i5 = hasValue2 ? R$styleable.Slider_tickColor : R$styleable.Slider_tickColorInactive;
        int i6 = hasValue2 ? R$styleable.Slider_tickColor : R$styleable.Slider_tickColorActive;
        ColorStateList a5 = ca1.a(context, h2, i5);
        if (a5 == null) {
            a5 = f.c(context, R$color.material_slider_inactive_tick_marks_color);
        }
        setTickInactiveTintList(a5);
        ColorStateList a6 = ca1.a(context, h2, i6);
        if (a6 == null) {
            a6 = f.c(context, R$color.material_slider_active_tick_marks_color);
        }
        setTickActiveTintList(a6);
        setThumbRadius(h2.getDimensionPixelSize(R$styleable.Slider_thumbRadius, 0));
        setHaloRadius(h2.getDimensionPixelSize(R$styleable.Slider_haloRadius, 0));
        setThumbElevation(h2.getDimension(R$styleable.Slider_thumbElevation, Utils.FLOAT_EPSILON));
        setTrackHeight(h2.getDimensionPixelSize(R$styleable.Slider_trackHeight, 0));
        this.t = h2.getInt(R$styleable.Slider_labelBehavior, 0);
        h2.recycle();
    }

    private void Q(int i2) {
        BaseSlider<S, L, T>.defpackage.b bVar = this.m;
        if (bVar == null) {
            this.m = new b(this, (a) null);
        } else {
            removeCallbacks(bVar);
        }
        this.m.a(i2);
        postDelayed(this.m, 200);
    }

    private void R(cb1 cb1, float f2) {
        cb1.z0(x(f2));
        int I2 = (this.v + ((int) (I(f2) * ((float) this.L)))) - (cb1.getIntrinsicWidth() / 2);
        int l2 = l() - (this.z + this.x);
        cb1.setBounds(I2, l2 - cb1.getIntrinsicHeight(), cb1.getIntrinsicWidth() + I2, l2);
        Rect rect = new Rect(cb1.getBounds());
        com.google.android.material.internal.b.c(r.d(this), this, rect);
        cb1.setBounds(rect);
        r.e(this).a(cb1);
    }

    private boolean S() {
        return this.M || Build.VERSION.SDK_INT < 21 || !(getBackground() instanceof RippleDrawable);
    }

    private boolean T(float f2) {
        return V(this.H, f2);
    }

    private double U(float f2) {
        float f3 = this.J;
        if (f3 <= Utils.FLOAT_EPSILON) {
            return (double) f2;
        }
        int i2 = (int) ((this.F - this.E) / f3);
        return ((double) Math.round(f2 * ((float) i2))) / ((double) i2);
    }

    /* access modifiers changed from: private */
    public boolean V(int i2, float f2) {
        if (((double) Math.abs(f2 - this.G.get(i2).floatValue())) < 1.0E-4d) {
            return false;
        }
        this.G.set(i2, Float.valueOf(y(i2, f2)));
        this.I = i2;
        p(i2);
        return true;
    }

    private boolean W() {
        return T(getValueOfTouchPosition());
    }

    /* access modifiers changed from: private */
    public void Y() {
        if (!S() && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                int I2 = (int) ((I(this.G.get(this.I).floatValue()) * ((float) this.L)) + ((float) this.v));
                int l2 = l();
                int i2 = this.y;
                androidx.core.graphics.drawable.a.l(background, I2 - i2, l2 - i2, I2 + i2, l2 + i2);
            }
        }
    }

    private void Z() {
        if (this.O) {
            b0();
            c0();
            a0();
            d0();
            this.O = false;
        }
    }

    private void a0() {
        float f2 = this.J;
        if (f2 > Utils.FLOAT_EPSILON && ((double) (((this.F - this.E) / f2) % 1.0f)) > 1.0E-4d) {
            throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", new Object[]{Float.toString(this.J), Float.toString(this.E), Float.toString(this.F)}));
        }
    }

    private void b0() {
        if (this.E >= this.F) {
            throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", new Object[]{Float.toString(this.E), Float.toString(this.F)}));
        }
    }

    private void c0() {
        if (this.F <= this.E) {
            throw new IllegalStateException(String.format("valueTo(%s) must be greater than valueFrom(%s)", new Object[]{Float.toString(this.F), Float.toString(this.E)}));
        }
    }

    private void d0() {
        Iterator<Float> it = this.G.iterator();
        while (it.hasNext()) {
            Float next = it.next();
            if (next.floatValue() < this.E || next.floatValue() > this.F) {
                throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", new Object[]{Float.toString(next.floatValue()), Float.toString(this.E), Float.toString(this.F)}));
            } else if (this.J > Utils.FLOAT_EPSILON && ((double) (((this.E - next.floatValue()) / this.J) % 1.0f)) > 1.0E-4d) {
                throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", new Object[]{Float.toString(next.floatValue()), Float.toString(this.E), Float.toString(this.J), Float.toString(this.J)}));
            }
        }
    }

    private float e0(float f2) {
        return (I(f2) * ((float) this.L)) + ((float) this.v);
    }

    private void g(cb1 cb1) {
        cb1.y0(r.d(this));
    }

    private float[] getActiveRange() {
        float floatValue = ((Float) Collections.max(getValues())).floatValue();
        float floatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.G.size() == 1) {
            floatValue2 = this.E;
        }
        float I2 = I(floatValue2);
        float I3 = I(floatValue);
        if (D()) {
            return new float[]{I3, I2};
        }
        return new float[]{I2, I3};
    }

    private float getValueOfTouchPosition() {
        double U2 = U(this.V);
        if (D()) {
            U2 = 1.0d - U2;
        }
        float f2 = this.F;
        float f3 = this.E;
        return (float) ((U2 * ((double) (f2 - f3))) + ((double) f3));
    }

    private float getValueOfTouchPositionAbsolute() {
        float f2 = this.V;
        if (D()) {
            f2 = 1.0f - f2;
        }
        float f3 = this.F;
        float f4 = this.E;
        return (f2 * (f3 - f4)) + f4;
    }

    private Float h(int i2) {
        float j2 = this.N ? j(20) : i();
        if (i2 == 21) {
            if (!D()) {
                j2 = -j2;
            }
            return Float.valueOf(j2);
        } else if (i2 == 22) {
            if (D()) {
                j2 = -j2;
            }
            return Float.valueOf(j2);
        } else if (i2 == 69) {
            return Float.valueOf(-j2);
        } else {
            if (i2 == 70 || i2 == 81) {
                return Float.valueOf(j2);
            }
            return null;
        }
    }

    private float i() {
        float f2 = this.J;
        if (f2 == Utils.FLOAT_EPSILON) {
            return 1.0f;
        }
        return f2;
    }

    /* access modifiers changed from: private */
    public float j(int i2) {
        float i3 = i();
        float f2 = (this.F - this.E) / i3;
        float f3 = (float) i2;
        return f2 <= f3 ? i3 : ((float) Math.round(f2 / f3)) * i3;
    }

    private void k() {
        Z();
        int min = Math.min((int) (((this.F - this.E) / this.J) + 1.0f), (this.L / (this.u * 2)) + 1);
        float[] fArr = this.K;
        if (fArr == null || fArr.length != min * 2) {
            this.K = new float[(min * 2)];
        }
        float f2 = ((float) this.L) / ((float) (min - 1));
        for (int i2 = 0; i2 < min * 2; i2 += 2) {
            float[] fArr2 = this.K;
            fArr2[i2] = ((float) this.v) + (((float) (i2 / 2)) * f2);
            fArr2[i2 + 1] = (float) l();
        }
    }

    private int l() {
        int i2 = this.w;
        int i3 = 0;
        if (this.t == 1) {
            i3 = this.o.get(0).getIntrinsicHeight();
        }
        return i2 + i3;
    }

    private void m() {
        if (this.o.size() > this.G.size()) {
            List<cb1> subList = this.o.subList(this.G.size(), this.o.size());
            for (cb1 next : subList) {
                if (o4.N(this)) {
                    n(next);
                }
            }
            subList.clear();
        }
        while (this.o.size() < this.G.size()) {
            cb1 a2 = this.n.a();
            this.o.add(a2);
            if (o4.N(this)) {
                g(a2);
            }
        }
        int i2 = 1;
        if (this.o.size() == 1) {
            i2 = 0;
        }
        for (cb1 k0 : this.o) {
            k0.k0((float) i2);
        }
    }

    private void n(cb1 cb1) {
        q e2 = r.e(this);
        if (e2 != null) {
            e2.b(cb1);
            cb1.u0(r.d(this));
        }
    }

    private float o(float f2) {
        if (f2 == Utils.FLOAT_EPSILON) {
            return Utils.FLOAT_EPSILON;
        }
        float f3 = (f2 - ((float) this.v)) / ((float) this.L);
        float f4 = this.E;
        return (f3 * (f4 - this.F)) + f4;
    }

    private void p(int i2) {
        for (L a2 : this.p) {
            a2.a(this, this.G.get(i2).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.l;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            Q(i2);
        }
    }

    private void q() {
        for (L l2 : this.p) {
            Iterator<Float> it = this.G.iterator();
            while (it.hasNext()) {
                l2.a(this, it.next().floatValue(), false);
            }
        }
    }

    private void r(Canvas canvas, int i2, int i3) {
        float[] activeRange = getActiveRange();
        int i4 = this.v;
        float f2 = (float) i2;
        float f3 = (float) i3;
        Canvas canvas2 = canvas;
        canvas2.drawLine(((float) i4) + (activeRange[0] * f2), f3, ((float) i4) + (activeRange[1] * f2), f3, this.f);
    }

    private void s(Canvas canvas, int i2, int i3) {
        float[] activeRange = getActiveRange();
        int i4 = this.v;
        float f2 = (float) i2;
        float f3 = ((float) i4) + (activeRange[1] * f2);
        if (f3 < ((float) (i4 + i2))) {
            float f4 = (float) i3;
            canvas.drawLine(f3, f4, (float) (i4 + i2), f4, this.e);
        }
        int i5 = this.v;
        float f5 = ((float) i5) + (activeRange[0] * f2);
        if (f5 > ((float) i5)) {
            float f6 = (float) i3;
            canvas.drawLine((float) i5, f6, f5, f6, this.e);
        }
    }

    private void setValuesInternal(ArrayList<Float> arrayList) {
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (this.G.size() != arrayList.size() || !this.G.equals(arrayList)) {
                this.G = arrayList;
                this.O = true;
                this.I = 0;
                Y();
                m();
                q();
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("At least one value must be set");
    }

    private void t(Canvas canvas, int i2, int i3) {
        if (!isEnabled()) {
            Iterator<Float> it = this.G.iterator();
            while (it.hasNext()) {
                canvas.drawCircle(((float) this.v) + (I(it.next().floatValue()) * ((float) i2)), (float) i3, (float) this.x, this.g);
            }
        }
        Iterator<Float> it2 = this.G.iterator();
        while (it2.hasNext()) {
            canvas.save();
            int I2 = this.v + ((int) (I(it2.next().floatValue()) * ((float) i2)));
            int i4 = this.x;
            canvas.translate((float) (I2 - i4), (float) (i3 - i4));
            this.U.draw(canvas);
            canvas.restore();
        }
    }

    private void u(Canvas canvas) {
        float[] activeRange = getActiveRange();
        int O2 = O(this.K, activeRange[0]);
        int O3 = O(this.K, activeRange[1]);
        int i2 = O2 * 2;
        canvas.drawPoints(this.K, 0, i2, this.i);
        int i3 = O3 * 2;
        canvas.drawPoints(this.K, i2, i3 - i2, this.j);
        float[] fArr = this.K;
        canvas.drawPoints(fArr, i3, fArr.length - i3, this.i);
    }

    private void v() {
        if (this.t != 2) {
            Iterator<cb1> it = this.o.iterator();
            for (int i2 = 0; i2 < this.G.size() && it.hasNext(); i2++) {
                if (i2 != this.I) {
                    R(it.next(), this.G.get(i2).floatValue());
                }
            }
            if (it.hasNext()) {
                R(it.next(), this.G.get(this.I).floatValue());
            } else {
                throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", new Object[]{Integer.valueOf(this.o.size()), Integer.valueOf(this.G.size())}));
            }
        }
    }

    private void w(int i2) {
        if (i2 == 1) {
            G(Integer.MAX_VALUE);
        } else if (i2 == 2) {
            G(Integer.MIN_VALUE);
        } else if (i2 == 17) {
            H(Integer.MAX_VALUE);
        } else if (i2 == 66) {
            H(Integer.MIN_VALUE);
        }
    }

    /* access modifiers changed from: private */
    public String x(float f2) {
        if (A()) {
            return this.C.a(f2);
        }
        return String.format(((float) ((int) f2)) == f2 ? "%.0f" : "%.2f", new Object[]{Float.valueOf(f2)});
    }

    private float y(int i2, float f2) {
        float f3 = this.J;
        float f4 = Utils.FLOAT_EPSILON;
        if (f3 == Utils.FLOAT_EPSILON) {
            f4 = getMinSeparation();
        }
        if (this.W == 0) {
            f4 = o(f4);
        }
        if (D()) {
            f4 = -f4;
        }
        int i3 = i2 + 1;
        int i4 = i2 - 1;
        return y2.a(f2, i4 < 0 ? this.E : this.G.get(i4).floatValue() + f4, i3 >= this.G.size() ? this.F : this.G.get(i3).floatValue() - f4);
    }

    private int z(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public boolean A() {
        return this.C != null;
    }

    /* access modifiers changed from: package-private */
    public final boolean D() {
        return o4.y(this) == 1;
    }

    /* access modifiers changed from: protected */
    public boolean N() {
        if (this.H != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float e0 = e0(valueOfTouchPositionAbsolute);
        this.H = 0;
        float abs = Math.abs(this.G.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i2 = 1; i2 < this.G.size(); i2++) {
            float abs2 = Math.abs(this.G.get(i2).floatValue() - valueOfTouchPositionAbsolute);
            float e02 = e0(this.G.get(i2).floatValue());
            if (Float.compare(abs2, abs) > 1) {
                break;
            }
            boolean z2 = !D() ? e02 - e0 < Utils.FLOAT_EPSILON : e02 - e0 > Utils.FLOAT_EPSILON;
            if (Float.compare(abs2, abs) >= 0) {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else if (Math.abs(e02 - e0) < ((float) this.r)) {
                    this.H = -1;
                    return false;
                } else if (!z2) {
                }
            }
            this.H = i2;
            abs = abs2;
        }
        return this.H != -1;
    }

    /* access modifiers changed from: package-private */
    public void X(int i2, Rect rect) {
        int I2 = this.v + ((int) (I(getValues().get(i2).floatValue()) * ((float) this.L)));
        int l2 = l();
        int i3 = this.x;
        rect.set(I2 - i3, l2 - i3, I2 + i3, l2 + i3);
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.k.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.e.setColor(z(this.T));
        this.f.setColor(z(this.S));
        this.i.setColor(z(this.R));
        this.j.setColor(z(this.Q));
        for (cb1 next : this.o) {
            if (next.isStateful()) {
                next.setState(getDrawableState());
            }
        }
        if (this.U.isStateful()) {
            this.U.setState(getDrawableState());
        }
        this.h.setColor(z(this.P));
        this.h.setAlpha(63);
    }

    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    /* access modifiers changed from: package-private */
    public final int getAccessibilityFocusedVirtualViewId() {
        return this.k.x();
    }

    public int getActiveThumbIndex() {
        return this.H;
    }

    public int getFocusedThumbIndex() {
        return this.I;
    }

    public int getHaloRadius() {
        return this.y;
    }

    public ColorStateList getHaloTintList() {
        return this.P;
    }

    public int getLabelBehavior() {
        return this.t;
    }

    /* access modifiers changed from: protected */
    public float getMinSeparation() {
        return Utils.FLOAT_EPSILON;
    }

    public float getStepSize() {
        return this.J;
    }

    public float getThumbElevation() {
        return this.U.w();
    }

    public int getThumbRadius() {
        return this.x;
    }

    public ColorStateList getThumbTintList() {
        return this.U.x();
    }

    public ColorStateList getTickActiveTintList() {
        return this.Q;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.R;
    }

    public ColorStateList getTickTintList() {
        if (this.R.equals(this.Q)) {
            return this.Q;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackActiveTintList() {
        return this.S;
    }

    public int getTrackHeight() {
        return this.u;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.T;
    }

    public int getTrackSidePadding() {
        return this.v;
    }

    public ColorStateList getTrackTintList() {
        if (this.T.equals(this.S)) {
            return this.S;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.L;
    }

    public float getValueFrom() {
        return this.E;
    }

    public float getValueTo() {
        return this.F;
    }

    /* access modifiers changed from: package-private */
    public List<Float> getValues() {
        return new ArrayList(this.G);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (cb1 g2 : this.o) {
            g(g2);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        BaseSlider<S, L, T>.defpackage.b bVar = this.m;
        if (bVar != null) {
            removeCallbacks(bVar);
        }
        for (cb1 n2 : this.o) {
            n(n2);
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.O) {
            Z();
            if (this.J > Utils.FLOAT_EPSILON) {
                k();
            }
        }
        super.onDraw(canvas);
        int l2 = l();
        s(canvas, this.L, l2);
        if (((Float) Collections.max(getValues())).floatValue() > this.E) {
            r(canvas, this.L, l2);
        }
        if (this.J > Utils.FLOAT_EPSILON) {
            u(canvas);
        }
        if ((this.D || isFocused()) && isEnabled()) {
            F(canvas, this.L, l2);
            if (this.H != -1) {
                v();
            }
        }
        t(canvas, this.L, l2);
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z2, int i2, Rect rect) {
        super.onFocusChanged(z2, i2, rect);
        if (!z2) {
            this.H = -1;
            for (cb1 b2 : this.o) {
                r.e(this).b(b2);
            }
            this.k.o(this.I);
            return;
        }
        w(i2);
        this.k.V(this.I);
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i2, keyEvent);
        }
        if (this.G.size() == 1) {
            this.H = 0;
        }
        if (this.H == -1) {
            Boolean J2 = J(i2, keyEvent);
            return J2 != null ? J2.booleanValue() : super.onKeyDown(i2, keyEvent);
        }
        this.N |= keyEvent.isLongPress();
        Float h2 = h(i2);
        if (h2 != null) {
            if (T(this.G.get(this.H).floatValue() + h2.floatValue())) {
                Y();
                postInvalidate();
            }
            return true;
        }
        if (i2 != 23) {
            if (i2 != 61) {
                if (i2 != 66) {
                    return super.onKeyDown(i2, keyEvent);
                }
            } else if (keyEvent.hasNoModifiers()) {
                return G(1);
            } else {
                if (keyEvent.isShiftPressed()) {
                    return G(-1);
                }
                return false;
            }
        }
        this.H = -1;
        for (cb1 b2 : this.o) {
            r.e(this).b(b2);
        }
        postInvalidate();
        return true;
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        this.N = false;
        return super.onKeyUp(i2, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int i4 = this.s;
        int i5 = 0;
        if (this.t == 1) {
            i5 = this.o.get(0).getIntrinsicHeight();
        }
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(i4 + i5, 1073741824));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.E = dVar.e;
        this.F = dVar.f;
        setValuesInternal(dVar.g);
        this.J = dVar.h;
        if (dVar.i) {
            requestFocus();
        }
        q();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.e = this.E;
        dVar.f = this.F;
        dVar.g = new ArrayList<>(this.G);
        dVar.h = this.J;
        dVar.i = hasFocus();
        return dVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        this.L = Math.max(i2 - (this.v * 2), 0);
        if (this.J > Utils.FLOAT_EPSILON) {
            k();
        }
        Y();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float x2 = motionEvent.getX();
        float f2 = (x2 - ((float) this.v)) / ((float) this.L);
        this.V = f2;
        float max = Math.max(Utils.FLOAT_EPSILON, f2);
        this.V = max;
        this.V = Math.min(1.0f, max);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.D = false;
                MotionEvent motionEvent2 = this.B;
                if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.B.getX() - motionEvent.getX()) <= ((float) this.r) && Math.abs(this.B.getY() - motionEvent.getY()) <= ((float) this.r)) {
                    N();
                }
                if (this.H != -1) {
                    W();
                    this.H = -1;
                }
                for (cb1 b2 : this.o) {
                    r.e(this).b(b2);
                }
                L();
            } else if (actionMasked == 2) {
                if (!this.D) {
                    if (Math.abs(x2 - this.A) < ((float) this.r)) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    K();
                }
                if (N()) {
                    this.D = true;
                    W();
                    Y();
                }
            }
            invalidate();
        } else {
            this.A = x2;
            if (!C()) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (N()) {
                    requestFocus();
                    this.D = true;
                    W();
                    Y();
                    invalidate();
                    K();
                }
            }
        }
        setPressed(this.D);
        this.B = MotionEvent.obtain(motionEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void setActiveThumbIndex(int i2) {
        this.H = i2;
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        setLayerType(z2 ? 0 : 2, (Paint) null);
    }

    public void setFocusedThumbIndex(int i2) {
        if (i2 < 0 || i2 >= this.G.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.I = i2;
        this.k.V(i2);
        postInvalidate();
    }

    public void setHaloRadius(int i2) {
        if (i2 != this.y) {
            this.y = i2;
            Drawable background = getBackground();
            if (S() || !(background instanceof RippleDrawable)) {
                postInvalidate();
            } else {
                v91.a((RippleDrawable) background, this.y);
            }
        }
    }

    public void setHaloRadiusResource(int i2) {
        setHaloRadius(getResources().getDimensionPixelSize(i2));
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.P)) {
            this.P = colorStateList;
            Drawable background = getBackground();
            if (S() || !(background instanceof RippleDrawable)) {
                this.h.setColor(z(colorStateList));
                this.h.setAlpha(63);
                invalidate();
                return;
            }
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    public void setLabelBehavior(int i2) {
        if (this.t != i2) {
            this.t = i2;
            requestLayout();
        }
    }

    public void setLabelFormatter(c cVar) {
        this.C = cVar;
    }

    /* access modifiers changed from: protected */
    public void setSeparationUnit(int i2) {
        this.W = i2;
    }

    public void setStepSize(float f2) {
        if (f2 < Utils.FLOAT_EPSILON) {
            throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", new Object[]{Float.toString(f2), Float.toString(this.E), Float.toString(this.F)}));
        } else if (this.J != f2) {
            this.J = f2;
            this.O = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f2) {
        this.U.X(f2);
    }

    public void setThumbElevationResource(int i2) {
        setThumbElevation(getResources().getDimension(i2));
    }

    public void setThumbRadius(int i2) {
        if (i2 != this.x) {
            this.x = i2;
            ra1 ra1 = this.U;
            wa1.b a2 = wa1.a();
            a2.q(0, (float) this.x);
            ra1.setShapeAppearanceModel(a2.m());
            ra1 ra12 = this.U;
            int i3 = this.x;
            ra12.setBounds(0, 0, i3 * 2, i3 * 2);
            postInvalidate();
        }
    }

    public void setThumbRadiusResource(int i2) {
        setThumbRadius(getResources().getDimensionPixelSize(i2));
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.U.Y(colorStateList);
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.Q)) {
            this.Q = colorStateList;
            this.j.setColor(z(colorStateList));
            invalidate();
        }
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.R)) {
            this.R = colorStateList;
            this.i.setColor(z(colorStateList));
            invalidate();
        }
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.S)) {
            this.S = colorStateList;
            this.f.setColor(z(colorStateList));
            invalidate();
        }
    }

    public void setTrackHeight(int i2) {
        if (this.u != i2) {
            this.u = i2;
            B();
            postInvalidate();
        }
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.T)) {
            this.T = colorStateList;
            this.e.setColor(z(colorStateList));
            invalidate();
        }
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f2) {
        this.E = f2;
        this.O = true;
        postInvalidate();
    }

    public void setValueTo(float f2) {
        this.F = f2;
        this.O = true;
        postInvalidate();
    }

    /* access modifiers changed from: package-private */
    public void setValues(List<Float> list) {
        setValuesInternal(new ArrayList(list));
    }

    /* access modifiers changed from: package-private */
    public void setValues(Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }
}
