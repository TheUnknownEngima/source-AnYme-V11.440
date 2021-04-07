package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.m;

public class MaterialCardView extends CardView implements Checkable, za1 {
    private static final int[] s = {16842911};
    private static final int[] t = {16842912};
    private static final int[] u = {R$attr.state_dragged};
    private static final int v = R$style.Widget_MaterialComponents_CardView;
    private final a n;
    private boolean o;
    private boolean p;
    private boolean q;
    private a r;

    public interface a {
        void a(MaterialCardView materialCardView, boolean z);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.materialCardViewStyle);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        super(bb1.c(context, attributeSet, i, v), attributeSet, i);
        this.p = false;
        this.q = false;
        this.o = true;
        TypedArray h = m.h(getContext(), attributeSet, R$styleable.MaterialCardView, i, v, new int[0]);
        a aVar = new a(this, attributeSet, i, v);
        this.n = aVar;
        aVar.F(super.getCardBackgroundColor());
        this.n.Q(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        this.n.C(h);
        h.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.n.k().getBounds());
        return rectF;
    }

    private void j() {
        if (Build.VERSION.SDK_INT > 26) {
            this.n.j();
        }
    }

    public ColorStateList getCardBackgroundColor() {
        return this.n.l();
    }

    public ColorStateList getCardForegroundColor() {
        return this.n.m();
    }

    /* access modifiers changed from: package-private */
    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.n.n();
    }

    public ColorStateList getCheckedIconTint() {
        return this.n.o();
    }

    public int getContentPaddingBottom() {
        return this.n.y().bottom;
    }

    public int getContentPaddingLeft() {
        return this.n.y().left;
    }

    public int getContentPaddingRight() {
        return this.n.y().right;
    }

    public int getContentPaddingTop() {
        return this.n.y().top;
    }

    public float getProgress() {
        return this.n.s();
    }

    public float getRadius() {
        return this.n.q();
    }

    public ColorStateList getRippleColor() {
        return this.n.t();
    }

    public wa1 getShapeAppearanceModel() {
        return this.n.u();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.n.v();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.n.w();
    }

    public int getStrokeWidth() {
        return this.n.x();
    }

    public void h(int i, int i2, int i3, int i4) {
        this.n.Q(i, i2, i3, i4);
    }

    public boolean isChecked() {
        return this.p;
    }

    public boolean k() {
        a aVar = this.n;
        return aVar != null && aVar.B();
    }

    public boolean l() {
        return this.q;
    }

    /* access modifiers changed from: package-private */
    public void m(int i, int i2, int i3, int i4) {
        super.h(i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        sa1.f(this, this.n.k());
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (k()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, s);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, t);
        }
        if (l()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, u);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(k());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.n.D(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.o) {
            if (!this.n.A()) {
                this.n.E(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setCardBackgroundColor(int i) {
        this.n.F(ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.n.F(colorStateList);
    }

    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.n.V();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.n.G(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.n.H(z);
    }

    public void setChecked(boolean z) {
        if (this.p != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.n.I(drawable);
    }

    public void setCheckedIconResource(int i) {
        this.n.I(f.d(getContext(), i));
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.n.J(colorStateList);
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        this.n.T();
    }

    public void setDragged(boolean z) {
        if (this.q != z) {
            this.q = z;
            refreshDrawableState();
            j();
            invalidate();
        }
    }

    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.n.X();
    }

    public void setOnCheckedChangeListener(a aVar) {
        this.r = aVar;
    }

    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.n.X();
        this.n.U();
    }

    public void setProgress(float f) {
        this.n.L(f);
    }

    public void setRadius(float f) {
        super.setRadius(f);
        this.n.K(f);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.n.M(colorStateList);
    }

    public void setRippleColorResource(int i) {
        this.n.M(f.c(getContext(), i));
    }

    public void setShapeAppearanceModel(wa1 wa1) {
        if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(wa1.u(getBoundsAsRectF()));
        }
        this.n.N(wa1);
    }

    public void setStrokeColor(int i) {
        this.n.O(ColorStateList.valueOf(i));
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.n.O(colorStateList);
    }

    public void setStrokeWidth(int i) {
        this.n.P(i);
    }

    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.n.X();
        this.n.U();
    }

    public void toggle() {
        if (k() && isEnabled()) {
            this.p = !this.p;
            refreshDrawableState();
            j();
            a aVar = this.r;
            if (aVar != null) {
                aVar.a(this, this.p);
            }
        }
    }
}
