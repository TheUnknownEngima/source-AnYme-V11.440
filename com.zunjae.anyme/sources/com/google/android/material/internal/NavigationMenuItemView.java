package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.R$attr;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.i0;
import com.google.android.material.R$dimen;
import com.google.android.material.R$drawable;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;

public class NavigationMenuItemView extends ForegroundLinearLayout implements n.a {
    private static final int[] J = {16842912};
    private boolean A;
    boolean B;
    private final CheckedTextView C;
    private FrameLayout D;
    private i E;
    private ColorStateList F;
    private boolean G;
    private Drawable H;
    private final w3 I;
    private int z;

    class a extends w3 {
        a() {
        }

        public void g(View view, a5 a5Var) {
            super.g(view, a5Var);
            a5Var.b0(NavigationMenuItemView.this.B);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.I = new a();
        setOrientation(0);
        LayoutInflater.from(context).inflate(R$layout.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R$dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R$id.design_menu_item_text);
        this.C = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        o4.i0(this.C, this.I);
    }

    private void B() {
        int i;
        LinearLayoutCompat.LayoutParams layoutParams;
        if (E()) {
            this.C.setVisibility(8);
            FrameLayout frameLayout = this.D;
            if (frameLayout != null) {
                layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                i = -1;
            } else {
                return;
            }
        } else {
            this.C.setVisibility(0);
            FrameLayout frameLayout2 = this.D;
            if (frameLayout2 != null) {
                layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
                i = -2;
            } else {
                return;
            }
        }
        layoutParams.width = i;
        this.D.setLayoutParams(layoutParams);
    }

    private StateListDrawable C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R$attr.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(J, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean E() {
        return this.E.getTitle() == null && this.E.getIcon() == null && this.E.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.D == null) {
                this.D = (FrameLayout) ((ViewStub) findViewById(R$id.design_menu_item_action_area_stub)).inflate();
            }
            this.D.removeAllViews();
            this.D.addView(view);
        }
    }

    public void D() {
        FrameLayout frameLayout = this.D;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.C.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public boolean d() {
        return false;
    }

    public void e(i iVar, int i) {
        this.E = iVar;
        if (iVar.getItemId() > 0) {
            setId(iVar.getItemId());
        }
        setVisibility(iVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            o4.l0(this, C());
        }
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setTitle(iVar.getTitle());
        setIcon(iVar.getIcon());
        setActionView(iVar.getActionView());
        setContentDescription(iVar.getContentDescription());
        i0.a(this, iVar.getTooltipText());
        B();
    }

    public i getItemData() {
        return this.E;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        i iVar = this.E;
        if (iVar != null && iVar.isCheckable() && this.E.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, J);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.B != z2) {
            this.B = z2;
            this.I.l(this.C, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        this.C.setChecked(z2);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.G) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
                androidx.core.graphics.drawable.a.o(drawable, this.F);
            }
            int i = this.z;
            drawable.setBounds(0, 0, i, i);
        } else if (this.A) {
            if (this.H == null) {
                Drawable b = h2.b(getResources(), R$drawable.navigation_empty_icon, getContext().getTheme());
                this.H = b;
                if (b != null) {
                    int i2 = this.z;
                    b.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.H;
        }
        androidx.core.widget.i.l(this.C, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i) {
        this.C.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.z = i;
    }

    /* access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList colorStateList) {
        this.F = colorStateList;
        this.G = colorStateList != null;
        i iVar = this.E;
        if (iVar != null) {
            setIcon(iVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.C.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.A = z2;
    }

    public void setTextAppearance(int i) {
        androidx.core.widget.i.r(this.C, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.C.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.C.setText(charSequence);
    }
}
