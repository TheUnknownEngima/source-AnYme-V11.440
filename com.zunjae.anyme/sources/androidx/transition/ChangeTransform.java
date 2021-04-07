package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.github.mikephil.charting.utils.Utils;
import org.xmlpull.v1.XmlPullParser;

public class ChangeTransform extends Transition {
    private static final String[] Q = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};
    private static final Property<e, float[]> R = new a(float[].class, "nonTranslations");
    private static final Property<e, PointF> S = new b(PointF.class, "translations");
    private static final boolean T = (Build.VERSION.SDK_INT >= 21);
    boolean N = true;
    private boolean O = true;
    private Matrix P = new Matrix();

    static class a extends Property<e, float[]> {
        a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public float[] get(e eVar) {
            return null;
        }

        /* renamed from: b */
        public void set(e eVar, float[] fArr) {
            eVar.d(fArr);
        }
    }

    static class b extends Property<e, PointF> {
        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(e eVar) {
            return null;
        }

        /* renamed from: b */
        public void set(e eVar, PointF pointF) {
            eVar.c(pointF);
        }
    }

    class c extends AnimatorListenerAdapter {
        private boolean e;
        private Matrix f = new Matrix();
        final /* synthetic */ boolean g;
        final /* synthetic */ Matrix h;
        final /* synthetic */ View i;
        final /* synthetic */ f j;
        final /* synthetic */ e k;

        c(boolean z, Matrix matrix, View view, f fVar, e eVar) {
            this.g = z;
            this.h = matrix;
            this.i = view;
            this.j = fVar;
            this.k = eVar;
        }

        private void a(Matrix matrix) {
            this.f.set(matrix);
            this.i.setTag(R$id.transition_transform, this.f);
            this.j.a(this.i);
        }

        public void onAnimationCancel(Animator animator) {
            this.e = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.e) {
                if (!this.g || !ChangeTransform.this.N) {
                    this.i.setTag(R$id.transition_transform, (Object) null);
                    this.i.setTag(R$id.parent_matrix, (Object) null);
                } else {
                    a(this.h);
                }
            }
            i0.f(this.i, (Matrix) null);
            this.j.a(this.i);
        }

        public void onAnimationPause(Animator animator) {
            a(this.k.a());
        }

        public void onAnimationResume(Animator animator) {
            ChangeTransform.C0(this.i);
        }
    }

    private static class d extends t {
        private View e;
        private f f;

        d(View view, f fVar) {
            this.e = view;
            this.f = fVar;
        }

        public void b(Transition transition) {
            this.f.setVisibility(4);
        }

        public void c(Transition transition) {
            transition.h0(this);
            j.b(this.e);
            this.e.setTag(R$id.transition_transform, (Object) null);
            this.e.setTag(R$id.parent_matrix, (Object) null);
        }

        public void e(Transition transition) {
            this.f.setVisibility(0);
        }
    }

    private static class e {
        private final Matrix a = new Matrix();
        private final View b;
        private final float[] c;
        private float d;
        private float e;

        e(View view, float[] fArr) {
            this.b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.c = fArr2;
            this.d = fArr2[2];
            this.e = fArr2[5];
            b();
        }

        private void b() {
            float[] fArr = this.c;
            fArr[2] = this.d;
            fArr[5] = this.e;
            this.a.setValues(fArr);
            i0.f(this.b, this.a);
        }

        /* access modifiers changed from: package-private */
        public Matrix a() {
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public void c(PointF pointF) {
            this.d = pointF.x;
            this.e = pointF.y;
            b();
        }

        /* access modifiers changed from: package-private */
        public void d(float[] fArr) {
            System.arraycopy(fArr, 0, this.c, 0, fArr.length);
            b();
        }
    }

    private static class f {
        final float a;
        final float b;
        final float c;
        final float d;
        final float e;
        final float f;
        final float g;
        final float h;

        f(View view) {
            this.a = view.getTranslationX();
            this.b = view.getTranslationY();
            this.c = o4.G(view);
            this.d = view.getScaleX();
            this.e = view.getScaleY();
            this.f = view.getRotationX();
            this.g = view.getRotationY();
            this.h = view.getRotation();
        }

        public void a(View view) {
            ChangeTransform.E0(view, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return fVar.a == this.a && fVar.b == this.b && fVar.c == this.c && fVar.d == this.d && fVar.e == this.e && fVar.f == this.f && fVar.g == this.g && fVar.h == this.h;
        }

        public int hashCode() {
            float f2 = this.a;
            int i = 0;
            int floatToIntBits = (f2 != Utils.FLOAT_EPSILON ? Float.floatToIntBits(f2) : 0) * 31;
            float f3 = this.b;
            int floatToIntBits2 = (floatToIntBits + (f3 != Utils.FLOAT_EPSILON ? Float.floatToIntBits(f3) : 0)) * 31;
            float f4 = this.c;
            int floatToIntBits3 = (floatToIntBits2 + (f4 != Utils.FLOAT_EPSILON ? Float.floatToIntBits(f4) : 0)) * 31;
            float f5 = this.d;
            int floatToIntBits4 = (floatToIntBits3 + (f5 != Utils.FLOAT_EPSILON ? Float.floatToIntBits(f5) : 0)) * 31;
            float f6 = this.e;
            int floatToIntBits5 = (floatToIntBits4 + (f6 != Utils.FLOAT_EPSILON ? Float.floatToIntBits(f6) : 0)) * 31;
            float f7 = this.f;
            int floatToIntBits6 = (floatToIntBits5 + (f7 != Utils.FLOAT_EPSILON ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.g;
            int floatToIntBits7 = (floatToIntBits6 + (f8 != Utils.FLOAT_EPSILON ? Float.floatToIntBits(f8) : 0)) * 31;
            float f9 = this.h;
            if (f9 != Utils.FLOAT_EPSILON) {
                i = Float.floatToIntBits(f9);
            }
            return floatToIntBits7 + i;
        }
    }

    public ChangeTransform() {
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.e);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.N = i2.e(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.O = i2.e(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r5 == r4.b) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r4 == r5) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A0(android.view.ViewGroup r4, android.view.ViewGroup r5) {
        /*
            r3 = this;
            boolean r0 = r3.V(r4)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001a
            boolean r0 = r3.V(r5)
            if (r0 != 0) goto L_0x000f
            goto L_0x001a
        L_0x000f:
            androidx.transition.x r4 = r3.B(r4, r1)
            if (r4 == 0) goto L_0x001f
            android.view.View r4 = r4.b
            if (r5 != r4) goto L_0x001d
            goto L_0x001e
        L_0x001a:
            if (r4 != r5) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            r2 = r1
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeTransform.A0(android.view.ViewGroup, android.view.ViewGroup):boolean");
    }

    static void C0(View view) {
        E0(view, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 1.0f, 1.0f, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
    }

    private void D0(x xVar, x xVar2) {
        Matrix matrix = (Matrix) xVar2.a.get("android:changeTransform:parentMatrix");
        xVar2.b.setTag(R$id.parent_matrix, matrix);
        Matrix matrix2 = this.P;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) xVar.a.get("android:changeTransform:matrix");
        if (matrix3 == null) {
            matrix3 = new Matrix();
            xVar.a.put("android:changeTransform:matrix", matrix3);
        }
        matrix3.postConcat((Matrix) xVar.a.get("android:changeTransform:parentMatrix"));
        matrix3.postConcat(matrix2);
    }

    static void E0(View view, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        view.setTranslationX(f2);
        view.setTranslationY(f3);
        o4.A0(view, f4);
        view.setScaleX(f5);
        view.setScaleY(f6);
        view.setRotationX(f7);
        view.setRotationY(f8);
        view.setRotation(f9);
    }

    private void x0(x xVar) {
        View view = xVar.b;
        if (view.getVisibility() != 8) {
            xVar.a.put("android:changeTransform:parent", view.getParent());
            xVar.a.put("android:changeTransform:transforms", new f(view));
            Matrix matrix = view.getMatrix();
            xVar.a.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
            if (this.O) {
                Matrix matrix2 = new Matrix();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                i0.j(viewGroup, matrix2);
                matrix2.preTranslate((float) (-viewGroup.getScrollX()), (float) (-viewGroup.getScrollY()));
                xVar.a.put("android:changeTransform:parentMatrix", matrix2);
                xVar.a.put("android:changeTransform:intermediateMatrix", view.getTag(R$id.transition_transform));
                xVar.a.put("android:changeTransform:intermediateParentMatrix", view.getTag(R$id.parent_matrix));
            }
        }
    }

    private void y0(ViewGroup viewGroup, x xVar, x xVar2) {
        View view = xVar2.b;
        Matrix matrix = new Matrix((Matrix) xVar2.a.get("android:changeTransform:parentMatrix"));
        i0.k(viewGroup, matrix);
        f a2 = j.a(view, viewGroup, matrix);
        if (a2 != null) {
            a2.a((ViewGroup) xVar.a.get("android:changeTransform:parent"), xVar.b);
            Transition transition = this;
            while (true) {
                Transition transition2 = transition.v;
                if (transition2 == null) {
                    break;
                }
                transition = transition2;
            }
            transition.b(new d(view, a2));
            if (T) {
                View view2 = xVar.b;
                if (view2 != xVar2.b) {
                    i0.h(view2, Utils.FLOAT_EPSILON);
                }
                i0.h(view, 1.0f);
            }
        }
    }

    private ObjectAnimator z0(x xVar, x xVar2, boolean z) {
        Matrix matrix = (Matrix) xVar.a.get("android:changeTransform:matrix");
        Matrix matrix2 = (Matrix) xVar2.a.get("android:changeTransform:matrix");
        if (matrix == null) {
            matrix = l.a;
        }
        if (matrix2 == null) {
            matrix2 = l.a;
        }
        Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        View view = xVar2.b;
        C0(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        e eVar = new e(view, fArr);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(eVar, new PropertyValuesHolder[]{PropertyValuesHolder.ofObject(R, new d(new float[9]), new float[][]{fArr, fArr2}), o.a(S, D().a(fArr[2], fArr[5], fArr2[2], fArr2[5]))});
        c cVar = new c(z, matrix3, view, (f) xVar2.a.get("android:changeTransform:transforms"), eVar);
        ofPropertyValuesHolder.addListener(cVar);
        a.a(ofPropertyValuesHolder, cVar);
        return ofPropertyValuesHolder;
    }

    public String[] R() {
        return Q;
    }

    public void j(x xVar) {
        x0(xVar);
    }

    public void p(x xVar) {
        x0(xVar);
        if (!T) {
            ((ViewGroup) xVar.b.getParent()).startViewTransition(xVar.b);
        }
    }

    public Animator t(ViewGroup viewGroup, x xVar, x xVar2) {
        if (xVar == null || xVar2 == null || !xVar.a.containsKey("android:changeTransform:parent") || !xVar2.a.containsKey("android:changeTransform:parent")) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) xVar.a.get("android:changeTransform:parent");
        boolean z = this.O && !A0(viewGroup2, (ViewGroup) xVar2.a.get("android:changeTransform:parent"));
        Matrix matrix = (Matrix) xVar.a.get("android:changeTransform:intermediateMatrix");
        if (matrix != null) {
            xVar.a.put("android:changeTransform:matrix", matrix);
        }
        Matrix matrix2 = (Matrix) xVar.a.get("android:changeTransform:intermediateParentMatrix");
        if (matrix2 != null) {
            xVar.a.put("android:changeTransform:parentMatrix", matrix2);
        }
        if (z) {
            D0(xVar, xVar2);
        }
        ObjectAnimator z0 = z0(xVar, xVar2, z);
        if (z && z0 != null && this.N) {
            y0(viewGroup, xVar, xVar2);
        } else if (!T) {
            viewGroup2.endViewTransition(xVar.b);
        }
        return z0;
    }
}
