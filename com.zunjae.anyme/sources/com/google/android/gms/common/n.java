package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import com.google.android.gms.common.internal.q0;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.s0;
import com.google.android.gms.dynamite.DynamiteModule;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
final class n {
    private static volatile q0 a;
    private static final Object b = new Object();
    private static Context c;

    static w a(String str, o oVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return d(str, oVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    static final /* synthetic */ String b(boolean z, String str, o oVar) {
        boolean z2 = true;
        if (z || !d(str, oVar, true, false).a) {
            z2 = false;
        }
        return w.e(str, oVar, z, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void c(android.content.Context r2) {
        /*
            java.lang.Class<com.google.android.gms.common.n> r0 = com.google.android.gms.common.n.class
            monitor-enter(r0)
            android.content.Context r1 = c     // Catch:{ all -> 0x0013 }
            if (r1 != 0) goto L_0x0011
            if (r2 == 0) goto L_0x0011
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0013 }
            c = r2     // Catch:{ all -> 0x0013 }
            monitor-exit(r0)
            return
        L_0x0011:
            monitor-exit(r0)
            return
        L_0x0013:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.n.c(android.content.Context):void");
    }

    private static w d(String str, o oVar, boolean z, boolean z2) {
        try {
            if (a == null) {
                r.j(c);
                synchronized (b) {
                    if (a == null) {
                        a = s0.q3(DynamiteModule.d(c, DynamiteModule.k, "com.google.android.gms.googlecertificates").c("com.google.android.gms.common.GoogleCertificatesImpl"));
                    }
                }
            }
            r.j(c);
            try {
                return a.J2(new u(str, oVar, z, z2), x80.s3(c.getPackageManager())) ? w.f() : w.c(new p(z, str, oVar));
            } catch (RemoteException e) {
                return w.b("module call", e);
            }
        } catch (DynamiteModule.a e2) {
            String valueOf = String.valueOf(e2.getMessage());
            return w.b(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), e2);
        }
    }
}
