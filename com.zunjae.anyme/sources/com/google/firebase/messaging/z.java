package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.firebase.c;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.f0;
import com.google.firebase.iid.s;
import com.google.firebase.iid.w;
import com.google.firebase.installations.g;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class z {
    private static final long i = TimeUnit.HOURS.toSeconds(8);
    private final FirebaseInstanceId a;
    private final Context b;
    private final f0 c;
    private final s d;
    private final Map<String, ArrayDeque<f81<Void>>> e = new b0();
    private final ScheduledExecutorService f;
    private boolean g = false;
    private final x h;

    private z(FirebaseInstanceId firebaseInstanceId, f0 f0Var, x xVar, s sVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.a = firebaseInstanceId;
        this.c = f0Var;
        this.h = xVar;
        this.d = sVar;
        this.b = context;
        this.f = scheduledExecutorService;
    }

    private void a(w wVar, f81<Void> f81) {
        ArrayDeque arrayDeque;
        synchronized (this.e) {
            String e2 = wVar.e();
            if (this.e.containsKey(e2)) {
                arrayDeque = this.e.get(e2);
            } else {
                ArrayDeque arrayDeque2 = new ArrayDeque();
                this.e.put(e2, arrayDeque2);
                arrayDeque = arrayDeque2;
            }
            arrayDeque.add(f81);
        }
    }

    private static <T> T b(e81<T> e81) {
        try {
            return h81.b(e81, 30, TimeUnit.SECONDS);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e2);
            }
        } catch (InterruptedException | TimeoutException e3) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e3);
        }
    }

    private void c(String str) {
        w wVar = (w) b(this.a.m());
        b(this.d.j(wVar.f(), wVar.a(), str));
    }

    private void d(String str) {
        w wVar = (w) b(this.a.m());
        b(this.d.k(wVar.f(), wVar.a(), str));
    }

    static e81<z> e(c cVar, FirebaseInstanceId firebaseInstanceId, f0 f0Var, pi1 pi1, uh1 uh1, g gVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        return f(firebaseInstanceId, f0Var, new s(cVar, f0Var, pi1, uh1, gVar), context, scheduledExecutorService);
    }

    static e81<z> f(FirebaseInstanceId firebaseInstanceId, f0 f0Var, s sVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        return h81.c(scheduledExecutorService, new y(context, scheduledExecutorService, firebaseInstanceId, f0Var, sVar));
    }

    static boolean h() {
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
        }
        return true;
    }

    static final /* synthetic */ z j(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseInstanceId firebaseInstanceId, f0 f0Var, s sVar) {
        return new z(firebaseInstanceId, f0Var, x.b(context, scheduledExecutorService), sVar, context, scheduledExecutorService);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void k(com.google.firebase.messaging.w r5) {
        /*
            r4 = this;
            java.util.Map<java.lang.String, java.util.ArrayDeque<f81<java.lang.Void>>> r0 = r4.e
            monitor-enter(r0)
            java.lang.String r5 = r5.e()     // Catch:{ all -> 0x0032 }
            java.util.Map<java.lang.String, java.util.ArrayDeque<f81<java.lang.Void>>> r1 = r4.e     // Catch:{ all -> 0x0032 }
            boolean r1 = r1.containsKey(r5)     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0011:
            java.util.Map<java.lang.String, java.util.ArrayDeque<f81<java.lang.Void>>> r1 = r4.e     // Catch:{ all -> 0x0032 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0032 }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x0032 }
            java.lang.Object r2 = r1.poll()     // Catch:{ all -> 0x0032 }
            f81 r2 = (defpackage.f81) r2     // Catch:{ all -> 0x0032 }
            if (r2 == 0) goto L_0x0025
            r3 = 0
            r2.c(r3)     // Catch:{ all -> 0x0032 }
        L_0x0025:
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0030
            java.util.Map<java.lang.String, java.util.ArrayDeque<f81<java.lang.Void>>> r1 = r4.e     // Catch:{ all -> 0x0032 }
            r1.remove(r5)     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.z.k(com.google.firebase.messaging.w):void");
    }

    private void p() {
        if (!i()) {
            t(0);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return this.h.c() != null;
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean i() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public boolean l(w wVar) {
        StringBuilder sb;
        try {
            String b2 = wVar.b();
            char c2 = 65535;
            int hashCode = b2.hashCode();
            if (hashCode != 83) {
                if (hashCode == 85) {
                    if (b2.equals("U")) {
                        c2 = 1;
                    }
                }
            } else if (b2.equals("S")) {
                c2 = 0;
            }
            if (c2 != 0) {
                if (c2 == 1) {
                    d(wVar.c());
                    if (h()) {
                        String c3 = wVar.c();
                        sb = new StringBuilder(String.valueOf(c3).length() + 35);
                        sb.append("Unsubscribe from topic: ");
                        sb.append(c3);
                        sb.append(" succeeded.");
                    }
                } else if (h()) {
                    String valueOf = String.valueOf(wVar);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 24);
                    sb2.append("Unknown topic operation");
                    sb2.append(valueOf);
                    sb2.append(".");
                    sb2.toString();
                }
                return true;
            }
            c(wVar.c());
            if (h()) {
                String c4 = wVar.c();
                sb = new StringBuilder(String.valueOf(c4).length() + 31);
                sb.append("Subscribe to topic: ");
                sb.append(c4);
                sb.append(" succeeded.");
            }
            return true;
            sb.toString();
            return true;
        } catch (IOException e2) {
            if ("SERVICE_NOT_AVAILABLE".equals(e2.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e2.getMessage())) {
                String message = e2.getMessage();
                StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + 53);
                sb3.append("Topic operation failed: ");
                sb3.append(message);
                sb3.append(". Will retry Topic operation.");
                sb3.toString();
                return false;
            } else if (e2.getMessage() == null) {
                return false;
            } else {
                throw e2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void m(Runnable runnable, long j) {
        this.f.schedule(runnable, j, TimeUnit.SECONDS);
    }

    /* access modifiers changed from: package-private */
    public e81<Void> n(w wVar) {
        this.h.a(wVar);
        f81 f81 = new f81();
        a(wVar, f81);
        return f81.a();
    }

    /* access modifiers changed from: package-private */
    public synchronized void o(boolean z) {
        this.g = z;
    }

    /* access modifiers changed from: package-private */
    public void q() {
        if (g()) {
            p();
        }
    }

    /* access modifiers changed from: package-private */
    public e81<Void> r(String str) {
        e81<Void> n = n(w.f(str));
        q();
        return n;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (l(r0) != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean s() {
        /*
            r2 = this;
        L_0x0000:
            monitor-enter(r2)
            com.google.firebase.messaging.x r0 = r2.h     // Catch:{ all -> 0x0022 }
            com.google.firebase.messaging.w r0 = r0.c()     // Catch:{ all -> 0x0022 }
            if (r0 != 0) goto L_0x0010
            boolean r0 = h()     // Catch:{ all -> 0x0022 }
            r0 = 1
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r0
        L_0x0010:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            boolean r1 = r2.l(r0)
            if (r1 != 0) goto L_0x0019
            r0 = 0
            return r0
        L_0x0019:
            com.google.firebase.messaging.x r1 = r2.h
            r1.e(r0)
            r2.k(r0)
            goto L_0x0000
        L_0x0022:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.z.s():boolean");
    }

    /* access modifiers changed from: package-private */
    public void t(long j) {
        m(new a0(this, this.b, this.c, Math.min(Math.max(30, j << 1), i)), j);
        o(true);
    }

    /* access modifiers changed from: package-private */
    public e81<Void> u(String str) {
        e81<Void> n = n(w.g(str));
        q();
        return n;
    }
}
