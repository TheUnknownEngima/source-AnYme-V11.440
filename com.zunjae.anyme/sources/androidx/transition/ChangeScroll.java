package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class ChangeScroll extends Transition {
    private static final String[] N = {"android:changeScroll:x", "android:changeScroll:y"};

    public ChangeScroll() {
    }

    public ChangeScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void x0(x xVar) {
        xVar.a.put("android:changeScroll:x", Integer.valueOf(xVar.b.getScrollX()));
        xVar.a.put("android:changeScroll:y", Integer.valueOf(xVar.b.getScrollY()));
    }

    public String[] R() {
        return N;
    }

    public void j(x xVar) {
        x0(xVar);
    }

    public void p(x xVar) {
        x0(xVar);
    }

    public Animator t(ViewGroup viewGroup, x xVar, x xVar2) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = null;
        if (xVar == null || xVar2 == null) {
            return null;
        }
        View view = xVar2.b;
        int intValue = ((Integer) xVar.a.get("android:changeScroll:x")).intValue();
        int intValue2 = ((Integer) xVar2.a.get("android:changeScroll:x")).intValue();
        int intValue3 = ((Integer) xVar.a.get("android:changeScroll:y")).intValue();
        int intValue4 = ((Integer) xVar2.a.get("android:changeScroll:y")).intValue();
        if (intValue != intValue2) {
            view.setScrollX(intValue);
            objectAnimator = ObjectAnimator.ofInt(view, "scrollX", new int[]{intValue, intValue2});
        } else {
            objectAnimator = null;
        }
        if (intValue3 != intValue4) {
            view.setScrollY(intValue3);
            objectAnimator2 = ObjectAnimator.ofInt(view, "scrollY", new int[]{intValue3, intValue4});
        }
        return w.c(objectAnimator, objectAnimator2);
    }
}
