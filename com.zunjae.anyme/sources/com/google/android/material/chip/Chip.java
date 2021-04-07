package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.R$attr;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.chip.a;
import com.google.android.material.internal.m;
import com.google.android.material.internal.r;
import defpackage.a5;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class Chip extends AppCompatCheckBox implements a.C0095a, za1 {
    private static final int[] A = {16842911};
    private static final int x = R$style.Widget_MaterialComponents_Chip_Action;
    /* access modifiers changed from: private */
    public static final Rect y = new Rect();
    private static final int[] z = {16842913};
    /* access modifiers changed from: private */
    public a h;
    private InsetDrawable i;
    private RippleDrawable j;
    /* access modifiers changed from: private */
    public View.OnClickListener k;
    private CompoundButton.OnCheckedChangeListener l;
    private boolean m;
    private boolean n;
    private boolean o;
    /* access modifiers changed from: private */
    public boolean p;
    private boolean q;
    private int r;
    private int s;
    private final c t;
    private final Rect u;
    private final RectF v;
    private final fa1 w;

    class a extends fa1 {
        a() {
        }

        public void a(int i) {
        }

        public void b(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            chip.setText(chip.h.P2() ? Chip.this.h.l1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    class b extends ViewOutlineProvider {
        b() {
        }

        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (Chip.this.h != null) {
                Chip.this.h.getOutline(outline);
            } else {
                outline.setAlpha(Utils.FLOAT_EPSILON);
            }
        }
    }

    private class c extends k5 {
        c(Chip chip) {
            super(chip);
        }

        /* access modifiers changed from: protected */
        public int B(float f, float f2) {
            return (!Chip.this.n() || !Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 0 : 1;
        }

        /* access modifiers changed from: protected */
        public void C(List<Integer> list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.s() && Chip.this.k != null) {
                list.add(1);
            }
        }

        /* access modifiers changed from: protected */
        public boolean L(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            if (i == 0) {
                return Chip.this.performClick();
            }
            if (i == 1) {
                return Chip.this.t();
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public void O(a5 a5Var) {
            a5Var.b0(Chip.this.r());
            a5Var.e0(Chip.this.isClickable());
            a5Var.d0((Chip.this.r() || Chip.this.isClickable()) ? Chip.this.r() ? "android.widget.CompoundButton" : "android.widget.Button" : "android.view.View");
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                a5Var.E0(text);
            } else {
                a5Var.h0(text);
            }
        }

        /* access modifiers changed from: protected */
        public void P(int i, a5 a5Var) {
            CharSequence charSequence = "";
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription == null) {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i2 = R$string.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    closeIconContentDescription = context.getString(i2, objArr).trim();
                }
                a5Var.h0(closeIconContentDescription);
                a5Var.Y(Chip.this.getCloseIconTouchBoundsInt());
                a5Var.b(a5.a.g);
                a5Var.j0(Chip.this.isEnabled());
                return;
            }
            a5Var.h0(charSequence);
            a5Var.Y(Chip.y);
        }

        /* access modifiers changed from: protected */
        public void Q(int i, boolean z) {
            if (i == 1) {
                boolean unused = Chip.this.p = z;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.chipStyle);
    }

    public Chip(Context context, AttributeSet attributeSet, int i2) {
        super(bb1.c(context, attributeSet, i2, x), attributeSet, i2);
        this.u = new Rect();
        this.v = new RectF();
        this.w = new a();
        Context context2 = getContext();
        C(attributeSet);
        a z0 = a.z0(context2, attributeSet, i2, x);
        o(context2, attributeSet, i2);
        setChipDrawable(z0);
        z0.X(o4.t(this));
        TypedArray h2 = m.h(context2, attributeSet, R$styleable.Chip, i2, x, new int[0]);
        if (Build.VERSION.SDK_INT < 23) {
            setTextColor(ca1.a(context2, h2, R$styleable.Chip_android_textColor));
        }
        boolean hasValue = h2.hasValue(R$styleable.Chip_shapeAppearance);
        h2.recycle();
        this.t = new c(this);
        x();
        if (!hasValue) {
            p();
        }
        setChecked(this.m);
        setText(z0.l1());
        setEllipsize(z0.f1());
        B();
        if (!this.h.P2()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        A();
        if (v()) {
            setMinHeight(this.s);
        }
        this.r = o4.y(this);
    }

    private void A() {
        a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.h) != null) {
            int N0 = (int) (aVar.N0() + this.h.n1() + this.h.u0());
            int S0 = (int) (this.h.S0() + this.h.o1() + this.h.q0());
            if (this.i != null) {
                Rect rect = new Rect();
                this.i.getPadding(rect);
                S0 += rect.left;
                N0 += rect.right;
            }
            o4.w0(this, S0, getPaddingTop(), N0, getPaddingBottom());
        }
    }

    private void B() {
        TextPaint paint = getPaint();
        a aVar = this.h;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        da1 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.i(getContext(), paint, this.w);
        }
    }

    private void C(AttributeSet attributeSet) {
        if (attributeSet != null) {
            String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background");
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
            } else {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
        }
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.v.setEmpty();
        if (n()) {
            this.h.c1(this.v);
        }
        return this.v;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.u.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.u;
    }

    private da1 getTextAppearance() {
        a aVar = this.h;
        if (aVar != null) {
            return aVar.m1();
        }
        return null;
    }

    private void i(a aVar) {
        aVar.t2(this);
    }

    private int[] j() {
        int i2 = 0;
        int i3 = isEnabled() ? 1 : 0;
        if (this.p) {
            i3++;
        }
        if (this.o) {
            i3++;
        }
        if (this.n) {
            i3++;
        }
        if (isChecked()) {
            i3++;
        }
        int[] iArr = new int[i3];
        if (isEnabled()) {
            iArr[0] = 16842910;
            i2 = 1;
        }
        if (this.p) {
            iArr[i2] = 16842908;
            i2++;
        }
        if (this.o) {
            iArr[i2] = 16843623;
            i2++;
        }
        if (this.n) {
            iArr[i2] = 16842919;
            i2++;
        }
        if (isChecked()) {
            iArr[i2] = 16842913;
        }
        return iArr;
    }

    private void l() {
        if (getBackgroundDrawable() == this.i && this.h.getCallback() == null) {
            this.h.setCallback(this.i);
        }
    }

    @SuppressLint({"PrivateApi"})
    private boolean m(MotionEvent motionEvent) {
        Class<k5> cls = k5.class;
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = cls.getDeclaredField("m");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.t)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = cls.getDeclaredMethod("X", new Class[]{Integer.TYPE});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.t, new Object[]{Integer.MIN_VALUE});
                    return true;
                }
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public boolean n() {
        a aVar = this.h;
        return (aVar == null || aVar.V0() == null) ? false : true;
    }

    private void o(Context context, AttributeSet attributeSet, int i2) {
        TypedArray h2 = m.h(context, attributeSet, R$styleable.Chip, i2, x, new int[0]);
        this.q = h2.getBoolean(R$styleable.Chip_ensureMinTouchTargetSize, false);
        this.s = (int) Math.ceil((double) h2.getDimension(R$styleable.Chip_chipMinTouchTargetSize, (float) Math.ceil((double) r.c(getContext(), 48))));
        h2.recycle();
    }

    private void p() {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new b());
        }
    }

    private void q(int i2, int i3, int i4, int i5) {
        this.i = new InsetDrawable(this.h, i2, i3, i4, i5);
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.o != z2) {
            this.o = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.n != z2) {
            this.n = z2;
            refreshDrawableState();
        }
    }

    private void u() {
        if (this.i != null) {
            this.i = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            y();
        }
    }

    private void w(a aVar) {
        if (aVar != null) {
            aVar.t2((a.C0095a) null);
        }
    }

    private void x() {
        o4.i0(this, (!n() || !s() || this.k == null) ? null : this.t);
    }

    private void y() {
        if (ha1.a) {
            z();
            return;
        }
        this.h.O2(true);
        o4.l0(this, getBackgroundDrawable());
        A();
        l();
    }

    private void z() {
        this.j = new RippleDrawable(ha1.d(this.h.j1()), getBackgroundDrawable(), (Drawable) null);
        this.h.O2(false);
        o4.l0(this, this.j);
        A();
    }

    public void a() {
        k(this.s);
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return m(motionEvent) || this.t.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.t.w(keyEvent) || this.t.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        a aVar = this.h;
        if ((aVar == null || !aVar.t1()) ? false : this.h.p2(j())) {
            invalidate();
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.i;
        return insetDrawable == null ? this.h : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        a aVar = this.h;
        if (aVar != null) {
            return aVar.J0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        a aVar = this.h;
        if (aVar != null) {
            return aVar.K0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        a aVar = this.h;
        if (aVar != null) {
            return aVar.L0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        a aVar = this.h;
        return aVar != null ? Math.max(Utils.FLOAT_EPSILON, aVar.M0()) : Utils.FLOAT_EPSILON;
    }

    public Drawable getChipDrawable() {
        return this.h;
    }

    public float getChipEndPadding() {
        a aVar = this.h;
        return aVar != null ? aVar.N0() : Utils.FLOAT_EPSILON;
    }

    public Drawable getChipIcon() {
        a aVar = this.h;
        if (aVar != null) {
            return aVar.O0();
        }
        return null;
    }

    public float getChipIconSize() {
        a aVar = this.h;
        return aVar != null ? aVar.P0() : Utils.FLOAT_EPSILON;
    }

    public ColorStateList getChipIconTint() {
        a aVar = this.h;
        if (aVar != null) {
            return aVar.Q0();
        }
        return null;
    }

    public float getChipMinHeight() {
        a aVar = this.h;
        return aVar != null ? aVar.R0() : Utils.FLOAT_EPSILON;
    }

    public float getChipStartPadding() {
        a aVar = this.h;
        return aVar != null ? aVar.S0() : Utils.FLOAT_EPSILON;
    }

    public ColorStateList getChipStrokeColor() {
        a aVar = this.h;
        if (aVar != null) {
            return aVar.T0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        a aVar = this.h;
        return aVar != null ? aVar.U0() : Utils.FLOAT_EPSILON;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        a aVar = this.h;
        if (aVar != null) {
            return aVar.V0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        a aVar = this.h;
        if (aVar != null) {
            return aVar.W0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        a aVar = this.h;
        return aVar != null ? aVar.X0() : Utils.FLOAT_EPSILON;
    }

    public float getCloseIconSize() {
        a aVar = this.h;
        return aVar != null ? aVar.Y0() : Utils.FLOAT_EPSILON;
    }

    public float getCloseIconStartPadding() {
        a aVar = this.h;
        return aVar != null ? aVar.Z0() : Utils.FLOAT_EPSILON;
    }

    public ColorStateList getCloseIconTint() {
        a aVar = this.h;
        if (aVar != null) {
            return aVar.b1();
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        a aVar = this.h;
        if (aVar != null) {
            return aVar.f1();
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (this.t.A() == 1 || this.t.x() == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public m91 getHideMotionSpec() {
        a aVar = this.h;
        if (aVar != null) {
            return aVar.g1();
        }
        return null;
    }

    public float getIconEndPadding() {
        a aVar = this.h;
        return aVar != null ? aVar.h1() : Utils.FLOAT_EPSILON;
    }

    public float getIconStartPadding() {
        a aVar = this.h;
        return aVar != null ? aVar.i1() : Utils.FLOAT_EPSILON;
    }

    public ColorStateList getRippleColor() {
        a aVar = this.h;
        if (aVar != null) {
            return aVar.j1();
        }
        return null;
    }

    public wa1 getShapeAppearanceModel() {
        return this.h.D();
    }

    public m91 getShowMotionSpec() {
        a aVar = this.h;
        if (aVar != null) {
            return aVar.k1();
        }
        return null;
    }

    public float getTextEndPadding() {
        a aVar = this.h;
        return aVar != null ? aVar.n1() : Utils.FLOAT_EPSILON;
    }

    public float getTextStartPadding() {
        a aVar = this.h;
        return aVar != null ? aVar.o1() : Utils.FLOAT_EPSILON;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007d, code lost:
        if (getMinWidth() != r6) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean k(int r6) {
        /*
            r5 = this;
            r5.s = r6
            boolean r0 = r5.v()
            r1 = 0
            if (r0 != 0) goto L_0x0015
            android.graphics.drawable.InsetDrawable r6 = r5.i
            if (r6 == 0) goto L_0x0011
            r5.u()
            goto L_0x0014
        L_0x0011:
            r5.y()
        L_0x0014:
            return r1
        L_0x0015:
            com.google.android.material.chip.a r0 = r5.h
            int r0 = r0.getIntrinsicHeight()
            int r0 = r6 - r0
            int r0 = java.lang.Math.max(r1, r0)
            com.google.android.material.chip.a r2 = r5.h
            int r2 = r2.getIntrinsicWidth()
            int r2 = r6 - r2
            int r2 = java.lang.Math.max(r1, r2)
            if (r2 > 0) goto L_0x003d
            if (r0 > 0) goto L_0x003d
            android.graphics.drawable.InsetDrawable r6 = r5.i
            if (r6 == 0) goto L_0x0039
            r5.u()
            goto L_0x003c
        L_0x0039:
            r5.y()
        L_0x003c:
            return r1
        L_0x003d:
            if (r2 <= 0) goto L_0x0042
            int r2 = r2 / 2
            goto L_0x0043
        L_0x0042:
            r2 = 0
        L_0x0043:
            if (r0 <= 0) goto L_0x0047
            int r1 = r0 / 2
        L_0x0047:
            android.graphics.drawable.InsetDrawable r0 = r5.i
            r3 = 1
            if (r0 == 0) goto L_0x006a
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.drawable.InsetDrawable r4 = r5.i
            r4.getPadding(r0)
            int r4 = r0.top
            if (r4 != r1) goto L_0x006a
            int r4 = r0.bottom
            if (r4 != r1) goto L_0x006a
            int r4 = r0.left
            if (r4 != r2) goto L_0x006a
            int r0 = r0.right
            if (r0 != r2) goto L_0x006a
            r5.y()
            return r3
        L_0x006a:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 16
            if (r0 < r4) goto L_0x0080
            int r0 = r5.getMinHeight()
            if (r0 == r6) goto L_0x0079
            r5.setMinHeight(r6)
        L_0x0079:
            int r0 = r5.getMinWidth()
            if (r0 == r6) goto L_0x0086
            goto L_0x0083
        L_0x0080:
            r5.setMinHeight(r6)
        L_0x0083:
            r5.setMinWidth(r6)
        L_0x0086:
            r5.q(r2, r1, r2, r1)
            r5.y()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.k(int):boolean");
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        sa1.f(this, this.h);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, z);
        }
        if (r()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, A);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z2, int i2, Rect rect) {
        super.onFocusChanged(z2, i2, rect);
        this.t.K(z2, i2, rect);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                z2 = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        z2 = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(z2);
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((r() || isClickable()) ? r() ? "android.widget.CompoundButton" : "android.widget.Button" : "android.view.View");
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            a5.I0(accessibilityNodeInfo).g0(a5.c.f(chipGroup.b(this), 1, chipGroup.c() ? chipGroup.n(this) : -1, 1, false, isChecked()));
        }
    }

    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    @TargetApi(17)
    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        if (this.r != i2) {
            this.r = i2;
            A();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0034
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.n
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x003e
            r5.setCloseIconPressed(r2)
            goto L_0x003e
        L_0x002b:
            boolean r0 = r5.n
            if (r0 == 0) goto L_0x0034
            r5.t()
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r5.setCloseIconPressed(r2)
            goto L_0x0041
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r3)
        L_0x003e:
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 != 0) goto L_0x0049
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
        L_0x0049:
            r2 = 1
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean r() {
        a aVar = this.h;
        return aVar != null && aVar.s1();
    }

    public boolean s() {
        a aVar = this.h;
        return aVar != null && aVar.u1();
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.j) {
            super.setBackground(drawable);
        }
    }

    public void setBackgroundColor(int i2) {
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.j) {
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundResource(int i2) {
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z2) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.B1(z2);
        }
    }

    public void setCheckableResource(int i2) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.C1(i2);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        a aVar = this.h;
        if (aVar == null) {
            this.m = z2;
        } else if (aVar.s1()) {
            boolean isChecked = isChecked();
            super.setChecked(z2);
            if (isChecked != z2 && (onCheckedChangeListener = this.l) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z2);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.D1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i2) {
        setCheckedIconVisible(i2);
    }

    public void setCheckedIconResource(int i2) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.E1(i2);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.F1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i2) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.G1(i2);
        }
    }

    public void setCheckedIconVisible(int i2) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.H1(i2);
        }
    }

    public void setCheckedIconVisible(boolean z2) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.I1(z2);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.J1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i2) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.K1(i2);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.L1(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i2) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.M1(i2);
        }
    }

    public void setChipDrawable(a aVar) {
        a aVar2 = this.h;
        if (aVar2 != aVar) {
            w(aVar2);
            this.h = aVar;
            aVar.E2(false);
            i(this.h);
            k(this.s);
        }
    }

    public void setChipEndPadding(float f) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.N1(f);
        }
    }

    public void setChipEndPaddingResource(int i2) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.O1(i2);
        }
    }

    public void setChipIcon(Drawable drawable) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.P1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i2) {
        setChipIconVisible(i2);
    }

    public void setChipIconResource(int i2) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.Q1(i2);
        }
    }

    public void setChipIconSize(float f) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.R1(f);
        }
    }

    public void setChipIconSizeResource(int i2) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.S1(i2);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.T1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i2) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.U1(i2);
        }
    }

    public void setChipIconVisible(int i2) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.V1(i2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.W1(z2);
        }
    }

    public void setChipMinHeight(float f) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.X1(f);
        }
    }

    public void setChipMinHeightResource(int i2) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.Y1(i2);
        }
    }

    public void setChipStartPadding(float f) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.Z1(f);
        }
    }

    public void setChipStartPaddingResource(int i2) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.a2(i2);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.b2(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i2) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.c2(i2);
        }
    }

    public void setChipStrokeWidth(float f) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.d2(f);
        }
    }

    public void setChipStrokeWidthResource(int i2) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.e2(i2);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i2) {
        setText(getResources().getString(i2));
    }

    public void setCloseIcon(Drawable drawable) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.g2(drawable);
        }
        x();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.h2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i2) {
        setCloseIconVisible(i2);
    }

    public void setCloseIconEndPadding(float f) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.i2(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i2) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.j2(i2);
        }
    }

    public void setCloseIconResource(int i2) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.k2(i2);
        }
        x();
    }

    public void setCloseIconSize(float f) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.l2(f);
        }
    }

    public void setCloseIconSizeResource(int i2) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.m2(i2);
        }
    }

    public void setCloseIconStartPadding(float f) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.n2(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i2) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.o2(i2);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.q2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i2) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.r2(i2);
        }
    }

    public void setCloseIconVisible(int i2) {
        setCloseIconVisible(getResources().getBoolean(i2));
    }

    public void setCloseIconVisible(boolean z2) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.s2(z2);
        }
        x();
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i4 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, i3, i4, i5);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i4 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i2, i3, i4, i5);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        a aVar = this.h;
        if (aVar != null) {
            aVar.X(f);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.h != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                a aVar = this.h;
                if (aVar != null) {
                    aVar.u2(truncateAt);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.q = z2;
        k(this.s);
    }

    public void setGravity(int i2) {
        if (i2 == 8388627) {
            super.setGravity(i2);
        }
    }

    public void setHideMotionSpec(m91 m91) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.v2(m91);
        }
    }

    public void setHideMotionSpecResource(int i2) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.w2(i2);
        }
    }

    public void setIconEndPadding(float f) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.x2(f);
        }
    }

    public void setIconEndPaddingResource(int i2) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.y2(i2);
        }
    }

    public void setIconStartPadding(float f) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.z2(f);
        }
    }

    public void setIconStartPaddingResource(int i2) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.A2(i2);
        }
    }

    public void setLayoutDirection(int i2) {
        if (this.h != null && Build.VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(i2);
        }
    }

    public void setLines(int i2) {
        if (i2 <= 1) {
            super.setLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i2) {
        if (i2 <= 1) {
            super.setMaxLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i2) {
        super.setMaxWidth(i2);
        a aVar = this.h;
        if (aVar != null) {
            aVar.B2(i2);
        }
    }

    public void setMinLines(int i2) {
        if (i2 <= 1) {
            super.setMinLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    /* access modifiers changed from: package-private */
    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.l = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.k = onClickListener;
        x();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.C2(colorStateList);
        }
        if (!this.h.q1()) {
            z();
        }
    }

    public void setRippleColorResource(int i2) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.D2(i2);
            if (!this.h.q1()) {
                z();
            }
        }
    }

    public void setShapeAppearanceModel(wa1 wa1) {
        this.h.setShapeAppearanceModel(wa1);
    }

    public void setShowMotionSpec(m91 m91) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.F2(m91);
        }
    }

    public void setShowMotionSpecResource(int i2) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.G2(i2);
        }
    }

    public void setSingleLine(boolean z2) {
        if (z2) {
            super.setSingleLine(z2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.h != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            super.setText(this.h.P2() ? null : charSequence, bufferType);
            a aVar = this.h;
            if (aVar != null) {
                aVar.H2(charSequence);
            }
        }
    }

    public void setTextAppearance(int i2) {
        super.setTextAppearance(i2);
        a aVar = this.h;
        if (aVar != null) {
            aVar.J2(i2);
        }
        B();
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        a aVar = this.h;
        if (aVar != null) {
            aVar.J2(i2);
        }
        B();
    }

    public void setTextAppearance(da1 da1) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.I2(da1);
        }
        B();
    }

    public void setTextAppearanceResource(int i2) {
        setTextAppearance(getContext(), i2);
    }

    public void setTextEndPadding(float f) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.K2(f);
        }
    }

    public void setTextEndPaddingResource(int i2) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.L2(i2);
        }
    }

    public void setTextStartPadding(float f) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.M2(f);
        }
    }

    public void setTextStartPaddingResource(int i2) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.N2(i2);
        }
    }

    public boolean t() {
        boolean z2 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.k;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z2 = true;
        }
        this.t.W(1, 1);
        return z2;
    }

    public boolean v() {
        return this.q;
    }
}
