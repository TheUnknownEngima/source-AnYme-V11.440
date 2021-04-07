package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.Parcel;

public final class z extends fa0 implements x {
    z(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastContext");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.cast.framework.c0 I0() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.p3()
            r1 = 6
            android.os.Parcel r0 = r4.q3(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.cast.framework.IDiscoveryManager"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.cast.framework.c0
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.cast.framework.c0 r1 = (com.google.android.gms.cast.framework.c0) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.cast.framework.e0 r2 = new com.google.android.gms.cast.framework.e0
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.z.I0():com.google.android.gms.cast.framework.c0");
    }

    public final boolean k() {
        Parcel q3 = q3(12, p3());
        boolean e = cb0.e(q3);
        q3.recycle();
        return e;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.cast.framework.h0 s() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.p3()
            r1 = 5
            android.os.Parcel r0 = r4.q3(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.cast.framework.ISessionManager"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.cast.framework.h0
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.cast.framework.h0 r1 = (com.google.android.gms.cast.framework.h0) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.cast.framework.k0 r2 = new com.google.android.gms.cast.framework.k0
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.z.s():com.google.android.gms.cast.framework.h0");
    }
}
