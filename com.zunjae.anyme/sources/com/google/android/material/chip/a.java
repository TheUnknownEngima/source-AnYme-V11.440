package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.b;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.internal.j;
import com.google.android.material.internal.r;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public class a extends ra1 implements b, Drawable.Callback, j.b {
    private static final int[] M0 = {16842910};
    private static final ShapeDrawable N0 = new ShapeDrawable(new OvalShape());
    private ColorFilter A0;
    private PorterDuffColorFilter B0;
    private ColorStateList C;
    private ColorStateList C0;
    private ColorStateList D;
    private PorterDuff.Mode D0 = PorterDuff.Mode.SRC_IN;
    private float E;
    private int[] E0;
    private float F = -1.0f;
    private boolean F0;
    private ColorStateList G;
    private ColorStateList G0;
    private float H;
    private WeakReference<C0095a> H0;
    private ColorStateList I;
    private TextUtils.TruncateAt I0;
    private CharSequence J;
    private boolean J0;
    private boolean K;
    private int K0;
    private Drawable L;
    private boolean L0;
    private ColorStateList M;
    private float N;
    private boolean O;
    private boolean P;
    private Drawable Q;
    private Drawable R;
    private ColorStateList S;
    private float T;
    private CharSequence U;
    private boolean V;
    private boolean W;
    private Drawable X;
    private ColorStateList Y;
    private m91 Z;
    private m91 a0;
    private float b0;
    private float c0;
    private float d0;
    private float e0;
    private float f0;
    private float g0;
    private float h0;
    private float i0;
    private final Context j0;
    private final Paint k0 = new Paint(1);
    private final Paint l0;
    private final Paint.FontMetrics m0 = new Paint.FontMetrics();
    private final RectF n0 = new RectF();
    private final PointF o0 = new PointF();
    private final Path p0 = new Path();
    private final j q0;
    private int r0;
    private int s0;
    private int t0;
    private int u0;
    private int v0;
    private int w0;
    private boolean x0;
    private int y0;
    private int z0 = 255;

    /* renamed from: com.google.android.material.chip.a$a  reason: collision with other inner class name */
    public interface C0095a {
        void a();
    }

    private a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Paint paint = null;
        this.H0 = new WeakReference<>(paint);
        N(context);
        this.j0 = context;
        j jVar = new j(this);
        this.q0 = jVar;
        this.J = "";
        jVar.e().density = context.getResources().getDisplayMetrics().density;
        this.l0 = paint;
        if (paint != null) {
            paint.setStyle(Paint.Style.STROKE);
        }
        setState(M0);
        p2(M0);
        this.J0 = true;
        if (ha1.a) {
            N0.setTint(-1);
        }
    }

    private void A0(Canvas canvas, Rect rect) {
        if (Q2()) {
            p0(rect, this.n0);
            RectF rectF = this.n0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.X.setBounds(0, 0, (int) this.n0.width(), (int) this.n0.height());
            this.X.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x014a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A1(int[] r7, int[] r8) {
        /*
            r6 = this;
            boolean r0 = super.onStateChange(r7)
            android.content.res.ColorStateList r1 = r6.C
            r2 = 0
            if (r1 == 0) goto L_0x0010
            int r3 = r6.r0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            int r3 = r6.r0
            r4 = 1
            if (r3 == r1) goto L_0x0019
            r6.r0 = r1
            r0 = 1
        L_0x0019:
            android.content.res.ColorStateList r3 = r6.D
            if (r3 == 0) goto L_0x0024
            int r5 = r6.s0
            int r3 = r3.getColorForState(r7, r5)
            goto L_0x0025
        L_0x0024:
            r3 = 0
        L_0x0025:
            int r5 = r6.s0
            if (r5 == r3) goto L_0x002c
            r6.s0 = r3
            r0 = 1
        L_0x002c:
            int r1 = defpackage.t91.f(r1, r3)
            int r3 = r6.t0
            if (r3 == r1) goto L_0x0036
            r3 = 1
            goto L_0x0037
        L_0x0036:
            r3 = 0
        L_0x0037:
            android.content.res.ColorStateList r5 = r6.x()
            if (r5 != 0) goto L_0x003f
            r5 = 1
            goto L_0x0040
        L_0x003f:
            r5 = 0
        L_0x0040:
            r3 = r3 | r5
            if (r3 == 0) goto L_0x004d
            r6.t0 = r1
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r1)
            r6.Y(r0)
            r0 = 1
        L_0x004d:
            android.content.res.ColorStateList r1 = r6.G
            if (r1 == 0) goto L_0x0058
            int r3 = r6.u0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0059
        L_0x0058:
            r1 = 0
        L_0x0059:
            int r3 = r6.u0
            if (r3 == r1) goto L_0x0060
            r6.u0 = r1
            r0 = 1
        L_0x0060:
            android.content.res.ColorStateList r1 = r6.G0
            if (r1 == 0) goto L_0x0073
            boolean r1 = defpackage.ha1.e(r7)
            if (r1 == 0) goto L_0x0073
            android.content.res.ColorStateList r1 = r6.G0
            int r3 = r6.v0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0074
        L_0x0073:
            r1 = 0
        L_0x0074:
            int r3 = r6.v0
            if (r3 == r1) goto L_0x007f
            r6.v0 = r1
            boolean r1 = r6.F0
            if (r1 == 0) goto L_0x007f
            r0 = 1
        L_0x007f:
            com.google.android.material.internal.j r1 = r6.q0
            da1 r1 = r1.d()
            if (r1 == 0) goto L_0x00a0
            com.google.android.material.internal.j r1 = r6.q0
            da1 r1 = r1.d()
            android.content.res.ColorStateList r1 = r1.a
            if (r1 == 0) goto L_0x00a0
            com.google.android.material.internal.j r1 = r6.q0
            da1 r1 = r1.d()
            android.content.res.ColorStateList r1 = r1.a
            int r3 = r6.w0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x00a1
        L_0x00a0:
            r1 = 0
        L_0x00a1:
            int r3 = r6.w0
            if (r3 == r1) goto L_0x00a8
            r6.w0 = r1
            r0 = 1
        L_0x00a8:
            int[] r1 = r6.getState()
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            boolean r1 = r1(r1, r3)
            if (r1 == 0) goto L_0x00bb
            boolean r1 = r6.V
            if (r1 == 0) goto L_0x00bb
            r1 = 1
            goto L_0x00bc
        L_0x00bb:
            r1 = 0
        L_0x00bc:
            boolean r3 = r6.x0
            if (r3 == r1) goto L_0x00d6
            android.graphics.drawable.Drawable r3 = r6.X
            if (r3 == 0) goto L_0x00d6
            float r0 = r6.q0()
            r6.x0 = r1
            float r1 = r6.q0()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00d5
            r0 = 1
            r1 = 1
            goto L_0x00d7
        L_0x00d5:
            r0 = 1
        L_0x00d6:
            r1 = 0
        L_0x00d7:
            android.content.res.ColorStateList r3 = r6.C0
            if (r3 == 0) goto L_0x00e2
            int r5 = r6.y0
            int r3 = r3.getColorForState(r7, r5)
            goto L_0x00e3
        L_0x00e2:
            r3 = 0
        L_0x00e3:
            int r5 = r6.y0
            if (r5 == r3) goto L_0x00f4
            r6.y0 = r3
            android.content.res.ColorStateList r0 = r6.C0
            android.graphics.PorterDuff$Mode r3 = r6.D0
            android.graphics.PorterDuffColorFilter r0 = defpackage.v91.b(r6, r0, r3)
            r6.B0 = r0
            goto L_0x00f5
        L_0x00f4:
            r4 = r0
        L_0x00f5:
            android.graphics.drawable.Drawable r0 = r6.L
            boolean r0 = w1(r0)
            if (r0 == 0) goto L_0x0104
            android.graphics.drawable.Drawable r0 = r6.L
            boolean r0 = r0.setState(r7)
            r4 = r4 | r0
        L_0x0104:
            android.graphics.drawable.Drawable r0 = r6.X
            boolean r0 = w1(r0)
            if (r0 == 0) goto L_0x0113
            android.graphics.drawable.Drawable r0 = r6.X
            boolean r0 = r0.setState(r7)
            r4 = r4 | r0
        L_0x0113:
            android.graphics.drawable.Drawable r0 = r6.Q
            boolean r0 = w1(r0)
            if (r0 == 0) goto L_0x0130
            int r0 = r7.length
            int r3 = r8.length
            int r0 = r0 + r3
            int[] r0 = new int[r0]
            int r3 = r7.length
            java.lang.System.arraycopy(r7, r2, r0, r2, r3)
            int r7 = r7.length
            int r3 = r8.length
            java.lang.System.arraycopy(r8, r2, r0, r7, r3)
            android.graphics.drawable.Drawable r7 = r6.Q
            boolean r7 = r7.setState(r0)
            r4 = r4 | r7
        L_0x0130:
            boolean r7 = defpackage.ha1.a
            if (r7 == 0) goto L_0x0143
            android.graphics.drawable.Drawable r7 = r6.R
            boolean r7 = w1(r7)
            if (r7 == 0) goto L_0x0143
            android.graphics.drawable.Drawable r7 = r6.R
            boolean r7 = r7.setState(r8)
            r4 = r4 | r7
        L_0x0143:
            if (r4 == 0) goto L_0x0148
            r6.invalidateSelf()
        L_0x0148:
            if (r1 == 0) goto L_0x014d
            r6.z1()
        L_0x014d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.A1(int[], int[]):boolean");
    }

    private void B0(Canvas canvas, Rect rect) {
        if (!this.L0) {
            this.k0.setColor(this.s0);
            this.k0.setStyle(Paint.Style.FILL);
            this.k0.setColorFilter(p1());
            this.n0.set(rect);
            canvas.drawRoundRect(this.n0, M0(), M0(), this.k0);
        }
    }

    private void C0(Canvas canvas, Rect rect) {
        if (R2()) {
            p0(rect, this.n0);
            RectF rectF = this.n0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.L.setBounds(0, 0, (int) this.n0.width(), (int) this.n0.height());
            this.L.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    private void D0(Canvas canvas, Rect rect) {
        if (this.H > Utils.FLOAT_EPSILON && !this.L0) {
            this.k0.setColor(this.u0);
            this.k0.setStyle(Paint.Style.STROKE);
            if (!this.L0) {
                this.k0.setColorFilter(p1());
            }
            RectF rectF = this.n0;
            float f = this.H;
            rectF.set(((float) rect.left) + (f / 2.0f), ((float) rect.top) + (f / 2.0f), ((float) rect.right) - (f / 2.0f), ((float) rect.bottom) - (f / 2.0f));
            float f2 = this.F - (this.H / 2.0f);
            canvas.drawRoundRect(this.n0, f2, f2, this.k0);
        }
    }

    private void E0(Canvas canvas, Rect rect) {
        if (!this.L0) {
            this.k0.setColor(this.r0);
            this.k0.setStyle(Paint.Style.FILL);
            this.n0.set(rect);
            canvas.drawRoundRect(this.n0, M0(), M0(), this.k0);
        }
    }

    private void F0(Canvas canvas, Rect rect) {
        Drawable drawable;
        if (S2()) {
            s0(rect, this.n0);
            RectF rectF = this.n0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.Q.setBounds(0, 0, (int) this.n0.width(), (int) this.n0.height());
            if (ha1.a) {
                this.R.setBounds(this.Q.getBounds());
                this.R.jumpToCurrentState();
                drawable = this.R;
            } else {
                drawable = this.Q;
            }
            drawable.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    private void G0(Canvas canvas, Rect rect) {
        this.k0.setColor(this.v0);
        this.k0.setStyle(Paint.Style.FILL);
        this.n0.set(rect);
        if (!this.L0) {
            canvas.drawRoundRect(this.n0, M0(), M0(), this.k0);
            return;
        }
        h(new RectF(rect), this.p0);
        super.p(canvas, this.k0, this.p0, u());
    }

    private void H0(Canvas canvas, Rect rect) {
        Paint paint = this.l0;
        if (paint != null) {
            paint.setColor(j2.m(-16777216, 127));
            canvas.drawRect(rect, this.l0);
            if (R2() || Q2()) {
                p0(rect, this.n0);
                canvas.drawRect(this.n0, this.l0);
            }
            if (this.J != null) {
                canvas.drawLine((float) rect.left, rect.exactCenterY(), (float) rect.right, rect.exactCenterY(), this.l0);
            }
            if (S2()) {
                s0(rect, this.n0);
                canvas.drawRect(this.n0, this.l0);
            }
            this.l0.setColor(j2.m(-65536, 127));
            r0(rect, this.n0);
            canvas.drawRect(this.n0, this.l0);
            this.l0.setColor(j2.m(-16711936, 127));
            t0(rect, this.n0);
            canvas.drawRect(this.n0, this.l0);
        }
    }

    private void I0(Canvas canvas, Rect rect) {
        if (this.J != null) {
            Paint.Align x02 = x0(rect, this.o0);
            v0(rect, this.n0);
            if (this.q0.d() != null) {
                this.q0.e().drawableState = getState();
                this.q0.j(this.j0);
            }
            this.q0.e().setTextAlign(x02);
            int i = 0;
            boolean z = Math.round(this.q0.f(l1().toString())) > Math.round(this.n0.width());
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.n0);
            }
            CharSequence charSequence = this.J;
            if (z && this.I0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.q0.e(), this.n0.width(), this.I0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.o0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.q0.e());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    private boolean Q2() {
        return this.W && this.X != null && this.x0;
    }

    private boolean R2() {
        return this.K && this.L != null;
    }

    private boolean S2() {
        return this.P && this.Q != null;
    }

    private void T2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    private void U2() {
        this.G0 = this.F0 ? ha1.d(this.I) : null;
    }

    @TargetApi(21)
    private void V2() {
        this.R = new RippleDrawable(ha1.d(j1()), this.Q, N0);
    }

    private float d1() {
        Drawable drawable = this.x0 ? this.X : this.L;
        if (this.N > Utils.FLOAT_EPSILON || drawable == null) {
            return this.N;
        }
        float ceil = (float) Math.ceil((double) r.c(this.j0, 24));
        return ((float) drawable.getIntrinsicHeight()) <= ceil ? (float) drawable.getIntrinsicHeight() : ceil;
    }

    private float e1() {
        Drawable drawable = this.x0 ? this.X : this.L;
        return (this.N > Utils.FLOAT_EPSILON || drawable == null) ? this.N : (float) drawable.getIntrinsicWidth();
    }

    private void f2(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            onStateChange(getState());
        }
    }

    private void o0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            androidx.core.graphics.drawable.a.m(drawable, androidx.core.graphics.drawable.a.f(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.Q) {
                if (drawable.isStateful()) {
                    drawable.setState(a1());
                }
                androidx.core.graphics.drawable.a.o(drawable, this.S);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.L;
            if (drawable == drawable2 && this.O) {
                androidx.core.graphics.drawable.a.o(drawable2, this.M);
            }
        }
    }

    private void p0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (R2() || Q2()) {
            float f = this.b0 + this.c0;
            float e1 = e1();
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f2 = ((float) rect.left) + f;
                rectF.left = f2;
                rectF.right = f2 + e1;
            } else {
                float f3 = ((float) rect.right) - f;
                rectF.right = f3;
                rectF.left = f3 - e1;
            }
            float d1 = d1();
            float exactCenterY = rect.exactCenterY() - (d1 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + d1;
        }
    }

    private ColorFilter p1() {
        ColorFilter colorFilter = this.A0;
        return colorFilter != null ? colorFilter : this.B0;
    }

    private void r0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (S2()) {
            float f = this.i0 + this.h0 + this.T + this.g0 + this.f0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.right = ((float) rect.right) - f;
            } else {
                rectF.left = ((float) rect.left) + f;
            }
        }
    }

    private static boolean r1(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private void s0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (S2()) {
            float f = this.i0 + this.h0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f2 = ((float) rect.right) - f;
                rectF.right = f2;
                rectF.left = f2 - this.T;
            } else {
                float f3 = ((float) rect.left) + f;
                rectF.left = f3;
                rectF.right = f3 + this.T;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.T;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    private void t0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (S2()) {
            float f = this.i0 + this.h0 + this.T + this.g0 + this.f0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f2 = (float) rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = (float) i;
                rectF.right = ((float) i) + f;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    private void v0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.J != null) {
            float q02 = this.b0 + q0() + this.e0;
            float u02 = this.i0 + u0() + this.f0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.left = ((float) rect.left) + q02;
                rectF.right = ((float) rect.right) - u02;
            } else {
                rectF.left = ((float) rect.left) + u02;
                rectF.right = ((float) rect.right) - q02;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    private static boolean v1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private float w0() {
        this.q0.e().getFontMetrics(this.m0);
        Paint.FontMetrics fontMetrics = this.m0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private static boolean w1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r0.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean x1(defpackage.da1 r0) {
        /*
            if (r0 == 0) goto L_0x000e
            android.content.res.ColorStateList r0 = r0.a
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.x1(da1):boolean");
    }

    private boolean y0() {
        return this.W && this.X != null && this.V;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0171  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void y1(android.util.AttributeSet r8, int r9, int r10) {
        /*
            r7 = this;
            android.content.Context r0 = r7.j0
            int[] r2 = com.google.android.material.R$styleable.Chip
            r6 = 0
            int[] r5 = new int[r6]
            r1 = r8
            r3 = r9
            r4 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.m.h(r0, r1, r2, r3, r4, r5)
            int r10 = com.google.android.material.R$styleable.Chip_shapeAppearance
            boolean r10 = r9.hasValue(r10)
            r7.L0 = r10
            android.content.Context r10 = r7.j0
            int r0 = com.google.android.material.R$styleable.Chip_chipSurfaceColor
            android.content.res.ColorStateList r10 = defpackage.ca1.a(r10, r9, r0)
            r7.f2(r10)
            android.content.Context r10 = r7.j0
            int r0 = com.google.android.material.R$styleable.Chip_chipBackgroundColor
            android.content.res.ColorStateList r10 = defpackage.ca1.a(r10, r9, r0)
            r7.J1(r10)
            int r10 = com.google.android.material.R$styleable.Chip_chipMinHeight
            r0 = 0
            float r10 = r9.getDimension(r10, r0)
            r7.X1(r10)
            int r10 = com.google.android.material.R$styleable.Chip_chipCornerRadius
            boolean r10 = r9.hasValue(r10)
            if (r10 == 0) goto L_0x0047
            int r10 = com.google.android.material.R$styleable.Chip_chipCornerRadius
            float r10 = r9.getDimension(r10, r0)
            r7.L1(r10)
        L_0x0047:
            android.content.Context r10 = r7.j0
            int r1 = com.google.android.material.R$styleable.Chip_chipStrokeColor
            android.content.res.ColorStateList r10 = defpackage.ca1.a(r10, r9, r1)
            r7.b2(r10)
            int r10 = com.google.android.material.R$styleable.Chip_chipStrokeWidth
            float r10 = r9.getDimension(r10, r0)
            r7.d2(r10)
            android.content.Context r10 = r7.j0
            int r1 = com.google.android.material.R$styleable.Chip_rippleColor
            android.content.res.ColorStateList r10 = defpackage.ca1.a(r10, r9, r1)
            r7.C2(r10)
            int r10 = com.google.android.material.R$styleable.Chip_android_text
            java.lang.CharSequence r10 = r9.getText(r10)
            r7.H2(r10)
            android.content.Context r10 = r7.j0
            int r1 = com.google.android.material.R$styleable.Chip_android_textAppearance
            da1 r10 = defpackage.ca1.f(r10, r9, r1)
            int r1 = com.google.android.material.R$styleable.Chip_android_textSize
            float r2 = r10.i
            float r1 = r9.getDimension(r1, r2)
            r10.i = r1
            r7.I2(r10)
            int r10 = com.google.android.material.R$styleable.Chip_android_ellipsize
            int r10 = r9.getInt(r10, r6)
            r1 = 1
            if (r10 == r1) goto L_0x009a
            r1 = 2
            if (r10 == r1) goto L_0x0097
            r1 = 3
            if (r10 == r1) goto L_0x0094
            goto L_0x009f
        L_0x0094:
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.END
            goto L_0x009c
        L_0x0097:
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L_0x009c
        L_0x009a:
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.START
        L_0x009c:
            r7.u2(r10)
        L_0x009f:
            int r10 = com.google.android.material.R$styleable.Chip_chipIconVisible
            boolean r10 = r9.getBoolean(r10, r6)
            r7.W1(r10)
            java.lang.String r10 = "http://schemas.android.com/apk/res-auto"
            if (r8 == 0) goto L_0x00c5
            java.lang.String r1 = "chipIconEnabled"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 == 0) goto L_0x00c5
            java.lang.String r1 = "chipIconVisible"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 != 0) goto L_0x00c5
            int r1 = com.google.android.material.R$styleable.Chip_chipIconEnabled
            boolean r1 = r9.getBoolean(r1, r6)
            r7.W1(r1)
        L_0x00c5:
            android.content.Context r1 = r7.j0
            int r2 = com.google.android.material.R$styleable.Chip_chipIcon
            android.graphics.drawable.Drawable r1 = defpackage.ca1.d(r1, r9, r2)
            r7.P1(r1)
            int r1 = com.google.android.material.R$styleable.Chip_chipIconTint
            boolean r1 = r9.hasValue(r1)
            if (r1 == 0) goto L_0x00e3
            android.content.Context r1 = r7.j0
            int r2 = com.google.android.material.R$styleable.Chip_chipIconTint
            android.content.res.ColorStateList r1 = defpackage.ca1.a(r1, r9, r2)
            r7.T1(r1)
        L_0x00e3:
            int r1 = com.google.android.material.R$styleable.Chip_chipIconSize
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r1 = r9.getDimension(r1, r2)
            r7.R1(r1)
            int r1 = com.google.android.material.R$styleable.Chip_closeIconVisible
            boolean r1 = r9.getBoolean(r1, r6)
            r7.s2(r1)
            if (r8 == 0) goto L_0x0112
            java.lang.String r1 = "closeIconEnabled"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 == 0) goto L_0x0112
            java.lang.String r1 = "closeIconVisible"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 != 0) goto L_0x0112
            int r1 = com.google.android.material.R$styleable.Chip_closeIconEnabled
            boolean r1 = r9.getBoolean(r1, r6)
            r7.s2(r1)
        L_0x0112:
            android.content.Context r1 = r7.j0
            int r2 = com.google.android.material.R$styleable.Chip_closeIcon
            android.graphics.drawable.Drawable r1 = defpackage.ca1.d(r1, r9, r2)
            r7.g2(r1)
            android.content.Context r1 = r7.j0
            int r2 = com.google.android.material.R$styleable.Chip_closeIconTint
            android.content.res.ColorStateList r1 = defpackage.ca1.a(r1, r9, r2)
            r7.q2(r1)
            int r1 = com.google.android.material.R$styleable.Chip_closeIconSize
            float r1 = r9.getDimension(r1, r0)
            r7.l2(r1)
            int r1 = com.google.android.material.R$styleable.Chip_android_checkable
            boolean r1 = r9.getBoolean(r1, r6)
            r7.B1(r1)
            int r1 = com.google.android.material.R$styleable.Chip_checkedIconVisible
            boolean r1 = r9.getBoolean(r1, r6)
            r7.I1(r1)
            if (r8 == 0) goto L_0x015e
            java.lang.String r1 = "checkedIconEnabled"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 == 0) goto L_0x015e
            java.lang.String r1 = "checkedIconVisible"
            java.lang.String r8 = r8.getAttributeValue(r10, r1)
            if (r8 != 0) goto L_0x015e
            int r8 = com.google.android.material.R$styleable.Chip_checkedIconEnabled
            boolean r8 = r9.getBoolean(r8, r6)
            r7.I1(r8)
        L_0x015e:
            android.content.Context r8 = r7.j0
            int r10 = com.google.android.material.R$styleable.Chip_checkedIcon
            android.graphics.drawable.Drawable r8 = defpackage.ca1.d(r8, r9, r10)
            r7.D1(r8)
            int r8 = com.google.android.material.R$styleable.Chip_checkedIconTint
            boolean r8 = r9.hasValue(r8)
            if (r8 == 0) goto L_0x017c
            android.content.Context r8 = r7.j0
            int r10 = com.google.android.material.R$styleable.Chip_checkedIconTint
            android.content.res.ColorStateList r8 = defpackage.ca1.a(r8, r9, r10)
            r7.F1(r8)
        L_0x017c:
            android.content.Context r8 = r7.j0
            int r10 = com.google.android.material.R$styleable.Chip_showMotionSpec
            m91 r8 = defpackage.m91.c(r8, r9, r10)
            r7.F2(r8)
            android.content.Context r8 = r7.j0
            int r10 = com.google.android.material.R$styleable.Chip_hideMotionSpec
            m91 r8 = defpackage.m91.c(r8, r9, r10)
            r7.v2(r8)
            int r8 = com.google.android.material.R$styleable.Chip_chipStartPadding
            float r8 = r9.getDimension(r8, r0)
            r7.Z1(r8)
            int r8 = com.google.android.material.R$styleable.Chip_iconStartPadding
            float r8 = r9.getDimension(r8, r0)
            r7.z2(r8)
            int r8 = com.google.android.material.R$styleable.Chip_iconEndPadding
            float r8 = r9.getDimension(r8, r0)
            r7.x2(r8)
            int r8 = com.google.android.material.R$styleable.Chip_textStartPadding
            float r8 = r9.getDimension(r8, r0)
            r7.M2(r8)
            int r8 = com.google.android.material.R$styleable.Chip_textEndPadding
            float r8 = r9.getDimension(r8, r0)
            r7.K2(r8)
            int r8 = com.google.android.material.R$styleable.Chip_closeIconStartPadding
            float r8 = r9.getDimension(r8, r0)
            r7.n2(r8)
            int r8 = com.google.android.material.R$styleable.Chip_closeIconEndPadding
            float r8 = r9.getDimension(r8, r0)
            r7.i2(r8)
            int r8 = com.google.android.material.R$styleable.Chip_chipEndPadding
            float r8 = r9.getDimension(r8, r0)
            r7.N1(r8)
            int r8 = com.google.android.material.R$styleable.Chip_android_maxWidth
            r10 = 2147483647(0x7fffffff, float:NaN)
            int r8 = r9.getDimensionPixelSize(r8, r10)
            r7.B2(r8)
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.y1(android.util.AttributeSet, int, int):void");
    }

    public static a z0(Context context, AttributeSet attributeSet, int i, int i2) {
        a aVar = new a(context, attributeSet, i, i2);
        aVar.y1(attributeSet, i, i2);
        return aVar;
    }

    public void A2(int i) {
        z2(this.j0.getResources().getDimension(i));
    }

    public void B1(boolean z) {
        if (this.V != z) {
            this.V = z;
            float q02 = q0();
            if (!z && this.x0) {
                this.x0 = false;
            }
            float q03 = q0();
            invalidateSelf();
            if (q02 != q03) {
                z1();
            }
        }
    }

    public void B2(int i) {
        this.K0 = i;
    }

    public void C1(int i) {
        B1(this.j0.getResources().getBoolean(i));
    }

    public void C2(ColorStateList colorStateList) {
        if (this.I != colorStateList) {
            this.I = colorStateList;
            U2();
            onStateChange(getState());
        }
    }

    public void D1(Drawable drawable) {
        if (this.X != drawable) {
            float q02 = q0();
            this.X = drawable;
            float q03 = q0();
            T2(this.X);
            o0(this.X);
            invalidateSelf();
            if (q02 != q03) {
                z1();
            }
        }
    }

    public void D2(int i) {
        C2(f.c(this.j0, i));
    }

    public void E1(int i) {
        D1(f.d(this.j0, i));
    }

    /* access modifiers changed from: package-private */
    public void E2(boolean z) {
        this.J0 = z;
    }

    public void F1(ColorStateList colorStateList) {
        if (this.Y != colorStateList) {
            this.Y = colorStateList;
            if (y0()) {
                androidx.core.graphics.drawable.a.o(this.X, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void F2(m91 m91) {
        this.Z = m91;
    }

    public void G1(int i) {
        F1(f.c(this.j0, i));
    }

    public void G2(int i) {
        F2(m91.d(this.j0, i));
    }

    public void H1(int i) {
        I1(this.j0.getResources().getBoolean(i));
    }

    public void H2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.J, charSequence)) {
            this.J = charSequence;
            this.q0.i(true);
            invalidateSelf();
            z1();
        }
    }

    public void I1(boolean z) {
        if (this.W != z) {
            boolean Q2 = Q2();
            this.W = z;
            boolean Q22 = Q2();
            if (Q2 != Q22) {
                if (Q22) {
                    o0(this.X);
                } else {
                    T2(this.X);
                }
                invalidateSelf();
                z1();
            }
        }
    }

    public void I2(da1 da1) {
        this.q0.h(da1, this.j0);
    }

    public Drawable J0() {
        return this.X;
    }

    public void J1(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            onStateChange(getState());
        }
    }

    public void J2(int i) {
        I2(new da1(this.j0, i));
    }

    public ColorStateList K0() {
        return this.Y;
    }

    public void K1(int i) {
        J1(f.c(this.j0, i));
    }

    public void K2(float f) {
        if (this.f0 != f) {
            this.f0 = f;
            invalidateSelf();
            z1();
        }
    }

    public ColorStateList L0() {
        return this.D;
    }

    @Deprecated
    public void L1(float f) {
        if (this.F != f) {
            this.F = f;
            setShapeAppearanceModel(D().w(f));
        }
    }

    public void L2(int i) {
        K2(this.j0.getResources().getDimension(i));
    }

    public float M0() {
        return this.L0 ? G() : this.F;
    }

    @Deprecated
    public void M1(int i) {
        L1(this.j0.getResources().getDimension(i));
    }

    public void M2(float f) {
        if (this.e0 != f) {
            this.e0 = f;
            invalidateSelf();
            z1();
        }
    }

    public float N0() {
        return this.i0;
    }

    public void N1(float f) {
        if (this.i0 != f) {
            this.i0 = f;
            invalidateSelf();
            z1();
        }
    }

    public void N2(int i) {
        M2(this.j0.getResources().getDimension(i));
    }

    public Drawable O0() {
        Drawable drawable = this.L;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void O1(int i) {
        N1(this.j0.getResources().getDimension(i));
    }

    public void O2(boolean z) {
        if (this.F0 != z) {
            this.F0 = z;
            U2();
            onStateChange(getState());
        }
    }

    public float P0() {
        return this.N;
    }

    public void P1(Drawable drawable) {
        Drawable O0 = O0();
        if (O0 != drawable) {
            float q02 = q0();
            this.L = drawable != null ? androidx.core.graphics.drawable.a.r(drawable).mutate() : null;
            float q03 = q0();
            T2(O0);
            if (R2()) {
                o0(this.L);
            }
            invalidateSelf();
            if (q02 != q03) {
                z1();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean P2() {
        return this.J0;
    }

    public ColorStateList Q0() {
        return this.M;
    }

    public void Q1(int i) {
        P1(f.d(this.j0, i));
    }

    public float R0() {
        return this.E;
    }

    public void R1(float f) {
        if (this.N != f) {
            float q02 = q0();
            this.N = f;
            float q03 = q0();
            invalidateSelf();
            if (q02 != q03) {
                z1();
            }
        }
    }

    public float S0() {
        return this.b0;
    }

    public void S1(int i) {
        R1(this.j0.getResources().getDimension(i));
    }

    public ColorStateList T0() {
        return this.G;
    }

    public void T1(ColorStateList colorStateList) {
        this.O = true;
        if (this.M != colorStateList) {
            this.M = colorStateList;
            if (R2()) {
                androidx.core.graphics.drawable.a.o(this.L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public float U0() {
        return this.H;
    }

    public void U1(int i) {
        T1(f.c(this.j0, i));
    }

    public Drawable V0() {
        Drawable drawable = this.Q;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void V1(int i) {
        W1(this.j0.getResources().getBoolean(i));
    }

    public CharSequence W0() {
        return this.U;
    }

    public void W1(boolean z) {
        if (this.K != z) {
            boolean R2 = R2();
            this.K = z;
            boolean R22 = R2();
            if (R2 != R22) {
                if (R22) {
                    o0(this.L);
                } else {
                    T2(this.L);
                }
                invalidateSelf();
                z1();
            }
        }
    }

    public float X0() {
        return this.h0;
    }

    public void X1(float f) {
        if (this.E != f) {
            this.E = f;
            invalidateSelf();
            z1();
        }
    }

    public float Y0() {
        return this.T;
    }

    public void Y1(int i) {
        X1(this.j0.getResources().getDimension(i));
    }

    public float Z0() {
        return this.g0;
    }

    public void Z1(float f) {
        if (this.b0 != f) {
            this.b0 = f;
            invalidateSelf();
            z1();
        }
    }

    public void a() {
        z1();
        invalidateSelf();
    }

    public int[] a1() {
        return this.E0;
    }

    public void a2(int i) {
        Z1(this.j0.getResources().getDimension(i));
    }

    public ColorStateList b1() {
        return this.S;
    }

    public void b2(ColorStateList colorStateList) {
        if (this.G != colorStateList) {
            this.G = colorStateList;
            if (this.L0) {
                j0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void c1(RectF rectF) {
        t0(getBounds(), rectF);
    }

    public void c2(int i) {
        b2(f.c(this.j0, i));
    }

    public void d2(float f) {
        if (this.H != f) {
            this.H = f;
            this.k0.setStrokeWidth(f);
            if (this.L0) {
                super.k0(f);
            }
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i = 0;
            int i2 = this.z0;
            if (i2 < 255) {
                i = s91.a(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i2);
            }
            E0(canvas, bounds);
            B0(canvas, bounds);
            if (this.L0) {
                super.draw(canvas);
            }
            D0(canvas, bounds);
            G0(canvas, bounds);
            C0(canvas, bounds);
            A0(canvas, bounds);
            if (this.J0) {
                I0(canvas, bounds);
            }
            F0(canvas, bounds);
            H0(canvas, bounds);
            if (this.z0 < 255) {
                canvas.restoreToCount(i);
            }
        }
    }

    public void e2(int i) {
        d2(this.j0.getResources().getDimension(i));
    }

    public TextUtils.TruncateAt f1() {
        return this.I0;
    }

    public m91 g1() {
        return this.a0;
    }

    public void g2(Drawable drawable) {
        Drawable V0 = V0();
        if (V0 != drawable) {
            float u02 = u0();
            this.Q = drawable != null ? androidx.core.graphics.drawable.a.r(drawable).mutate() : null;
            if (ha1.a) {
                V2();
            }
            float u03 = u0();
            T2(V0);
            if (S2()) {
                o0(this.Q);
            }
            invalidateSelf();
            if (u02 != u03) {
                z1();
            }
        }
    }

    public int getAlpha() {
        return this.z0;
    }

    public ColorFilter getColorFilter() {
        return this.A0;
    }

    public int getIntrinsicHeight() {
        return (int) this.E;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.b0 + q0() + this.e0 + this.q0.f(l1().toString()) + this.f0 + u0() + this.i0), this.K0);
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.L0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.F);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.F);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    public float h1() {
        return this.d0;
    }

    public void h2(CharSequence charSequence) {
        if (this.U != charSequence) {
            this.U = h3.c().h(charSequence);
            invalidateSelf();
        }
    }

    public float i1() {
        return this.c0;
    }

    public void i2(float f) {
        if (this.h0 != f) {
            this.h0 = f;
            invalidateSelf();
            if (S2()) {
                z1();
            }
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isStateful() {
        return v1(this.C) || v1(this.D) || v1(this.G) || (this.F0 && v1(this.G0)) || x1(this.q0.d()) || y0() || w1(this.L) || w1(this.X) || v1(this.C0);
    }

    public ColorStateList j1() {
        return this.I;
    }

    public void j2(int i) {
        i2(this.j0.getResources().getDimension(i));
    }

    public m91 k1() {
        return this.Z;
    }

    public void k2(int i) {
        g2(f.d(this.j0, i));
    }

    public CharSequence l1() {
        return this.J;
    }

    public void l2(float f) {
        if (this.T != f) {
            this.T = f;
            invalidateSelf();
            if (S2()) {
                z1();
            }
        }
    }

    public da1 m1() {
        return this.q0.d();
    }

    public void m2(int i) {
        l2(this.j0.getResources().getDimension(i));
    }

    public float n1() {
        return this.f0;
    }

    public void n2(float f) {
        if (this.g0 != f) {
            this.g0 = f;
            invalidateSelf();
            if (S2()) {
                z1();
            }
        }
    }

    public float o1() {
        return this.e0;
    }

    public void o2(int i) {
        n2(this.j0.getResources().getDimension(i));
    }

    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (R2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.L, i);
        }
        if (Q2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.X, i);
        }
        if (S2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.Q, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (R2()) {
            onLevelChange |= this.L.setLevel(i);
        }
        if (Q2()) {
            onLevelChange |= this.X.setLevel(i);
        }
        if (S2()) {
            onLevelChange |= this.Q.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean onStateChange(int[] iArr) {
        if (this.L0) {
            super.onStateChange(iArr);
        }
        return A1(iArr, a1());
    }

    public boolean p2(int[] iArr) {
        if (Arrays.equals(this.E0, iArr)) {
            return false;
        }
        this.E0 = iArr;
        if (S2()) {
            return A1(getState(), iArr);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public float q0() {
        return (R2() || Q2()) ? this.c0 + e1() + this.d0 : Utils.FLOAT_EPSILON;
    }

    public boolean q1() {
        return this.F0;
    }

    public void q2(ColorStateList colorStateList) {
        if (this.S != colorStateList) {
            this.S = colorStateList;
            if (S2()) {
                androidx.core.graphics.drawable.a.o(this.Q, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void r2(int i) {
        q2(f.c(this.j0, i));
    }

    public boolean s1() {
        return this.V;
    }

    public void s2(boolean z) {
        if (this.P != z) {
            boolean S2 = S2();
            this.P = z;
            boolean S22 = S2();
            if (S2 != S22) {
                if (S22) {
                    o0(this.Q);
                } else {
                    T2(this.Q);
                }
                invalidateSelf();
                z1();
            }
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (this.z0 != i) {
            this.z0 = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.A0 != colorFilter) {
            this.A0 = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.C0 != colorStateList) {
            this.C0 = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.D0 != mode) {
            this.D0 = mode;
            this.B0 = v91.b(this, this.C0, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (R2()) {
            visible |= this.L.setVisible(z, z2);
        }
        if (Q2()) {
            visible |= this.X.setVisible(z, z2);
        }
        if (S2()) {
            visible |= this.Q.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public boolean t1() {
        return w1(this.Q);
    }

    public void t2(C0095a aVar) {
        this.H0 = new WeakReference<>(aVar);
    }

    /* access modifiers changed from: package-private */
    public float u0() {
        return S2() ? this.g0 + this.T + this.h0 : Utils.FLOAT_EPSILON;
    }

    public boolean u1() {
        return this.P;
    }

    public void u2(TextUtils.TruncateAt truncateAt) {
        this.I0 = truncateAt;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void v2(m91 m91) {
        this.a0 = m91;
    }

    public void w2(int i) {
        v2(m91.d(this.j0, i));
    }

    /* access modifiers changed from: package-private */
    public Paint.Align x0(Rect rect, PointF pointF) {
        pointF.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
        Paint.Align align = Paint.Align.LEFT;
        if (this.J != null) {
            float q02 = this.b0 + q0() + this.e0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                pointF.x = ((float) rect.left) + q02;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = ((float) rect.right) - q02;
                align = Paint.Align.RIGHT;
            }
            pointF.y = ((float) rect.centerY()) - w0();
        }
        return align;
    }

    public void x2(float f) {
        if (this.d0 != f) {
            float q02 = q0();
            this.d0 = f;
            float q03 = q0();
            invalidateSelf();
            if (q02 != q03) {
                z1();
            }
        }
    }

    public void y2(int i) {
        x2(this.j0.getResources().getDimension(i));
    }

    /* access modifiers changed from: protected */
    public void z1() {
        C0095a aVar = (C0095a) this.H0.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void z2(float f) {
        if (this.c0 != f) {
            float q02 = q0();
            this.c0 = f;
            float q03 = q0();
            invalidateSelf();
            if (q02 != q03) {
                z1();
            }
        }
    }
}
