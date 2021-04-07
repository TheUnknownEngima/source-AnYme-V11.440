package defpackage;

import android.os.Build;
import android.view.View;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: nq1  reason: default package */
public class nq1 {
    private static final AtomicInteger a = new AtomicInteger(1);

    private static int a() {
        int i;
        int i2;
        do {
            i = a.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!a.compareAndSet(i, i2));
        return i;
    }

    public static int b() {
        return Build.VERSION.SDK_INT < 17 ? a() : View.generateViewId();
    }
}
