package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;

public final class q0 implements Parcelable.Creator<b> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = n80.A(parcel);
        String str = null;
        String[] strArr = null;
        long j = 0;
        long j2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < A) {
            int s = n80.s(parcel);
            switch (n80.l(s)) {
                case 2:
                    j = n80.w(parcel, s);
                    break;
                case 3:
                    str = n80.f(parcel, s);
                    break;
                case 4:
                    j2 = n80.w(parcel, s);
                    break;
                case 5:
                    z = n80.m(parcel, s);
                    break;
                case 6:
                    strArr = n80.g(parcel, s);
                    break;
                case 7:
                    z2 = n80.m(parcel, s);
                    break;
                default:
                    n80.z(parcel, s);
                    break;
            }
        }
        n80.k(parcel, A);
        return new b(j, str, j2, z, strArr, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new b[i];
    }
}
