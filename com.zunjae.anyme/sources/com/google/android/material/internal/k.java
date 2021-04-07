package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.Transition;
import androidx.transition.x;
import java.util.Map;

public class k extends Transition {

    class a implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ TextView e;

        a(k kVar, TextView textView) {
            this.e = textView;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.e.setScaleX(floatValue);
            this.e.setScaleY(floatValue);
        }
    }

    private void x0(x xVar) {
        View view = xVar.b;
        if (view instanceof TextView) {
            xVar.a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    public void j(x xVar) {
        x0(xVar);
    }

    public void p(x xVar) {
        x0(xVar);
    }

    public Animator t(ViewGroup viewGroup, x xVar, x xVar2) {
        if (xVar == null || xVar2 == null || !(xVar.b instanceof TextView)) {
            return null;
        }
        View view = xVar2.b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map<String, Object> map = xVar.a;
        Map<String, Object> map2 = xVar2.a;
        float f = 1.0f;
        float floatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        if (map2.get("android:textscale:scale") != null) {
            f = ((Float) map2.get("android:textscale:scale")).floatValue();
        }
        if (floatValue == f) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{floatValue, f});
        ofFloat.addUpdateListener(new a(this, textView));
        return ofFloat;
    }
}
