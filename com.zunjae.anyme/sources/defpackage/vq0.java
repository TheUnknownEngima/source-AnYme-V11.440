package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: vq0  reason: default package */
public final class vq0 implements Parcelable.Creator<sq0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = n80.A(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < A) {
            int s = n80.s(parcel);
            switch (n80.l(s)) {
                case 1:
                    j = n80.w(parcel2, s);
                    break;
                case 2:
                    j2 = n80.w(parcel2, s);
                    break;
                case 3:
                    z = n80.m(parcel2, s);
                    break;
                case 4:
                    str = n80.f(parcel2, s);
                    break;
                case 5:
                    str2 = n80.f(parcel2, s);
                    break;
                case 6:
                    str3 = n80.f(parcel2, s);
                    break;
                case 7:
                    bundle = n80.a(parcel2, s);
                    break;
                default:
                    n80.z(parcel2, s);
                    break;
            }
        }
        n80.k(parcel2, A);
        return new sq0(j, j2, z, str, str2, str3, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new sq0[i];
    }
}
