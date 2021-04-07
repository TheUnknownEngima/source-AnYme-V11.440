package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface m extends IInterface {

    public static abstract class a extends cp0 implements m {
        public a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        /* access modifiers changed from: protected */
        public final boolean p3(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                y1(parcel.readInt(), parcel.readStrongBinder(), (Bundle) ep0.b(parcel, Bundle.CREATOR));
            } else if (i == 2) {
                q1(parcel.readInt(), (Bundle) ep0.b(parcel, Bundle.CREATOR));
            } else if (i != 3) {
                return false;
            } else {
                r2(parcel.readInt(), parcel.readStrongBinder(), (h0) ep0.b(parcel, h0.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void q1(int i, Bundle bundle);

    void r2(int i, IBinder iBinder, h0 h0Var);

    void y1(int i, IBinder iBinder, Bundle bundle);
}
