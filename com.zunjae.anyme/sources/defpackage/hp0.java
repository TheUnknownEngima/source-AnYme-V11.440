package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: hp0  reason: default package */
final class hp0 implements gp0 {
    private hp0() {
    }

    public final ScheduledExecutorService m(int i, int i2) {
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }
}
