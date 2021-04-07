package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$attr;
import com.google.android.material.R$layout;
import com.google.android.material.snackbar.BaseTransientBottomBar;

public class Snackbar extends BaseTransientBottomBar<Snackbar> {
    private static final int[] y = {R$attr.snackbarButtonStyle, R$attr.snackbarTextViewStyle};
    private final AccessibilityManager w;
    private boolean x;

    public static final class SnackbarLayout extends BaseTransientBottomBar.v {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    class a implements View.OnClickListener {
        final /* synthetic */ View.OnClickListener e;

        a(View.OnClickListener onClickListener) {
            this.e = onClickListener;
        }

        public void onClick(View view) {
            this.e.onClick(view);
            Snackbar.this.u(1);
        }
    }

    public static class b extends BaseTransientBottomBar.r<Snackbar> {
        /* renamed from: c */
        public void b(Snackbar snackbar) {
        }
    }

    private Snackbar(ViewGroup viewGroup, View view, a aVar) {
        super(viewGroup, view, aVar);
        this.w = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    private static ViewGroup Z(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    private static boolean a0(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(y);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    public static Snackbar b0(View view, CharSequence charSequence, int i) {
        ViewGroup Z = Z(view);
        if (Z != null) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(Z.getContext()).inflate(a0(Z.getContext()) ? R$layout.mtrl_layout_snackbar_include : R$layout.design_layout_snackbar_include, Z, false);
            Snackbar snackbar = new Snackbar(Z, snackbarContentLayout, snackbarContentLayout);
            snackbar.f0(charSequence);
            snackbar.N(i);
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    public boolean H() {
        return super.H();
    }

    public void R() {
        super.R();
    }

    public Snackbar c0(int i, View.OnClickListener onClickListener) {
        d0(w().getText(i), onClickListener);
        return this;
    }

    public Snackbar d0(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button actionView = ((SnackbarContentLayout) this.c.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            actionView.setVisibility(8);
            actionView.setOnClickListener((View.OnClickListener) null);
            this.x = false;
        } else {
            this.x = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new a(onClickListener));
        }
        return this;
    }

    public Snackbar e0(int i) {
        ((SnackbarContentLayout) this.c.getChildAt(0)).getActionView().setTextColor(i);
        return this;
    }

    public Snackbar f0(CharSequence charSequence) {
        ((SnackbarContentLayout) this.c.getChildAt(0)).getMessageView().setText(charSequence);
        return this;
    }

    public Snackbar g0(int i) {
        ((SnackbarContentLayout) this.c.getChildAt(0)).getMessageView().setTextColor(i);
        return this;
    }

    public void t() {
        super.t();
    }

    public int x() {
        int x2 = super.x();
        if (x2 == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.w.getRecommendedTimeoutMillis(x2, (this.x ? 4 : 0) | 1 | 2);
        } else if (!this.x || !this.w.isTouchExplorationEnabled()) {
            return x2;
        } else {
            return -2;
        }
    }
}
