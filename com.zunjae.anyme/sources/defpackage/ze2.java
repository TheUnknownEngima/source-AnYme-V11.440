package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: ze2  reason: default package */
final class ze2 {
    private static final Handler a = new Handler(Looper.getMainLooper());
    public static final ze2 b = new ze2();

    private ze2() {
    }

    public final Handler a() {
        return a;
    }
}
