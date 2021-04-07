package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class x implements Parcelable.Creator<u> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = n80.A(parcel);
        boolean z = false;
        String str = null;
        IBinder iBinder = null;
        boolean z2 = false;
        while (parcel.dataPosition() < A) {
            int s = n80.s(parcel);
            int l = n80.l(s);
            if (l == 1) {
                str = n80.f(parcel, s);
            } else if (l == 2) {
                iBinder = n80.t(parcel, s);
            } else if (l == 3) {
                z = n80.m(parcel, s);
            } else if (l != 4) {
                n80.z(parcel, s);
            } else {
                z2 = n80.m(parcel, s);
            }
        }
        n80.k(parcel, A);
        return new u(str, iBinder, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new u[i];
    }
}
