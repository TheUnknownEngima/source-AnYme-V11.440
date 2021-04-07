package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: i71  reason: default package */
public final class i71 implements Parcelable.Creator<j71> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = n80.A(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < A) {
            int s = n80.s(parcel);
            int l = n80.l(s);
            if (l == 1) {
                i = n80.u(parcel, s);
            } else if (l == 2) {
                i2 = n80.u(parcel, s);
            } else if (l != 3) {
                n80.z(parcel, s);
            } else {
                intent = (Intent) n80.e(parcel, s, Intent.CREATOR);
            }
        }
        n80.k(parcel, A);
        return new j71(i, i2, intent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new j71[i];
    }
}
