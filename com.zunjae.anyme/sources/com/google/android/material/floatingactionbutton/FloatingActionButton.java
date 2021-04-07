package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.g;
import androidx.appcompat.widget.i;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.l;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.d;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.internal.m;
import com.google.android.material.internal.r;
import java.util.List;

public class FloatingActionButton extends VisibilityAwareImageButton implements n4, l, x91, za1, CoordinatorLayout.b {
    private static final int u = R$style.Widget_Design_FloatingActionButton;
    private ColorStateList f;
    private PorterDuff.Mode g;
    private ColorStateList h;
    private PorterDuff.Mode i;
    private d impl;
    private ColorStateList j;
    private int k;
    private int l;
    private int m;
    /* access modifiers changed from: private */
    public int n;
    private int o;
    boolean p;
    final Rect q;
    private final Rect r;
    private final i s;
    private final y91 t;

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {
        private Rect a;
        private b b;
        private boolean c;

        public BaseBehavior() {
            this.c = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FloatingActionButton_Behavior_Layout);
            this.c = obtainStyledAttributes.getBoolean(R$styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        private static boolean F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.e) {
                return ((CoordinatorLayout.e) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void G(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.q;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.e eVar = (CoordinatorLayout.e) floatingActionButton.getLayoutParams();
                int i = 0;
                int i2 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - eVar.rightMargin ? rect.right : floatingActionButton.getLeft() <= eVar.leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - eVar.bottomMargin) {
                    i = rect.bottom;
                } else if (floatingActionButton.getTop() <= eVar.topMargin) {
                    i = -rect.top;
                }
                if (i != 0) {
                    o4.U(floatingActionButton, i);
                }
                if (i2 != 0) {
                    o4.T(floatingActionButton, i2);
                }
            }
        }

        private boolean J(View view, FloatingActionButton floatingActionButton) {
            return this.c && ((CoordinatorLayout.e) floatingActionButton.getLayoutParams()).e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        private boolean K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!J(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            com.google.android.material.internal.b.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.m(this.b, false);
                return true;
            }
            floatingActionButton.t(this.b, false);
            return true;
        }

        private boolean L(View view, FloatingActionButton floatingActionButton) {
            if (!J(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.e) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.m(this.b, false);
                return true;
            }
            floatingActionButton.t(this.b, false);
            return true;
        }

        /* renamed from: E */
        public boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.q;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: H */
        public boolean h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                K(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!F(view)) {
                return false;
            } else {
                L(view, floatingActionButton);
                return false;
            }
        }

        /* renamed from: I */
        public boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List<View> v = coordinatorLayout.v(floatingActionButton);
            int size = v.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = v.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (F(view) && L(view, floatingActionButton)) {
                        break;
                    }
                } else if (K(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.M(floatingActionButton, i);
            G(coordinatorLayout, floatingActionButton);
            return true;
        }

        public void g(CoordinatorLayout.e eVar) {
            if (eVar.h == 0) {
                eVar.h = 80;
            }
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    class a implements d.j {
        final /* synthetic */ b a;

        a(b bVar) {
            this.a = bVar;
        }

        public void a() {
            this.a.b(FloatingActionButton.this);
        }

        public void b() {
            this.a.a(FloatingActionButton.this);
        }
    }

    public static abstract class b {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    private class c implements ja1 {
        c() {
        }

        public void a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.q.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.n, i2 + FloatingActionButton.this.n, i3 + FloatingActionButton.this.n, i4 + FloatingActionButton.this.n);
        }

        public boolean b() {
            return FloatingActionButton.this.p;
        }

        public void c(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }
    }

    class d<T extends FloatingActionButton> implements d.i {
        private final p91<T> a;

        d(p91<T> p91) {
            this.a = p91;
        }

        public void a() {
            this.a.b(FloatingActionButton.this);
        }

        public void b() {
            this.a.a(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof d) && ((d) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public FloatingActionButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i2) {
        super(bb1.c(context, attributeSet, i2, u), attributeSet, i2);
        this.q = new Rect();
        this.r = new Rect();
        Context context2 = getContext();
        TypedArray h2 = m.h(context2, attributeSet, R$styleable.FloatingActionButton, i2, u, new int[0]);
        this.f = ca1.a(context2, h2, R$styleable.FloatingActionButton_backgroundTint);
        this.g = r.i(h2.getInt(R$styleable.FloatingActionButton_backgroundTintMode, -1), (PorterDuff.Mode) null);
        this.j = ca1.a(context2, h2, R$styleable.FloatingActionButton_rippleColor);
        this.l = h2.getInt(R$styleable.FloatingActionButton_fabSize, -1);
        this.m = h2.getDimensionPixelSize(R$styleable.FloatingActionButton_fabCustomSize, 0);
        this.k = h2.getDimensionPixelSize(R$styleable.FloatingActionButton_borderWidth, 0);
        float dimension = h2.getDimension(R$styleable.FloatingActionButton_elevation, Utils.FLOAT_EPSILON);
        float dimension2 = h2.getDimension(R$styleable.FloatingActionButton_hoveredFocusedTranslationZ, Utils.FLOAT_EPSILON);
        float dimension3 = h2.getDimension(R$styleable.FloatingActionButton_pressedTranslationZ, Utils.FLOAT_EPSILON);
        this.p = h2.getBoolean(R$styleable.FloatingActionButton_useCompatPadding, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.mtrl_fab_min_touch_target);
        this.o = h2.getDimensionPixelSize(R$styleable.FloatingActionButton_maxImageSize, 0);
        m91 c2 = m91.c(context2, h2, R$styleable.FloatingActionButton_showMotionSpec);
        m91 c3 = m91.c(context2, h2, R$styleable.FloatingActionButton_hideMotionSpec);
        wa1 m2 = wa1.g(context2, attributeSet, i2, u, wa1.m).m();
        boolean z = h2.getBoolean(R$styleable.FloatingActionButton_ensureMinTouchTargetSize, false);
        setEnabled(h2.getBoolean(R$styleable.FloatingActionButton_android_enabled, true));
        h2.recycle();
        i iVar = new i(this);
        this.s = iVar;
        iVar.f(attributeSet, i2);
        this.t = new y91(this);
        getImpl().W(m2);
        getImpl().x(this.f, this.g, this.j, this.k);
        getImpl().S(dimensionPixelSize);
        getImpl().N(dimension);
        getImpl().Q(dimension2);
        getImpl().T(dimension3);
        getImpl().R(this.o);
        getImpl().X(c2);
        getImpl().P(c3);
        getImpl().O(z);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private d getImpl() {
        if (this.impl == null) {
            this.impl = h();
        }
        return this.impl;
    }

    private d h() {
        return Build.VERSION.SDK_INT >= 21 ? new e(this, new c()) : new d(this, new c());
    }

    private int k(int i2) {
        int i3 = this.m;
        if (i3 != 0) {
            return i3;
        }
        Resources resources = getResources();
        if (i2 == -1) {
            return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? k(1) : k(0);
        }
        return resources.getDimensionPixelSize(i2 != 1 ? R$dimen.design_fab_size_normal : R$dimen.design_fab_size_mini);
    }

    private void p(Rect rect) {
        int i2 = rect.left;
        Rect rect2 = this.q;
        rect.left = i2 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private void q() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.h;
            if (colorStateList == null) {
                androidx.core.graphics.drawable.a.c(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.i;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(g.e(colorForState, mode));
        }
    }

    private static int r(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i2, size);
        }
        if (mode == 0) {
            return i2;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    private d.j u(b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(bVar);
    }

    public void d(Animator.AnimatorListener animatorListener) {
        getImpl().d(animatorListener);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().E(getDrawableState());
    }

    public void e(Animator.AnimatorListener animatorListener) {
        getImpl().e(animatorListener);
    }

    public void f(p91<? extends FloatingActionButton> p91) {
        getImpl().f(new d(p91));
    }

    public boolean g() {
        return this.t.c();
    }

    public ColorStateList getBackgroundTintList() {
        return this.f;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.g;
    }

    public CoordinatorLayout.Behavior<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().n();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().q();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().t();
    }

    public Drawable getContentBackground() {
        return getImpl().k();
    }

    public int getCustomSize() {
        return this.m;
    }

    public int getExpandedComponentIdHint() {
        return this.t.b();
    }

    public m91 getHideMotionSpec() {
        return getImpl().p();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.j;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.j;
    }

    public wa1 getShapeAppearanceModel() {
        wa1 u2 = getImpl().u();
        u3.c(u2);
        return u2;
    }

    public m91 getShowMotionSpec() {
        return getImpl().v();
    }

    public int getSize() {
        return this.l;
    }

    /* access modifiers changed from: package-private */
    public int getSizeDimension() {
        return k(this.l);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.h;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.i;
    }

    public boolean getUseCompatPadding() {
        return this.p;
    }

    @Deprecated
    public boolean i(Rect rect) {
        if (!o4.O(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        p(rect);
        return true;
    }

    public void j(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        p(rect);
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().A();
    }

    public void l(b bVar) {
        m(bVar, true);
    }

    /* access modifiers changed from: package-private */
    public void m(b bVar, boolean z) {
        getImpl().w(u(bVar), z);
    }

    public boolean n() {
        return getImpl().y();
    }

    public boolean o() {
        return getImpl().z();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().B();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().D();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int sizeDimension = getSizeDimension();
        this.n = (sizeDimension - this.o) / 2;
        getImpl().e0();
        int min = Math.min(r(sizeDimension, i2), r(sizeDimension, i3));
        Rect rect = this.q;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ab1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ab1 ab1 = (ab1) parcelable;
        super.onRestoreInstanceState(ab1.a());
        y91 y91 = this.t;
        Bundle bundle = ab1.g.get("expandableWidgetHelper");
        u3.c(bundle);
        y91.d(bundle);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ab1 ab1 = new ab1(onSaveInstanceState);
        ab1.g.put("expandableWidgetHelper", this.t.e());
        return ab1;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !i(this.r) || this.r.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void s(b bVar) {
        t(bVar, true);
    }

    public void setBackgroundColor(int i2) {
    }

    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setBackgroundResource(int i2) {
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f != colorStateList) {
            this.f = colorStateList;
            getImpl().L(colorStateList);
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.g != mode) {
            this.g = mode;
            getImpl().M(mode);
        }
    }

    public void setCompatElevation(float f2) {
        getImpl().N(f2);
    }

    public void setCompatElevationResource(int i2) {
        setCompatElevation(getResources().getDimension(i2));
    }

    public void setCompatHoveredFocusedTranslationZ(float f2) {
        getImpl().Q(f2);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i2) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i2));
    }

    public void setCompatPressedTranslationZ(float f2) {
        getImpl().T(f2);
    }

    public void setCompatPressedTranslationZResource(int i2) {
        setCompatPressedTranslationZ(getResources().getDimension(i2));
    }

    public void setCustomSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i2 != this.m) {
            this.m = i2;
            requestLayout();
        }
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        getImpl().f0(f2);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().o()) {
            getImpl().O(z);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i2) {
        this.t.f(i2);
    }

    public void setHideMotionSpec(m91 m91) {
        getImpl().P(m91);
    }

    public void setHideMotionSpecResource(int i2) {
        setHideMotionSpec(m91.d(getContext(), i2));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().d0();
            if (this.h != null) {
                q();
            }
        }
    }

    public void setImageResource(int i2) {
        this.s.g(i2);
        q();
    }

    public void setRippleColor(int i2) {
        setRippleColor(ColorStateList.valueOf(i2));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.j != colorStateList) {
            this.j = colorStateList;
            getImpl().U(this.j);
        }
    }

    public void setScaleX(float f2) {
        super.setScaleX(f2);
        getImpl().I();
    }

    public void setScaleY(float f2) {
        super.setScaleY(f2);
        getImpl().I();
    }

    public void setShadowPaddingEnabled(boolean z) {
        getImpl().V(z);
    }

    public void setShapeAppearanceModel(wa1 wa1) {
        getImpl().W(wa1);
    }

    public void setShowMotionSpec(m91 m91) {
        getImpl().X(m91);
    }

    public void setShowMotionSpecResource(int i2) {
        setShowMotionSpec(m91.d(getContext(), i2));
    }

    public void setSize(int i2) {
        this.m = 0;
        if (i2 != this.l) {
            this.l = i2;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.h != colorStateList) {
            this.h = colorStateList;
            q();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.i != mode) {
            this.i = mode;
            q();
        }
    }

    public void setTranslationX(float f2) {
        super.setTranslationX(f2);
        getImpl().J();
    }

    public void setTranslationY(float f2) {
        super.setTranslationY(f2);
        getImpl().J();
    }

    public void setTranslationZ(float f2) {
        super.setTranslationZ(f2);
        getImpl().J();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.p != z) {
            this.p = z;
            getImpl().C();
        }
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    /* access modifiers changed from: package-private */
    public void t(b bVar, boolean z) {
        getImpl().b0(u(bVar), z);
    }
}
