package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.a;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

public final class t0 {
    private static final long a = TimeUnit.MINUTES.toMillis(1);
    private static final Object b = new Object();
    @GuardedBy("WakeLockHolder.syncObject")
    private static a c;

    @GuardedBy("WakeLockHolder.syncObject")
    private static void a(Context context) {
        if (c == null) {
            a aVar = new a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            c = aVar;
            aVar.c(true);
        }
    }

    public static void b(Intent intent) {
        synchronized (b) {
            if (c != null && c(intent)) {
                d(intent, false);
                c.b();
            }
        }
    }

    static boolean c(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    private static void d(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.ComponentName e(android.content.Context r3, android.content.Intent r4) {
        /*
            java.lang.Object r0 = b
            monitor-enter(r0)
            a(r3)     // Catch:{ all -> 0x0022 }
            boolean r1 = c(r4)     // Catch:{ all -> 0x0022 }
            r2 = 1
            d(r4, r2)     // Catch:{ all -> 0x0022 }
            android.content.ComponentName r3 = r3.startService(r4)     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x0017
            r3 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return r3
        L_0x0017:
            if (r1 != 0) goto L_0x0020
            com.google.android.gms.stats.a r4 = c     // Catch:{ all -> 0x0022 }
            long r1 = a     // Catch:{ all -> 0x0022 }
            r4.a(r1)     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return r3
        L_0x0022:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.t0.e(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
