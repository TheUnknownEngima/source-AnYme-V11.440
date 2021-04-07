package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public final class m1 implements Parcelable.Creator<MediaTrack> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = n80.A(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ArrayList<String> arrayList = null;
        String str5 = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < A) {
            int s = n80.s(parcel);
            switch (n80.l(s)) {
                case 2:
                    j = n80.w(parcel2, s);
                    break;
                case 3:
                    i = n80.u(parcel2, s);
                    break;
                case 4:
                    str = n80.f(parcel2, s);
                    break;
                case 5:
                    str2 = n80.f(parcel2, s);
                    break;
                case 6:
                    str3 = n80.f(parcel2, s);
                    break;
                case 7:
                    str4 = n80.f(parcel2, s);
                    break;
                case 8:
                    i2 = n80.u(parcel2, s);
                    break;
                case 9:
                    arrayList = n80.h(parcel2, s);
                    break;
                case 10:
                    str5 = n80.f(parcel2, s);
                    break;
                default:
                    n80.z(parcel2, s);
                    break;
            }
        }
        n80.k(parcel2, A);
        return new MediaTrack(j, i, str, str2, str3, str4, i2, (List<String>) arrayList, str5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaTrack[i];
    }
}
