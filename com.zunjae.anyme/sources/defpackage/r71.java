package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.t;

/* renamed from: r71  reason: default package */
public final class r71 implements Parcelable.Creator<s71> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = n80.A(parcel);
        b bVar = null;
        t tVar = null;
        int i = 0;
        while (parcel.dataPosition() < A) {
            int s = n80.s(parcel);
            int l = n80.l(s);
            if (l == 1) {
                i = n80.u(parcel, s);
            } else if (l == 2) {
                bVar = (b) n80.e(parcel, s, b.CREATOR);
            } else if (l != 3) {
                n80.z(parcel, s);
            } else {
                tVar = (t) n80.e(parcel, s, t.CREATOR);
            }
        }
        n80.k(parcel, A);
        return new s71(i, bVar, tVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new s71[i];
    }
}
