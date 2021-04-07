package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.w80;

public final class e0 extends fa0 implements c0 {
    e0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IDiscoveryManager");
    }

    public final w80 I() {
        Parcel q3 = q3(5, p3());
        w80 q32 = w80.a.q3(q3.readStrongBinder());
        q3.recycle();
        return q32;
    }
}
