package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.R$attr;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.n;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionSet;
import androidx.transition.u;
import com.google.android.material.R$dimen;
import com.google.android.material.internal.k;
import defpackage.a5;
import java.util.HashSet;

public class BottomNavigationMenuView extends ViewGroup implements n {
    private static final int[] D = {16842912};
    private static final int[] E = {-16842910};
    private SparseArray<q91> A;
    /* access modifiers changed from: private */
    public b B;
    /* access modifiers changed from: private */
    public g C;
    private final TransitionSet e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final View.OnClickListener k;
    private final r3<BottomNavigationItemView> l;
    private boolean m;
    private int n;
    private BottomNavigationItemView[] o;
    private int p;
    private int q;
    private ColorStateList r;
    private int s;
    private ColorStateList t;
    private final ColorStateList u;
    private int v;
    private int w;
    private Drawable x;
    private int y;
    private int[] z;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            i itemData = ((BottomNavigationItemView) view).getItemData();
            if (!BottomNavigationMenuView.this.C.O(itemData, BottomNavigationMenuView.this.B, 0)) {
                itemData.setChecked(true);
            }
        }
    }

    public BottomNavigationMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    public BottomNavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = new t3(5);
        this.p = 0;
        this.q = 0;
        this.A = new SparseArray<>(5);
        Resources resources = getResources();
        this.f = resources.getDimensionPixelSize(R$dimen.design_bottom_navigation_item_max_width);
        this.g = resources.getDimensionPixelSize(R$dimen.design_bottom_navigation_item_min_width);
        this.h = resources.getDimensionPixelSize(R$dimen.design_bottom_navigation_active_item_max_width);
        this.i = resources.getDimensionPixelSize(R$dimen.design_bottom_navigation_active_item_min_width);
        this.j = resources.getDimensionPixelSize(R$dimen.design_bottom_navigation_height);
        this.u = e(16842808);
        AutoTransition autoTransition = new AutoTransition();
        this.e = autoTransition;
        autoTransition.I0(0);
        this.e.G0(115);
        this.e.q0(new u5());
        this.e.z0(new k());
        this.k = new a();
        this.z = new int[5];
        o4.s0(this, 1);
    }

    private boolean g(int i2, int i3) {
        if (i2 == -1) {
            if (i3 > 3) {
                return true;
            }
        } else if (i2 == 0) {
            return true;
        }
        return false;
    }

    private BottomNavigationItemView getNewItem() {
        BottomNavigationItemView b = this.l.b();
        return b == null ? new BottomNavigationItemView(getContext()) : b;
    }

    private boolean h(int i2) {
        return i2 != -1;
    }

    private void i() {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < this.C.size(); i2++) {
            hashSet.add(Integer.valueOf(this.C.getItem(i2).getItemId()));
        }
        for (int i3 = 0; i3 < this.A.size(); i3++) {
            int keyAt = this.A.keyAt(i3);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.A.delete(keyAt);
            }
        }
    }

    private void setBadgeIfNeeded(BottomNavigationItemView bottomNavigationItemView) {
        q91 q91;
        int id = bottomNavigationItemView.getId();
        if (h(id) && (q91 = this.A.get(id)) != null) {
            bottomNavigationItemView.setBadge(q91);
        }
    }

    public void b(g gVar) {
        this.C = gVar;
    }

    public void d() {
        removeAllViews();
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.o;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                if (bottomNavigationItemView != null) {
                    this.l.c(bottomNavigationItemView);
                    bottomNavigationItemView.h();
                }
            }
        }
        if (this.C.size() == 0) {
            this.p = 0;
            this.q = 0;
            this.o = null;
            return;
        }
        i();
        this.o = new BottomNavigationItemView[this.C.size()];
        boolean g2 = g(this.n, this.C.G().size());
        for (int i2 = 0; i2 < this.C.size(); i2++) {
            this.B.d(true);
            this.C.getItem(i2).setCheckable(true);
            this.B.d(false);
            BottomNavigationItemView newItem = getNewItem();
            this.o[i2] = newItem;
            newItem.setIconTintList(this.r);
            newItem.setIconSize(this.s);
            newItem.setTextColor(this.u);
            newItem.setTextAppearanceInactive(this.v);
            newItem.setTextAppearanceActive(this.w);
            newItem.setTextColor(this.t);
            Drawable drawable = this.x;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.y);
            }
            newItem.setShifting(g2);
            newItem.setLabelVisibilityMode(this.n);
            newItem.e((i) this.C.getItem(i2), 0);
            newItem.setItemPosition(i2);
            newItem.setOnClickListener(this.k);
            if (this.p != 0 && this.C.getItem(i2).getItemId() == this.p) {
                this.q = i2;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.C.size() - 1, this.q);
        this.q = min;
        this.C.getItem(min).setChecked(true);
    }

    public ColorStateList e(int i2) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i2, typedValue, true)) {
            return null;
        }
        ColorStateList c = f.c(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(R$attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i3 = typedValue.data;
        int defaultColor = c.getDefaultColor();
        return new ColorStateList(new int[][]{E, D, ViewGroup.EMPTY_STATE_SET}, new int[]{c.getColorForState(E, defaultColor), i3, defaultColor});
    }

    public boolean f() {
        return this.m;
    }

    /* access modifiers changed from: package-private */
    public SparseArray<q91> getBadgeDrawables() {
        return this.A;
    }

    public ColorStateList getIconTintList() {
        return this.r;
    }

    public Drawable getItemBackground() {
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.o;
        return (bottomNavigationItemViewArr == null || bottomNavigationItemViewArr.length <= 0) ? this.x : bottomNavigationItemViewArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.y;
    }

    public int getItemIconSize() {
        return this.s;
    }

    public int getItemTextAppearanceActive() {
        return this.w;
    }

    public int getItemTextAppearanceInactive() {
        return this.v;
    }

    public ColorStateList getItemTextColor() {
        return this.t;
    }

    public int getLabelVisibilityMode() {
        return this.n;
    }

    public int getSelectedItemId() {
        return this.p;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void j(int i2) {
        int size = this.C.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = this.C.getItem(i3);
            if (i2 == item.getItemId()) {
                this.p = i2;
                this.q = i3;
                item.setChecked(true);
                return;
            }
        }
    }

    public void k() {
        g gVar = this.C;
        if (gVar != null && this.o != null) {
            int size = gVar.size();
            if (size != this.o.length) {
                d();
                return;
            }
            int i2 = this.p;
            for (int i3 = 0; i3 < size; i3++) {
                MenuItem item = this.C.getItem(i3);
                if (item.isChecked()) {
                    this.p = item.getItemId();
                    this.q = i3;
                }
            }
            if (i2 != this.p) {
                u.a(this, this.e);
            }
            boolean g2 = g(this.n, this.C.G().size());
            for (int i4 = 0; i4 < size; i4++) {
                this.B.d(true);
                this.o[i4].setLabelVisibilityMode(this.n);
                this.o[i4].setShifting(g2);
                this.o[i4].e((i) this.C.getItem(i4), 0);
                this.B.d(false);
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        a5.I0(accessibilityNodeInfo).f0(a5.b.b(1, this.C.G().size(), false, 1));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                if (o4.y(this) == 1) {
                    int i10 = i6 - i8;
                    childAt.layout(i10 - childAt.getMeasuredWidth(), 0, i10, i7);
                } else {
                    childAt.layout(i8, 0, childAt.getMeasuredWidth() + i8, i7);
                }
                i8 += childAt.getMeasuredWidth();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = this.C.G().size();
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.j, 1073741824);
        if (!g(this.n, size2) || !this.m) {
            int min = Math.min(size / (size2 == 0 ? 1 : size2), this.h);
            int i4 = size - (size2 * min);
            for (int i5 = 0; i5 < childCount; i5++) {
                if (getChildAt(i5).getVisibility() != 8) {
                    int[] iArr = this.z;
                    iArr[i5] = min;
                    if (i4 > 0) {
                        iArr[i5] = iArr[i5] + 1;
                        i4--;
                    }
                } else {
                    this.z[i5] = 0;
                }
            }
        } else {
            View childAt = getChildAt(this.q);
            int i6 = this.i;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.h, Integer.MIN_VALUE), makeMeasureSpec);
                i6 = Math.max(i6, childAt.getMeasuredWidth());
            }
            int i7 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min2 = Math.min(size - (this.g * i7), Math.min(i6, this.h));
            int i8 = size - min2;
            int min3 = Math.min(i8 / (i7 == 0 ? 1 : i7), this.f);
            int i9 = i8 - (i7 * min3);
            int i10 = 0;
            while (i10 < childCount) {
                if (getChildAt(i10).getVisibility() != 8) {
                    this.z[i10] = i10 == this.q ? min2 : min3;
                    if (i9 > 0) {
                        int[] iArr2 = this.z;
                        iArr2[i10] = iArr2[i10] + 1;
                        i9--;
                    }
                } else {
                    this.z[i10] = 0;
                }
                i10++;
            }
        }
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.z[i12], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i11 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i11, View.MeasureSpec.makeMeasureSpec(i11, 1073741824), 0), View.resolveSizeAndState(this.j, makeMeasureSpec, 0));
    }

    /* access modifiers changed from: package-private */
    public void setBadgeDrawables(SparseArray<q91> sparseArray) {
        this.A = sparseArray;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.o;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setBadge(sparseArray.get(bottomNavigationItemView.getId()));
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.r = colorStateList;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.o;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView iconTintList : bottomNavigationItemViewArr) {
                iconTintList.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.x = drawable;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.o;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView itemBackground : bottomNavigationItemViewArr) {
                itemBackground.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i2) {
        this.y = i2;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.o;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView itemBackground : bottomNavigationItemViewArr) {
                itemBackground.setItemBackground(i2);
            }
        }
    }

    public void setItemHorizontalTranslationEnabled(boolean z2) {
        this.m = z2;
    }

    public void setItemIconSize(int i2) {
        this.s = i2;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.o;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView iconSize : bottomNavigationItemViewArr) {
                iconSize.setIconSize(i2);
            }
        }
    }

    public void setItemTextAppearanceActive(int i2) {
        this.w = i2;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.o;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setTextAppearanceActive(i2);
                ColorStateList colorStateList = this.t;
                if (colorStateList != null) {
                    bottomNavigationItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i2) {
        this.v = i2;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.o;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setTextAppearanceInactive(i2);
                ColorStateList colorStateList = this.t;
                if (colorStateList != null) {
                    bottomNavigationItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.t = colorStateList;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.o;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView textColor : bottomNavigationItemViewArr) {
                textColor.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i2) {
        this.n = i2;
    }

    public void setPresenter(b bVar) {
        this.B = bVar;
    }
}
