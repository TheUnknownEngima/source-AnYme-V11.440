package androidx.legacy.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;

@Deprecated
public abstract class WakefulBroadcastReceiver extends BroadcastReceiver {
    private static final SparseArray<PowerManager.WakeLock> e = new SparseArray<>();
    private static int f = 1;

    public static boolean b(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        synchronized (e) {
            PowerManager.WakeLock wakeLock = e.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                e.remove(intExtra);
                return true;
            }
            "No active wake lock id #" + intExtra;
            return true;
        }
    }

    public static ComponentName c(Context context, Intent intent) {
        synchronized (e) {
            int i = f;
            int i2 = f + 1;
            f = i2;
            if (i2 <= 0) {
                f = 1;
            }
            intent.putExtra("androidx.contentpager.content.wakelockid", i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            e.put(i, newWakeLock);
            return startService;
        }
    }
}
