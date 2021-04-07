package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class d1 implements Parcelable.Creator<l> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = n80.A(parcel);
        ArrayList<k80> arrayList = null;
        Bundle bundle = null;
        int i = 0;
        while (parcel.dataPosition() < A) {
            int s = n80.s(parcel);
            int l = n80.l(s);
            if (l == 2) {
                arrayList = n80.j(parcel, s, k80.CREATOR);
            } else if (l == 3) {
                bundle = n80.a(parcel, s);
            } else if (l != 4) {
                n80.z(parcel, s);
            } else {
                i = n80.u(parcel, s);
            }
        }
        n80.k(parcel, A);
        return new l(arrayList, bundle, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new l[i];
    }
}
