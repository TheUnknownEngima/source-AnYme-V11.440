package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: p80  reason: default package */
public class p80 {
    private static a a;

    /* renamed from: p80$a */
    public interface a {
        ScheduledExecutorService a();
    }

    public static synchronized a a() {
        a aVar;
        synchronized (p80.class) {
            if (a == null) {
                a = new q80();
            }
            aVar = a;
        }
        return aVar;
    }
}
