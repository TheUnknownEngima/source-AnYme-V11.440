package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;

public final class c1 implements Parcelable.Creator<k> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = n80.A(parcel);
        long j = 0;
        long j2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < A) {
            int s = n80.s(parcel);
            int l = n80.l(s);
            if (l == 2) {
                j = n80.w(parcel, s);
            } else if (l == 3) {
                j2 = n80.w(parcel, s);
            } else if (l == 4) {
                z = n80.m(parcel, s);
            } else if (l != 5) {
                n80.z(parcel, s);
            } else {
                z2 = n80.m(parcel, s);
            }
        }
        n80.k(parcel, A);
        return new k(j, j2, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new k[i];
    }
}
