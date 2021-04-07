package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.g0;
import com.google.android.material.R$attr;
import com.google.android.material.R$color;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.m;
import com.google.android.material.internal.r;

public class BottomNavigationView extends FrameLayout {
    private static final int l = R$style.Widget_Design_BottomNavigationView;
    private final g e;
    final BottomNavigationMenuView f;
    private final b g;
    private ColorStateList h;
    private MenuInflater i;
    /* access modifiers changed from: private */
    public d j;
    /* access modifiers changed from: private */
    public c k;

    class a implements g.a {
        a() {
        }

        public boolean a(g gVar, MenuItem menuItem) {
            if (BottomNavigationView.this.k == null || menuItem.getItemId() != BottomNavigationView.this.getSelectedItemId()) {
                return BottomNavigationView.this.j != null && !BottomNavigationView.this.j.a(menuItem);
            }
            BottomNavigationView.this.k.a(menuItem);
            return true;
        }

        public void b(g gVar) {
        }
    }

    class b implements r.d {
        b(BottomNavigationView bottomNavigationView) {
        }

        public x4 a(View view, x4 x4Var, r.e eVar) {
            eVar.d += x4Var.c();
            boolean z = true;
            if (o4.y(view) != 1) {
                z = false;
            }
            int d = x4Var.d();
            int e = x4Var.e();
            eVar.a += z ? e : d;
            int i = eVar.c;
            if (!z) {
                d = e;
            }
            eVar.c = i + d;
            eVar.a(view);
            return x4Var;
        }
    }

    public interface c {
        void a(MenuItem menuItem);
    }

    public interface d {
        boolean a(MenuItem menuItem);
    }

    static class e extends j5 {
        public static final Parcelable.Creator<e> CREATOR = new a();
        Bundle g;

        static class a implements Parcelable.ClassLoaderCreator<e> {
            a() {
            }

            /* renamed from: a */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new e(parcel, classLoader);
            }

            /* renamed from: c */
            public e[] newArray(int i) {
                return new e[i];
            }
        }

        public e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel, classLoader == null ? e.class.getClassLoader() : classLoader);
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel, ClassLoader classLoader) {
            this.g = parcel.readBundle(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.g);
        }
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.bottomNavigationStyle);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i2) {
        super(bb1.c(context, attributeSet, i2, l), attributeSet, i2);
        BottomNavigationMenuView bottomNavigationMenuView;
        ColorStateList colorStateList;
        this.g = new b();
        Context context2 = getContext();
        this.e = new a(context2);
        this.f = new BottomNavigationMenuView(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f.setLayoutParams(layoutParams);
        this.g.a(this.f);
        this.g.b(1);
        this.f.setPresenter(this.g);
        this.e.b(this.g);
        this.g.l(getContext(), this.e);
        g0 i3 = m.i(context2, attributeSet, R$styleable.BottomNavigationView, i2, R$style.Widget_Design_BottomNavigationView, R$styleable.BottomNavigationView_itemTextAppearanceInactive, R$styleable.BottomNavigationView_itemTextAppearanceActive);
        if (i3.r(R$styleable.BottomNavigationView_itemIconTint)) {
            bottomNavigationMenuView = this.f;
            colorStateList = i3.c(R$styleable.BottomNavigationView_itemIconTint);
        } else {
            bottomNavigationMenuView = this.f;
            colorStateList = bottomNavigationMenuView.e(16842808);
        }
        bottomNavigationMenuView.setIconTintList(colorStateList);
        setItemIconSize(i3.f(R$styleable.BottomNavigationView_itemIconSize, getResources().getDimensionPixelSize(R$dimen.design_bottom_navigation_icon_size)));
        if (i3.r(R$styleable.BottomNavigationView_itemTextAppearanceInactive)) {
            setItemTextAppearanceInactive(i3.n(R$styleable.BottomNavigationView_itemTextAppearanceInactive, 0));
        }
        if (i3.r(R$styleable.BottomNavigationView_itemTextAppearanceActive)) {
            setItemTextAppearanceActive(i3.n(R$styleable.BottomNavigationView_itemTextAppearanceActive, 0));
        }
        if (i3.r(R$styleable.BottomNavigationView_itemTextColor)) {
            setItemTextColor(i3.c(R$styleable.BottomNavigationView_itemTextColor));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            o4.l0(this, e(context2));
        }
        if (i3.r(R$styleable.BottomNavigationView_elevation)) {
            o4.p0(this, (float) i3.f(R$styleable.BottomNavigationView_elevation, 0));
        }
        androidx.core.graphics.drawable.a.o(getBackground().mutate(), ca1.b(context2, i3, R$styleable.BottomNavigationView_backgroundTint));
        setLabelVisibilityMode(i3.l(R$styleable.BottomNavigationView_labelVisibilityMode, -1));
        setItemHorizontalTranslationEnabled(i3.a(R$styleable.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        int n = i3.n(R$styleable.BottomNavigationView_itemBackground, 0);
        if (n != 0) {
            this.f.setItemBackgroundRes(n);
        } else {
            setItemRippleColor(ca1.b(context2, i3, R$styleable.BottomNavigationView_itemRippleColor));
        }
        if (i3.r(R$styleable.BottomNavigationView_menu)) {
            f(i3.n(R$styleable.BottomNavigationView_menu, 0));
        }
        i3.v();
        addView(this.f, layoutParams);
        if (Build.VERSION.SDK_INT < 21) {
            c(context2);
        }
        this.e.V(new a());
        d();
    }

    private void c(Context context) {
        View view = new View(context);
        view.setBackgroundColor(androidx.core.content.a.d(context, R$color.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R$dimen.design_bottom_navigation_shadow_height)));
        addView(view);
    }

    private void d() {
        r.b(this, new b(this));
    }

    private ra1 e(Context context) {
        ra1 ra1 = new ra1();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            ra1.Y(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        ra1.N(context);
        return ra1;
    }

    private MenuInflater getMenuInflater() {
        if (this.i == null) {
            this.i = new s(getContext());
        }
        return this.i;
    }

    public void f(int i2) {
        this.g.d(true);
        getMenuInflater().inflate(i2, this.e);
        this.g.d(false);
        this.g.g(true);
    }

    public Drawable getItemBackground() {
        return this.f.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f.getIconTintList();
    }

    public ColorStateList getItemRippleColor() {
        return this.h;
    }

    public int getItemTextAppearanceActive() {
        return this.f.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f.getLabelVisibilityMode();
    }

    public int getMaxItemCount() {
        return 5;
    }

    public Menu getMenu() {
        return this.e;
    }

    public int getSelectedItemId() {
        return this.f.getSelectedItemId();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        sa1.e(this);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.a());
        this.e.S(eVar.g);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        eVar.g = bundle;
        this.e.U(bundle);
        return eVar;
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        sa1.d(this, f2);
    }

    public void setItemBackground(Drawable drawable) {
        this.f.setItemBackground(drawable);
        this.h = null;
    }

    public void setItemBackgroundResource(int i2) {
        this.f.setItemBackgroundRes(i2);
        this.h = null;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        if (this.f.f() != z) {
            this.f.setItemHorizontalTranslationEnabled(z);
            this.g.g(false);
        }
    }

    public void setItemIconSize(int i2) {
        this.f.setItemIconSize(i2);
    }

    public void setItemIconSizeRes(int i2) {
        setItemIconSize(getResources().getDimensionPixelSize(i2));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f.setIconTintList(colorStateList);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        if (this.h != colorStateList) {
            this.h = colorStateList;
            if (colorStateList == null) {
                this.f.setItemBackground((Drawable) null);
                return;
            }
            ColorStateList a2 = ha1.a(colorStateList);
            if (Build.VERSION.SDK_INT >= 21) {
                this.f.setItemBackground(new RippleDrawable(a2, (Drawable) null, (Drawable) null));
                return;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(1.0E-5f);
            Drawable r = androidx.core.graphics.drawable.a.r(gradientDrawable);
            androidx.core.graphics.drawable.a.o(r, a2);
            this.f.setItemBackground(r);
        } else if (colorStateList == null && this.f.getItemBackground() != null) {
            this.f.setItemBackground((Drawable) null);
        }
    }

    public void setItemTextAppearanceActive(int i2) {
        this.f.setItemTextAppearanceActive(i2);
    }

    public void setItemTextAppearanceInactive(int i2) {
        this.f.setItemTextAppearanceInactive(i2);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i2) {
        if (this.f.getLabelVisibilityMode() != i2) {
            this.f.setLabelVisibilityMode(i2);
            this.g.g(false);
        }
    }

    public void setOnNavigationItemReselectedListener(c cVar) {
        this.k = cVar;
    }

    public void setOnNavigationItemSelectedListener(d dVar) {
        this.j = dVar;
    }

    public void setSelectedItemId(int i2) {
        MenuItem findItem = this.e.findItem(i2);
        if (findItem != null && !this.e.O(findItem, this.g, 0)) {
            findItem.setChecked(true);
        }
    }
}
