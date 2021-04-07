package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

public final class l implements Parcelable.Creator<b> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = n80.A(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < A) {
            int s = n80.s(parcel);
            int l = n80.l(s);
            if (l == 1) {
                i = n80.u(parcel, s);
            } else if (l == 2) {
                i2 = n80.u(parcel, s);
            } else if (l == 3) {
                pendingIntent = (PendingIntent) n80.e(parcel, s, PendingIntent.CREATOR);
            } else if (l != 4) {
                n80.z(parcel, s);
            } else {
                str = n80.f(parcel, s);
            }
        }
        n80.k(parcel, A);
        return new b(i, i2, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new b[i];
    }
}
