package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class q0 implements Parcelable.Creator<h> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = n80.A(parcel);
        ArrayList<String> arrayList = null;
        int[] iArr = null;
        String str = null;
        IBinder iBinder = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        while (parcel.dataPosition() < A) {
            int s = n80.s(parcel);
            switch (n80.l(s)) {
                case 2:
                    arrayList = n80.h(parcel2, s);
                    break;
                case 3:
                    iArr = n80.c(parcel2, s);
                    break;
                case 4:
                    j = n80.w(parcel2, s);
                    break;
                case 5:
                    str = n80.f(parcel2, s);
                    break;
                case 6:
                    i = n80.u(parcel2, s);
                    break;
                case 7:
                    i2 = n80.u(parcel2, s);
                    break;
                case 8:
                    i3 = n80.u(parcel2, s);
                    break;
                case 9:
                    i4 = n80.u(parcel2, s);
                    break;
                case 10:
                    i5 = n80.u(parcel2, s);
                    break;
                case 11:
                    i6 = n80.u(parcel2, s);
                    break;
                case 12:
                    i7 = n80.u(parcel2, s);
                    break;
                case 13:
                    i8 = n80.u(parcel2, s);
                    break;
                case 14:
                    i9 = n80.u(parcel2, s);
                    break;
                case 15:
                    i10 = n80.u(parcel2, s);
                    break;
                case 16:
                    i11 = n80.u(parcel2, s);
                    break;
                case 17:
                    i12 = n80.u(parcel2, s);
                    break;
                case 18:
                    i13 = n80.u(parcel2, s);
                    break;
                case 19:
                    i14 = n80.u(parcel2, s);
                    break;
                case 20:
                    i15 = n80.u(parcel2, s);
                    break;
                case 21:
                    i16 = n80.u(parcel2, s);
                    break;
                case 22:
                    i17 = n80.u(parcel2, s);
                    break;
                case 23:
                    i18 = n80.u(parcel2, s);
                    break;
                case 24:
                    i19 = n80.u(parcel2, s);
                    break;
                case 25:
                    i20 = n80.u(parcel2, s);
                    break;
                case 26:
                    i21 = n80.u(parcel2, s);
                    break;
                case 27:
                    i22 = n80.u(parcel2, s);
                    break;
                case 28:
                    i23 = n80.u(parcel2, s);
                    break;
                case 29:
                    i24 = n80.u(parcel2, s);
                    break;
                case 30:
                    i25 = n80.u(parcel2, s);
                    break;
                case 31:
                    i26 = n80.u(parcel2, s);
                    break;
                case 32:
                    i27 = n80.u(parcel2, s);
                    break;
                case 33:
                    iBinder = n80.t(parcel2, s);
                    break;
                default:
                    n80.z(parcel2, s);
                    break;
            }
        }
        n80.k(parcel2, A);
        return new h(arrayList, iArr, j, str, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, iBinder);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new h[i];
    }
}
