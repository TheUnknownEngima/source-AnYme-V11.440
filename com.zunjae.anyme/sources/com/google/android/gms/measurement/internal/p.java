package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class p implements Parcelable.Creator<n> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = n80.A(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < A) {
            int s = n80.s(parcel);
            if (n80.l(s) != 2) {
                n80.z(parcel, s);
            } else {
                bundle = n80.a(parcel, s);
            }
        }
        n80.k(parcel, A);
        return new n(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new n[i];
    }
}
