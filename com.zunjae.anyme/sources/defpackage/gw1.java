package defpackage;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;

/* renamed from: gw1  reason: default package */
public final class gw1 {
    public static final gw1 a = new gw1();

    private gw1() {
    }

    public final Animation a(double d, double d2, int i) {
        AlphaAnimation alphaAnimation = new AlphaAnimation((float) d, (float) d2);
        alphaAnimation.setDuration((long) i);
        alphaAnimation.setInterpolator(new LinearInterpolator());
        alphaAnimation.setRepeatCount(-1);
        alphaAnimation.setRepeatMode(2);
        return alphaAnimation;
    }
}
