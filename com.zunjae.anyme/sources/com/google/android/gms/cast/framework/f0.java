package com.google.android.gms.cast.framework;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

public final class f0 extends fa0 implements d0 {
    f0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IReconnectionService");
    }

    public final IBinder B(Intent intent) {
        Parcel p3 = p3();
        cb0.d(p3, intent);
        Parcel q3 = q3(3, p3);
        IBinder readStrongBinder = q3.readStrongBinder();
        q3.recycle();
        return readStrongBinder;
    }

    public final int K2(Intent intent, int i, int i2) {
        Parcel p3 = p3();
        cb0.d(p3, intent);
        p3.writeInt(i);
        p3.writeInt(i2);
        Parcel q3 = q3(2, p3);
        int readInt = q3.readInt();
        q3.recycle();
        return readInt;
    }

    public final void m() {
        r3(1, p3());
    }

    public final void x() {
        r3(4, p3());
    }
}
