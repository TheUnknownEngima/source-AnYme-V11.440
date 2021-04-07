package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import java.net.URL;
import java.util.List;

/* renamed from: u9  reason: default package */
public class u9 {
    private static ya a = null;
    private static x9 b = null;
    private static boolean c = false;
    private static boolean d = false;
    private static String e;
    private static String f;
    private static String g;

    private static String a(Context context) {
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.pid == myPid) {
                return next.processName;
            }
        }
        return null;
    }

    public static void b(String str, String str2) {
        if (d()) {
            if (h()) {
                "BF/" + str;
            }
            if (i()) {
                b.x(str, str2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ac, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void c(android.content.Context r15, java.lang.String r16, boolean r17) {
        /*
            r0 = r15
            r9 = r16
            java.lang.Class<u9> r10 = defpackage.u9.class
            monitor-enter(r10)
            if (r0 == 0) goto L_0x00ab
            boolean r1 = android.text.TextUtils.isEmpty(r16)     // Catch:{ all -> 0x00a8 }
            if (r1 == 0) goto L_0x0010
            goto L_0x00ab
        L_0x0010:
            ya r1 = a     // Catch:{ all -> 0x00a8 }
            if (r1 != 0) goto L_0x00a6
            android.content.IntentFilter r1 = new android.content.IntentFilter     // Catch:{ SecurityException -> 0x00a6 }
            java.lang.String r2 = "android.intent.action.BATTERY_CHANGED"
            r1.<init>(r2)     // Catch:{ SecurityException -> 0x00a6 }
            r11 = 0
            r15.registerReceiver(r11, r1)     // Catch:{ SecurityException -> 0x00a6 }
            boolean r1 = e(r15)     // Catch:{ SecurityException -> 0x00a6 }
            if (r1 == 0) goto L_0x00a6
            c = r17     // Catch:{ SecurityException -> 0x00a6 }
            kd r12 = new kd     // Catch:{ SecurityException -> 0x00a6 }
            r12.<init>()     // Catch:{ SecurityException -> 0x00a6 }
            dc r13 = new dc     // Catch:{ SecurityException -> 0x00a6 }
            r13.<init>()     // Catch:{ SecurityException -> 0x00a6 }
            ea r3 = r12.i()     // Catch:{ SecurityException -> 0x00a6 }
            da r4 = r12.c(r3)     // Catch:{ SecurityException -> 0x00a6 }
            ga r5 = r12.n()     // Catch:{ SecurityException -> 0x00a6 }
            fa r6 = r12.d(r5)     // Catch:{ SecurityException -> 0x00a6 }
            ca r7 = r12.b()     // Catch:{ SecurityException -> 0x00a6 }
            ba r8 = r12.a(r7)     // Catch:{ SecurityException -> 0x00a6 }
            r1 = r12
            r2 = r15
            ac r3 = r1.g(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SecurityException -> 0x00a6 }
            java.lang.String r1 = e     // Catch:{ SecurityException -> 0x00a6 }
            r2 = 20200526(0x1343c4e, float:3.3104045E-38)
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ SecurityException -> 0x00a6 }
            yb r1 = r13.a(r1, r2, r9)     // Catch:{ SecurityException -> 0x00a6 }
            e = r11     // Catch:{ SecurityException -> 0x00a6 }
            kb r4 = new kb     // Catch:{ SecurityException -> 0x00a6 }
            r4.<init>(r1)     // Catch:{ SecurityException -> 0x00a6 }
            xa r6 = r12.k(r15)     // Catch:{ SecurityException -> 0x00a6 }
            hd r1 = r12.j(r15)     // Catch:{ SecurityException -> 0x00a6 }
            android.content.SharedPreferences r2 = r12.m(r15)     // Catch:{ SecurityException -> 0x00a6 }
            ua r7 = r12.e(r15, r1, r2)     // Catch:{ SecurityException -> 0x00a6 }
            ab r5 = r12.f(r15)     // Catch:{ SecurityException -> 0x00a6 }
            x9 r13 = new x9     // Catch:{ SecurityException -> 0x00a6 }
            java.lang.String r1 = f     // Catch:{ SecurityException -> 0x00a6 }
            id r8 = r12.h(r9, r1)     // Catch:{ SecurityException -> 0x00a6 }
            java.lang.String r14 = g     // Catch:{ SecurityException -> 0x00a6 }
            r1 = r13
            r2 = r16
            r9 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SecurityException -> 0x00a6 }
            b = r13     // Catch:{ SecurityException -> 0x00a6 }
            f = r11     // Catch:{ SecurityException -> 0x00a6 }
            r1 = 5242880(0x500000, double:2.590327E-317)
            r13.j(r1)     // Catch:{ SecurityException -> 0x00a6 }
            za r1 = new za     // Catch:{ SecurityException -> 0x00a6 }
            java.lang.String r0 = r15.getPackageName()     // Catch:{ SecurityException -> 0x00a6 }
            x9 r2 = b     // Catch:{ SecurityException -> 0x00a6 }
            java.util.concurrent.ExecutorService r3 = java.util.concurrent.Executors.newSingleThreadExecutor()     // Catch:{ SecurityException -> 0x00a6 }
            r1.<init>(r0, r2, r3)     // Catch:{ SecurityException -> 0x00a6 }
            a = r1     // Catch:{ SecurityException -> 0x00a6 }
            r12.l()     // Catch:{ SecurityException -> 0x00a6 }
        L_0x00a6:
            monitor-exit(r10)
            return
        L_0x00a8:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x00ab:
            monitor-exit(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u9.c(android.content.Context, java.lang.String, boolean):void");
    }

    private static boolean d() {
        if (b != null) {
            return true;
        }
        if (d) {
            return false;
        }
        d = true;
        return false;
    }

    private static boolean e(Context context) {
        String a2 = a(context);
        return a2 != null && context.getPackageName().equals(a2);
    }

    private static boolean f() {
        return !c;
    }

    public static URL g(String str, String str2) {
        if (!d()) {
            return null;
        }
        URL F = b.F(str, str2);
        b.r();
        if (c) {
            "Reported feedback with Title: " + str + " and Message: " + str2;
        }
        return F;
    }

    private static boolean h() {
        return !f();
    }

    private static boolean i() {
        return true;
    }
}
