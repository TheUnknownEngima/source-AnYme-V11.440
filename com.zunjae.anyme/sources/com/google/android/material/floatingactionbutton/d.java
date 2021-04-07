package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.R$animator;
import java.util.ArrayList;
import java.util.Iterator;

class d {
    static final TimeInterpolator F = f91.c;
    static final int[] G = {16842919, 16842910};
    static final int[] H = {16843623, 16842908, 16842910};
    static final int[] I = {16842908, 16842910};
    static final int[] J = {16843623, 16842910};
    static final int[] K = {16842910};
    static final int[] L = new int[0];
    private final Rect A = new Rect();
    private final RectF B = new RectF();
    private final RectF C = new RectF();
    private final Matrix D = new Matrix();
    private ViewTreeObserver.OnPreDrawListener E;
    wa1 a;
    ra1 b;
    Drawable c;
    c d;
    Drawable e;
    boolean f;
    boolean g = true;
    float h;
    float i;
    float j;
    int k;
    private final com.google.android.material.internal.h l;
    private m91 m;
    private m91 n;
    /* access modifiers changed from: private */
    public Animator o;
    private m91 p;
    private m91 q;
    private float r;
    /* access modifiers changed from: private */
    public float s = 1.0f;
    private int t;
    /* access modifiers changed from: private */
    public int u = 0;
    private ArrayList<Animator.AnimatorListener> v;
    private ArrayList<Animator.AnimatorListener> w;
    private ArrayList<i> x;
    final FloatingActionButton y;
    final ja1 z;

    class a extends AnimatorListenerAdapter {
        private boolean e;
        final /* synthetic */ boolean f;
        final /* synthetic */ j g;

        a(boolean z, j jVar) {
            this.f = z;
            this.g = jVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.e = true;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = d.this.u = 0;
            Animator unused2 = d.this.o = null;
            if (!this.e) {
                d.this.y.a(this.f ? 8 : 4, this.f);
                j jVar = this.g;
                if (jVar != null) {
                    jVar.b();
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            d.this.y.a(0, this.f);
            int unused = d.this.u = 1;
            Animator unused2 = d.this.o = animator;
            this.e = false;
        }
    }

    class b extends AnimatorListenerAdapter {
        final /* synthetic */ boolean e;
        final /* synthetic */ j f;

        b(boolean z, j jVar) {
            this.e = z;
            this.f = jVar;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = d.this.u = 0;
            Animator unused2 = d.this.o = null;
            j jVar = this.f;
            if (jVar != null) {
                jVar.a();
            }
        }

        public void onAnimationStart(Animator animator) {
            d.this.y.a(0, this.e);
            int unused = d.this.u = 2;
            Animator unused2 = d.this.o = animator;
        }
    }

    class c extends l91 {
        c() {
        }

        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            float unused = d.this.s = f;
            return super.a(f, matrix, matrix2);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$d  reason: collision with other inner class name */
    class C0100d implements TypeEvaluator<Float> {
        FloatEvaluator a = new FloatEvaluator();

        C0100d(d dVar) {
        }

        /* renamed from: a */
        public Float evaluate(float f, Float f2, Float f3) {
            float floatValue = this.a.evaluate(f, f2, f3).floatValue();
            if (floatValue < 0.1f) {
                floatValue = Utils.FLOAT_EPSILON;
            }
            return Float.valueOf(floatValue);
        }
    }

    class e implements ViewTreeObserver.OnPreDrawListener {
        e() {
        }

        public boolean onPreDraw() {
            d.this.H();
            return true;
        }
    }

    private class f extends l {
        f(d dVar) {
            super(dVar, (a) null);
        }

        /* access modifiers changed from: protected */
        public float a() {
            return Utils.FLOAT_EPSILON;
        }
    }

    private class g extends l {
        g() {
            super(d.this, (a) null);
        }

        /* access modifiers changed from: protected */
        public float a() {
            d dVar = d.this;
            return dVar.h + dVar.i;
        }
    }

    private class h extends l {
        h() {
            super(d.this, (a) null);
        }

        /* access modifiers changed from: protected */
        public float a() {
            d dVar = d.this;
            return dVar.h + dVar.j;
        }
    }

    interface i {
        void a();

        void b();
    }

    interface j {
        void a();

        void b();
    }

    private class k extends l {
        k() {
            super(d.this, (a) null);
        }

        /* access modifiers changed from: protected */
        public float a() {
            return d.this.h;
        }
    }

    private abstract class l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        private boolean e;
        private float f;
        private float g;

        private l() {
        }

        /* synthetic */ l(d dVar, a aVar) {
            this();
        }

        /* access modifiers changed from: protected */
        public abstract float a();

        public void onAnimationEnd(Animator animator) {
            d.this.f0((float) ((int) this.g));
            this.e = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.e) {
                ra1 ra1 = d.this.b;
                this.f = ra1 == null ? Utils.FLOAT_EPSILON : ra1.w();
                this.g = a();
                this.e = true;
            }
            d dVar = d.this;
            float f2 = this.f;
            dVar.f0((float) ((int) (f2 + ((this.g - f2) * valueAnimator.getAnimatedFraction()))));
        }
    }

    d(FloatingActionButton floatingActionButton, ja1 ja1) {
        this.y = floatingActionButton;
        this.z = ja1;
        com.google.android.material.internal.h hVar = new com.google.android.material.internal.h();
        this.l = hVar;
        hVar.a(G, i(new h()));
        this.l.a(H, i(new g()));
        this.l.a(I, i(new g()));
        this.l.a(J, i(new g()));
        this.l.a(K, i(new k()));
        this.l.a(L, i(new f(this)));
        this.r = this.y.getRotation();
    }

    private boolean Z() {
        return o4.O(this.y) && !this.y.isInEditMode();
    }

    private void g(float f2, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.y.getDrawable();
        if (drawable != null && this.t != 0) {
            RectF rectF = this.B;
            RectF rectF2 = this.C;
            rectF.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i2 = this.t;
            rectF2.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) i2, (float) i2);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i3 = this.t;
            matrix.postScale(f2, f2, ((float) i3) / 2.0f, ((float) i3) / 2.0f);
        }
    }

    private void g0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT == 26) {
            objectAnimator.setEvaluator(new C0100d(this));
        }
    }

    private AnimatorSet h(m91 m91, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.y, View.ALPHA, new float[]{f2});
        m91.h("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.y, View.SCALE_X, new float[]{f3});
        m91.h("scale").a(ofFloat2);
        g0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.y, View.SCALE_Y, new float[]{f3});
        m91.h("scale").a(ofFloat3);
        g0(ofFloat3);
        arrayList.add(ofFloat3);
        g(f4, this.D);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.y, new k91(), new c(), new Matrix[]{new Matrix(this.D)});
        m91.h("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        g91.a(animatorSet, arrayList);
        return animatorSet;
    }

    private ValueAnimator i(l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(F);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(lVar);
        valueAnimator.addUpdateListener(lVar);
        valueAnimator.setFloatValues(new float[]{Utils.FLOAT_EPSILON, 1.0f});
        return valueAnimator;
    }

    private m91 l() {
        if (this.n == null) {
            this.n = m91.d(this.y.getContext(), R$animator.design_fab_hide_motion_spec);
        }
        m91 m91 = this.n;
        u3.c(m91);
        return m91;
    }

    private m91 m() {
        if (this.m == null) {
            this.m = m91.d(this.y.getContext(), R$animator.design_fab_show_motion_spec);
        }
        m91 m91 = this.m;
        u3.c(m91);
        return m91;
    }

    private ViewTreeObserver.OnPreDrawListener r() {
        if (this.E == null) {
            this.E = new e();
        }
        return this.E;
    }

    /* access modifiers changed from: package-private */
    public void A() {
        this.l.c();
    }

    /* access modifiers changed from: package-private */
    public void B() {
        ra1 ra1 = this.b;
        if (ra1 != null) {
            sa1.f(this.y, ra1);
        }
        if (K()) {
            this.y.getViewTreeObserver().addOnPreDrawListener(r());
        }
    }

    /* access modifiers changed from: package-private */
    public void C() {
    }

    /* access modifiers changed from: package-private */
    public void D() {
        ViewTreeObserver viewTreeObserver = this.y.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.E;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.E = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void E(int[] iArr) {
        this.l.d(iArr);
    }

    /* access modifiers changed from: package-private */
    public void F(float f2, float f3, float f4) {
        e0();
        f0(f2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.graphics.drawable.InsetDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.graphics.drawable.InsetDrawable} */
    /* JADX WARNING: type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void G(android.graphics.Rect r8) {
        /*
            r7 = this;
            android.graphics.drawable.Drawable r0 = r7.e
            java.lang.String r1 = "Didn't initialize content background"
            defpackage.u3.d(r0, r1)
            boolean r0 = r7.Y()
            if (r0 == 0) goto L_0x0020
            android.graphics.drawable.InsetDrawable r0 = new android.graphics.drawable.InsetDrawable
            android.graphics.drawable.Drawable r2 = r7.e
            int r3 = r8.left
            int r4 = r8.top
            int r5 = r8.right
            int r6 = r8.bottom
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            ja1 r8 = r7.z
            goto L_0x0024
        L_0x0020:
            ja1 r8 = r7.z
            android.graphics.drawable.Drawable r0 = r7.e
        L_0x0024:
            r8.c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.d.G(android.graphics.Rect):void");
    }

    /* access modifiers changed from: package-private */
    public void H() {
        float rotation = this.y.getRotation();
        if (this.r != rotation) {
            this.r = rotation;
            c0();
        }
    }

    /* access modifiers changed from: package-private */
    public void I() {
        ArrayList<i> arrayList = this.x;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void J() {
        ArrayList<i> arrayList = this.x;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean K() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public void L(ColorStateList colorStateList) {
        ra1 ra1 = this.b;
        if (ra1 != null) {
            ra1.setTintList(colorStateList);
        }
        c cVar = this.d;
        if (cVar != null) {
            cVar.c(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void M(PorterDuff.Mode mode) {
        ra1 ra1 = this.b;
        if (ra1 != null) {
            ra1.setTintMode(mode);
        }
    }

    /* access modifiers changed from: package-private */
    public final void N(float f2) {
        if (this.h != f2) {
            this.h = f2;
            F(f2, this.i, this.j);
        }
    }

    /* access modifiers changed from: package-private */
    public void O(boolean z2) {
        this.f = z2;
    }

    /* access modifiers changed from: package-private */
    public final void P(m91 m91) {
        this.q = m91;
    }

    /* access modifiers changed from: package-private */
    public final void Q(float f2) {
        if (this.i != f2) {
            this.i = f2;
            F(this.h, f2, this.j);
        }
    }

    /* access modifiers changed from: package-private */
    public final void R(int i2) {
        if (this.t != i2) {
            this.t = i2;
            d0();
        }
    }

    /* access modifiers changed from: package-private */
    public void S(int i2) {
        this.k = i2;
    }

    /* access modifiers changed from: package-private */
    public final void T(float f2) {
        if (this.j != f2) {
            this.j = f2;
            F(this.h, this.i, f2);
        }
    }

    /* access modifiers changed from: package-private */
    public void U(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, ha1.d(colorStateList));
        }
    }

    /* access modifiers changed from: package-private */
    public void V(boolean z2) {
        this.g = z2;
        e0();
    }

    /* access modifiers changed from: package-private */
    public final void W(wa1 wa1) {
        this.a = wa1;
        ra1 ra1 = this.b;
        if (ra1 != null) {
            ra1.setShapeAppearanceModel(wa1);
        }
        Drawable drawable = this.c;
        if (drawable instanceof za1) {
            ((za1) drawable).setShapeAppearanceModel(wa1);
        }
        c cVar = this.d;
        if (cVar != null) {
            cVar.f(wa1);
        }
    }

    /* access modifiers changed from: package-private */
    public final void X(m91 m91) {
        this.p = m91;
    }

    /* access modifiers changed from: package-private */
    public boolean Y() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean a0() {
        return !this.f || this.y.getSizeDimension() >= this.k;
    }

    /* access modifiers changed from: package-private */
    public void b0(j jVar, boolean z2) {
        if (!z()) {
            Animator animator = this.o;
            if (animator != null) {
                animator.cancel();
            }
            if (Z()) {
                if (this.y.getVisibility() != 0) {
                    this.y.setAlpha(Utils.FLOAT_EPSILON);
                    this.y.setScaleY(Utils.FLOAT_EPSILON);
                    this.y.setScaleX(Utils.FLOAT_EPSILON);
                    setImageMatrixScale(Utils.FLOAT_EPSILON);
                }
                m91 m91 = this.p;
                if (m91 == null) {
                    m91 = m();
                }
                AnimatorSet h2 = h(m91, 1.0f, 1.0f, 1.0f);
                h2.addListener(new b(z2, jVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.v;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        h2.addListener(it.next());
                    }
                }
                h2.start();
                return;
            }
            this.y.a(0, z2);
            this.y.setAlpha(1.0f);
            this.y.setScaleY(1.0f);
            this.y.setScaleX(1.0f);
            setImageMatrixScale(1.0f);
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c0() {
        int i2;
        FloatingActionButton floatingActionButton;
        if (Build.VERSION.SDK_INT == 19) {
            if (this.r % 90.0f != Utils.FLOAT_EPSILON) {
                i2 = 1;
                if (this.y.getLayerType() != 1) {
                    floatingActionButton = this.y;
                }
            } else if (this.y.getLayerType() != 0) {
                floatingActionButton = this.y;
                i2 = 0;
            }
            floatingActionButton.setLayerType(i2, (Paint) null);
        }
        ra1 ra1 = this.b;
        if (ra1 != null) {
            ra1.f0((int) this.r);
        }
    }

    public void d(Animator.AnimatorListener animatorListener) {
        if (this.w == null) {
            this.w = new ArrayList<>();
        }
        this.w.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    public final void d0() {
        setImageMatrixScale(this.s);
    }

    /* access modifiers changed from: package-private */
    public void e(Animator.AnimatorListener animatorListener) {
        if (this.v == null) {
            this.v = new ArrayList<>();
        }
        this.v.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    public final void e0() {
        Rect rect = this.A;
        s(rect);
        G(rect);
        this.z.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: package-private */
    public void f(i iVar) {
        if (this.x == null) {
            this.x = new ArrayList<>();
        }
        this.x.add(iVar);
    }

    /* access modifiers changed from: package-private */
    public void f0(float f2) {
        ra1 ra1 = this.b;
        if (ra1 != null) {
            ra1.X(f2);
        }
    }

    /* access modifiers changed from: package-private */
    public ra1 j() {
        wa1 wa1 = this.a;
        u3.c(wa1);
        return new ra1(wa1);
    }

    /* access modifiers changed from: package-private */
    public final Drawable k() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public float n() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public boolean o() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public final m91 p() {
        return this.q;
    }

    /* access modifiers changed from: package-private */
    public float q() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public void s(Rect rect) {
        int sizeDimension = this.f ? (this.k - this.y.getSizeDimension()) / 2 : 0;
        float n2 = this.g ? n() + this.j : Utils.FLOAT_EPSILON;
        int max = Math.max(sizeDimension, (int) Math.ceil((double) n2));
        int max2 = Math.max(sizeDimension, (int) Math.ceil((double) (n2 * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    /* access modifiers changed from: package-private */
    public final void setImageMatrixScale(float f2) {
        this.s = f2;
        Matrix matrix = this.D;
        g(f2, matrix);
        this.y.setImageMatrix(matrix);
    }

    /* access modifiers changed from: package-private */
    public float t() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public final wa1 u() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public final m91 v() {
        return this.p;
    }

    /* access modifiers changed from: package-private */
    public void w(j jVar, boolean z2) {
        if (!y()) {
            Animator animator = this.o;
            if (animator != null) {
                animator.cancel();
            }
            if (Z()) {
                m91 m91 = this.q;
                if (m91 == null) {
                    m91 = l();
                }
                AnimatorSet h2 = h(m91, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
                h2.addListener(new a(z2, jVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.w;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        h2.addListener(it.next());
                    }
                }
                h2.start();
                return;
            }
            this.y.a(z2 ? 8 : 4, z2);
            if (jVar != null) {
                jVar.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i2) {
        ra1 j2 = j();
        this.b = j2;
        j2.setTintList(colorStateList);
        if (mode != null) {
            this.b.setTintMode(mode);
        }
        this.b.e0(-12303292);
        this.b.N(this.y.getContext());
        ga1 ga1 = new ga1(this.b.D());
        ga1.setTintList(ha1.d(colorStateList2));
        this.c = ga1;
        ra1 ra1 = this.b;
        u3.c(ra1);
        this.e = new LayerDrawable(new Drawable[]{ra1, ga1});
    }

    /* access modifiers changed from: package-private */
    public boolean y() {
        return this.y.getVisibility() == 0 ? this.u == 1 : this.u != 2;
    }

    /* access modifiers changed from: package-private */
    public boolean z() {
        return this.y.getVisibility() != 0 ? this.u == 2 : this.u != 1;
    }
}
