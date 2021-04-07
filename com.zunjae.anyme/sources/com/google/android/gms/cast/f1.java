package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class f1 implements Parcelable.Creator<m> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = n80.A(parcel);
        String str = null;
        ArrayList<l> arrayList = null;
        ArrayList<k80> arrayList2 = null;
        double d = 0.0d;
        int i = 0;
        while (parcel.dataPosition() < A) {
            int s = n80.s(parcel);
            int l = n80.l(s);
            if (l == 2) {
                i = n80.u(parcel, s);
            } else if (l == 3) {
                str = n80.f(parcel, s);
            } else if (l == 4) {
                arrayList = n80.j(parcel, s, l.CREATOR);
            } else if (l == 5) {
                arrayList2 = n80.j(parcel, s, k80.CREATOR);
            } else if (l != 6) {
                n80.z(parcel, s);
            } else {
                d = n80.o(parcel, s);
            }
        }
        n80.k(parcel, A);
        return new m(i, str, arrayList, arrayList2, d);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new m[i];
    }
}
