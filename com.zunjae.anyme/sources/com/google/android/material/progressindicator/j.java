package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.R$animator;
import java.util.Arrays;

public final class j extends g<AnimatorSet> {
    private static final Property<j, Float> l;
    private static final Property<j, Float> m;
    private static final Property<j, Float> n;
    private static final Property<j, Float> o;
    private final AnimatorSet d;
    private int e;
    private float f;
    private float g;
    private float h;
    private float i;
    boolean j = false;
    x6 k = null;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            j jVar = j.this;
            if (jVar.j) {
                jVar.j = false;
                jVar.k.a(jVar.a);
            } else if (jVar.a.isVisible()) {
                j.this.q();
                j.this.g();
                return;
            }
            j.this.f();
        }
    }

    static class b extends Property<j, Float> {
        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(j jVar) {
            return Float.valueOf(jVar.m());
        }

        /* renamed from: b */
        public void set(j jVar, Float f) {
            jVar.t(f.floatValue());
        }
    }

    static class c extends Property<j, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(j jVar) {
            return Float.valueOf(jVar.n());
        }

        /* renamed from: b */
        public void set(j jVar, Float f) {
            jVar.u(f.floatValue());
        }
    }

    static class d extends Property<j, Float> {
        d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(j jVar) {
            return Float.valueOf(jVar.o());
        }

        /* renamed from: b */
        public void set(j jVar, Float f) {
            jVar.v(f.floatValue());
        }
    }

    static class e extends Property<j, Float> {
        e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(j jVar) {
            return Float.valueOf(jVar.p());
        }

        /* renamed from: b */
        public void set(j jVar, Float f) {
            jVar.w(f.floatValue());
        }
    }

    static {
        Class<Float> cls = Float.class;
        l = new b(cls, "line1HeadFraction");
        m = new c(cls, "line1TailFraction");
        n = new d(cls, "line2HeadFraction");
        o = new e(cls, "line2TailFraction");
    }

    public j(Context context) {
        super(2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, l, new float[]{Utils.FLOAT_EPSILON, 1.0f});
        ofFloat.setDuration(750);
        ofFloat.setInterpolator(z6.b(context, R$animator.linear_indeterminate_line1_head_interpolator));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, m, new float[]{Utils.FLOAT_EPSILON, 1.0f});
        ofFloat2.setStartDelay(333);
        ofFloat2.setDuration(850);
        ofFloat2.setInterpolator(z6.b(context, R$animator.linear_indeterminate_line1_tail_interpolator));
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, n, new float[]{Utils.FLOAT_EPSILON, 1.0f});
        ofFloat3.setStartDelay(1000);
        ofFloat3.setDuration(567);
        ofFloat3.setInterpolator(z6.b(context, R$animator.linear_indeterminate_line2_head_interpolator));
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, o, new float[]{Utils.FLOAT_EPSILON, 1.0f});
        ofFloat4.setStartDelay(1267);
        ofFloat4.setDuration(533);
        ofFloat4.setInterpolator(z6.b(context, R$animator.linear_indeterminate_line2_tail_interpolator));
        AnimatorSet animatorSet = new AnimatorSet();
        this.d = animatorSet;
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4});
        this.d.addListener(new a());
    }

    /* access modifiers changed from: private */
    public float m() {
        return this.f;
    }

    /* access modifiers changed from: private */
    public float n() {
        return this.g;
    }

    /* access modifiers changed from: private */
    public float o() {
        return this.h;
    }

    /* access modifiers changed from: private */
    public float p() {
        return this.i;
    }

    private void r() {
        this.e = 0;
        Arrays.fill(this.c, this.a.m[0]);
    }

    private void s() {
        int[] iArr = this.a.m;
        int length = (this.e + 1) % iArr.length;
        this.e = length;
        Arrays.fill(this.c, iArr[length]);
    }

    public void a() {
        this.d.cancel();
    }

    public void b() {
        r();
    }

    public void c(x6 x6Var) {
        this.k = x6Var;
    }

    public void e() {
        if (!this.j) {
            if (!this.a.isVisible()) {
                a();
            } else {
                this.j = true;
            }
        }
    }

    public void f() {
        q();
        r();
    }

    public void g() {
        this.d.start();
    }

    public void h() {
        this.k = null;
    }

    public void q() {
        t(Utils.FLOAT_EPSILON);
        u(Utils.FLOAT_EPSILON);
        v(Utils.FLOAT_EPSILON);
        w(Utils.FLOAT_EPSILON);
        s();
    }

    /* access modifiers changed from: package-private */
    public void t(float f2) {
        this.f = f2;
        this.b[3] = f2;
        this.a.invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void u(float f2) {
        this.g = f2;
        this.b[2] = f2;
        this.a.invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void v(float f2) {
        this.h = f2;
        this.b[1] = f2;
        this.a.invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void w(float f2) {
        this.i = f2;
        this.b[0] = f2;
        this.a.invalidateSelf();
    }
}
