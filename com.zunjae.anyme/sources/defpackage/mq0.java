package defpackage;

import android.os.StrictMode;
import java.util.concurrent.Callable;

/* renamed from: mq0  reason: default package */
public final class mq0 {
    /* JADX INFO: finally extract failed */
    public static <T> T a(Callable<T> callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            T call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }
}
