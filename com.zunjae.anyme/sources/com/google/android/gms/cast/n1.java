package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;

public final class n1 implements Parcelable.Creator<c> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = n80.A(parcel);
        String str = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        while (parcel.dataPosition() < A) {
            int s = n80.s(parcel);
            int l = n80.l(s);
            if (l == 2) {
                j = n80.w(parcel, s);
            } else if (l == 3) {
                j2 = n80.w(parcel, s);
            } else if (l == 4) {
                str = n80.f(parcel, s);
            } else if (l == 5) {
                str2 = n80.f(parcel, s);
            } else if (l != 6) {
                n80.z(parcel, s);
            } else {
                j3 = n80.w(parcel, s);
            }
        }
        n80.k(parcel, A);
        return new c(j, j2, str, str2, j3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new c[i];
    }
}
