package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.github.mikephil.charting.utils.Utils;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

final class f {
    private float A;
    private float B;
    private int C;
    private int D;
    private int E;
    private int F;
    private StaticLayout G;
    private StaticLayout H;
    private int I;
    private int J;
    private int K;
    private Rect L;
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final TextPaint f;
    private final Paint g;
    private final Paint h;
    private CharSequence i;
    private Layout.Alignment j;
    private Bitmap k;
    private float l;
    private int m;
    private int n;
    private float o;
    private int p;
    private float q;
    private float r;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private float z;

    public f(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{16843287, 16843288}, 0, 0);
        this.e = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = (float) Math.round((((float) context.getResources().getDisplayMetrics().densityDpi) * 2.0f) / 160.0f);
        this.a = round;
        this.b = round;
        this.c = round;
        TextPaint textPaint = new TextPaint();
        this.f = textPaint;
        textPaint.setAntiAlias(true);
        this.f.setSubpixelText(true);
        Paint paint = new Paint();
        this.g = paint;
        paint.setAntiAlias(true);
        this.g.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setAntiAlias(true);
        this.h.setFilterBitmap(true);
    }

    private static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    @RequiresNonNull({"cueBitmap", "bitmapRect"})
    private void c(Canvas canvas) {
        canvas.drawBitmap(this.k, (Rect) null, this.L, this.h);
    }

    private void d(Canvas canvas, boolean z2) {
        if (z2) {
            e(canvas);
            return;
        }
        q40.e(this.L);
        q40.e(this.k);
        c(canvas);
    }

    private void e(Canvas canvas) {
        StaticLayout staticLayout = this.G;
        StaticLayout staticLayout2 = this.H;
        if (staticLayout != null && staticLayout2 != null) {
            int save = canvas.save();
            canvas.translate((float) this.I, (float) this.J);
            if (Color.alpha(this.w) > 0) {
                this.g.setColor(this.w);
                canvas.drawRect((float) (-this.K), Utils.FLOAT_EPSILON, (float) (staticLayout.getWidth() + this.K), (float) staticLayout.getHeight(), this.g);
            }
            int i2 = this.y;
            boolean z2 = true;
            if (i2 == 1) {
                this.f.setStrokeJoin(Paint.Join.ROUND);
                this.f.setStrokeWidth(this.a);
                this.f.setColor(this.x);
                this.f.setStyle(Paint.Style.FILL_AND_STROKE);
                staticLayout2.draw(canvas);
            } else if (i2 == 2) {
                TextPaint textPaint = this.f;
                float f2 = this.b;
                float f3 = this.c;
                textPaint.setShadowLayer(f2, f3, f3, this.x);
            } else if (i2 == 3 || i2 == 4) {
                if (this.y != 3) {
                    z2 = false;
                }
                int i3 = -1;
                int i4 = z2 ? -1 : this.x;
                if (z2) {
                    i3 = this.x;
                }
                float f4 = this.b / 2.0f;
                this.f.setColor(this.u);
                this.f.setStyle(Paint.Style.FILL);
                float f5 = -f4;
                this.f.setShadowLayer(this.b, f5, f5, i4);
                staticLayout2.draw(canvas);
                this.f.setShadowLayer(this.b, f4, f4, i3);
            }
            this.f.setColor(this.u);
            this.f.setStyle(Paint.Style.FILL);
            staticLayout.draw(canvas);
            this.f.setShadowLayer(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 0);
            canvas.restoreToCount(save);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0058  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"cueBitmap"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f() {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.k
            int r1 = r7.E
            int r2 = r7.C
            int r1 = r1 - r2
            int r3 = r7.F
            int r4 = r7.D
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r7.o
            float r5 = r5 * r1
            float r2 = r2 + r5
            float r4 = (float) r4
            float r3 = (float) r3
            float r5 = r7.l
            float r5 = r5 * r3
            float r4 = r4 + r5
            float r5 = r7.q
            float r1 = r1 * r5
            int r1 = java.lang.Math.round(r1)
            float r5 = r7.r
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x002c
            goto L_0x0038
        L_0x002c:
            float r3 = (float) r1
            int r5 = r0.getHeight()
            float r5 = (float) r5
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
        L_0x0038:
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
            int r3 = r7.p
            r5 = 1
            r6 = 2
            if (r3 != r6) goto L_0x0047
            float r3 = (float) r1
        L_0x0045:
            float r2 = r2 - r3
            goto L_0x004d
        L_0x0047:
            if (r3 != r5) goto L_0x004d
            int r3 = r1 / 2
            float r3 = (float) r3
            goto L_0x0045
        L_0x004d:
            int r2 = java.lang.Math.round(r2)
            int r3 = r7.n
            if (r3 != r6) goto L_0x0058
            float r3 = (float) r0
        L_0x0056:
            float r4 = r4 - r3
            goto L_0x005e
        L_0x0058:
            if (r3 != r5) goto L_0x005e
            int r3 = r0 / 2
            float r3 = (float) r3
            goto L_0x0056
        L_0x005e:
            int r3 = java.lang.Math.round(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r1 = r1 + r2
            int r0 = r0 + r3
            r4.<init>(r2, r3, r1, r0)
            r7.L = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.f.f():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x012a A[LOOP:3: B:39:0x0128->B:40:0x012a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01de  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"cueText"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g() {
        /*
            r28 = this;
            r0 = r28
            java.lang.CharSequence r1 = r0.i
            int r2 = r0.E
            int r3 = r0.C
            int r2 = r2 - r3
            int r3 = r0.F
            int r4 = r0.D
            int r3 = r3 - r4
            android.text.TextPaint r4 = r0.f
            float r5 = r0.z
            r4.setTextSize(r5)
            float r4 = r0.z
            r5 = 1040187392(0x3e000000, float:0.125)
            float r4 = r4 * r5
            r5 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r5
            int r4 = (int) r4
            int r5 = r4 * 2
            int r6 = r2 - r5
            float r7 = r0.q
            r8 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r9 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r9 == 0) goto L_0x0030
            float r6 = (float) r6
            float r6 = r6 * r7
            int r6 = (int) r6
        L_0x0030:
            java.lang.String r7 = "SubtitlePainter"
            if (r6 > 0) goto L_0x003a
            java.lang.String r1 = "Skipped drawing subtitle cue (insufficient space)"
            defpackage.b50.h(r7, r1)
            return
        L_0x003a:
            boolean r9 = r0.s
            r17 = 0
            r10 = 16711680(0xff0000, float:2.3418052E-38)
            r15 = 0
            if (r9 != 0) goto L_0x0048
            java.lang.String r1 = r1.toString()
            goto L_0x0098
        L_0x0048:
            boolean r9 = r0.t
            if (r9 != 0) goto L_0x007d
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            r9.<init>(r1)
            int r1 = r9.length()
            java.lang.Class<android.text.style.AbsoluteSizeSpan> r11 = android.text.style.AbsoluteSizeSpan.class
            java.lang.Object[] r11 = r9.getSpans(r15, r1, r11)
            android.text.style.AbsoluteSizeSpan[] r11 = (android.text.style.AbsoluteSizeSpan[]) r11
            java.lang.Class<android.text.style.RelativeSizeSpan> r12 = android.text.style.RelativeSizeSpan.class
            java.lang.Object[] r1 = r9.getSpans(r15, r1, r12)
            android.text.style.RelativeSizeSpan[] r1 = (android.text.style.RelativeSizeSpan[]) r1
            int r12 = r11.length
            r13 = 0
        L_0x0067:
            if (r13 >= r12) goto L_0x0071
            r14 = r11[r13]
            r9.removeSpan(r14)
            int r13 = r13 + 1
            goto L_0x0067
        L_0x0071:
            int r11 = r1.length
            r12 = 0
        L_0x0073:
            if (r12 >= r11) goto L_0x0097
            r13 = r1[r12]
            r9.removeSpan(r13)
            int r12 = r12 + 1
            goto L_0x0073
        L_0x007d:
            float r9 = r0.A
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 <= 0) goto L_0x0098
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            r9.<init>(r1)
            android.text.style.AbsoluteSizeSpan r1 = new android.text.style.AbsoluteSizeSpan
            float r11 = r0.A
            int r11 = (int) r11
            r1.<init>(r11)
            int r11 = r9.length()
            r9.setSpan(r1, r15, r11, r10)
        L_0x0097:
            r1 = r9
        L_0x0098:
            android.text.SpannableStringBuilder r14 = new android.text.SpannableStringBuilder
            r14.<init>(r1)
            int r9 = r0.y
            r13 = 1
            if (r9 != r13) goto L_0x00bb
            int r9 = r14.length()
            java.lang.Class<android.text.style.ForegroundColorSpan> r11 = android.text.style.ForegroundColorSpan.class
            java.lang.Object[] r9 = r14.getSpans(r15, r9, r11)
            android.text.style.ForegroundColorSpan[] r9 = (android.text.style.ForegroundColorSpan[]) r9
            int r11 = r9.length
            r12 = 0
        L_0x00b0:
            if (r12 >= r11) goto L_0x00bb
            r13 = r9[r12]
            r14.removeSpan(r13)
            int r12 = r12 + 1
            r13 = 1
            goto L_0x00b0
        L_0x00bb:
            int r9 = r0.v
            int r9 = android.graphics.Color.alpha(r9)
            r13 = 2
            if (r9 <= 0) goto L_0x00f0
            int r9 = r0.y
            if (r9 == 0) goto L_0x00da
            if (r9 != r13) goto L_0x00cb
            goto L_0x00da
        L_0x00cb:
            android.text.style.BackgroundColorSpan r9 = new android.text.style.BackgroundColorSpan
            int r11 = r0.v
            r9.<init>(r11)
            int r11 = r14.length()
            r14.setSpan(r9, r15, r11, r10)
            goto L_0x00f0
        L_0x00da:
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            r9.<init>(r1)
            android.text.style.BackgroundColorSpan r1 = new android.text.style.BackgroundColorSpan
            int r11 = r0.v
            r1.<init>(r11)
            int r11 = r9.length()
            r9.setSpan(r1, r15, r11, r10)
            r19 = r9
            goto L_0x00f2
        L_0x00f0:
            r19 = r1
        L_0x00f2:
            android.text.Layout$Alignment r1 = r0.j
            if (r1 != 0) goto L_0x00f8
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER
        L_0x00f8:
            android.text.StaticLayout r12 = new android.text.StaticLayout
            android.text.TextPaint r11 = r0.f
            float r10 = r0.d
            float r9 = r0.e
            r18 = 1
            r20 = r9
            r9 = r12
            r21 = r10
            r10 = r19
            r8 = r12
            r12 = r6
            r26 = r4
            r4 = 1
            r13 = r1
            r27 = r14
            r14 = r21
            r15 = r20
            r16 = r18
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r0.G = r8
            int r8 = r8.getHeight()
            android.text.StaticLayout r9 = r0.G
            int r9 = r9.getLineCount()
            r10 = 0
            r15 = 0
        L_0x0128:
            if (r15 >= r9) goto L_0x013d
            android.text.StaticLayout r11 = r0.G
            float r11 = r11.getLineWidth(r15)
            double r11 = (double) r11
            double r11 = java.lang.Math.ceil(r11)
            int r11 = (int) r11
            int r10 = java.lang.Math.max(r11, r10)
            int r15 = r15 + 1
            goto L_0x0128
        L_0x013d:
            float r9 = r0.q
            r11 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L_0x0149
            if (r10 >= r6) goto L_0x0149
            goto L_0x014a
        L_0x0149:
            r6 = r10
        L_0x014a:
            int r6 = r6 + r5
            float r5 = r0.o
            int r9 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r9 == 0) goto L_0x0177
            float r2 = (float) r2
            float r2 = r2 * r5
            int r2 = java.lang.Math.round(r2)
            int r5 = r0.C
            int r2 = r2 + r5
            int r5 = r0.p
            r9 = 2
            if (r5 == r4) goto L_0x0165
            if (r5 == r9) goto L_0x0163
            goto L_0x0169
        L_0x0163:
            int r2 = r2 - r6
            goto L_0x0169
        L_0x0165:
            int r2 = r2 * 2
            int r2 = r2 - r6
            int r2 = r2 / r9
        L_0x0169:
            int r5 = r0.C
            int r2 = java.lang.Math.max(r2, r5)
            int r6 = r6 + r2
            int r5 = r0.E
            int r5 = java.lang.Math.min(r6, r5)
            goto L_0x017f
        L_0x0177:
            r9 = 2
            int r2 = r2 - r6
            int r2 = r2 / r9
            int r5 = r0.C
            int r2 = r2 + r5
            int r5 = r2 + r6
        L_0x017f:
            int r5 = r5 - r2
            if (r5 > 0) goto L_0x0188
            java.lang.String r1 = "Skipped drawing subtitle cue (invalid horizontal positioning)"
            defpackage.b50.h(r7, r1)
            return
        L_0x0188:
            float r6 = r0.l
            r7 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x01e4
            int r7 = r0.m
            if (r7 != 0) goto L_0x01a0
            float r3 = (float) r3
            float r3 = r3 * r6
            int r3 = java.lang.Math.round(r3)
        L_0x019c:
            int r6 = r0.D
        L_0x019e:
            int r3 = r3 + r6
            goto L_0x01c9
        L_0x01a0:
            android.text.StaticLayout r3 = r0.G
            r6 = 0
            int r3 = r3.getLineBottom(r6)
            android.text.StaticLayout r7 = r0.G
            int r6 = r7.getLineTop(r6)
            int r3 = r3 - r6
            float r6 = r0.l
            int r7 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r7 < 0) goto L_0x01bc
            float r3 = (float) r3
            float r6 = r6 * r3
            int r3 = java.lang.Math.round(r6)
            goto L_0x019c
        L_0x01bc:
            r7 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 + r7
            float r3 = (float) r3
            float r6 = r6 * r3
            int r3 = java.lang.Math.round(r6)
            int r6 = r0.F
            goto L_0x019e
        L_0x01c9:
            int r6 = r0.n
            if (r6 != r9) goto L_0x01cf
            int r3 = r3 - r8
            goto L_0x01d5
        L_0x01cf:
            if (r6 != r4) goto L_0x01d5
            int r3 = r3 * 2
            int r3 = r3 - r8
            int r3 = r3 / r9
        L_0x01d5:
            int r4 = r3 + r8
            int r6 = r0.F
            if (r4 <= r6) goto L_0x01de
            int r3 = r6 - r8
            goto L_0x01ef
        L_0x01de:
            int r4 = r0.D
            if (r3 >= r4) goto L_0x01ef
            r3 = r4
            goto L_0x01ef
        L_0x01e4:
            int r4 = r0.F
            int r4 = r4 - r8
            float r3 = (float) r3
            float r6 = r0.B
            float r3 = r3 * r6
            int r3 = (int) r3
            int r3 = r4 - r3
        L_0x01ef:
            android.text.StaticLayout r4 = new android.text.StaticLayout
            android.text.TextPaint r6 = r0.f
            float r7 = r0.d
            float r8 = r0.e
            r25 = 1
            r18 = r4
            r20 = r6
            r21 = r5
            r22 = r1
            r23 = r7
            r24 = r8
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            r0.G = r4
            android.text.StaticLayout r4 = new android.text.StaticLayout
            android.text.TextPaint r6 = r0.f
            float r7 = r0.d
            float r8 = r0.e
            r18 = r4
            r19 = r27
            r20 = r6
            r23 = r7
            r24 = r8
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            r0.H = r4
            r0.I = r2
            r0.J = r3
            r1 = r26
            r0.K = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.f.g():void");
    }

    public void b(h20 h20, boolean z2, boolean z3, g20 g20, float f2, float f3, float f4, Canvas canvas, int i2, int i3, int i4, int i5) {
        h20 h202 = h20;
        boolean z4 = z2;
        boolean z5 = z3;
        g20 g202 = g20;
        float f5 = f2;
        float f6 = f3;
        float f7 = f4;
        Canvas canvas2 = canvas;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        int i9 = i5;
        boolean z6 = h202.g == null;
        int i10 = -16777216;
        if (z6) {
            if (!TextUtils.isEmpty(h202.e)) {
                i10 = (!h202.o || !z4) ? g202.c : h202.p;
            } else {
                return;
            }
        }
        if (a(this.i, h202.e) && v50.b(this.j, h202.f) && this.k == h202.g && this.l == h202.h && this.m == h202.i && v50.b(Integer.valueOf(this.n), Integer.valueOf(h202.j)) && this.o == h202.k && v50.b(Integer.valueOf(this.p), Integer.valueOf(h202.l)) && this.q == h202.m && this.r == h202.n && this.s == z4 && this.t == z5 && this.u == g202.a && this.v == g202.b && this.w == i10 && this.y == g202.d && this.x == g202.e && v50.b(this.f.getTypeface(), g202.f) && this.z == f5 && this.A == f6 && this.B == f7 && this.C == i6 && this.D == i7 && this.E == i8 && this.F == i9) {
            d(canvas, z6);
            return;
        }
        Canvas canvas3 = canvas;
        this.i = h202.e;
        this.j = h202.f;
        this.k = h202.g;
        this.l = h202.h;
        this.m = h202.i;
        this.n = h202.j;
        this.o = h202.k;
        this.p = h202.l;
        this.q = h202.m;
        this.r = h202.n;
        this.s = z4;
        this.t = z5;
        this.u = g202.a;
        this.v = g202.b;
        this.w = i10;
        this.y = g202.d;
        this.x = g202.e;
        this.f.setTypeface(g202.f);
        this.z = f5;
        this.A = f6;
        this.B = f7;
        this.C = i6;
        this.D = i7;
        this.E = i8;
        this.F = i9;
        if (z6) {
            q40.e(this.i);
            g();
        } else {
            q40.e(this.k);
            f();
        }
        d(canvas3, z6);
    }
}
