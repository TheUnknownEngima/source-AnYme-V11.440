package androidx.core.app;

import android.app.ActivityManager;
import android.os.Build;

public final class b {
    public static boolean a(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return false;
    }
}
