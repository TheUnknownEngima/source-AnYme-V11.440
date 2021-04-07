package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.u;

public final class r0 extends dp0 implements q0 {
    r0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final boolean J2(u uVar, w80 w80) {
        Parcel p3 = p3();
        ep0.d(p3, uVar);
        ep0.c(p3, w80);
        Parcel q3 = q3(5, p3);
        boolean e = ep0.e(q3);
        q3.recycle();
        return e;
    }
}
