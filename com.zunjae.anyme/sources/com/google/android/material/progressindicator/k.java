package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import com.github.mikephil.charting.utils.Utils;

public final class k extends g<AnimatorSet> {
    private static final Property<k, Float> h;
    private static final Property<k, Float> i;
    private final AnimatorSet d;
    private int e;
    private float f;
    private float g;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            if (k.this.m() > Utils.FLOAT_EPSILON && k.this.m() < 1.0f) {
                k.this.q();
            }
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            if (k.this.l() > Utils.FLOAT_EPSILON && k.this.l() < 1.0f) {
                k.this.q();
            }
        }
    }

    static class c extends Property<k, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(k kVar) {
            return Float.valueOf(kVar.l());
        }

        /* renamed from: b */
        public void set(k kVar, Float f) {
            kVar.o(f.floatValue());
        }
    }

    static class d extends Property<k, Float> {
        d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(k kVar) {
            return Float.valueOf(kVar.m());
        }

        /* renamed from: b */
        public void set(k kVar, Float f) {
            kVar.p(f.floatValue());
        }
    }

    static {
        Class<Float> cls = Float.class;
        h = new c(cls, "lineConnectPoint1Fraction");
        i = new d(cls, "lineConnectPoint2Fraction");
    }

    public k() {
        super(3);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, h, new float[]{Utils.FLOAT_EPSILON, 1.0f});
        ofFloat.setDuration(667);
        ofFloat.setInterpolator(f91.b);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.addListener(new a());
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, i, new float[]{Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON});
        ofFloat2.setDuration(333);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, i, new float[]{Utils.FLOAT_EPSILON, 1.0f});
        ofFloat3.setDuration(667);
        ofFloat3.setInterpolator(f91.b);
        ofFloat3.setRepeatCount(-1);
        ofFloat3.setRepeatMode(1);
        ofFloat3.addListener(new b());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat3});
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.d = animatorSet2;
        animatorSet2.playTogether(new Animator[]{ofFloat, animatorSet});
    }

    /* access modifiers changed from: private */
    public float l() {
        return this.f;
    }

    /* access modifiers changed from: private */
    public float m() {
        return this.g;
    }

    private void n() {
        this.e = 0;
        r();
    }

    /* access modifiers changed from: private */
    public void q() {
        this.e = (this.e + 1) % this.a.m.length;
        r();
    }

    private void r() {
        int d2 = z91.d(this.e + 2, this.a.m.length);
        int d3 = z91.d(this.e + 1, this.a.m.length);
        int[] iArr = this.c;
        int[] iArr2 = this.a.m;
        iArr[0] = iArr2[d2];
        iArr[1] = iArr2[d3];
        iArr[2] = iArr2[this.e];
    }

    private void s() {
        float[] fArr = this.b;
        fArr[0] = 0.0f;
        float min = Math.min(l(), m());
        fArr[2] = min;
        fArr[1] = min;
        float[] fArr2 = this.b;
        float max = Math.max(l(), m());
        fArr2[4] = max;
        fArr2[3] = max;
        this.b[5] = 1.0f;
    }

    public void a() {
        this.d.cancel();
    }

    public void b() {
        n();
    }

    public void c(x6 x6Var) {
    }

    public void e() {
    }

    public void f() {
        o(Utils.FLOAT_EPSILON);
        p(Utils.FLOAT_EPSILON);
        n();
    }

    public void g() {
        this.d.start();
    }

    public void h() {
    }

    /* access modifiers changed from: package-private */
    public void o(float f2) {
        this.f = f2;
        s();
        this.a.invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void p(float f2) {
        this.g = f2;
        s();
        this.a.invalidateSelf();
    }
}
