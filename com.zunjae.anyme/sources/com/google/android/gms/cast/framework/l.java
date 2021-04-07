package com.google.android.gms.cast.framework;

import android.os.Parcel;

public abstract class l extends m90 implements l0 {
    public l() {
        super("com.google.android.gms.cast.framework.ISessionProvider");
    }

    /* access modifiers changed from: protected */
    public final boolean p3(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            w80 x1 = x1(parcel.readString());
            parcel2.writeNoException();
            cb0.c(parcel2, x1);
        } else if (i == 2) {
            boolean q2 = q2();
            parcel2.writeNoException();
            cb0.a(parcel2, q2);
        } else if (i == 3) {
            String W2 = W2();
            parcel2.writeNoException();
            parcel2.writeString(W2);
        } else if (i != 4) {
            return false;
        } else {
            a();
            parcel2.writeNoException();
            parcel2.writeInt(12451009);
        }
        return true;
    }
}
