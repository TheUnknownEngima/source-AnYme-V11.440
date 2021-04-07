package com.google.android.gms.cast.framework;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;

public interface d0 extends IInterface {

    public static abstract class a extends m90 implements d0 {
        public static d0 q3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            return queryLocalInterface instanceof d0 ? (d0) queryLocalInterface : new f0(iBinder);
        }
    }

    IBinder B(Intent intent);

    int K2(Intent intent, int i, int i2);

    void m();

    void x();
}
