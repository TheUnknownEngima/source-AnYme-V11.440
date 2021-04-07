package com.afollestad.materialdialogs;

import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.method.LinkMovementMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.f;
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.internal.MDRootLayout;
import com.afollestad.materialdialogs.internal.b;
import com.afollestad.materialdialogs.internal.c;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Arrays;

class d {
    private static void a(ProgressBar progressBar) {
        if (Build.VERSION.SDK_INT < 18 && progressBar.isHardwareAccelerated() && progressBar.getLayerType() != 1) {
            progressBar.setLayerType(1, (Paint) null);
        }
    }

    static int b(f.e eVar) {
        if (eVar.s != null) {
            return R$layout.md_dialog_custom;
        }
        if (eVar.l != null || eVar.X != null) {
            return eVar.w0 != null ? R$layout.md_dialog_list_check : R$layout.md_dialog_list;
        }
        if (eVar.k0 > -2) {
            return R$layout.md_dialog_progress;
        }
        if (eVar.i0) {
            return eVar.B0 ? R$layout.md_dialog_progress_indeterminate_horizontal : R$layout.md_dialog_progress_indeterminate;
        }
        f.h hVar = eVar.o0;
        CharSequence charSequence = eVar.w0;
        return hVar != null ? charSequence != null ? R$layout.md_dialog_input_check : R$layout.md_dialog_input : charSequence != null ? R$layout.md_dialog_basic_check : R$layout.md_dialog_basic;
    }

    static int c(f.e eVar) {
        boolean k = x8.k(eVar.a, R$attr.md_dark_theme, eVar.K == h.DARK);
        eVar.K = k ? h.DARK : h.LIGHT;
        return k ? R$style.MD_Dark : R$style.MD_Light;
    }

    static void d(f fVar) {
        boolean z;
        f.m mVar;
        f.e eVar = fVar.g;
        fVar.setCancelable(eVar.L);
        fVar.setCanceledOnTouchOutside(eVar.M);
        if (eVar.g0 == 0) {
            eVar.g0 = x8.m(eVar.a, R$attr.md_background_color, x8.l(fVar.getContext(), R$attr.colorBackgroundFloating));
        }
        if (eVar.g0 != 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(eVar.a.getResources().getDimension(R$dimen.md_bg_corner_radius));
            gradientDrawable.setColor(eVar.g0);
            fVar.getWindow().setBackgroundDrawable(gradientDrawable);
        }
        if (!eVar.F0) {
            eVar.v = x8.i(eVar.a, R$attr.md_positive_color, eVar.v);
        }
        if (!eVar.G0) {
            eVar.x = x8.i(eVar.a, R$attr.md_neutral_color, eVar.x);
        }
        if (!eVar.H0) {
            eVar.w = x8.i(eVar.a, R$attr.md_negative_color, eVar.w);
        }
        if (!eVar.I0) {
            eVar.t = x8.m(eVar.a, R$attr.md_widget_color, eVar.t);
        }
        if (!eVar.C0) {
            eVar.i = x8.m(eVar.a, R$attr.md_title_color, x8.l(fVar.getContext(), 16842806));
        }
        if (!eVar.D0) {
            eVar.j = x8.m(eVar.a, R$attr.md_content_color, x8.l(fVar.getContext(), 16842808));
        }
        if (!eVar.E0) {
            eVar.h0 = x8.m(eVar.a, R$attr.md_item_color, eVar.j);
        }
        fVar.j = (TextView) fVar.e.findViewById(R$id.md_title);
        fVar.i = (ImageView) fVar.e.findViewById(R$id.md_icon);
        fVar.n = fVar.e.findViewById(R$id.md_titleFrame);
        fVar.k = (TextView) fVar.e.findViewById(R$id.md_content);
        fVar.m = (RecyclerView) fVar.e.findViewById(R$id.md_contentRecyclerView);
        fVar.t = (CheckBox) fVar.e.findViewById(R$id.md_promptCheckbox);
        fVar.u = (MDButton) fVar.e.findViewById(R$id.md_buttonDefaultPositive);
        fVar.v = (MDButton) fVar.e.findViewById(R$id.md_buttonDefaultNeutral);
        fVar.w = (MDButton) fVar.e.findViewById(R$id.md_buttonDefaultNegative);
        if (eVar.o0 != null && eVar.m == null) {
            eVar.m = eVar.a.getText(17039370);
        }
        fVar.u.setVisibility(eVar.m != null ? 0 : 8);
        fVar.v.setVisibility(eVar.n != null ? 0 : 8);
        fVar.w.setVisibility(eVar.o != null ? 0 : 8);
        fVar.u.setFocusable(true);
        fVar.v.setFocusable(true);
        fVar.w.setFocusable(true);
        if (eVar.p) {
            fVar.u.requestFocus();
        }
        if (eVar.q) {
            fVar.v.requestFocus();
        }
        if (eVar.r) {
            fVar.w.requestFocus();
        }
        if (eVar.U != null) {
            fVar.i.setVisibility(0);
            fVar.i.setImageDrawable(eVar.U);
        } else {
            Drawable p = x8.p(eVar.a, R$attr.md_icon);
            if (p != null) {
                fVar.i.setVisibility(0);
                fVar.i.setImageDrawable(p);
            } else {
                fVar.i.setVisibility(8);
            }
        }
        int i = eVar.W;
        if (i == -1) {
            i = x8.n(eVar.a, R$attr.md_icon_max_size);
        }
        if (eVar.V || x8.j(eVar.a, R$attr.md_icon_limit_icon_to_default_size)) {
            i = eVar.a.getResources().getDimensionPixelSize(R$dimen.md_icon_max_size);
        }
        if (i > -1) {
            fVar.i.setAdjustViewBounds(true);
            fVar.i.setMaxHeight(i);
            fVar.i.setMaxWidth(i);
            fVar.i.requestLayout();
        }
        if (!eVar.J0) {
            eVar.f0 = x8.m(eVar.a, R$attr.md_divider_color, x8.l(fVar.getContext(), R$attr.md_divider));
        }
        fVar.e.setDividerColor(eVar.f0);
        TextView textView = fVar.j;
        if (textView != null) {
            fVar.t(textView, eVar.T);
            fVar.j.setTextColor(eVar.i);
            fVar.j.setGravity(eVar.c.getGravityInt());
            if (Build.VERSION.SDK_INT >= 17) {
                fVar.j.setTextAlignment(eVar.c.getTextAlignment());
            }
            CharSequence charSequence = eVar.b;
            if (charSequence == null) {
                fVar.n.setVisibility(8);
            } else {
                fVar.j.setText(charSequence);
                fVar.n.setVisibility(0);
            }
        }
        TextView textView2 = fVar.k;
        if (textView2 != null) {
            textView2.setMovementMethod(new LinkMovementMethod());
            fVar.t(fVar.k, eVar.S);
            fVar.k.setLineSpacing(Utils.FLOAT_EPSILON, eVar.N);
            ColorStateList colorStateList = eVar.y;
            if (colorStateList == null) {
                fVar.k.setLinkTextColor(x8.l(fVar.getContext(), 16842806));
            } else {
                fVar.k.setLinkTextColor(colorStateList);
            }
            fVar.k.setTextColor(eVar.j);
            fVar.k.setGravity(eVar.d.getGravityInt());
            if (Build.VERSION.SDK_INT >= 17) {
                fVar.k.setTextAlignment(eVar.d.getTextAlignment());
            }
            CharSequence charSequence2 = eVar.k;
            if (charSequence2 != null) {
                fVar.k.setText(charSequence2);
                fVar.k.setVisibility(0);
            } else {
                fVar.k.setVisibility(8);
            }
        }
        CheckBox checkBox = fVar.t;
        if (checkBox != null) {
            checkBox.setText(eVar.w0);
            fVar.t.setChecked(eVar.x0);
            fVar.t.setOnCheckedChangeListener(eVar.y0);
            fVar.t(fVar.t, eVar.S);
            fVar.t.setTextColor(eVar.j);
            c.c(fVar.t, eVar.t);
        }
        fVar.e.setButtonGravity(eVar.g);
        fVar.e.setButtonStackedGravity(eVar.e);
        fVar.e.setStackingBehavior(eVar.d0);
        if (Build.VERSION.SDK_INT < 14 || (z = x8.k(eVar.a, 16843660, true))) {
            z = x8.k(eVar.a, R$attr.textAllCaps, true);
        }
        MDButton mDButton = fVar.u;
        fVar.t(mDButton, eVar.T);
        mDButton.setAllCapsCompat(z);
        mDButton.setText(eVar.m);
        mDButton.setTextColor(eVar.v);
        fVar.u.setStackedSelector(fVar.g(b.POSITIVE, true));
        fVar.u.setDefaultSelector(fVar.g(b.POSITIVE, false));
        fVar.u.setTag(b.POSITIVE);
        fVar.u.setOnClickListener(fVar);
        MDButton mDButton2 = fVar.w;
        fVar.t(mDButton2, eVar.T);
        mDButton2.setAllCapsCompat(z);
        mDButton2.setText(eVar.o);
        mDButton2.setTextColor(eVar.w);
        fVar.w.setStackedSelector(fVar.g(b.NEGATIVE, true));
        fVar.w.setDefaultSelector(fVar.g(b.NEGATIVE, false));
        fVar.w.setTag(b.NEGATIVE);
        fVar.w.setOnClickListener(fVar);
        MDButton mDButton3 = fVar.v;
        fVar.t(mDButton3, eVar.T);
        mDButton3.setAllCapsCompat(z);
        mDButton3.setText(eVar.n);
        mDButton3.setTextColor(eVar.x);
        fVar.v.setStackedSelector(fVar.g(b.NEUTRAL, true));
        fVar.v.setDefaultSelector(fVar.g(b.NEUTRAL, false));
        fVar.v.setTag(b.NEUTRAL);
        fVar.v.setOnClickListener(fVar);
        if (eVar.H != null) {
            fVar.y = new ArrayList();
        }
        if (fVar.m != null) {
            RecyclerView.g<?> gVar = eVar.X;
            if (gVar == null) {
                if (eVar.G != null) {
                    mVar = f.m.SINGLE;
                } else if (eVar.H != null) {
                    fVar.x = f.m.MULTI;
                    if (eVar.P != null) {
                        fVar.y = new ArrayList(Arrays.asList(eVar.P));
                        eVar.P = null;
                    }
                    eVar.X = new a(fVar, f.m.getLayoutForType(fVar.x));
                } else {
                    mVar = f.m.REGULAR;
                }
                fVar.x = mVar;
                eVar.X = new a(fVar, f.m.getLayoutForType(fVar.x));
            } else if (gVar instanceof b) {
                ((b) gVar).a(fVar);
            }
        }
        f(fVar);
        e(fVar);
        if (eVar.s != null) {
            ((MDRootLayout) fVar.e.findViewById(R$id.md_root)).t();
            FrameLayout frameLayout = (FrameLayout) fVar.e.findViewById(R$id.md_customViewFrame);
            fVar.o = frameLayout;
            View view = eVar.s;
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (eVar.e0) {
                Resources resources = fVar.getContext().getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.md_dialog_frame_margin);
                ScrollView scrollView = new ScrollView(fVar.getContext());
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R$dimen.md_content_padding_top);
                int dimensionPixelSize3 = resources.getDimensionPixelSize(R$dimen.md_content_padding_bottom);
                scrollView.setClipToPadding(false);
                if (view instanceof EditText) {
                    scrollView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize3);
                } else {
                    scrollView.setPadding(0, dimensionPixelSize2, 0, dimensionPixelSize3);
                    view.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
                }
                scrollView.addView(view, new FrameLayout.LayoutParams(-1, -2));
                view = scrollView;
            }
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -2));
        }
        DialogInterface.OnShowListener onShowListener = eVar.c0;
        if (onShowListener != null) {
            fVar.setOnShowListener(onShowListener);
        }
        DialogInterface.OnCancelListener onCancelListener = eVar.a0;
        if (onCancelListener != null) {
            fVar.setOnCancelListener(onCancelListener);
        }
        DialogInterface.OnDismissListener onDismissListener = eVar.Z;
        if (onDismissListener != null) {
            fVar.setOnDismissListener(onDismissListener);
        }
        DialogInterface.OnKeyListener onKeyListener = eVar.b0;
        if (onKeyListener != null) {
            fVar.setOnKeyListener(onKeyListener);
        }
        fVar.b();
        fVar.n();
        fVar.c(fVar.e);
        fVar.d();
        Display defaultDisplay = fVar.getWindow().getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int i2 = point.x;
        int i3 = point.y;
        int dimensionPixelSize4 = eVar.a.getResources().getDimensionPixelSize(R$dimen.md_dialog_vertical_margin);
        int dimensionPixelSize5 = eVar.a.getResources().getDimensionPixelSize(R$dimen.md_dialog_horizontal_margin);
        fVar.e.setMaxHeight(i3 - (dimensionPixelSize4 * 2));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(fVar.getWindow().getAttributes());
        layoutParams.width = Math.min(eVar.a.getResources().getDimensionPixelSize(R$dimen.md_dialog_max_width), i2 - (dimensionPixelSize5 * 2));
        fVar.getWindow().setAttributes(layoutParams);
    }

    private static void e(f fVar) {
        f.e eVar = fVar.g;
        EditText editText = (EditText) fVar.e.findViewById(16908297);
        fVar.l = editText;
        if (editText != null) {
            fVar.t(editText, eVar.S);
            CharSequence charSequence = eVar.m0;
            if (charSequence != null) {
                fVar.l.setText(charSequence);
            }
            fVar.r();
            fVar.l.setHint(eVar.n0);
            fVar.l.setSingleLine();
            fVar.l.setTextColor(eVar.j);
            fVar.l.setHintTextColor(x8.a(eVar.j, 0.3f));
            c.e(fVar.l, fVar.g.t);
            int i = eVar.q0;
            if (i != -1) {
                fVar.l.setInputType(i);
                int i2 = eVar.q0;
                if (i2 != 144 && (i2 & 128) == 128) {
                    fVar.l.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
            TextView textView = (TextView) fVar.e.findViewById(R$id.md_minMax);
            fVar.s = textView;
            if (eVar.s0 > 0 || eVar.t0 > -1) {
                fVar.m(fVar.l.getText().toString().length(), !eVar.p0);
                return;
            }
            textView.setVisibility(8);
            fVar.s = null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: me.zhanghai.android.materialprogressbar.HorizontalProgressDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: me.zhanghai.android.materialprogressbar.IndeterminateCircularProgressDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: me.zhanghai.android.materialprogressbar.IndeterminateHorizontalProgressDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: me.zhanghai.android.materialprogressbar.HorizontalProgressDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: me.zhanghai.android.materialprogressbar.HorizontalProgressDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: me.zhanghai.android.materialprogressbar.HorizontalProgressDrawable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void f(com.afollestad.materialdialogs.f r7) {
        /*
            com.afollestad.materialdialogs.f$e r0 = r7.g
            boolean r1 = r0.i0
            if (r1 != 0) goto L_0x000b
            int r1 = r0.k0
            r2 = -2
            if (r1 <= r2) goto L_0x0108
        L_0x000b:
            com.afollestad.materialdialogs.internal.MDRootLayout r1 = r7.e
            r2 = 16908301(0x102000d, float:2.3877265E-38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r7.p = r1
            if (r1 != 0) goto L_0x001b
            return
        L_0x001b:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 14
            if (r2 < r3) goto L_0x0060
            boolean r1 = r0.i0
            if (r1 == 0) goto L_0x0047
            boolean r1 = r0.B0
            if (r1 == 0) goto L_0x0038
            me.zhanghai.android.materialprogressbar.IndeterminateHorizontalProgressDrawable r1 = new me.zhanghai.android.materialprogressbar.IndeterminateHorizontalProgressDrawable
            android.content.Context r2 = r0.j()
            r1.<init>(r2)
            int r2 = r0.t
            r1.setTint(r2)
            goto L_0x0055
        L_0x0038:
            me.zhanghai.android.materialprogressbar.IndeterminateCircularProgressDrawable r1 = new me.zhanghai.android.materialprogressbar.IndeterminateCircularProgressDrawable
            android.content.Context r2 = r0.j()
            r1.<init>(r2)
            int r2 = r0.t
            r1.setTint(r2)
            goto L_0x0055
        L_0x0047:
            me.zhanghai.android.materialprogressbar.HorizontalProgressDrawable r1 = new me.zhanghai.android.materialprogressbar.HorizontalProgressDrawable
            android.content.Context r2 = r0.j()
            r1.<init>(r2)
            int r2 = r0.t
            r1.setTint(r2)
        L_0x0055:
            android.widget.ProgressBar r2 = r7.p
            r2.setProgressDrawable(r1)
            android.widget.ProgressBar r2 = r7.p
            r2.setIndeterminateDrawable(r1)
            goto L_0x0065
        L_0x0060:
            int r2 = r0.t
            com.afollestad.materialdialogs.internal.c.f(r1, r2)
        L_0x0065:
            boolean r1 = r0.i0
            if (r1 == 0) goto L_0x006d
            boolean r1 = r0.B0
            if (r1 == 0) goto L_0x0108
        L_0x006d:
            android.widget.ProgressBar r1 = r7.p
            boolean r2 = r0.i0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x007b
            boolean r2 = r0.B0
            if (r2 == 0) goto L_0x007b
            r2 = 1
            goto L_0x007c
        L_0x007b:
            r2 = 0
        L_0x007c:
            r1.setIndeterminate(r2)
            android.widget.ProgressBar r1 = r7.p
            r1.setProgress(r4)
            android.widget.ProgressBar r1 = r7.p
            int r2 = r0.l0
            r1.setMax(r2)
            com.afollestad.materialdialogs.internal.MDRootLayout r1 = r7.e
            int r2 = com.afollestad.materialdialogs.R$id.md_label
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r7.q = r1
            if (r1 == 0) goto L_0x00b2
            int r2 = r0.j
            r1.setTextColor(r2)
            android.widget.TextView r1 = r7.q
            android.graphics.Typeface r2 = r0.T
            r7.t(r1, r2)
            android.widget.TextView r1 = r7.q
            java.text.NumberFormat r2 = r0.A0
            r5 = 0
            java.lang.String r2 = r2.format(r5)
            r1.setText(r2)
        L_0x00b2:
            com.afollestad.materialdialogs.internal.MDRootLayout r1 = r7.e
            int r2 = com.afollestad.materialdialogs.R$id.md_minMax
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r7.r = r1
            if (r1 == 0) goto L_0x0106
            int r2 = r0.j
            r1.setTextColor(r2)
            android.widget.TextView r1 = r7.r
            android.graphics.Typeface r2 = r0.S
            r7.t(r1, r2)
            boolean r1 = r0.j0
            if (r1 == 0) goto L_0x00fe
            android.widget.TextView r1 = r7.r
            r1.setVisibility(r4)
            android.widget.TextView r1 = r7.r
            java.lang.String r2 = r0.z0
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r5[r4] = r6
            int r0 = r0.l0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5[r3] = r0
            java.lang.String r0 = java.lang.String.format(r2, r5)
            r1.setText(r0)
            android.widget.ProgressBar r0 = r7.p
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r0.leftMargin = r4
            r0.rightMargin = r4
            goto L_0x0108
        L_0x00fe:
            android.widget.TextView r0 = r7.r
            r1 = 8
            r0.setVisibility(r1)
            goto L_0x0108
        L_0x0106:
            r0.j0 = r4
        L_0x0108:
            android.widget.ProgressBar r7 = r7.p
            if (r7 == 0) goto L_0x010f
            a(r7)
        L_0x010f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.d.f(com.afollestad.materialdialogs.f):void");
    }
}
