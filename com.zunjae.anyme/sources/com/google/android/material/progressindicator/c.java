package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import com.github.mikephil.charting.utils.Utils;

public final class c extends g<AnimatorSet> {
    private static final Property<c, Integer> o = new C0103c(Integer.class, "displayedIndicatorColor");
    private static final Property<c, Float> p;
    private static final Property<c, Float> q;
    private static final Property<c, Float> r;
    private final AnimatorSet d;
    /* access modifiers changed from: private */
    public final ObjectAnimator e;
    private ObjectAnimator f;
    private int g;
    private int h;
    private float i;
    private float j;
    private float k;
    private float l;
    boolean m = false;
    x6 n = null;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            c cVar = c.this;
            if (cVar.m) {
                cVar.e.setFloatValues(new float[]{Utils.FLOAT_EPSILON, 1.08f});
            }
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            c cVar = c.this;
            if (cVar.m) {
                float[] fArr = cVar.b;
                if (fArr[0] == fArr[1]) {
                    cVar.n.a(cVar.a);
                    c.this.m = false;
                    return;
                }
            }
            if (c.this.a.isVisible()) {
                c.this.u();
                c.this.g();
            }
        }
    }

    /* renamed from: com.google.android.material.progressindicator.c$c  reason: collision with other inner class name */
    static class C0103c extends Property<c, Integer> {
        C0103c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Integer get(c cVar) {
            return Integer.valueOf(cVar.o());
        }

        /* renamed from: b */
        public void set(c cVar, Integer num) {
            cVar.w(num.intValue());
        }
    }

    static class d extends Property<c, Float> {
        d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(c cVar) {
            return Float.valueOf(cVar.q());
        }

        /* renamed from: b */
        public void set(c cVar, Float f) {
            cVar.y(f.floatValue());
        }
    }

    static class e extends Property<c, Float> {
        e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(c cVar) {
            return Float.valueOf(cVar.p());
        }

        /* renamed from: b */
        public void set(c cVar, Float f) {
            cVar.x(f.floatValue());
        }
    }

    static class f extends Property<c, Float> {
        f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(c cVar) {
            return Float.valueOf(cVar.s());
        }

        /* renamed from: b */
        public void set(c cVar, Float f) {
            cVar.A(f.floatValue());
        }
    }

    static {
        Class<Float> cls = Float.class;
        p = new d(cls, "indicatorInCycleOffset");
        q = new e(cls, "indicatorHeadChangeFraction");
        r = new f(cls, "indicatorTailChangeFraction");
    }

    public c() {
        super(1);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, p, new float[]{Utils.FLOAT_EPSILON, 360.0f});
        ofFloat.setDuration(1333);
        ofFloat.setInterpolator((TimeInterpolator) null);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, q, new float[]{Utils.FLOAT_EPSILON, 1.0f});
        ofFloat2.setDuration(666);
        ofFloat2.setInterpolator(f91.b);
        ofFloat2.addListener(new a());
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, r, new float[]{Utils.FLOAT_EPSILON, 1.0f});
        this.e = ofFloat3;
        ofFloat3.setDuration(666);
        this.e.setInterpolator(f91.b);
        AnimatorSet animatorSet = new AnimatorSet();
        this.d = animatorSet;
        animatorSet.playSequentially(new Animator[]{ofFloat2, this.e});
        this.d.playTogether(new Animator[]{ofFloat});
        this.d.addListener(new b());
    }

    private void B() {
        int t = t();
        this.g = t;
        ObjectAnimator objectAnimator = this.f;
        int[] iArr = this.a.m;
        objectAnimator.setIntValues(new int[]{iArr[t], iArr[t()]});
        w(this.a.m[this.g]);
    }

    private void C() {
        this.b[0] = (((r() + q()) - 20.0f) + (s() * 250.0f)) / 360.0f;
        this.b[1] = ((r() + q()) + (p() * 250.0f)) / 360.0f;
    }

    /* access modifiers changed from: private */
    public int o() {
        return this.h;
    }

    /* access modifiers changed from: private */
    public float p() {
        return this.k;
    }

    /* access modifiers changed from: private */
    public float q() {
        return this.j;
    }

    private float r() {
        return this.i;
    }

    /* access modifiers changed from: private */
    public float s() {
        return this.l;
    }

    private int t() {
        return (this.g + 1) % this.a.m.length;
    }

    private void v() {
        this.g = 0;
        ObjectAnimator objectAnimator = this.f;
        int[] iArr = this.a.m;
        objectAnimator.setIntValues(new int[]{iArr[0], iArr[t()]});
        w(this.a.m[this.g]);
    }

    /* access modifiers changed from: private */
    public void w(int i2) {
        this.h = i2;
        this.c[0] = i2;
        this.a.invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void A(float f2) {
        this.l = f2;
        C();
        this.a.invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.d.cancel();
    }

    public void b() {
        v();
    }

    public void c(x6 x6Var) {
        this.n = x6Var;
    }

    /* access modifiers changed from: protected */
    public void d(h hVar) {
        super.d(hVar);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this, o, new h91(), new Integer[]{Integer.valueOf(hVar.m[this.g]), Integer.valueOf(hVar.m[t()])});
        this.f = ofObject;
        ofObject.setDuration(333);
        this.f.setStartDelay(1000);
        this.f.setInterpolator(f91.b);
        this.d.playTogether(new Animator[]{this.f});
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (!this.m) {
            if (this.a.isVisible()) {
                this.m = true;
            } else {
                a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        x(Utils.FLOAT_EPSILON);
        A(Utils.FLOAT_EPSILON);
        z(Utils.FLOAT_EPSILON);
        this.e.setFloatValues(new float[]{Utils.FLOAT_EPSILON, 1.0f});
        v();
    }

    /* access modifiers changed from: package-private */
    public void g() {
        this.d.start();
    }

    public void h() {
        this.n = null;
    }

    /* access modifiers changed from: package-private */
    public void u() {
        x(Utils.FLOAT_EPSILON);
        A(Utils.FLOAT_EPSILON);
        z(z91.c(r() + 360.0f + 250.0f, 360));
        B();
    }

    /* access modifiers changed from: package-private */
    public void x(float f2) {
        this.k = f2;
        C();
        this.a.invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void y(float f2) {
        this.j = f2;
        C();
        this.a.invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void z(float f2) {
        this.i = f2;
        C();
        this.a.invalidateSelf();
    }
}
