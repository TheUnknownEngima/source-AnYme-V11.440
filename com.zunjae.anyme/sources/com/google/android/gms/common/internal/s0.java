package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;

public abstract class s0 extends cp0 implements q0 {
    public static q0 q3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof q0 ? (q0) queryLocalInterface : new r0(iBinder);
    }
}
