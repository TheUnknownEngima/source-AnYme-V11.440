package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class n0 extends cp0 implements o0 {
    public n0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static o0 q3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof o0 ? (o0) queryLocalInterface : new p0(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean p3(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            w80 b = b();
            parcel2.writeNoException();
            ep0.c(parcel2, b);
        } else if (i != 2) {
            return false;
        } else {
            int c = c();
            parcel2.writeNoException();
            parcel2.writeInt(c);
        }
        return true;
    }
}
