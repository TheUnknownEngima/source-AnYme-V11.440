package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import android.os.Parcelable;

public final class p0 implements Parcelable.Creator<f> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = n80.A(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < A) {
            int s = n80.s(parcel);
            int l = n80.l(s);
            if (l == 2) {
                str = n80.f(parcel, s);
            } else if (l == 3) {
                i = n80.u(parcel, s);
            } else if (l != 4) {
                n80.z(parcel, s);
            } else {
                str2 = n80.f(parcel, s);
            }
        }
        n80.k(parcel, A);
        return new f(str, i, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new f[i];
    }
}
