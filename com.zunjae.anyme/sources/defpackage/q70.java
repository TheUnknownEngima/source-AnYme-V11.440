package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: q70  reason: default package */
public final class q70 implements Parcelable.Creator<x60> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = n80.A(parcel);
        String str = null;
        while (parcel.dataPosition() < A) {
            int s = n80.s(parcel);
            if (n80.l(s) != 2) {
                n80.z(parcel, s);
            } else {
                str = n80.f(parcel, s);
            }
        }
        n80.k(parcel, A);
        return new x60(str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new x60[i];
    }
}
