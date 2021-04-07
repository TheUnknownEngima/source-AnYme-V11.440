package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.internal.i;
import defpackage.aa1;

public final class a {
    private static final boolean Z = (Build.VERSION.SDK_INT < 18);
    private static final Paint a0;
    private boolean A;
    private Bitmap B;
    private Paint C;
    private float D;
    private float E;
    private int[] F;
    private boolean G;
    private final TextPaint H;
    private final TextPaint I;
    private TimeInterpolator J;
    private TimeInterpolator K;
    private float L;
    private float M;
    private float N;
    private ColorStateList O;
    private float P;
    private float Q;
    private float R;
    private ColorStateList S;
    private StaticLayout T;
    private float U;
    private float V;
    private float W;
    private CharSequence X;
    private int Y = 1;
    private final View a;
    private boolean b;
    private float c;
    private final Rect d;
    private final Rect e;
    private final RectF f;
    private int g = 16;
    private int h = 16;
    private float i = 15.0f;
    private float j = 15.0f;
    private ColorStateList k;
    private ColorStateList l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private Typeface s;
    private Typeface t;
    private Typeface u;
    private aa1 v;
    private aa1 w;
    private CharSequence x;
    private CharSequence y;
    private boolean z;

    /* renamed from: com.google.android.material.internal.a$a  reason: collision with other inner class name */
    class C0101a implements aa1.a {
        C0101a() {
        }

        public void a(Typeface typeface) {
            a.this.S(typeface);
        }
    }

    class b implements aa1.a {
        b() {
        }

        public void a(Typeface typeface) {
            a.this.b0(typeface);
        }
    }

    static {
        Paint paint = null;
        a0 = paint;
        if (paint != null) {
            paint.setAntiAlias(true);
            a0.setColor(-65281);
        }
    }

    public a(View view) {
        this.a = view;
        this.H = new TextPaint(129);
        this.I = new TextPaint(this.H);
        this.e = new Rect();
        this.d = new Rect();
        this.f = new RectF();
    }

    private void C(TextPaint textPaint) {
        textPaint.setTextSize(this.j);
        textPaint.setTypeface(this.s);
    }

    private void D(TextPaint textPaint) {
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.t);
    }

    private void E(float f2) {
        this.f.left = I((float) this.d.left, (float) this.e.left, f2, this.J);
        this.f.top = I(this.m, this.n, f2, this.J);
        this.f.right = I((float) this.d.right, (float) this.e.right, f2, this.J);
        this.f.bottom = I((float) this.d.bottom, (float) this.e.bottom, f2, this.J);
    }

    private static boolean F(float f2, float f3) {
        return Math.abs(f2 - f3) < 0.001f;
    }

    private boolean G() {
        return o4.y(this.a) == 1;
    }

    private static float I(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return f91.a(f2, f3, f4);
    }

    private static boolean L(Rect rect, int i2, int i3, int i4, int i5) {
        return rect.left == i2 && rect.top == i3 && rect.right == i4 && rect.bottom == i5;
    }

    private void P(float f2) {
        this.U = f2;
        o4.Z(this.a);
    }

    private boolean T(Typeface typeface) {
        aa1 aa1 = this.w;
        if (aa1 != null) {
            aa1.c();
        }
        if (this.s == typeface) {
            return false;
        }
        this.s = typeface;
        return true;
    }

    private void X(float f2) {
        this.V = f2;
        o4.Z(this.a);
    }

    private static int a(int i2, int i3, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb((int) ((((float) Color.alpha(i2)) * f3) + (((float) Color.alpha(i3)) * f2)), (int) ((((float) Color.red(i2)) * f3) + (((float) Color.red(i3)) * f2)), (int) ((((float) Color.green(i2)) * f3) + (((float) Color.green(i3)) * f2)), (int) ((((float) Color.blue(i2)) * f3) + (((float) Color.blue(i3)) * f2)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
            r13 = this;
            float r0 = r13.E
            float r1 = r13.j
            r13.g(r1)
            java.lang.CharSequence r1 = r13.y
            if (r1 == 0) goto L_0x001e
            android.text.StaticLayout r2 = r13.T
            if (r2 == 0) goto L_0x001e
            android.text.TextPaint r3 = r13.H
            int r2 = r2.getWidth()
            float r2 = (float) r2
            android.text.TextUtils$TruncateAt r4 = android.text.TextUtils.TruncateAt.END
            java.lang.CharSequence r1 = android.text.TextUtils.ellipsize(r1, r3, r2, r4)
            r13.X = r1
        L_0x001e:
            java.lang.CharSequence r1 = r13.X
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x002f
            android.text.TextPaint r4 = r13.H
            int r5 = r1.length()
            float r1 = r4.measureText(r1, r2, r5)
            goto L_0x0030
        L_0x002f:
            r1 = 0
        L_0x0030:
            int r4 = r13.h
            boolean r5 = r13.z
            int r4 = defpackage.y3.b(r4, r5)
            r5 = r4 & 112(0x70, float:1.57E-43)
            r6 = 80
            r7 = 48
            r8 = 1073741824(0x40000000, float:2.0)
            if (r5 == r7) goto L_0x006a
            if (r5 == r6) goto L_0x005d
            android.text.TextPaint r5 = r13.H
            float r5 = r5.descent()
            android.text.TextPaint r9 = r13.H
            float r9 = r9.ascent()
            float r5 = r5 - r9
            float r5 = r5 / r8
            android.graphics.Rect r9 = r13.e
            int r9 = r9.centerY()
            float r9 = (float) r9
            float r9 = r9 - r5
            r13.n = r9
            goto L_0x0071
        L_0x005d:
            android.graphics.Rect r5 = r13.e
            int r5 = r5.bottom
            float r5 = (float) r5
            android.text.TextPaint r9 = r13.H
            float r9 = r9.ascent()
            float r5 = r5 + r9
            goto L_0x006f
        L_0x006a:
            android.graphics.Rect r5 = r13.e
            int r5 = r5.top
            float r5 = (float) r5
        L_0x006f:
            r13.n = r5
        L_0x0071:
            r5 = 8388615(0x800007, float:1.1754953E-38)
            r4 = r4 & r5
            r9 = 5
            r10 = 1
            if (r4 == r10) goto L_0x0089
            if (r4 == r9) goto L_0x0083
            android.graphics.Rect r1 = r13.e
            int r1 = r1.left
            float r1 = (float) r1
            r13.p = r1
            goto L_0x0094
        L_0x0083:
            android.graphics.Rect r4 = r13.e
            int r4 = r4.right
            float r4 = (float) r4
            goto L_0x0091
        L_0x0089:
            android.graphics.Rect r4 = r13.e
            int r4 = r4.centerX()
            float r4 = (float) r4
            float r1 = r1 / r8
        L_0x0091:
            float r4 = r4 - r1
            r13.p = r4
        L_0x0094:
            float r1 = r13.i
            r13.g(r1)
            android.text.StaticLayout r1 = r13.T
            if (r1 == 0) goto L_0x00a3
            int r1 = r1.getHeight()
            float r1 = (float) r1
            goto L_0x00a4
        L_0x00a3:
            r1 = 0
        L_0x00a4:
            java.lang.CharSequence r4 = r13.y
            if (r4 == 0) goto L_0x00b3
            android.text.TextPaint r11 = r13.H
            int r12 = r4.length()
            float r4 = r11.measureText(r4, r2, r12)
            goto L_0x00b4
        L_0x00b3:
            r4 = 0
        L_0x00b4:
            android.text.StaticLayout r11 = r13.T
            if (r11 == 0) goto L_0x00c5
            int r12 = r13.Y
            if (r12 <= r10) goto L_0x00c5
            boolean r12 = r13.z
            if (r12 != 0) goto L_0x00c5
            int r4 = r11.getWidth()
            float r4 = (float) r4
        L_0x00c5:
            android.text.StaticLayout r11 = r13.T
            if (r11 == 0) goto L_0x00cd
            float r3 = r11.getLineLeft(r2)
        L_0x00cd:
            r13.W = r3
            int r2 = r13.g
            boolean r3 = r13.z
            int r2 = defpackage.y3.b(r2, r3)
            r3 = r2 & 112(0x70, float:1.57E-43)
            if (r3 == r7) goto L_0x00f7
            if (r3 == r6) goto L_0x00e9
            float r1 = r1 / r8
            android.graphics.Rect r3 = r13.d
            int r3 = r3.centerY()
            float r3 = (float) r3
            float r3 = r3 - r1
        L_0x00e6:
            r13.m = r3
            goto L_0x00fe
        L_0x00e9:
            android.graphics.Rect r3 = r13.d
            int r3 = r3.bottom
            float r3 = (float) r3
            float r3 = r3 - r1
            android.text.TextPaint r1 = r13.H
            float r1 = r1.descent()
            float r3 = r3 + r1
            goto L_0x00e6
        L_0x00f7:
            android.graphics.Rect r1 = r13.d
            int r1 = r1.top
            float r1 = (float) r1
            r13.m = r1
        L_0x00fe:
            r1 = r2 & r5
            if (r1 == r10) goto L_0x0110
            if (r1 == r9) goto L_0x010a
            android.graphics.Rect r1 = r13.d
            int r1 = r1.left
            float r1 = (float) r1
            goto L_0x0119
        L_0x010a:
            android.graphics.Rect r1 = r13.d
            int r1 = r1.right
            float r1 = (float) r1
            goto L_0x0118
        L_0x0110:
            android.graphics.Rect r1 = r13.d
            int r1 = r1.centerX()
            float r1 = (float) r1
            float r4 = r4 / r8
        L_0x0118:
            float r1 = r1 - r4
        L_0x0119:
            r13.o = r1
            r13.h()
            r13.e0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.a.b():void");
    }

    private boolean c0(Typeface typeface) {
        aa1 aa1 = this.v;
        if (aa1 != null) {
            aa1.c();
        }
        if (this.t == typeface) {
            return false;
        }
        this.t = typeface;
        return true;
    }

    private void d() {
        f(this.c);
    }

    private boolean e(CharSequence charSequence) {
        return (G() ? l3.d : l3.c).a(charSequence, 0, charSequence.length());
    }

    private void e0(float f2) {
        g(f2);
        boolean z2 = Z && this.D != 1.0f;
        this.A = z2;
        if (z2) {
            l();
        }
        o4.Z(this.a);
    }

    private void f(float f2) {
        int i2;
        TextPaint textPaint;
        E(f2);
        this.q = I(this.o, this.p, f2, this.J);
        this.r = I(this.m, this.n, f2, this.J);
        e0(I(this.i, this.j, f2, this.K));
        P(1.0f - I(Utils.FLOAT_EPSILON, 1.0f, 1.0f - f2, f91.b));
        X(I(1.0f, Utils.FLOAT_EPSILON, f2, f91.b));
        if (this.l != this.k) {
            textPaint = this.H;
            i2 = a(v(), t(), f2);
        } else {
            textPaint = this.H;
            i2 = t();
        }
        textPaint.setColor(i2);
        this.H.setShadowLayer(I(this.P, this.L, f2, (TimeInterpolator) null), I(this.Q, this.M, f2, (TimeInterpolator) null), I(this.R, this.N, f2, (TimeInterpolator) null), a(u(this.S), u(this.O), f2));
        o4.Z(this.a);
    }

    private void g(float f2) {
        float f3;
        boolean z2;
        boolean z3;
        if (this.x != null) {
            float width = (float) this.e.width();
            float width2 = (float) this.d.width();
            boolean z4 = false;
            int i2 = 1;
            if (F(f2, this.j)) {
                f3 = this.j;
                this.D = 1.0f;
                Typeface typeface = this.u;
                Typeface typeface2 = this.s;
                if (typeface != typeface2) {
                    this.u = typeface2;
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                float f4 = this.i;
                Typeface typeface3 = this.u;
                Typeface typeface4 = this.t;
                if (typeface3 != typeface4) {
                    this.u = typeface4;
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (F(f2, this.i)) {
                    this.D = 1.0f;
                } else {
                    this.D = f2 / this.i;
                }
                float f5 = this.j / this.i;
                width = width2 * f5 > width ? Math.min(width / f5, width2) : width2;
                f3 = f4;
                z2 = z3;
            }
            if (width > Utils.FLOAT_EPSILON) {
                z2 = this.E != f3 || this.G || z2;
                this.E = f3;
                this.G = false;
            }
            if (this.y == null || z2) {
                this.H.setTextSize(this.E);
                this.H.setTypeface(this.u);
                TextPaint textPaint = this.H;
                if (this.D != 1.0f) {
                    z4 = true;
                }
                textPaint.setLinearText(z4);
                this.z = e(this.x);
                if (l0()) {
                    i2 = this.Y;
                }
                StaticLayout i3 = i(i2, width, this.z);
                this.T = i3;
                this.y = i3.getText();
            }
        }
    }

    private void h() {
        Bitmap bitmap = this.B;
        if (bitmap != null) {
            bitmap.recycle();
            this.B = null;
        }
    }

    private StaticLayout i(int i2, float f2, boolean z2) {
        StaticLayout staticLayout;
        try {
            i c2 = i.c(this.x, this.H, (int) f2);
            c2.e(TextUtils.TruncateAt.END);
            c2.g(z2);
            c2.d(Layout.Alignment.ALIGN_NORMAL);
            c2.f(false);
            c2.h(i2);
            staticLayout = c2.a();
        } catch (i.a e2) {
            e2.getCause().getMessage();
            staticLayout = null;
        }
        u3.c(staticLayout);
        return staticLayout;
    }

    private void k(Canvas canvas, float f2, float f3) {
        int alpha = this.H.getAlpha();
        canvas.translate(f2, f3);
        float f4 = (float) alpha;
        this.H.setAlpha((int) (this.V * f4));
        this.T.draw(canvas);
        this.H.setAlpha((int) (this.U * f4));
        int lineBaseline = this.T.getLineBaseline(0);
        CharSequence charSequence = this.X;
        float f5 = (float) lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), Utils.FLOAT_EPSILON, f5, this.H);
        String trim = this.X.toString().trim();
        if (trim.endsWith("…")) {
            trim = trim.substring(0, trim.length() - 1);
        }
        String str = trim;
        this.H.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.T.getLineEnd(0), str.length()), Utils.FLOAT_EPSILON, f5, this.H);
    }

    private void l() {
        if (this.B == null && !this.d.isEmpty() && !TextUtils.isEmpty(this.y)) {
            f(Utils.FLOAT_EPSILON);
            int width = this.T.getWidth();
            int height = this.T.getHeight();
            if (width > 0 && height > 0) {
                this.B = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.T.draw(new Canvas(this.B));
                if (this.C == null) {
                    this.C = new Paint(3);
                }
            }
        }
    }

    private boolean l0() {
        return this.Y > 1 && !this.z && !this.A;
    }

    private float q(int i2, int i3) {
        return (i3 == 17 || (i3 & 7) == 1) ? (((float) i2) / 2.0f) - (c() / 2.0f) : ((i3 & 8388613) == 8388613 || (i3 & 5) == 5) ? this.z ? (float) this.e.left : ((float) this.e.right) - c() : this.z ? ((float) this.e.right) - c() : (float) this.e.left;
    }

    private float r(RectF rectF, int i2, int i3) {
        return (i3 == 17 || (i3 & 7) == 1) ? (((float) i2) / 2.0f) + (c() / 2.0f) : ((i3 & 8388613) == 8388613 || (i3 & 5) == 5) ? this.z ? rectF.left + c() : (float) this.e.right : this.z ? (float) this.e.right : rectF.left + c();
    }

    private int u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.F;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private int v() {
        return u(this.k);
    }

    public int A() {
        return this.Y;
    }

    public CharSequence B() {
        return this.x;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean H() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.l
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0014
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.k
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0016
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.a.H():boolean");
    }

    /* access modifiers changed from: package-private */
    public void J() {
        this.b = this.e.width() > 0 && this.e.height() > 0 && this.d.width() > 0 && this.d.height() > 0;
    }

    public void K() {
        if (this.a.getHeight() > 0 && this.a.getWidth() > 0) {
            b();
            d();
        }
    }

    public void M(int i2, int i3, int i4, int i5) {
        if (!L(this.e, i2, i3, i4, i5)) {
            this.e.set(i2, i3, i4, i5);
            this.G = true;
            J();
        }
    }

    public void N(Rect rect) {
        M(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void O(int i2) {
        da1 da1 = new da1(this.a.getContext(), i2);
        ColorStateList colorStateList = da1.a;
        if (colorStateList != null) {
            this.l = colorStateList;
        }
        float f2 = da1.i;
        if (f2 != Utils.FLOAT_EPSILON) {
            this.j = f2;
        }
        ColorStateList colorStateList2 = da1.b;
        if (colorStateList2 != null) {
            this.O = colorStateList2;
        }
        this.M = da1.f;
        this.N = da1.g;
        this.L = da1.h;
        aa1 aa1 = this.w;
        if (aa1 != null) {
            aa1.c();
        }
        this.w = new aa1(new C0101a(), da1.e());
        da1.h(this.a.getContext(), this.w);
        K();
    }

    public void Q(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            K();
        }
    }

    public void R(int i2) {
        if (this.h != i2) {
            this.h = i2;
            K();
        }
    }

    public void S(Typeface typeface) {
        if (T(typeface)) {
            K();
        }
    }

    public void U(int i2, int i3, int i4, int i5) {
        if (!L(this.d, i2, i3, i4, i5)) {
            this.d.set(i2, i3, i4, i5);
            this.G = true;
            J();
        }
    }

    public void V(Rect rect) {
        U(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void W(int i2) {
        da1 da1 = new da1(this.a.getContext(), i2);
        ColorStateList colorStateList = da1.a;
        if (colorStateList != null) {
            this.k = colorStateList;
        }
        float f2 = da1.i;
        if (f2 != Utils.FLOAT_EPSILON) {
            this.i = f2;
        }
        ColorStateList colorStateList2 = da1.b;
        if (colorStateList2 != null) {
            this.S = colorStateList2;
        }
        this.Q = da1.f;
        this.R = da1.g;
        this.P = da1.h;
        aa1 aa1 = this.v;
        if (aa1 != null) {
            aa1.c();
        }
        this.v = new aa1(new b(), da1.e());
        da1.h(this.a.getContext(), this.v);
        K();
    }

    public void Y(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            K();
        }
    }

    public void Z(int i2) {
        if (this.g != i2) {
            this.g = i2;
            K();
        }
    }

    public void a0(float f2) {
        if (this.i != f2) {
            this.i = f2;
            K();
        }
    }

    public void b0(Typeface typeface) {
        if (c0(typeface)) {
            K();
        }
    }

    public float c() {
        if (this.x == null) {
            return Utils.FLOAT_EPSILON;
        }
        C(this.I);
        TextPaint textPaint = this.I;
        CharSequence charSequence = this.x;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public void d0(float f2) {
        float a2 = y2.a(f2, Utils.FLOAT_EPSILON, 1.0f);
        if (a2 != this.c) {
            this.c = a2;
            d();
        }
    }

    public void f0(int i2) {
        if (i2 != this.Y) {
            this.Y = i2;
            h();
            K();
        }
    }

    public void g0(TimeInterpolator timeInterpolator) {
        this.J = timeInterpolator;
        K();
    }

    public final boolean h0(int[] iArr) {
        this.F = iArr;
        if (!H()) {
            return false;
        }
        K();
        return true;
    }

    public void i0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.x, charSequence)) {
            this.x = charSequence;
            this.y = null;
            h();
            K();
        }
    }

    public void j(Canvas canvas) {
        int save = canvas.save();
        if (this.y != null && this.b) {
            boolean z2 = false;
            float lineLeft = (this.q + this.T.getLineLeft(0)) - (this.W * 2.0f);
            this.H.setTextSize(this.E);
            float f2 = this.q;
            float f3 = this.r;
            if (this.A && this.B != null) {
                z2 = true;
            }
            float f4 = this.D;
            if (f4 != 1.0f) {
                canvas.scale(f4, f4, f2, f3);
            }
            if (z2) {
                canvas.drawBitmap(this.B, f2, f3, this.C);
                canvas.restoreToCount(save);
                return;
            }
            if (l0()) {
                k(canvas, lineLeft, f3);
            } else {
                canvas.translate(f2, f3);
                this.T.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    public void j0(TimeInterpolator timeInterpolator) {
        this.K = timeInterpolator;
        K();
    }

    public void k0(Typeface typeface) {
        boolean T2 = T(typeface);
        boolean c0 = c0(typeface);
        if (T2 || c0) {
            K();
        }
    }

    public void m(RectF rectF, int i2, int i3) {
        this.z = e(this.x);
        rectF.left = q(i2, i3);
        rectF.top = (float) this.e.top;
        rectF.right = r(rectF, i2, i3);
        rectF.bottom = ((float) this.e.top) + p();
    }

    public ColorStateList n() {
        return this.l;
    }

    public int o() {
        return this.h;
    }

    public float p() {
        C(this.I);
        return -this.I.ascent();
    }

    public Typeface s() {
        Typeface typeface = this.s;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int t() {
        return u(this.l);
    }

    public int w() {
        return this.g;
    }

    public float x() {
        D(this.I);
        return -this.I.ascent();
    }

    public Typeface y() {
        Typeface typeface = this.t;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public float z() {
        return this.c;
    }
}
