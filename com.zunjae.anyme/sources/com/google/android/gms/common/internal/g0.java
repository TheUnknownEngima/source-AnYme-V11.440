package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.d;

public final class g0 implements Parcelable.Creator<h0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = n80.A(parcel);
        Bundle bundle = null;
        d[] dVarArr = null;
        int i = 0;
        while (parcel.dataPosition() < A) {
            int s = n80.s(parcel);
            int l = n80.l(s);
            if (l == 1) {
                bundle = n80.a(parcel, s);
            } else if (l == 2) {
                dVarArr = (d[]) n80.i(parcel, s, d.CREATOR);
            } else if (l != 3) {
                n80.z(parcel, s);
            } else {
                i = n80.u(parcel, s);
            }
        }
        n80.k(parcel, A);
        return new h0(bundle, dVarArr, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new h0[i];
    }
}
