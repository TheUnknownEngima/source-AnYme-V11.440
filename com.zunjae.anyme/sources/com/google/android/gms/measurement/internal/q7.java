package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.r;
import java.net.URL;
import java.util.List;
import java.util.Map;

final class q7 implements Runnable {
    private final URL e;
    private final n7 f;
    private final String g;
    private final /* synthetic */ o7 h;

    public q7(o7 o7Var, String str, URL url, byte[] bArr, Map<String, String> map, n7 n7Var) {
        this.h = o7Var;
        r.f(str);
        r.j(url);
        r.j(n7Var);
        this.e = url;
        this.f = n7Var;
        this.g = str;
    }

    private final void b(int i, Exception exc, byte[] bArr, Map<String, List<String>> map) {
        this.h.f().y(new p7(this, i, exc, bArr, map));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i, Exception exc, byte[] bArr, Map map) {
        this.f.a(this.g, i, exc, bArr, map);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            com.google.android.gms.measurement.internal.o7 r0 = r5.h
            r0.a()
            r0 = 0
            r1 = 0
            com.google.android.gms.measurement.internal.o7 r2 = r5.h     // Catch:{ IOException -> 0x003c, all -> 0x0030 }
            java.net.URL r3 = r5.e     // Catch:{ IOException -> 0x003c, all -> 0x0030 }
            java.net.HttpURLConnection r2 = r2.t(r3)     // Catch:{ IOException -> 0x003c, all -> 0x0030 }
            int r1 = r2.getResponseCode()     // Catch:{ IOException -> 0x002d, all -> 0x002a }
            java.util.Map r3 = r2.getHeaderFields()     // Catch:{ IOException -> 0x002d, all -> 0x002a }
            com.google.android.gms.measurement.internal.o7 r4 = r5.h     // Catch:{ IOException -> 0x0028, all -> 0x0026 }
            byte[] r4 = com.google.android.gms.measurement.internal.o7.v(r2)     // Catch:{ IOException -> 0x0028, all -> 0x0026 }
            if (r2 == 0) goto L_0x0022
            r2.disconnect()
        L_0x0022:
            r5.b(r1, r0, r4, r3)
            return
        L_0x0026:
            r4 = move-exception
            goto L_0x0033
        L_0x0028:
            r4 = move-exception
            goto L_0x003f
        L_0x002a:
            r4 = move-exception
            r3 = r0
            goto L_0x0033
        L_0x002d:
            r4 = move-exception
            r3 = r0
            goto L_0x003f
        L_0x0030:
            r4 = move-exception
            r2 = r0
            r3 = r2
        L_0x0033:
            if (r2 == 0) goto L_0x0038
            r2.disconnect()
        L_0x0038:
            r5.b(r1, r0, r0, r3)
            throw r4
        L_0x003c:
            r4 = move-exception
            r2 = r0
            r3 = r2
        L_0x003f:
            if (r2 == 0) goto L_0x0044
            r2.disconnect()
        L_0x0044:
            r5.b(r1, r4, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.q7.run():void");
    }
}
