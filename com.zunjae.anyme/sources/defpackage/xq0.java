package defpackage;

import android.content.Context;
import android.os.Bundle;
import defpackage.uq0;

/* renamed from: xq0  reason: default package */
final class xq0 extends uq0.a {
    private final /* synthetic */ String i;
    private final /* synthetic */ String j;
    private final /* synthetic */ Context k;
    private final /* synthetic */ Bundle l;
    private final /* synthetic */ uq0 m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    xq0(uq0 uq0, String str, String str2, Context context, Bundle bundle) {
        super(uq0);
        this.m = uq0;
        this.i = str;
        this.j = str2;
        this.k = context;
        this.l = bundle;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054 A[Catch:{ Exception -> 0x009a }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005a A[Catch:{ Exception -> 0x009a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r14 = this;
            r0 = 0
            r1 = 1
            uq0 r2 = r14.m     // Catch:{ Exception -> 0x009a }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x009a }
            r3.<init>()     // Catch:{ Exception -> 0x009a }
            java.util.List unused = r2.e = r3     // Catch:{ Exception -> 0x009a }
            uq0 r2 = r14.m     // Catch:{ Exception -> 0x009a }
            java.lang.String r3 = r14.i     // Catch:{ Exception -> 0x009a }
            java.lang.String r4 = r14.j     // Catch:{ Exception -> 0x009a }
            boolean r2 = defpackage.uq0.H(r3, r4)     // Catch:{ Exception -> 0x009a }
            r3 = 0
            if (r2 == 0) goto L_0x0027
            java.lang.String r3 = r14.j     // Catch:{ Exception -> 0x009a }
            java.lang.String r2 = r14.i     // Catch:{ Exception -> 0x009a }
            uq0 r4 = r14.m     // Catch:{ Exception -> 0x009a }
            java.lang.String r4 = r4.a     // Catch:{ Exception -> 0x009a }
            r10 = r2
            r11 = r3
            r9 = r4
            goto L_0x002a
        L_0x0027:
            r9 = r3
            r10 = r9
            r11 = r10
        L_0x002a:
            android.content.Context r2 = r14.k     // Catch:{ Exception -> 0x009a }
            defpackage.uq0.S(r2)     // Catch:{ Exception -> 0x009a }
            java.lang.Boolean r2 = defpackage.uq0.j     // Catch:{ Exception -> 0x009a }
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x009a }
            if (r2 != 0) goto L_0x003e
            if (r10 == 0) goto L_0x003c
            goto L_0x003e
        L_0x003c:
            r2 = 0
            goto L_0x003f
        L_0x003e:
            r2 = 1
        L_0x003f:
            uq0 r3 = r14.m     // Catch:{ Exception -> 0x009a }
            uq0 r4 = r14.m     // Catch:{ Exception -> 0x009a }
            android.content.Context r5 = r14.k     // Catch:{ Exception -> 0x009a }
            z61 r4 = r4.c(r5, r2)     // Catch:{ Exception -> 0x009a }
            defpackage.z61 unused = r3.h = r4     // Catch:{ Exception -> 0x009a }
            uq0 r3 = r14.m     // Catch:{ Exception -> 0x009a }
            z61 r3 = r3.h     // Catch:{ Exception -> 0x009a }
            if (r3 != 0) goto L_0x005a
            uq0 r2 = r14.m     // Catch:{ Exception -> 0x009a }
            java.lang.String unused = r2.a     // Catch:{ Exception -> 0x009a }
            return
        L_0x005a:
            android.content.Context r3 = r14.k     // Catch:{ Exception -> 0x009a }
            int r3 = defpackage.uq0.Q(r3)     // Catch:{ Exception -> 0x009a }
            android.content.Context r4 = r14.k     // Catch:{ Exception -> 0x009a }
            int r4 = defpackage.uq0.O(r4)     // Catch:{ Exception -> 0x009a }
            if (r2 == 0) goto L_0x0073
            int r2 = java.lang.Math.max(r3, r4)     // Catch:{ Exception -> 0x009a }
            if (r4 >= r3) goto L_0x0070
            r3 = 1
            goto L_0x0071
        L_0x0070:
            r3 = 0
        L_0x0071:
            r8 = r3
            goto L_0x007d
        L_0x0073:
            if (r3 <= 0) goto L_0x0076
            r4 = r3
        L_0x0076:
            if (r3 <= 0) goto L_0x007a
            r2 = 1
            goto L_0x007b
        L_0x007a:
            r2 = 0
        L_0x007b:
            r8 = r2
            r2 = r4
        L_0x007d:
            sq0 r13 = new sq0     // Catch:{ Exception -> 0x009a }
            r4 = 31049(0x7949, double:1.534E-319)
            long r6 = (long) r2     // Catch:{ Exception -> 0x009a }
            android.os.Bundle r12 = r14.l     // Catch:{ Exception -> 0x009a }
            r3 = r13
            r3.<init>(r4, r6, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x009a }
            uq0 r2 = r14.m     // Catch:{ Exception -> 0x009a }
            z61 r2 = r2.h     // Catch:{ Exception -> 0x009a }
            android.content.Context r3 = r14.k     // Catch:{ Exception -> 0x009a }
            w80 r3 = defpackage.x80.s3(r3)     // Catch:{ Exception -> 0x009a }
            long r4 = r14.e     // Catch:{ Exception -> 0x009a }
            r2.initialize(r3, r13, r4)     // Catch:{ Exception -> 0x009a }
            return
        L_0x009a:
            r2 = move-exception
            uq0 r3 = r14.m
            r3.o(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xq0.a():void");
    }
}
