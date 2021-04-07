package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class w1 implements Parcelable.Creator<CastDevice> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = n80.A(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ArrayList<k80> arrayList = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        byte[] bArr = null;
        String str9 = null;
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (parcel.dataPosition() < A) {
            int s = n80.s(parcel);
            switch (n80.l(s)) {
                case 2:
                    str = n80.f(parcel2, s);
                    break;
                case 3:
                    str2 = n80.f(parcel2, s);
                    break;
                case 4:
                    str3 = n80.f(parcel2, s);
                    break;
                case 5:
                    str4 = n80.f(parcel2, s);
                    break;
                case 6:
                    str5 = n80.f(parcel2, s);
                    break;
                case 7:
                    i = n80.u(parcel2, s);
                    break;
                case 8:
                    arrayList = n80.j(parcel2, s, k80.CREATOR);
                    break;
                case 9:
                    i2 = n80.u(parcel2, s);
                    break;
                case 10:
                    i3 = n80.u(parcel2, s);
                    break;
                case 11:
                    str6 = n80.f(parcel2, s);
                    break;
                case 12:
                    str7 = n80.f(parcel2, s);
                    break;
                case 13:
                    i4 = n80.u(parcel2, s);
                    break;
                case 14:
                    str8 = n80.f(parcel2, s);
                    break;
                case 15:
                    bArr = n80.b(parcel2, s);
                    break;
                case 16:
                    str9 = n80.f(parcel2, s);
                    break;
                default:
                    n80.z(parcel2, s);
                    break;
            }
        }
        n80.k(parcel2, A);
        return new CastDevice(str, str2, str3, str4, str5, i, arrayList, i2, i3, str6, str7, i4, str8, bArr, str9);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CastDevice[i];
    }
}
