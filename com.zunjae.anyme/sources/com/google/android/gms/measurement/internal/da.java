package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

public final class da implements Parcelable.Creator<ea> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = n80.A(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < A) {
            int s = n80.s(parcel);
            switch (n80.l(s)) {
                case 1:
                    i = n80.u(parcel2, s);
                    break;
                case 2:
                    str = n80.f(parcel2, s);
                    break;
                case 3:
                    j = n80.w(parcel2, s);
                    break;
                case 4:
                    l = n80.x(parcel2, s);
                    break;
                case 5:
                    f = n80.r(parcel2, s);
                    break;
                case 6:
                    str2 = n80.f(parcel2, s);
                    break;
                case 7:
                    str3 = n80.f(parcel2, s);
                    break;
                case 8:
                    d = n80.p(parcel2, s);
                    break;
                default:
                    n80.z(parcel2, s);
                    break;
            }
        }
        n80.k(parcel2, A);
        return new ea(i, str, j, l, f, str2, str3, d);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ea[i];
    }
}
