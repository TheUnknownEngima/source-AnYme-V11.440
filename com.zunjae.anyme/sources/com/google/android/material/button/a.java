package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import com.google.android.material.R$attr;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.r;

class a {
    private static final boolean s = (Build.VERSION.SDK_INT >= 21);
    private final MaterialButton a;
    private wa1 b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private PorterDuff.Mode i;
    private ColorStateList j;
    private ColorStateList k;
    private ColorStateList l;
    private Drawable m;
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;
    private boolean q;
    private LayerDrawable r;

    a(MaterialButton materialButton, wa1 wa1) {
        this.a = materialButton;
        this.b = wa1;
    }

    private void A(wa1 wa1) {
        if (d() != null) {
            d().setShapeAppearanceModel(wa1);
        }
        if (l() != null) {
            l().setShapeAppearanceModel(wa1);
        }
        if (c() != null) {
            c().setShapeAppearanceModel(wa1);
        }
    }

    private void C() {
        ra1 d2 = d();
        ra1 l2 = l();
        if (d2 != null) {
            d2.i0((float) this.h, this.k);
            if (l2 != null) {
                l2.h0((float) this.h, this.n ? t91.d(this.a, R$attr.colorSurface) : 0);
            }
        }
    }

    private InsetDrawable D(Drawable drawable) {
        return new InsetDrawable(drawable, this.c, this.e, this.d, this.f);
    }

    private Drawable a() {
        ra1 ra1 = new ra1(this.b);
        ra1.N(this.a.getContext());
        androidx.core.graphics.drawable.a.o(ra1, this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            androidx.core.graphics.drawable.a.p(ra1, mode);
        }
        ra1.i0((float) this.h, this.k);
        ra1 ra12 = new ra1(this.b);
        ra12.setTint(0);
        ra12.h0((float) this.h, this.n ? t91.d(this.a, R$attr.colorSurface) : 0);
        if (s) {
            ra1 ra13 = new ra1(this.b);
            this.m = ra13;
            androidx.core.graphics.drawable.a.n(ra13, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(ha1.d(this.l), D(new LayerDrawable(new Drawable[]{ra12, ra1})), this.m);
            this.r = rippleDrawable;
            return rippleDrawable;
        }
        ga1 ga1 = new ga1(this.b);
        this.m = ga1;
        androidx.core.graphics.drawable.a.o(ga1, ha1.d(this.l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{ra12, ra1, this.m});
        this.r = layerDrawable;
        return D(layerDrawable);
    }

    private ra1 e(boolean z) {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (ra1) (s ? (LayerDrawable) ((InsetDrawable) this.r.getDrawable(0)).getDrawable() : this.r).getDrawable(z ^ true ? 1 : 0);
    }

    private ra1 l() {
        return e(true);
    }

    /* access modifiers changed from: package-private */
    public void B(int i2, int i3) {
        Drawable drawable = this.m;
        if (drawable != null) {
            drawable.setBounds(this.c, this.e, i3 - this.d, i2 - this.f);
        }
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.g;
    }

    public za1 c() {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (za1) (this.r.getNumberOfLayers() > 2 ? this.r.getDrawable(2) : this.r.getDrawable(1));
    }

    /* access modifiers changed from: package-private */
    public ra1 d() {
        return e(false);
    }

    /* access modifiers changed from: package-private */
    public ColorStateList f() {
        return this.l;
    }

    /* access modifiers changed from: package-private */
    public wa1 g() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList h() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList j() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode k() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        return this.q;
    }

    /* access modifiers changed from: package-private */
    public void o(TypedArray typedArray) {
        this.c = typedArray.getDimensionPixelOffset(R$styleable.MaterialButton_android_insetLeft, 0);
        this.d = typedArray.getDimensionPixelOffset(R$styleable.MaterialButton_android_insetRight, 0);
        this.e = typedArray.getDimensionPixelOffset(R$styleable.MaterialButton_android_insetTop, 0);
        this.f = typedArray.getDimensionPixelOffset(R$styleable.MaterialButton_android_insetBottom, 0);
        if (typedArray.hasValue(R$styleable.MaterialButton_cornerRadius)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(R$styleable.MaterialButton_cornerRadius, -1);
            this.g = dimensionPixelSize;
            u(this.b.w((float) dimensionPixelSize));
            this.p = true;
        }
        this.h = typedArray.getDimensionPixelSize(R$styleable.MaterialButton_strokeWidth, 0);
        this.i = r.i(typedArray.getInt(R$styleable.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.j = ca1.a(this.a.getContext(), typedArray, R$styleable.MaterialButton_backgroundTint);
        this.k = ca1.a(this.a.getContext(), typedArray, R$styleable.MaterialButton_strokeColor);
        this.l = ca1.a(this.a.getContext(), typedArray, R$styleable.MaterialButton_rippleColor);
        this.q = typedArray.getBoolean(R$styleable.MaterialButton_android_checkable, false);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(R$styleable.MaterialButton_elevation, 0);
        int D = o4.D(this.a);
        int paddingTop = this.a.getPaddingTop();
        int C = o4.C(this.a);
        int paddingBottom = this.a.getPaddingBottom();
        if (typedArray.hasValue(R$styleable.MaterialButton_android_background)) {
            q();
        } else {
            this.a.setInternalBackground(a());
            ra1 d2 = d();
            if (d2 != null) {
                d2.X((float) dimensionPixelSize2);
            }
        }
        o4.w0(this.a, D + this.c, paddingTop + this.e, C + this.d, paddingBottom + this.f);
    }

    /* access modifiers changed from: package-private */
    public void p(int i2) {
        if (d() != null) {
            d().setTint(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void q() {
        this.o = true;
        this.a.setSupportBackgroundTintList(this.j);
        this.a.setSupportBackgroundTintMode(this.i);
    }

    /* access modifiers changed from: package-private */
    public void r(boolean z) {
        this.q = z;
    }

    /* access modifiers changed from: package-private */
    public void s(int i2) {
        if (!this.p || this.g != i2) {
            this.g = i2;
            this.p = true;
            u(this.b.w((float) i2));
        }
    }

    /* access modifiers changed from: package-private */
    public void t(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            if (s && (this.a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.a.getBackground()).setColor(ha1.d(colorStateList));
            } else if (!s && (this.a.getBackground() instanceof ga1)) {
                ((ga1) this.a.getBackground()).setTintList(ha1.d(colorStateList));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void u(wa1 wa1) {
        this.b = wa1;
        A(wa1);
    }

    /* access modifiers changed from: package-private */
    public void v(boolean z) {
        this.n = z;
        C();
    }

    /* access modifiers changed from: package-private */
    public void w(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            C();
        }
    }

    /* access modifiers changed from: package-private */
    public void x(int i2) {
        if (this.h != i2) {
            this.h = i2;
            C();
        }
    }

    /* access modifiers changed from: package-private */
    public void y(ColorStateList colorStateList) {
        if (this.j != colorStateList) {
            this.j = colorStateList;
            if (d() != null) {
                androidx.core.graphics.drawable.a.o(d(), this.j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void z(PorterDuff.Mode mode) {
        if (this.i != mode) {
            this.i = mode;
            if (d() != null && this.i != null) {
                androidx.core.graphics.drawable.a.p(d(), this.i);
            }
        }
    }
}
