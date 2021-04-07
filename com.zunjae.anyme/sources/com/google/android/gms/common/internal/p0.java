package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.w80;

public final class p0 extends dp0 implements o0 {
    p0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    public final w80 b() {
        Parcel q3 = q3(1, p3());
        w80 q32 = w80.a.q3(q3.readStrongBinder());
        q3.recycle();
        return q32;
    }

    public final int c() {
        Parcel q3 = q3(2, p3());
        int readInt = q3.readInt();
        q3.recycle();
        return readInt;
    }
}
