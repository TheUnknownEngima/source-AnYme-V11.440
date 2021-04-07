package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: om  reason: default package */
/* compiled from: lambda */
public final /* synthetic */ class om implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View e;

    public /* synthetic */ om(View view) {
        this.e = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        tm.i(this.e, valueAnimator);
    }
}
