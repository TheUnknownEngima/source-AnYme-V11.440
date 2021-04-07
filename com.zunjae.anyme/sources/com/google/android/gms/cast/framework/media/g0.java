package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import android.os.Parcelable;

public final class g0 implements Parcelable.Creator<b> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = n80.A(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < A) {
            int s = n80.s(parcel);
            int l = n80.l(s);
            if (l == 2) {
                i = n80.u(parcel, s);
            } else if (l == 3) {
                i2 = n80.u(parcel, s);
            } else if (l != 4) {
                n80.z(parcel, s);
            } else {
                i3 = n80.u(parcel, s);
            }
        }
        n80.k(parcel, A);
        return new b(i, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new b[i];
    }
}
