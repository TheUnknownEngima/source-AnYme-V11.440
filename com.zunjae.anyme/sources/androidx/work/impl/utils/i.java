package androidx.work.impl.utils;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.h;
import java.util.HashMap;
import java.util.WeakHashMap;

public class i {
    private static final String a = h.f("WakeLocks");
    private static final WeakHashMap<PowerManager.WakeLock, String> b = new WeakHashMap<>();

    public static void a() {
        HashMap hashMap = new HashMap();
        synchronized (b) {
            hashMap.putAll(b);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                h.c().h(a, String.format("WakeLock held for %s", new Object[]{hashMap.get(wakeLock)}), new Throwable[0]);
            }
        }
    }

    public static PowerManager.WakeLock b(Context context, String str) {
        String str2 = "WorkManager: " + str;
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, str2);
        synchronized (b) {
            b.put(newWakeLock, str2);
        }
        return newWakeLock;
    }
}
