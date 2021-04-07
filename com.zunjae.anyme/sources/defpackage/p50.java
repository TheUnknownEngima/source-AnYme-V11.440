package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: p50  reason: default package */
public class p50 implements r40 {
    protected p50() {
    }

    public long a() {
        return SystemClock.elapsedRealtime();
    }

    public long b() {
        return SystemClock.uptimeMillis();
    }

    public a50 c(Looper looper, Handler.Callback callback) {
        return new q50(new Handler(looper, callback));
    }
}
