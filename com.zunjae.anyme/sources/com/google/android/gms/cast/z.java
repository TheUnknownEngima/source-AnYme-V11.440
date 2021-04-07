package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.Utils;

public final class z implements Parcelable.Creator<w> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = n80.A(parcel);
        float f = Utils.FLOAT_EPSILON;
        float f2 = Utils.FLOAT_EPSILON;
        float f3 = Utils.FLOAT_EPSILON;
        while (parcel.dataPosition() < A) {
            int s = n80.s(parcel);
            int l = n80.l(s);
            if (l == 2) {
                f = n80.q(parcel, s);
            } else if (l == 3) {
                f2 = n80.q(parcel, s);
            } else if (l != 4) {
                n80.z(parcel, s);
            } else {
                f3 = n80.q(parcel, s);
            }
        }
        n80.k(parcel, A);
        return new w(f, f2, f3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new w[i];
    }
}
