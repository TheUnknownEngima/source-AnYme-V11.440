package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;

public final class o implements Parcelable.Creator<Scope> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = n80.A(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < A) {
            int s = n80.s(parcel);
            int l = n80.l(s);
            if (l == 1) {
                i = n80.u(parcel, s);
            } else if (l != 2) {
                n80.z(parcel, s);
            } else {
                str = n80.f(parcel, s);
            }
        }
        n80.k(parcel, A);
        return new Scope(i, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Scope[i];
    }
}
