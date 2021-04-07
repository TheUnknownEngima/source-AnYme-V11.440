package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;

public final class a1 implements Parcelable.Creator<MediaError> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = n80.A(parcel);
        String str = null;
        Integer num = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        while (parcel.dataPosition() < A) {
            int s = n80.s(parcel);
            int l = n80.l(s);
            if (l == 2) {
                str = n80.f(parcel, s);
            } else if (l == 3) {
                j = n80.w(parcel, s);
            } else if (l == 4) {
                num = n80.v(parcel, s);
            } else if (l == 5) {
                str2 = n80.f(parcel, s);
            } else if (l != 6) {
                n80.z(parcel, s);
            } else {
                str3 = n80.f(parcel, s);
            }
        }
        n80.k(parcel, A);
        return new MediaError(str, j, num, str2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaError[i];
    }
}
