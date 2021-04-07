package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.github.mikephil.charting.utils.Utils;

public class Fade extends Visibility {

    class a extends t {
        final /* synthetic */ View e;

        a(Fade fade, View view) {
            this.e = view;
        }

        public void c(Transition transition) {
            i0.h(this.e, 1.0f);
            i0.a(this.e);
            transition.h0(this);
        }
    }

    private static class b extends AnimatorListenerAdapter {
        private final View e;
        private boolean f = false;

        b(View view) {
            this.e = view;
        }

        public void onAnimationEnd(Animator animator) {
            i0.h(this.e, 1.0f);
            if (this.f) {
                this.e.setLayerType(0, (Paint) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (o4.K(this.e) && this.e.getLayerType() == 0) {
                this.f = true;
                this.e.setLayerType(2, (Paint) null);
            }
        }
    }

    public Fade() {
    }

    public Fade(int i) {
        F0(i);
    }

    @SuppressLint({"RestrictedApi"})
    public Fade(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.d);
        F0(i2.k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, y0()));
        obtainStyledAttributes.recycle();
    }

    private Animator G0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        i0.h(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, i0.b, new float[]{f2});
        ofFloat.addListener(new b(view));
        b(new a(this, view));
        return ofFloat;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = (java.lang.Float) r1.a.get("android:fade:transitionAlpha");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float H0(androidx.transition.x r1, float r2) {
        /*
            if (r1 == 0) goto L_0x0012
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.a
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x0012
            float r2 = r1.floatValue()
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Fade.H0(androidx.transition.x, float):float");
    }

    public Animator A0(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        float f = Utils.FLOAT_EPSILON;
        float H0 = H0(xVar, Utils.FLOAT_EPSILON);
        if (H0 != 1.0f) {
            f = H0;
        }
        return G0(view, f, 1.0f);
    }

    public Animator D0(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        i0.e(view);
        return G0(view, H0(xVar, 1.0f), Utils.FLOAT_EPSILON);
    }

    public void p(x xVar) {
        super.p(xVar);
        xVar.a.put("android:fade:transitionAlpha", Float.valueOf(i0.c(xVar.b)));
    }
}
