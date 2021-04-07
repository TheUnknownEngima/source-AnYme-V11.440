package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

public class q0 {
    private static q0 e;
    @GuardedBy("this")
    private String a = null;
    private Boolean b = null;
    private Boolean c = null;
    private final Queue<Intent> d = new ArrayDeque();

    private q0() {
    }

    private int a(Context context, Intent intent) {
        String f = f(context, intent);
        if (f != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(f);
                if (valueOf.length() != 0) {
                    "Restricting intent to a specific service: ".concat(valueOf);
                } else {
                    new String("Restricting intent to a specific service: ");
                }
            }
            intent.setClassName(context.getPackageName(), f);
        }
        try {
            return (e(context) ? t0.e(context, intent) : context.startService(intent)) == null ? 404 : -1;
        } catch (SecurityException unused) {
            return 401;
        } catch (IllegalStateException e2) {
            String valueOf2 = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 45);
            sb.append("Failed to start service while in background: ");
            sb.append(valueOf2);
            sb.toString();
            return 402;
        }
    }

    public static synchronized q0 b() {
        q0 q0Var;
        synchronized (q0.class) {
            if (e == null) {
                e = new q0();
            }
            q0Var = e;
        }
        return q0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0093, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized java.lang.String f(android.content.Context r4, android.content.Intent r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = r3.a     // Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x0009
            java.lang.String r4 = r3.a     // Catch:{ all -> 0x0094 }
            monitor-exit(r3)
            return r4
        L_0x0009:
            android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch:{ all -> 0x0094 }
            r1 = 0
            android.content.pm.ResolveInfo r5 = r0.resolveService(r5, r1)     // Catch:{ all -> 0x0094 }
            r0 = 0
            if (r5 == 0) goto L_0x0092
            android.content.pm.ServiceInfo r1 = r5.serviceInfo     // Catch:{ all -> 0x0094 }
            if (r1 != 0) goto L_0x001b
            goto L_0x0092
        L_0x001b:
            android.content.pm.ServiceInfo r5 = r5.serviceInfo     // Catch:{ all -> 0x0094 }
            java.lang.String r1 = r4.getPackageName()     // Catch:{ all -> 0x0094 }
            java.lang.String r2 = r5.packageName     // Catch:{ all -> 0x0094 }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0094 }
            if (r1 == 0) goto L_0x0061
            java.lang.String r1 = r5.name     // Catch:{ all -> 0x0094 }
            if (r1 != 0) goto L_0x002e
            goto L_0x0061
        L_0x002e:
            java.lang.String r0 = r5.name     // Catch:{ all -> 0x0094 }
            java.lang.String r1 = "."
            boolean r0 = r0.startsWith(r1)     // Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x005a
            java.lang.String r4 = r4.getPackageName()     // Catch:{ all -> 0x0094 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0094 }
            java.lang.String r5 = r5.name     // Catch:{ all -> 0x0094 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0094 }
            int r0 = r5.length()     // Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x0051
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x0094 }
            goto L_0x0057
        L_0x0051:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0094 }
            r5.<init>(r4)     // Catch:{ all -> 0x0094 }
            r4 = r5
        L_0x0057:
            r3.a = r4     // Catch:{ all -> 0x0094 }
            goto L_0x005d
        L_0x005a:
            java.lang.String r4 = r5.name     // Catch:{ all -> 0x0094 }
            goto L_0x0057
        L_0x005d:
            java.lang.String r4 = r3.a     // Catch:{ all -> 0x0094 }
            monitor-exit(r3)
            return r4
        L_0x0061:
            java.lang.String r4 = r5.packageName     // Catch:{ all -> 0x0094 }
            java.lang.String r5 = r5.name     // Catch:{ all -> 0x0094 }
            java.lang.String r1 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0094 }
            int r1 = r1.length()     // Catch:{ all -> 0x0094 }
            int r1 = r1 + 94
            java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0094 }
            int r2 = r2.length()     // Catch:{ all -> 0x0094 }
            int r1 = r1 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0094 }
            r2.<init>(r1)     // Catch:{ all -> 0x0094 }
            java.lang.String r1 = "Error resolving target intent service, skipping classname enforcement. Resolved service was: "
            r2.append(r1)     // Catch:{ all -> 0x0094 }
            r2.append(r4)     // Catch:{ all -> 0x0094 }
            java.lang.String r4 = "/"
            r2.append(r4)     // Catch:{ all -> 0x0094 }
            r2.append(r5)     // Catch:{ all -> 0x0094 }
            r2.toString()     // Catch:{ all -> 0x0094 }
            monitor-exit(r3)
            return r0
        L_0x0092:
            monitor-exit(r3)
            return r0
        L_0x0094:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.q0.f(android.content.Context, android.content.Intent):java.lang.String");
    }

    public static void h(Context context, Intent intent) {
        context.sendBroadcast(j(context, "com.google.firebase.MESSAGING_EVENT", intent));
    }

    public static Intent i(Intent intent) {
        Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
        if (parcelableExtra instanceof Intent) {
            return (Intent) parcelableExtra;
        }
        return null;
    }

    private static Intent j(Context context, String str, Intent intent) {
        Intent intent2 = new Intent(context, FirebaseInstanceIdReceiver.class);
        intent2.setAction(str);
        intent2.putExtra("wrapped_intent", intent);
        return intent2;
    }

    public Intent c() {
        return this.d.poll();
    }

    /* access modifiers changed from: package-private */
    public boolean d(Context context) {
        if (this.c == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.b.booleanValue()) {
            boolean isLoggable = Log.isLoggable("FirebaseInstanceId", 3);
        }
        return this.c.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public boolean e(Context context) {
        if (this.b == null) {
            this.b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.b.booleanValue()) {
            boolean isLoggable = Log.isLoggable("FirebaseInstanceId", 3);
        }
        return this.b.booleanValue();
    }

    public int g(Context context, Intent intent) {
        boolean isLoggable = Log.isLoggable("FirebaseInstanceId", 3);
        this.d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return a(context, intent2);
    }
}
