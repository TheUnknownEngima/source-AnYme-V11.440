package defpackage;

import android.graphics.Path;
import android.os.Build;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: f5  reason: default package */
public final class f5 {
    public static Interpolator a(Path path) {
        return Build.VERSION.SDK_INT >= 21 ? new PathInterpolator(path) : new e5(path);
    }
}
