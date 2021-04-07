package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.j;
import com.google.android.material.internal.m;
import defpackage.wa1;

/* renamed from: cb1  reason: default package */
public class cb1 extends ra1 implements j.b {
    private CharSequence C;
    private final Context D;
    private final Paint.FontMetrics E = new Paint.FontMetrics();
    private final j F = new j(this);
    private final View.OnLayoutChangeListener G = new a();
    private final Rect H = new Rect();
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;

    /* renamed from: cb1$a */
    class a implements View.OnLayoutChangeListener {
        a() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            cb1.this.B0(view);
        }
    }

    private cb1(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.D = context;
        this.F.e().density = context.getResources().getDisplayMetrics().density;
        this.F.e().setTextAlign(Paint.Align.CENTER);
    }

    /* access modifiers changed from: private */
    public void B0(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.N = iArr[0];
        view.getWindowVisibleDisplayFrame(this.H);
    }

    private float p0() {
        int i;
        if (((this.H.right - getBounds().right) - this.N) - this.L < 0) {
            i = ((this.H.right - getBounds().right) - this.N) - this.L;
        } else if (((this.H.left - getBounds().left) - this.N) + this.L <= 0) {
            return Utils.FLOAT_EPSILON;
        } else {
            i = ((this.H.left - getBounds().left) - this.N) + this.L;
        }
        return (float) i;
    }

    private float q0() {
        this.F.e().getFontMetrics(this.E);
        Paint.FontMetrics fontMetrics = this.E;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private float r0(Rect rect) {
        return ((float) rect.centerY()) - q0();
    }

    public static cb1 s0(Context context, AttributeSet attributeSet, int i, int i2) {
        cb1 cb1 = new cb1(context, attributeSet, i, i2);
        cb1.x0(attributeSet, i, i2);
        return cb1;
    }

    private pa1 t0() {
        float width = ((float) (((double) getBounds().width()) - (((double) this.M) * Math.sqrt(2.0d)))) / 2.0f;
        return new ta1(new qa1((float) this.M), Math.min(Math.max(-p0(), -width), width));
    }

    private void v0(Canvas canvas) {
        if (this.C != null) {
            Rect bounds = getBounds();
            int r0 = (int) r0(bounds);
            if (this.F.d() != null) {
                this.F.e().drawableState = getState();
                this.F.j(this.D);
            }
            CharSequence charSequence = this.C;
            canvas.drawText(charSequence, 0, charSequence.length(), (float) bounds.centerX(), (float) r0, this.F.e());
        }
    }

    private float w0() {
        CharSequence charSequence = this.C;
        return charSequence == null ? Utils.FLOAT_EPSILON : this.F.f(charSequence.toString());
    }

    private void x0(AttributeSet attributeSet, int i, int i2) {
        TypedArray h = m.h(this.D, attributeSet, R$styleable.Tooltip, i, i2, new int[0]);
        this.M = this.D.getResources().getDimensionPixelSize(R$dimen.mtrl_tooltip_arrowSize);
        wa1.b v = D().v();
        v.s(t0());
        setShapeAppearanceModel(v.m());
        z0(h.getText(R$styleable.Tooltip_android_text));
        A0(ca1.f(this.D, h, R$styleable.Tooltip_android_textAppearance));
        Y(ColorStateList.valueOf(h.getColor(R$styleable.Tooltip_backgroundTint, t91.f(j2.m(t91.c(this.D, 16842801, cb1.class.getCanonicalName()), 229), j2.m(t91.c(this.D, R$attr.colorOnBackground, cb1.class.getCanonicalName()), 153)))));
        j0(ColorStateList.valueOf(t91.c(this.D, R$attr.colorSurface, cb1.class.getCanonicalName())));
        this.I = h.getDimensionPixelSize(R$styleable.Tooltip_android_padding, 0);
        this.J = h.getDimensionPixelSize(R$styleable.Tooltip_android_minWidth, 0);
        this.K = h.getDimensionPixelSize(R$styleable.Tooltip_android_minHeight, 0);
        this.L = h.getDimensionPixelSize(R$styleable.Tooltip_android_layout_margin, 0);
        h.recycle();
    }

    public void A0(da1 da1) {
        this.F.h(da1, this.D);
    }

    public void a() {
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(p0(), (float) (-((((double) this.M) * Math.sqrt(2.0d)) - ((double) this.M))));
        super.draw(canvas);
        v0(canvas);
        canvas.restore();
    }

    public int getIntrinsicHeight() {
        return (int) Math.max(this.F.e().getTextSize(), (float) this.K);
    }

    public int getIntrinsicWidth() {
        return (int) Math.max(((float) (this.I * 2)) + w0(), (float) this.J);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        wa1.b v = D().v();
        v.s(t0());
        setShapeAppearanceModel(v.m());
    }

    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public void u0(View view) {
        if (view != null) {
            view.removeOnLayoutChangeListener(this.G);
        }
    }

    public void y0(View view) {
        if (view != null) {
            B0(view);
            view.addOnLayoutChangeListener(this.G);
        }
    }

    public void z0(CharSequence charSequence) {
        if (!TextUtils.equals(this.C, charSequence)) {
            this.C = charSequence;
            this.F.i(true);
            invalidateSelf();
        }
    }
}
