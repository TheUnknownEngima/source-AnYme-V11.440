package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;

public final class z0 implements Parcelable.Creator<j> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = n80.A(parcel);
        String str = null;
        i iVar = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < A) {
            int s = n80.s(parcel);
            int l = n80.l(s);
            if (l == 2) {
                z = n80.m(parcel, s);
            } else if (l == 3) {
                str = n80.f(parcel, s);
            } else if (l == 4) {
                z2 = n80.m(parcel, s);
            } else if (l != 5) {
                n80.z(parcel, s);
            } else {
                iVar = (i) n80.e(parcel, s, i.CREATOR);
            }
        }
        n80.k(parcel, A);
        return new j(z, str, z2, iVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new j[i];
    }
}
