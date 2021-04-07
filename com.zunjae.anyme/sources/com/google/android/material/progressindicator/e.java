package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;

abstract class e extends Drawable implements Animatable {
    private static final Property<e, Float> p = new c(Float.class, "growFraction");
    final Context e;
    final l f;
    a g;
    private ValueAnimator h;
    private ValueAnimator i;
    private List<x6> j;
    private float k;
    int l;
    int[] m;
    final Paint n = new Paint();
    private int o;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            e.this.e();
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            boolean unused = e.super.setVisible(false, false);
            e.this.d();
        }
    }

    static class c extends Property<e, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(e eVar) {
            return Float.valueOf(eVar.f());
        }

        /* renamed from: b */
        public void set(e eVar, Float f) {
            eVar.m(f.floatValue());
        }
    }

    e(Context context, l lVar) {
        this.e = context;
        this.f = lVar;
        this.g = new a();
        setAlpha(255);
        j();
        i();
    }

    /* access modifiers changed from: private */
    public void d() {
        List<x6> list = this.j;
        if (list != null) {
            for (x6 a2 : list) {
                a2.a(this);
            }
        }
    }

    /* access modifiers changed from: private */
    public void e() {
        List<x6> list = this.j;
        if (list != null) {
            for (x6 b2 : list) {
                b2.b(this);
            }
        }
    }

    private void i() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, p, new float[]{1.0f, Utils.FLOAT_EPSILON});
        this.i = ofFloat;
        ofFloat.setDuration(500);
        this.i.setInterpolator(f91.b);
        n(this.i);
    }

    private void j() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, p, new float[]{Utils.FLOAT_EPSILON, 1.0f});
        this.h = ofFloat;
        ofFloat.setDuration(500);
        this.h.setInterpolator(f91.b);
        o(this.h);
    }

    private void n(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.i;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            this.i = valueAnimator;
            valueAnimator.addListener(new b());
            return;
        }
        throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
    }

    private void o(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.h;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            this.h = valueAnimator;
            valueAnimator.addListener(new a());
            return;
        }
        throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
    }

    /* access modifiers changed from: package-private */
    public float f() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public ValueAnimator g() {
        return this.i;
    }

    public int getAlpha() {
        return this.o;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean h() {
        return p(false, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isRunning() {
        /*
            r1 = this;
            android.animation.ValueAnimator r0 = r1.h
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x0014
        L_0x000a:
            android.animation.ValueAnimator r0 = r1.i
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x0016
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.progressindicator.e.isRunning():boolean");
    }

    /* access modifiers changed from: package-private */
    public void k() {
        this.l = t91.a(this.f.e, getAlpha());
        this.m = (int[]) this.f.d.clone();
        int i2 = 0;
        while (true) {
            int[] iArr = this.m;
            if (i2 < iArr.length) {
                iArr[i2] = t91.a(iArr[i2], getAlpha());
                i2++;
            } else {
                return;
            }
        }
    }

    public void l(x6 x6Var) {
        if (this.j == null) {
            this.j = new ArrayList();
        }
        if (!this.j.contains(x6Var)) {
            this.j.add(x6Var);
        }
    }

    /* access modifiers changed from: package-private */
    public void m(float f2) {
        if (this.f.g == 0) {
            f2 = 1.0f;
        }
        if (this.k != f2) {
            this.k = f2;
            invalidateSelf();
        }
    }

    public boolean p(boolean z, boolean z2, boolean z3) {
        boolean z4 = false;
        if (!isVisible() && !z) {
            return false;
        }
        if (z3) {
            if ((z ? this.h : this.i).isRunning()) {
                return false;
            }
        }
        ValueAnimator valueAnimator = z ? this.h : this.i;
        boolean z5 = !z || super.setVisible(z, false);
        if (this.f.g != 0) {
            z4 = true;
        }
        if (!z3 || !z4) {
            valueAnimator.end();
            return z5;
        }
        if (z2 || Build.VERSION.SDK_INT < 19 || !valueAnimator.isPaused()) {
            valueAnimator.start();
        } else {
            valueAnimator.resume();
        }
        return z5;
    }

    public boolean q(x6 x6Var) {
        List<x6> list = this.j;
        if (list == null || !list.contains(x6Var)) {
            return false;
        }
        this.j.remove(x6Var);
        if (!this.j.isEmpty()) {
            return true;
        }
        this.j = null;
        return true;
    }

    public void setAlpha(int i2) {
        this.o = i2;
        k();
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.n.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public boolean setVisible(boolean z, boolean z2) {
        return p(z, z2, this.g.a(this.e.getContentResolver()) > Utils.FLOAT_EPSILON);
    }

    public void start() {
        setVisible(true, true);
    }

    public void stop() {
        setVisible(false, true);
    }
}
