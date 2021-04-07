package com.google.android.material.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.g0;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.e;
import com.google.android.material.internal.m;

public class NavigationView extends ScrimInsetsFrameLayout {
    private static final int[] q = {16842912};
    private static final int[] r = {-16842910};
    private static final int s = R$style.Widget_Design_NavigationView;
    private final com.google.android.material.internal.d j;
    /* access modifiers changed from: private */
    public final e k;
    c l;
    private final int m;
    /* access modifiers changed from: private */
    public final int[] n;
    private MenuInflater o;
    private ViewTreeObserver.OnGlobalLayoutListener p;

    class a implements g.a {
        a() {
        }

        public boolean a(g gVar, MenuItem menuItem) {
            c cVar = NavigationView.this.l;
            return cVar != null && cVar.a(menuItem);
        }

        public void b(g gVar) {
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        public void onGlobalLayout() {
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.n);
            boolean z = true;
            boolean z2 = NavigationView.this.n[1] == 0;
            NavigationView.this.k.y(z2);
            NavigationView.this.setDrawTopInsetForeground(z2);
            Context context = NavigationView.this.getContext();
            if ((context instanceof Activity) && Build.VERSION.SDK_INT >= 21) {
                Activity activity = (Activity) context;
                boolean z3 = activity.findViewById(16908290).getHeight() == NavigationView.this.getHeight();
                boolean z4 = Color.alpha(activity.getWindow().getNavigationBarColor()) != 0;
                NavigationView navigationView2 = NavigationView.this;
                if (!z3 || !z4) {
                    z = false;
                }
                navigationView2.setDrawBottomInsetForeground(z);
            }
        }
    }

    public interface c {
        boolean a(MenuItem menuItem);
    }

    public static class d extends j5 {
        public static final Parcelable.Creator<d> CREATOR = new a();
        public Bundle g;

        static class a implements Parcelable.ClassLoaderCreator<d> {
            a() {
            }

            /* renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            /* renamed from: c */
            public d[] newArray(int i) {
                return new d[i];
            }
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.g = parcel.readBundle(classLoader);
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.g);
        }
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.navigationViewStyle);
    }

    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        super(bb1.c(context, attributeSet, i, s), attributeSet, i);
        boolean z;
        int i2;
        this.k = new e();
        this.n = new int[2];
        Context context2 = getContext();
        this.j = new com.google.android.material.internal.d(context2);
        g0 i3 = m.i(context2, attributeSet, R$styleable.NavigationView, i, s, new int[0]);
        if (i3.r(R$styleable.NavigationView_android_background)) {
            o4.l0(this, i3.g(R$styleable.NavigationView_android_background));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            Drawable background = getBackground();
            ra1 ra1 = new ra1();
            if (background instanceof ColorDrawable) {
                ra1.Y(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            ra1.N(context2);
            o4.l0(this, ra1);
        }
        if (i3.r(R$styleable.NavigationView_elevation)) {
            setElevation((float) i3.f(R$styleable.NavigationView_elevation, 0));
        }
        setFitsSystemWindows(i3.a(R$styleable.NavigationView_android_fitsSystemWindows, false));
        this.m = i3.f(R$styleable.NavigationView_android_maxWidth, 0);
        ColorStateList c2 = i3.r(R$styleable.NavigationView_itemIconTint) ? i3.c(R$styleable.NavigationView_itemIconTint) : d(16842808);
        if (i3.r(R$styleable.NavigationView_itemTextAppearance)) {
            i2 = i3.n(R$styleable.NavigationView_itemTextAppearance, 0);
            z = true;
        } else {
            i2 = 0;
            z = false;
        }
        if (i3.r(R$styleable.NavigationView_itemIconSize)) {
            setItemIconSize(i3.f(R$styleable.NavigationView_itemIconSize, 0));
        }
        ColorStateList c3 = i3.r(R$styleable.NavigationView_itemTextColor) ? i3.c(R$styleable.NavigationView_itemTextColor) : null;
        if (!z && c3 == null) {
            c3 = d(16842806);
        }
        Drawable g = i3.g(R$styleable.NavigationView_itemBackground);
        if (g == null && f(i3)) {
            g = e(i3);
        }
        if (i3.r(R$styleable.NavigationView_itemHorizontalPadding)) {
            this.k.C(i3.f(R$styleable.NavigationView_itemHorizontalPadding, 0));
        }
        int f = i3.f(R$styleable.NavigationView_itemIconPadding, 0);
        setItemMaxLines(i3.k(R$styleable.NavigationView_itemMaxLines, 1));
        this.j.V(new a());
        this.k.A(1);
        this.k.l(context2, this.j);
        this.k.F(c2);
        this.k.J(getOverScrollMode());
        if (z) {
            this.k.H(i2);
        }
        this.k.I(c3);
        this.k.B(g);
        this.k.D(f);
        this.j.b(this.k);
        addView((View) this.k.w(this));
        if (i3.r(R$styleable.NavigationView_menu)) {
            h(i3.n(R$styleable.NavigationView_menu, 0));
        }
        if (i3.r(R$styleable.NavigationView_headerLayout)) {
            g(i3.n(R$styleable.NavigationView_headerLayout, 0));
        }
        i3.v();
        i();
    }

    private ColorStateList d(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList c2 = f.c(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(androidx.appcompat.R$attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = c2.getDefaultColor();
        return new ColorStateList(new int[][]{r, q, FrameLayout.EMPTY_STATE_SET}, new int[]{c2.getColorForState(r, defaultColor), i2, defaultColor});
    }

    private final Drawable e(g0 g0Var) {
        ra1 ra1 = new ra1(wa1.b(getContext(), g0Var.n(R$styleable.NavigationView_itemShapeAppearance, 0), g0Var.n(R$styleable.NavigationView_itemShapeAppearanceOverlay, 0)).m());
        ra1.Y(ca1.b(getContext(), g0Var, R$styleable.NavigationView_itemShapeFillColor));
        return new InsetDrawable(ra1, g0Var.f(R$styleable.NavigationView_itemShapeInsetStart, 0), g0Var.f(R$styleable.NavigationView_itemShapeInsetTop, 0), g0Var.f(R$styleable.NavigationView_itemShapeInsetEnd, 0), g0Var.f(R$styleable.NavigationView_itemShapeInsetBottom, 0));
    }

    private boolean f(g0 g0Var) {
        return g0Var.r(R$styleable.NavigationView_itemShapeAppearance) || g0Var.r(R$styleable.NavigationView_itemShapeAppearanceOverlay);
    }

    private MenuInflater getMenuInflater() {
        if (this.o == null) {
            this.o = new s(getContext());
        }
        return this.o;
    }

    private void i() {
        this.p = new b();
        getViewTreeObserver().addOnGlobalLayoutListener(this.p);
    }

    /* access modifiers changed from: protected */
    public void a(x4 x4Var) {
        this.k.d(x4Var);
    }

    public View g(int i) {
        return this.k.x(i);
    }

    public MenuItem getCheckedItem() {
        return this.k.e();
    }

    public int getHeaderCount() {
        return this.k.n();
    }

    public Drawable getItemBackground() {
        return this.k.q();
    }

    public int getItemHorizontalPadding() {
        return this.k.r();
    }

    public int getItemIconPadding() {
        return this.k.s();
    }

    public ColorStateList getItemIconTintList() {
        return this.k.v();
    }

    public int getItemMaxLines() {
        return this.k.t();
    }

    public ColorStateList getItemTextColor() {
        return this.k.u();
    }

    public Menu getMenu() {
        return this.j;
    }

    public void h(int i) {
        this.k.K(true);
        getMenuInflater().inflate(i, this.j);
        this.k.K(false);
        this.k.g(false);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        sa1.e(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 16) {
            getViewTreeObserver().removeGlobalOnLayoutListener(this.p);
        } else {
            getViewTreeObserver().removeOnGlobalLayoutListener(this.p);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i3 = this.m;
            }
            super.onMeasure(i, i2);
        }
        i3 = Math.min(View.MeasureSpec.getSize(i), this.m);
        i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.a());
        this.j.S(dVar.g);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        dVar.g = bundle;
        this.j.U(bundle);
        return dVar;
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.j.findItem(i);
        if (findItem != null) {
            this.k.z((i) findItem);
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.j.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.k.z((i) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    public void setElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.setElevation(f);
        }
        sa1.d(this, f);
    }

    public void setItemBackground(Drawable drawable) {
        this.k.B(drawable);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(androidx.core.content.a.f(getContext(), i));
    }

    public void setItemHorizontalPadding(int i) {
        this.k.C(i);
    }

    public void setItemHorizontalPaddingResource(int i) {
        this.k.C(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(int i) {
        this.k.D(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.k.D(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconSize(int i) {
        this.k.E(i);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.k.F(colorStateList);
    }

    public void setItemMaxLines(int i) {
        this.k.G(i);
    }

    public void setItemTextAppearance(int i) {
        this.k.H(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.k.I(colorStateList);
    }

    public void setNavigationItemSelectedListener(c cVar) {
        this.l = cVar;
    }

    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        e eVar = this.k;
        if (eVar != null) {
            eVar.J(i);
        }
    }
}
