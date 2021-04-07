package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public final class ka implements Parcelable.Creator<la> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = n80.A(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str8 = null;
        long j6 = -2147483648L;
        String str9 = "";
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = false;
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
                    j = n80.w(parcel2, s);
                    break;
                case 7:
                    j2 = n80.w(parcel2, s);
                    break;
                case 8:
                    str5 = n80.f(parcel2, s);
                    break;
                case 9:
                    z = n80.m(parcel2, s);
                    break;
                case 10:
                    z2 = n80.m(parcel2, s);
                    break;
                case 11:
                    j6 = n80.w(parcel2, s);
                    break;
                case 12:
                    str6 = n80.f(parcel2, s);
                    break;
                case 13:
                    j3 = n80.w(parcel2, s);
                    break;
                case 14:
                    j4 = n80.w(parcel2, s);
                    break;
                case 15:
                    i = n80.u(parcel2, s);
                    break;
                case 16:
                    z3 = n80.m(parcel2, s);
                    break;
                case 17:
                    z4 = n80.m(parcel2, s);
                    break;
                case 18:
                    z5 = n80.m(parcel2, s);
                    break;
                case 19:
                    str7 = n80.f(parcel2, s);
                    break;
                case 21:
                    bool = n80.n(parcel2, s);
                    break;
                case 22:
                    j5 = n80.w(parcel2, s);
                    break;
                case 23:
                    arrayList = n80.h(parcel2, s);
                    break;
                case 24:
                    str8 = n80.f(parcel2, s);
                    break;
                case 25:
                    str9 = n80.f(parcel2, s);
                    break;
                default:
                    n80.z(parcel2, s);
                    break;
            }
        }
        n80.k(parcel2, A);
        return new la(str, str2, str3, str4, j, j2, str5, z, z2, j6, str6, j3, j4, i, z3, z4, z5, str7, bool, j5, (List<String>) arrayList, str8, str9);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new la[i];
    }
}
