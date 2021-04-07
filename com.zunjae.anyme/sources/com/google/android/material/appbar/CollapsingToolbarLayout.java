package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.R$id;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.m;

public class CollapsingToolbarLayout extends FrameLayout {
    private static final int B = R$style.Widget_Design_CollapsingToolbar;
    x4 A;
    private boolean e;
    private int f;
    private Toolbar g;
    private View h;
    private View i;
    private int j;
    private int k;
    private int l;
    private int m;
    private final Rect n;
    final com.google.android.material.internal.a o;
    private boolean p;
    private boolean q;
    private Drawable r;
    Drawable s;
    private int t;
    private boolean u;
    private ValueAnimator v;
    private long w;
    private int x;
    private AppBarLayout.d y;
    int z;

    public static class LayoutParams extends FrameLayout.LayoutParams {
        int a = 0;
        float b = 0.5f;

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CollapsingToolbarLayout_Layout);
            this.a = obtainStyledAttributes.getInt(R$styleable.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            a(obtainStyledAttributes.getFloat(R$styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public void a(float f) {
            this.b = f;
        }
    }

    class a implements k4 {
        a() {
        }

        public x4 a(View view, x4 x4Var) {
            return CollapsingToolbarLayout.this.j(x4Var);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    private class c implements AppBarLayout.d {
        c() {
        }

        public void a(AppBarLayout appBarLayout, int i) {
            int i2;
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.z = i;
            x4 x4Var = collapsingToolbarLayout.A;
            int f = x4Var != null ? x4Var.f() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                a h = CollapsingToolbarLayout.h(childAt);
                int i4 = layoutParams.a;
                if (i4 == 1) {
                    i2 = y2.b(-i, 0, CollapsingToolbarLayout.this.g(childAt));
                } else if (i4 != 2) {
                } else {
                    i2 = Math.round(((float) (-i)) * layoutParams.b);
                }
                h.f(i2);
            }
            CollapsingToolbarLayout.this.n();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.s != null && f > 0) {
                o4.Z(collapsingToolbarLayout2);
            }
            CollapsingToolbarLayout.this.o.d0(((float) Math.abs(i)) / ((float) ((CollapsingToolbarLayout.this.getHeight() - o4.z(CollapsingToolbarLayout.this)) - f)));
        }
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i2) {
        super(bb1.c(context, attributeSet, i2, B), attributeSet, i2);
        this.e = true;
        this.n = new Rect();
        this.x = -1;
        Context context2 = getContext();
        com.google.android.material.internal.a aVar = new com.google.android.material.internal.a(this);
        this.o = aVar;
        aVar.j0(f91.e);
        TypedArray h2 = m.h(context2, attributeSet, R$styleable.CollapsingToolbarLayout, i2, B, new int[0]);
        this.o.Z(h2.getInt(R$styleable.CollapsingToolbarLayout_expandedTitleGravity, 8388691));
        this.o.R(h2.getInt(R$styleable.CollapsingToolbarLayout_collapsedTitleGravity, 8388627));
        int dimensionPixelSize = h2.getDimensionPixelSize(R$styleable.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.m = dimensionPixelSize;
        this.l = dimensionPixelSize;
        this.k = dimensionPixelSize;
        this.j = dimensionPixelSize;
        if (h2.hasValue(R$styleable.CollapsingToolbarLayout_expandedTitleMarginStart)) {
            this.j = h2.getDimensionPixelSize(R$styleable.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }
        if (h2.hasValue(R$styleable.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
            this.l = h2.getDimensionPixelSize(R$styleable.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }
        if (h2.hasValue(R$styleable.CollapsingToolbarLayout_expandedTitleMarginTop)) {
            this.k = h2.getDimensionPixelSize(R$styleable.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if (h2.hasValue(R$styleable.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
            this.m = h2.getDimensionPixelSize(R$styleable.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        this.p = h2.getBoolean(R$styleable.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(h2.getText(R$styleable.CollapsingToolbarLayout_title));
        this.o.W(R$style.TextAppearance_Design_CollapsingToolbar_Expanded);
        this.o.O(androidx.appcompat.R$style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (h2.hasValue(R$styleable.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
            this.o.W(h2.getResourceId(R$styleable.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if (h2.hasValue(R$styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
            this.o.O(h2.getResourceId(R$styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        this.x = h2.getDimensionPixelSize(R$styleable.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        if (h2.hasValue(R$styleable.CollapsingToolbarLayout_maxLines)) {
            this.o.f0(h2.getInt(R$styleable.CollapsingToolbarLayout_maxLines, 1));
        }
        this.w = (long) h2.getInt(R$styleable.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        setContentScrim(h2.getDrawable(R$styleable.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(h2.getDrawable(R$styleable.CollapsingToolbarLayout_statusBarScrim));
        this.f = h2.getResourceId(R$styleable.CollapsingToolbarLayout_toolbarId, -1);
        h2.recycle();
        setWillNotDraw(false);
        o4.v0(this, new a());
    }

    private void a(int i2) {
        b();
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.v = valueAnimator2;
            valueAnimator2.setDuration(this.w);
            this.v.setInterpolator(i2 > this.t ? f91.c : f91.d);
            this.v.addUpdateListener(new b());
        } else if (valueAnimator.isRunning()) {
            this.v.cancel();
        }
        this.v.setIntValues(new int[]{this.t, i2});
        this.v.start();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
            r6 = this;
            boolean r0 = r6.e
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r6.g = r0
            r6.h = r0
            int r1 = r6.f
            r2 = -1
            if (r1 == r2) goto L_0x001f
            android.view.View r1 = r6.findViewById(r1)
            androidx.appcompat.widget.Toolbar r1 = (androidx.appcompat.widget.Toolbar) r1
            r6.g = r1
            if (r1 == 0) goto L_0x001f
            android.view.View r1 = r6.c(r1)
            r6.h = r1
        L_0x001f:
            androidx.appcompat.widget.Toolbar r1 = r6.g
            r2 = 0
            if (r1 != 0) goto L_0x003c
            int r1 = r6.getChildCount()
            r3 = 0
        L_0x0029:
            if (r3 >= r1) goto L_0x003a
            android.view.View r4 = r6.getChildAt(r3)
            boolean r5 = r4 instanceof androidx.appcompat.widget.Toolbar
            if (r5 == 0) goto L_0x0037
            r0 = r4
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            goto L_0x003a
        L_0x0037:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x003a:
            r6.g = r0
        L_0x003c:
            r6.m()
            r6.e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.b():void");
    }

    private View c(View view) {
        ViewParent parent = view.getParent();
        while (parent != this && parent != null) {
            if (parent instanceof View) {
                view = (View) parent;
            }
            parent = parent.getParent();
        }
        return view;
    }

    private static int f(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    static a h(View view) {
        a aVar = (a) view.getTag(R$id.view_offset_helper);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(view);
        view.setTag(R$id.view_offset_helper, aVar2);
        return aVar2;
    }

    private boolean i(View view) {
        View view2 = this.h;
        if (view2 == null || view2 == this) {
            if (view == this.g) {
                return true;
            }
        } else if (view == view2) {
            return true;
        }
        return false;
    }

    private void l() {
        setContentDescription(getTitle());
    }

    private void m() {
        View view;
        if (!this.p && (view = this.i) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.i);
            }
        }
        if (this.p && this.g != null) {
            if (this.i == null) {
                this.i = new View(getContext());
            }
            if (this.i.getParent() == null) {
                this.g.addView(this.i, -1, -1);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        b();
        if (this.g == null && (drawable = this.r) != null && this.t > 0) {
            drawable.mutate().setAlpha(this.t);
            this.r.draw(canvas);
        }
        if (this.p && this.q) {
            this.o.j(canvas);
        }
        if (this.s != null && this.t > 0) {
            x4 x4Var = this.A;
            int f2 = x4Var != null ? x4Var.f() : 0;
            if (f2 > 0) {
                this.s.setBounds(0, -this.z, getWidth(), f2 - this.z);
                this.s.mutate().setAlpha(this.t);
                this.s.draw(canvas);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        boolean z2;
        if (this.r == null || this.t <= 0 || !i(view)) {
            z2 = false;
        } else {
            this.r.mutate().setAlpha(this.t);
            this.r.draw(canvas);
            z2 = true;
        }
        return super.drawChild(canvas, view, j2) || z2;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.s;
        boolean z2 = false;
        if (drawable != null && drawable.isStateful()) {
            z2 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.r;
        if (drawable2 != null && drawable2.isStateful()) {
            z2 |= drawable2.setState(drawableState);
        }
        com.google.android.material.internal.a aVar = this.o;
        if (aVar != null) {
            z2 |= aVar.h0(drawableState);
        }
        if (z2) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: package-private */
    public final int g(View view) {
        return ((getHeight() - h(view).b()) - view.getHeight()) - ((LayoutParams) view.getLayoutParams()).bottomMargin;
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getCollapsedTitleGravity() {
        return this.o.o();
    }

    public Typeface getCollapsedTitleTypeface() {
        return this.o.s();
    }

    public Drawable getContentScrim() {
        return this.r;
    }

    public int getExpandedTitleGravity() {
        return this.o.w();
    }

    public int getExpandedTitleMarginBottom() {
        return this.m;
    }

    public int getExpandedTitleMarginEnd() {
        return this.l;
    }

    public int getExpandedTitleMarginStart() {
        return this.j;
    }

    public int getExpandedTitleMarginTop() {
        return this.k;
    }

    public Typeface getExpandedTitleTypeface() {
        return this.o.y();
    }

    public int getMaxLines() {
        return this.o.A();
    }

    /* access modifiers changed from: package-private */
    public int getScrimAlpha() {
        return this.t;
    }

    public long getScrimAnimationDuration() {
        return this.w;
    }

    public int getScrimVisibleHeightTrigger() {
        int i2 = this.x;
        if (i2 >= 0) {
            return i2;
        }
        x4 x4Var = this.A;
        int f2 = x4Var != null ? x4Var.f() : 0;
        int z2 = o4.z(this);
        return z2 > 0 ? Math.min((z2 * 2) + f2, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.s;
    }

    public CharSequence getTitle() {
        if (this.p) {
            return this.o.B();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public x4 j(x4 x4Var) {
        x4 x4Var2 = o4.v(this) ? x4Var : null;
        if (!p3.a(this.A, x4Var2)) {
            this.A = x4Var2;
            requestLayout();
        }
        return x4Var.a();
    }

    public void k(boolean z2, boolean z3) {
        if (this.u != z2) {
            int i2 = 255;
            if (z3) {
                if (!z2) {
                    i2 = 0;
                }
                a(i2);
            } else {
                if (!z2) {
                    i2 = 0;
                }
                setScrimAlpha(i2);
            }
            this.u = z2;
        }
    }

    /* access modifiers changed from: package-private */
    public final void n() {
        if (this.r != null || this.s != null) {
            setScrimsShown(getHeight() + this.z < getScrimVisibleHeightTrigger());
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            o4.q0(this, o4.v((View) parent));
            if (this.y == null) {
                this.y = new c();
            }
            ((AppBarLayout) parent).b(this.y);
            o4.g0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.d dVar = this.y;
        if (dVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).p(dVar);
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        View view;
        super.onLayout(z2, i2, i3, i4, i5);
        x4 x4Var = this.A;
        if (x4Var != null) {
            int f2 = x4Var.f();
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (!o4.v(childAt) && childAt.getTop() < f2) {
                    o4.U(childAt, f2);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i7 = 0; i7 < childCount2; i7++) {
            h(getChildAt(i7)).d();
        }
        if (this.p && (view = this.i) != null) {
            boolean z3 = true;
            boolean z4 = o4.N(view) && this.i.getVisibility() == 0;
            this.q = z4;
            if (z4) {
                if (o4.y(this) != 1) {
                    z3 = false;
                }
                View view2 = this.h;
                if (view2 == null) {
                    view2 = this.g;
                }
                int g2 = g(view2);
                com.google.android.material.internal.b.a(this, this.i, this.n);
                com.google.android.material.internal.a aVar = this.o;
                int i8 = this.n.left;
                Toolbar toolbar = this.g;
                int titleMarginEnd = i8 + (z3 ? toolbar.getTitleMarginEnd() : toolbar.getTitleMarginStart());
                int titleMarginTop = this.n.top + g2 + this.g.getTitleMarginTop();
                int i9 = this.n.right;
                Toolbar toolbar2 = this.g;
                aVar.M(titleMarginEnd, titleMarginTop, i9 - (z3 ? toolbar2.getTitleMarginStart() : toolbar2.getTitleMarginEnd()), (this.n.bottom + g2) - this.g.getTitleMarginBottom());
                this.o.U(z3 ? this.l : this.j, this.n.top + this.k, (i4 - i2) - (z3 ? this.j : this.l), (i5 - i3) - this.m);
                this.o.K();
            }
        }
        if (this.g != null) {
            if (this.p && TextUtils.isEmpty(this.o.B())) {
                setTitle(this.g.getTitle());
            }
            View view3 = this.h;
            if (view3 == null || view3 == this) {
                view3 = this.g;
            }
            setMinimumHeight(f(view3));
        }
        n();
        int childCount3 = getChildCount();
        for (int i10 = 0; i10 < childCount3; i10++) {
            h(getChildAt(i10)).a();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        b();
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        x4 x4Var = this.A;
        int f2 = x4Var != null ? x4Var.f() : 0;
        if (mode == 0 && f2 > 0) {
            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + f2, 1073741824));
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        Drawable drawable = this.r;
        if (drawable != null) {
            drawable.setBounds(0, 0, i2, i3);
        }
    }

    public void setCollapsedTitleGravity(int i2) {
        this.o.R(i2);
    }

    public void setCollapsedTitleTextAppearance(int i2) {
        this.o.O(i2);
    }

    public void setCollapsedTitleTextColor(int i2) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.o.Q(colorStateList);
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.o.S(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.r;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.r = drawable3;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getWidth(), getHeight());
                this.r.setCallback(this);
                this.r.setAlpha(this.t);
            }
            o4.Z(this);
        }
    }

    public void setContentScrimColor(int i2) {
        setContentScrim(new ColorDrawable(i2));
    }

    public void setContentScrimResource(int i2) {
        setContentScrim(androidx.core.content.a.f(getContext(), i2));
    }

    public void setExpandedTitleColor(int i2) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setExpandedTitleGravity(int i2) {
        this.o.Z(i2);
    }

    public void setExpandedTitleMarginBottom(int i2) {
        this.m = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i2) {
        this.l = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i2) {
        this.j = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i2) {
        this.k = i2;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i2) {
        this.o.W(i2);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.o.Y(colorStateList);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.o.b0(typeface);
    }

    public void setMaxLines(int i2) {
        this.o.f0(i2);
    }

    /* access modifiers changed from: package-private */
    public void setScrimAlpha(int i2) {
        Toolbar toolbar;
        if (i2 != this.t) {
            if (!(this.r == null || (toolbar = this.g) == null)) {
                o4.Z(toolbar);
            }
            this.t = i2;
            o4.Z(this);
        }
    }

    public void setScrimAnimationDuration(long j2) {
        this.w = j2;
    }

    public void setScrimVisibleHeightTrigger(int i2) {
        if (this.x != i2) {
            this.x = i2;
            n();
        }
    }

    public void setScrimsShown(boolean z2) {
        k(z2, o4.O(this) && !isInEditMode());
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.s;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.s = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.s.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.m(this.s, o4.y(this));
                this.s.setVisible(getVisibility() == 0, false);
                this.s.setCallback(this);
                this.s.setAlpha(this.t);
            }
            o4.Z(this);
        }
    }

    public void setStatusBarScrimColor(int i2) {
        setStatusBarScrim(new ColorDrawable(i2));
    }

    public void setStatusBarScrimResource(int i2) {
        setStatusBarScrim(androidx.core.content.a.f(getContext(), i2));
    }

    public void setTitle(CharSequence charSequence) {
        this.o.i0(charSequence);
        l();
    }

    public void setTitleEnabled(boolean z2) {
        if (z2 != this.p) {
            this.p = z2;
            l();
            m();
            requestLayout();
        }
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.s;
        if (!(drawable == null || drawable.isVisible() == z2)) {
            this.s.setVisible(z2, false);
        }
        Drawable drawable2 = this.r;
        if (drawable2 != null && drawable2.isVisible() != z2) {
            this.r.setVisible(z2, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.r || drawable == this.s;
    }
}
