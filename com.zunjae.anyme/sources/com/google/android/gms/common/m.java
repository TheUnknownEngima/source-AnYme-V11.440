package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;

public final class m implements Parcelable.Creator<d> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = n80.A(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < A) {
            int s = n80.s(parcel);
            int l = n80.l(s);
            if (l == 1) {
                str = n80.f(parcel, s);
            } else if (l == 2) {
                i = n80.u(parcel, s);
            } else if (l != 3) {
                n80.z(parcel, s);
            } else {
                j = n80.w(parcel, s);
            }
        }
        n80.k(parcel, A);
        return new d(str, i, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new d[i];
    }
}
