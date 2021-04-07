package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: br0  reason: default package */
final class br0 implements ThreadFactory {
    private ThreadFactory a = Executors.defaultThreadFactory();

    br0(uq0 uq0) {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
