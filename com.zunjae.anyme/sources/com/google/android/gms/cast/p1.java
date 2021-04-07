package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.Utils;

public final class p1 implements Parcelable.Creator<r> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = n80.A(parcel);
        String str = null;
        String str2 = null;
        float f = Utils.FLOAT_EPSILON;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (parcel.dataPosition() < A) {
            int s = n80.s(parcel);
            switch (n80.l(s)) {
                case 2:
                    f = n80.q(parcel2, s);
                    break;
                case 3:
                    i = n80.u(parcel2, s);
                    break;
                case 4:
                    i2 = n80.u(parcel2, s);
                    break;
                case 5:
                    i3 = n80.u(parcel2, s);
                    break;
                case 6:
                    i4 = n80.u(parcel2, s);
                    break;
                case 7:
                    i5 = n80.u(parcel2, s);
                    break;
                case 8:
                    i6 = n80.u(parcel2, s);
                    break;
                case 9:
                    i7 = n80.u(parcel2, s);
                    break;
                case 10:
                    str = n80.f(parcel2, s);
                    break;
                case 11:
                    i8 = n80.u(parcel2, s);
                    break;
                case 12:
                    i9 = n80.u(parcel2, s);
                    break;
                case 13:
                    str2 = n80.f(parcel2, s);
                    break;
                default:
                    n80.z(parcel2, s);
                    break;
            }
        }
        n80.k(parcel2, A);
        return new r(f, i, i2, i3, i4, i5, i6, i7, str, i8, i9, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new r[i];
    }
}
