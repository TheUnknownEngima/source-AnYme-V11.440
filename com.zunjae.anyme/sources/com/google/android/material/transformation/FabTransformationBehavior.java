package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.R$id;
import com.google.android.material.circularreveal.c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    private final Rect c = new Rect();
    private final RectF d = new RectF();
    private final RectF e = new RectF();
    private final int[] f = new int[2];
    private float g;
    private float h;

    class a extends AnimatorListenerAdapter {
        final /* synthetic */ boolean e;
        final /* synthetic */ View f;
        final /* synthetic */ View g;

        a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.e = z;
            this.f = view;
            this.g = view2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.e) {
                this.f.setVisibility(4);
                this.g.setAlpha(1.0f);
                this.g.setVisibility(0);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.e) {
                this.f.setVisibility(0);
                this.g.setAlpha(Utils.FLOAT_EPSILON);
                this.g.setVisibility(4);
            }
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ View e;

        b(FabTransformationBehavior fabTransformationBehavior, View view) {
            this.e = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.e.invalidate();
        }
    }

    class c extends AnimatorListenerAdapter {
        final /* synthetic */ com.google.android.material.circularreveal.c e;
        final /* synthetic */ Drawable f;

        c(FabTransformationBehavior fabTransformationBehavior, com.google.android.material.circularreveal.c cVar, Drawable drawable) {
            this.e = cVar;
            this.f = drawable;
        }

        public void onAnimationEnd(Animator animator) {
            this.e.setCircularRevealOverlayDrawable((Drawable) null);
        }

        public void onAnimationStart(Animator animator) {
            this.e.setCircularRevealOverlayDrawable(this.f);
        }
    }

    class d extends AnimatorListenerAdapter {
        final /* synthetic */ com.google.android.material.circularreveal.c e;

        d(FabTransformationBehavior fabTransformationBehavior, com.google.android.material.circularreveal.c cVar) {
            this.e = cVar;
        }

        public void onAnimationEnd(Animator animator) {
            c.e revealInfo = this.e.getRevealInfo();
            revealInfo.c = Float.MAX_VALUE;
            this.e.setRevealInfo(revealInfo);
        }
    }

    protected static class e {
        public m91 a;
        public o91 b;

        protected e() {
        }
    }

    public FabTransformationBehavior() {
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private ViewGroup K(View view) {
        View findViewById = view.findViewById(R$id.mtrl_child_content_container);
        return findViewById != null ? f0(findViewById) : ((view instanceof TransformationChildLayout) || (view instanceof TransformationChildCard)) ? f0(((ViewGroup) view).getChildAt(0)) : f0(view);
    }

    private void L(View view, e eVar, n91 n91, n91 n912, float f2, float f3, float f4, float f5, RectF rectF) {
        float S = S(eVar, n91, f2, f4);
        float S2 = S(eVar, n912, f3, f5);
        Rect rect = this.c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.d;
        rectF2.set(rect);
        RectF rectF3 = this.e;
        T(view, rectF3);
        rectF3.offset(S, S2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void M(View view, RectF rectF) {
        T(view, rectF);
        rectF.offset(this.g, this.h);
    }

    private Pair<n91, n91> N(float f2, float f3, boolean z, e eVar) {
        String str;
        m91 m91;
        n91 n91;
        int i;
        if (f2 == Utils.FLOAT_EPSILON || f3 == Utils.FLOAT_EPSILON) {
            n91 = eVar.a.h("translationXLinear");
            m91 = eVar.a;
            str = "translationYLinear";
        } else if ((!z || f3 >= Utils.FLOAT_EPSILON) && (z || i <= 0)) {
            n91 = eVar.a.h("translationXCurveDownwards");
            m91 = eVar.a;
            str = "translationYCurveDownwards";
        } else {
            n91 = eVar.a.h("translationXCurveUpwards");
            m91 = eVar.a;
            str = "translationYCurveUpwards";
        }
        return new Pair<>(n91, m91.h(str));
    }

    private float O(View view, View view2, o91 o91) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        M(view, rectF);
        T(view2, rectF2);
        rectF2.offset(-Q(view, view2, o91), Utils.FLOAT_EPSILON);
        return rectF.centerX() - rectF2.left;
    }

    private float P(View view, View view2, o91 o91) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        M(view, rectF);
        T(view2, rectF2);
        rectF2.offset(Utils.FLOAT_EPSILON, -R(view, view2, o91));
        return rectF.centerY() - rectF2.top;
    }

    private float Q(View view, View view2, o91 o91) {
        float f2;
        float f3;
        float f4;
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        M(view, rectF);
        T(view2, rectF2);
        int i = o91.a & 7;
        if (i == 1) {
            f4 = rectF2.centerX();
            f3 = rectF.centerX();
        } else if (i == 3) {
            f4 = rectF2.left;
            f3 = rectF.left;
        } else if (i != 5) {
            f2 = Utils.FLOAT_EPSILON;
            return f2 + o91.b;
        } else {
            f4 = rectF2.right;
            f3 = rectF.right;
        }
        f2 = f4 - f3;
        return f2 + o91.b;
    }

    private float R(View view, View view2, o91 o91) {
        float f2;
        float f3;
        float f4;
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        M(view, rectF);
        T(view2, rectF2);
        int i = o91.a & 112;
        if (i == 16) {
            f4 = rectF2.centerY();
            f3 = rectF.centerY();
        } else if (i == 48) {
            f4 = rectF2.top;
            f3 = rectF.top;
        } else if (i != 80) {
            f2 = Utils.FLOAT_EPSILON;
            return f2 + o91.c;
        } else {
            f4 = rectF2.bottom;
            f3 = rectF.bottom;
        }
        f2 = f4 - f3;
        return f2 + o91.c;
    }

    private float S(e eVar, n91 n91, float f2, float f3) {
        long c2 = n91.c();
        long d2 = n91.d();
        n91 h2 = eVar.a.h("expansion");
        return f91.a(f2, f3, n91.e().getInterpolation(((float) (((h2.c() + h2.d()) + 17) - c2)) / ((float) d2)));
    }

    private void T(View view, RectF rectF) {
        rectF.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    private void U(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup K;
        ObjectAnimator objectAnimator;
        if (view2 instanceof ViewGroup) {
            if ((!(view2 instanceof com.google.android.material.circularreveal.c) || com.google.android.material.circularreveal.b.j != 0) && (K = K(view2)) != null) {
                if (z) {
                    if (!z2) {
                        i91.a.set(K, Float.valueOf(Utils.FLOAT_EPSILON));
                    }
                    objectAnimator = ObjectAnimator.ofFloat(K, i91.a, new float[]{1.0f});
                } else {
                    objectAnimator = ObjectAnimator.ofFloat(K, i91.a, new float[]{0.0f});
                }
                eVar.a.h("contentFade").a(objectAnimator);
                list.add(objectAnimator);
            }
        }
    }

    private void V(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof com.google.android.material.circularreveal.c) {
            com.google.android.material.circularreveal.c cVar = (com.google.android.material.circularreveal.c) view2;
            int d0 = d0(view);
            int i = 16777215 & d0;
            if (z) {
                if (!z2) {
                    cVar.setCircularRevealScrimColor(d0);
                }
                objectAnimator = ObjectAnimator.ofInt(cVar, c.d.a, new int[]{i});
            } else {
                objectAnimator = ObjectAnimator.ofInt(cVar, c.d.a, new int[]{d0});
            }
            objectAnimator.setEvaluator(h91.b());
            eVar.a.h("color").a(objectAnimator);
            list.add(objectAnimator);
        }
    }

    private void W(View view, View view2, boolean z, e eVar, List<Animator> list) {
        float Q = Q(view, view2, eVar.b);
        float R = R(view, view2, eVar.b);
        Pair<n91, n91> N = N(Q, R, z, eVar);
        n91 n91 = (n91) N.first;
        n91 n912 = (n91) N.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            Q = this.g;
        }
        fArr[0] = Q;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            R = this.h;
        }
        fArr2[0] = R;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        n91.a(ofFloat);
        n912.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    @TargetApi(21)
    private void X(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float t = o4.t(view2) - o4.t(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-t);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{-t});
        }
        eVar.a.h("elevation").a(objectAnimator);
        list.add(objectAnimator);
    }

    private void Y(View view, View view2, boolean z, boolean z2, e eVar, float f2, float f3, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        View view3 = view;
        View view4 = view2;
        e eVar2 = eVar;
        if (view4 instanceof com.google.android.material.circularreveal.c) {
            com.google.android.material.circularreveal.c cVar = (com.google.android.material.circularreveal.c) view4;
            float O = O(view3, view4, eVar2.b);
            float P = P(view3, view4, eVar2.b);
            ((FloatingActionButton) view3).i(this.c);
            float width = ((float) this.c.width()) / 2.0f;
            n91 h2 = eVar2.a.h("expansion");
            if (z) {
                if (!z2) {
                    cVar.setRevealInfo(new c.e(O, P, width));
                }
                if (z2) {
                    width = cVar.getRevealInfo().c;
                }
                animator = com.google.android.material.circularreveal.a.a(cVar, O, P, z91.b(O, P, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, f2, f3));
                animator.addListener(new d(this, cVar));
                b0(view2, h2.c(), (int) O, (int) P, width, list);
            } else {
                float f4 = cVar.getRevealInfo().c;
                Animator a2 = com.google.android.material.circularreveal.a.a(cVar, O, P, width);
                int i = (int) O;
                int i2 = (int) P;
                View view5 = view2;
                b0(view5, h2.c(), i, i2, f4, list);
                long c2 = h2.c();
                long d2 = h2.d();
                long i3 = eVar2.a.i();
                a0(view5, c2, d2, i3, i, i2, width, list);
                animator = a2;
            }
            h2.a(animator);
            list.add(animator);
            list2.add(com.google.android.material.circularreveal.a.b(cVar));
        }
    }

    private void Z(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if ((view2 instanceof com.google.android.material.circularreveal.c) && (view instanceof ImageView)) {
            com.google.android.material.circularreveal.c cVar = (com.google.android.material.circularreveal.c) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, j91.b, new int[]{0});
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, j91.b, new int[]{255});
                }
                objectAnimator.addUpdateListener(new b(this, view2));
                eVar.a.h("iconFade").a(objectAnimator);
                list.add(objectAnimator);
                list2.add(new c(this, cVar, drawable));
            }
        }
    }

    private void a0(View view, long j, long j2, long j3, int i, int i2, float f2, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21) {
            long j4 = j + j2;
            if (j4 < j3) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f2, f2);
                createCircularReveal.setStartDelay(j4);
                createCircularReveal.setDuration(j3 - j4);
                list.add(createCircularReveal);
            }
        }
    }

    private void b0(View view, long j, int i, int i2, float f2, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21 && j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f2, f2);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    private void c0(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        View view3 = view;
        View view4 = view2;
        boolean z3 = z;
        e eVar2 = eVar;
        List<Animator> list3 = list;
        float Q = Q(view3, view4, eVar2.b);
        float R = R(view3, view4, eVar2.b);
        Pair<n91, n91> N = N(Q, R, z3, eVar2);
        n91 n91 = (n91) N.first;
        n91 n912 = (n91) N.second;
        if (z3) {
            if (!z2) {
                view4.setTranslationX(-Q);
                view4.setTranslationY(-R);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{0.0f});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{0.0f});
            L(view2, eVar, n91, n912, -Q, -R, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, rectF);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{-Q});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{-R});
        }
        n91.a(objectAnimator2);
        n912.a(objectAnimator);
        list3.add(objectAnimator2);
        list3.add(objectAnimator);
    }

    private int d0(View view) {
        ColorStateList p = o4.p(view);
        if (p != null) {
            return p.getColorForState(view.getDrawableState(), p.getDefaultColor());
        }
        return 0;
    }

    private ViewGroup f0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public AnimatorSet J(View view, View view2, boolean z, boolean z2) {
        boolean z3 = z;
        e e0 = e0(view2.getContext(), z3);
        if (z3) {
            this.g = view.getTranslationX();
            this.h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            X(view, view2, z, z2, e0, arrayList, arrayList2);
        }
        RectF rectF = this.d;
        View view3 = view;
        View view4 = view2;
        boolean z4 = z;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        c0(view3, view4, z4, z2, e0, arrayList3, arrayList4, rectF);
        float width = rectF.width();
        float height = rectF.height();
        W(view3, view4, z4, e0, arrayList);
        boolean z5 = z2;
        e eVar = e0;
        Z(view3, view4, z4, z5, eVar, arrayList3, arrayList4);
        Y(view3, view4, z4, z5, eVar, width, height, arrayList, arrayList2);
        ArrayList arrayList5 = arrayList;
        ArrayList arrayList6 = arrayList2;
        V(view3, view4, z4, z5, eVar, arrayList5, arrayList6);
        U(view3, view4, z4, z5, eVar, arrayList5, arrayList6);
        AnimatorSet animatorSet = new AnimatorSet();
        g91.a(animatorSet, arrayList);
        animatorSet.addListener(new a(this, z3, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i));
        }
        return animatorSet;
    }

    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
        }
    }

    /* access modifiers changed from: protected */
    public abstract e e0(Context context, boolean z);

    public void g(CoordinatorLayout.e eVar) {
        if (eVar.h == 0) {
            eVar.h = 80;
        }
    }
}
