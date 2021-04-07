package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;

public final class e implements Parcelable.Creator<WakeLockEvent> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = n80.A(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f = Utils.FLOAT_EPSILON;
        boolean z = false;
        while (parcel.dataPosition() < A) {
            int s = n80.s(parcel);
            switch (n80.l(s)) {
                case 1:
                    i = n80.u(parcel2, s);
                    break;
                case 2:
                    j = n80.w(parcel2, s);
                    break;
                case 4:
                    str = n80.f(parcel2, s);
                    break;
                case 5:
                    i3 = n80.u(parcel2, s);
                    break;
                case 6:
                    arrayList = n80.h(parcel2, s);
                    break;
                case 8:
                    j2 = n80.w(parcel2, s);
                    break;
                case 10:
                    str3 = n80.f(parcel2, s);
                    break;
                case 11:
                    i2 = n80.u(parcel2, s);
                    break;
                case 12:
                    str2 = n80.f(parcel2, s);
                    break;
                case 13:
                    str4 = n80.f(parcel2, s);
                    break;
                case 14:
                    i4 = n80.u(parcel2, s);
                    break;
                case 15:
                    f = n80.q(parcel2, s);
                    break;
                case 16:
                    j3 = n80.w(parcel2, s);
                    break;
                case 17:
                    str5 = n80.f(parcel2, s);
                    break;
                case 18:
                    z = n80.m(parcel2, s);
                    break;
                default:
                    n80.z(parcel2, s);
                    break;
            }
        }
        n80.k(parcel2, A);
        return new WakeLockEvent(i, j, i2, str, i3, arrayList, str2, j2, i4, str3, str4, f, j3, str5, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WakeLockEvent[i];
    }
}
