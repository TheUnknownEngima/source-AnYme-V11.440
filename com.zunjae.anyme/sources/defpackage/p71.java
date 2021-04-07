package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;

/* renamed from: p71  reason: default package */
public final class p71 implements Parcelable.Creator<q71> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = n80.A(parcel);
        int i = 0;
        s sVar = null;
        while (parcel.dataPosition() < A) {
            int s = n80.s(parcel);
            int l = n80.l(s);
            if (l == 1) {
                i = n80.u(parcel, s);
            } else if (l != 2) {
                n80.z(parcel, s);
            } else {
                sVar = (s) n80.e(parcel, s, s.CREATOR);
            }
        }
        n80.k(parcel, A);
        return new q71(i, sVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new q71[i];
    }
}
