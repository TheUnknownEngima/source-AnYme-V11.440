package com.google.android.exoplayer2.ui;

import android.animation.ValueAnimator;

/* compiled from: lambda */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ DefaultTimeBar e;

    public /* synthetic */ c(DefaultTimeBar defaultTimeBar) {
        this.e = defaultTimeBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.e.h(valueAnimator);
    }
}
