package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.i0;
import com.google.android.material.R$dimen;
import com.google.android.material.R$drawable;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import defpackage.a5;

public class BottomNavigationItemView extends FrameLayout implements n.a {
    private static final int[] t = {16842912};
    private final int e;
    private float f;
    private float g;
    private float h;
    private int i;
    private boolean j;
    /* access modifiers changed from: private */
    public ImageView k;
    private final TextView l;
    private final TextView m;
    private int n;
    private i o;
    private ColorStateList p;
    private Drawable q;
    private Drawable r;
    private q91 s;

    class a implements View.OnLayoutChangeListener {
        a() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (BottomNavigationItemView.this.k.getVisibility() == 0) {
                BottomNavigationItemView bottomNavigationItemView = BottomNavigationItemView.this;
                bottomNavigationItemView.m(bottomNavigationItemView.k);
            }
        }
    }

    public BottomNavigationItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    public BottomNavigationItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BottomNavigationItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.n = -1;
        Resources resources = getResources();
        LayoutInflater.from(context).inflate(R$layout.design_bottom_navigation_item, this, true);
        setBackgroundResource(R$drawable.design_bottom_navigation_item_background);
        this.e = resources.getDimensionPixelSize(R$dimen.design_bottom_navigation_margin);
        this.k = (ImageView) findViewById(R$id.icon);
        this.l = (TextView) findViewById(R$id.smallLabel);
        this.m = (TextView) findViewById(R$id.largeLabel);
        o4.s0(this.l, 2);
        o4.s0(this.m, 2);
        setFocusable(true);
        c(this.l.getTextSize(), this.m.getTextSize());
        ImageView imageView = this.k;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new a());
        }
    }

    private void c(float f2, float f3) {
        this.f = f2 - f3;
        this.g = (f3 * 1.0f) / f2;
        this.h = (f2 * 1.0f) / f3;
    }

    private FrameLayout f(View view) {
        ImageView imageView = this.k;
        if (view != imageView || !r91.a) {
            return null;
        }
        return (FrameLayout) imageView.getParent();
    }

    private boolean g() {
        return this.s != null;
    }

    private void i(View view, int i2, int i3) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i2;
        layoutParams.gravity = i3;
        view.setLayoutParams(layoutParams);
    }

    private void j(View view, float f2, float f3, int i2) {
        view.setScaleX(f2);
        view.setScaleY(f3);
        view.setVisibility(i2);
    }

    private void k(View view) {
        if (g() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            r91.a(this.s, view, f(view));
        }
    }

    private void l(View view) {
        if (g()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                r91.d(this.s, view, f(view));
            }
            this.s = null;
        }
    }

    /* access modifiers changed from: private */
    public void m(View view) {
        if (g()) {
            r91.e(this.s, view, f(view));
        }
    }

    public boolean d() {
        return false;
    }

    public void e(i iVar, int i2) {
        this.o = iVar;
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setIcon(iVar.getIcon());
        setTitle(iVar.getTitle());
        setId(iVar.getItemId());
        if (!TextUtils.isEmpty(iVar.getContentDescription())) {
            setContentDescription(iVar.getContentDescription());
        }
        i0.a(this, !TextUtils.isEmpty(iVar.getTooltipText()) ? iVar.getTooltipText() : iVar.getTitle());
        setVisibility(iVar.isVisible() ? 0 : 8);
    }

    /* access modifiers changed from: package-private */
    public q91 getBadge() {
        return this.s;
    }

    public i getItemData() {
        return this.o;
    }

    public int getItemPosition() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public void h() {
        l(this.k);
    }

    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        i iVar = this.o;
        if (iVar != null && iVar.isCheckable() && this.o.isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, t);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        q91 q91 = this.s;
        if (q91 != null && q91.isVisible()) {
            CharSequence title = this.o.getTitle();
            if (!TextUtils.isEmpty(this.o.getContentDescription())) {
                title = this.o.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(title + ", " + this.s.h());
        }
        a5 I0 = a5.I0(accessibilityNodeInfo);
        I0.g0(a5.c.f(0, 1, getItemPosition(), 1, false, isSelected()));
        if (isSelected()) {
            I0.e0(false);
            I0.U(a5.a.g);
        }
        I0.x0(getResources().getString(R$string.item_view_role_description));
    }

    /* access modifiers changed from: package-private */
    public void setBadge(q91 q91) {
        this.s = q91;
        ImageView imageView = this.k;
        if (imageView != null) {
            k(imageView);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x008a, code lost:
        if (r10 != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x008c, code lost:
        i(r0, r1, 49);
        j(r9.m, 1.0f, 1.0f, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0095, code lost:
        i(r0, r1, 17);
        j(r9.m, 0.5f, 0.5f, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009d, code lost:
        r9.l.setVisibility(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00ab, code lost:
        if (r10 != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ae, code lost:
        if (r10 != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0057, code lost:
        if (r10 != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0072, code lost:
        i(r9.k, r9.e, 49);
        r0 = r9.m;
        r1 = r9.h;
        j(r0, r1, r1, 4);
        j(r9.l, 1.0f, 1.0f, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setChecked(boolean r10) {
        /*
            r9 = this;
            android.widget.TextView r0 = r9.m
            int r1 = r0.getWidth()
            r2 = 2
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.setPivotX(r1)
            android.widget.TextView r0 = r9.m
            int r1 = r0.getBaseline()
            float r1 = (float) r1
            r0.setPivotY(r1)
            android.widget.TextView r0 = r9.l
            int r1 = r0.getWidth()
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.setPivotX(r1)
            android.widget.TextView r0 = r9.l
            int r1 = r0.getBaseline()
            float r1 = (float) r1
            r0.setPivotY(r1)
            int r0 = r9.i
            r1 = -1
            r3 = 17
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 0
            r6 = 49
            r7 = 4
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r0 == r1) goto L_0x00a3
            if (r0 == 0) goto L_0x0086
            r1 = 1
            if (r0 == r1) goto L_0x0057
            if (r0 == r2) goto L_0x0043
            goto L_0x00b1
        L_0x0043:
            android.widget.ImageView r0 = r9.k
            int r1 = r9.e
            r9.i(r0, r1, r3)
            android.widget.TextView r0 = r9.m
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r9.l
            r0.setVisibility(r1)
            goto L_0x00b1
        L_0x0057:
            if (r10 == 0) goto L_0x0072
        L_0x0059:
            android.widget.ImageView r0 = r9.k
            int r1 = r9.e
            float r1 = (float) r1
            float r2 = r9.f
            float r1 = r1 + r2
            int r1 = (int) r1
            r9.i(r0, r1, r6)
            android.widget.TextView r0 = r9.m
            r9.j(r0, r8, r8, r5)
            android.widget.TextView r0 = r9.l
            float r1 = r9.g
            r9.j(r0, r1, r1, r7)
            goto L_0x00b1
        L_0x0072:
            android.widget.ImageView r0 = r9.k
            int r1 = r9.e
            r9.i(r0, r1, r6)
            android.widget.TextView r0 = r9.m
            float r1 = r9.h
            r9.j(r0, r1, r1, r7)
            android.widget.TextView r0 = r9.l
            r9.j(r0, r8, r8, r5)
            goto L_0x00b1
        L_0x0086:
            android.widget.ImageView r0 = r9.k
            int r1 = r9.e
            if (r10 == 0) goto L_0x0095
        L_0x008c:
            r9.i(r0, r1, r6)
            android.widget.TextView r0 = r9.m
            r9.j(r0, r8, r8, r5)
            goto L_0x009d
        L_0x0095:
            r9.i(r0, r1, r3)
            android.widget.TextView r0 = r9.m
            r9.j(r0, r4, r4, r7)
        L_0x009d:
            android.widget.TextView r0 = r9.l
            r0.setVisibility(r7)
            goto L_0x00b1
        L_0x00a3:
            boolean r0 = r9.j
            if (r0 == 0) goto L_0x00ae
            android.widget.ImageView r0 = r9.k
            int r1 = r9.e
            if (r10 == 0) goto L_0x0095
            goto L_0x008c
        L_0x00ae:
            if (r10 == 0) goto L_0x0072
            goto L_0x0059
        L_0x00b1:
            r9.refreshDrawableState()
            r9.setSelected(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomnavigation.BottomNavigationItemView.setChecked(boolean):void");
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.l.setEnabled(z);
        this.m.setEnabled(z);
        this.k.setEnabled(z);
        o4.x0(this, z ? m4.b(getContext(), 1002) : null);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != this.q) {
            this.q = drawable;
            if (drawable != null) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
                this.r = drawable;
                ColorStateList colorStateList = this.p;
                if (colorStateList != null) {
                    androidx.core.graphics.drawable.a.o(drawable, colorStateList);
                }
            }
            this.k.setImageDrawable(drawable);
        }
    }

    public void setIconSize(int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.k.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i2;
        this.k.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.p = colorStateList;
        if (this.o != null && (drawable = this.r) != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            this.r.invalidateSelf();
        }
    }

    public void setItemBackground(int i2) {
        setItemBackground(i2 == 0 ? null : androidx.core.content.a.f(getContext(), i2));
    }

    public void setItemBackground(Drawable drawable) {
        if (!(drawable == null || drawable.getConstantState() == null)) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        o4.l0(this, drawable);
    }

    public void setItemPosition(int i2) {
        this.n = i2;
    }

    public void setLabelVisibilityMode(int i2) {
        if (this.i != i2) {
            this.i = i2;
            if (this.o != null) {
                setChecked(this.o.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (this.o != null) {
                setChecked(this.o.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i2) {
        androidx.core.widget.i.r(this.m, i2);
        c(this.l.getTextSize(), this.m.getTextSize());
    }

    public void setTextAppearanceInactive(int i2) {
        androidx.core.widget.i.r(this.l, i2);
        c(this.l.getTextSize(), this.m.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.l.setTextColor(colorStateList);
            this.m.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.l.setText(charSequence);
        this.m.setText(charSequence);
        i iVar = this.o;
        if (iVar == null || TextUtils.isEmpty(iVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
        i iVar2 = this.o;
        if (iVar2 != null && !TextUtils.isEmpty(iVar2.getTooltipText())) {
            charSequence = this.o.getTooltipText();
        }
        i0.a(this, charSequence);
    }
}
