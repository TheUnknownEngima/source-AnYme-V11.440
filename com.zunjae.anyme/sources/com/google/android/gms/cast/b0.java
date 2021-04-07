package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;

public final class b0 implements Parcelable.Creator<y> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = n80.A(parcel);
        w wVar = null;
        w wVar2 = null;
        while (parcel.dataPosition() < A) {
            int s = n80.s(parcel);
            int l = n80.l(s);
            if (l == 2) {
                wVar = (w) n80.e(parcel, s, w.CREATOR);
            } else if (l != 3) {
                n80.z(parcel, s);
            } else {
                wVar2 = (w) n80.e(parcel, s, w.CREATOR);
            }
        }
        n80.k(parcel, A);
        return new y(wVar, wVar2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new y[i];
    }
}
