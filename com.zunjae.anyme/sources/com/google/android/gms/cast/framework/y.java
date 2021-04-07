package com.google.android.gms.cast.framework;

import android.os.Parcel;
import com.google.android.gms.cast.j;

public abstract class y extends m90 implements v {
    public y() {
        super("com.google.android.gms.cast.framework.ICastConnectionController");
    }

    /* access modifiers changed from: protected */
    public final boolean p3(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            o0(parcel.readString(), parcel.readString());
        } else if (i == 2) {
            D2(parcel.readString(), (j) cb0.b(parcel, j.CREATOR));
        } else if (i == 3) {
            l(parcel.readString());
        } else if (i == 4) {
            c3(parcel.readInt());
        } else if (i != 5) {
            return false;
        } else {
            a();
            parcel2.writeNoException();
            parcel2.writeInt(12451009);
            return true;
        }
        parcel2.writeNoException();
        return true;
    }
}
