package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: vh1  reason: default package */
class vh1 {
    private static vh1 b;
    private final SharedPreferences a;

    private vh1(Context context) {
        this.a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
    }

    static synchronized vh1 a(Context context) {
        vh1 vh1;
        synchronized (vh1.class) {
            if (b == null) {
                b = new vh1(context);
            }
            vh1 = b;
        }
        return vh1;
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean b(long j) {
        return c("fire-global", j);
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean c(String str, long j) {
        if (!this.a.contains(str)) {
            this.a.edit().putLong(str, j).apply();
            return true;
        } else if (j - this.a.getLong(str, -1) < 86400000) {
            return false;
        } else {
            this.a.edit().putLong(str, j).apply();
            return true;
        }
    }
}
