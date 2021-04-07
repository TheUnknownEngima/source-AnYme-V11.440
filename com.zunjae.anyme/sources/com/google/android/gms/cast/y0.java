package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;

public final class y0 implements Parcelable.Creator<w0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = n80.A(parcel);
        int i = 0;
        while (parcel.dataPosition() < A) {
            int s = n80.s(parcel);
            if (n80.l(s) != 2) {
                n80.z(parcel, s);
            } else {
                i = n80.u(parcel, s);
            }
        }
        n80.k(parcel, A);
        return new w0(i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new w0[i];
    }
}
