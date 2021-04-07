package com.google.android.gms.cast.framework.media.internal;

import android.os.Parcel;

public abstract class i extends m90 implements j {
    public i() {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
    }

    /* access modifiers changed from: protected */
    public final boolean p3(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            c0(parcel.readLong(), parcel.readLong());
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            a();
            parcel2.writeNoException();
            parcel2.writeInt(12451009);
        }
        return true;
    }
}
