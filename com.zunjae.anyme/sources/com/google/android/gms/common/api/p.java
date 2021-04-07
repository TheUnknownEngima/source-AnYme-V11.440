package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

public final class p implements Parcelable.Creator<Status> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = n80.A(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < A) {
            int s = n80.s(parcel);
            int l = n80.l(s);
            if (l == 1) {
                i2 = n80.u(parcel, s);
            } else if (l == 2) {
                str = n80.f(parcel, s);
            } else if (l == 3) {
                pendingIntent = (PendingIntent) n80.e(parcel, s, PendingIntent.CREATOR);
            } else if (l != 1000) {
                n80.z(parcel, s);
            } else {
                i = n80.u(parcel, s);
            }
        }
        n80.k(parcel, A);
        return new Status(i, i2, str, pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
