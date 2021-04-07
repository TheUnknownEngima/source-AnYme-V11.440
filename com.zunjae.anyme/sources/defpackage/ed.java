package defpackage;

import android.content.Context;

/* renamed from: ed  reason: default package */
public class ed implements xa {
    private final Context a;

    public ed(Context context) {
        ra.a(context, "Context must be not null");
        this.a = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = r1.getActiveNetworkInfo();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a() {
        /*
            r3 = this;
            r0 = 0
            android.content.Context r1 = r3.a     // Catch:{ Exception -> 0x001a }
            java.lang.String r2 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch:{ Exception -> 0x001a }
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch:{ Exception -> 0x001a }
            if (r1 == 0) goto L_0x001a
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()     // Catch:{ Exception -> 0x001a }
            if (r1 == 0) goto L_0x001a
            boolean r1 = r1.isConnected()     // Catch:{ Exception -> 0x001a }
            if (r1 == 0) goto L_0x001a
            r0 = 1
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ed.a():boolean");
    }
}
