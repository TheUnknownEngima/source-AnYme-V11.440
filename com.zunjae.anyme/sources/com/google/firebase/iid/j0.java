package com.google.firebase.iid;

import android.util.Pair;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

class j0 {
    private final Executor a;
    @GuardedBy("this")
    private final Map<Pair<String, String>, e81<w>> b = new b0();

    interface a {
        e81<w> start();
    }

    j0(Executor executor) {
        this.a = executor;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized defpackage.e81<com.google.firebase.iid.w> a(java.lang.String r3, java.lang.String r4, com.google.firebase.iid.j0.a r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            android.util.Pair r0 = new android.util.Pair     // Catch:{ all -> 0x0075 }
            r0.<init>(r3, r4)     // Catch:{ all -> 0x0075 }
            java.util.Map<android.util.Pair<java.lang.String, java.lang.String>, e81<com.google.firebase.iid.w>> r3 = r2.b     // Catch:{ all -> 0x0075 }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ all -> 0x0075 }
            e81 r3 = (defpackage.e81) r3     // Catch:{ all -> 0x0075 }
            r4 = 3
            if (r3 == 0) goto L_0x0039
            java.lang.String r5 = "FirebaseInstanceId"
            boolean r4 = android.util.Log.isLoggable(r5, r4)     // Catch:{ all -> 0x0075 }
            if (r4 == 0) goto L_0x0037
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0075 }
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0075 }
            int r5 = r5.length()     // Catch:{ all -> 0x0075 }
            int r5 = r5 + 29
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
            r0.<init>(r5)     // Catch:{ all -> 0x0075 }
            java.lang.String r5 = "Joining ongoing request for: "
            r0.append(r5)     // Catch:{ all -> 0x0075 }
            r0.append(r4)     // Catch:{ all -> 0x0075 }
            r0.toString()     // Catch:{ all -> 0x0075 }
        L_0x0037:
            monitor-exit(r2)
            return r3
        L_0x0039:
            java.lang.String r3 = "FirebaseInstanceId"
            boolean r3 = android.util.Log.isLoggable(r3, r4)     // Catch:{ all -> 0x0075 }
            if (r3 == 0) goto L_0x005f
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0075 }
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0075 }
            int r4 = r4.length()     // Catch:{ all -> 0x0075 }
            int r4 = r4 + 24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
            r1.<init>(r4)     // Catch:{ all -> 0x0075 }
            java.lang.String r4 = "Making new request for: "
            r1.append(r4)     // Catch:{ all -> 0x0075 }
            r1.append(r3)     // Catch:{ all -> 0x0075 }
            r1.toString()     // Catch:{ all -> 0x0075 }
        L_0x005f:
            e81 r3 = r5.start()     // Catch:{ all -> 0x0075 }
            java.util.concurrent.Executor r4 = r2.a     // Catch:{ all -> 0x0075 }
            com.google.firebase.iid.i0 r5 = new com.google.firebase.iid.i0     // Catch:{ all -> 0x0075 }
            r5.<init>(r2, r0)     // Catch:{ all -> 0x0075 }
            e81 r3 = r3.k(r4, r5)     // Catch:{ all -> 0x0075 }
            java.util.Map<android.util.Pair<java.lang.String, java.lang.String>, e81<com.google.firebase.iid.w>> r4 = r2.b     // Catch:{ all -> 0x0075 }
            r4.put(r0, r3)     // Catch:{ all -> 0x0075 }
            monitor-exit(r2)
            return r3
        L_0x0075:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.j0.a(java.lang.String, java.lang.String, com.google.firebase.iid.j0$a):e81");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e81 b(Pair pair, e81 e81) {
        synchronized (this) {
            this.b.remove(pair);
        }
        return e81;
    }
}
