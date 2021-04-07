package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

public final class e0 implements Parcelable.Creator<u> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = n80.A(parcel);
        int i = 0;
        Scope[] scopeArr = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < A) {
            int s = n80.s(parcel);
            int l = n80.l(s);
            if (l == 1) {
                i = n80.u(parcel, s);
            } else if (l == 2) {
                i2 = n80.u(parcel, s);
            } else if (l == 3) {
                i3 = n80.u(parcel, s);
            } else if (l != 4) {
                n80.z(parcel, s);
            } else {
                scopeArr = (Scope[]) n80.i(parcel, s, Scope.CREATOR);
            }
        }
        n80.k(parcel, A);
        return new u(i, i2, i3, scopeArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new u[i];
    }
}
