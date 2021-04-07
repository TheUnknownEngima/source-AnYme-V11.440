package defpackage;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.SystemClock;

/* renamed from: fm  reason: default package */
public final class fm {
    private static final double a;

    static {
        double d = 1.0d;
        if (Build.VERSION.SDK_INT >= 17) {
            d = 1.0d / Math.pow(10.0d, 6.0d);
        }
        a = d;
    }

    public static double a(long j) {
        return ((double) (b() - j)) * a;
    }

    @TargetApi(17)
    public static long b() {
        return Build.VERSION.SDK_INT >= 17 ? SystemClock.elapsedRealtimeNanos() : SystemClock.uptimeMillis();
    }
}
