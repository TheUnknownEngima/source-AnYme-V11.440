package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.widget.i;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.m;
import com.google.android.material.internal.r;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MaterialButton extends AppCompatButton implements Checkable, za1 {
    private static final int[] t = {16842911};
    private static final int[] u = {16842912};
    private static final int v = R$style.Widget_MaterialComponents_Button;
    private final a g;
    private final LinkedHashSet<a> h;
    private b i;
    private PorterDuff.Mode j;
    private ColorStateList k;
    private Drawable l;
    private int m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private boolean r;
    private int s;

    public interface a {
        void a(MaterialButton materialButton, boolean z);
    }

    interface b {
        void a(MaterialButton materialButton, boolean z);
    }

    static class c extends j5 {
        public static final Parcelable.Creator<c> CREATOR = new a();
        boolean g;

        static class a implements Parcelable.ClassLoaderCreator<c> {
            a() {
            }

            /* renamed from: a */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            /* renamed from: c */
            public c[] newArray(int i) {
                return new c[i];
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                c.class.getClassLoader();
            }
            b(parcel);
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.g = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.g ? 1 : 0);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.materialButtonStyle);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i2) {
        super(bb1.c(context, attributeSet, i2, v), attributeSet, i2);
        this.h = new LinkedHashSet<>();
        boolean z = false;
        this.q = false;
        this.r = false;
        Context context2 = getContext();
        TypedArray h2 = m.h(context2, attributeSet, R$styleable.MaterialButton, i2, v, new int[0]);
        this.p = h2.getDimensionPixelSize(R$styleable.MaterialButton_iconPadding, 0);
        this.j = r.i(h2.getInt(R$styleable.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.k = ca1.a(getContext(), h2, R$styleable.MaterialButton_iconTint);
        this.l = ca1.d(getContext(), h2, R$styleable.MaterialButton_icon);
        this.s = h2.getInteger(R$styleable.MaterialButton_iconGravity, 1);
        this.m = h2.getDimensionPixelSize(R$styleable.MaterialButton_iconSize, 0);
        a aVar = new a(this, wa1.e(context2, attributeSet, i2, v).m());
        this.g = aVar;
        aVar.o(h2);
        h2.recycle();
        setCompoundDrawablePadding(this.p);
        j(this.l != null ? true : z);
    }

    private boolean c() {
        int i2 = this.s;
        return i2 == 3 || i2 == 4;
    }

    private boolean d() {
        int i2 = this.s;
        return i2 == 1 || i2 == 2;
    }

    private boolean e() {
        int i2 = this.s;
        return i2 == 16 || i2 == 32;
    }

    private boolean f() {
        return o4.y(this) == 1;
    }

    private boolean g() {
        a aVar = this.g;
        return aVar != null && !aVar.m();
    }

    private String getA11yClassName() {
        return (b() ? CompoundButton.class : Button.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    private void i() {
        if (d()) {
            i.l(this, this.l, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (c()) {
            i.l(this, (Drawable) null, (Drawable) null, this.l, (Drawable) null);
        } else if (e()) {
            i.l(this, (Drawable) null, this.l, (Drawable) null, (Drawable) null);
        }
    }

    private void j(boolean z) {
        Drawable drawable = this.l;
        if (drawable != null) {
            Drawable mutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
            this.l = mutate;
            androidx.core.graphics.drawable.a.o(mutate, this.k);
            PorterDuff.Mode mode = this.j;
            if (mode != null) {
                androidx.core.graphics.drawable.a.p(this.l, mode);
            }
            int i2 = this.m;
            if (i2 == 0) {
                i2 = this.l.getIntrinsicWidth();
            }
            int i3 = this.m;
            if (i3 == 0) {
                i3 = this.l.getIntrinsicHeight();
            }
            Drawable drawable2 = this.l;
            int i4 = this.n;
            int i5 = this.o;
            drawable2.setBounds(i4, i5, i2 + i4, i3 + i5);
        }
        if (z) {
            i();
            return;
        }
        Drawable[] a2 = i.a(this);
        boolean z2 = false;
        Drawable drawable3 = a2[0];
        Drawable drawable4 = a2[1];
        Drawable drawable5 = a2[2];
        if ((d() && drawable3 != this.l) || ((c() && drawable5 != this.l) || (e() && drawable4 != this.l))) {
            z2 = true;
        }
        if (z2) {
            i();
        }
    }

    private void k(int i2, int i3) {
        if (this.l != null && getLayout() != null) {
            if (d() || c()) {
                this.o = 0;
                int i4 = this.s;
                boolean z = true;
                if (i4 == 1 || i4 == 3) {
                    this.n = 0;
                } else {
                    int i5 = this.m;
                    if (i5 == 0) {
                        i5 = this.l.getIntrinsicWidth();
                    }
                    int textWidth = (((((i2 - getTextWidth()) - o4.C(this)) - i5) - this.p) - o4.D(this)) / 2;
                    boolean f = f();
                    if (this.s != 4) {
                        z = false;
                    }
                    if (f != z) {
                        textWidth = -textWidth;
                    }
                    if (this.n != textWidth) {
                        this.n = textWidth;
                        j(false);
                        return;
                    }
                    return;
                }
            } else if (e()) {
                this.n = 0;
                if (this.s == 16) {
                    this.o = 0;
                } else {
                    int i6 = this.m;
                    if (i6 == 0) {
                        i6 = this.l.getIntrinsicHeight();
                    }
                    int textHeight = (((((i3 - getTextHeight()) - getPaddingTop()) - i6) - this.p) - getPaddingBottom()) / 2;
                    if (this.o != textHeight) {
                        this.o = textHeight;
                        j(false);
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            j(false);
        }
    }

    public void a(a aVar) {
        this.h.add(aVar);
    }

    public boolean b() {
        a aVar = this.g;
        return aVar != null && aVar.n();
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (g()) {
            return this.g.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.l;
    }

    public int getIconGravity() {
        return this.s;
    }

    public int getIconPadding() {
        return this.p;
    }

    public int getIconSize() {
        return this.m;
    }

    public ColorStateList getIconTint() {
        return this.k;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.j;
    }

    public ColorStateList getRippleColor() {
        if (g()) {
            return this.g.f();
        }
        return null;
    }

    public wa1 getShapeAppearanceModel() {
        if (g()) {
            return this.g.g();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (g()) {
            return this.g.h();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (g()) {
            return this.g.i();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        return g() ? this.g.j() : super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return g() ? this.g.k() : super.getSupportBackgroundTintMode();
    }

    public void h(a aVar) {
        this.h.remove(aVar);
    }

    public boolean isChecked() {
        return this.q;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (g()) {
            sa1.f(this, this.g.d());
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (b()) {
            Button.mergeDrawableStates(onCreateDrawableState, t);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, u);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(b());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        a aVar;
        super.onLayout(z, i2, i3, i4, i5);
        if (Build.VERSION.SDK_INT == 21 && (aVar = this.g) != null) {
            aVar.B(i5 - i3, i4 - i2);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.a());
        setChecked(cVar.g);
    }

    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.g = this.q;
        return cVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        k(i2, i3);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        k(getMeasuredWidth(), getMeasuredHeight());
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i2) {
        if (g()) {
            this.g.p(i2);
        } else {
            super.setBackgroundColor(i2);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (g()) {
            if (drawable != getBackground()) {
                this.g.q();
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundResource(int i2) {
        setBackgroundDrawable(i2 != 0 ? f.d(getContext(), i2) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (g()) {
            this.g.r(z);
        }
    }

    public void setChecked(boolean z) {
        if (b() && isEnabled() && this.q != z) {
            this.q = z;
            refreshDrawableState();
            if (!this.r) {
                this.r = true;
                Iterator it = this.h.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(this, this.q);
                }
                this.r = false;
            }
        }
    }

    public void setCornerRadius(int i2) {
        if (g()) {
            this.g.s(i2);
        }
    }

    public void setCornerRadiusResource(int i2) {
        if (g()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        if (g()) {
            this.g.d().X(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.l != drawable) {
            this.l = drawable;
            j(true);
            k(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i2) {
        if (this.s != i2) {
            this.s = i2;
            k(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i2) {
        if (this.p != i2) {
            this.p = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public void setIconResource(int i2) {
        setIcon(i2 != 0 ? f.d(getContext(), i2) : null);
    }

    public void setIconSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.m != i2) {
            this.m = i2;
            j(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            j(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.j != mode) {
            this.j = mode;
            j(false);
        }
    }

    public void setIconTintResource(int i2) {
        setIconTint(f.c(getContext(), i2));
    }

    /* access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* access modifiers changed from: package-private */
    public void setOnPressedChangeListenerInternal(b bVar) {
        this.i = bVar;
    }

    public void setPressed(boolean z) {
        b bVar = this.i;
        if (bVar != null) {
            bVar.a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (g()) {
            this.g.t(colorStateList);
        }
    }

    public void setRippleColorResource(int i2) {
        if (g()) {
            setRippleColor(f.c(getContext(), i2));
        }
    }

    public void setShapeAppearanceModel(wa1 wa1) {
        if (g()) {
            this.g.u(wa1);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    /* access modifiers changed from: package-private */
    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (g()) {
            this.g.v(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (g()) {
            this.g.w(colorStateList);
        }
    }

    public void setStrokeColorResource(int i2) {
        if (g()) {
            setStrokeColor(f.c(getContext(), i2));
        }
    }

    public void setStrokeWidth(int i2) {
        if (g()) {
            this.g.x(i2);
        }
    }

    public void setStrokeWidthResource(int i2) {
        if (g()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (g()) {
            this.g.y(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (g()) {
            this.g.z(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    public void toggle() {
        setChecked(!this.q);
    }
}
