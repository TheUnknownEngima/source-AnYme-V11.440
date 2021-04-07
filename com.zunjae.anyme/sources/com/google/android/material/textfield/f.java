package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.i;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import java.util.ArrayList;
import java.util.List;

final class f {
    private final Context a;
    private final TextInputLayout b;
    private LinearLayout c;
    private int d;
    private FrameLayout e;
    private int f;
    /* access modifiers changed from: private */
    public Animator g;
    private final float h;
    /* access modifiers changed from: private */
    public int i;
    private int j;
    private CharSequence k;
    private boolean l;
    /* access modifiers changed from: private */
    public TextView m;
    private CharSequence n;
    private int o;
    private ColorStateList p;
    private CharSequence q;
    private boolean r;
    private TextView s;
    private int t;
    private ColorStateList u;
    private Typeface v;

    class a extends AnimatorListenerAdapter {
        final /* synthetic */ int e;
        final /* synthetic */ TextView f;
        final /* synthetic */ int g;
        final /* synthetic */ TextView h;

        a(int i2, TextView textView, int i3, TextView textView2) {
            this.e = i2;
            this.f = textView;
            this.g = i3;
            this.h = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = f.this.i = this.e;
            Animator unused2 = f.this.g = null;
            TextView textView = this.f;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.g == 1 && f.this.m != null) {
                    f.this.m.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.h;
            if (textView2 != null) {
                textView2.setTranslationY(Utils.FLOAT_EPSILON);
                this.h.setAlpha(1.0f);
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.h;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public f(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.a = context;
        this.b = textInputLayout;
        this.h = (float) context.getResources().getDimensionPixelSize(R$dimen.design_textinput_caption_translate_y);
    }

    private void H(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void J(ViewGroup viewGroup, int i2) {
        if (i2 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean K(TextView textView, CharSequence charSequence) {
        return o4.O(this.b) && this.b.isEnabled() && (this.j != this.i || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    private void N(int i2, int i3, boolean z) {
        boolean z2 = z;
        if (i2 != i3) {
            if (z2) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.g = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i4 = i2;
                int i5 = i3;
                h(arrayList2, this.r, this.s, 2, i4, i5);
                h(arrayList2, this.l, this.m, 1, i4, i5);
                g91.a(animatorSet, arrayList);
                animatorSet.addListener(new a(i3, l(i2), i2, l(i3)));
                animatorSet.start();
            } else {
                z(i2, i3);
            }
            this.b.p0();
            this.b.s0(z2);
            this.b.C0();
        }
    }

    private boolean f() {
        return (this.c == null || this.b.getEditText() == null) ? false : true;
    }

    private void h(List<Animator> list, boolean z, TextView textView, int i2, int i3, int i4) {
        if (textView != null && z) {
            if (i2 == i4 || i2 == i3) {
                list.add(i(textView, i4 == i2));
                if (i4 == i2) {
                    list.add(j(textView));
                }
            }
        }
    }

    private ObjectAnimator i(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{z ? 1.0f : Utils.FLOAT_EPSILON});
        ofFloat.setDuration(167);
        ofFloat.setInterpolator(f91.a);
        return ofFloat;
    }

    private ObjectAnimator j(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.h, 0.0f});
        ofFloat.setDuration(217);
        ofFloat.setInterpolator(f91.d);
        return ofFloat;
    }

    private TextView l(int i2) {
        if (i2 == 1) {
            return this.m;
        }
        if (i2 != 2) {
            return null;
        }
        return this.s;
    }

    private boolean u(int i2) {
        return i2 == 1 && this.m != null && !TextUtils.isEmpty(this.k);
    }

    private void z(int i2, int i3) {
        TextView l2;
        TextView l3;
        if (i2 != i3) {
            if (!(i3 == 0 || (l3 = l(i3)) == null)) {
                l3.setVisibility(0);
                l3.setAlpha(1.0f);
            }
            if (!(i2 == 0 || (l2 = l(i2)) == null)) {
                l2.setVisibility(4);
                if (i2 == 1) {
                    l2.setText((CharSequence) null);
                }
            }
            this.i = i3;
        }
    }

    /* access modifiers changed from: package-private */
    public void A(CharSequence charSequence) {
        this.n = charSequence;
        TextView textView = this.m;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    public void B(boolean z) {
        if (this.l != z) {
            g();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.a);
                this.m = appCompatTextView;
                appCompatTextView.setId(R$id.textinput_error);
                if (Build.VERSION.SDK_INT >= 17) {
                    this.m.setTextAlignment(5);
                }
                Typeface typeface = this.v;
                if (typeface != null) {
                    this.m.setTypeface(typeface);
                }
                C(this.o);
                D(this.p);
                A(this.n);
                this.m.setVisibility(4);
                o4.k0(this.m, 1);
                d(this.m, 0);
            } else {
                s();
                y(this.m, 0);
                this.m = null;
                this.b.p0();
                this.b.C0();
            }
            this.l = z;
        }
    }

    /* access modifiers changed from: package-private */
    public void C(int i2) {
        this.o = i2;
        TextView textView = this.m;
        if (textView != null) {
            this.b.d0(textView, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void D(ColorStateList colorStateList) {
        this.p = colorStateList;
        TextView textView = this.m;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void E(int i2) {
        this.t = i2;
        TextView textView = this.s;
        if (textView != null) {
            i.r(textView, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void F(boolean z) {
        if (this.r != z) {
            g();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.a);
                this.s = appCompatTextView;
                appCompatTextView.setId(R$id.textinput_helper_text);
                if (Build.VERSION.SDK_INT >= 17) {
                    this.s.setTextAlignment(5);
                }
                Typeface typeface = this.v;
                if (typeface != null) {
                    this.s.setTypeface(typeface);
                }
                this.s.setVisibility(4);
                o4.k0(this.s, 1);
                E(this.t);
                G(this.u);
                d(this.s, 1);
            } else {
                t();
                y(this.s, 1);
                this.s = null;
                this.b.p0();
                this.b.C0();
            }
            this.r = z;
        }
    }

    /* access modifiers changed from: package-private */
    public void G(ColorStateList colorStateList) {
        this.u = colorStateList;
        TextView textView = this.s;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void I(Typeface typeface) {
        if (typeface != this.v) {
            this.v = typeface;
            H(this.m, typeface);
            H(this.s, typeface);
        }
    }

    /* access modifiers changed from: package-private */
    public void L(CharSequence charSequence) {
        g();
        this.k = charSequence;
        this.m.setText(charSequence);
        if (this.i != 1) {
            this.j = 1;
        }
        N(this.i, this.j, K(this.m, charSequence));
    }

    /* access modifiers changed from: package-private */
    public void M(CharSequence charSequence) {
        g();
        this.q = charSequence;
        this.s.setText(charSequence);
        if (this.i != 2) {
            this.j = 2;
        }
        N(this.i, this.j, K(this.s, charSequence));
    }

    /* access modifiers changed from: package-private */
    public void d(TextView textView, int i2) {
        if (this.c == null && this.e == null) {
            LinearLayout linearLayout = new LinearLayout(this.a);
            this.c = linearLayout;
            linearLayout.setOrientation(0);
            this.b.addView(this.c, -1, -2);
            this.e = new FrameLayout(this.a);
            this.c.addView(this.e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.b.getEditText() != null) {
                e();
            }
        }
        if (v(i2)) {
            this.e.setVisibility(0);
            this.e.addView(textView);
            this.f++;
        } else {
            this.c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.c.setVisibility(0);
        this.d++;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (f()) {
            o4.w0(this.c, o4.D(this.b.getEditText()), 0, o4.C(this.b.getEditText()), 0);
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        Animator animator = this.g;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return u(this.j);
    }

    /* access modifiers changed from: package-private */
    public CharSequence m() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public CharSequence n() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public int o() {
        TextView textView = this.m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList p() {
        TextView textView = this.m;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public CharSequence q() {
        return this.q;
    }

    /* access modifiers changed from: package-private */
    public int r() {
        TextView textView = this.s;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public void s() {
        this.k = null;
        g();
        if (this.i == 1) {
            this.j = (!this.r || TextUtils.isEmpty(this.q)) ? 0 : 2;
        }
        N(this.i, this.j, K(this.m, (CharSequence) null));
    }

    /* access modifiers changed from: package-private */
    public void t() {
        g();
        if (this.i == 2) {
            this.j = 0;
        }
        N(this.i, this.j, K(this.s, (CharSequence) null));
    }

    /* access modifiers changed from: package-private */
    public boolean v(int i2) {
        return i2 == 0 || i2 == 1;
    }

    /* access modifiers changed from: package-private */
    public boolean w() {
        return this.l;
    }

    /* access modifiers changed from: package-private */
    public boolean x() {
        return this.r;
    }

    /* access modifiers changed from: package-private */
    public void y(TextView textView, int i2) {
        FrameLayout frameLayout;
        if (this.c != null) {
            if (!v(i2) || (frameLayout = this.e) == null) {
                this.c.removeView(textView);
            } else {
                int i3 = this.f - 1;
                this.f = i3;
                J(frameLayout, i3);
                this.e.removeView(textView);
            }
            int i4 = this.d - 1;
            this.d = i4;
            J(this.c, i4);
        }
    }
}
