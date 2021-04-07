package defpackage;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import defpackage.wo1;

/* renamed from: mp1  reason: default package */
public class mp1 extends lp1 {
    public mp1(wo1.a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    public PropertyValuesHolder n(boolean z) {
        int i;
        String str;
        int i2;
        if (z) {
            i = this.g;
            i2 = (int) (((float) i) * this.h);
            str = "ANIMATION_SCALE_REVERSE";
        } else {
            i2 = this.g;
            i = (int) (((float) i2) * this.h);
            str = "ANIMATION_SCALE";
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i2, i});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }
}
