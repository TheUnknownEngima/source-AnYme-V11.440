package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: l80  reason: default package */
public final class l80 implements Parcelable.Creator<k80> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = n80.A(parcel);
        int i = 0;
        Uri uri = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < A) {
            int s = n80.s(parcel);
            int l = n80.l(s);
            if (l == 1) {
                i = n80.u(parcel, s);
            } else if (l == 2) {
                uri = (Uri) n80.e(parcel, s, Uri.CREATOR);
            } else if (l == 3) {
                i2 = n80.u(parcel, s);
            } else if (l != 4) {
                n80.z(parcel, s);
            } else {
                i3 = n80.u(parcel, s);
            }
        }
        n80.k(parcel, A);
        return new k80(i, uri, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new k80[i];
    }
}
