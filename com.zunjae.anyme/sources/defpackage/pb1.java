package defpackage;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: pb1  reason: default package */
public class pb1 implements ob1, nb1 {
    private final rb1 a;
    private final int b;
    private final TimeUnit c;
    private final Object d = new Object();
    private CountDownLatch e;

    public pb1(rb1 rb1, int i, TimeUnit timeUnit) {
        this.a = rb1;
        this.b = i;
        this.c = timeUnit;
    }

    public void J(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        defpackage.jb1.f().b("Interrupted while awaiting app exception callback from FA listener.");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0040 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r4, android.os.Bundle r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.d
            monitor-enter(r0)
            jb1 r1 = defpackage.jb1.f()     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "Logging Crashlytics event to Firebase"
            r1.b(r2)     // Catch:{ all -> 0x004e }
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x004e }
            r2 = 1
            r1.<init>(r2)     // Catch:{ all -> 0x004e }
            r3.e = r1     // Catch:{ all -> 0x004e }
            rb1 r1 = r3.a     // Catch:{ all -> 0x004e }
            r1.a(r4, r5)     // Catch:{ all -> 0x004e }
            jb1 r4 = defpackage.jb1.f()     // Catch:{ all -> 0x004e }
            java.lang.String r5 = "Awaiting app exception callback from FA..."
            r4.b(r5)     // Catch:{ all -> 0x004e }
            java.util.concurrent.CountDownLatch r4 = r3.e     // Catch:{ InterruptedException -> 0x0040 }
            int r5 = r3.b     // Catch:{ InterruptedException -> 0x0040 }
            long r1 = (long) r5     // Catch:{ InterruptedException -> 0x0040 }
            java.util.concurrent.TimeUnit r5 = r3.c     // Catch:{ InterruptedException -> 0x0040 }
            boolean r4 = r4.await(r1, r5)     // Catch:{ InterruptedException -> 0x0040 }
            if (r4 == 0) goto L_0x0039
            jb1 r4 = defpackage.jb1.f()     // Catch:{ InterruptedException -> 0x0040 }
            java.lang.String r5 = "App exception callback received from FA listener."
        L_0x0035:
            r4.b(r5)     // Catch:{ InterruptedException -> 0x0040 }
            goto L_0x0049
        L_0x0039:
            jb1 r4 = defpackage.jb1.f()     // Catch:{ InterruptedException -> 0x0040 }
            java.lang.String r5 = "Timeout exceeded while awaiting app exception callback from FA listener."
            goto L_0x0035
        L_0x0040:
            jb1 r4 = defpackage.jb1.f()     // Catch:{ all -> 0x004e }
            java.lang.String r5 = "Interrupted while awaiting app exception callback from FA listener."
            r4.b(r5)     // Catch:{ all -> 0x004e }
        L_0x0049:
            r4 = 0
            r3.e = r4     // Catch:{ all -> 0x004e }
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return
        L_0x004e:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pb1.a(java.lang.String, android.os.Bundle):void");
    }
}
