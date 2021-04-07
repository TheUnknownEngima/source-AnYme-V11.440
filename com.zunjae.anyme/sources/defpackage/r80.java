package defpackage;

import com.google.android.gms.common.internal.r;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: r80  reason: default package */
public class r80 implements ThreadFactory {
    private final String a;
    private final ThreadFactory b;

    public r80(String str) {
        this(str, 0);
    }

    private r80(String str, int i) {
        this.b = Executors.defaultThreadFactory();
        r.k(str, "Name must not be null");
        this.a = str;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.b.newThread(new s80(runnable, 0));
        newThread.setName(this.a);
        return newThread;
    }
}
