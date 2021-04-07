package com.google.android.gms.cast.framework;

import android.os.Bundle;
import android.os.Parcel;

public abstract class m extends m90 implements k {
    public m() {
        super("com.google.android.gms.cast.framework.ISessionProxy");
    }

    /* access modifiers changed from: protected */
    public final boolean p3(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                w80 J1 = J1();
                parcel2.writeNoException();
                cb0.c(parcel2, J1);
                return true;
            case 2:
                N1((Bundle) cb0.b(parcel, Bundle.CREATOR));
                break;
            case 3:
                s1((Bundle) cb0.b(parcel, Bundle.CREATOR));
                break;
            case 4:
                v1(cb0.e(parcel));
                break;
            case 5:
                long t0 = t0();
                parcel2.writeNoException();
                parcel2.writeLong(t0);
                return true;
            case 6:
                a();
                parcel2.writeNoException();
                parcel2.writeInt(12451009);
                return true;
            case 7:
                B2((Bundle) cb0.b(parcel, Bundle.CREATOR));
                break;
            case 8:
                B0((Bundle) cb0.b(parcel, Bundle.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
