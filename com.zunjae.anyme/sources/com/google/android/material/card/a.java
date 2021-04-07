package com.google.android.material.card;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import defpackage.wa1;

class a {
    private static final int[] t = {16842912};
    private static final double u = Math.cos(Math.toRadians(45.0d));
    private final MaterialCardView a;
    private final Rect b = new Rect();
    private final ra1 c;
    private final ra1 d;
    private final int e;
    private final int f;
    private int g;
    private Drawable h;
    private Drawable i;
    private ColorStateList j;
    private ColorStateList k;
    private wa1 l;
    private ColorStateList m;
    private Drawable n;
    private LayerDrawable o;
    private ra1 p;
    private ra1 q;
    private boolean r = false;
    private boolean s;

    /* renamed from: com.google.android.material.card.a$a  reason: collision with other inner class name */
    class C0094a extends InsetDrawable {
        C0094a(a aVar, Drawable drawable, int i, int i2, int i3, int i4) {
            super(drawable, i, i2, i3, i4);
        }

        public int getMinimumHeight() {
            return -1;
        }

        public int getMinimumWidth() {
            return -1;
        }

        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    public a(MaterialCardView materialCardView, AttributeSet attributeSet, int i2, int i3) {
        this.a = materialCardView;
        ra1 ra1 = new ra1(materialCardView.getContext(), attributeSet, i2, i3);
        this.c = ra1;
        ra1.N(materialCardView.getContext());
        this.c.e0(-12303292);
        wa1.b v = this.c.D().v();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, R$styleable.CardView, i2, R$style.CardView);
        if (obtainStyledAttributes.hasValue(R$styleable.CardView_cardCornerRadius)) {
            v.o(obtainStyledAttributes.getDimension(R$styleable.CardView_cardCornerRadius, Utils.FLOAT_EPSILON));
        }
        this.d = new ra1();
        N(v.m());
        Resources resources = materialCardView.getResources();
        this.e = resources.getDimensionPixelSize(R$dimen.mtrl_card_checked_icon_margin);
        this.f = resources.getDimensionPixelSize(R$dimen.mtrl_card_checked_icon_size);
        obtainStyledAttributes.recycle();
    }

    private boolean R() {
        return this.a.getPreventCornerOverlap() && !e();
    }

    private boolean S() {
        return this.a.getPreventCornerOverlap() && e() && this.a.getUseCompatPadding();
    }

    private void W(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 23 || !(this.a.getForeground() instanceof InsetDrawable)) {
            this.a.setForeground(z(drawable));
        } else {
            ((InsetDrawable) this.a.getForeground()).setDrawable(drawable);
        }
    }

    private void Y() {
        Drawable drawable;
        if (!ha1.a || (drawable = this.n) == null) {
            ra1 ra1 = this.p;
            if (ra1 != null) {
                ra1.Y(this.j);
                return;
            }
            return;
        }
        ((RippleDrawable) drawable).setColor(this.j);
    }

    private float a() {
        return Math.max(Math.max(b(this.l.q(), this.c.G()), b(this.l.s(), this.c.H())), Math.max(b(this.l.k(), this.c.t()), b(this.l.i(), this.c.s())));
    }

    private float b(na1 na1, float f2) {
        return na1 instanceof va1 ? (float) ((1.0d - u) * ((double) f2)) : na1 instanceof oa1 ? f2 / 2.0f : Utils.FLOAT_EPSILON;
    }

    private float c() {
        return this.a.getMaxCardElevation() + (S() ? a() : Utils.FLOAT_EPSILON);
    }

    private float d() {
        return (this.a.getMaxCardElevation() * 1.5f) + (S() ? a() : Utils.FLOAT_EPSILON);
    }

    private boolean e() {
        return Build.VERSION.SDK_INT >= 21 && this.c.Q();
    }

    private Drawable f() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable drawable = this.i;
        if (drawable != null) {
            stateListDrawable.addState(t, drawable);
        }
        return stateListDrawable;
    }

    private Drawable g() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        ra1 i2 = i();
        this.p = i2;
        i2.Y(this.j);
        stateListDrawable.addState(new int[]{16842919}, this.p);
        return stateListDrawable;
    }

    private Drawable h() {
        if (!ha1.a) {
            return g();
        }
        this.q = i();
        return new RippleDrawable(this.j, (Drawable) null, this.q);
    }

    private ra1 i() {
        return new ra1(this.l);
    }

    private Drawable p() {
        if (this.n == null) {
            this.n = h();
        }
        if (this.o == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.n, this.d, f()});
            this.o = layerDrawable;
            layerDrawable.setId(2, R$id.mtrl_card_checked_layer_id);
        }
        return this.o;
    }

    private float r() {
        return this.a.getPreventCornerOverlap() ? (Build.VERSION.SDK_INT < 21 || this.a.getUseCompatPadding()) ? (float) ((1.0d - u) * ((double) this.a.getCardViewRadius())) : Utils.FLOAT_EPSILON : Utils.FLOAT_EPSILON;
    }

    private Drawable z(Drawable drawable) {
        int i2;
        int i3;
        if ((Build.VERSION.SDK_INT < 21) || this.a.getUseCompatPadding()) {
            int ceil = (int) Math.ceil((double) d());
            i3 = (int) Math.ceil((double) c());
            i2 = ceil;
        } else {
            i3 = 0;
            i2 = 0;
        }
        return new C0094a(this, drawable, i3, i2, i3, i2);
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        return this.r;
    }

    /* access modifiers changed from: package-private */
    public boolean B() {
        return this.s;
    }

    /* access modifiers changed from: package-private */
    public void C(TypedArray typedArray) {
        ColorStateList a2 = ca1.a(this.a.getContext(), typedArray, R$styleable.MaterialCardView_strokeColor);
        this.m = a2;
        if (a2 == null) {
            this.m = ColorStateList.valueOf(-1);
        }
        this.g = typedArray.getDimensionPixelSize(R$styleable.MaterialCardView_strokeWidth, 0);
        boolean z = typedArray.getBoolean(R$styleable.MaterialCardView_android_checkable, false);
        this.s = z;
        this.a.setLongClickable(z);
        this.k = ca1.a(this.a.getContext(), typedArray, R$styleable.MaterialCardView_checkedIconTint);
        I(ca1.d(this.a.getContext(), typedArray, R$styleable.MaterialCardView_checkedIcon));
        ColorStateList a3 = ca1.a(this.a.getContext(), typedArray, R$styleable.MaterialCardView_rippleColor);
        this.j = a3;
        if (a3 == null) {
            this.j = ColorStateList.valueOf(t91.d(this.a, R$attr.colorControlHighlight));
        }
        G(ca1.a(this.a.getContext(), typedArray, R$styleable.MaterialCardView_cardForegroundColor));
        Y();
        V();
        Z();
        this.a.setBackgroundInternal(z(this.c));
        Drawable p2 = this.a.isClickable() ? p() : this.d;
        this.h = p2;
        this.a.setForeground(z(p2));
    }

    /* access modifiers changed from: package-private */
    public void D(int i2, int i3) {
        int i4;
        int i5;
        if (this.o != null) {
            int i6 = this.e;
            int i7 = this.f;
            int i8 = (i2 - i6) - i7;
            int i9 = (i3 - i6) - i7;
            if ((Build.VERSION.SDK_INT < 21) || this.a.getUseCompatPadding()) {
                i9 -= (int) Math.ceil((double) (d() * 2.0f));
                i8 -= (int) Math.ceil((double) (c() * 2.0f));
            }
            int i10 = i9;
            int i11 = this.e;
            if (o4.y(this.a) == 1) {
                i4 = i8;
                i5 = i11;
            } else {
                i5 = i8;
                i4 = i11;
            }
            this.o.setLayerInset(2, i5, this.e, i4, i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void E(boolean z) {
        this.r = z;
    }

    /* access modifiers changed from: package-private */
    public void F(ColorStateList colorStateList) {
        this.c.Y(colorStateList);
    }

    /* access modifiers changed from: package-private */
    public void G(ColorStateList colorStateList) {
        ra1 ra1 = this.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        ra1.Y(colorStateList);
    }

    /* access modifiers changed from: package-private */
    public void H(boolean z) {
        this.s = z;
    }

    /* access modifiers changed from: package-private */
    public void I(Drawable drawable) {
        this.i = drawable;
        if (drawable != null) {
            Drawable r2 = androidx.core.graphics.drawable.a.r(drawable.mutate());
            this.i = r2;
            androidx.core.graphics.drawable.a.o(r2, this.k);
        }
        if (this.o != null) {
            this.o.setDrawableByLayerId(R$id.mtrl_card_checked_layer_id, f());
        }
    }

    /* access modifiers changed from: package-private */
    public void J(ColorStateList colorStateList) {
        this.k = colorStateList;
        Drawable drawable = this.i;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void K(float f2) {
        N(this.l.w(f2));
        this.h.invalidateSelf();
        if (S() || R()) {
            U();
        }
        if (S()) {
            X();
        }
    }

    /* access modifiers changed from: package-private */
    public void L(float f2) {
        this.c.Z(f2);
        ra1 ra1 = this.d;
        if (ra1 != null) {
            ra1.Z(f2);
        }
        ra1 ra12 = this.q;
        if (ra12 != null) {
            ra12.Z(f2);
        }
    }

    /* access modifiers changed from: package-private */
    public void M(ColorStateList colorStateList) {
        this.j = colorStateList;
        Y();
    }

    /* access modifiers changed from: package-private */
    public void N(wa1 wa1) {
        this.l = wa1;
        this.c.setShapeAppearanceModel(wa1);
        ra1 ra1 = this.c;
        ra1.d0(!ra1.Q());
        ra1 ra12 = this.d;
        if (ra12 != null) {
            ra12.setShapeAppearanceModel(wa1);
        }
        ra1 ra13 = this.q;
        if (ra13 != null) {
            ra13.setShapeAppearanceModel(wa1);
        }
        ra1 ra14 = this.p;
        if (ra14 != null) {
            ra14.setShapeAppearanceModel(wa1);
        }
    }

    /* access modifiers changed from: package-private */
    public void O(ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            Z();
        }
    }

    /* access modifiers changed from: package-private */
    public void P(int i2) {
        if (i2 != this.g) {
            this.g = i2;
            Z();
        }
    }

    /* access modifiers changed from: package-private */
    public void Q(int i2, int i3, int i4, int i5) {
        this.b.set(i2, i3, i4, i5);
        U();
    }

    /* access modifiers changed from: package-private */
    public void T() {
        Drawable drawable = this.h;
        Drawable p2 = this.a.isClickable() ? p() : this.d;
        this.h = p2;
        if (drawable != p2) {
            W(p2);
        }
    }

    /* access modifiers changed from: package-private */
    public void U() {
        int a2 = (int) ((R() || S() ? a() : Utils.FLOAT_EPSILON) - r());
        MaterialCardView materialCardView = this.a;
        Rect rect = this.b;
        materialCardView.m(rect.left + a2, rect.top + a2, rect.right + a2, rect.bottom + a2);
    }

    /* access modifiers changed from: package-private */
    public void V() {
        this.c.X(this.a.getCardElevation());
    }

    /* access modifiers changed from: package-private */
    public void X() {
        if (!A()) {
            this.a.setBackgroundInternal(z(this.c));
        }
        this.a.setForeground(z(this.h));
    }

    /* access modifiers changed from: package-private */
    public void Z() {
        this.d.i0((float) this.g, this.m);
    }

    /* access modifiers changed from: package-private */
    public void j() {
        Drawable drawable = this.n;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i2 = bounds.bottom;
            this.n.setBounds(bounds.left, bounds.top, bounds.right, i2 - 1);
            this.n.setBounds(bounds.left, bounds.top, bounds.right, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public ra1 k() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList l() {
        return this.c.x();
    }

    /* access modifiers changed from: package-private */
    public ColorStateList m() {
        return this.d.x();
    }

    /* access modifiers changed from: package-private */
    public Drawable n() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList o() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public float q() {
        return this.c.G();
    }

    /* access modifiers changed from: package-private */
    public float s() {
        return this.c.y();
    }

    /* access modifiers changed from: package-private */
    public ColorStateList t() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public wa1 u() {
        return this.l;
    }

    /* access modifiers changed from: package-private */
    public int v() {
        ColorStateList colorStateList = this.m;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    /* access modifiers changed from: package-private */
    public ColorStateList w() {
        return this.m;
    }

    /* access modifiers changed from: package-private */
    public int x() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public Rect y() {
        return this.b;
    }
}
