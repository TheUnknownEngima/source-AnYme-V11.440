package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.r;
import java.util.List;

public class d {
    private static d a = new d();
    private static Boolean b;

    public static d a() {
        return a;
    }

    private static void d(Context context, WakeLockEvent wakeLockEvent) {
        try {
            context.startService(new Intent().setComponent(b.a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", wakeLockEvent));
        } catch (Exception e) {
            Log.wtf("WakeLockTracker", e);
        }
    }

    private static boolean e() {
        if (b == null) {
            b = Boolean.FALSE;
        }
        return b.booleanValue();
    }

    public void b(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list) {
        c(context, str, i, str2, str3, str4, i2, list, 0);
    }

    public void c(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list, long j) {
        int i3 = i;
        if (e()) {
            if (TextUtils.isEmpty(str)) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    "missing wakeLock key. ".concat(valueOf);
                } else {
                    new String("missing wakeLock key. ");
                }
            } else if (7 == i3 || 8 == i3 || 10 == i3 || 11 == i3) {
                WakeLockEvent wakeLockEvent = r0;
                WakeLockEvent wakeLockEvent2 = new WakeLockEvent(System.currentTimeMillis(), i, str2, i2, c.b(list), str, SystemClock.elapsedRealtime(), r.a(context), str3, c.c(context.getPackageName()), r.b(context), j, str4, false);
                d(context, wakeLockEvent);
            }
        }
    }
}
