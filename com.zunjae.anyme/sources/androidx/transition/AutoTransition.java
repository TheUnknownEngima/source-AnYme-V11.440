package androidx.transition;

import android.content.Context;
import android.util.AttributeSet;

public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        L0();
    }

    public AutoTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        L0();
    }

    private void L0() {
        I0(1);
        z0(new Fade(2));
        z0(new ChangeBounds());
        z0(new Fade(1));
    }
}
