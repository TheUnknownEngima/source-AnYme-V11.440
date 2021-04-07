package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.R$color;
import java.util.ArrayList;

class e extends d {

    static class a extends ra1 {
        a(wa1 wa1) {
            super(wa1);
        }

        public boolean isStateful() {
            return true;
        }
    }

    e(FloatingActionButton floatingActionButton, ja1 ja1) {
        super(floatingActionButton, ja1);
    }

    private Animator i0(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.y, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.y, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(d.F);
        return animatorSet;
    }

    /* access modifiers changed from: package-private */
    public void A() {
    }

    /* access modifiers changed from: package-private */
    public void C() {
        e0();
    }

    /* access modifiers changed from: package-private */
    public void E(int[] iArr) {
        FloatingActionButton floatingActionButton;
        if (Build.VERSION.SDK_INT == 21) {
            boolean isEnabled = this.y.isEnabled();
            float f = Utils.FLOAT_EPSILON;
            if (isEnabled) {
                this.y.setElevation(this.h);
                if (this.y.isPressed()) {
                    floatingActionButton = this.y;
                    f = this.j;
                } else if (this.y.isFocused() || this.y.isHovered()) {
                    floatingActionButton = this.y;
                    f = this.i;
                }
                floatingActionButton.setTranslationZ(f);
            }
            this.y.setElevation(Utils.FLOAT_EPSILON);
            floatingActionButton = this.y;
            floatingActionButton.setTranslationZ(f);
        }
    }

    /* access modifiers changed from: package-private */
    public void F(float f, float f2, float f3) {
        if (Build.VERSION.SDK_INT == 21) {
            this.y.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(d.G, i0(f, f3));
            stateListAnimator.addState(d.H, i0(f, f2));
            stateListAnimator.addState(d.I, i0(f, f2));
            stateListAnimator.addState(d.J, i0(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.y, "elevation", new float[]{f}).setDuration(0));
            int i = Build.VERSION.SDK_INT;
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.y;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{floatingActionButton.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.y, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(d.F);
            stateListAnimator.addState(d.K, animatorSet);
            stateListAnimator.addState(d.L, i0(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON));
            this.y.setStateListAnimator(stateListAnimator);
        }
        if (Y()) {
            e0();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean K() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void U(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(ha1.d(colorStateList));
        } else {
            super.U(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean Y() {
        return this.z.b() || !a0();
    }

    /* access modifiers changed from: package-private */
    public void c0() {
    }

    /* access modifiers changed from: package-private */
    public c h0(int i, ColorStateList colorStateList) {
        Context context = this.y.getContext();
        wa1 wa1 = this.a;
        u3.c(wa1);
        c cVar = new c(wa1);
        cVar.e(androidx.core.content.a.d(context, R$color.design_fab_stroke_top_outer_color), androidx.core.content.a.d(context, R$color.design_fab_stroke_top_inner_color), androidx.core.content.a.d(context, R$color.design_fab_stroke_end_inner_color), androidx.core.content.a.d(context, R$color.design_fab_stroke_end_outer_color));
        cVar.d((float) i);
        cVar.c(colorStateList);
        return cVar;
    }

    /* access modifiers changed from: package-private */
    public ra1 j() {
        wa1 wa1 = this.a;
        u3.c(wa1);
        return new a(wa1);
    }

    public float n() {
        return this.y.getElevation();
    }

    /* access modifiers changed from: package-private */
    public void s(Rect rect) {
        if (this.z.b()) {
            super.s(rect);
            return;
        }
        int sizeDimension = !a0() ? (this.k - this.y.getSizeDimension()) / 2 : 0;
        rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
    }

    /* access modifiers changed from: package-private */
    public void x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        ra1 j = j();
        this.b = j;
        j.setTintList(colorStateList);
        if (mode != null) {
            this.b.setTintMode(mode);
        }
        this.b.N(this.y.getContext());
        if (i > 0) {
            this.d = h0(i, colorStateList);
            c cVar = this.d;
            u3.c(cVar);
            ra1 ra1 = this.b;
            u3.c(ra1);
            drawable = new LayerDrawable(new Drawable[]{cVar, ra1});
        } else {
            this.d = null;
            drawable = this.b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(ha1.d(colorStateList2), drawable, (Drawable) null);
        this.c = rippleDrawable;
        this.e = rippleDrawable;
    }
}
