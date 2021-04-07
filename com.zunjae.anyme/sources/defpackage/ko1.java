package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;

/* renamed from: ko1  reason: default package */
public class ko1 {
    private hn1 a;

    public ko1(hn1 hn1) {
        this.a = hn1;
    }

    public StateListDrawable a(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable gradientDrawable = (GradientDrawable) f.d(context, this.a.d());
        GradientDrawable gradientDrawable2 = (GradientDrawable) gradientDrawable.getConstantState().newDrawable().mutate();
        po1.d(this.a.a(), context, gradientDrawable);
        po1.d(this.a.b() == null ? this.a.a() : this.a.b(), context, gradientDrawable2);
        if (this.a.c() != null) {
            gradientDrawable.setCornerRadius((float) this.a.c().a(context));
            gradientDrawable2.setCornerRadius((float) this.a.c().a(context));
        }
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable2);
        stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable);
        return stateListDrawable;
    }
}
