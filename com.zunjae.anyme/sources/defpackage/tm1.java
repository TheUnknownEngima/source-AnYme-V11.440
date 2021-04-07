package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import androidx.core.content.a;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: tm1  reason: default package */
public class tm1 extends Drawable {
    private float A = Utils.FLOAT_EPSILON;
    private float B = Utils.FLOAT_EPSILON;
    private int C = 0;
    private zm1 D;
    private String E;
    private ColorStateList F;
    private PorterDuff.Mode G = PorterDuff.Mode.SRC_IN;
    private ColorFilter H;
    private ColorFilter I;
    private Context a;
    private int b = -1;
    private int c = -1;
    private boolean d = false;
    private ColorStateList e;
    private Paint f;
    private int g;
    private int h;
    private Paint i;
    private int j;
    private Paint k;
    private Paint l;
    private int m = -1;
    private int n = -1;
    private Rect o;
    private RectF p;
    private Path q;
    private int r;
    private int s;
    private int t;
    private int u = 0;
    private int v = 0;
    private int w = 255;
    private boolean x;
    private boolean y;
    private float z = Utils.FLOAT_EPSILON;

    public tm1(Context context) {
        this.a = context.getApplicationContext();
        z();
        p(' ');
    }

    public tm1(Context context, zm1 zm1) {
        this.a = context.getApplicationContext();
        z();
        o(zm1);
    }

    private void K() {
        boolean z2;
        int colorForState = this.e.getColorForState(getState(), this.e.getDefaultColor());
        int rgb = Color.rgb(Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState));
        if (rgb != this.f.getColor()) {
            this.f.setColor(rgb);
            z2 = true;
        } else {
            z2 = false;
        }
        int alpha = Color.alpha(colorForState);
        if (alpha != 255 && alpha != this.w) {
            setAlpha(alpha);
        } else if (z2) {
            invalidateSelf();
        }
    }

    private void L(Rect rect) {
        int i2 = this.r;
        if (i2 >= 0 && i2 * 2 <= rect.width() && this.r * 2 <= rect.height()) {
            Rect rect2 = this.o;
            int i3 = rect.left;
            int i4 = this.r;
            rect2.set(i3 + i4, rect.top + i4, rect.right - i4, rect.bottom - i4);
        }
    }

    private void M(Rect rect) {
        float height = ((float) rect.height()) * ((float) (this.d ? 1 : 2));
        this.f.setTextSize(height);
        zm1 zm1 = this.D;
        String valueOf = zm1 != null ? String.valueOf(zm1.getCharacter()) : String.valueOf(this.E);
        this.f.getTextPath(valueOf, 0, valueOf.length(), Utils.FLOAT_EPSILON, (float) rect.height(), this.q);
        this.q.computeBounds(this.p, true);
        if (!this.d) {
            float width = ((float) this.o.width()) / this.p.width();
            float height2 = ((float) this.o.height()) / this.p.height();
            if (width >= height2) {
                width = height2;
            }
            this.f.setTextSize(height * width);
            this.f.getTextPath(valueOf, 0, valueOf.length(), Utils.FLOAT_EPSILON, (float) rect.height(), this.q);
            this.q.computeBounds(this.p, true);
        }
    }

    private PorterDuffColorFilter N(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void v(Rect rect) {
        this.q.offset(((((float) rect.centerX()) - (this.p.width() / 2.0f)) - this.p.left) + ((float) this.u), ((((float) rect.centerY()) - (this.p.height() / 2.0f)) - this.p.top) + ((float) this.v));
    }

    private void z() {
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        textPaint.setStyle(Paint.Style.FILL);
        this.f.setTextAlign(Paint.Align.CENTER);
        this.f.setUnderlineText(false);
        this.f.setAntiAlias(true);
        this.k = new Paint(1);
        Paint paint = new Paint(1);
        this.i = paint;
        paint.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint(1);
        this.l = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.q = new Path();
        this.p = new RectF();
        this.o = new Rect();
    }

    public tm1 A(int i2) {
        this.n = i2;
        this.m = i2;
        invalidateSelf();
        return this;
    }

    public tm1 B(int i2) {
        this.m = i2;
        invalidateSelf();
        return this;
    }

    public tm1 C(int i2) {
        this.n = i2;
        invalidateSelf();
        return this;
    }

    public tm1 D(float f2, float f3, float f4, int i2) {
        this.z = f2;
        this.A = f3;
        this.B = f4;
        this.C = i2;
        this.f.setShadowLayer(f2, f3, f4, i2);
        invalidateSelf();
        return this;
    }

    public tm1 E(int i2) {
        F(gn1.a(this.a, (float) i2));
        return this;
    }

    public tm1 F(int i2) {
        this.c = i2;
        this.b = i2;
        setBounds(0, 0, i2, i2);
        invalidateSelf();
        return this;
    }

    public tm1 G(int i2) {
        this.b = i2;
        setBounds(0, 0, i2, this.c);
        invalidateSelf();
        return this;
    }

    public tm1 H(int i2) {
        this.c = i2;
        setBounds(0, 0, this.b, i2);
        invalidateSelf();
        return this;
    }

    public tm1 I(int i2) {
        F(this.a.getResources().getDimensionPixelSize(i2));
        return this;
    }

    public tm1 J(Typeface typeface) {
        this.f.setTypeface(typeface);
        invalidateSelf();
        return this;
    }

    public tm1 a() {
        E(24);
        w(1);
        return this;
    }

    public tm1 b(int i2) {
        setAlpha(i2);
        return this;
    }

    public tm1 c(int i2) {
        this.k.setColor(i2);
        this.j = i2;
        if (this.m == -1) {
            this.m = 0;
        }
        if (this.n == -1) {
            this.n = 0;
        }
        invalidateSelf();
        return this;
    }

    public void clearColorFilter() {
        this.I = null;
        invalidateSelf();
    }

    public tm1 d(int i2) {
        c(a.d(this.a, i2));
        return this;
    }

    public void draw(Canvas canvas) {
        if (this.D != null || this.E != null) {
            Rect bounds = getBounds();
            L(bounds);
            M(bounds);
            v(bounds);
            if (this.k != null && this.n > -1 && this.m > -1) {
                if (!this.y || this.l == null) {
                    canvas.drawRoundRect(new RectF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) bounds.width(), (float) bounds.height()), (float) this.m, (float) this.n, this.k);
                } else {
                    float f2 = (float) (this.t / 2);
                    RectF rectF = new RectF(f2, f2, ((float) bounds.width()) - f2, ((float) bounds.height()) - f2);
                    canvas.drawRoundRect(rectF, (float) this.m, (float) this.n, this.k);
                    canvas.drawRoundRect(rectF, (float) this.m, (float) this.n, this.l);
                }
            }
            try {
                this.q.close();
            } catch (Exception unused) {
            }
            if (this.x) {
                canvas.drawPath(this.q, this.i);
            }
            this.f.setAlpha(this.w);
            Paint paint = this.f;
            ColorFilter colorFilter = this.I;
            if (colorFilter == null) {
                colorFilter = this.H;
            }
            paint.setColorFilter(colorFilter);
            canvas.drawPath(this.q, this.f);
        }
    }

    public tm1 e(int i2) {
        this.l.setColor(Color.rgb(Color.red(i2), Color.green(i2), Color.blue(i2)));
        this.l.setAlpha(Color.alpha(i2));
        this.g = i2;
        invalidateSelf();
        return this;
    }

    public tm1 f(int i2) {
        this.t = i2;
        this.l.setStrokeWidth((float) i2);
        m(true);
        invalidateSelf();
        return this;
    }

    /* renamed from: g */
    public tm1 clone() {
        tm1 tm1 = new tm1(this.a);
        tm1.x(this.r);
        tm1.B(this.m);
        tm1.C(this.n);
        tm1.G(this.b);
        tm1.H(this.c);
        tm1.r(this.u);
        tm1.s(this.v);
        tm1.k(this.h);
        tm1.l(this.s);
        tm1.D(this.z, this.A, this.B, this.C);
        tm1.c(this.j);
        tm1.e(this.g);
        tm1.f(this.t);
        tm1.i(this.e);
        tm1.b(this.w);
        tm1.n(this.x);
        tm1.m(this.y);
        tm1.J(this.f.getTypeface());
        zm1 zm1 = this.D;
        if (zm1 != null) {
            tm1.o(zm1);
        } else {
            String str = this.E;
            if (str != null) {
                tm1.t(str);
            }
        }
        return tm1;
    }

    public int getAlpha() {
        return this.w;
    }

    public int getIntrinsicHeight() {
        return this.c;
    }

    public int getIntrinsicWidth() {
        return this.b;
    }

    public int getOpacity() {
        if (this.H != null || this.f.getColorFilter() != null) {
            return -3;
        }
        int alpha = getAlpha();
        if (alpha != 0) {
            return alpha != 255 ? -3 : -1;
        }
        return -2;
    }

    public tm1 h(int i2) {
        this.e = ColorStateList.valueOf(i2);
        K();
        return this;
    }

    public tm1 i(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.e = colorStateList;
            K();
        }
        return this;
    }

    public boolean isStateful() {
        return true;
    }

    public tm1 j(int i2) {
        h(a.d(this.a, i2));
        return this;
    }

    public tm1 k(int i2) {
        this.i.setColor(Color.rgb(Color.red(i2), Color.green(i2), Color.blue(i2)));
        this.i.setAlpha(Color.alpha(i2));
        this.h = i2;
        invalidateSelf();
        return this;
    }

    public tm1 l(int i2) {
        this.s = i2;
        this.i.setStrokeWidth((float) i2);
        n(true);
        invalidateSelf();
        return this;
    }

    public tm1 m(boolean z2) {
        if (this.y != z2) {
            this.y = z2;
            this.r += (z2 ? 1 : -1) * this.t * 2;
            invalidateSelf();
        }
        return this;
    }

    public tm1 n(boolean z2) {
        if (this.x != z2) {
            this.x = z2;
            this.r += (z2 ? 1 : -1) * this.s;
            invalidateSelf();
        }
        return this;
    }

    public tm1 o(zm1 zm1) {
        this.D = zm1;
        this.E = null;
        this.f.setTypeface(zm1.getTypeface().getTypeface(this.a));
        invalidateSelf();
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        v(rect);
        try {
            this.q.close();
        } catch (Exception unused) {
        }
        super.onBoundsChange(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.e;
        if (colorStateList == null || !colorStateList.isStateful()) {
            z2 = false;
        } else {
            K();
            z2 = true;
        }
        ColorStateList colorStateList2 = this.F;
        if (colorStateList2 == null || (mode = this.G) == null) {
            return z2;
        }
        this.H = N(colorStateList2, mode);
        invalidateSelf();
        return true;
    }

    public tm1 p(Character ch) {
        u(ch.toString(), (Typeface) null);
        return this;
    }

    public tm1 q(String str) {
        try {
            an1 a2 = sm1.a(this.a, str.substring(0, 3));
            str = str.replace("-", "_");
            o(a2.getIcon(str));
        } catch (Exception unused) {
            String str2 = sm1.a;
            "Wrong icon name: " + str;
        }
        return this;
    }

    public tm1 r(int i2) {
        this.u = i2;
        invalidateSelf();
        return this;
    }

    public tm1 s(int i2) {
        this.v = i2;
        invalidateSelf();
        return this;
    }

    public void setAlpha(int i2) {
        this.f.setAlpha(i2);
        this.w = i2;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.I = colorFilter;
        invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = r0.e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean setState(int[] r1) {
        /*
            r0 = this;
            boolean r1 = super.setState(r1)
            if (r1 != 0) goto L_0x001b
            android.content.res.ColorStateList r1 = r0.e
            if (r1 == 0) goto L_0x0010
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L_0x001b
        L_0x0010:
            android.graphics.ColorFilter r1 = r0.I
            if (r1 != 0) goto L_0x001b
            android.graphics.ColorFilter r1 = r0.H
            if (r1 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r1 = 0
            goto L_0x001c
        L_0x001b:
            r1 = 1
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm1.setState(int[]):boolean");
    }

    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.F = colorStateList;
        this.H = N(colorStateList, this.G);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.G = mode;
        this.H = N(this.F, mode);
        invalidateSelf();
    }

    public tm1 t(String str) {
        u(str, (Typeface) null);
        return this;
    }

    public tm1 u(String str, Typeface typeface) {
        this.E = str;
        this.D = null;
        Paint paint = this.f;
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        paint.setTypeface(typeface);
        invalidateSelf();
        return this;
    }

    public tm1 w(int i2) {
        x(gn1.a(this.a, (float) i2));
        return this;
    }

    public tm1 x(int i2) {
        if (this.r != i2) {
            this.r = i2;
            if (this.x) {
                this.r = i2 + this.s;
            }
            if (this.y) {
                this.r += this.t;
            }
            invalidateSelf();
        }
        return this;
    }

    public tm1 y(int i2) {
        x(this.a.getResources().getDimensionPixelSize(i2));
        return this;
    }
}
